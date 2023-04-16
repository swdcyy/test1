package androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper$c;
import java.lang.Object;
import androidx.customview.widget.ViewDragHelper$b;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.widget.OverScroller;
import android.view.animation.Interpolator;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.View;
import android.view.VelocityTracker;
import android.view.ViewParent;
import java.lang.StringBuilder;
import java.lang.Math;
import java.util.Arrays;
import a2.i0;
import java.lang.Runnable;
import java.lang.System;
import java.lang.IllegalStateException;
import android.view.MotionEvent;

public class ViewDragHelper	// class@000738
{
    public int mActivePointerId;
    public final ViewDragHelper$c mCallback;
    public View mCapturedView;
    public int mDragState;
    public int[] mEdgeDragsInProgress;
    public int[] mEdgeDragsLocked;
    public int mEdgeSize;
    public int[] mInitialEdgesTouched;
    public float[] mInitialMotionX;
    public float[] mInitialMotionY;
    public float[] mLastMotionX;
    public float[] mLastMotionY;
    public float mMaxVelocity;
    public float mMinVelocity;
    public final ViewGroup mParentView;
    public int mPointersDown;
    public boolean mReleaseInProgress;
    public OverScroller mScroller;
    public final Runnable mSetIdleRunnable;
    public int mTouchSlop;
    public int mTrackingEdges;
    public VelocityTracker mVelocityTracker;
    public static final Interpolator sInterpolator;

    static {
       ViewDragHelper.sInterpolator = new ViewDragHelper$a();
    }
    public void ViewDragHelper(Context p0,ViewGroup p1,ViewDragHelper$c p2){
       super();
       this.mActivePointerId = -1;
       this.mSetIdleRunnable = new ViewDragHelper$b(this);
       if (p1 == null) {
          throw new IllegalArgumentException("Parent view may not be null");
       }
       if (p2 == null) {
          throw new IllegalArgumentException("Callback may not be null");
       }
       this.mParentView = p1;
       this.mCallback = p2;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.mEdgeSize = (int)((c.c(p0.getResources()).density * 20.00f) + 0x3f000000);
       this.mTouchSlop = viewConfigur.getScaledTouchSlop();
       this.mMaxVelocity = (float)viewConfigur.getScaledMaximumFlingVelocity();
       this.mMinVelocity = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.mScroller = new OverScroller(p0, ViewDragHelper.sInterpolator);
       return;
    }
    public static ViewDragHelper create(ViewGroup p0,float p1,ViewDragHelper$c p2){
       ViewDragHelper viewDragHelp = ViewDragHelper.create(p0, p2);
       viewDragHelp.mTouchSlop = (int)((float)viewDragHelp.mTouchSlop * (0x3f800000 / p1));
       return viewDragHelp;
    }
    public static ViewDragHelper create(ViewGroup p0,ViewDragHelper$c p1){
       return new ViewDragHelper(p0.getContext(), p0, p1);
    }
    public void abort(){
       this.cancel();
       if (this.mDragState == 2) {
          this.mScroller.abortAnimation();
          int currX = this.mScroller.getCurrX();
          int currY = this.mScroller.getCurrY();
          this.mCallback.k(this.mCapturedView, currX, currY, (currX - this.mScroller.getCurrX()), (currY - this.mScroller.getCurrY()));
       }
       this.setDragState(0);
       return;
    }
    public boolean canScroll(View p0,boolean p1,int p2,int p3,int p4,int p5){
       int i = p0;
       int i1 = 1;
       if (i instanceof ViewGroup) {
          ViewGroup viewGroup = i;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i2 = viewGroup.getChildCount() - i1;
          while (true) {
             if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                int i3 = p4 + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                   int i4 = p5 + scrollY;
                   if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                      int i5 = i3 - childAt.getLeft();
                      int i6 = i4 - childAt.getTop();
                      if (this.canScroll(childAt, 1, p2, p3, i5, i6)) {
                         return i1;
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
       }
       if (!p1 || (!p0.canScrollHorizontally((- p2)) && !p0.canScrollVertically((- p3)))) {
          i1 = false;
       }
       return i1;
    }
    public void cancel(){
       this.mActivePointerId = -1;
       this.clearMotionHistory();
       ViewDragHelper tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr != null) {
          tmVelocityTr.recycle();
          this.mVelocityTracker = null;
       }
       return;
    }
    public void captureChildView(View p0,int p1){
       if (p0.getParent() != this.mParentView) {
          throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view \("+this.mParentView+"\)");
       }
       this.mCapturedView = p0;
       this.mActivePointerId = p1;
       this.mCallback.i(p0, p1);
       this.setDragState(1);
       return;
    }
    public final boolean checkNewEdgeDrag(float p0,float p1,int p2,int p3){
       p0 = Math.abs(p0);
       p1 = Math.abs(p1);
       boolean b = false;
       if ((this.mInitialEdgesTouched[p2] & p3) == p3 && ((this.mTrackingEdges & p3) && ((this.mEdgeDragsLocked[p2] & p3) != p3 && (this.mEdgeDragsInProgress[p2] & p3) != p3))) {
          ViewDragHelper tmTouchSlop = this.mTouchSlop;
          if (p0 - (float)tmTouchSlop > 0 || p1 - (float)tmTouchSlop > 0) {
             if (p0 - (p1 * 0x3f000000) < 0 && this.mCallback.g(p3)) {
                ViewDragHelper tmEdgeDragsL = this.mEdgeDragsLocked;
                tmEdgeDragsL[p2] = tmEdgeDragsL[p2] | p3;
                return b;
             }else if(!(this.mEdgeDragsInProgress[p2] & p3) && p0 - (float)this.mTouchSlop > 0){
                b = true;
             }
          }
       }
       return b;
    }
    public boolean checkTouchSlop(int p0){
       int len = this.mInitialMotionX.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (this.checkTouchSlop(p0, i)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean checkTouchSlop(int p0,int p1){
       boolean b = false;
       if (!this.isPointerDown(p1)) {
          return b;
       }
       int i = ((p0 & 0x01) == 1)? 1: 0;
       int i1 = 2;
       ViewDragHelper viewDragHelp = ((p0 & i1) == i1)? 1: null;
       float f = this.mLastMotionX[p1] - this.mInitialMotionX[p1];
       float f1 = this.mLastMotionY[p1] - this.mInitialMotionY[p1];
       if (i && viewDragHelp) {
          if (((f * f) + (f1 * f1)) - (float)(this.mTouchSlop * this.mTouchSlop) > 0) {
             b = true;
          }
          return b;
       }else if(i){
          if (Math.abs(f) - (float)this.mTouchSlop > 0) {
             b = true;
          }
          return b;
       }else if(viewDragHelp != null && Math.abs(f1) - (float)this.mTouchSlop > 0){
          b = true;
       }
       return b;
    }
    public final boolean checkTouchSlop(View p0,float p1,float p2){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = (this.mCallback.d(p0) > 0)? 1: 0;
       ViewDragHelper viewDragHelp = (this.mCallback.e(p0) > 0)? 1: null;
       if (i && viewDragHelp) {
          if (((p1 * p1) + (p2 * p2)) - (float)(this.mTouchSlop * this.mTouchSlop) > 0) {
             b = true;
          }
          return b;
       }else if(i){
          if (Math.abs(p1) - (float)this.mTouchSlop > 0) {
             b = true;
          }
          return b;
       }else if(viewDragHelp != null && Math.abs(p2) - (float)this.mTouchSlop > 0){
          b = true;
       }
       return b;
    }
    public final float clampMag(float p0,float p1,float p2){
       float f = Math.abs(p0);
       if (f - p1 < 0) {
          return 0;
       }
       if (f - p2 <= 0) {
          return p0;
       }
       if (p0 <= 0) {
          p2 = - p2;
       }
       return p2;
    }
    public final int clampMag(int p0,int p1,int p2){
       int i = Math.abs(p0);
       if (i < p1) {
          return 0;
       }
       if (i <= p2) {
          return p0;
       }
       if (p0 <= 0) {
          p2 = - p2;
       }
       return p2;
    }
    public final void clearMotionHistory(){
       ViewDragHelper tmInitialMot = this.mInitialMotionX;
       if (tmInitialMot == null) {
          return;
       }
       Arrays.fill(tmInitialMot, 0);
       Arrays.fill(this.mInitialMotionY, 0);
       Arrays.fill(this.mLastMotionX, 0);
       Arrays.fill(this.mLastMotionY, 0);
       Arrays.fill(this.mInitialEdgesTouched, 0);
       Arrays.fill(this.mEdgeDragsInProgress, 0);
       Arrays.fill(this.mEdgeDragsLocked, 0);
       this.mPointersDown = 0;
       return;
    }
    public final void clearMotionHistory(int p0){
       if (this.mInitialMotionX != null && this.isPointerDown(p0)) {
          this.mInitialMotionX[p0] = 0;
          this.mInitialMotionY[p0] = 0;
          this.mLastMotionX[p0] = 0;
          this.mLastMotionY[p0] = 0;
          this.mInitialEdgesTouched[p0] = 0;
          this.mEdgeDragsInProgress[p0] = 0;
          this.mEdgeDragsLocked[p0] = 0;
          this.mPointersDown = (~ (1 << p0)) & this.mPointersDown;
       }
       return;
    }
    public final int computeAxisDuration(int p0,int p1,int p2){
       if (!p0) {
          return 0;
       }
       int width = this.mParentView.getWidth();
       int i = width / 2;
       float f = (float)i;
       f = f + (this.distanceInfluenceForSnapDuration(Math.min(0x3f800000, ((float)Math.abs(p0) / (float)width))) * f);
       p1 = Math.abs(p1);
       p0 = (p1 > 0)? Math.round((Math.abs((f / (float)p1)) * 1000.00f)) * 4: (int)((((float)Math.abs(p0) / (float)p2) + 0x3f800000) * 256.00f);
       return Math.min(p0, 600);
    }
    public final int computeSettleDuration(View p0,int p1,int p2,int p3,int p4){
       float f;
       float f1;
       float f2;
       p3 = this.clampMag(p3, (int)this.mMinVelocity, (int)this.mMaxVelocity);
       p4 = this.clampMag(p4, (int)this.mMinVelocity, (int)this.mMaxVelocity);
       int i = Math.abs(p1);
       int i1 = Math.abs(p2);
       int i2 = Math.abs(p3);
       int i3 = Math.abs(p4);
       int i4 = i2 + i3;
       int i5 = i + i1;
       if (p3) {
          f = (float)i2;
          f1 = (float)i4;
       }else {
          f = (float)i;
          f1 = (float)i5;
       }
       f = f / f1;
       if (p4) {
          f2 = (float)i3;
          f1 = (float)i4;
       }else {
          f2 = (float)i1;
          f1 = (float)i5;
       }
       return (int)(((float)this.computeAxisDuration(p1, p3, this.mCallback.d(p0)) * f) + ((float)this.computeAxisDuration(p2, p4, this.mCallback.e(p0)) * (f2 / f1)));
    }
    public boolean continueSettling(boolean p0){
       boolean b = false;
       if (this.mDragState == 2) {
          boolean b1 = this.mScroller.computeScrollOffset();
          int currX = this.mScroller.getCurrX();
          int currY = this.mScroller.getCurrY();
          int i = currX - this.mCapturedView.getLeft();
          int i1 = currY - this.mCapturedView.getTop();
          if (i) {
             i0.d0(this.mCapturedView, i);
          }
          if (i1) {
             i0.e0(this.mCapturedView, i1);
          }
          if (i || i1) {
             this.mCallback.k(this.mCapturedView, currX, currY, i, i1);
          }
          if (b1 && (currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY())) {
             this.mScroller.abortAnimation();
             b1 = false;
          }
       label_005b :
          if (!b1) {
             if (p0) {
                this.mParentView.post(this.mSetIdleRunnable);
             }else {
                this.setDragState(b);
             }
          }
       }
       if (this.mDragState == 2) {
          b = true;
       }
       return b;
    }
    public final void dispatchViewReleased(float p0,float p1){
       this.mReleaseInProgress = true;
       this.mCallback.l(this.mCapturedView, p0, p1);
       this.mReleaseInProgress = false;
       if (this.mDragState == true) {
          this.setDragState(false);
       }
       return;
    }
    public final float distanceInfluenceForSnapDuration(float p0){
       return (float)Math.sin((double)((p0 - 0x3f000000) * 0x3ef1463b));
    }
    public final void dragTo(int p0,int p1,int p2,int p3){
       int left = this.mCapturedView.getLeft();
       int top = this.mCapturedView.getTop();
       if (p2) {
          p0 = this.mCallback.a(this.mCapturedView, p0, p2);
          i0.d0(this.mCapturedView, (p0 - left));
       }
       int i = p0;
       if (p3) {
          p1 = this.mCallback.b(this.mCapturedView, p1, p3);
          i0.e0(this.mCapturedView, (p1 - top));
       }
       int i1 = p1;
       if (p2 || p3) {
          this.mCallback.k(this.mCapturedView, i, i1, (i - left), (i1 - top));
       }
       return;
    }
    public final void ensureMotionHistorySizeForId(int p0){
       ViewDragHelper tmInitialMot = this.mInitialMotionX;
       if (tmInitialMot == null || tmInitialMot.length <= p0) {
          p0++;
          float[] uofloatArray = new float[p0];
          float[] uofloatArray1 = new float[p0];
          float[] uofloatArray2 = new float[p0];
          float[] uofloatArray3 = new float[p0];
          int[] ointArray = new int[p0];
          int[] ointArray1 = new int[p0];
          int[] ointArray2 = new int[p0];
          if (tmInitialMot != null) {
             System.arraycopy(tmInitialMot, 0, uofloatArray, 0, tmInitialMot.length);
             tmInitialMot = this.mInitialMotionY;
             System.arraycopy(tmInitialMot, 0, uofloatArray1, 0, tmInitialMot.length);
             tmInitialMot = this.mLastMotionX;
             System.arraycopy(tmInitialMot, 0, uofloatArray2, 0, tmInitialMot.length);
             tmInitialMot = this.mLastMotionY;
             System.arraycopy(tmInitialMot, 0, uofloatArray3, 0, tmInitialMot.length);
             tmInitialMot = this.mInitialEdgesTouched;
             System.arraycopy(tmInitialMot, 0, ointArray, 0, tmInitialMot.length);
             tmInitialMot = this.mEdgeDragsInProgress;
             System.arraycopy(tmInitialMot, 0, ointArray1, 0, tmInitialMot.length);
             tmInitialMot = this.mEdgeDragsLocked;
             System.arraycopy(tmInitialMot, 0, ointArray2, 0, tmInitialMot.length);
          }
          this.mInitialMotionX = uofloatArray;
          this.mInitialMotionY = uofloatArray1;
          this.mLastMotionX = uofloatArray2;
          this.mLastMotionY = uofloatArray3;
          this.mInitialEdgesTouched = ointArray;
          this.mEdgeDragsInProgress = ointArray1;
          this.mEdgeDragsLocked = ointArray2;
       }
       return;
    }
    public View findTopChildUnder(int p0,int p1){
       View childAt;
       int i = this.mParentView.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          childAt = this.mParentView.getChildAt(this.mCallback.c(i));
          if (p0 >= childAt.getLeft() && (p0 < childAt.getRight() && (p1 >= childAt.getTop() && p1 < childAt.getBottom()))) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return childAt;
    }
    public void flingCapturedView(int p0,int p1,int p2,int p3){
       if (this.mReleaseInProgress == null) {
          throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
       }
       this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId), p0, p2, p1, p3);
       this.setDragState(2);
       return;
    }
    public final boolean forceSettleCapturedViewAt(int p0,int p1,int p2,int p3){
       int left = this.mCapturedView.getLeft();
       int top = this.mCapturedView.getTop();
       p0 = p0 - left;
       p1 = p1 - top;
       if (!p0 && !p1) {
          this.mScroller.abortAnimation();
          this.setDragState(0);
          return 0;
       }else {
          this.mScroller.startScroll(left, top, p0, p1, this.computeSettleDuration(this.mCapturedView, p0, p1, p2, p3));
          this.setDragState(2);
          return true;
       }
    }
    public int getActivePointerId(){
       return this.mActivePointerId;
    }
    public View getCapturedView(){
       return this.mCapturedView;
    }
    public int getEdgeSize(){
       return this.mEdgeSize;
    }
    public final int getEdgesTouched(int p0,int p1){
       int i = (p0 < (this.mParentView.getLeft() + this.mEdgeSize))? 1: 0;
       if (p1 < (this.mParentView.getTop() + this.mEdgeSize)) {
          i = i | 0x04;
       }
       if (p0 > (this.mParentView.getRight() - this.mEdgeSize)) {
          i = i | 0x02;
       }
       if (p1 > (this.mParentView.getBottom() - this.mEdgeSize)) {
          i = i | 0x08;
       }
       return i;
    }
    public float getMinVelocity(){
       return this.mMinVelocity;
    }
    public int getTouchSlop(){
       return this.mTouchSlop;
    }
    public int getViewDragState(){
       return this.mDragState;
    }
    public boolean isCapturedViewUnder(int p0,int p1){
       return this.isViewUnder(this.mCapturedView, p0, p1);
    }
    public boolean isEdgeTouched(int p0){
       int len = this.mInitialEdgesTouched.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (this.isEdgeTouched(p0, i)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isEdgeTouched(int p0,int p1){
       boolean b = (this.isPointerDown(p1) && (p0 & this.mInitialEdgesTouched[p1]))? true: false;
       return b;
    }
    public boolean isPointerDown(int p0){
       int i = 1;
       if ((i << p0) & this.mPointersDown) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean isValidPointerForActionMove(int p0){
       if (!this.isPointerDown(p0)) {
          return false;
       }
       return true;
    }
    public boolean isViewUnder(View p0,int p1,int p2){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p1 >= p0.getLeft() && (p1 < p0.getRight() && (p2 >= p0.getTop() && p2 < p0.getBottom()))) {
          b = true;
       }
    label_001d :
       return b;
    }
    public void processTouchEvent(MotionEvent p0){
       ViewDragHelper tmActivePoin;
       int i1;
       ViewDragHelper tmTrackingEd;
       float x1;
       int actionMasked = p0.getActionMasked();
       int actionIndex = p0.getActionIndex();
       if (!actionMasked) {
          this.cancel();
       }
       if (this.mVelocityTracker == null) {
          this.mVelocityTracker = VelocityTracker.obtain();
       }
       this.mVelocityTracker.addMovement(p0);
       int i = 0;
       if (actionMasked) {
          ViewDragHelper viewDragHelp = 1;
          if (actionMasked != viewDragHelp) {
             if (actionMasked != 2) {
                if (actionMasked != 3) {
                   if (actionMasked != 5) {
                      if (actionMasked == 6) {
                         actionMasked = p0.getPointerId(actionIndex);
                         if (this.mDragState == viewDragHelp && actionMasked == this.mActivePointerId) {
                            actionIndex = p0.getPointerCount();
                            while (true) {
                               if (i < actionIndex) {
                                  int pointerId = p0.getPointerId(i);
                                  if (pointerId != this.mActivePointerId) {
                                     ViewDragHelper tmCapturedVi = this.mCapturedView;
                                     if (this.findTopChildUnder((int)p0.getX(i), (int)p0.getY(i)) == tmCapturedVi && this.tryCaptureViewForDrag(tmCapturedVi, pointerId)) {
                                        tmActivePoin = this.mActivePointerId;
                                     label_006b :
                                        if (tmActivePoin == -1) {
                                           this.releaseViewForPointerUp();
                                        }
                                     }
                                  }
                                  i = i + 1;
                               }else {
                                  tmActivePoin = -1;
                                  goto label_006b ;
                               }
                            }
                         }
                      label_0070 :
                         this.clearMotionHistory(actionMasked);
                      }
                   }else {
                      actionMasked = p0.getPointerId(actionIndex);
                      float x = p0.getX(actionIndex);
                      float y = p0.getY(actionIndex);
                      this.saveInitialMotion(x, y, actionMasked);
                      if (this.mDragState == null) {
                         this.tryCaptureViewForDrag(this.findTopChildUnder((int)x, (int)y), actionMasked);
                         i1 = this.mInitialEdgesTouched[actionMasked];
                         tmTrackingEd = this.mTrackingEdges;
                         if (i1 & tmTrackingEd) {
                            this.mCallback.h((i1 & tmTrackingEd), actionMasked);
                         }
                      }else if(this.isCapturedViewUnder((int)x, (int)y)){
                         this.tryCaptureViewForDrag(this.mCapturedView, actionMasked);
                      }
                   }
                }else if(this.mDragState == viewDragHelp){
                   this.dispatchViewReleased(0, 0);
                }
                this.cancel();
             }else if(this.mDragState == viewDragHelp){
                if (this.isValidPointerForActionMove(this.mActivePointerId)) {
                   actionMasked = p0.findPointerIndex(this.mActivePointerId);
                   x1 = p0.getX(actionMasked);
                   viewDragHelp = this.mActivePointerId;
                   actionIndex = (int)(x1 - this.mLastMotionX[viewDragHelp]);
                   actionMasked = (int)(p0.getY(actionMasked) - this.mLastMotionY[viewDragHelp]);
                   this.dragTo((this.mCapturedView.getLeft() + actionIndex), (this.mCapturedView.getTop() + actionMasked), actionIndex, actionMasked);
                   this.saveLastMotion(p0);
                }
             }else {
                actionMasked = p0.getPointerCount();
                while (i < actionMasked) {
                   actionIndex = p0.getPointerId(i);
                   if (this.isValidPointerForActionMove(actionIndex)) {
                      float x2 = p0.getX(i);
                      float y1 = p0.getY(i);
                      float f = x2 - this.mInitialMotionX[actionIndex];
                      float f1 = y1 - this.mInitialMotionY[actionIndex];
                      this.reportNewEdgeDrags(f, f1, actionIndex);
                      if (this.mDragState == viewDragHelp) {
                         break ;
                      }else {
                         View view = this.findTopChildUnder((int)x2, (int)y1);
                         if (this.checkTouchSlop(view, f, f1) && this.tryCaptureViewForDrag(view, actionIndex)) {
                            break ;
                         }
                      }
                   }
                   i = i + 1;
                }
                this.saveLastMotion(p0);
             }
          }else if(this.mDragState == viewDragHelp){
             this.releaseViewForPointerUp();
          }
          this.cancel();
       }else {
          float x3 = p0.getX();
          x1 = p0.getY();
          i1 = p0.getPointerId(i);
          this.saveInitialMotion(x3, x1, i1);
          this.tryCaptureViewForDrag(this.findTopChildUnder((int)x3, (int)x1), i1);
          actionMasked = this.mInitialEdgesTouched[i1];
          tmTrackingEd = this.mTrackingEdges;
          if (actionMasked & tmTrackingEd) {
             this.mCallback.h((actionMasked & tmTrackingEd), i1);
          }
       }
       return;
    }
    public final void releaseViewForPointerUp(){
       this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
       this.dispatchViewReleased(this.clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), this.clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }
    public final void reportNewEdgeDrags(float p0,float p1,int p2){
       boolean b = this.checkNewEdgeDrag(p0, p1, p2, 1);
       if (this.checkNewEdgeDrag(p1, p0, p2, 4)) {
          b = b | 0x04;
       }
       if (this.checkNewEdgeDrag(p0, p1, p2, 2)) {
          b = b | 0x02;
       }
       if (this.checkNewEdgeDrag(p1, p0, p2, 8)) {
          b = b | 0x08;
       }
       if (b) {
          ViewDragHelper tmEdgeDragsI = this.mEdgeDragsInProgress;
          tmEdgeDragsI[p2] = tmEdgeDragsI[p2] | b;
          this.mCallback.f(b, p2);
       }
       return;
    }
    public final void saveInitialMotion(float p0,float p1,int p2){
       this.ensureMotionHistorySizeForId(p2);
       this.mLastMotionX[p2] = p0;
       this.mInitialMotionX[p2] = p0;
       this.mLastMotionY[p2] = p1;
       this.mInitialMotionY[p2] = p1;
       this.mInitialEdgesTouched[p2] = this.getEdgesTouched((int)p0, (int)p1);
       this.mPointersDown = this.mPointersDown | (1 << p2);
    }
    public final void saveLastMotion(MotionEvent p0){
       int pointerCount = p0.getPointerCount();
       int i = 0;
       while (i < pointerCount) {
          int pointerId = p0.getPointerId(i);
          if (this.isValidPointerForActionMove(pointerId)) {
             this.mLastMotionX[pointerId] = p0.getX(i);
             this.mLastMotionY[pointerId] = p0.getY(i);
          }
          i = i + 1;
       }
       return;
    }
    public void setDragState(int p0){
       this.mParentView.removeCallbacks(this.mSetIdleRunnable);
       if (this.mDragState != p0) {
          this.mDragState = p0;
          this.mCallback.j(p0);
          if (this.mDragState == null) {
             this.mCapturedView = null;
          }
       }
       return;
    }
    public void setEdgeTrackingEnabled(int p0){
       this.mTrackingEdges = p0;
    }
    public void setMinVelocity(float p0){
       this.mMinVelocity = p0;
    }
    public boolean settleCapturedViewAt(int p0,int p1){
       if (this.mReleaseInProgress != null) {
          return this.forceSettleCapturedViewAt(p0, p1, (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId));
       }
       throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    public boolean shouldInterceptTouchEvent(MotionEvent p0){
       int b;
       float x;
       ViewDragHelper mDragState;
       int i1;
       ViewDragHelper viewDragHelp = this;
       MotionEvent motionEvent = p0;
       int actionMasked = p0.getActionMasked();
       int actionIndex = p0.getActionIndex();
       if (!actionMasked) {
          this.cancel();
       }
       if (viewDragHelp.mVelocityTracker == null) {
          viewDragHelp.mVelocityTracker = VelocityTracker.obtain();
       }
       viewDragHelp.mVelocityTracker.addMovement(motionEvent);
       int i = 2;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != i) {
                if (actionMasked != 3) {
                   if (actionMasked != 0.00f) {
                      if (actionMasked == 6) {
                         viewDragHelp.clearMotionHistory(motionEvent.getPointerId(actionIndex));
                      }
                   }else {
                      actionMasked = motionEvent.getPointerId(actionIndex);
                      x = motionEvent.getX(actionIndex);
                      float y = motionEvent.getY(actionIndex);
                      viewDragHelp.saveInitialMotion(x, y, actionMasked);
                      mDragState = viewDragHelp.mDragState;
                      if (mDragState == null) {
                         i1 = viewDragHelp.mInitialEdgesTouched[actionMasked];
                         mDragState = viewDragHelp.mTrackingEdges;
                         if (i1 & mDragState) {
                            viewDragHelp.mCallback.h((i1 & mDragState), actionMasked);
                         }
                      }else if(mDragState == i){
                         View view = viewDragHelp.findTopChildUnder((int)x, (int)y);
                         if (view == viewDragHelp.mCapturedView) {
                            viewDragHelp.tryCaptureViewForDrag(view, actionMasked);
                         }
                      }
                   }
                }else {
                label_00ff :
                   this.cancel();
                }
             }else if(viewDragHelp.mInitialMotionX == null || viewDragHelp.mInitialMotionY == null){
                actionMasked = p0.getPointerCount();
                actionIndex = 0;
                while (actionIndex < actionMasked) {
                   i = motionEvent.getPointerId(actionIndex);
                   if (viewDragHelp.isValidPointerForActionMove(i)) {
                      x = motionEvent.getX(actionIndex);
                      float y1 = motionEvent.getY(actionIndex);
                      float f = x - viewDragHelp.mInitialMotionX[i];
                      float f1 = y1 - viewDragHelp.mInitialMotionY[i];
                      View view1 = viewDragHelp.findTopChildUnder((int)x, (int)y1);
                      y1 = (view1 != null && viewDragHelp.checkTouchSlop(view1, f, f1))? Float.MIN_VALUE: 0;
                      if (y1) {
                         int left = view1.getLeft();
                         int i2 = (int)f;
                         int i3 = left + i2;
                         i2 = viewDragHelp.mCallback.a(view1, i3, i2);
                         i3 = view1.getTop();
                         int i4 = (int)f1;
                         int i5 = i3 + i4;
                         b = viewDragHelp.mCallback.b(view1, i5, i4);
                         i4 = viewDragHelp.mCallback.d(view1);
                         i5 = viewDragHelp.mCallback.e(view1);
                         if (!i4 || (i4 > 0 && (i2 == left && (!i5 || (i5 > 0 && b == i3))))) {
                            break ;
                         }
                      }
                      viewDragHelp.reportNewEdgeDrags(f, f1, i);
                      if (viewDragHelp.mDragState == 1 || (y1 && viewDragHelp.tryCaptureViewForDrag(view1, i))) {
                         break ;
                      }
                   }
                label_00f7 :
                   actionIndex = actionIndex + 1;
                }
             label_00fa :
                this.saveLastMotion(p0);
             }
          }else {
             goto label_00ff ;
          }
          b = false;
       }else {
          float x1 = p0.getX();
          float y2 = p0.getY();
          b = 0;
          i1 = motionEvent.getPointerId(b);
          viewDragHelp.saveInitialMotion(x1, y2, i1);
          View view2 = viewDragHelp.findTopChildUnder((int)x1, (int)y2);
          if (view2 == viewDragHelp.mCapturedView && viewDragHelp.mDragState == i) {
             viewDragHelp.tryCaptureViewForDrag(view2, i1);
          }
          actionMasked = viewDragHelp.mInitialEdgesTouched[i1];
          mDragState = viewDragHelp.mTrackingEdges;
          if (actionMasked & mDragState) {
             viewDragHelp.mCallback.h((actionMasked & mDragState), i1);
          }
       }
       if (viewDragHelp.mDragState == 1) {
          b = true;
       }
       return b;
    }
    public boolean smoothSlideViewTo(View p0,int p1,int p2){
       this.mCapturedView = p0;
       this.mActivePointerId = -1;
       boolean b = this.forceSettleCapturedViewAt(p1, p2, 0, 0);
       if (!b && (this.mDragState == null && this.mCapturedView != null)) {
          this.mCapturedView = null;
       }
    label_0017 :
       return b;
    }
    public boolean tryCaptureViewForDrag(View p0,int p1){
       if (p0 == this.mCapturedView && this.mActivePointerId == p1) {
          return true;
       }
       if (p0 == null || !this.mCallback.m(p0, p1)) {
          return false;
       }
       this.mActivePointerId = p1;
       this.captureChildView(p0, p1);
       return true;
    }
}
