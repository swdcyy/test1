package androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager$a;
import androidx.viewpager.widget.ViewPager$b;
import androidx.viewpager.widget.ViewPager$m;
import android.content.Context;
import java.util.ArrayList;
import androidx.viewpager.widget.ViewPager$f;
import android.graphics.Rect;
import androidx.viewpager.widget.ViewPager$c;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$e;
import java.lang.annotation.Annotation;
import h3.a;
import androidx.viewpager.widget.ViewPager$h;
import java.util.List;
import androidx.viewpager.widget.ViewPager$i;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager.widget.ViewPager$LayoutParams;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.ViewParent;
import java.lang.StringBuilder;
import android.view.FocusFinder;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.Scroller;
import java.lang.Runnable;
import a2.i0;
import java.lang.Math;
import java.util.Comparator;
import java.util.Collections;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.view.animation.Interpolator;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.viewpager.widget.ViewPager$g;
import a2.a;
import androidx.viewpager.widget.ViewPager$d;
import a2.z;
import android.view.View$MeasureSpec;
import androidx.viewpager.widget.ViewPager$j;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager$SavedState;
import androidx.customview.view.AbsSavedState;
import java.lang.ClassLoader;
import android.os.IBinder;
import java.lang.Integer;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager$k;
import androidx.core.content.ContextCompat;

public class ViewPager extends ViewGroup	// class@000a1e
{
    public int mActivePointerId;
    public a mAdapter;
    public List mAdapterChangeListeners;
    public int mBottomPageBounds;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mChildWidthMeasureSpec;
    public int mCloseEnough;
    public int mCurItem;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList mDrawingOrderedChildren;
    public final Runnable mEndScrollRunnable;
    public int mExpectedAdapterCount;
    public long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout;
    public float mFirstOffset;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public ViewPager$i mInternalPageChangeListener;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public final ArrayList mItems;
    public float mLastMotionX;
    public float mLastMotionY;
    public float mLastOffset;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public boolean mNeedCalculatePageOffsets;
    public ViewPager$k mObserver;
    public int mOffscreenPageLimit;
    public ViewPager$i mOnPageChangeListener;
    public List mOnPageChangeListeners;
    public int mPageMargin;
    public ViewPager$j mPageTransformer;
    public int mPageTransformerLayerType;
    public boolean mPopulatePending;
    public Parcelable mRestoredAdapterState;
    public ClassLoader mRestoredClassLoader;
    public int mRestoredCurItem;
    public EdgeEffect mRightEdge;
    public int mScrollState;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public final ViewPager$f mTempItem;
    public final Rect mTempRect;
    public int mTopPageBounds;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public static final Comparator COMPARATOR;
    public static final int[] LAYOUT_ATTRS;
    public static final Interpolator sInterpolator;
    public static final ViewPager$m sPositionComparator;

    static {
       int[] ointArray = new int[]{0x10100b3};
       ViewPager.LAYOUT_ATTRS = ointArray;
       ViewPager.COMPARATOR = new ViewPager$a();
       ViewPager.sInterpolator = new ViewPager$b();
       ViewPager.sPositionComparator = new ViewPager$m();
    }
    public void ViewPager(Context p0){
       super(p0);
       this.mItems = new ArrayList();
       this.mTempItem = new ViewPager$f();
       this.mTempRect = new Rect();
       this.mRestoredCurItem = -1;
       this.mRestoredAdapterState = null;
       this.mRestoredClassLoader = null;
       this.mFirstOffset = -340282346638528860000000000000000000000.00f;
       this.mLastOffset = Float.MAX_VALUE;
       this.mOffscreenPageLimit = 1;
       this.mActivePointerId = -1;
       this.mFirstLayout = true;
       this.mNeedCalculatePageOffsets = false;
       this.mEndScrollRunnable = new ViewPager$c(this);
       this.mScrollState = 0;
       this.initViewPager();
    }
    public void ViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.mItems = new ArrayList();
       this.mTempItem = new ViewPager$f();
       this.mTempRect = new Rect();
       this.mRestoredCurItem = -1;
       this.mRestoredAdapterState = null;
       this.mRestoredClassLoader = null;
       this.mFirstOffset = -340282346638528860000000000000000000000.00f;
       this.mLastOffset = Float.MAX_VALUE;
       this.mOffscreenPageLimit = 1;
       this.mActivePointerId = -1;
       this.mFirstLayout = true;
       this.mNeedCalculatePageOffsets = false;
       this.mEndScrollRunnable = new ViewPager$c(this);
       this.mScrollState = 0;
       this.initViewPager();
    }
    public static boolean isDecorView(View p0){
       boolean b = (p0.getClass().getAnnotation(ViewPager$e.class) != null)? true: false;
       return b;
    }
    public void addFocusables(ArrayList p0,int p1,int p2){
       int i = p0.size();
       int descendantFo = this.getDescendantFocusability();
       if (descendantFo != 0x60000) {
          int i1 = 0;
          while (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             if (!childAt.getVisibility()) {
                ViewPager$f uof = this.infoForChild(childAt);
                if (uof != null && uof.b == this.mCurItem) {
                   childAt.addFocusables(p0, p1, p2);
                }
             }
             i1 = i1 + 1;
          }
       }
       if (descendantFo != 0x40000 || i == p0.size()) {
          if (!this.isFocusable()) {
             return;
          }else {
             p1 = 1;
             if ((p2 & p1) == p1 && (this.isInTouchMode() && !this.isFocusableInTouchMode())) {
                return;
             }else {
                p0.add(this);
             }
          }
       }
       return;
    }
    public ViewPager$f addNewItem(int p0,int p1){
       ViewPager$f uof = new ViewPager$f();
       uof.b = p0;
       uof.a = this.mAdapter.o(this, p0);
       uof.d = this.mAdapter.m(p0);
       if (p1 < 0 || p1 >= this.mItems.size()) {
          this.mItems.add(uof);
       }else {
          this.mItems.add(p1, uof);
       }
       return uof;
    }
    public void addOnAdapterChangeListener(ViewPager$h p0){
       if (this.mAdapterChangeListeners == null) {
          this.mAdapterChangeListeners = new ArrayList();
       }
       this.mAdapterChangeListeners.add(p0);
       return;
    }
    public void addOnPageChangeListener(ViewPager$i p0){
       if (this.mOnPageChangeListeners == null) {
          this.mOnPageChangeListeners = new ArrayList();
       }
       this.mOnPageChangeListeners.add(p0);
       return;
    }
    public void addTouchables(ArrayList p0){
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             ViewPager$f uof = this.infoForChild(childAt);
             if (uof != null && uof.b == this.mCurItem) {
                childAt.addTouchables(p0);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (!this.checkLayoutParams(p2)) {
          p2 = this.generateLayoutParams(p2);
       }
       ViewGroup$LayoutParams layoutParams = p2;
       int i = layoutParams.a | ViewPager.isDecorView(p0);
       layoutParams.a = i;
       if (this.mInLayout != null) {
          if (!i) {
             layoutParams.d = true;
             this.addViewInLayout(p0, p1, p2);
          }else {
             throw new IllegalStateException("Cannot add pager decor view during layout");
          }
       }else {
          super.addView(p0, p1, p2);
       }
       return;
    }
    public boolean arrowScroll(int p0){
       Rect left;
       Rect left1;
       boolean b;
       StringBuilder str;
       View view = this.findFocus();
       ViewPager viewPager = 1;
       ViewPager viewPager1 = null;
       FocusFinder uFocusFinder = null;
       if (view == this) {
       }else if(view != null){
          ViewParent parent = view.getParent();
          while (true) {
             if (parent instanceof ViewGroup) {
                if (parent == this) {
                   str = 1;
                label_001f :
                   if (!str) {
                      str = view.getClass().getSimpleName();
                      ViewParent parent1 = view.getParent();
                      while (parent1 instanceof ViewGroup) {
                         str = str+" => "+parent1.getClass().getSimpleName();
                         parent1 = parent1.getParent();
                      }
                      view = uFocusFinder;
                   }
                }else {
                   parent = parent.getParent();
                }
             }else {
                str = null;
                goto label_001f ;
             }
          }
       }
       View view1 = FocusFinder.getInstance().findNextFocus(this, view, p0);
       if (view1 != null && view1 != view) {
          if (p0 == 17) {
             left = this.getChildRectInPagerCoordinates(this.mTempRect, view1).left;
             left1 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
             b = (view != null && left >= left1)? this.pageLeft(): view1.requestFocus();
          }else if(p0 == 66){
             left = this.getChildRectInPagerCoordinates(this.mTempRect, view1).left;
             left1 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
             b = (view != null && left <= left1)? this.pageRight(): view1.requestFocus();
          }
          viewPager1 = b;
       }else if(p0 == 17 || p0 == viewPager){
          viewPager1 = this.pageLeft();
       }else if(p0 == 66 || p0 == 2){
          viewPager1 = this.pageRight();
       }
       if (viewPager1) {
          this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(p0));
       }
       return viewPager1;
    }
    public boolean beginFakeDrag(){
       if (this.mIsBeingDragged != null) {
          return false;
       }
       this.mFakeDragging = true;
       this.setScrollState(true);
       this.mLastMotionX = 0;
       this.mInitialMotionX = 0;
       ViewPager tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr == null) {
          this.mVelocityTracker = VelocityTracker.obtain();
       }else {
          tmVelocityTr.clear();
       }
       long l = SystemClock.uptimeMillis();
       MotionEvent motionEvent = MotionEvent.obtain(l, l, 0, 0, 0, 0);
       this.mVelocityTracker.addMovement(motionEvent);
       motionEvent.recycle();
       this.mFakeDragBeginTime = l;
       return true;
    }
    public final void calculatePageOffsets(ViewPager$f p0,int p1,ViewPager$f p2){
       ViewPager$f b;
       ViewPager$f b1;
       float f1;
       int i1;
       int i2;
       ViewPager$f uof;
       float f2;
       float f3;
       int i5;
       float f4;
       float f7;
       int i = this.mAdapter.j();
       int clientWidth = this.getClientWidth();
       float f = (clientWidth > 0)? (float)this.mPageMargin / (float)clientWidth: 0;
       if (p2 != null) {
          b = p2.b;
          b1 = p0.b;
          if (b < b1) {
             f1 = (p2.e + p2.d) + f;
             i2 = 0;
             for (i1 = b + 1; i1 <= p0.b && i2 < this.mItems.size(); i1 = i1 + 1) {
                uof = this.mItems.get(i2);
                while (i1 > uof.b) {
                   int i3 = this.mItems.size() - 1;
                   if (i2 < i3) {
                      i2++;
                      uof = this.mItems.get(i2);
                   }else {
                      break ;
                   }
                }
                while (i1 < uof.b) {
                   f2 = this.mAdapter.m(i1) + f;
                   f1 = f1 + f2;
                   i1 = i1 + 1;
                }
                uof.e = f1;
                f3 = uof.d + f;
                f1 = f1 + f3;
             }
          }else if(b > b1){
             i5 = this.mItems.size() - 1;
             p2 = p2.e;
             for (i1 = b - 1; i1 >= p0.b && i5 >= 0; i1 = i1 - 1) {
                uof = this.mItems.get(i5);
                while (i1 < uof.b && i5 > 0) {
                   i5 = i5 - 1;
                   uof = this.mItems.get(i5);
                }
                while (i1 > uof.b) {
                   f2 = this.mAdapter.m(i1) + f;
                   f7 = p2 - f2;
                   i1 = i1 - 1;
                }
                f2 = uof.d + f;
                f7 = p2 - f2;
                uof.e = f7;
             }
          }
       }
       i2 = this.mItems.size();
       b = p0.e;
       b1 = p0.b;
       int i4 = b1 - 1;
       ViewPager$f uof1 = (b1 == null)? b: -340282346638528860000000000000000000000.00f;
       this.mFirstOffset = uof1;
       i = i - 1;
       f1 = (b1 == i)? (p0.d + b) - 0x3f800000: Float.MAX_VALUE;
       this.mLastOffset = f1;
       i5 = p1 - 1;
       while (i5 >= 0) {
          ViewPager$f uof2 = this.mItems.get(i5);
          ViewPager$f b2 = uof2.b;
          while (i4 > b2) {
             int i6 = i4 - 1;
             f3 = this.mAdapter.m(i4) + f;
             f4 = b - f3;
             i4 = i6;
          }
          float f5 = uof2.d + f;
          f4 = b - f5;
          uof2.e = f4;
          if (b2 == null) {
             this.mFirstOffset = f4;
          }
          i5 = i5 - 1;
          i4 = i4 - 1;
       }
       f4 = (p0.e + p0.d) + f;
       int i7 = p0.b + 1;
       p1++;
       while (p1 < i2) {
          b1 = this.mItems.get(p1);
          uof = b1.b;
          while (i7 < uof) {
             int i8 = i7 + 1;
             float f6 = this.mAdapter.m(i7) + f;
             f4 = f4 + f6;
             i7 = i8;
          }
          if (uof == i) {
             f3 = b1.d + f4;
             f3 = f3 - 0x3f800000;
             this.mLastOffset = f3;
          }
          b1.e = f4;
          f1 = b1.d + f;
          f4 = f4 + f1;
          p1++;
          i7++;
       }
       this.mNeedCalculatePageOffsets = false;
       return;
    }
    public boolean canScroll(View p0,boolean p1,int p2,int p3,int p4){
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
                int i3 = p3 + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                   int i4 = p4 + scrollY;
                   if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                      int i5 = i3 - childAt.getLeft();
                      int i6 = i4 - childAt.getTop();
                      if (this.canScroll(childAt, 1, p2, i5, i6)) {
                         return i1;
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
       }
       if (!p1 || !p0.canScrollHorizontally((- p2))) {
          i1 = false;
       }
       return i1;
    }
    public boolean canScrollHorizontally(int p0){
       boolean b = false;
       if (this.mAdapter == null) {
          return b;
       }
       int clientWidth = this.getClientWidth();
       int scrollX = this.getScrollX();
       if (p0 < 0) {
          if (scrollX > (int)((float)clientWidth * this.mFirstOffset)) {
             b = true;
          }
          return b;
       }else if(p0 > 0 && scrollX < (int)((float)clientWidth * this.mLastOffset)){
          b = true;
       }
       return b;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof ViewPager$LayoutParams && super.checkLayoutParams(p0))? true: false;
       return b;
    }
    public void clearOnPageChangeListeners(){
       ViewPager tmOnPageChan = this.mOnPageChangeListeners;
       if (tmOnPageChan != null) {
          tmOnPageChan.clear();
       }
       return;
    }
    public final void completeScroll(boolean p0){
       int scrollX;
       int i = (this.mScrollState == 2)? 1: 0;
       if (i) {
          this.setScrollingCacheEnabled(false);
          if (this.mScroller.isFinished() ^ 1) {
             this.mScroller.abortAnimation();
             scrollX = this.getScrollX();
             int scrollY = this.getScrollY();
             int currX = this.mScroller.getCurrX();
             int currY = this.mScroller.getCurrY();
             if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (currX != scrollX) {
                   this.pageScrolled(currX);
                }
             }
          }
       }
       this.mPopulatePending = false;
       scrollX = 0;
       while (scrollX < this.mItems.size()) {
          ViewPager$f uof = this.mItems.get(scrollX);
          if (uof.c != null) {
             uof.c = false;
             i = 1;
          }
          scrollX = scrollX + 1;
       }
       if (i) {
          if (p0) {
             i0.k0(this, this.mEndScrollRunnable);
          }else {
             this.mEndScrollRunnable.run();
          }
       }
       return;
    }
    public void computeScroll(){
       boolean b = true;
       this.mIsScrollStarted = b;
       if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
          int scrollY = this.getScrollY();
          int currX = this.mScroller.getCurrX();
          int currY = this.mScroller.getCurrY();
          if (this.getScrollX() != currX || scrollY != currY) {
             this.scrollTo(currX, currY);
             if (!this.pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                this.scrollTo(0, currY);
             }
          }
          i0.j0(this);
          return;
       }else {
          this.completeScroll(b);
          return;
       }
    }
    public void dataSetChanged(){
       int i3;
       int i = this.mAdapter.j();
       this.mExpectedAdapterCount = i;
       ViewPager viewPager = (this.mItems.size() < ((this.mOffscreenPageLimit * 2) + 1) && this.mItems.size() < i)? 1: null;
       ViewPager tmCurItem = this.mCurItem;
       int i1 = 0;
       ViewPager$LayoutParams layoutParams = null;
       while (i1 < this.mItems.size()) {
          ViewPager$f uof = this.mItems.get(i1);
          int i2 = this.mAdapter.k(uof.a);
          if (i2 != -1) {
             if (i2 == -2) {
                this.mItems.remove(i1);
                i1 = i1 - 1;
                if (!layoutParams) {
                   this.mAdapter.x(this);
                   layoutParams = 1;
                }
                this.mAdapter.h(this, uof.b, uof.a);
                viewPager = this.mCurItem;
                if (viewPager == uof.b) {
                   i3 = i - 1;
                   i3 = Math.max(0, Math.min(viewPager, i3));
                }
             }else {
                ViewPager$f b = uof.b;
                if (b != i2) {
                   if (b == this.mCurItem) {
                      i3 = i2;
                   }
                   uof.b = i2;
                }
             }
             viewPager = 1;
          }
          i1 = i1 + 1;
       }
       if (layoutParams) {
          this.mAdapter.i(this);
       }
       Collections.sort(this.mItems, ViewPager.COMPARATOR);
       if (viewPager != null) {
          i = this.getChildCount();
          int i4 = 0;
          while (i4 < i) {
             ViewPager$LayoutParams layoutParams1 = this.getChildAt(i4).getLayoutParams();
             if (layoutParams1.a == null) {
                layoutParams1.c = 0;
             }
             i4 = i4 + 1;
          }
          this.setCurrentItemInternal(tmCurItem, 0, 1);
          this.requestLayout();
       }
       return;
    }
    public final int determineTargetPage(int p0,float p1,int p2,int p3){
       float f;
       if (Math.abs(p3) > this.mFlingDistance && Math.abs(p2) > this.mMinimumVelocity) {
          if (p2 <= 0) {
             p0++;
          }
       }else if(p0 >= this.mCurItem){
          f = 0.40f;
       }else {
          f = 0x3f19999a;
       }
       p0 = p0 + (int)(p1 + f);
       if (this.mItems.size() > 0) {
          ViewPager tmItems = this.mItems;
          p0 = Math.max(this.mItems.get(0).b, Math.min(p0, tmItems.get((tmItems.size() - 1)).b));
       }
       return p0;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (super.dispatchKeyEvent(p0) || this.executeKeyEvent(p0))? true: false;
       return b;
    }
    public final void dispatchOnPageScrolled(int p0,float p1,int p2){
       ViewPager tmOnPageChan = this.mOnPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageScrolled(p0, p1, p2);
       }
       tmOnPageChan = this.mOnPageChangeListeners;
       if (tmOnPageChan != null) {
          int i = 0;
          int i1 = tmOnPageChan.size();
          while (i < i1) {
             ViewPager$i oi = this.mOnPageChangeListeners.get(i);
             if (oi != null) {
                oi.onPageScrolled(p0, p1, p2);
             }
             i = i + 1;
          }
       }
       tmOnPageChan = this.mInternalPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public final void dispatchOnPageSelected(int p0){
       ViewPager tmOnPageChan = this.mOnPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageSelected(p0);
       }
       tmOnPageChan = this.mOnPageChangeListeners;
       if (tmOnPageChan != null) {
          int i = 0;
          int i1 = tmOnPageChan.size();
          while (i < i1) {
             ViewPager$i oi = this.mOnPageChangeListeners.get(i);
             if (oi != null) {
                oi.onPageSelected(p0);
             }
             i = i + 1;
          }
       }
       tmOnPageChan = this.mInternalPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageSelected(p0);
       }
       return;
    }
    public final void dispatchOnScrollStateChanged(int p0){
       ViewPager tmOnPageChan = this.mOnPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageScrollStateChanged(p0);
       }
       tmOnPageChan = this.mOnPageChangeListeners;
       if (tmOnPageChan != null) {
          int i = 0;
          int i1 = tmOnPageChan.size();
          while (i < i1) {
             ViewPager$i oi = this.mOnPageChangeListeners.get(i);
             if (oi != null) {
                oi.onPageScrollStateChanged(p0);
             }
             i = i + 1;
          }
       }
       tmOnPageChan = this.mInternalPageChangeListener;
       if (tmOnPageChan != null) {
          tmOnPageChan.onPageScrollStateChanged(p0);
       }
       return;
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       if (p0.getEventType() == 4096) {
          return super.dispatchPopulateAccessibilityEvent(p0);
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             ViewPager$f uof = this.infoForChild(childAt);
             if (uof != null && (uof.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(p0))) {
                break ;
             }
          }
          i = i + 1;
       }
       return true;
    }
    public float distanceInfluenceForSnapDuration(float p0){
       return (float)Math.sin((double)((p0 - 0x3f000000) * 0x3ef1463b));
    }
    public void draw(Canvas p0){
       super.draw(p0);
       int overScrollMo = this.getOverScrollMode();
       int i = 0;
       if (overScrollMo) {
          int i1 = 1;
          if (overScrollMo == i1) {
             ViewPager tmAdapter = this.mAdapter;
             if (tmAdapter != null && tmAdapter.j() > i1) {
             label_0024 :
                if (!this.mLeftEdge.isFinished()) {
                   i1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
                   int width = this.getWidth();
                   p0.rotate(270.00f);
                   p0.translate((float)((- i1) + this.getPaddingTop()), (this.mFirstOffset * (float)width));
                   this.mLeftEdge.setSize(i1, width);
                   i = i | this.mLeftEdge.draw(p0);
                   p0.restoreToCount(p0.save());
                }
                if (!this.mRightEdge.isFinished()) {
                   i1 = this.getWidth();
                   p0.rotate(90.00f);
                   p0.translate((float)(- this.getPaddingTop()), ((- (this.mLastOffset + 0x3f800000)) * (float)i1));
                   this.mRightEdge.setSize(((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()), i1);
                   i = i | this.mRightEdge.draw(p0);
                   p0.restoreToCount(p0.save());
                }
             }
          }
          this.mLeftEdge.finish();
          this.mRightEdge.finish();
       }else {
          goto label_0024 ;
       }
       if (i) {
          i0.j0(this);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       ViewPager tmMarginDraw = this.mMarginDrawable;
       if (tmMarginDraw != null && tmMarginDraw.isStateful()) {
          tmMarginDraw.setState(this.getDrawableState());
       }
       return;
    }
    public final void enableLayers(boolean p0){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          ViewPager tmPageTransf = (p0)? this.mPageTransformerLayerType: 0;
          this.getChildAt(i).setLayerType(tmPageTransf, null);
       }
       return;
    }
    public final void endDrag(){
       this.mIsBeingDragged = false;
       this.mIsUnableToDrag = false;
       ViewPager tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr != null) {
          tmVelocityTr.recycle();
          this.mVelocityTracker = null;
       }
       return;
    }
    public void endFakeDrag(){
       if (this.mFakeDragging == null) {
          throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
       }
       if (this.mAdapter != null) {
          ViewPager tmVelocityTr = this.mVelocityTracker;
          tmVelocityTr.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
          int i = (int)tmVelocityTr.getXVelocity(this.mActivePointerId);
          this.mPopulatePending = true;
          ViewPager$f uof = this.infoForCurrentScrollPosition();
          this.setCurrentItemInternal(this.determineTargetPage(uof.b, ((((float)this.getScrollX() / (float)this.getClientWidth()) - uof.e) / uof.d), i, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, i);
       }
       this.endDrag();
       this.mFakeDragging = false;
       return;
    }
    public boolean executeKeyEvent(KeyEvent p0){
       boolean b;
       if (!p0.getAction()) {
          int keyCode = p0.getKeyCode();
          if (keyCode != 21) {
             if (keyCode != 22) {
                if (keyCode != 61) {
                label_0053 :
                   b = false;
                }else if(p0.hasNoModifiers()){
                   b = this.arrowScroll(2);
                }else if(p0.hasModifiers(1)){
                   b = this.arrowScroll(1);
                }else {
                   goto label_0053 ;
                }
             }else if(p0.hasModifiers(2)){
                b = this.pageRight();
             }else {
                b = this.arrowScroll(66);
             }
          }else if(p0.hasModifiers(2)){
             b = this.pageLeft();
          }else {
             b = this.arrowScroll(17);
          }
       }else {
          goto label_0053 ;
       }
       return b;
    }
    public void fakeDragBy(float p0){
       if (this.mFakeDragging == null) {
          throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
       }
       if (this.mAdapter == null) {
          return;
       }
       this.mLastMotionX = this.mLastMotionX + p0;
       float f = (float)this.getScrollX() - p0;
       p0 = (float)this.getClientWidth();
       float f1 = this.mFirstOffset * p0;
       float f2 = this.mLastOffset * p0;
       ViewPager$f uof = this.mItems.get(0);
       ViewPager tmItems = this.mItems;
       ViewPager$f uof1 = tmItems.get((tmItems.size() - 1));
       if (uof.b != null) {
          f1 = uof.e * p0;
       }
       if (uof1.b != (this.mAdapter.j() - 1)) {
          f2 = uof1.e * p0;
       }
       if (f - f1 < 0) {
          f = f1;
       }else if(f - f2 > 0){
          f = f2;
       }
       int i = (int)f;
       this.mLastMotionX = this.mLastMotionX + (f - (float)i);
       this.scrollTo(i, this.getScrollY());
       this.pageScrolled(i);
       MotionEvent motionEvent = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0, 0);
       this.mVelocityTracker.addMovement(motionEvent);
       motionEvent.recycle();
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new ViewPager$LayoutParams();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new ViewPager$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.generateDefaultLayoutParams();
    }
    public a getAdapter(){
       return this.mAdapter;
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (this.mDrawingOrder == 2) {
          p0--;
          p1 = p0 - p1;
       }
       return this.mDrawingOrderedChildren.get(p1).getLayoutParams().f;
    }
    public final Rect getChildRectInPagerCoordinates(Rect p0,View p1){
       if (p0 == null) {
          p0 = new Rect();
       }
       if (p1 == null) {
          p0.set(0, 0, 0, 0);
          return p0;
       }else {
          p0.left = p1.getLeft();
          p0.right = p1.getRight();
          p0.top = p1.getTop();
          p0.bottom = p1.getBottom();
          ViewParent parent = p1.getParent();
          while (parent instanceof ViewGroup && parent != this) {
             int i = p0.left + parent.getLeft();
             p0.left = i;
             i = p0.right + parent.getRight();
             p0.right = i;
             i = p0.top + parent.getTop();
             p0.top = i;
             i = p0.bottom + parent.getBottom();
             p0.bottom = i;
             parent = parent.getParent();
          }
          return p0;
       }
    }
    public final int getClientWidth(){
       return ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public int getCurrentItem(){
       return this.mCurItem;
    }
    public int getOffscreenPageLimit(){
       return this.mOffscreenPageLimit;
    }
    public int getPageMargin(){
       return this.mPageMargin;
    }
    public ViewPager$f infoForAnyChild(View p0){
       while (true) {
          ViewParent parent = p0.getParent();
          if (parent == this) {
             return this.infoForChild(p0);
          }
          if (parent == null || !parent instanceof View) {
             break ;
          }else {
             ViewParent viewParent = parent;
          }
       }
       return null;
    }
    public ViewPager$f infoForChild(View p0){
       ViewPager$f uof;
       int i = 0;
       while (true) {
          if (i >= this.mItems.size()) {
             return null;
          }
          uof = this.mItems.get(i);
          if (this.mAdapter.p(p0, uof.a)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uof;
    }
    public final ViewPager$f infoForCurrentScrollPosition(){
       ViewPager$f uof1;
       int clientWidth = this.getClientWidth();
       float f = 0;
       float f1 = (clientWidth > 0)? (float)this.getScrollX() / (float)clientWidth: 0;
       float f2 = (clientWidth > 0)? (float)this.mPageMargin / (float)clientWidth: 0;
       ViewPager$f uof = null;
       float f3 = 0;
       int i = -1;
       int i1 = 0;
       int i2 = 1;
       while (true) {
          if (i1 >= this.mItems.size()) {
             return uof;
          }
          uof1 = this.mItems.get(i1);
          if (!i2) {
             i = i + 1;
             if (uof1.b != i) {
                uof1 = this.mTempItem;
                f = f + f3;
                f = f + f2;
                uof1.e = f;
                uof1.b = i;
                uof1.d = this.mAdapter.m(i);
                i1 = i1 - 1;
             }
          }
          f = uof1.e;
          f3 = uof1.d + f;
          f3 = f3 + f2;
          if (i2 || f1 - f >= 0) {
             if (f1 - f3 >= 0) {
                clientWidth = this.mItems.size() - 1;
                if (i1 != clientWidth) {
                   i = uof1.b;
                   f3 = uof1.d;
                   i1 = i1 + 1;
                   uof = uof1;
                   i2 = 0;
                }
             }
             break ;
          }else {
             return uof;
          }
       }
       return uof1;
    }
    public ViewPager$f infoForPosition(int p0){
       ViewPager$f uof;
       int i = 0;
       while (true) {
          if (i >= this.mItems.size()) {
             return null;
          }
          uof = this.mItems.get(i);
          if (uof.b == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uof;
    }
    public void initViewPager(){
       this.setWillNotDraw(false);
       this.setDescendantFocusability(0x40000);
       boolean b = true;
       this.setFocusable(b);
       Context context = this.getContext();
       this.mScroller = new Scroller(context, ViewPager.sInterpolator);
       ViewConfiguration viewConfigur = ViewConfiguration.get(context);
       DisplayMetrics density = c.c(context.getResources()).density;
       this.mTouchSlop = viewConfigur.getScaledPagingTouchSlop();
       this.mMinimumVelocity = (int)(400.00f * density);
       this.mMaximumVelocity = viewConfigur.getScaledMaximumFlingVelocity();
       this.mLeftEdge = new EdgeEffect(context);
       this.mRightEdge = new EdgeEffect(context);
       this.mFlingDistance = (int)(25.00f * density);
       this.mCloseEnough = (int)(2.00f * density);
       this.mDefaultGutterSize = (int)(density * 16.00f);
       i0.s0(this, new ViewPager$g(this));
       if (!i0.z(this)) {
          i0.D0(this, b);
       }
       i0.I0(this, new ViewPager$d(this));
       return;
    }
    public boolean isFakeDragging(){
       return this.mFakeDragging;
    }
    public final boolean isGutterDrag(float p0,float p1){
       boolean b = (p0 - (float)this.mGutterSize >= 0 || (p1 > 0 || (p0 - (float)(this.getWidth() - this.mGutterSize) > 0 && p1 < 0)))? true: false;
       return b;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.mFirstLayout = true;
    }
    public void onDetachedFromWindow(){
       this.removeCallbacks(this.mEndScrollRunnable);
       ViewPager tmScroller = this.mScroller;
       if (tmScroller != null && !tmScroller.isFinished()) {
          this.mScroller.abortAnimation();
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       float f2;
       float f3;
       float f4;
       float f6;
       ViewPager viewPager = this;
       super.onDraw(p0);
       if (viewPager.mPageMargin > null && (viewPager.mMarginDrawable != null && (viewPager.mItems.size() > 0 && viewPager.mAdapter != null))) {
          int scrollX = this.getScrollX();
          int width = this.getWidth();
          float f = (float)width;
          float f1 = (float)viewPager.mPageMargin / f;
          int i = 0;
          ViewPager$f uof = viewPager.mItems.get(i);
          ViewPager$f e = uof.e;
          int i1 = viewPager.mItems.size();
          ViewPager$f b = uof.b;
          ViewPager$f b1 = viewPager.mItems.get((i1 - 1)).b;
          while (b < b1) {
             ViewPager$f b2 = uof.b;
             while (b > b2 && i < i1) {
                i = i + 1;
                uof = viewPager.mItems.get(i);
             }
             if (b == b2) {
                e = uof.e;
                b2 = uof.d;
                f2 = e + b2;
                f2 = f2 * f;
                f3 = e + b2;
                f3 = f3 + f1;
             }else {
                f4 = viewPager.mAdapter.m(b);
                f2 = e + f4;
                f2 = f2 * f;
                f4 = f4 + f1;
                f3 = e + f4;
             }
             f4 = (float)viewPager.mPageMargin + f2;
             if (f4 - (float)scrollX > 0) {
                float f5 = (float)viewPager.mPageMargin + f2;
                f6 = f1;
                viewPager.mMarginDrawable.setBounds(Math.round(f2), viewPager.mTopPageBounds, Math.round(f5), viewPager.mBottomPageBounds);
                viewPager.mMarginDrawable.draw(p0);
             }else {
                f6 = f1;
             }
             int i2 = scrollX + width;
             if (f2 - (float)i2 <= 0) {
                b = b + 1;
                f1 = f6;
             }
          }
       }
    label_00aa :
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       float mActivePoint1;
       ViewPager viewPager = this;
       MotionEvent motionEvent = p0;
       int i = p0.getAction() & 0x00ff;
       if (i == 3 || i == 1) {
          this.resetTouch();
          return false;
       }else if(i){
          if (viewPager.mIsBeingDragged != null) {
             return true;
          }else if(viewPager.mIsUnableToDrag != null){
             return false;
          }
       }
       ViewPager viewPager1 = 2;
       if (i) {
          if (i != viewPager1) {
             if (i == 6) {
                this.onSecondaryPointerUp(p0);
             }
          }else {
             ViewPager mActivePoint = viewPager.mActivePointerId;
             if (mActivePoint != -1) {
                i = motionEvent.findPointerIndex(mActivePoint);
                float x = motionEvent.getX(i);
                float f = x - viewPager.mLastMotionX;
                float f1 = Math.abs(f);
                float y = motionEvent.getY(i);
                float f2 = Math.abs((y - viewPager.mInitialMotionY));
                if ((v14 = f - null) && (!this.isGutterDrag(viewPager.mLastMotionX, f) && this.canScroll(this, false, (int)f, (int)x, (int)y))) {
                   viewPager.mLastMotionX = x;
                   viewPager.mLastMotionY = y;
                   viewPager.mIsUnableToDrag = true;
                   return false;
                }else {
                   mActivePoint = viewPager.mTouchSlop;
                   if (f1 - (float)mActivePoint > 0 && (f1 * 0x3f000000) - f2 > 0) {
                      viewPager.mIsBeingDragged = true;
                      this.requestParentDisallowInterceptTouchEvent(true);
                      this.setScrollState(true);
                      mActivePoint = viewPager.mInitialMotionX;
                      f = (float)viewPager.mTouchSlop;
                      mActivePoint1 = (v14 > 0)? mActivePoint + f: mActivePoint - f;
                      viewPager.mLastMotionX = mActivePoint1;
                      viewPager.mLastMotionY = y;
                      this.setScrollingCacheEnabled(true);
                   }else if(f2 - (float)mActivePoint > 0){
                      viewPager.mIsUnableToDrag = true;
                   }
                   if (viewPager.mIsBeingDragged != null && this.performDrag(x)) {
                      i0.j0(this);
                   }
                }
             }
          }
       }else {
          mActivePoint1 = p0.getX();
          viewPager.mInitialMotionX = mActivePoint1;
          viewPager.mLastMotionX = mActivePoint1;
          mActivePoint1 = p0.getY();
          viewPager.mInitialMotionY = mActivePoint1;
          viewPager.mLastMotionY = mActivePoint1;
          viewPager.mActivePointerId = motionEvent.getPointerId(false);
          viewPager.mIsUnableToDrag = false;
          viewPager.mIsScrollStarted = true;
          viewPager.mScroller.computeScrollOffset();
          if (viewPager.mScrollState == viewPager1 && Math.abs((viewPager.mScroller.getFinalX() - viewPager.mScroller.getCurrX())) > viewPager.mCloseEnough) {
             viewPager.mScroller.abortAnimation();
             viewPager.mPopulatePending = false;
             this.populate();
             viewPager.mIsBeingDragged = true;
             this.requestParentDisallowInterceptTouchEvent(true);
             this.setScrollState(true);
          }else {
             this.completeScroll(false);
             viewPager.mIsBeingDragged = false;
          }
       }
       if (viewPager.mVelocityTracker == null) {
          viewPager.mVelocityTracker = VelocityTracker.obtain();
       }
       viewPager.mVelocityTracker.addMovement(motionEvent);
       return viewPager.mIsBeingDragged;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i4;
       int i7;
       ViewGroup viewGroup = this;
       int childCount = this.getChildCount();
       boolean i = p3 - p1;
       int i1 = p4 - p2;
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       int paddingRight = this.getPaddingRight();
       int paddingBotto = this.getPaddingBottom();
       int scrollX = this.getScrollX();
       int i2 = 0;
       int i3 = 0;
       ViewPager$LayoutParams layoutParams = 8;
       while (i2 < childCount) {
          View childAt = viewGroup.getChildAt(i2);
          if (childAt.getVisibility() != layoutParams) {
             layoutParams = childAt.getLayoutParams();
             if (layoutParams.a != null) {
                layoutParams = layoutParams.b;
                i4 = layoutParams & 0x07;
                int i5 = layoutParams & 0x70;
                if (i4 != 1) {
                   if (i4 != 3) {
                      if (i4 != 5) {
                         i4 = paddingLeft;
                      }else {
                         i4 = i - paddingRight;
                         i4 = i4 - childAt.getMeasuredWidth();
                         paddingRight = paddingRight + childAt.getMeasuredWidth();
                      label_0068 :
                         i4 = paddingLeft;
                         paddingLeft = i4;
                      }
                   }else {
                      i4 = childAt.getMeasuredWidth() + paddingLeft;
                   }
                }else {
                   i4 = i - childAt.getMeasuredWidth();
                   i4 = i4 / 2;
                   i4 = Math.max(i4, paddingLeft);
                   goto label_0068 ;
                }
                if (i5 != 16) {
                   if (i5 != 48) {
                      if (i5 != 80) {
                         i5 = paddingTop;
                      }else {
                         i5 = i1 - paddingBotto;
                         i5 = i5 - childAt.getMeasuredHeight();
                         paddingBotto = paddingBotto + childAt.getMeasuredHeight();
                      label_009a :
                         i5 = paddingTop;
                         paddingTop = i5;
                      }
                   }else {
                      i5 = childAt.getMeasuredHeight() + paddingTop;
                   }
                }else {
                   i5 = i1 - childAt.getMeasuredHeight();
                   i5 = i5 / 2;
                   i5 = Math.max(i5, paddingTop);
                   goto label_009a ;
                }
                paddingLeft = paddingLeft + scrollX;
                int i6 = childAt.getMeasuredWidth() + paddingLeft;
                i7 = paddingTop + childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, paddingTop, i6, i7);
                i3 = i3 + 1;
                paddingTop = i5;
                paddingLeft = i4;
             }
          }
          i2 = i2 + 1;
       }
       i = (i - paddingLeft) - paddingRight;
       paddingRight = 0;
       while (paddingRight < childCount) {
          View childAt1 = viewGroup.getChildAt(paddingRight);
          if (childAt1.getVisibility() != layoutParams) {
             ViewPager$LayoutParams layoutParams1 = childAt1.getLayoutParams();
             if (layoutParams1.a == null) {
                ViewPager$f uof = viewGroup.infoForChild(childAt1);
                if (uof != null) {
                   float f = (float)i;
                   float f1 = uof.e * f;
                   i2 = (int)f1 + paddingLeft;
                   if (layoutParams1.d != null) {
                      layoutParams1.d = false;
                      f = f * layoutParams1.c;
                      i7 = (int)f;
                      i4 = i1 - paddingTop;
                      i4 = i4 - paddingBotto;
                      childAt1.measure(View$MeasureSpec.makeMeasureSpec(i7, 0x40000000), View$MeasureSpec.makeMeasureSpec(i4, 0x40000000));
                   }
                   i7 = childAt1.getMeasuredWidth() + i2;
                   int i8 = childAt1.getMeasuredHeight() + paddingTop;
                   childAt1.layout(i2, paddingTop, i7, i8);
                }
             }
          }
          paddingRight = paddingRight + 1;
       }
       viewGroup.mTopPageBounds = paddingTop;
       viewGroup.mBottomPageBounds = i1 - paddingBotto;
       viewGroup.mDecorChildCount = i3;
       if (viewGroup.mFirstLayout != null) {
          viewGroup.scrollToItem(viewGroup.mCurItem, false, false, false);
       }else {
          i = false;
       }
       viewGroup.mFirstLayout = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       int i5;
       int i = 0;
       this.setMeasuredDimension(ViewGroup.getDefaultSize(i, p0), ViewGroup.getDefaultSize(i, p1));
       p0 = this.getMeasuredWidth();
       this.mGutterSize = Math.min((p0 / 10), this.mDefaultGutterSize);
       p0 = (p0 - this.getPaddingLeft()) - this.getPaddingRight();
       p1 = (this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom();
       int childCount = this.getChildCount();
       int i1 = 0;
       ViewPager$LayoutParams layoutParams = 8;
       boolean b = true;
       int i2 = 0x40000000;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() != layoutParams) {
             layoutParams = childAt.getLayoutParams();
             if (layoutParams != null && layoutParams.a != null) {
                ViewPager$LayoutParams b1 = layoutParams.b;
                int i3 = b1 & 0x07;
                int i4 = b1 & 0x70;
                i4 = (i4 == 48 || i4 == 80)? 1: 0;
                if (i3 != 3 && i3 != 5) {
                   b = false;
                }
                i3 = Integer.MIN_VALUE;
                if (i4) {
                   i3 = 0x40000000;
                }else if(b){
                   i5 = 0x40000000;
                label_007c :
                   ViewGroup$LayoutParams width = layoutParams.width;
                   if (width != -2) {
                      if (width == -1) {
                         width = p0;
                      }
                      i3 = 0x40000000;
                   }else {
                      width = p0;
                   }
                   ViewGroup$LayoutParams height = layoutParams.height;
                   if (height != -2) {
                      if (height == -1) {
                         height = p1;
                      }
                   }else {
                      height = p1;
                      i2 = i5;
                   }
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(width, i3), View$MeasureSpec.makeMeasureSpec(height, i2));
                   if (i4) {
                      p1 = p1 - childAt.getMeasuredHeight();
                   }else if(b){
                      p0 = p0 - childAt.getMeasuredWidth();
                   }
                }
                i5 = Integer.MIN_VALUE;
                goto label_007c ;
             }
          }
          i1 = i1 + 1;
       }
       this.mChildWidthMeasureSpec = View$MeasureSpec.makeMeasureSpec(p0, i2);
       this.mChildHeightMeasureSpec = View$MeasureSpec.makeMeasureSpec(p1, i2);
       this.mInLayout = b;
       this.populate();
       this.mInLayout = i;
       p1 = this.getChildCount();
       while (i < p1) {
          View childAt1 = this.getChildAt(i);
          if (childAt1.getVisibility() != layoutParams) {
             ViewPager$LayoutParams layoutParams1 = childAt1.getLayoutParams();
             if (layoutParams1 == null || layoutParams1.a == null) {
                float f = (float)p0 * layoutParams1.c;
                childAt1.measure(View$MeasureSpec.makeMeasureSpec((int)f, i2), this.mChildHeightMeasureSpec);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       int scrollX;
       int i = 0;
       if (this.mDecorChildCount > null) {
          scrollX = this.getScrollX();
          int paddingLeft = this.getPaddingLeft();
          int paddingRight = this.getPaddingRight();
          int width = this.getWidth();
          int childCount = this.getChildCount();
          int i1 = 0;
          while (i1 < childCount) {
             View childAt = this.getChildAt(i1);
             ViewPager$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.a != null) {
                int i2 = layoutParams.b & 0x07;
                if (i2 != 1) {
                   if (i2 != 3) {
                      if (i2 != 5) {
                         i2 = paddingLeft;
                      }else {
                         i2 = width - paddingRight;
                         i2 = i2 - childAt.getMeasuredWidth();
                         paddingRight = paddingRight + childAt.getMeasuredWidth();
                      label_0059 :
                         i2 = paddingLeft;
                         paddingLeft = i2;
                      }
                   }else {
                      i2 = childAt.getWidth() + paddingLeft;
                   }
                }else {
                   i2 = width - childAt.getMeasuredWidth();
                   i2 = i2 / 2;
                   i2 = Math.max(i2, paddingLeft);
                   goto label_0059 ;
                }
                paddingLeft = paddingLeft + scrollX;
                paddingLeft = paddingLeft - childAt.getLeft();
                if (paddingLeft) {
                   childAt.offsetLeftAndRight(paddingLeft);
                }
                paddingLeft = i2;
             }
             i1 = i1 + 1;
          }
       }
       this.dispatchOnPageScrolled(p0, p1, p2);
       if (this.mPageTransformer != null) {
          p0 = this.getScrollX();
          int childCount1 = this.getChildCount();
          while (i < childCount1) {
             View childAt1 = this.getChildAt(i);
             if (childAt1.getLayoutParams().a == null) {
                scrollX = childAt1.getLeft() - p0;
                float f = (float)scrollX / (float)this.getClientWidth();
                this.mPageTransformer.a(childAt1, f);
             }
             i = i + 1;
          }
       }
       this.mCalledSuper = true;
       return;
    }
    public boolean onRequestFocusInDescendants(int p0,Rect p1){
       int childCount = this.getChildCount();
       int i = p0 & 0x02;
       int i1 = -1;
       if (i) {
          i1 = childCount;
          childCount = 0;
          i = 1;
       }else {
          childCount = childCount - 1;
          i = -1;
       }
       while (true) {
          if (childCount == i1) {
             return false;
          }
          View childAt = this.getChildAt(childCount);
          if (!childAt.getVisibility()) {
             ViewPager$f uof = this.infoForChild(childAt);
             if (uof != null && (uof.b == this.mCurItem && childAt.requestFocus(p0, p1))) {
                break ;
             }
          }
          childCount = childCount + i;
       }
       return true;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof ViewPager$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          ViewPager tmAdapter = this.mAdapter;
          if (tmAdapter != null) {
             tmAdapter.s(p0.e, p0.f);
             this.setCurrentItemInternal(p0.d, false, true);
          }else {
             this.mRestoredCurItem = p0.d;
             this.mRestoredAdapterState = p0.e;
             this.mRestoredClassLoader = p0.f;
          }
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       ViewPager$SavedState savedState = new ViewPager$SavedState(super.onSaveInstanceState());
       savedState.d = this.mCurItem;
       ViewPager tmAdapter = this.mAdapter;
       if (tmAdapter != null) {
          savedState.e = tmAdapter.u();
       }
       return savedState;
    }
    public final void onSecondaryPointerUp(MotionEvent p0){
       int actionIndex = p0.getActionIndex();
       if (p0.getPointerId(actionIndex) == this.mActivePointerId) {
          actionIndex = (!actionIndex)? 1: 0;
          this.mLastMotionX = p0.getX(actionIndex);
          this.mActivePointerId = p0.getPointerId(actionIndex);
          ViewPager tmVelocityTr = this.mVelocityTracker;
          if (tmVelocityTr != null) {
             tmVelocityTr.clear();
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 != p2) {
          this.recomputeScrollPosition(p0, p2, this.mPageMargin, this.mPageMargin);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float x;
       float y;
       float f1;
       if (this.mFakeDragging != null) {
          return true;
       }
       boolean b = false;
       if (!p0.getAction() && p0.getEdgeFlags()) {
          return b;
       }
       ViewPager tmAdapter = this.mAdapter;
       if (tmAdapter == null || !tmAdapter.j()) {
          return b;
       }
       if (this.mVelocityTracker == null) {
          this.mVelocityTracker = VelocityTracker.obtain();
       }
       this.mVelocityTracker.addMovement(p0);
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 0.00f) {
                      if (i == 6) {
                         this.onSecondaryPointerUp(p0);
                         this.mLastMotionX = p0.getX(p0.findPointerIndex(this.mActivePointerId));
                      }
                   }else {
                      i = p0.getActionIndex();
                      this.mLastMotionX = p0.getX(i);
                      this.mActivePointerId = p0.getPointerId(i);
                   }
                }else if(this.mIsBeingDragged != null){
                   this.scrollToItem(this.mCurItem, true, b, b);
                   b = this.resetTouch();
                }
             }else if(this.mIsBeingDragged == null){
                i = p0.findPointerIndex(this.mActivePointerId);
                if (i == -1.#Rf) {
                   b = this.resetTouch();
                }else {
                   x = p0.getX(i);
                   float f = Math.abs((x - this.mLastMotionX));
                   y = p0.getY(i);
                   f1 = Math.abs((y - this.mLastMotionY));
                   if (f - (float)this.mTouchSlop > 0 && f - f1 > 0) {
                      this.mIsBeingDragged = true;
                      this.requestParentDisallowInterceptTouchEvent(true);
                      ViewPager tmInitialMot = this.mInitialMotionX;
                      f = ((x - tmInitialMot) > 0)? tmInitialMot + (float)this.mTouchSlop: tmInitialMot - (float)this.mTouchSlop;
                      this.mLastMotionX = f;
                      this.mLastMotionY = y;
                      this.setScrollState(true);
                      this.setScrollingCacheEnabled(true);
                      ViewParent parent = this.getParent();
                      if (parent != null) {
                         parent.requestDisallowInterceptTouchEvent(true);
                      }
                   }
                }
             }
             if (this.mIsBeingDragged != null) {
                b = b | this.performDrag(p0.getX(p0.findPointerIndex(this.mActivePointerId)));
             }
          }else if(this.mIsBeingDragged != null){
             tmAdapter = this.mVelocityTracker;
             tmAdapter.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
             i = (int)tmAdapter.getXVelocity(this.mActivePointerId);
             this.mPopulatePending = true;
             ViewPager$f uof = this.infoForCurrentScrollPosition();
             float f2 = (float)this.getClientWidth();
             f1 = (float)this.mPageMargin / f2;
             x = (float)this.getScrollX() / f2;
             this.setCurrentItemInternal(this.determineTargetPage(uof.b, ((x - uof.e) / (uof.d + f1)), i, (int)(p0.getX(p0.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, i);
             b = this.resetTouch();
          }
       }else {
          this.mScroller.abortAnimation();
          this.mPopulatePending = b;
          this.populate();
          y = p0.getX();
          this.mInitialMotionX = y;
          this.mLastMotionX = y;
          y = p0.getY();
          this.mInitialMotionY = y;
          this.mLastMotionY = y;
          this.mActivePointerId = p0.getPointerId(b);
       }
       if (b) {
          i0.j0(this);
       }
       return true;
    }
    public boolean pageLeft(){
       ViewPager tmCurItem = this.mCurItem;
       if (tmCurItem <= null) {
          return false;
       }
       this.setCurrentItem((tmCurItem - 1), 1);
       return 1;
    }
    public boolean pageRight(){
       ViewPager tmAdapter = this.mAdapter;
       if (tmAdapter == null || this.mCurItem >= (tmAdapter.j() - 1)) {
          return false;
       }
       this.setCurrentItem((this.mCurItem + 1), 1);
       return 1;
    }
    public final boolean pageScrolled(int p0){
       if (!this.mItems.size()) {
          if (this.mFirstLayout != null) {
             return false;
          }
          this.mCalledSuper = false;
          this.onPageScrolled(false, 0, false);
          if (this.mCalledSuper != null) {
             return false;
          }
          throw new IllegalStateException("onPageScrolled did not call superclass implementation");
       }else {
          ViewPager$f uof = this.infoForCurrentScrollPosition();
          int clientWidth = this.getClientWidth();
          ViewPager tmPageMargin = this.mPageMargin;
          int i = clientWidth + tmPageMargin;
          float f = (float)clientWidth;
          float f1 = (float)tmPageMargin / f;
          float f2 = (float)p0 / f;
          f2 = (f2 - uof.e) / (uof.d + f1);
          this.mCalledSuper = false;
          this.onPageScrolled(uof.b, f2, (int)((float)i * f2));
          if (this.mCalledSuper != null) {
             return true;
          }
          throw new IllegalStateException("onPageScrolled did not call superclass implementation");
       }
    }
    public final boolean performDrag(float p0){
       this.mLastMotionX = p0;
       p0 = (float)this.getScrollX() + (this.mLastMotionX - p0);
       float f = (float)this.getClientWidth();
       float f1 = this.mFirstOffset * f;
       float f2 = this.mLastOffset * f;
       int i = 0;
       ViewPager$f uof = this.mItems.get(i);
       ViewPager tmItems = this.mItems;
       ViewPager$f uof1 = tmItems.get((tmItems.size() - 1));
       if (uof.b != null) {
          f1 = uof.e * f;
          uof = 0;
       }else {
          uof = 1;
       }
       if (uof1.b != (this.mAdapter.j() - 1)) {
          f2 = uof1.e * f;
          uof1 = 0;
       }else {
          uof1 = 1;
       }
       if (p0 - f1 < 0) {
          if (uof) {
             this.mLeftEdge.onPull((Math.abs((f1 - p0)) / f));
             i = true;
          }
          p0 = f1;
       }else if(p0 - f2 > 0){
          if (uof1) {
             this.mRightEdge.onPull((Math.abs((p0 - f2)) / f));
             i = true;
          }
          p0 = f2;
       }
       int i1 = (int)p0;
       this.mLastMotionX = this.mLastMotionX + (p0 - (float)i1);
       this.scrollTo(i1, this.getScrollY());
       this.pageScrolled(i1);
       return i;
    }
    public void populate(){
       this.populate(this.mCurItem);
    }
    public void populate(int p0){
       ViewPager$f uof;
       ViewPager$f uof1;
       ViewPager$f d;
       ViewPager$f uof3;
       int i9;
       float f1;
       String resourceName;
       ViewPager viewPager = this;
       int i = p0;
       ViewPager mCurItem = viewPager.mCurItem;
       if (mCurItem != i) {
          uof = viewPager.infoForPosition(mCurItem);
          viewPager.mCurItem = i;
       }else {
          uof = null;
       }
       if (viewPager.mAdapter == null) {
          this.sortChildDrawingOrder();
          return;
       }else if(viewPager.mPopulatePending != null){
          this.sortChildDrawingOrder();
          return;
       }else if(this.getWindowToken() == null){
          return;
       }else {
          viewPager.mAdapter.x(viewPager);
          ViewPager mOffscreenPa = viewPager.mOffscreenPageLimit;
          int i1 = Math.max(0, (viewPager.mCurItem - mOffscreenPa));
          int i2 = viewPager.mAdapter.j();
          i = Math.min((i2 - 1), (viewPager.mCurItem + mOffscreenPa));
          if (i2 == viewPager.mExpectedAdapterCount) {
             int i3 = 0;
             while (true) {
                if (i3 < viewPager.mItems.size()) {
                   uof1 = viewPager.mItems.get(i3);
                   ViewPager$f b = uof1.b;
                   ViewPager mCurItem1 = viewPager.mCurItem;
                   if (b >= mCurItem1) {
                      if (b == mCurItem1) {
                         break ;
                      }else {
                      label_0066 :
                         uof1 = null;
                         break ;
                      }
                   }else {
                      i3 = i3 + 1;
                   }
                }else {
                   goto label_0066 ;
                }
             }
             if (uof1 == null && i2 > 0) {
                uof1 = viewPager.addNewItem(viewPager.mCurItem, i3);
             }
             if (uof1 != null) {
                int i4 = i3 - 1;
                ViewPager$f uof2 = (i4 >= 0)? viewPager.mItems.get(i4): null;
                int clientWidth = this.getClientWidth();
                int i5 = (clientWidth <= 0)? 0: (2.00f - uof1.d) + ((float)this.getPaddingLeft() / (float)clientWidth);
                int i6 = viewPager.mCurItem - 1;
                float f = 0;
                while (i6 >= 0) {
                   if (f - i5 >= 0 && i6 < i1) {
                      if (uof2 == null) {
                         break ;
                      }else if(i6 == uof2.b && uof2.c == null){
                         viewPager.mItems.remove(i4);
                         viewPager.mAdapter.h(viewPager, i6, uof2.a);
                         i4 = i4 - 1;
                         i3 = i3 - 1;
                         if (i4 >= 0) {
                            uof3 = viewPager.mItems.get(i4);
                         }else {
                         label_00f7 :
                            i9 = 0;
                         }
                      }
                   }else if(uof2 != null && i6 == uof2.b){
                      f = f + uof2.d;
                      i4 = i4 - 1;
                      if (i4 >= 0) {
                         uof3 = viewPager.mItems.get(i4);
                      }else {
                         goto label_00f7 ;
                      }
                   }else {
                      i9 = i4 + 1;
                      f = f + viewPager.addNewItem(i6, i9).d;
                      i3 = i3 + 1;
                      if (i4 >= 0) {
                         uof3 = viewPager.mItems.get(i4);
                      }else {
                         goto label_00f7 ;
                      }
                   }
                   uof2 = uof3;
                label_00f9 :
                   i6 = i6 - 1;
                   uof3 = null;
                }
                d = uof1.d;
                i1 = i3 + 1;
                if (d - 2.00f < 0) {
                   uof3 = (i1 < viewPager.mItems.size())? viewPager.mItems.get(i1): null;
                   i4 = (clientWidth <= 0)? 0: ((float)this.getPaddingRight() / (float)clientWidth) + 2.00f;
                   ViewPager mCurItem2 = viewPager.mCurItem;
                   int i7 = mCurItem2 + 1;
                   while (i7 < i2) {
                      if (d - i4 >= 0 && i7 > i) {
                         if (uof3 != null) {
                            if (i7 == uof3.b && uof3.c == null) {
                               viewPager.mItems.remove(i1);
                               viewPager.mAdapter.h(viewPager, i7, uof3.a);
                               if (i1 < viewPager.mItems.size()) {
                                  uof3 = viewPager.mItems.get(i1);
                               }
                            }
                         }
                      }else if(uof3 != null && i7 == uof3.b){
                         d = d + uof3.d;
                         i1 = i1 + 1;
                         if (i1 < viewPager.mItems.size()) {
                            uof3 = viewPager.mItems.get(i1);
                         }
                      }else {
                         i1 = i1 + 1;
                         d = d + viewPager.addNewItem(i7, i1).d;
                         if (i1 < viewPager.mItems.size()) {
                            uof3 = viewPager.mItems.get(i1);
                         }
                      }
                      uof3 = null;
                   }
                }
                viewPager.calculatePageOffsets(uof1, i3, uof);
                viewPager.mAdapter.v(viewPager, viewPager.mCurItem, uof1.a);
             }
             viewPager.mAdapter.i(viewPager);
             i = this.getChildCount();
             int i8 = 0;
             while (i8 < i) {
                View childAt = viewPager.getChildAt(i8);
                ViewPager$LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.f = i8;
                if (layoutParams.a == null && !layoutParams.c) {
                   d = viewPager.infoForChild(childAt);
                   if (d != null) {
                      layoutParams.c = d.d;
                      layoutParams.e = d.b;
                   }
                }
                i8 = i8 + 1;
             }
             this.sortChildDrawingOrder();
             if (this.hasFocus()) {
                View view = this.findFocus();
                d = (view != null)? viewPager.infoForAnyChild(view): null;
                if (d == null || d.b != viewPager.mCurItem) {
                   i9 = 0;
                   while (i9 < this.getChildCount()) {
                      view = viewPager.getChildAt(i9);
                      uof = viewPager.infoForChild(view);
                      if (uof == null || (uof.b != viewPager.mCurItem || !view.requestFocus(2))) {
                         i9 = i9 + 1;
                      }
                   }
                }
             }
             return;
          }else {
             try{
                resourceName = this.getResources().getResourceName(this.getId());
             }catch(android.content.res.Resources$NotFoundException e0){
                resourceName = Integer.toHexString(this.getId());
             }
             throw new IllegalStateException("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "+e0.mExpectedAdapterCount+", found: "+i2+" Pager id: "+resourceName+" Pager class: "+this.getClass()+" Problematic adapter: "+e0.mAdapter.getClass());
          }
       }
    }
    public final void recomputeScrollPosition(int p0,int p1,int p2,int p3){
       if (p1 > 0 && !this.mItems.isEmpty()) {
          if (!this.mScroller.isFinished()) {
             this.mScroller.setFinalX((this.getCurrentItem() * this.getClientWidth()));
          }else {
             this.scrollTo((int)(((float)this.getScrollX() / (float)(((p1 - this.getPaddingLeft()) - this.getPaddingRight()) + p3)) * (float)(((p0 - this.getPaddingLeft()) - this.getPaddingRight()) + p2)), this.getScrollY());
          }
       }else {
          ViewPager$f uof = this.infoForPosition(this.mCurItem);
          float f = (uof != null)? Math.min(uof.e, this.mLastOffset): 0;
          p0 = (int)(f * (float)((p0 - this.getPaddingLeft()) - this.getPaddingRight()));
          if (p0 != this.getScrollX()) {
             this.completeScroll(false);
             this.scrollTo(p0, this.getScrollY());
          }
       }
       return;
    }
    public final void removeNonDecorViews(){
       int i = 0;
       while (i < this.getChildCount()) {
          if (this.getChildAt(i).getLayoutParams().a == null) {
             this.removeViewAt(i);
             i = i - 1;
          }
          i = i + 1;
       }
       return;
    }
    public void removeOnAdapterChangeListener(ViewPager$h p0){
       ViewPager tmAdapterCha = this.mAdapterChangeListeners;
       if (tmAdapterCha != null) {
          tmAdapterCha.remove(p0);
       }
       return;
    }
    public void removeOnPageChangeListener(ViewPager$i p0){
       ViewPager tmOnPageChan = this.mOnPageChangeListeners;
       if (tmOnPageChan != null) {
          tmOnPageChan.remove(p0);
       }
       return;
    }
    public void removeView(View p0){
       if (this.mInLayout != null) {
          this.removeViewInLayout(p0);
       }else {
          super.removeView(p0);
       }
       return;
    }
    public final void requestParentDisallowInterceptTouchEvent(boolean p0){
       ViewParent parent = this.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final boolean resetTouch(){
       this.mActivePointerId = -1;
       this.endDrag();
       this.mLeftEdge.onRelease();
       this.mRightEdge.onRelease();
       boolean b = (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished())? true: false;
       return b;
    }
    public final void scrollToItem(int p0,boolean p1,int p2,boolean p3){
       ViewPager$f uof = this.infoForPosition(p0);
       int i = (uof != null)? (int)((float)this.getClientWidth() * Math.max(this.mFirstOffset, Math.min(uof.e, this.mLastOffset))): 0;
       if (p1) {
          this.smoothScrollTo(i, 0, p2);
          if (p3) {
             this.dispatchOnPageSelected(p0);
          }
       }else if(p3){
          this.dispatchOnPageSelected(p0);
       }
       this.completeScroll(0);
       this.scrollTo(i, 0);
       this.pageScrolled(i);
       return;
    }
    public void setAdapter(a p0){
       ViewPager tmAdapter = this.mAdapter;
       DataSetObserver uDataSetObse = null;
       int i = 0;
       if (tmAdapter != null) {
          tmAdapter.w(uDataSetObse);
          this.mAdapter.x(this);
          for (int i1 = 0; i1 < this.mItems.size(); i1 = i1 + 1) {
             ViewPager$f uof = this.mItems.get(i1);
             this.mAdapter.h(this, uof.b, uof.a);
          }
          this.mAdapter.i(this);
          this.mItems.clear();
          this.removeNonDecorViews();
          this.mCurItem = i;
          this.scrollTo(i, i);
       }
       tmAdapter = this.mAdapter;
       this.mAdapter = p0;
       this.mExpectedAdapterCount = i;
       if (p0 != null) {
          if (this.mObserver == null) {
             this.mObserver = new ViewPager$k(this);
          }
          this.mAdapter.w(this.mObserver);
          this.mPopulatePending = i;
          ViewPager tmFirstLayou = this.mFirstLayout;
          this.mFirstLayout = true;
          this.mExpectedAdapterCount = this.mAdapter.j();
          if (this.mRestoredCurItem >= null) {
             this.mAdapter.s(this.mRestoredAdapterState, this.mRestoredClassLoader);
             this.setCurrentItemInternal(this.mRestoredCurItem, i, true);
             this.mRestoredCurItem = -1;
             this.mRestoredAdapterState = uDataSetObse;
             this.mRestoredClassLoader = uDataSetObse;
          }else if(tmFirstLayou == null){
             this.populate();
          }else {
             this.requestLayout();
          }
       }
       ViewPager tmAdapterCha = this.mAdapterChangeListeners;
       if (tmAdapterCha != null && !tmAdapterCha.isEmpty()) {
          int i2 = this.mAdapterChangeListeners.size();
          for (; i < i2; i = i + 1) {
             this.mAdapterChangeListeners.get(i).a(this, tmAdapter, p0);
          }
       }
       return;
    }
    public void setCurrentItem(int p0){
       this.mPopulatePending = false;
       this.setCurrentItemInternal(p0, (this.mFirstLayout ^ 0x01), false);
    }
    public void setCurrentItem(int p0,boolean p1){
       this.mPopulatePending = false;
       this.setCurrentItemInternal(p0, p1, false);
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2){
       this.setCurrentItemInternal(p0, p1, p2, 0);
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2,int p3){
       ViewPager tmAdapter = this.mAdapter;
       boolean b = false;
       if (tmAdapter == null || tmAdapter.j() <= 0) {
          this.setScrollingCacheEnabled(b);
          return;
       }else if(!p2 && (this.mCurItem == p0 && this.mItems.size())){
          this.setScrollingCacheEnabled(b);
          return;
       }else {
          p2 = true;
          if (p0 < 0) {
             p0 = 0;
          }else if(p0 >= this.mAdapter.j()){
             p0 = this.mAdapter.j() - p2;
          }
          tmAdapter = this.mOffscreenPageLimit;
          ViewPager tmCurItem = this.mCurItem;
          if (p0 > (tmCurItem + tmAdapter) || p0 < (tmCurItem - tmAdapter)) {
             for (int i = 0; i < this.mItems.size(); i = i + 1) {
                this.mItems.get(i).c = p2;
             }
          }
          if (this.mCurItem != p0) {
             b = true;
          }
          if (this.mFirstLayout != null) {
             this.mCurItem = p0;
             if (b) {
                this.dispatchOnPageSelected(p0);
             }
             this.requestLayout();
          }else {
             this.populate(p0);
             this.scrollToItem(p0, p1, p3, b);
          }
          return;
       }
    }
    public ViewPager$i setInternalPageChangeListener(ViewPager$i p0){
       ViewPager tmInternalPa = this.mInternalPageChangeListener;
       this.mInternalPageChangeListener = p0;
       return tmInternalPa;
    }
    public void setOffscreenPageLimit(int p0){
       if (p0 < 1) {
          p0 = 1;
       }
       if (p0 != this.mOffscreenPageLimit) {
          this.mOffscreenPageLimit = p0;
          this.populate();
       }
       return;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.mOnPageChangeListener = p0;
    }
    public void setPageMargin(int p0){
       ViewPager tmPageMargin = this.mPageMargin;
       this.mPageMargin = p0;
       this.recomputeScrollPosition(this.getWidth(), this.getWidth(), p0, tmPageMargin);
       this.requestLayout();
    }
    public void setPageMarginDrawable(int p0){
       this.setPageMarginDrawable(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setPageMarginDrawable(Drawable p0){
       this.mMarginDrawable = p0;
       if (p0 != null) {
          this.refreshDrawableState();
       }
       boolean b = (p0 == null)? true: false;
       this.setWillNotDraw(b);
       this.invalidate();
       return;
    }
    public void setPageTransformer(boolean p0,ViewPager$j p1){
       this.setPageTransformer(p0, p1, 2);
    }
    public void setPageTransformer(boolean p0,ViewPager$j p1,int p2){
       int i = 1;
       boolean b = (p1 != null)? true: false;
       int i1 = (this.mPageTransformer != null)? 1: 0;
       i1 = (b != i1)? 1: 0;
       this.mPageTransformer = p1;
       this.setChildrenDrawingOrderEnabled(b);
       if (b) {
          if (p0) {
             i = 2;
          }
          this.mDrawingOrder = i;
          this.mPageTransformerLayerType = p2;
       }else {
          this.mDrawingOrder = 0;
       }
       if (i1) {
          this.populate();
       }
       return;
    }
    public void setScrollState(int p0){
       if (this.mScrollState == p0) {
          return;
       }
       this.mScrollState = p0;
       if (this.mPageTransformer != null) {
          boolean b = (p0)? true: false;
          this.enableLayers(b);
       }
       this.dispatchOnScrollStateChanged(p0);
       return;
    }
    public final void setScrollingCacheEnabled(boolean p0){
       if (this.mScrollingCacheEnabled != p0) {
          this.mScrollingCacheEnabled = p0;
       }
       return;
    }
    public void smoothScrollTo(int p0,int p1){
       this.smoothScrollTo(p0, p1, 0);
    }
    public void smoothScrollTo(int p0,int p1,int p2){
       int currX;
       if (!this.getChildCount()) {
          this.setScrollingCacheEnabled(false);
          return;
       }else {
          ViewPager tmScroller = this.mScroller;
          boolean b = true;
          tmScroller = (tmScroller != null && !tmScroller.isFinished())? 1: null;
          if (tmScroller) {
             currX = (this.mIsScrollStarted != null)? this.mScroller.getCurrX(): this.mScroller.getStartX();
             this.mScroller.abortAnimation();
             this.setScrollingCacheEnabled(false);
          }else {
             currX = this.getScrollX();
          }
          int i = currX;
          int scrollY = this.getScrollY();
          int i1 = p0 - i;
          int i2 = p1 - scrollY;
          if (!i1 && !i2) {
             this.completeScroll(false);
             this.populate();
             this.setScrollState(false);
             return;
          }else {
             this.setScrollingCacheEnabled(b);
             this.setScrollState(2);
             p0 = this.getClientWidth();
             p1 = p0 / 2;
             float f = (float)p0;
             float f1 = (float)p1;
             f1 = f1 + (this.distanceInfluenceForSnapDuration(Math.min(0x3f800000, (((float)Math.abs(i1) * 0x3f800000) / f))) * f1);
             p2 = Math.abs(p2);
             f = (p2 > 0)? Math.round((Math.abs((f1 / (float)p2)) * 1000.00f)) * 4: (int)((((float)Math.abs(i1) / ((f * this.mAdapter.m(this.mCurItem)) + (float)this.mPageMargin)) + 0x3f800000) * 100.00f);
             this.mIsScrollStarted = false;
             this.mScroller.startScroll(i, scrollY, i1, i2, Math.min(f, 600));
             i0.j0(this);
             return;
          }
       }
    }
    public final void sortChildDrawingOrder(){
       if (this.mDrawingOrder != null) {
          ViewPager tmDrawingOrd = this.mDrawingOrderedChildren;
          if (tmDrawingOrd == null) {
             this.mDrawingOrderedChildren = new ArrayList();
          }else {
             tmDrawingOrd.clear();
          }
          int childCount = this.getChildCount();
          for (int i = 0; i < childCount; i = i + 1) {
             this.mDrawingOrderedChildren.add(this.getChildAt(i));
          }
          Collections.sort(this.mDrawingOrderedChildren, ViewPager.sPositionComparator);
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (super.verifyDrawable(p0) || p0 == this.mMarginDrawable)? true: false;
       return b;
    }
}
