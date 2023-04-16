package androidx.core.widget.NestedScrollView;
import a2.w;
import a2.s;
import a2.f0;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView$a;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.content.res.TypedArray;
import a2.y;
import android.view.ViewGroup;
import a2.u;
import android.view.View;
import a2.a;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.FocusFinder;
import java.lang.Math;
import android.widget.EdgeEffect;
import android.view.KeyEvent;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView$SavedState;
import android.os.Parcelable;
import android.view.View$BaseSavedState;
import androidx.core.widget.NestedScrollView$b;
import e2.c;
import android.view.animation.AnimationUtils;

public class NestedScrollView extends FrameLayout implements w, s, f0	// class@00072e
{
    public int mActivePointerId;
    public final u mChildHelper;
    public View mChildToScrollTo;
    public EdgeEffect mEdgeGlowBottom;
    public EdgeEffect mEdgeGlowTop;
    public boolean mFillViewport;
    public boolean mIsBeingDragged;
    public boolean mIsLaidOut;
    public boolean mIsLayoutDirty;
    public int mLastMotionY;
    public long mLastScroll;
    public int mLastScrollerY;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public int mNestedYOffset;
    public NestedScrollView$b mOnScrollChangeListener;
    public final y mParentHelper;
    public NestedScrollView$SavedState mSavedState;
    public final int[] mScrollConsumed;
    public final int[] mScrollOffset;
    public OverScroller mScroller;
    public boolean mSmoothScrollingEnabled;
    public final Rect mTempRect;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public float mVerticalScrollFactor;
    public static final NestedScrollView$a ACCESSIBILITY_DELEGATE;
    public static final int[] SCROLLVIEW_STYLEABLE;

    static {
       NestedScrollView.ACCESSIBILITY_DELEGATE = new NestedScrollView$a();
       int[] ointArray = new int[]{0x101017a};
       NestedScrollView.SCROLLVIEW_STYLEABLE = ointArray;
    }
    public void NestedScrollView(Context p0){
       super(p0, null);
    }
    public void NestedScrollView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mTempRect = new Rect();
       this.mIsLayoutDirty = true;
       this.mIsLaidOut = false;
       this.mChildToScrollTo = null;
       this.mIsBeingDragged = false;
       this.mSmoothScrollingEnabled = true;
       this.mActivePointerId = -1;
       int[] ointArray = new int[2];
       this.mScrollOffset = ointArray;
       int[] ointArray1 = new int[2];
       this.mScrollConsumed = ointArray1;
       this.initScrollView();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, NestedScrollView.SCROLLVIEW_STYLEABLE, p2, false);
       this.setFillViewport(typedArray.getBoolean(false, false));
       typedArray.recycle();
       this.mParentHelper = new y(this);
       this.mChildHelper = new u(this);
       this.setNestedScrollingEnabled(true);
       i0.s0(this, NestedScrollView.ACCESSIBILITY_DELEGATE);
    }
    private boolean canScroll(){
       int i = 0;
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(i);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) > ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())) {
             i = true;
          }
       }
       return i;
    }
    public static int clamp(int p0,int p1,int p2){
       if (p1 >= p2 || p0 < 0) {
          return 0;
       }
       if ((p1 + p0) > p2) {
          return (p2 - p1);
       }
       return p0;
    }
    public static boolean isViewDescendantOf(View p0,View p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof ViewGroup || !NestedScrollView.isViewDescendantOf(parent, p1)) {
          b = false;
       }
       return b;
    }
    public final void abortAnimatedScroll(){
       this.mScroller.abortAnimation();
       this.stopNestedScroll(1);
    }
    public void addView(View p0){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0);
       return;
    }
    public void addView(View p0,int p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,ViewGroup$LayoutParams p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1);
       return;
    }
    public boolean arrowScroll(int p0){
       View view = this.findFocus();
       if (view == this) {
          view = null;
       }
       View view1 = FocusFinder.getInstance().findNextFocus(this, view, p0);
       int maxScrollAmo = this.getMaxScrollAmount();
       if (view1 != null && this.isWithinDeltaOfScreen(view1, maxScrollAmo, this.getHeight())) {
          view1.getDrawingRect(this.mTempRect);
          this.offsetDescendantRectToMyCoords(view1, this.mTempRect);
          this.doScrollY(this.computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
          view1.requestFocus(p0);
       }else if(p0 == 33 && this.getScrollY() < maxScrollAmo){
          maxScrollAmo = this.getScrollY();
       }else if(p0 == 130 && this.getChildCount() > 0){
          view1 = this.getChildAt(false);
          FrameLayout$LayoutParams layoutParams = view1.getLayoutParams();
          maxScrollAmo = Math.min(((view1.getBottom() + layoutParams.bottomMargin) - ((this.getScrollY() + this.getHeight()) - this.getPaddingBottom())), maxScrollAmo);
       }
       if (!maxScrollAmo) {
          return false;
       }else if(p0 == 130){
          maxScrollAmo = - maxScrollAmo;
       }
       this.doScrollY(maxScrollAmo);
       if (view != null && (view.isFocused() && this.isOffScreen(view))) {
          this.setDescendantFocusability(0x20000);
          this.requestFocus();
          this.setDescendantFocusability(this.getDescendantFocusability());
       }
    label_009b :
       return true;
    }
    public int computeHorizontalScrollExtent(){
       return super.computeHorizontalScrollExtent();
    }
    public int computeHorizontalScrollOffset(){
       return super.computeHorizontalScrollOffset();
    }
    public int computeHorizontalScrollRange(){
       return super.computeHorizontalScrollRange();
    }
    public void computeScroll(){
       NestedScrollView nestedScroll = this;
       if (nestedScroll.mScroller.isFinished()) {
          return;
       }
       nestedScroll.mScroller.computeScrollOffset();
       int currY = nestedScroll.mScroller.getCurrY();
       int i = currY - nestedScroll.mLastScrollerY;
       nestedScroll.mLastScrollerY = currY;
       NestedScrollView mScrollConsu = nestedScroll.mScrollConsumed;
       int i1 = 0;
       mScrollConsu[1] = i1;
       this.dispatchNestedPreScroll(0, i, mScrollConsu, null, 1);
       int i2 = i - nestedScroll.mScrollConsumed[1];
       int scrollRange = this.getScrollRange();
       if (i2) {
          int scrollY = this.getScrollY();
          int i3 = 0;
          this.overScrollByCompat(i3, i2, this.getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
          int i4 = this.getScrollY() - scrollY;
          i2 = i2 - i4;
          NestedScrollView mScrollConsu1 = nestedScroll.mScrollConsumed;
          mScrollConsu1[1] = i1;
          this.dispatchNestedScroll(i3, i4, 0, i2, nestedScroll.mScrollOffset, 1, mScrollConsu1);
          i2 = i2 - nestedScroll.mScrollConsumed[1];
       }
       if (i2) {
          currY = this.getOverScrollMode();
          if (!currY || (currY == 1 && scrollRange > 0)) {
             i1 = 1;
          }
          if (i1) {
             this.ensureGlows();
             if (i2 < 0) {
                if (nestedScroll.mEdgeGlowTop.isFinished()) {
                   nestedScroll.mEdgeGlowTop.onAbsorb((int)nestedScroll.mScroller.getCurrVelocity());
                }
             }else if(nestedScroll.mEdgeGlowBottom.isFinished()){
                nestedScroll.mEdgeGlowBottom.onAbsorb((int)nestedScroll.mScroller.getCurrVelocity());
             }
          }
          this.abortAnimatedScroll();
       }
       if (!nestedScroll.mScroller.isFinished()) {
          i0.j0(this);
       }else {
          nestedScroll.stopNestedScroll(1);
       }
       return;
    }
    public int computeScrollDeltaToGetChildRectOnScreen(Rect p0){
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       int height = this.getHeight();
       int scrollY = this.getScrollY();
       int i1 = scrollY + height;
       int verticalFadi = this.getVerticalFadingEdgeLength();
       if (p0.top > null) {
          scrollY = scrollY + verticalFadi;
       }
       View childAt = this.getChildAt(i);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       verticalFadi = (p0.bottom < ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin))? i1 - verticalFadi: i1;
       Rect bottom = p0.bottom;
       if (bottom > verticalFadi && p0.top > scrollY) {
          int i2 = (p0.height() > height)? p0.top - scrollY: p0.bottom - verticalFadi;
          i = Math.min((i2 + i), ((childAt.getBottom() + layoutParams.bottomMargin) - i1));
       }else if(p0.top < scrollY && bottom < verticalFadi){
          i = (p0.height() > height)? i - (verticalFadi - p0.bottom): i - (scrollY - p0.top);
          i = Math.max(i, (- this.getScrollY()));
       }
       return i;
    }
    public int computeVerticalScrollExtent(){
       return super.computeVerticalScrollExtent();
    }
    public int computeVerticalScrollOffset(){
       return Math.max(0, super.computeVerticalScrollOffset());
    }
    public int computeVerticalScrollRange(){
       int i = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
       if (!this.getChildCount()) {
          return i;
       }
       View childAt = this.getChildAt(0);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       int i1 = childAt.getBottom() + layoutParams.bottomMargin;
       int scrollY = this.getScrollY();
       int i2 = Math.max(0, (i1 - i));
       if (scrollY < 0) {
          i1 = i1 - scrollY;
       }else if(scrollY > i2){
          i1 = i1 + (scrollY - i2);
       }
       return i1;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (super.dispatchKeyEvent(p0) || this.executeKeyEvent(p0))? true: false;
       return b;
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.mChildHelper.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.mChildHelper.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       return this.dispatchNestedPreScroll(p0, p1, p2, p3, 0);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       return this.mChildHelper.d(p0, p1, p2, p3, p4);
    }
    public void dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       this.mChildHelper.e(p0, p1, p2, p3, p4, p5, p6);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       return this.mChildHelper.f(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       return this.mChildHelper.g(p0, p1, p2, p3, p4, p5);
    }
    public final void doScrollY(int p0){
       if (p0) {
          if (this.mSmoothScrollingEnabled != null) {
             this.smoothScrollBy(0, p0);
          }else {
             this.scrollBy(0, p0);
          }
       }
       return;
    }
    public void draw(Canvas p0){
       int i1;
       int width;
       int height;
       int i3;
       super.draw(p0);
       if (this.mEdgeGlowTop != null) {
          int scrollY = this.getScrollY();
          int i = 0;
          if (!this.mEdgeGlowTop.isFinished()) {
             i1 = p0.save();
             width = this.getWidth();
             height = this.getHeight();
             int i2 = Math.min(i, scrollY);
             if (this.getClipToPadding()) {
                width = width - (this.getPaddingLeft() + this.getPaddingRight());
                i3 = this.getPaddingLeft() + i;
             }else {
                i3 = 0;
             }
             if (this.getClipToPadding()) {
                height = height - (this.getPaddingTop() + this.getPaddingBottom());
                i2 = i2 + this.getPaddingTop();
             }
             p0.translate((float)i3, (float)i2);
             this.mEdgeGlowTop.setSize(width, height);
             if (this.mEdgeGlowTop.draw(p0)) {
                i0.j0(this);
             }
             p0.restoreToCount(i1);
          }
          if (!this.mEdgeGlowBottom.isFinished()) {
             i1 = p0.save();
             width = this.getWidth();
             height = this.getHeight();
             scrollY = Math.max(this.getScrollRange(), scrollY) + height;
             if (this.getClipToPadding()) {
                width = width - (this.getPaddingLeft() + this.getPaddingRight());
                i = i + this.getPaddingLeft();
             }
             if (this.getClipToPadding()) {
                height = height - (this.getPaddingTop() + this.getPaddingBottom());
                scrollY = scrollY - this.getPaddingBottom();
             }
             p0.translate((float)(i - width), (float)scrollY);
             p0.rotate(180.00f, (float)width, 0);
             this.mEdgeGlowBottom.setSize(width, height);
             if (this.mEdgeGlowBottom.draw(p0)) {
                i0.j0(this);
             }
             p0.restoreToCount(i1);
          }
       }
       return;
    }
    public final void endDrag(){
       this.mIsBeingDragged = false;
       this.recycleVelocityTracker();
       this.stopNestedScroll(false);
       NestedScrollView tmEdgeGlowTo = this.mEdgeGlowTop;
       if (tmEdgeGlowTo != null) {
          tmEdgeGlowTo.onRelease();
          this.mEdgeGlowBottom.onRelease();
       }
       return;
    }
    public final void ensureGlows(){
       if (this.getOverScrollMode() != 2) {
          if (this.mEdgeGlowTop == null) {
             Context context = this.getContext();
             this.mEdgeGlowTop = new EdgeEffect(context);
             this.mEdgeGlowBottom = new EdgeEffect(context);
          }
       }else {
          this.mEdgeGlowTop = null;
          this.mEdgeGlowBottom = null;
       }
       return;
    }
    public boolean executeKeyEvent(KeyEvent p0){
       this.mTempRect.setEmpty();
       boolean b = false;
       int i = 130;
       if (!this.canScroll()) {
          if (this.isFocused() && p0.getKeyCode() != 4) {
             View view = this.findFocus();
             if (view == this) {
                view = null;
             }
             view = FocusFinder.getInstance().findNextFocus(this, view, i);
             if (view != null && (view != this && view.requestFocus(i))) {
                b = true;
             }
          }
       label_0035 :
          return b;
       }else if(!p0.getAction()){
          int keyCode = p0.getKeyCode();
          if (keyCode != 19) {
             if (keyCode != 20) {
                if (keyCode == 62) {
                   if (p0.isShiftPressed()) {
                      i = 33;
                   }
                   this.pageScroll(i);
                }
             }else if(!p0.isAltPressed()){
                b = this.arrowScroll(i);
             }else {
                b = this.fullScroll(i);
             }
          }else if(!p0.isAltPressed()){
             b = this.arrowScroll(33);
          }else {
             b = this.fullScroll(33);
          }
       }
       return b;
    }
    public final View findFocusableViewInBounds(boolean p0,int p1,int p2){
       ArrayList focusables = this.getFocusables(2);
       int i = focusables.size();
       View view = null;
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          View view1 = focusables.get(i1);
          int top = view1.getTop();
          int bottom = view1.getBottom();
          if (p1 < bottom && top < p2) {
             int i3 = (p1 < top && bottom < p2)? 1: 0;
             if (view == null) {
                view = view1;
                i2 = i3;
             }else if(!p0 || (top < view.getTop() || (!p0 && bottom > view.getBottom()))){
                top = 1;
             }else {
                top = 0;
             }
             if (i2) {
                if (!i3 || !top) {
                label_0050 :
                   i1 = i1 + 1;
                }
             }else if(i3){
                view = view1;
                i2 = 1;
                goto label_0050 ;
             }else if(top){
             }
             view = view1;
             goto label_0050 ;
          }
       }
       return view;
    }
    public void fling(int p0){
       if (this.getChildCount() > 0) {
          this.mScroller.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
          this.runAnimatedScroll(true);
       }
       return;
    }
    public boolean fullScroll(int p0){
       NestedScrollView tmTempRect1;
       int i = 1;
       int i1 = 0;
       NestedScrollView nestedScroll = (p0 == 130)? 1: null;
       int height = this.getHeight();
       NestedScrollView tmTempRect = this.mTempRect;
       tmTempRect.top = i1;
       tmTempRect.bottom = height;
       if (nestedScroll) {
          i1 = this.getChildCount();
          if (i1 > 0) {
             View childAt = this.getChildAt((i1 - i));
             FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             this.mTempRect.bottom = (childAt.getBottom() + layoutParams.bottomMargin) + this.getPaddingBottom();
             tmTempRect1 = this.mTempRect;
             tmTempRect1.top = tmTempRect1.bottom - height;
          }
       }
       tmTempRect1 = this.mTempRect;
       return this.scrollAndFocus(p0, tmTempRect1.top, tmTempRect1.bottom);
    }
    public float getBottomFadingEdgeStrength(){
       if (!this.getChildCount()) {
          return 0;
       }
       View childAt = this.getChildAt(0);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       int verticalFadi = this.getVerticalFadingEdgeLength();
       int i = ((childAt.getBottom() + layoutParams.bottomMargin) - this.getScrollY()) - (this.getHeight() - this.getPaddingBottom());
       if (i < verticalFadi) {
          return ((float)i / (float)verticalFadi);
       }
       return 0x3f800000;
    }
    public int getMaxScrollAmount(){
       return (int)((float)this.getHeight() * 0x3f000000);
    }
    public int getNestedScrollAxes(){
       return this.mParentHelper.a();
    }
    public int getScrollRange(){
       int i = 0;
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(i);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          i = Math.max(i, (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())));
       }
       return i;
    }
    public float getTopFadingEdgeStrength(){
       if (!this.getChildCount()) {
          return 0;
       }
       int verticalFadi = this.getVerticalFadingEdgeLength();
       int scrollY = this.getScrollY();
       if (scrollY < verticalFadi) {
          return ((float)scrollY / (float)verticalFadi);
       }
       return 0x3f800000;
    }
    public final float getVerticalScrollFactorCompat(){
       if (!this.mVerticalScrollFactor - null) {
          TypedValue typedValue = new TypedValue();
          Context context = this.getContext();
          if (context.getTheme().resolveAttribute(0x101004d, typedValue, true)) {
             this.mVerticalScrollFactor = typedValue.getDimension(c.c(context.getResources()));
          }else {
             throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
          }
       }
       return this.mVerticalScrollFactor;
    }
    public boolean hasNestedScrollingParent(){
       return this.hasNestedScrollingParent(0);
    }
    public boolean hasNestedScrollingParent(int p0){
       return this.mChildHelper.l(p0);
    }
    public final boolean inChild(int p0,int p1){
       int i = 0;
       if (this.getChildCount() > 0) {
          int scrollY = this.getScrollY();
          View childAt = this.getChildAt(i);
          if (p1 >= (childAt.getTop() - scrollY) && (p1 < (childAt.getBottom() - scrollY) && (p0 >= childAt.getLeft() && p0 < childAt.getRight()))) {
             i = true;
          }
       }
    label_002a :
       return i;
    }
    public final void initOrResetVelocityTracker(){
       NestedScrollView tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr == null) {
          this.mVelocityTracker = VelocityTracker.obtain();
       }else {
          tmVelocityTr.clear();
       }
       return;
    }
    public final void initScrollView(){
       this.mScroller = new OverScroller(this.getContext());
       this.setFocusable(true);
       this.setDescendantFocusability(0x40000);
       this.setWillNotDraw(false);
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       this.mTouchSlop = viewConfigur.getScaledTouchSlop();
       this.mMinimumVelocity = viewConfigur.getScaledMinimumFlingVelocity();
       this.mMaximumVelocity = viewConfigur.getScaledMaximumFlingVelocity();
    }
    public final void initVelocityTrackerIfNotExists(){
       if (this.mVelocityTracker == null) {
          this.mVelocityTracker = VelocityTracker.obtain();
       }
       return;
    }
    public boolean isFillViewport(){
       return this.mFillViewport;
    }
    public boolean isNestedScrollingEnabled(){
       return this.mChildHelper.m();
    }
    public final boolean isOffScreen(View p0){
       return (this.isWithinDeltaOfScreen(p0, 0, this.getHeight()) ^ 0x01);
    }
    public boolean isSmoothScrollingEnabled(){
       return this.mSmoothScrollingEnabled;
    }
    public final boolean isWithinDeltaOfScreen(View p0,int p1,int p2){
       p0.getDrawingRect(this.mTempRect);
       this.offsetDescendantRectToMyCoords(p0, this.mTempRect);
       boolean b = ((this.mTempRect.bottom + p1) >= this.getScrollY() && (this.mTempRect.top - p1) <= (this.getScrollY() + p2))? true: false;
       return b;
    }
    public void measureChild(View p0,int p1,int p2){
       p0.measure(FrameLayout.getChildMeasureSpec(p1, (this.getPaddingLeft() + this.getPaddingRight()), p0.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       p0.measure(FrameLayout.getChildMeasureSpec(p1, ((((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin) + p2), layoutParams.width), View$MeasureSpec.makeMeasureSpec((layoutParams.topMargin + layoutParams.bottomMargin), 0));
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.mIsLaidOut = false;
    }
    public boolean onGenericMotionEvent(MotionEvent p0){
       if (!(p0.getSource() & 0x02) || (p0.getAction() == 8 && this.mIsBeingDragged == null)) {
          float axisValue = p0.getAxisValue(9);
          if (axisValue) {
             int scrollRange = this.getScrollRange();
             int scrollY = this.getScrollY();
             int i = scrollY - (int)(axisValue * this.getVerticalScrollFactorCompat());
             if (i < 0) {
                scrollRange = 0;
             }else if(i > scrollRange){
                scrollRange = i;
             }
             if (scrollRange != scrollY) {
                super.scrollTo(this.getScrollX(), scrollRange);
                return true;
             }
          }
       }
    label_0045 :
       return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int action = p0.getAction();
       int i = 2;
       if (action == i && this.mIsBeingDragged != null) {
          return true;
       }
       action = action & 0x00ff;
       if (action) {
          int i1 = -1;
          if (action != 1) {
             if (action != i) {
                if (action != 3) {
                   if (action == 6) {
                      this.onSecondaryPointerUp(p0);
                   }
                }
             }else {
                NestedScrollView tmActivePoin = this.mActivePointerId;
                if (tmActivePoin != i1) {
                   action = p0.findPointerIndex(tmActivePoin);
                   if (action != i1) {
                      action = (int)p0.getY(action);
                      if (Math.abs((action - this.mLastMotionY)) > this.mTouchSlop && !(i & this.getNestedScrollAxes())) {
                         this.mIsBeingDragged = true;
                         this.mLastMotionY = action;
                         this.initVelocityTrackerIfNotExists();
                         this.mVelocityTracker.addMovement(p0);
                         this.mNestedYOffset = 0;
                         ViewParent parent = this.getParent();
                         if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                         }
                      }
                   }
                }
             }
          }
          this.mIsBeingDragged = false;
          this.mActivePointerId = i1;
          this.recycleVelocityTracker();
          if (this.mScroller.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
             i0.j0(this);
          }
          this.stopNestedScroll(false);
       }else {
          action = (int)p0.getY();
          if (!this.inChild((int)p0.getX(), action)) {
             this.mIsBeingDragged = false;
             this.recycleVelocityTracker();
          }else {
             this.mLastMotionY = action;
             this.mActivePointerId = p0.getPointerId(false);
             this.initOrResetVelocityTracker();
             this.mVelocityTracker.addMovement(p0);
             this.mScroller.computeScrollOffset();
             this.mIsBeingDragged = this.mScroller.isFinished() ^ true;
             this.startNestedScroll(i, false);
          }
       }
    label_00be :
       return this.mIsBeingDragged;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       FrameLayout$LayoutParams layoutParams;
       int i;
       super.onLayout(p0, p1, p2, p3, p4);
       p0 = false;
       this.mIsLayoutDirty = p0;
       NestedScrollView tmChildToScr = this.mChildToScrollTo;
       if (tmChildToScr != null && NestedScrollView.isViewDescendantOf(tmChildToScr, this)) {
          this.scrollToChild(this.mChildToScrollTo);
       }
       View view = null;
       this.mChildToScrollTo = view;
       if (this.mIsLaidOut == null) {
          if (this.mSavedState != null) {
             this.scrollTo(this.getScrollX(), this.mSavedState.b);
             this.mSavedState = view;
          }
          if (this.getChildCount() > 0) {
             View childAt = this.getChildAt(p0);
             layoutParams = childAt.getLayoutParams();
             i = (childAt.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
          }
          layoutParams = this.getScrollY();
          i = NestedScrollView.clamp(layoutParams, (((p4 - p2) - this.getPaddingTop()) - this.getPaddingBottom()), i);
          if (i != layoutParams) {
             this.scrollTo(this.getScrollX(), i);
          }
       }
       this.scrollTo(this.getScrollX(), this.getScrollY());
       this.mIsLaidOut = true;
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.mFillViewport == null) {
          return;
       }
       if (!View$MeasureSpec.getMode(p1)) {
          return;
       }
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int i = (((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
          if (childAt.getMeasuredHeight() < i) {
             childAt.measure(FrameLayout.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width), View$MeasureSpec.makeMeasureSpec(i, 0x40000000));
          }
       }
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (p3) {
          return false;
       }
       this.dispatchNestedFling(0, p2, true);
       this.fling((int)p2);
       return true;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return this.dispatchNestedPreFling(p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       this.dispatchNestedPreScroll(p1, p2, p3, null, p4);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       this.onNestedScrollInternal(p4, 0, null);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       this.onNestedScrollInternal(p4, p5, null);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       this.onNestedScrollInternal(p4, p5, p6);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.onNestedScrollAccepted(p0, p1, p2, 0);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       this.mParentHelper.c(p0, p1, p2, p3);
       this.startNestedScroll(2, p3);
    }
    public final void onNestedScrollInternal(int p0,int p1,int[] p2){
       this.scrollBy(0, p0);
       int i = this.getScrollY() - this.getScrollY();
       if (p2 != null) {
          p2[1] = p2[1] + i;
       }
       this.mChildHelper.e(0, i, 0, (p0 - i), null, p1, p2);
       return;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       super.scrollTo(p0, p1);
    }
    public boolean onRequestFocusInDescendants(int p0,Rect p1){
       if (p0 == 2) {
          p0 = 130;
       }else if(p0 == 1){
          p0 = 33;
       }
       View view = (p1 == null)? FocusFinder.getInstance().findNextFocus(this, null, p0): FocusFinder.getInstance().findNextFocusFromRect(this, p1, p0);
       if (view == null) {
          return false;
       }else if(this.isOffScreen(view)){
          return false;
       }else {
          return view.requestFocus(p0, p1);
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof NestedScrollView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          this.mSavedState = p0;
          this.requestLayout();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       NestedScrollView$SavedState savedState = new NestedScrollView$SavedState(super.onSaveInstanceState());
       savedState.b = this.getScrollY();
       return savedState;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       NestedScrollView tmOnScrollCh = this.mOnScrollChangeListener;
       if (tmOnScrollCh != null) {
          tmOnScrollCh.d5(this, p0, p1, p2, p3);
       }
       return;
    }
    public final void onSecondaryPointerUp(MotionEvent p0){
       int actionIndex = p0.getActionIndex();
       if (p0.getPointerId(actionIndex) == this.mActivePointerId) {
          actionIndex = (!actionIndex)? 1: 0;
          this.mLastMotionY = (int)p0.getY(actionIndex);
          this.mActivePointerId = p0.getPointerId(actionIndex);
          NestedScrollView tmVelocityTr = this.mVelocityTracker;
          if (tmVelocityTr != null) {
             tmVelocityTr.clear();
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       View view = this.findFocus();
       if (view == null || (this != view && this.isWithinDeltaOfScreen(view, 0, p3))) {
          view.getDrawingRect(this.mTempRect);
          this.offsetDescendantRectToMyCoords(view, this.mTempRect);
          this.doScrollY(this.computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
       }
    label_0026 :
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = (p2 & 0x02)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       this.onStopNestedScroll(p0, 0);
    }
    public void onStopNestedScroll(View p0,int p1){
       this.mParentHelper.e(p0, p1);
       this.stopNestedScroll(p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       NestedScrollView mVelocityTra;
       NestedScrollView nestedScroll = this;
       MotionEvent motionEvent = p0;
       this.initVelocityTrackerIfNotExists();
       int actionMasked = p0.getActionMasked();
       if (!actionMasked) {
          nestedScroll.mNestedYOffset = 0;
       }
       MotionEvent motionEvent1 = MotionEvent.obtain(p0);
       float f = 0;
       motionEvent1.offsetLocation(f, (float)nestedScroll.mNestedYOffset);
       NestedScrollView nestedScroll1 = 2;
       if (actionMasked) {
          int i = -1;
          if (actionMasked != 1) {
             if (actionMasked != nestedScroll1) {
                if (actionMasked != 3) {
                   if (actionMasked != 0.00f) {
                      if (actionMasked == 6) {
                         this.onSecondaryPointerUp(p0);
                         nestedScroll.mLastMotionY = (int)motionEvent.getY(motionEvent.findPointerIndex(nestedScroll.mActivePointerId));
                      }
                   }else {
                      actionMasked = p0.getActionIndex();
                      nestedScroll.mLastMotionY = (int)motionEvent.getY(actionMasked);
                      nestedScroll.mActivePointerId = motionEvent.getPointerId(actionMasked);
                   }
                }else if(nestedScroll.mIsBeingDragged != null && (this.getChildCount() > 0 && nestedScroll.mScroller.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange()))){
                   i0.j0(this);
                }
                nestedScroll.mActivePointerId = i;
                this.endDrag();
             }else {
                int i1 = motionEvent.findPointerIndex(nestedScroll.mActivePointerId);
                if (i1 != i) {
                   int i2 = (int)motionEvent.getY(i1);
                   actionMasked = nestedScroll.mLastMotionY - i2;
                   if (nestedScroll.mIsBeingDragged == null && Math.abs(actionMasked) > nestedScroll.mTouchSlop) {
                      ViewParent parent = this.getParent();
                      if (parent != null) {
                         parent.requestDisallowInterceptTouchEvent(true);
                      }
                      nestedScroll.mIsBeingDragged = true;
                      if (actionMasked > 0) {
                         actionMasked = actionMasked - nestedScroll.mTouchSlop;
                      }else {
                         actionMasked = actionMasked + nestedScroll.mTouchSlop;
                      }
                   }
                   int i3 = actionMasked;
                   if (nestedScroll.mIsBeingDragged != null) {
                      if (this.dispatchNestedPreScroll(0, i3, nestedScroll.mScrollConsumed, nestedScroll.mScrollOffset, 0)) {
                         i3 = i3 - nestedScroll.mScrollConsumed[1];
                         nestedScroll.mNestedYOffset = nestedScroll.mNestedYOffset + nestedScroll.mScrollOffset[1];
                      }
                      int i4 = i3;
                      nestedScroll.mLastMotionY = i2 - nestedScroll.mScrollOffset[1];
                      int scrollY = this.getScrollY();
                      int scrollRange = this.getScrollRange();
                      actionMasked = this.getOverScrollMode();
                      int i5 = (!actionMasked || (actionMasked == 1 && scrollRange > 0))? 1: 0;
                      int i6 = scrollRange;
                      if (this.overScrollByCompat(0, i4, 0, this.getScrollY(), 0, scrollRange, 0, 0, 1) && !nestedScroll.hasNestedScrollingParent(0)) {
                         nestedScroll.mVelocityTracker.clear();
                      }
                      int i7 = this.getScrollY() - scrollY;
                      NestedScrollView mScrollConsu = nestedScroll.mScrollConsumed;
                      mScrollConsu[1] = 0;
                      this.dispatchNestedScroll(0, i7, 0, (i4 - i7), nestedScroll.mScrollOffset, 0, mScrollConsu);
                      nestedScroll1 = nestedScroll.mScrollOffset;
                      nestedScroll.mLastMotionY = nestedScroll.mLastMotionY - nestedScroll1[1];
                      nestedScroll.mNestedYOffset = nestedScroll.mNestedYOffset + nestedScroll1[1];
                      if (i5) {
                         actionMasked = i4 - nestedScroll.mScrollConsumed[1];
                         this.ensureGlows();
                         int i8 = scrollY + actionMasked;
                         if (i8 < 0) {
                            c.e(nestedScroll.mEdgeGlowTop, ((float)actionMasked / (float)this.getHeight()), (motionEvent.getX(i1) / (float)this.getWidth()));
                            if (!nestedScroll.mEdgeGlowBottom.isFinished()) {
                               nestedScroll.mEdgeGlowBottom.onRelease();
                            }
                         }else if(i8 > i6){
                            c.e(nestedScroll.mEdgeGlowBottom, ((float)actionMasked / (float)this.getHeight()), (0x3f800000 - (motionEvent.getX(i1) / (float)this.getWidth())));
                            if (!nestedScroll.mEdgeGlowTop.isFinished()) {
                               nestedScroll.mEdgeGlowTop.onRelease();
                            }
                         }
                         mVelocityTra = nestedScroll.mEdgeGlowTop;
                         if (mVelocityTra != null && (!mVelocityTra.isFinished() || !nestedScroll.mEdgeGlowBottom.isFinished())) {
                            i0.j0(this);
                         }
                      }
                   }
                }
             }
          }else {
             mVelocityTra = nestedScroll.mVelocityTracker;
             mVelocityTra.computeCurrentVelocity(1000, (float)nestedScroll.mMaximumVelocity);
             actionMasked = (int)mVelocityTra.getYVelocity(nestedScroll.mActivePointerId);
             if (Math.abs(actionMasked) >= nestedScroll.mMinimumVelocity) {
                actionMasked = - actionMasked;
                float f1 = (float)actionMasked;
                if (!nestedScroll.dispatchNestedPreFling(f, f1)) {
                   nestedScroll.dispatchNestedFling(f, f1, true);
                   nestedScroll.fling(actionMasked);
                }
             }else if(nestedScroll.mScroller.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())){
                i0.j0(this);
             }
             nestedScroll.mActivePointerId = i;
             this.endDrag();
          }
       }else if(!this.getChildCount()){
          return 0;
       }else {
          actionMasked = nestedScroll.mScroller.isFinished() ^ true;
          nestedScroll.mIsBeingDragged = actionMasked;
          if (actionMasked) {
             ViewParent parent1 = this.getParent();
             if (parent1 != null) {
                parent1.requestDisallowInterceptTouchEvent(true);
             }
          }
          if (!nestedScroll.mScroller.isFinished()) {
             this.abortAnimatedScroll();
          }
          nestedScroll.mLastMotionY = (int)p0.getY();
          nestedScroll.mActivePointerId = motionEvent.getPointerId(0);
          nestedScroll.startNestedScroll(nestedScroll1, 0);
       }
    label_0237 :
       mVelocityTra = nestedScroll.mVelocityTracker;
       if (mVelocityTra != null) {
          mVelocityTra.addMovement(motionEvent1);
       }
       motionEvent1.recycle();
       return true;
    }
    public boolean overScrollByCompat(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       NestedScrollView nestedScroll = this;
       int overScrollMo = this.getOverScrollMode();
       boolean b = false;
       int i = (this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent())? 1: 0;
       int i1 = (this.computeVerticalScrollRange() > this.computeVerticalScrollExtent())? 1: 0;
       i = (!overScrollMo || (overScrollMo == 1 && i))? 1: 0;
       overScrollMo = (!overScrollMo || (overScrollMo == 1 && i1))? 1: 0;
       i1 = p2 + p0;
       i = (!i)? 0: p6;
       int i2 = p3 + p1;
       overScrollMo = (!overScrollMo)? 0: p7;
       int i3 = - i;
       i = i + p4;
       int i4 = - overScrollMo;
       overScrollMo = overScrollMo + p5;
       if (i1 > i) {
          i1 = i;
       }else if(i1 < i3){
          i1 = i3;
       }else {
          i = false;
       label_0055 :
          if (i2 > overScrollMo) {
             i2 = overScrollMo;
          }else if(i2 < i4){
             i2 = i4;
          }else {
             overScrollMo = false;
          label_005f :
             if (overScrollMo && !this.hasNestedScrollingParent(1)) {
                nestedScroll.mScroller.springBack(i1, i2, 0, 0, 0, this.getScrollRange());
             }
             this.onOverScrolled(i1, i2, i, overScrollMo);
             if (i || overScrollMo) {
                b = true;
             }
             return b;
          }
          overScrollMo = true;
          goto label_005f ;
       }
       i = true;
       goto label_0055 ;
    }
    public boolean pageScroll(int p0){
       NestedScrollView tmTempRect;
       int i = 1;
       NestedScrollView nestedScroll = null;
       int i1 = (p0 == 130)? 1: 0;
       int height = this.getHeight();
       if (i1) {
          this.mTempRect.top = this.getScrollY() + height;
          int childCount = this.getChildCount();
          if (childCount > 0) {
             View childAt = this.getChildAt((childCount - i));
             FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             i = (childAt.getBottom() + layoutParams.bottomMargin) + this.getPaddingBottom();
             nestedScroll = this.mTempRect;
             if ((nestedScroll.top + height) > i) {
                nestedScroll.top = i - height;
             }
          }
       }else {
          this.mTempRect.top = this.getScrollY() - height;
          tmTempRect = this.mTempRect;
          if (tmTempRect.top < null) {
             tmTempRect.top = nestedScroll;
          }
       }
       tmTempRect = this.mTempRect;
       Rect top = tmTempRect.top;
       height = height + top;
       tmTempRect.bottom = height;
       return this.scrollAndFocus(p0, top, height);
    }
    public final void recycleVelocityTracker(){
       NestedScrollView tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr != null) {
          tmVelocityTr.recycle();
          this.mVelocityTracker = null;
       }
       return;
    }
    public void requestChildFocus(View p0,View p1){
       if (this.mIsLayoutDirty == null) {
          this.scrollToChild(p1);
       }else {
          this.mChildToScrollTo = p1;
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public boolean requestChildRectangleOnScreen(View p0,Rect p1,boolean p2){
       p1.offset((p0.getLeft() - p0.getScrollX()), (p0.getTop() - p0.getScrollY()));
       return this.scrollToChildRect(p1, p2);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (p0) {
          this.recycleVelocityTracker();
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void requestLayout(){
       this.mIsLayoutDirty = true;
       super.requestLayout();
    }
    public final void runAnimatedScroll(boolean p0){
       if (p0) {
          this.startNestedScroll(2, 1);
       }else {
          this.stopNestedScroll(1);
       }
       this.mLastScrollerY = this.getScrollY();
       i0.j0(this);
       return;
    }
    public final boolean scrollAndFocus(int p0,int p1,int p2){
       int scrollY = this.getScrollY();
       int i = this.getHeight() + scrollY;
       boolean b = false;
       boolean b1 = (p0 == 33)? true: false;
       View view = this.findFocusableViewInBounds(b1, p1, p2);
       if (view == null) {
          view = this;
       }
       if (p1 < scrollY || p2 > i) {
          p1 = (b1)? p1 - scrollY: p2 - i;
          this.doScrollY(p1);
          b = true;
       }
       if (view != this.findFocus()) {
          view.requestFocus(p0);
       }
       return b;
    }
    public void scrollTo(int p0,int p1){
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          p0 = NestedScrollView.clamp(p0, ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((childAt.getWidth() + layoutParams.leftMargin) + layoutParams.rightMargin));
          p1 = NestedScrollView.clamp(p1, ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin));
          if (p0 != this.getScrollX() || p1 != this.getScrollY()) {
             super.scrollTo(p0, p1);
          }
       }
       return;
    }
    public final void scrollToChild(View p0){
       p0.getDrawingRect(this.mTempRect);
       this.offsetDescendantRectToMyCoords(p0, this.mTempRect);
       int i = this.computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
       if (i) {
          this.scrollBy(0, i);
       }
       return;
    }
    public final boolean scrollToChildRect(Rect p0,boolean p1){
       int i = this.computeScrollDeltaToGetChildRectOnScreen(p0);
       boolean b = (i)? true: false;
       if (b) {
          if (p1) {
             this.scrollBy(0, i);
          }else {
             this.smoothScrollBy(0, i);
          }
       }
       return b;
    }
    public void setFillViewport(boolean p0){
       if (p0 != this.mFillViewport) {
          this.mFillViewport = p0;
          this.requestLayout();
       }
       return;
    }
    public void setNestedScrollingEnabled(boolean p0){
       this.mChildHelper.n(p0);
    }
    public void setOnScrollChangeListener(NestedScrollView$b p0){
       this.mOnScrollChangeListener = p0;
    }
    public void setSmoothScrollingEnabled(boolean p0){
       this.mSmoothScrollingEnabled = p0;
    }
    public boolean shouldDelayChildPressedState(){
       return true;
    }
    public final void smoothScrollBy(int p0,int p1){
       this.smoothScrollBy(p0, p1, 250, false);
    }
    public final void smoothScrollBy(int p0,int p1,int p2){
       this.smoothScrollBy(p0, p1, p2, false);
    }
    public final void smoothScrollBy(int p0,int p1,int p2,boolean p3){
       if (!this.getChildCount()) {
          return;
       }
       if ((AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll) - 250 > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int scrollY = this.getScrollY();
          this.mScroller.startScroll(this.getScrollX(), scrollY, 0, (Math.max(0, Math.min((p1 + scrollY), Math.max(0, (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()))))) - scrollY), p2);
          this.runAnimatedScroll(p3);
       }else if(!this.mScroller.isFinished()){
          this.abortAnimatedScroll();
       }
       this.scrollBy(p0, p1);
       this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
       return;
    }
    public final void smoothScrollTo(int p0,int p1){
       this.smoothScrollTo(p0, p1, 250, false);
    }
    public final void smoothScrollTo(int p0,int p1,int p2){
       this.smoothScrollTo(p0, p1, p2, false);
    }
    public void smoothScrollTo(int p0,int p1,int p2,boolean p3){
       this.smoothScrollBy((p0 - this.getScrollX()), (p1 - this.getScrollY()), p2, p3);
    }
    public void smoothScrollTo(int p0,int p1,boolean p2){
       this.smoothScrollTo(p0, p1, 250, p2);
    }
    public boolean startNestedScroll(int p0){
       return this.startNestedScroll(p0, 0);
    }
    public boolean startNestedScroll(int p0,int p1){
       return this.mChildHelper.q(p0, p1);
    }
    public void stopNestedScroll(){
       this.stopNestedScroll(0);
    }
    public void stopNestedScroll(int p0){
       this.mChildHelper.s(p0);
    }
}
