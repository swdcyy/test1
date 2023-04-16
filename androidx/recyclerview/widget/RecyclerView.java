package androidx.recyclerview.widget.RecyclerView;
import a2.f0;
import a2.r;
import a2.s;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$c;
import androidx.recyclerview.widget.RecyclerView$v;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.ViewInfoStore;
import androidx.recyclerview.widget.RecyclerView$a;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$k;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView$b;
import androidx.recyclerview.widget.RecyclerView$d;
import android.view.ViewConfiguration;
import a2.j0;
import androidx.recyclerview.widget.RecyclerView$l$b;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.View;
import a2.i0;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.v;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.ref.WeakReference;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a2.u;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$u;
import z1.h;
import androidx.recyclerview.widget.RecyclerView$l$c;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.a;
import w1.k;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import java.lang.Throwable;
import java.lang.NoSuchMethodException;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.accessibility.AccessibilityEvent;
import b2.b;
import androidx.recyclerview.widget.RecyclerView$SavedState;
import android.os.Parcelable;
import androidx.recyclerview.widget.ViewInfoStore$a;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.widget.OverScroller;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$p;
import android.view.FocusFinder;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView$j;
import java.lang.IllegalArgumentException;
import java.lang.Package;
import java.lang.IndexOutOfBoundsException;
import java.lang.System;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.a$a;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.ChildHelper$a;
import android.content.res.Resources;
import androidx.recyclerview.widget.j;
import cw9.c;
import androidx.recyclerview.widget.k;
import java.lang.ThreadLocal;
import android.view.Display;
import java.lang.Runnable;
import android.view.VelocityTracker;
import android.view.View$MeasureSpec;
import androidx.customview.view.AbsSavedState;
import e2.c;
import a2.q;
import a2.a;
import androidx.recyclerview.widget.RecyclerView$i;
import android.animation.LayoutTransition;
import androidx.recyclerview.widget.RecyclerView$z;
import android.view.animation.Interpolator;
import android.os.SystemClock;

public class RecyclerView extends ViewGroup implements f0, r, s	// class@0008a8
{
    public v mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public RecyclerView$Adapter mAdapter;
    public a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public RecyclerView$j mChildDrawingOrderCallback;
    public ChildHelper mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public RecyclerView$k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public k mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public RecyclerView$q mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public RecyclerView$l mItemAnimator;
    public RecyclerView$l$b mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public RecyclerView$LayoutManager mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final RecyclerView$v mObserver;
    public List mOnChildAttachStateListeners;
    public RecyclerView$p mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final List mPendingAccessibilityImportanceChange;
    public RecyclerView$SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public k$b mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final RecyclerView$t mRecycler;
    public RecyclerView$u mRecyclerListener;
    public final List mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public RecyclerView$r mScrollListener;
    public List mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public u mScrollingChildHelper;
    public final RecyclerView$y mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RecyclerView$ViewFlinger mViewFlinger;
    public final ViewInfoStore$a mViewInfoProcessCallback;
    public final ViewInfoStore mViewInfoStore;
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    public static final boolean ALLOW_THREAD_GAP_WORK = false;
    public static final boolean DEBUG;
    public static final int DEFAULT_ORIENTATION;
    public static final boolean DISPATCH_TEMP_DETACH;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS;
    public static final int HORIZONTAL;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    public static final int INVALID_POINTER;
    public static final int INVALID_TYPE;
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION;
    public static final int[] NESTED_SCROLLING_ATTRS;
    public static final long NO_ID;
    public static final int NO_POSITION;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING;
    public static final int SCROLL_STATE_IDLE;
    public static final int SCROLL_STATE_SETTLING;
    public static final String TAG;
    public static final int TOUCH_SLOP_DEFAULT;
    public static final int TOUCH_SLOP_PAGING;
    public static final String TRACE_BIND_VIEW_TAG;
    public static final String TRACE_CREATE_VIEW_TAG;
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG;
    public static final String TRACE_NESTED_PREFETCH_TAG;
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG;
    public static final String TRACE_ON_LAYOUT_TAG;
    public static final String TRACE_PREFETCH_TAG;
    public static final String TRACE_SCROLL_TAG;
    public static final int UNDEFINED_DURATION;
    public static final boolean VERBOSE_TRACING;
    public static final int VERTICAL;
    public static final Interpolator sQuinticInterpolator;

    static {
       Class tYPE;
       int i = 1;
       int[] ointArray = new int[i];
       ointArray[0] = 0x1010436;
       RecyclerView.NESTED_SCROLLING_ATTRS = ointArray;
       RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = false;
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = b;
       RecyclerView.POST_UPDATES_ON_ANIMATION = i;
       RecyclerView.ALLOW_THREAD_GAP_WORK = i;
       RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
       RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = false;
       Class[] uClassArray = new Class[]{Context.class,AttributeSet.class,tYPE,tYPE};
       tYPE = Integer.TYPE;
       RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = uClassArray;
       RecyclerView.sQuinticInterpolator = new RecyclerView$c();
    }
    public void RecyclerView(Context p0){
       super(p0, null);
    }
    public void RecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040752);
    }
    public void RecyclerView(Context p0,AttributeSet p1,int p2){
       RecyclerView recyclerView = this;
       Context uContext = p0;
       AttributeSet uAttributeSe = p1;
       int i = p2;
       super(p0, p1, p2);
       recyclerView.mObserver = new RecyclerView$v(recyclerView);
       recyclerView.mRecycler = new RecyclerView$t(recyclerView);
       recyclerView.mViewInfoStore = new ViewInfoStore();
       recyclerView.mUpdateChildViewsRunnable = new RecyclerView$a(recyclerView);
       recyclerView.mTempRect = new Rect();
       recyclerView.mTempRect2 = new Rect();
       recyclerView.mTempRectF = new RectF();
       recyclerView.mRecyclerListeners = new ArrayList();
       recyclerView.mItemDecorations = new ArrayList();
       recyclerView.mOnItemTouchListeners = new ArrayList();
       recyclerView.mInterceptRequestLayoutDepth = 0;
       recyclerView.mDataSetHasChangedAfterLayout = false;
       recyclerView.mDispatchItemsChangedEvent = false;
       recyclerView.mLayoutOrScrollCounter = 0;
       recyclerView.mDispatchScrollCounter = 0;
       recyclerView.mEdgeEffectFactory = new RecyclerView$k();
       recyclerView.mItemAnimator = new g();
       recyclerView.mScrollState = 0;
       int i1 = -1;
       recyclerView.mScrollPointerId = i1;
       recyclerView.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
       recyclerView.mScaledVerticalScrollFactor = Float.MIN_VALUE;
       recyclerView.mPreserveFocusAfterLayout = true;
       recyclerView.mViewFlinger = new RecyclerView$ViewFlinger(recyclerView);
       k$b uob = (RecyclerView.ALLOW_THREAD_GAP_WORK)? new k$b(): null;
       recyclerView.mPrefetchRegistry = uob;
       recyclerView.mState = new RecyclerView$y();
       recyclerView.mItemsAddedOrRemoved = false;
       recyclerView.mItemsChanged = false;
       recyclerView.mItemAnimatorListener = new RecyclerView$m(recyclerView);
       recyclerView.mPostedAnimatorRunner = false;
       int[] ointArray = new int[2];
       recyclerView.mMinMaxLayoutPositions = ointArray;
       ointArray = new int[2];
       recyclerView.mScrollOffset = ointArray;
       ointArray = new int[2];
       recyclerView.mNestedOffsets = ointArray;
       ointArray = new int[2];
       recyclerView.mReusableIntPair = ointArray;
       recyclerView.mPendingAccessibilityImportanceChange = new ArrayList();
       recyclerView.mItemAnimatorRunner = new RecyclerView$b(recyclerView);
       recyclerView.mLastAutoMeasureNonExactMeasuredWidth = 0;
       recyclerView.mLastAutoMeasureNonExactMeasuredHeight = 0;
       recyclerView.mViewInfoProcessCallback = new RecyclerView$d(recyclerView);
       recyclerView.setScrollContainer(true);
       recyclerView.setFocusableInTouchMode(true);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       recyclerView.mTouchSlop = viewConfigur.getScaledTouchSlop();
       recyclerView.mScaledHorizontalScrollFactor = j0.b(viewConfigur, uContext);
       recyclerView.mScaledVerticalScrollFactor = j0.e(viewConfigur, uContext);
       recyclerView.mMinFlingVelocity = viewConfigur.getScaledMinimumFlingVelocity();
       recyclerView.mMaxFlingVelocity = viewConfigur.getScaledMaximumFlingVelocity();
       boolean b = (this.getOverScrollMode() == 2)? true: false;
       recyclerView.setWillNotDraw(b);
       recyclerView.mItemAnimator.y(recyclerView.mItemAnimatorListener);
       this.initAdapterManager();
       this.initChildrenHelper();
       this.initAutofill();
       if (!i0.z(this)) {
          i0.D0(recyclerView, true);
       }
       recyclerView.mAccessibilityManager = this.getContext().getSystemService("accessibility");
       recyclerView.setAccessibilityDelegateCompat(new v(recyclerView));
       int[] a4 = c$b.A4;
       TypedArray typedArray = uContext.obtainStyledAttributes(uAttributeSe, a4, i, 0);
       i0.q0(this, p0, a4, p1, typedArray, p2, 0);
       String str = typedArray.getString(8);
       if (typedArray.getInt(2, i1) == i1) {
          recyclerView.setDescendantFocusability(0x40000);
       }
       recyclerView.mClipToPadding = typedArray.getBoolean(true, true);
       b = typedArray.getBoolean(3, 0);
       recyclerView.mEnableFastScroller = b;
       if (b) {
          recyclerView.initFastScroller(typedArray.getDrawable(6), typedArray.getDrawable(7), typedArray.getDrawable(4), typedArray.getDrawable(5));
       }
       typedArray.recycle();
       this.createLayoutManager(p0, str, p1, p2, 0);
       a4 = RecyclerView.NESTED_SCROLLING_ATTRS;
       TypedArray typedArray1 = uContext.obtainStyledAttributes(uAttributeSe, a4, i, 0);
       i0.q0(this, p0, a4, p1, typedArray1, p2, 0);
       typedArray1.recycle();
       recyclerView.setNestedScrollingEnabled(typedArray1.getBoolean(0, true));
       return;
    }
    public static void access$000(RecyclerView p0,View p1,int p2,ViewGroup$LayoutParams p3){
       p0.attachViewToParent(p1, p2, p3);
    }
    public static void access$100(RecyclerView p0,int p1){
       p0.detachViewFromParent(p1);
    }
    public static boolean access$200(RecyclerView p0){
       return p0.awakenScrollBars();
    }
    public static void access$300(RecyclerView p0,int p1,int p2){
       p0.setMeasuredDimension(p1, p2);
    }
    public static void clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder p0){
       RecyclerView$ViewHolder mNestedRecyc = p0.mNestedRecyclerView;
       if (mNestedRecyc != null) {
          View view = mNestedRecyc.get();
          while (true) {
             if (view != null) {
                if (view == p0.itemView) {
                   return;
                }else {
                   view = view.getParent();
                   if (view instanceof View) {
                   }else {
                      view = null;
                   }
                }
             }else {
                p0.mNestedRecyclerView = null;
                break ;
             }
          }
       }
       return;
    }
    public static RecyclerView findNestedRecyclerView(View p0){
       RecyclerView recyclerView;
       if (!p0 instanceof ViewGroup) {
          return null;
       }
       if (p0 instanceof RecyclerView) {
          return p0;
       }
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          recyclerView = RecyclerView.findNestedRecyclerView(p0.getChildAt(i));
          if (recyclerView != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return recyclerView;
    }
    public static RecyclerView$ViewHolder getChildViewHolderInt(View p0){
       if (p0 == null) {
          return null;
       }
       return p0.getLayoutParams().mViewHolder;
    }
    public static void getDecoratedBoundsWithMarginsInt(View p0,Rect p1){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
       p1.set(((p0.getLeft() - mDecorInsets.left) - layoutParams.leftMargin), ((p0.getTop() - mDecorInsets.top) - layoutParams.topMargin), ((p0.getRight() + mDecorInsets.right) + layoutParams.rightMargin), ((p0.getBottom() + mDecorInsets.bottom) + layoutParams.bottomMargin));
    }
    private u getScrollingChildHelper(){
       if (this.mScrollingChildHelper == null) {
          this.mScrollingChildHelper = new u(this);
       }
       return this.mScrollingChildHelper;
    }
    public void absorbGlows(int p0,int p1){
       if (p0 < 0) {
          this.ensureLeftGlow();
          if (this.mLeftGlow.isFinished()) {
             this.mLeftGlow.onAbsorb((- p0));
          }
       }else if(p0 > 0){
          this.ensureRightGlow();
          if (this.mRightGlow.isFinished()) {
             this.mRightGlow.onAbsorb(p0);
          }
       }
       if (p1 < 0) {
          this.ensureTopGlow();
          if (this.mTopGlow.isFinished()) {
             this.mTopGlow.onAbsorb((- p1));
          }
       }else if(p1 > 0){
          this.ensureBottomGlow();
          if (this.mBottomGlow.isFinished()) {
             this.mBottomGlow.onAbsorb(p1);
          }
       }
       if (p0 || p1) {
          i0.j0(this);
       }
       return;
    }
    public final void addAnimatingView(RecyclerView$ViewHolder p0){
       RecyclerView$ViewHolder itemView = p0.itemView;
       int i = (itemView.getParent() == this)? 1: 0;
       this.mRecycler.J(this.getChildViewHolder(itemView));
       if (p0.isTmpDetached()) {
          this.mChildHelper.attachViewToParent(itemView, -1, itemView.getLayoutParams(), true);
       }else if(!i){
          this.mChildHelper.addView(itemView, true);
       }else {
          this.mChildHelper.hide(itemView);
       }
       return;
    }
    public void addFocusables(ArrayList p0,int p1,int p2){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null || !tmLayout.onAddFocusables(this, p0, p1, p2)) {
          super.addFocusables(p0, p1, p2);
       }
       return;
    }
    public void addItemDecoration(RecyclerView$n p0){
       this.addItemDecoration(p0, -1);
    }
    public void addItemDecoration(RecyclerView$n p0,int p1){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
       }
       if (this.mItemDecorations.isEmpty()) {
          this.setWillNotDraw(false);
       }
       if (p1 < 0) {
          this.mItemDecorations.add(p0);
       }else {
          this.mItemDecorations.add(p1, p0);
       }
       this.markItemDecorInsetsDirty();
       this.requestLayout();
       return;
    }
    public void addOnChildAttachStateChangeListener(RecyclerView$o p0){
       if (this.mOnChildAttachStateListeners == null) {
          this.mOnChildAttachStateListeners = new ArrayList();
       }
       this.mOnChildAttachStateListeners.add(p0);
       return;
    }
    public void addOnItemTouchListener(RecyclerView$q p0){
       this.mOnItemTouchListeners.add(p0);
    }
    public void addOnScrollListener(RecyclerView$r p0){
       if (this.mScrollListeners == null) {
          this.mScrollListeners = new ArrayList();
       }
       this.mScrollListeners.add(p0);
       return;
    }
    public void addRecyclerListener(RecyclerView$u p0){
       boolean b = (p0 != null)? true: false;
       h.b(b, "\'listener\' arg cannot be null.");
       this.mRecyclerListeners.add(p0);
       return;
    }
    public void animateAppearance(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       p0.setIsRecyclable(false);
       if (this.mItemAnimator.a(p0, p1, p2)) {
          this.postAnimationRunner();
       }
       return;
    }
    public final void animateChange(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,RecyclerView$l$c p2,RecyclerView$l$c p3,boolean p4,boolean p5){
       p0.setIsRecyclable(false);
       if (p4) {
          this.addAnimatingView(p0);
       }
       if (p0 != p1) {
          if (p5) {
             this.addAnimatingView(p1);
          }
          p0.mShadowedHolder = p1;
          this.addAnimatingView(p0);
          this.mRecycler.J(p0);
          p1.setIsRecyclable(false);
          p1.mShadowingHolder = p0;
       }
       if (this.mItemAnimator.b(p0, p1, p2, p3)) {
          this.postAnimationRunner();
       }
       return;
    }
    public void animateDisappearance(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       this.addAnimatingView(p0);
       p0.setIsRecyclable(false);
       if (this.mItemAnimator.c(p0, p1, p2)) {
          this.postAnimationRunner();
       }
       return;
    }
    public void assertInLayoutOrScroll(String p0){
       if (this.isComputingLayout()) {
          return;
       }
       if (p0 == null) {
          throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling"+this.exceptionLabel());
       }
       throw new IllegalStateException(p0+this.exceptionLabel());
    }
    public void assertNotInLayoutOrScroll(String p0){
       if (this.isComputingLayout()) {
          if (p0 == null) {
             throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling"+this.exceptionLabel());
          }else {
             throw new IllegalStateException(p0);
          }
       }else if(this.mDispatchScrollCounter > null){
          IllegalStateException illegalState = new IllegalStateException(this.exceptionLabel());
       }
       return;
    }
    public boolean canReuseUpdatedViewHolder(RecyclerView$ViewHolder p0){
       RecyclerView tmItemAnimat = this.mItemAnimator;
       boolean b = (tmItemAnimat == null || tmItemAnimat.g(p0, p0.getUnmodifiedPayloads()))? true: false;
       return b;
    }
    public final void cancelScroll(){
       this.resetScroll();
       this.setScrollState(0);
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof RecyclerView$LayoutParams && this.mLayout.checkLayoutParams(p0))? true: false;
       return b;
    }
    public void clearOldPositions(){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (i < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (!childViewHol.shouldIgnore()) {
             childViewHol.clearOldPosition();
          }
          i = i + 1;
       }
       this.mRecycler.d();
       return;
    }
    public void clearOnChildAttachStateChangeListeners(){
       RecyclerView tmOnChildAtt = this.mOnChildAttachStateListeners;
       if (tmOnChildAtt != null) {
          tmOnChildAtt.clear();
       }
       return;
    }
    public void clearOnScrollListeners(){
       RecyclerView tmScrollList = this.mScrollListeners;
       if (tmScrollList != null) {
          tmScrollList.clear();
       }
       return;
    }
    public int computeHorizontalScrollExtent(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollHorizontally()) {
          i = this.mLayout.computeHorizontalScrollExtent(this.mState);
       }
       return i;
    }
    public int computeHorizontalScrollOffset(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollHorizontally()) {
          i = this.mLayout.computeHorizontalScrollOffset(this.mState);
       }
       return i;
    }
    public int computeHorizontalScrollRange(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollHorizontally()) {
          i = this.mLayout.computeHorizontalScrollRange(this.mState);
       }
       return i;
    }
    public int computeVerticalScrollExtent(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollVertically()) {
          i = this.mLayout.computeVerticalScrollExtent(this.mState);
       }
       return i;
    }
    public int computeVerticalScrollOffset(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollVertically()) {
          i = this.mLayout.computeVerticalScrollOffset(this.mState);
       }
       return i;
    }
    public int computeVerticalScrollRange(){
       RecyclerView tmLayout = this.mLayout;
       int i = 0;
       if (tmLayout == null) {
          return i;
       }
       if (tmLayout.canScrollVertically()) {
          i = this.mLayout.computeVerticalScrollRange(this.mState);
       }
       return i;
    }
    public void considerReleasingGlowsOnScroll(int p0,int p1){
       boolean b;
       RecyclerView tmLeftGlow = this.mLeftGlow;
       if (tmLeftGlow != null && (!tmLeftGlow.isFinished() && p0 > 0)) {
          this.mLeftGlow.onRelease();
          b = this.mLeftGlow.isFinished();
       }else {
          b = 0;
       }
       RecyclerView tmRightGlow = this.mRightGlow;
       if (tmRightGlow != null && (!tmRightGlow.isFinished() && p0 < 0)) {
          this.mRightGlow.onRelease();
          b = b | this.mRightGlow.isFinished();
       }
    label_0031 :
       RecyclerView tmTopGlow = this.mTopGlow;
       if (tmTopGlow != null && (!tmTopGlow.isFinished() && p1 > 0)) {
          this.mTopGlow.onRelease();
          b = b | this.mTopGlow.isFinished();
       }
    label_0049 :
       tmTopGlow = this.mBottomGlow;
       if (tmTopGlow != null && (!tmTopGlow.isFinished() && p1 < 0)) {
          this.mBottomGlow.onRelease();
          b = b | this.mBottomGlow.isFinished();
       }
    label_0061 :
       if (b) {
          i0.j0(this);
       }
       return;
    }
    public void consumePendingUpdateOperations(){
       if (this.mFirstLayoutComplete == null || this.mDataSetHasChangedAfterLayout != null) {
          k.a("RV FullInvalidate");
          this.dispatchLayout();
          k.b();
          return;
       }else if(!this.mAdapterHelper.p()){
          return;
       }else if(this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)){
          k.a("RV PartialInvalidate");
          this.startInterceptRequestLayout();
          this.onEnterLayoutOrScroll();
          this.mAdapterHelper.w();
          if (this.mLayoutWasDefered == null) {
             if (this.hasUpdatedView()) {
                this.dispatchLayout();
             }else {
                this.mAdapterHelper.i();
             }
          }
          this.stopInterceptRequestLayout(true);
          this.onExitLayoutOrScroll();
          k.b();
       }else if(this.mAdapterHelper.p()){
          k.a("RV FullInvalidate");
          this.dispatchLayout();
          k.b();
       }
       return;
    }
    public final void createLayoutManager(Context p0,String p1,AttributeSet p2,int p3,int p4){
       Constructor constructor;
       if (p1 != null) {
          p1 = p1.trim();
          if (!p1.isEmpty()) {
             p1 = this.getFullClassName(p0, p1);
             try{
                ClassLoader classLoader = (this.isInEditMode())? this.getClass().getClassLoader(): p0.getClassLoader();
                Class uClass = Class.forName(p1, false, classLoader).asSubclass(RecyclerView$LayoutManager.class);
                try{
                   int i = 1;
                   constructor = uClass.getConstructor(RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                   Object[] objArray = new Object[4];
                   objArray[0] = p0;
                   objArray[i] = p2;
                   objArray[2] = Integer.valueOf(p3);
                   objArray[3] = Integer.valueOf(p4);
                   Object[] objArray1 = objArray;
                }catch(java.lang.NoSuchMethodException e8){
                   try{
                      Class[] uClassArray = new Class[false];
                      constructor = uClass.getConstructor(uClassArray);
                   }catch(java.lang.NoSuchMethodException e11){
                      e11.initCause(e8);
                      throw new IllegalStateException(p2.getPositionDescription()+": Error creating LayoutManager "+p1, e11);
                   }catch(java.lang.InstantiationException e8){
                      throw new IllegalStateException(p2.getPositionDescription()+": Could not instantiate the LayoutManager: "+p1, e8);
                   }catch(java.lang.IllegalAccessException e8){
                   label_00a5 :
                      throw new IllegalStateException(p2.getPositionDescription()+": Cannot access non-public constructor "+p1, e8);
                   }catch(java.lang.IllegalAccessException e0){
                   }
                }catch(java.lang.reflect.InvocationTargetException e8){
                   throw new IllegalStateException(p2.getPositionDescription()+": Could not instantiate the LayoutManager: "+p1, e8);
                }catch(java.lang.InstantiationException e8){
                }catch(java.lang.IllegalAccessException e8){
                }catch(java.lang.ClassCastException e8){
                   throw new IllegalStateException(p2.getPositionDescription()+": Class is not a LayoutManager "+p1, e8);
                }
             }catch(java.lang.ClassNotFoundException e8){
                throw new IllegalStateException(p2.getPositionDescription()+": Unable to find LayoutManager "+p1, e8);
             }catch(java.lang.reflect.InvocationTargetException e8){
             }catch(java.lang.InstantiationException e8){
             }catch(java.lang.IllegalAccessException e8){
             }catch(java.lang.ClassCastException e8){
             }
          }
       }
       return;
    }
    public void defaultOnMeasure(int p0,int p1){
       this.setMeasuredDimension(RecyclerView$LayoutManager.chooseSize(p0, (this.getPaddingLeft() + this.getPaddingRight()), i0.D(this)), RecyclerView$LayoutManager.chooseSize(p1, (this.getPaddingTop() + this.getPaddingBottom()), i0.C(this)));
    }
    public final boolean didChildRangeChange(int p0,int p1){
       this.findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
       RecyclerView tmMinMaxLayo = this.mMinMaxLayoutPositions;
       int i = 0;
       if (tmMinMaxLayo[i] != p0 || tmMinMaxLayo[1] != p1) {
          i = true;
       }
       return i;
    }
    public void dispatchChildAttached(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       this.onChildAttachedToWindow(p0);
       RecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null && childViewHol != null) {
          tmAdapter.B0(childViewHol);
       }
       RecyclerView tmOnChildAtt = this.mOnChildAttachStateListeners;
       if (tmOnChildAtt != null) {
          for (int i = tmOnChildAtt.size() - 1; i >= 0; i = i - 1) {
             this.mOnChildAttachStateListeners.get(i).w6(p0);
          }
       }
       return;
    }
    public void dispatchChildDetached(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       this.onChildDetachedFromWindow(p0);
       RecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null && childViewHol != null) {
          tmAdapter.D0(childViewHol);
       }
       RecyclerView tmOnChildAtt = this.mOnChildAttachStateListeners;
       if (tmOnChildAtt != null) {
          for (int i = tmOnChildAtt.size() - 1; i >= 0; i = i - 1) {
             this.mOnChildAttachStateListeners.get(i).m3(p0);
          }
       }
       return;
    }
    public final void dispatchContentChangedIfNecessary(){
       RecyclerView tmEatenAcces = this.mEatenAccessibilityChangeFlags;
       this.mEatenAccessibilityChangeFlags = 0;
       if (tmEatenAcces != null && this.isAccessibilityEnabled()) {
          AccessibilityEvent uAccessibili = AccessibilityEvent.obtain();
          uAccessibili.setEventType(2048);
          b.b(uAccessibili, tmEatenAcces);
          this.sendAccessibilityEventUnchecked(uAccessibili);
       }
       return;
    }
    public void dispatchLayout(){
       if (this.mAdapter == null) {
          return;
       }
       if (this.mLayout == null) {
          return;
       }
       boolean b = false;
       this.mState.j = b;
       RecyclerView recyclerView = (this.mLastAutoMeasureSkippedDueToExact != null && (this.mLastAutoMeasureNonExactMeasuredWidth != this.getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != this.getHeight()))? 1: null;
       this.mLastAutoMeasureNonExactMeasuredWidth = b;
       this.mLastAutoMeasureNonExactMeasuredHeight = b;
       this.mLastAutoMeasureSkippedDueToExact = b;
       if (this.mState.e == 1) {
          this.dispatchLayoutStep1();
          this.mLayout.setExactMeasureSpecsFrom(this);
          this.dispatchLayoutStep2();
       }else if(!this.mAdapterHelper.q() && (recyclerView == null && (this.mLayout.getWidth() != this.getWidth() || this.mLayout.getHeight() != this.getHeight()))){
          this.mLayout.setExactMeasureSpecsFrom(this);
          this.dispatchLayoutStep2();
       }else {
          this.mLayout.setExactMeasureSpecsFrom(this);
       }
       this.dispatchLayoutStep3();
       return;
    }
    public final void dispatchLayoutStep1(){
       int childCount;
       int i = 1;
       this.mState.a(i);
       this.fillRemainingScrollValues(this.mState);
       this.mState.j = false;
       this.startInterceptRequestLayout();
       this.mViewInfoStore.clear();
       this.onEnterLayoutOrScroll();
       this.processAdapterUpdatesAndSetAnimationFlags();
       this.saveFocusInfo();
       RecyclerView tmState = this.mState;
       if (tmState.k == null || this.mItemsChanged == null) {
          i = false;
       }
       tmState.i = i;
       this.mItemsChanged = false;
       this.mItemsAddedOrRemoved = false;
       tmState.h = tmState.l;
       tmState.f = this.mAdapter.getItemCount();
       this.findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
       if (this.mState.k != null) {
          childCount = this.mChildHelper.getChildCount();
          i = 0;
          while (i < childCount) {
             RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(i));
             if (!childViewHol.shouldIgnore() && (!childViewHol.isInvalid() || this.mAdapter.j0())) {
                this.mViewInfoStore.addToPreLayout(childViewHol, this.mItemAnimator.u(this.mState, childViewHol, RecyclerView$l.e(childViewHol), childViewHol.getUnmodifiedPayloads()));
                if (this.mState.i != null && (childViewHol.isUpdated() && (!childViewHol.isRemoved() && (!childViewHol.shouldIgnore() && !childViewHol.isInvalid())))) {
                   this.mViewInfoStore.addToOldChangeHolders(this.getChangedHolderKey(childViewHol), childViewHol);
                }
             }
          label_00ae :
             i = i + 1;
          }
       }
       if (this.mState.l != null) {
          this.saveOldPositions();
          tmState = this.mState;
          RecyclerView$y g = tmState.g;
          tmState.g = false;
          this.mLayout.onLayoutChildren(this.mRecycler, tmState);
          this.mState.g = g;
          childCount = 0;
          while (childCount < this.mChildHelper.getChildCount()) {
             RecyclerView$ViewHolder childViewHol1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(childCount));
             if (!childViewHol1.shouldIgnore() && !this.mViewInfoStore.isInPreLayout(childViewHol1)) {
                int i1 = RecyclerView$l.e(childViewHol1);
                boolean b = childViewHol1.hasAnyOfTheFlags(8192);
                if (!b) {
                   i1 = i1 | 0x1000;
                }
                RecyclerView$l$c ol$c = this.mItemAnimator.u(this.mState, childViewHol1, i1, childViewHol1.getUnmodifiedPayloads());
                if (b) {
                   this.recordAnimationInfoIfBouncedHiddenView(childViewHol1, ol$c);
                }else {
                   this.mViewInfoStore.addToAppearedInPreLayoutHolders(childViewHol1, ol$c);
                }
             }
             childCount = childCount + 1;
          }
          this.clearOldPositions();
       }else {
          this.clearOldPositions();
       }
       this.onExitLayoutOrScroll();
       this.stopInterceptRequestLayout(false);
       this.mState.e = 2;
       return;
    }
    public final void dispatchLayoutStep2(){
       this.startInterceptRequestLayout();
       this.onEnterLayoutOrScroll();
       this.mState.a(6);
       this.mAdapterHelper.j();
       this.mState.f = this.mAdapter.getItemCount();
       this.mState.d = 0;
       if (this.mPendingSavedState != null && this.mAdapter.a0()) {
          RecyclerView$SavedState d = this.mPendingSavedState.d;
          if (d != null) {
             this.mLayout.onRestoreInstanceState(d);
          }
          this.mPendingSavedState = null;
       }
       RecyclerView tmState = this.mState;
       tmState.h = false;
       this.mLayout.onLayoutChildren(this.mRecycler, tmState);
       tmState = this.mState;
       tmState.g = false;
       boolean b = (tmState.k != null && this.mItemAnimator != null)? true: false;
       tmState.k = b;
       tmState.e = 4;
       this.onExitLayoutOrScroll();
       this.stopInterceptRequestLayout(0);
       return;
    }
    public final void dispatchLayoutStep3(){
       this.mState.a(4);
       this.startInterceptRequestLayout();
       this.onEnterLayoutOrScroll();
       RecyclerView tmState = this.mState;
       tmState.e = 1;
       if (tmState.k != null) {
          int i = this.mChildHelper.getChildCount() - 1;
          while (i >= 0) {
             RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(i));
             if (!childViewHol.shouldIgnore()) {
                long changedHolde = this.getChangedHolderKey(childViewHol);
                RecyclerView$l$c ol$c = this.mItemAnimator.t(this.mState, childViewHol);
                RecyclerView$ViewHolder fromOldChang = this.mViewInfoStore.getFromOldChangeHolders(changedHolde);
                if (fromOldChang != null && !fromOldChang.shouldIgnore()) {
                   boolean b = this.mViewInfoStore.isDisappearing(fromOldChang);
                   boolean b1 = this.mViewInfoStore.isDisappearing(childViewHol);
                   if (b && fromOldChang == childViewHol) {
                      this.mViewInfoStore.addToPostLayout(childViewHol, ol$c);
                   }else {
                      RecyclerView$l$c ol$c1 = this.mViewInfoStore.popFromPreLayout(fromOldChang);
                      this.mViewInfoStore.addToPostLayout(childViewHol, ol$c);
                      RecyclerView$l$c ol$c2 = this.mViewInfoStore.popFromPostLayout(childViewHol);
                      if (ol$c1 == null) {
                         this.handleMissingPreInfoForChangeError(changedHolde, childViewHol, fromOldChang);
                      }else {
                         this.animateChange(fromOldChang, childViewHol, ol$c1, ol$c2, b, b1);
                      }
                   }
                }else {
                   this.mViewInfoStore.addToPostLayout(childViewHol, ol$c);
                }
             }
             i = i - 1;
          }
          this.mViewInfoStore.process(this.mViewInfoProcessCallback);
       }
       this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
       tmState = this.mState;
       tmState.c = tmState.f;
       this.mDataSetHasChangedAfterLayout = false;
       this.mDispatchItemsChangedEvent = false;
       tmState.k = false;
       tmState.l = false;
       this.mLayout.mRequestedSimpleAnimations = false;
       RecyclerView$t b2 = this.mRecycler.b;
       if (b2 != null) {
          b2.clear();
       }
       tmState = this.mLayout;
       if (tmState.mPrefetchMaxObservedInInitialPrefetch != null) {
          tmState.mPrefetchMaxCountObserved = 0;
          tmState.mPrefetchMaxObservedInInitialPrefetch = false;
          this.mRecycler.K();
       }
       this.mLayout.onLayoutCompleted(this.mState);
       this.onExitLayoutOrScroll();
       this.stopInterceptRequestLayout(false);
       this.mViewInfoStore.clear();
       tmState = this.mMinMaxLayoutPositions;
       if (this.didChildRangeChange(tmState[0], tmState[1])) {
          this.dispatchOnScrolled(false, false);
       }
       this.recoverFocusFromState();
       this.resetFocusInfo();
       return;
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.getScrollingChildHelper().a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.getScrollingChildHelper().b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       return this.getScrollingChildHelper().c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       return this.getScrollingChildHelper().d(p0, p1, p2, p3, p4);
    }
    public final void dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       this.getScrollingChildHelper().e(p0, p1, p2, p3, p4, p5, p6);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       return this.getScrollingChildHelper().f(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       return this.getScrollingChildHelper().g(p0, p1, p2, p3, p4, p5);
    }
    public void dispatchOnScrollStateChanged(int p0){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.onScrollStateChanged(p0);
       }
       this.onScrollStateChanged(p0);
       tmLayout = this.mScrollListener;
       if (tmLayout != null) {
          tmLayout.a(this, p0);
       }
       tmLayout = this.mScrollListeners;
       if (tmLayout != null) {
          for (int i = tmLayout.size() - 1; i >= 0; i = i - 1) {
             this.mScrollListeners.get(i).a(this, p0);
          }
       }
       return;
    }
    public void dispatchOnScrolled(int p0,int p1){
       this.mDispatchScrollCounter = this.mDispatchScrollCounter + 1;
       int scrollX = this.getScrollX();
       int scrollY = this.getScrollY();
       this.onScrollChanged(scrollX, scrollY, (scrollX - p0), (scrollY - p1));
       this.onScrolled(p0, p1);
       RecyclerView tmScrollList = this.mScrollListener;
       if (tmScrollList != null) {
          tmScrollList.b(this, p0, p1);
       }
       tmScrollList = this.mScrollListeners;
       if (tmScrollList != null) {
          for (scrollX = tmScrollList.size() - 1; scrollX >= 0; scrollX = scrollX - 1) {
             this.mScrollListeners.get(scrollX).b(this, p0, p1);
          }
       }
       this.mDispatchScrollCounter = this.mDispatchScrollCounter - 1;
       return;
    }
    public void dispatchPendingImportantForAccessibilityChanges(){
       int i = this.mPendingAccessibilityImportanceChange.size() - 1;
       while (i >= 0) {
          RecyclerView$ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(i);
          if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore()) {
             RecyclerView$ViewHolder mPendingAcce = viewHolder.mPendingAccessibilityState;
             if (mPendingAcce != -1) {
                i0.D0(viewHolder.itemView, mPendingAcce);
                viewHolder.mPendingAccessibilityState = -1;
             }
          }
          i = i - 1;
       }
       this.mPendingAccessibilityImportanceChange.clear();
       return;
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       this.onPopulateAccessibilityEvent(p0);
       return true;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       this.dispatchThawSelfOnly(p0);
    }
    public void dispatchSaveInstanceState(SparseArray p0){
       this.dispatchFreezeSelfOnly(p0);
    }
    public final boolean dispatchToOnItemTouchListeners(MotionEvent p0){
       RecyclerView tmIntercepti = this.mInterceptingOnItemTouchListener;
       if (tmIntercepti == null) {
          if (!p0.getAction()) {
             return false;
          }else {
             return this.findInterceptingOnItemTouchListener(p0);
          }
       }else {
          tmIntercepti.onTouchEvent(this, p0);
          int action = p0.getAction();
          if (action == 3 || action == 1) {
             this.mInterceptingOnItemTouchListener = null;
          }
          return true;
       }
    }
    public void draw(Canvas p0){
       int paddingBotto;
       RecyclerView tmTopGlow;
       int i3;
       super.draw(p0);
       int i = this.mItemDecorations.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          this.mItemDecorations.get(i2).e(p0, this, this.mState);
       }
       RecyclerView tmLeftGlow = this.mLeftGlow;
       i2 = 1;
       if (tmLeftGlow != null && !tmLeftGlow.isFinished()) {
          i = p0.save();
          paddingBotto = (this.mClipToPadding != null)? this.getPaddingBottom(): 0;
          p0.rotate(270.00f);
          p0.translate((float)((- this.getHeight()) + paddingBotto), 0);
          RecyclerView tmLeftGlow1 = this.mLeftGlow;
          paddingBotto = (tmLeftGlow1 != null && tmLeftGlow1.draw(p0))? 1: 0;
          p0.restoreToCount(i);
       }else {
          paddingBotto = 0;
       }
       tmLeftGlow = this.mTopGlow;
       if (tmLeftGlow != null && !tmLeftGlow.isFinished()) {
          i = p0.save();
          if (this.mClipToPadding != null) {
             p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
          }
          tmTopGlow = this.mTopGlow;
          i3 = (tmTopGlow != null && tmTopGlow.draw(p0))? 1: 0;
          paddingBotto = paddingBotto | i3;
          p0.restoreToCount(i);
       }
       tmLeftGlow = this.mRightGlow;
       if (tmLeftGlow != null && !tmLeftGlow.isFinished()) {
          i = p0.save();
          i3 = this.getWidth();
          int paddingTop = (this.mClipToPadding != null)? this.getPaddingTop(): 0;
          p0.rotate(90.00f);
          p0.translate((float)paddingTop, (float)(- i3));
          tmTopGlow = this.mRightGlow;
          i3 = (tmTopGlow != null && tmTopGlow.draw(p0))? 1: 0;
          paddingBotto = paddingBotto | i3;
          p0.restoreToCount(i);
       }
       tmLeftGlow = this.mBottomGlow;
       if (tmLeftGlow != null && !tmLeftGlow.isFinished()) {
          i = p0.save();
          p0.rotate(180.00f);
          if (this.mClipToPadding != null) {
             p0.translate((float)((- this.getWidth()) + this.getPaddingRight()), (float)((- this.getHeight()) + this.getPaddingBottom()));
          }else {
             p0.translate((float)(- this.getWidth()), (float)(- this.getHeight()));
          }
          tmTopGlow = this.mBottomGlow;
          if (tmTopGlow != null && tmTopGlow.draw(p0)) {
             i1 = 1;
          }
          paddingBotto = paddingBotto | i1;
          p0.restoreToCount(i);
       }
       if (paddingBotto || (this.mItemAnimator == null || (this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()))) {
          i2 = paddingBotto;
       }
       if (i2) {
          i0.j0(this);
       }
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       return super.drawChild(p0, p1, p2);
    }
    public void ensureBottomGlow(){
       if (this.mBottomGlow != null) {
          return;
       }
       EdgeEffect uEdgeEffect = this.mEdgeEffectFactory.a(this, 3);
       this.mBottomGlow = uEdgeEffect;
       if (this.mClipToPadding != null) {
          uEdgeEffect.setSize(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
       }else {
          uEdgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
    public void ensureLeftGlow(){
       if (this.mLeftGlow != null) {
          return;
       }
       EdgeEffect uEdgeEffect = this.mEdgeEffectFactory.a(this, 0);
       this.mLeftGlow = uEdgeEffect;
       if (this.mClipToPadding != null) {
          uEdgeEffect.setSize(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
       }else {
          uEdgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
       }
       return;
    }
    public void ensureRightGlow(){
       if (this.mRightGlow != null) {
          return;
       }
       EdgeEffect uEdgeEffect = this.mEdgeEffectFactory.a(this, 2);
       this.mRightGlow = uEdgeEffect;
       if (this.mClipToPadding != null) {
          uEdgeEffect.setSize(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
       }else {
          uEdgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
       }
       return;
    }
    public void ensureTopGlow(){
       if (this.mTopGlow != null) {
          return;
       }
       EdgeEffect uEdgeEffect = this.mEdgeEffectFactory.a(this, 1);
       this.mTopGlow = uEdgeEffect;
       if (this.mClipToPadding != null) {
          uEdgeEffect.setSize(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
       }else {
          uEdgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
    public String exceptionLabel(){
       return " "+super.toString()+", adapter:"+this.mAdapter+", layout:"+this.mLayout+", context:"+this.getContext();
    }
    public final void fillRemainingScrollValues(RecyclerView$y p0){
       if (this.getScrollState() == 2) {
          RecyclerView$ViewFlinger mOverScrolle = this.mViewFlinger.mOverScroller;
          p0.p = mOverScrolle.getFinalX() - mOverScrolle.getCurrX();
          int finalY = mOverScrolle.getFinalY();
          p0.q = finalY - mOverScrolle.getCurrY();
       }else {
          p0.p = 0;
          p0.q = 0;
       }
       return;
    }
    public View findChildViewUnder(float p0,float p1){
       View childAt;
       int i = this.mChildHelper.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          childAt = this.mChildHelper.getChildAt(i);
          float translationX = childAt.getTranslationX();
          float translationY = childAt.getTranslationY();
          float f = (float)childAt.getLeft() + translationX;
          if (p0 - f >= 0) {
             f = (float)childAt.getRight() + translationX;
             if (p0 - f <= 0) {
                translationX = (float)childAt.getTop() + translationY;
                if (p1 - translationX >= 0) {
                   translationX = (float)childAt.getBottom() + translationY;
                   if (p1 - translationX <= 0) {
                      break ;
                   }
                }
             }
          }
          i = i - 1;
       }
       return childAt;
    }
    public View findContainingItemView(View p0){
       for (ViewParent parent = p0.getParent(); parent != null && (parent != this && parent instanceof View); parent = viewParent.getParent()) {
          ViewParent viewParent = parent;
       }
       if (parent != this) {
          p0 = null;
       }
       return p0;
    }
    public RecyclerView$ViewHolder findContainingViewHolder(View p0){
       p0 = this.findContainingItemView(p0);
       RecyclerView$ViewHolder viewHolder = (p0 == null)? null: this.getChildViewHolder(p0);
       return viewHolder;
    }
    public final boolean findInterceptingOnItemTouchListener(MotionEvent p0){
       RecyclerView$q oq;
       int action = p0.getAction();
       int i = this.mOnItemTouchListeners.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          oq = this.mOnItemTouchListeners.get(i1);
          if (oq.a(this, p0) && action != 3) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       this.mInterceptingOnItemTouchListener = oq;
       return true;
    }
    public final void findMinMaxChildLayoutPositions(int[] p0){
       int childCount = this.mChildHelper.getChildCount();
       if (!childCount) {
          p0[0] = -1;
          p0[1] = -1;
          return;
       }else {
          int i = Integer.MAX_VALUE;
          int i1 = Integer.MIN_VALUE;
          int i2 = 0;
          while (i2 < childCount) {
             RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(i2));
             if (!childViewHol.shouldIgnore()) {
                int layoutPositi = childViewHol.getLayoutPosition();
                if (layoutPositi < i) {
                   i = layoutPositi;
                }
                if (layoutPositi > i1) {
                   i1 = layoutPositi;
                }
             }
             i2 = i2 + 1;
          }
          p0[0] = i;
          p0[1] = i1;
          return;
       }
    }
    public final View findNextViewToFocus(){
       RecyclerView$ViewHolder viewHolder;
       View view;
       RecyclerView tmState = this.mState;
       RecyclerView$y m = tmState.m;
       if (m != -1) {
       }else {
          m = 0;
       }
       int i = tmState.c();
       RecyclerView$y oy = m;
       while (true) {
          if (oy < i) {
             viewHolder = this.findViewHolderForAdapterPosition(oy);
             if (viewHolder == null) {
             label_0025 :
                i = Math.min(i, m) - 1;
                while (true) {
                   view = null;
                   if (i < 0) {
                      return view;
                   }
                   RecyclerView$ViewHolder viewHolder1 = this.findViewHolderForAdapterPosition(i);
                   if (viewHolder1 == null) {
                   }else if(viewHolder1.itemView.hasFocusable()){
                      return viewHolder1.itemView;
                   }else {
                      i = i - 1;
                   }
                }
                return view;
             }else if(viewHolder.itemView.hasFocusable()){
                break ;
             }else {
                oy = oy + 1;
             }
          }else {
             goto label_0025 ;
          }
       }
       return viewHolder.itemView;
    }
    public RecyclerView$ViewHolder findViewHolderForAdapterPosition(int p0){
       RecyclerView$ViewHolder childViewHol;
       RecyclerView$ViewHolder viewHolder = null;
       if (this.mDataSetHasChangedAfterLayout != null) {
          return viewHolder;
       }
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (true) {
          if (i >= unfilteredCh) {
             return viewHolder;
          }
          childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (childViewHol != null && (!childViewHol.isRemoved() && this.getAdapterPositionInRecyclerView(childViewHol) == p0)) {
             if (this.mChildHelper.isHidden(childViewHol.itemView)) {
                viewHolder = childViewHol;
             }else {
                break ;
             }
          }
          i = i + 1;
       }
       return childViewHol;
    }
    public RecyclerView$ViewHolder findViewHolderForItemId(long p0){
       RecyclerView tmAdapter = this.mAdapter;
       RecyclerView$ViewHolder viewHolder = null;
       if (tmAdapter != null && tmAdapter.j0()) {
          int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
          int i = 0;
          while (i < unfilteredCh) {
             RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
             if (childViewHol != null && (!childViewHol.isRemoved() && !childViewHol.getItemId() - p0)) {
                if (this.mChildHelper.isHidden(childViewHol.itemView)) {
                   viewHolder = childViewHol;
                }else {
                   return childViewHol;
                }
             }
             i = i + 1;
          }
       }
       return viewHolder;
    }
    public RecyclerView$ViewHolder findViewHolderForLayoutPosition(int p0){
       return this.findViewHolderForPosition(p0, false);
    }
    public RecyclerView$ViewHolder findViewHolderForPosition(int p0){
       return this.findViewHolderForPosition(p0, false);
    }
    public RecyclerView$ViewHolder findViewHolderForPosition(int p0,boolean p1){
       RecyclerView$ViewHolder childViewHol;
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       RecyclerView recyclerView = null;
       int i = 0;
       while (true) {
          if (i >= unfilteredCh) {
             return recyclerView;
          }
          childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (childViewHol != null && !childViewHol.isRemoved()) {
             if (p1) {
                if (childViewHol.mPosition == p0) {
                }
             }else if(childViewHol.getLayoutPosition() != p0){
             }
          }
       label_0037 :
          i = i + 1;
       }
       return childViewHol;
    }
    public boolean fling(int p0,int p1){
       RecyclerView tmLayout = this.mLayout;
       boolean b = false;
       if (tmLayout == null) {
          return b;
       }
       if (this.mLayoutSuppressed != null) {
          return b;
       }
       boolean b1 = tmLayout.canScrollHorizontally();
       boolean b2 = this.mLayout.canScrollVertically();
       if (!b1 || Math.abs(p0) < this.mMinFlingVelocity) {
          p0 = 0;
       }
       if (!b2 || Math.abs(p1) < this.mMinFlingVelocity) {
          p1 = 0;
       }
       if (!p0 && !p1) {
          return b;
       }else {
          float f = (float)p0;
          float f1 = (float)p1;
          if (!this.dispatchNestedPreFling(f, f1)) {
             boolean b3 = (b1 || b2)? true: false;
             this.dispatchNestedFling(f, f1, b3);
             RecyclerView tmOnFlingLis = this.mOnFlingListener;
             if (tmOnFlingLis != null && tmOnFlingLis.a(p0, p1)) {
                return true;
             }else if(b3){
                if (b2) {
                   b1 = b1 | 0x02;
                }
                this.startNestedScroll(b1, true);
                tmLayout = this.mMaxFlingVelocity;
                tmLayout = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(Math.max((- tmLayout), Math.min(p0, tmLayout)), Math.max((- tmLayout), Math.min(p1, tmLayout)));
                return true;
             }
          }
          return b;
       }
    }
    public View focusSearch(View p0,int p1){
       int i2;
       int i3;
       View view = this.mLayout.onInterceptFocusSearch(p0, p1);
       if (view != null) {
          return view;
       }
       int i = 1;
       RecyclerView recyclerView = (this.mAdapter != null && (this.mLayout != null && (!this.isComputingLayout() && this.mLayoutSuppressed == null)))? 1: null;
       FocusFinder instance = FocusFinder.getInstance();
       if (recyclerView) {
          int i1 = 2;
          if (p1 == i1 || p1 == i) {
             if (this.mLayout.canScrollVertically()) {
                i2 = (p1 == i1)? 130: 33;
                i3 = (instance.findNextFocus(this, p0, i2) == null)? 1: 0;
                if (RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                   p1 = i2;
                }
             }else {
                i3 = 0;
             }
             if (!i3 && this.mLayout.canScrollHorizontally()) {
                i2 = (this.mLayout.getLayoutDirection() == i)? 1: 0;
                i1 = (p1 == i1)? 1: 0;
                i2 = (i2 ^ i1)? 66: 17;
                if (instance.findNextFocus(this, p0, i2) != null) {
                   i = null;
                }
                if (RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                   p1 = i2;
                }
                i3 = i;
             }
             if (i3) {
                this.consumePendingUpdateOperations();
                if (this.findContainingItemView(p0) == null) {
                   return null;
                }else {
                   this.startInterceptRequestLayout();
                   this.mLayout.onFocusSearchFailed(p0, p1, this.mRecycler, this.mState);
                   this.stopInterceptRequestLayout(false);
                }
             }
             view = instance.findNextFocus(this, p0, p1);
          }else {
          label_009b :
             View view1 = instance.findNextFocus(this, p0, p1);
             if (view1 == null && recyclerView != null) {
                this.consumePendingUpdateOperations();
                if (this.findContainingItemView(p0) == null) {
                   return null;
                }else {
                   this.startInterceptRequestLayout();
                   view = this.mLayout.onFocusSearchFailed(p0, p1, this.mRecycler, this.mState);
                   this.stopInterceptRequestLayout(false);
                }
             }else {
                view = view1;
             }
          }
       }else {
          goto label_009b ;
       }
       if (view != null && !view.hasFocusable()) {
          if (this.getFocusedChild() == null) {
             return super.focusSearch(p0, p1);
          }else {
             this.requestChildOnScreen(view, null);
             return p0;
          }
       }else if(this.isPreferredNextFocus(p0, view, p1)){
          view = super.focusSearch(p0, p1);
       }
       return view;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          return tmLayout.generateDefaultLayoutParams();
       }
       throw new IllegalStateException("RecyclerView has no LayoutManager"+this.exceptionLabel());
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          return tmLayout.generateLayoutParams(this.getContext(), p0);
       }
       throw new IllegalStateException("RecyclerView has no LayoutManager"+this.exceptionLabel());
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          return tmLayout.generateLayoutParams(p0);
       }
       throw new IllegalStateException("RecyclerView has no LayoutManager"+this.exceptionLabel());
    }
    public CharSequence getAccessibilityClassName(){
       return "androidx.recyclerview.widget.RecyclerView";
    }
    public RecyclerView$Adapter getAdapter(){
       return this.mAdapter;
    }
    public int getAdapterPositionInRecyclerView(RecyclerView$ViewHolder p0){
       if (p0.hasAnyOfTheFlags(524) || !p0.isBound()) {
          return -1;
       }
       return this.mAdapterHelper.e(p0.mPosition);
    }
    public int getBaseline(){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          return tmLayout.getBaseline();
       }
       return super.getBaseline();
    }
    public long getChangedHolderKey(RecyclerView$ViewHolder p0){
       long itemId = (this.mAdapter.j0())? p0.getItemId(): (long)p0.mPosition;
       return itemId;
    }
    public int getChildAdapterPosition(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       int absoluteAdap = (childViewHol != null)? childViewHol.getAbsoluteAdapterPosition(): -1;
       return absoluteAdap;
    }
    public int getChildDrawingOrder(int p0,int p1){
       RecyclerView tmChildDrawi = this.mChildDrawingOrderCallback;
       if (tmChildDrawi == null) {
          return super.getChildDrawingOrder(p0, p1);
       }
       return tmChildDrawi.a(p0, p1);
    }
    public long getChildItemId(View p0){
       RecyclerView tmAdapter = this.mAdapter;
       long l = -1;
       if (tmAdapter != null && tmAdapter.j0()) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
          if (childViewHol != null) {
             l = childViewHol.getItemId();
          }
       }
       return l;
    }
    public int getChildLayoutPosition(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       int layoutPositi = (childViewHol != null)? childViewHol.getLayoutPosition(): -1;
       return layoutPositi;
    }
    public int getChildPosition(View p0){
       return this.getChildAdapterPosition(p0);
    }
    public RecyclerView$ViewHolder getChildViewHolder(View p0){
       ViewParent parent = p0.getParent();
       if (parent == null || parent == this) {
          return RecyclerView.getChildViewHolderInt(p0);
       }
       throw new IllegalArgumentException("View "+p0+" is not a direct child of "+this);
    }
    public boolean getClipToPadding(){
       return this.mClipToPadding;
    }
    public v getCompatAccessibilityDelegate(){
       return this.mAccessibilityDelegate;
    }
    public void getDecoratedBoundsWithMargins(View p0,Rect p1){
       RecyclerView.getDecoratedBoundsWithMarginsInt(p0, p1);
    }
    public final int getDeepestFocusedViewWithId(View p0){
       int id = p0.getId();
       while (!p0.isFocused() && (p0 instanceof ViewGroup && p0.hasFocus())) {
          p0 = p0.getFocusedChild();
          if (p0.getId() != -1) {
             id = p0.getId();
          }
       }
       return id;
    }
    public RecyclerView$k getEdgeEffectFactory(){
       return this.mEdgeEffectFactory;
    }
    public final String getFullClassName(Context p0,String p1){
       if (p1.charAt(0) == '.') {
          return p0.getPackageName()+p1;
       }
       if (p1.contains(".")) {
          return p1;
       }
       return RecyclerView.class.getPackage().getName()+'.'+p1;
    }
    public RecyclerView$l getItemAnimator(){
       return this.mItemAnimator;
    }
    public Rect getItemDecorInsetsForChild(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.mInsetsDirty == null) {
          return layoutParams.mDecorInsets;
       }
       if (this.mState.g() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
          return layoutParams.mDecorInsets;
       }
       RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
       mDecorInsets.set(0, 0, 0, 0);
       int i = this.mItemDecorations.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mTempRect.set(0, 0, 0, 0);
          this.mItemDecorations.get(i1).c(this.mTempRect, p0, this, this.mState);
          RecyclerView tmTempRect = this.mTempRect;
          int i2 = mDecorInsets.left + tmTempRect.left;
          mDecorInsets.left = i2;
          i2 = mDecorInsets.top + tmTempRect.top;
          mDecorInsets.top = i2;
          i2 = mDecorInsets.right + tmTempRect.right;
          mDecorInsets.right = i2;
          i2 = mDecorInsets.bottom + tmTempRect.bottom;
          mDecorInsets.bottom = i2;
       }
       layoutParams.mInsetsDirty = false;
       return mDecorInsets;
    }
    public RecyclerView$n getItemDecorationAt(int p0){
       int itemDecorati = this.getItemDecorationCount();
       if (p0 >= 0 && p0 < itemDecorati) {
          return this.mItemDecorations.get(p0);
       }
       throw new IndexOutOfBoundsException(p0+" is an invalid index for size "+itemDecorati);
    }
    public int getItemDecorationCount(){
       return this.mItemDecorations.size();
    }
    public RecyclerView$LayoutManager getLayoutManager(){
       return this.mLayout;
    }
    public int getMaxFlingVelocity(){
       return this.mMaxFlingVelocity;
    }
    public int getMinFlingVelocity(){
       return this.mMinFlingVelocity;
    }
    public long getNanoTime(){
       if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
          return System.nanoTime();
       }
       return 0;
    }
    public RecyclerView$p getOnFlingListener(){
       return this.mOnFlingListener;
    }
    public boolean getPreserveFocusAfterLayout(){
       return this.mPreserveFocusAfterLayout;
    }
    public RecyclerView$s getRecycledViewPool(){
       return this.mRecycler.i();
    }
    public int getScrollState(){
       return this.mScrollState;
    }
    public final void handleMissingPreInfoForChangeError(long p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       RecyclerView$ViewHolder childViewHol;
       String str;
       int childCount = this.mChildHelper.getChildCount();
       int i = 0;
       while (true) {
          if (i < childCount) {
             childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(i));
             if (childViewHol != p1 && !this.getChangedHolderKey(childViewHol) - p0) {
                RecyclerView tmAdapter = this.mAdapter;
                str = " \n View Holder 2:";
                if (tmAdapter == null || !tmAdapter.j0()) {
                   throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"+childViewHol+str+p1+this.exceptionLabel());
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "+p2+" cannot be found but it is necessary for "+p1+this.exceptionLabel();
             return;
          }
       }
       throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"+childViewHol+str+p1+this.exceptionLabel());
    }
    public boolean hasFixedSize(){
       return this.mHasFixedSize;
    }
    public boolean hasNestedScrollingParent(){
       return this.getScrollingChildHelper().k();
    }
    public boolean hasNestedScrollingParent(int p0){
       return this.getScrollingChildHelper().l(p0);
    }
    public boolean hasPendingAdapterUpdates(){
       boolean b = (this.mFirstLayoutComplete != null && (this.mDataSetHasChangedAfterLayout != null || this.mAdapterHelper.p()))? true: false;
       return b;
    }
    public final boolean hasUpdatedView(){
       int childCount = this.mChildHelper.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getChildAt(i));
          if (childViewHol == null || (!childViewHol.shouldIgnore() && childViewHol.isUpdated())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void initAdapterManager(){
       this.mAdapterHelper = new a(new RecyclerView$f(this));
    }
    public final void initAutofill(){
       if (!i0.A(this)) {
          i0.E0(this, 8);
       }
       return;
    }
    public final void initChildrenHelper(){
       this.mChildHelper = new ChildHelper(new RecyclerView$e(this));
    }
    public void initFastScroller(StateListDrawable p0,Drawable p1,StateListDrawable p2,Drawable p3){
       if (p0 == null || (p1 == null || (p2 == null || p3 == null))) {
          throw new IllegalArgumentException("Trying to set fast scroller without both required drawables."+this.exceptionLabel());
       }
       Resources resources = this.getContext().getResources();
       j oj = new j(this, p0, p1, p2, p3, c.b(resources, 0x7f0703cb), c.b(resources, 0x7f0703cd), c.a(resources, 0x7f0703cc));
       return;
    }
    public void invalidateGlows(){
       this.mBottomGlow = null;
       this.mTopGlow = null;
       this.mRightGlow = null;
       this.mLeftGlow = null;
    }
    public void invalidateItemDecorations(){
       if (!this.mItemDecorations.size()) {
          return;
       }
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
       }
       this.markItemDecorInsetsDirty();
       this.requestLayout();
       return;
    }
    public boolean isAccessibilityEnabled(){
       RecyclerView tmAccessibil = this.mAccessibilityManager;
       boolean b = (tmAccessibil != null && tmAccessibil.isEnabled())? true: false;
       return b;
    }
    public boolean isAnimating(){
       RecyclerView tmItemAnimat = this.mItemAnimator;
       boolean b = (tmItemAnimat != null && tmItemAnimat.p())? true: false;
       return b;
    }
    public boolean isAttachedToWindow(){
       return this.mIsAttached;
    }
    public boolean isComputingLayout(){
       boolean b = (this.mLayoutOrScrollCounter > null)? true: false;
       return b;
    }
    public boolean isLayoutFrozen(){
       return this.isLayoutSuppressed();
    }
    public final boolean isLayoutSuppressed(){
       return this.mLayoutSuppressed;
    }
    public boolean isNestedScrollingEnabled(){
       return this.getScrollingChildHelper().m();
    }
    public final boolean isPreferredNextFocus(View p0,View p1,int p2){
       int i1;
       boolean b = false;
       if (p1 == null || (p1 != this && p1 != p0)) {
          if (this.findContainingItemView(p1) == null) {
             return b;
          }else if(p0 == null){
             return true;
          }else if(this.findContainingItemView(p0) == null){
             return true;
          }else {
             this.mTempRect.set(b, b, p0.getWidth(), p0.getHeight());
             this.mTempRect2.set(b, b, p1.getWidth(), p1.getHeight());
             this.offsetDescendantRectToMyCoords(p0, this.mTempRect);
             this.offsetDescendantRectToMyCoords(p1, this.mTempRect2);
             StringBuilder str = -1;
             int i = (this.mLayout.getLayoutDirection() == 1)? -1: 1;
             RecyclerView tmTempRect = this.mTempRect;
             Rect left = tmTempRect.left;
             RecyclerView tmTempRect2 = this.mTempRect2;
             Rect left1 = tmTempRect2.left;
             if (left < left1 || (tmTempRect.right <= left1 && tmTempRect.right < tmTempRect2.right)) {
                i1 = 1;
             }else {
                Rect right = tmTempRect2.right;
                i1 = (tmTempRect.right > right || (left >= right && left > left1))? -1: 0;
             }
             left1 = tmTempRect.top;
             Rect top = tmTempRect2.top;
             if (left1 < top || (tmTempRect.bottom <= top && tmTempRect.bottom < tmTempRect2.bottom)) {
                str = 1;
             }else {
                Rect bottom = tmTempRect2.bottom;
                if (tmTempRect.bottom <= bottom && (left1 < bottom || left1 <= top)) {
                   str = null;
                }
             }
             if (p2 != 1) {
                if (p2 != 2) {
                   if (p2 != 17) {
                      if (p2 != 33) {
                         if (p2 != 66) {
                            if (p2 == 130) {
                               if (str > 0) {
                                  b = true;
                               }
                               return b;
                            }else {
                               throw new IllegalArgumentException("Invalid direction: "+p2+this.exceptionLabel());
                            }
                         }else if(i1 > 0){
                            b = true;
                         }
                         return b;
                      }else if(str < null){
                         b = true;
                      }
                      return b;
                   }else if(i1 < 0){
                      b = true;
                   }
                   return b;
                }else if(str > null || (str == null && (i1 * i) > 0)){
                   b = true;
                }
                return b;
             }else if(str < null || (str == null && (i1 * i) < 0)){
                b = true;
             }
          }
       }
       return b;
    }
    public void jumpToPositionForSmoothScroller(int p0){
       if (this.mLayout == null) {
          return;
       }
       this.setScrollState(2);
       this.mLayout.scrollToPosition(p0);
       this.awakenScrollBars();
       return;
    }
    public void markItemDecorInsetsDirty(){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       for (int i = 0; i < unfilteredCh; i = i + 1) {
          this.mChildHelper.getUnfilteredChildAt(i).getLayoutParams().mInsetsDirty = true;
       }
       this.mRecycler.s();
       return;
    }
    public void markKnownViewsInvalid(){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (i < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (childViewHol != null && !childViewHol.shouldIgnore()) {
             childViewHol.addFlags(6);
          }
          i = i + 1;
       }
       this.markItemDecorInsetsDirty();
       this.mRecycler.t();
       return;
    }
    public void nestedScrollBy(int p0,int p1){
       this.nestedScrollByInternal(p0, p1, null, 1);
    }
    public final void nestedScrollByInternal(int p0,int p1,MotionEvent p2,int p3){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          return;
       }
       if (this.mLayoutSuppressed != null) {
          return;
       }
       RecyclerView tmReusableIn = this.mReusableIntPair;
       int i = 0;
       tmReusableIn[i] = i;
       int i1 = 1;
       tmReusableIn[i1] = i;
       int b = tmLayout.canScrollHorizontally();
       boolean b1 = this.mLayout.canScrollVertically();
       int i2 = (b1)? b | 0x02: b;
       this.startNestedScroll(i2, p3);
       int i3 = (b)? p0: 0;
       int i4 = (b1)? p1: 0;
       if (this.dispatchNestedPreScroll(i3, i4, this.mReusableIntPair, this.mScrollOffset, p3)) {
          RecyclerView tmReusableIn1 = this.mReusableIntPair;
          p0 = p0 - tmReusableIn1[i];
          p1 = p1 - tmReusableIn1[i1];
       }
       b = (b)? p0: 0;
       if (b1) {
          i = p1;
       }
       this.scrollByInternal(b, i, p2, p3);
       RecyclerView tmGapWorker = this.mGapWorker;
       if (tmGapWorker != null && (p0 || p1)) {
          tmGapWorker.postFromTraversal(this, p0, p1);
       }
       this.stopNestedScroll(p3);
       return;
    }
    public void offsetChildrenHorizontal(int p0){
       int childCount = this.mChildHelper.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.mChildHelper.getChildAt(i).offsetLeftAndRight(p0);
       }
       return;
    }
    public void offsetChildrenVertical(int p0){
       int childCount = this.mChildHelper.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.mChildHelper.getChildAt(i).offsetTopAndBottom(p0);
       }
       return;
    }
    public void offsetPositionRecordsForInsert(int p0,int p1){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (i < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (childViewHol != null && (!childViewHol.shouldIgnore() && childViewHol.mPosition >= p0)) {
             childViewHol.offsetPosition(p1, false);
             this.mState.g = true;
          }
       label_0028 :
          i = i + 1;
       }
       this.mRecycler.u(p0, p1);
       this.requestLayout();
       return;
    }
    public void offsetPositionRecordsForMove(int p0,int p1){
       int i;
       int i1;
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       if (p0 < p1) {
          i = p0;
          i1 = p1;
       }else {
          i1 = p0;
          i = p1;
          int i4 = 1;
       }
       int i2 = 0;
       while (i2 < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
          if (childViewHol != null) {
             RecyclerView$ViewHolder mPosition = childViewHol.mPosition;
             if (mPosition >= i && mPosition <= i1) {
                if (mPosition == p0) {
                   int i3 = p1 - p0;
                   childViewHol.offsetPosition(i3, false);
                }else {
                   childViewHol.offsetPosition(-1, false);
                }
                this.mState.g = true;
             }
          }
          i2 = i2 + 1;
       }
       this.mRecycler.v(p0, p1);
       this.requestLayout();
       return;
    }
    public void offsetPositionRecordsForRemove(int p0,int p1,boolean p2){
       int i2;
       int i = p0 + p1;
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i1 = 0;
       while (i1 < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i1));
          if (childViewHol != null && !childViewHol.shouldIgnore()) {
             RecyclerView$ViewHolder mPosition = childViewHol.mPosition;
             if (mPosition >= i) {
                i2 = - p1;
                childViewHol.offsetPosition(i2, p2);
                this.mState.g = true;
             }else if(mPosition >= p0){
                i2 = p0 - 1;
                int i3 = - p1;
                childViewHol.flagRemovedAndOffsetPosition(i2, i3, p2);
                this.mState.g = true;
             }
          }
          i1 = i1 + 1;
       }
       this.mRecycler.w(p0, p1, p2);
       this.requestLayout();
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       int i = 0;
       this.mLayoutOrScrollCounter = i;
       boolean b = true;
       this.mIsAttached = b;
       if (this.mFirstLayoutComplete == null || this.isLayoutRequested()) {
          b = false;
       }
       this.mFirstLayoutComplete = b;
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.dispatchAttachedToWindow(this);
       }
       this.mPostedAnimatorRunner = i;
       if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
          ThreadLocal f = k.f;
          k ok = f.get();
          this.mGapWorker = ok;
          if (ok == null) {
             this.mGapWorker = new k();
             Display uDisplay = i0.v(this);
             float f1 = 60.00f;
             if (!this.isInEditMode() && uDisplay != null) {
                float refreshRate = uDisplay.getRefreshRate();
                if (refreshRate - 0x41f00000 >= 0) {
                   f1 = refreshRate;
                }
             }
             tmLayout = this.mGapWorker;
             tmLayout.d = (long)(1000000000.00f / f1);
             f.set(tmLayout);
          }
          this.mGapWorker.a(this);
       }
       return;
    }
    public void onChildAttachedToWindow(View p0){
    }
    public void onChildDetachedFromWindow(View p0){
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       RecyclerView tmItemAnimat = this.mItemAnimator;
       if (tmItemAnimat != null) {
          tmItemAnimat.k();
       }
       this.stopScroll();
       this.mIsAttached = false;
       tmItemAnimat = this.mLayout;
       if (tmItemAnimat != null) {
          tmItemAnimat.dispatchDetachedFromWindow(this, this.mRecycler);
       }
       this.mPendingAccessibilityImportanceChange.clear();
       this.removeCallbacks(this.mItemAnimatorRunner);
       this.mViewInfoStore.onDetach();
       if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
          tmItemAnimat = this.mGapWorker;
          if (tmItemAnimat != null) {
             tmItemAnimat.i(this);
             this.mGapWorker = null;
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int i = this.mItemDecorations.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mItemDecorations.get(i1).d(p0, this, this.mState);
       }
       return;
    }
    public void onEnterLayoutOrScroll(){
       this.mLayoutOrScrollCounter = this.mLayoutOrScrollCounter + 1;
    }
    public void onExitLayoutOrScroll(){
       this.onExitLayoutOrScroll(true);
    }
    public void onExitLayoutOrScroll(boolean p0){
       int i = this.mLayoutOrScrollCounter - 1;
       this.mLayoutOrScrollCounter = i;
       if (i < 1) {
          this.mLayoutOrScrollCounter = 0;
          if (p0) {
             this.dispatchContentChangedIfNecessary();
             this.dispatchPendingImportantForAccessibilityChanges();
          }
       }
       return;
    }
    public boolean onGenericMotionEvent(MotionEvent p0){
       float f;
       float axisValue;
       if (this.mLayout == null) {
          return false;
       }
       if (this.mLayoutSuppressed != null) {
          return false;
       }
       if (p0.getAction() == 8) {
          RecyclerView recyclerView = null;
          if (p0.getSource() & 0x02) {
             f = (this.mLayout.canScrollVertically())? - p0.getAxisValue(9): 0;
             if (this.mLayout.canScrollHorizontally()) {
                axisValue = p0.getAxisValue(10);
             label_0062 :
                if (f - recyclerView || axisValue - recyclerView) {
                   this.nestedScrollByInternal((int)(axisValue * this.mScaledHorizontalScrollFactor), (int)(f * this.mScaledVerticalScrollFactor), p0, 1);
                }
             }
          }else if(p0.getSource() & 0x400000){
             f = p0.getAxisValue(26);
             if (this.mLayout.canScrollVertically()) {
                f = - f;
             }else if(this.mLayout.canScrollHorizontally()){
                axisValue = f;
                f = 0;
                goto label_0062 ;
             }
          }
          f = 0;
          axisValue = 0;
          goto label_0062 ;
       }
       return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int i;
       boolean b = false;
       if (this.mLayoutSuppressed != null) {
          return b;
       }
       this.mInterceptingOnItemTouchListener = null;
       if (this.findInterceptingOnItemTouchListener(p0)) {
          this.cancelScroll();
          return true;
       }else {
          RecyclerView tmLayout = this.mLayout;
          if (tmLayout == null) {
             return b;
          }
          int b1 = tmLayout.canScrollHorizontally();
          boolean b2 = this.mLayout.canScrollVertically();
          if (this.mVelocityTracker == null) {
             this.mVelocityTracker = VelocityTracker.obtain();
          }
          this.mVelocityTracker.addMovement(p0);
          int actionMasked = p0.getActionMasked();
          int actionIndex = p0.getActionIndex();
          RecyclerView recyclerView = 2;
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked != recyclerView) {
                   if (actionMasked != 3) {
                      if (actionMasked != 5) {
                         if (actionMasked == 6) {
                            this.onPointerUp(p0);
                         }
                      }else {
                         this.mScrollPointerId = p0.getPointerId(actionIndex);
                         b1 = (int)(p0.getX(actionIndex) + 0x3f000000);
                         this.mLastTouchX = b1;
                         this.mInitialTouchX = b1;
                         i = (int)(p0.getY(actionIndex) + 0x3f000000);
                         this.mLastTouchY = i;
                         this.mInitialTouchY = i;
                      }
                   }else {
                      this.cancelScroll();
                   }
                }else {
                   actionMasked = p0.findPointerIndex(this.mScrollPointerId);
                   if (actionMasked < 0) {
                      return b;
                   }else {
                      actionIndex = (int)(p0.getX(actionMasked) + 0x3f000000);
                      i = (int)(p0.getY(actionMasked) + 0x3f000000);
                      if (this.mScrollState != true) {
                         actionMasked = actionIndex - this.mInitialTouchX;
                         int i1 = i - this.mInitialTouchY;
                         if (b1 && Math.abs(actionMasked) > this.mTouchSlop) {
                            this.mLastTouchX = actionIndex;
                            b1 = 1;
                         }else {
                            b1 = 0;
                         }
                         if (b2 && Math.abs(i1) > this.mTouchSlop) {
                            this.mLastTouchY = i;
                            b1 = 1;
                         }
                         if (b1) {
                            this.setScrollState(true);
                         }
                      }
                   }
                }
             }else {
                this.mVelocityTracker.clear();
                this.stopNestedScroll(b);
             }
          }else if(this.mIgnoreMotionEventTillDown != null){
             this.mIgnoreMotionEventTillDown = b;
          }
          this.mScrollPointerId = p0.getPointerId(b);
          actionMasked = (int)(p0.getX() + 0x3f000000);
          this.mLastTouchX = actionMasked;
          this.mInitialTouchX = actionMasked;
          i = (int)(p0.getY() + 0x3f000000);
          this.mLastTouchY = i;
          this.mInitialTouchY = i;
          if (this.mScrollState == recyclerView) {
             this.getParent().requestDisallowInterceptTouchEvent(true);
             this.setScrollState(true);
             this.stopNestedScroll(true);
          }
          RecyclerView tmNestedOffs = this.mNestedOffsets;
          tmNestedOffs[1] = b;
          tmNestedOffs[b] = b;
          if (b2) {
             b1 = b1 | 0x02;
          }
          this.startNestedScroll(b1, b);
       label_00fe :
          if (this.mScrollState == true) {
             b = true;
          }
          return b;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       k.a("RV OnLayout");
       this.dispatchLayout();
       k.b();
       this.mFirstLayoutComplete = true;
    }
    public void onMeasure(int p0,int p1){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          this.defaultOnMeasure(p0, p1);
          return;
       }else {
          boolean b = true;
          boolean b1 = false;
          if (tmLayout.isAutoMeasureEnabled()) {
             int mode = View$MeasureSpec.getMode(p1);
             this.mLayout.onMeasure(this.mRecycler, this.mState, p0, p1);
             if (View$MeasureSpec.getMode(p0) == 0x40000000 && mode == 0x40000000) {
                b1 = true;
             }
             this.mLastAutoMeasureSkippedDueToExact = b1;
             if (b1 || this.mAdapter == null) {
                return;
             }else if(this.mState.e == b){
                this.dispatchLayoutStep1();
             }
             this.mLayout.setMeasureSpecs(p0, p1);
             this.mState.j = b;
             this.dispatchLayoutStep2();
             this.mLayout.setMeasuredDimensionFromChildren(p0, p1);
             if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                this.mState.j = b;
                this.dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(p0, p1);
             }
             this.mLastAutoMeasureNonExactMeasuredWidth = this.getMeasuredWidth();
             this.mLastAutoMeasureNonExactMeasuredHeight = this.getMeasuredHeight();
          }else if(this.mHasFixedSize != null){
             this.mLayout.onMeasure(this.mRecycler, this.mState, p0, p1);
             return;
          }else if(this.mAdapterUpdateDuringMeasure != null){
             this.startInterceptRequestLayout();
             this.onEnterLayoutOrScroll();
             this.processAdapterUpdatesAndSetAnimationFlags();
             this.onExitLayoutOrScroll();
             tmLayout = this.mState;
             if (tmLayout.l != null) {
                tmLayout.h = b;
             }else {
                this.mAdapterHelper.j();
                this.mState.h = b1;
             }
             this.mAdapterUpdateDuringMeasure = b1;
             this.stopInterceptRequestLayout(b1);
          }else if(this.mState.l != null){
             this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
             return;
          }
          tmLayout = this.mAdapter;
          this.mState.f = (tmLayout != null)? tmLayout.getItemCount(): b1;
          this.startInterceptRequestLayout();
          this.mLayout.onMeasure(this.mRecycler, this.mState, p0, p1);
          this.stopInterceptRequestLayout(b1);
          p0.h = b1;
          return;
       }
    }
    public final void onPointerUp(MotionEvent p0){
       int actionIndex = p0.getActionIndex();
       if (p0.getPointerId(actionIndex) == this.mScrollPointerId) {
          actionIndex = (!actionIndex)? 1: 0;
          this.mScrollPointerId = p0.getPointerId(actionIndex);
          int i = (int)(p0.getX(actionIndex) + 0x3f000000);
          this.mLastTouchX = i;
          this.mInitialTouchX = i;
          int i1 = (int)(p0.getY(actionIndex) + 0x3f000000);
          this.mLastTouchY = i1;
          this.mInitialTouchY = i1;
       }
       return;
    }
    public boolean onRequestFocusInDescendants(int p0,Rect p1){
       if (this.isComputingLayout()) {
          return false;
       }
       return super.onRequestFocusInDescendants(p0, p1);
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof RecyclerView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          this.mPendingSavedState = p0;
          super.onRestoreInstanceState(p0.a());
          this.requestLayout();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       RecyclerView$SavedState savedState = new RecyclerView$SavedState(super.onSaveInstanceState());
       RecyclerView tmPendingSav = this.mPendingSavedState;
       if (tmPendingSav != null) {
          savedState.b(tmPendingSav);
       }else {
          tmPendingSav = this.mLayout;
          savedState.d = (tmPendingSav != null)? tmPendingSav.onSaveInstanceState(): null;
       }
       return savedState;
    }
    public void onScrollStateChanged(int p0){
    }
    public void onScrolled(int p0,int p1){
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 != p2 || p1 != p3) {
          this.invalidateGlows();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RecyclerView mNestedOffse;
       int i4;
       RecyclerView recyclerView = this;
       MotionEvent motionEvent = p0;
       boolean b = false;
       if (recyclerView.mLayoutSuppressed != null || recyclerView.mIgnoreMotionEventTillDown != null) {
          return b;
       }
       if (this.dispatchToOnItemTouchListeners(p0)) {
          this.cancelScroll();
          return true;
       }else {
          RecyclerView mLayout = recyclerView.mLayout;
          if (mLayout == null) {
             return b;
          }
          boolean b1 = mLayout.canScrollHorizontally();
          boolean b2 = recyclerView.mLayout.canScrollVertically();
          if (recyclerView.mVelocityTracker == null) {
             recyclerView.mVelocityTracker = VelocityTracker.obtain();
          }
          int actionMasked = p0.getActionMasked();
          int actionIndex = p0.getActionIndex();
          if (!actionMasked) {
             mNestedOffse = recyclerView.mNestedOffsets;
             mNestedOffse[1] = b;
             mNestedOffse[b] = b;
          }
          MotionEvent motionEvent1 = MotionEvent.obtain(p0);
          mNestedOffse = recyclerView.mNestedOffsets;
          motionEvent1.offsetLocation((float)mNestedOffse[b], (float)mNestedOffse[1]);
          float f = 0x3f000000;
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked != 2) {
                   if (actionMasked != 3) {
                      if (actionMasked != 5) {
                         if (actionMasked == 6) {
                            this.onPointerUp(p0);
                         }
                      }else {
                         recyclerView.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                         actionMasked = (int)(motionEvent.getX(actionIndex) + f);
                         recyclerView.mLastTouchX = actionMasked;
                         recyclerView.mInitialTouchX = actionMasked;
                         actionMasked = (int)(motionEvent.getY(actionIndex) + f);
                         recyclerView.mLastTouchY = actionMasked;
                         recyclerView.mInitialTouchY = actionMasked;
                      }
                   }else {
                      this.cancelScroll();
                   }
                }else {
                   actionMasked = motionEvent.findPointerIndex(recyclerView.mScrollPointerId);
                   if (actionMasked < 0) {
                      return b;
                   }else {
                      int i = (int)(motionEvent.getX(actionMasked) + f);
                      int i1 = (int)(motionEvent.getY(actionMasked) + f);
                      actionMasked = recyclerView.mLastTouchX - i;
                      actionIndex = recyclerView.mLastTouchY - i1;
                      if (recyclerView.mScrollState != true) {
                         if (b1) {
                            actionMasked = (actionMasked > 0)? Math.max(b, (actionMasked - recyclerView.mTouchSlop)): Math.min(b, (actionMasked + recyclerView.mTouchSlop));
                            if (actionMasked) {
                               f = 1;
                            label_00c3 :
                               if (b2) {
                                  actionIndex = (actionIndex > 0)? Math.max(b, (actionIndex - recyclerView.mTouchSlop)): Math.min(b, (actionIndex + recyclerView.mTouchSlop));
                                  if (actionIndex) {
                                     f = 1;
                                  }
                               }
                               if (f) {
                                  recyclerView.setScrollState(true);
                               }
                            }
                         }
                         i4 = 0;
                         goto label_00c3 ;
                      }
                      int i2 = actionMasked;
                      int i3 = actionIndex;
                      if (recyclerView.mScrollState == true) {
                         RecyclerView mReusableInt = recyclerView.mReusableIntPair;
                         mReusableInt[b] = b;
                         mReusableInt[1] = b;
                         actionIndex = (b1)? i2: 0;
                         i4 = (b2)? i3: 0;
                         if (this.dispatchNestedPreScroll(actionIndex, i4, mReusableInt, recyclerView.mScrollOffset, 0)) {
                            mLayout = recyclerView.mReusableIntPair;
                            i2 = i2 - mLayout[b];
                            i3 = i3 - mLayout[1];
                            mLayout = recyclerView.mNestedOffsets;
                            mNestedOffse = recyclerView.mScrollOffset;
                            mLayout[b] = mLayout[b] + mNestedOffse[b];
                            mLayout[1] = mLayout[1] + mNestedOffse[1];
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                         }
                         actionMasked = i3;
                         RecyclerView mScrollOffse = recyclerView.mScrollOffset;
                         recyclerView.mLastTouchX = i - mScrollOffse[b];
                         recyclerView.mLastTouchY = i1 - mScrollOffse[1];
                         actionIndex = (b1)? i2: 0;
                         i4 = (b2)? actionMasked: 0;
                         if (recyclerView.scrollByInternal(actionIndex, i4, motionEvent, b)) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                         }
                         mScrollOffse = recyclerView.mGapWorker;
                         if (mScrollOffse != null && (i2 || actionMasked)) {
                            mScrollOffse.postFromTraversal(recyclerView, i2, actionMasked);
                         }
                      }
                   }
                }
             }else {
                recyclerView.mVelocityTracker.addMovement(motionEvent1);
                recyclerView.mVelocityTracker.computeCurrentVelocity(1000, (float)recyclerView.mMaxFlingVelocity);
                actionMasked = 0;
                float f1 = (b1)? - recyclerView.mVelocityTracker.getXVelocity(recyclerView.mScrollPointerId): 0;
                f = (b2)? - recyclerView.mVelocityTracker.getYVelocity(recyclerView.mScrollPointerId): 0;
                if (f1 - actionMasked || (!f - actionMasked || !recyclerView.fling((int)f1, (int)f))) {
                   recyclerView.setScrollState(b);
                }
                this.resetScroll();
                b = true;
             }
          }else {
             recyclerView.mScrollPointerId = motionEvent.getPointerId(b);
             actionMasked = (int)(p0.getX() + f);
             recyclerView.mLastTouchX = actionMasked;
             recyclerView.mInitialTouchX = actionMasked;
             actionMasked = (int)(p0.getY() + f);
             recyclerView.mLastTouchY = actionMasked;
             recyclerView.mInitialTouchY = actionMasked;
             if (b2) {
                b1 = b1 | 0x02;
             }
             recyclerView.startNestedScroll(b1, b);
          }
       label_01b7 :
          if (!b) {
             recyclerView.mVelocityTracker.addMovement(motionEvent1);
          }
          motionEvent1.recycle();
          return true;
       }
    }
    public void postAnimationRunner(){
       if (this.mPostedAnimatorRunner == null && this.mIsAttached != null) {
          i0.k0(this, this.mItemAnimatorRunner);
          this.mPostedAnimatorRunner = true;
       }
       return;
    }
    public final boolean predictiveItemAnimationsEnabled(){
       boolean b = (this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations())? true: false;
       return b;
    }
    public final void processAdapterUpdatesAndSetAnimationFlags(){
       boolean b1;
       if (this.mDataSetHasChangedAfterLayout != null) {
          this.mAdapterHelper.y();
          if (this.mDispatchItemsChangedEvent != null) {
             this.mLayout.onItemsChanged(this);
          }
       }
       if (this.predictiveItemAnimationsEnabled()) {
          this.mAdapterHelper.w();
       }else {
          this.mAdapterHelper.j();
       }
       boolean b = false;
       RecyclerView recyclerView = (this.mItemsAddedOrRemoved != null || this.mItemsChanged != null)? 1: null;
       RecyclerView tmState = this.mState;
       if (this.mFirstLayoutComplete != null && this.mItemAnimator != null) {
          RecyclerView tmDataSetHas = this.mDataSetHasChangedAfterLayout;
          if (tmDataSetHas == null && (recyclerView || (this.mLayout.mRequestedSimpleAnimations != null && (tmDataSetHas == null || this.mAdapter.j0())))) {
             b1 = true;
          label_0054 :
             tmState.k = b1;
             tmState = this.mState;
             if (tmState.k != null && (recyclerView && (this.mDataSetHasChangedAfterLayout == null && this.predictiveItemAnimationsEnabled()))) {
                b = true;
             }
          label_0069 :
             tmState.l = b;
             return;
          }
       }
       b1 = false;
       goto label_0054 ;
    }
    public void processDataSetCompletelyChanged(boolean p0){
       this.mDispatchItemsChangedEvent = p0 | this.mDispatchItemsChangedEvent;
       this.mDataSetHasChangedAfterLayout = true;
       this.markKnownViewsInvalid();
    }
    public final void pullGlows(float p0,float p1,float p2,float p3){
       RecyclerView recyclerView;
       float f = 0x3f800000;
       int i = 1;
       if (p1 < 0) {
          this.ensureLeftGlow();
          c.e(this.mLeftGlow, ((- p1) / (float)this.getWidth()), (f - (p2 / (float)this.getHeight())));
       }else if(p1 > 0){
          this.ensureRightGlow();
          c.e(this.mRightGlow, (p1 / (float)this.getWidth()), (p2 / (float)this.getHeight()));
       }else {
          recyclerView = null;
       label_003c :
          if (p3 < 0) {
             this.ensureTopGlow();
             c.e(this.mTopGlow, ((- p3) / (float)this.getHeight()), (p0 / (float)this.getWidth()));
          }else if(p3 > 0){
             this.ensureBottomGlow();
             c.e(this.mBottomGlow, (p3 / (float)this.getHeight()), (f - (p0 / (float)this.getWidth())));
          }else {
             i = recyclerView;
          }
          if (i == null && (p1 || p3)) {
             i0.j0(this);
          }
          return;
       }
       recyclerView = 1;
       goto label_003c ;
    }
    public void recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder p0,RecyclerView$l$c p1){
       p0.setFlags(0, 8192);
       if (this.mState.i != null && (p0.isUpdated() && (!p0.isRemoved() && !p0.shouldIgnore()))) {
          this.mViewInfoStore.addToOldChangeHolders(this.getChangedHolderKey(p0), p0);
       }
    label_0027 :
       this.mViewInfoStore.addToPreLayout(p0, p1);
       return;
    }
    public final void recoverFocusFromState(){
       View focusedChild;
       if (this.mPreserveFocusAfterLayout == null || (this.mAdapter == null || (!this.hasFocus() || (this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused()))))) {
          if (!this.isFocused()) {
             focusedChild = this.getFocusedChild();
             if (RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (!this.mChildHelper.getChildCount()) {
                   this.requestFocus();
                   return;
                }
             }else if(!this.mChildHelper.isHidden(focusedChild)){
                return;
             }
          }
          View view = null;
          RecyclerView$ViewHolder viewHolder = (this.mState.n - -1 && this.mAdapter.j0())? this.findViewHolderForItemId(this.mState.n): view;
          if (viewHolder != null && (this.mChildHelper.isHidden(viewHolder.itemView) || !viewHolder.itemView.hasFocusable())) {
             if (this.mChildHelper.getChildCount() > 0) {
                view = this.findNextViewToFocus();
             }
          }else {
             view = viewHolder.itemView;
          }
          if (view != null) {
             RecyclerView$y o = this.mState.o;
             if ((long)o - -1) {
                focusedChild = view.findViewById(o);
                if (focusedChild != null && focusedChild.isFocusable()) {
                   view = focusedChild;
                }
             }
             view.requestFocus();
          }
       }
    label_00b1 :
       return;
    }
    public final void releaseGlows(){
       boolean b;
       RecyclerView tmLeftGlow = this.mLeftGlow;
       if (tmLeftGlow != null) {
          tmLeftGlow.onRelease();
          b = this.mLeftGlow.isFinished();
       }else {
          b = 0;
       }
       RecyclerView tmTopGlow = this.mTopGlow;
       if (tmTopGlow != null) {
          tmTopGlow.onRelease();
          b = b | this.mTopGlow.isFinished();
       }
       tmTopGlow = this.mRightGlow;
       if (tmTopGlow != null) {
          tmTopGlow.onRelease();
          b = b | this.mRightGlow.isFinished();
       }
       tmTopGlow = this.mBottomGlow;
       if (tmTopGlow != null) {
          tmTopGlow.onRelease();
          b = b | this.mBottomGlow.isFinished();
       }
       if (b) {
          i0.j0(this);
       }
       return;
    }
    public void removeAndRecycleViews(){
       RecyclerView tmItemAnimat = this.mItemAnimator;
       if (tmItemAnimat != null) {
          tmItemAnimat.k();
       }
       tmItemAnimat = this.mLayout;
       if (tmItemAnimat != null) {
          tmItemAnimat.removeAndRecycleAllViews(this.mRecycler);
          this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
       }
       this.mRecycler.c();
       return;
    }
    public boolean removeAnimatingView(View p0){
       this.startInterceptRequestLayout();
       boolean b = this.mChildHelper.removeViewIfHidden(p0);
       if (b) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
          this.mRecycler.J(childViewHol);
          this.mRecycler.C(childViewHol);
       }
       this.stopInterceptRequestLayout((b ^ 0x01));
       return b;
    }
    public void removeDetachedView(View p0,boolean p1){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol != null) {
          if (childViewHol.isTmpDetached()) {
             childViewHol.clearTmpDetachFlag();
          }else if(childViewHol.shouldIgnore()){
             throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached."+childViewHol+this.exceptionLabel());
          }
       }
       p0.clearAnimation();
       this.dispatchChildDetached(p0);
       super.removeDetachedView(p0, p1);
       return;
    }
    public void removeItemDecoration(RecyclerView$n p0){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
       }
       this.mItemDecorations.remove(p0);
       if (this.mItemDecorations.isEmpty()) {
          boolean b = (this.getOverScrollMode() == 2)? true: false;
          this.setWillNotDraw(b);
       }
       this.markItemDecorInsetsDirty();
       this.requestLayout();
       return;
    }
    public void removeItemDecorationAt(int p0){
       int itemDecorati = this.getItemDecorationCount();
       if (p0 < 0 || p0 >= itemDecorati) {
          throw new IndexOutOfBoundsException(p0+" is an invalid index for size "+itemDecorati);
       }
       this.removeItemDecoration(this.getItemDecorationAt(p0));
       return;
    }
    public void removeOnChildAttachStateChangeListener(RecyclerView$o p0){
       RecyclerView tmOnChildAtt = this.mOnChildAttachStateListeners;
       if (tmOnChildAtt == null) {
          return;
       }
       tmOnChildAtt.remove(p0);
       return;
    }
    public void removeOnItemTouchListener(RecyclerView$q p0){
       this.mOnItemTouchListeners.remove(p0);
       if (this.mInterceptingOnItemTouchListener == p0) {
          this.mInterceptingOnItemTouchListener = null;
       }
       return;
    }
    public void removeOnScrollListener(RecyclerView$r p0){
       RecyclerView tmScrollList = this.mScrollListeners;
       if (tmScrollList != null) {
          tmScrollList.remove(p0);
       }
       return;
    }
    public void removeRecyclerListener(RecyclerView$u p0){
       this.mRecyclerListeners.remove(p0);
    }
    public void repositionShadowingViews(){
       int childCount = this.mChildHelper.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.mChildHelper.getChildAt(i);
          RecyclerView$ViewHolder childViewHol = this.getChildViewHolder(childAt);
          if (childViewHol != null) {
             childViewHol = childViewHol.mShadowingHolder;
             if (childViewHol != null) {
                childViewHol = childViewHol.itemView;
                int left = childAt.getLeft();
                int top = childAt.getTop();
                if (left != childViewHol.getLeft() || top != childViewHol.getTop()) {
                   int i1 = childViewHol.getWidth() + left;
                   int i2 = childViewHol.getHeight() + top;
                   childViewHol.layout(left, top, i1, i2);
                }
             }
          }
          i = i + 1;
       }
       return;
    }
    public void requestChildFocus(View p0,View p1){
       if (!this.mLayout.onRequestChildFocus(this, this.mState, p0, p1) && p1 != null) {
          this.requestChildOnScreen(p0, p1);
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public final void requestChildOnScreen(View p0,View p1){
       View view = (p1 != null)? p1: p0;
       this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       if (layoutParams instanceof RecyclerView$LayoutParams && layoutParams.mInsetsDirty == null) {
          RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
          RecyclerView tmTempRect = this.mTempRect;
          tmTempRect.left = tmTempRect.left - mDecorInsets.left;
          tmTempRect.right = tmTempRect.right + mDecorInsets.right;
          tmTempRect.top = tmTempRect.top - mDecorInsets.top;
          tmTempRect.bottom = tmTempRect.bottom + mDecorInsets.bottom;
       }
       if (p1 != null) {
          this.offsetDescendantRectToMyCoords(p1, this.mTempRect);
          this.offsetRectIntoDescendantCoords(p0, this.mTempRect);
       }
       RecyclerView tmLayout = this.mLayout;
       RecyclerView tmTempRect1 = this.mTempRect;
       int i = this.mFirstLayoutComplete ^ 0x01;
       boolean b = (p1 == null)? true: false;
       tmLayout.requestChildRectangleOnScreen(this, p0, tmTempRect1, i, b);
       return;
    }
    public boolean requestChildRectangleOnScreen(View p0,Rect p1,boolean p2){
       return this.mLayout.requestChildRectangleOnScreen(this, p0, p1, p2);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       int i = this.mOnItemTouchListeners.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mOnItemTouchListeners.get(i1).onRequestDisallowInterceptTouchEvent(p0);
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void requestLayout(){
       if (this.mInterceptRequestLayoutDepth == null && this.mLayoutSuppressed == null) {
          super.requestLayout();
       }else {
          this.mLayoutWasDefered = true;
       }
       return;
    }
    public final void resetFocusInfo(){
       RecyclerView tmState = this.mState;
       tmState.n = -1;
       tmState.m = -1;
       tmState.o = -1;
    }
    public final void resetScroll(){
       RecyclerView tmVelocityTr = this.mVelocityTracker;
       if (tmVelocityTr != null) {
          tmVelocityTr.clear();
       }
       this.stopNestedScroll(0);
       this.releaseGlows();
       return;
    }
    public final void saveFocusInfo(){
       int i;
       RecyclerView$ViewHolder viewHolder = null;
       View focusedChild = (this.mPreserveFocusAfterLayout != null && (this.hasFocus() && this.mAdapter != null))? this.getFocusedChild(): viewHolder;
       if (focusedChild != null) {
          viewHolder = this.findContainingViewHolder(focusedChild);
       }
       if (viewHolder == null) {
          this.resetFocusInfo();
       }else {
          RecyclerView tmState = this.mState;
          long itemId = (this.mAdapter.j0())? viewHolder.getItemId(): -1;
          tmState.n = itemId;
          tmState = this.mState;
          if (this.mDataSetHasChangedAfterLayout != null) {
             i = -1;
          }else if(viewHolder.isRemoved()){
             i = viewHolder.mOldPosition;
          }else {
             i = viewHolder.getAbsoluteAdapterPosition();
          }
          tmState.m = i;
          this.mState.o = this.getDeepestFocusedViewWithId(viewHolder.itemView);
       }
       return;
    }
    public void saveOldPositions(){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (i < unfilteredCh) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
          if (!childViewHol.shouldIgnore()) {
             childViewHol.saveOldPosition();
          }
          i = i + 1;
       }
       return;
    }
    public void scrollBy(int p0,int p1){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          return;
       }
       if (this.mLayoutSuppressed != null) {
          return;
       }
       boolean b = tmLayout.canScrollHorizontally();
       boolean b1 = this.mLayout.canScrollVertically();
       if (b || b1) {
          if (!b) {
             p0 = 0;
          }
          if (!b1) {
             p1 = 0;
          }
          this.scrollByInternal(p0, p1, null, 0);
       }
       return;
    }
    public boolean scrollByInternal(int p0,int p1,MotionEvent p2,int p3){
       RecyclerView mReusableInt;
       int i3;
       int i4;
       int i5;
       int i6;
       int i7;
       int i8;
       RecyclerView recyclerView = this;
       int i = p0;
       int i1 = p1;
       MotionEvent motionEvent = p2;
       this.consumePendingUpdateOperations();
       int i2 = 1;
       if (recyclerView.mAdapter != null) {
          mReusableInt = recyclerView.mReusableIntPair;
          mReusableInt[0] = 0;
          mReusableInt[i2] = 0;
          recyclerView.scrollStep(i, i1, mReusableInt);
          mReusableInt = recyclerView.mReusableIntPair;
          i3 = mReusableInt[0];
          i4 = mReusableInt[i2];
          i5 = i4;
          i6 = i3;
          i7 = i - i3;
          i8 = i1 - i4;
       }else {
          i5 = 0;
          i6 = 0;
          i7 = 0;
          i8 = 0;
       }
       if (!recyclerView.mItemDecorations.isEmpty()) {
          this.invalidate();
       }
       RecyclerView mReusableInt1 = recyclerView.mReusableIntPair;
       mReusableInt1[0] = 0;
       mReusableInt1[i2] = 0;
       this.dispatchNestedScroll(i6, i5, i7, i8, recyclerView.mScrollOffset, p3, mReusableInt1);
       mReusableInt = recyclerView.mReusableIntPair;
       i3 = i7 - mReusableInt[0];
       int i9 = i8 - mReusableInt[i2];
       i4 = (mReusableInt[0] || mReusableInt[i2])? 1: 0;
       RecyclerView mScrollOffse = recyclerView.mScrollOffset;
       recyclerView.mLastTouchX = recyclerView.mLastTouchX - mScrollOffse[0];
       recyclerView.mLastTouchY = recyclerView.mLastTouchY - mScrollOffse[i2];
       RecyclerView mNestedOffse = recyclerView.mNestedOffsets;
       mNestedOffse[0] = mNestedOffse[0] + mScrollOffse[0];
       mNestedOffse[i2] = mNestedOffse[i2] + mScrollOffse[i2];
       if (this.getOverScrollMode() != 0.00f) {
          if (motionEvent && !q.h(motionEvent, 8194)) {
             recyclerView.pullGlows(p2.getX(), (float)i3, p2.getY(), (float)i9);
          }
          this.considerReleasingGlowsOnScroll(p0, p1);
       }
       if (i6 || i5) {
          recyclerView.dispatchOnScrolled(i6, i5);
       }
       if (!this.awakenScrollBars()) {
          this.invalidate();
       }
       if (i4 || (!i6 && !i5)) {
          i2 = false;
       }
    label_00c0 :
       return i2;
    }
    public void scrollStep(int p0,int p1,int[] p2){
       this.startInterceptRequestLayout();
       this.onEnterLayoutOrScroll();
       k.a("RV Scroll");
       this.fillRemainingScrollValues(this.mState);
       p0 = (p0)? this.mLayout.scrollHorizontallyBy(p0, this.mRecycler, this.mState): 0;
       p1 = (p1)? this.mLayout.scrollVerticallyBy(p1, this.mRecycler, this.mState): 0;
       k.b();
       this.repositionShadowingViews();
       this.onExitLayoutOrScroll();
       this.stopInterceptRequestLayout(false);
       if (p2 != null) {
          p2[0] = p0;
          p2[1] = p1;
       }
       return;
    }
    public void scrollTo(int p0,int p1){
    }
    public void scrollToPosition(int p0){
       if (this.mLayoutSuppressed != null) {
          return;
       }
       this.stopScroll();
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          return;
       }
       tmLayout.scrollToPosition(p0);
       this.awakenScrollBars();
       return;
    }
    public void sendAccessibilityEventUnchecked(AccessibilityEvent p0){
       if (this.shouldDeferAccessibilityEvent(p0)) {
          return;
       }
       super.sendAccessibilityEventUnchecked(p0);
       return;
    }
    public void setAccessibilityDelegateCompat(v p0){
       this.mAccessibilityDelegate = p0;
       i0.s0(this, p0);
    }
    public void setAdapter(RecyclerView$Adapter p0){
       this.setLayoutFrozen(false);
       this.setAdapterInternal(p0, false, true);
       this.processDataSetCompletelyChanged(false);
       this.requestLayout();
    }
    public final void setAdapterInternal(RecyclerView$Adapter p0,boolean p1,boolean p2){
       RecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null) {
          tmAdapter.I0(this.mObserver);
          this.mAdapter.z0(this);
       }
       if (!p1 || p2) {
          this.removeAndRecycleViews();
       }
       this.mAdapterHelper.y();
       RecyclerView tmAdapter1 = this.mAdapter;
       this.mAdapter = p0;
       if (p0 != null) {
          p0.F0(this.mObserver);
          p0.u0(this);
       }
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.onAdapterChanged(tmAdapter1, this.mAdapter);
       }
       this.mRecycler.x(tmAdapter1, this.mAdapter, p1);
       tmLayout.g = true;
       return;
    }
    public void setChildDrawingOrderCallback(RecyclerView$j p0){
       if (p0 == this.mChildDrawingOrderCallback) {
          return;
       }
       this.mChildDrawingOrderCallback = p0;
       boolean b = (p0 != null)? true: false;
       this.setChildrenDrawingOrderEnabled(b);
       return;
    }
    public boolean setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder p0,int p1){
       if (this.isComputingLayout()) {
          p0.mPendingAccessibilityState = p1;
          this.mPendingAccessibilityImportanceChange.add(p0);
          return false;
       }else {
          i0.D0(p0.itemView, p1);
          return true;
       }
    }
    public void setClipToPadding(boolean p0){
       if (p0 != this.mClipToPadding) {
          this.invalidateGlows();
       }
       this.mClipToPadding = p0;
       super.setClipToPadding(p0);
       if (this.mFirstLayoutComplete != null) {
          this.requestLayout();
       }
       return;
    }
    public void setEdgeEffectFactory(RecyclerView$k p0){
       h.g(p0);
       this.mEdgeEffectFactory = p0;
       this.invalidateGlows();
    }
    public void setHasFixedSize(boolean p0){
       this.mHasFixedSize = p0;
    }
    public void setItemAnimator(RecyclerView$l p0){
       RecyclerView tmItemAnimat = this.mItemAnimator;
       if (tmItemAnimat != null) {
          tmItemAnimat.k();
          this.mItemAnimator.y(null);
       }
       this.mItemAnimator = p0;
       if (p0 != null) {
          p0.y(this.mItemAnimatorListener);
       }
       return;
    }
    public void setItemViewCacheSize(int p0){
       this.mRecycler.G(p0);
    }
    public void setLayoutFrozen(boolean p0){
       this.suppressLayout(p0);
    }
    public void setLayoutManager(RecyclerView$LayoutManager p0){
       if (p0 == this.mLayout) {
          return;
       }
       this.stopScroll();
       if (this.mLayout != null) {
          RecyclerView tmItemAnimat = this.mItemAnimator;
          if (tmItemAnimat != null) {
             tmItemAnimat.k();
          }
          this.mLayout.removeAndRecycleAllViews(this.mRecycler);
          this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
          this.mRecycler.c();
          if (this.mIsAttached != null) {
             this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
          }
          RecyclerView recyclerView = null;
          this.mLayout.setRecyclerView(recyclerView);
          this.mLayout = recyclerView;
       }else {
          this.mRecycler.c();
       }
       this.mChildHelper.removeAllViewsUnfiltered();
       this.mLayout = p0;
       if (p0 != null) {
          if (p0.mRecyclerView == null) {
             p0.setRecyclerView(this);
             if (this.mIsAttached != null) {
                this.mLayout.dispatchAttachedToWindow(this);
             }
          }else {
             throw new IllegalArgumentException("LayoutManager "+p0+" is already attached to a RecyclerView:"+p0.mRecyclerView.exceptionLabel());
          }
       }
       this.mRecycler.K();
       this.requestLayout();
       return;
    }
    public void setLayoutTransition(LayoutTransition p0){
       if (p0 != null) {
          throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator\(\) instead for animating changes to the items in this RecyclerView");
       }
       super.setLayoutTransition(null);
       return;
    }
    public void setNestedScrollingEnabled(boolean p0){
       this.getScrollingChildHelper().n(p0);
    }
    public void setOnFlingListener(RecyclerView$p p0){
       this.mOnFlingListener = p0;
    }
    public void setOnScrollListener(RecyclerView$r p0){
       this.mScrollListener = p0;
    }
    public void setPreserveFocusAfterLayout(boolean p0){
       this.mPreserveFocusAfterLayout = p0;
    }
    public void setRecycledViewPool(RecyclerView$s p0){
       this.mRecycler.E(p0);
    }
    public void setRecyclerListener(RecyclerView$u p0){
       this.mRecyclerListener = p0;
    }
    public void setScrollState(int p0){
       if (p0 == this.mScrollState) {
          return;
       }
       this.mScrollState = p0;
       if (p0 != 2) {
          this.stopScrollersInternal();
       }
       this.dispatchOnScrollStateChanged(p0);
       return;
    }
    public void setScrollingTouchSlop(int p0){
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       this.mTouchSlop = (p0 != 1)? viewConfigur.getScaledTouchSlop(): viewConfigur.getScaledPagingTouchSlop();
       return;
    }
    public void setViewCacheExtension(RecyclerView$z p0){
       this.mRecycler.F(p0);
    }
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent p0){
       int i = 0;
       if (!this.isComputingLayout()) {
          return i;
       }
       int i1 = (p0 != null)? b.a(p0): 0;
       if (i1) {
          i = i1;
       }
       this.mEatenAccessibilityChangeFlags = this.mEatenAccessibilityChangeFlags | i;
       return true;
    }
    public void smoothScrollBy(int p0,int p1){
       this.smoothScrollBy(p0, p1, null);
    }
    public void smoothScrollBy(int p0,int p1,Interpolator p2){
       this.smoothScrollBy(p0, p1, p2, Integer.MIN_VALUE);
    }
    public void smoothScrollBy(int p0,int p1,Interpolator p2,int p3){
       this.smoothScrollBy(p0, p1, p2, p3, false);
    }
    public void smoothScrollBy(int p0,int p1,Interpolator p2,int p3,boolean p4){
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          return;
       }
       if (this.mLayoutSuppressed != null) {
          return;
       }
       int i = 0;
       if (!tmLayout.canScrollHorizontally()) {
          p0 = 0;
       }
       if (!this.mLayout.canScrollVertically()) {
          p1 = 0;
       }
       if (p0 || p1) {
          tmLayout = (p3 == Integer.MIN_VALUE || p3 > 0)? 1: 0;
          if (tmLayout) {
             if (p4) {
                if (p0) {
                   i = 1;
                }
                if (p1) {
                   i = i | 0x02;
                }
                this.startNestedScroll(i, 1);
             }
             this.mViewFlinger.smoothScrollBy(p0, p1, p3, p2);
          }else {
             this.scrollBy(p0, p1);
          }
       }
       return;
    }
    public void smoothScrollToPosition(int p0){
       if (this.mLayoutSuppressed != null) {
          return;
       }
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout == null) {
          return;
       }
       tmLayout.smoothScrollToPosition(this, this.mState, p0);
       return;
    }
    public void startInterceptRequestLayout(){
       int i = this.mInterceptRequestLayoutDepth + 1;
       this.mInterceptRequestLayoutDepth = i;
       if (i == 1 && this.mLayoutSuppressed == null) {
          this.mLayoutWasDefered = false;
       }
       return;
    }
    public boolean startNestedScroll(int p0){
       return this.getScrollingChildHelper().p(p0);
    }
    public boolean startNestedScroll(int p0,int p1){
       return this.getScrollingChildHelper().q(p0, p1);
    }
    public void stopInterceptRequestLayout(boolean p0){
       if (this.mInterceptRequestLayoutDepth < 1) {
          this.mInterceptRequestLayoutDepth = 1;
       }
       if (!p0 && this.mLayoutSuppressed == null) {
          this.mLayoutWasDefered = false;
       }
       if (this.mInterceptRequestLayoutDepth == 1) {
          if (p0 && (this.mLayoutWasDefered != null && (this.mLayoutSuppressed == null && (this.mLayout != null && this.mAdapter != null)))) {
             this.dispatchLayout();
          }
       label_0029 :
          if (this.mLayoutSuppressed == null) {
             this.mLayoutWasDefered = false;
          }
       }
       this.mInterceptRequestLayoutDepth = this.mInterceptRequestLayoutDepth - 1;
       return;
    }
    public void stopNestedScroll(){
       this.getScrollingChildHelper().r();
    }
    public void stopNestedScroll(int p0){
       this.getScrollingChildHelper().s(p0);
    }
    public void stopScroll(){
       this.setScrollState(0);
       this.stopScrollersInternal();
    }
    public final void stopScrollersInternal(){
       this.mViewFlinger.stop();
       RecyclerView tmLayout = this.mLayout;
       if (tmLayout != null) {
          tmLayout.stopSmoothScroller();
       }
       return;
    }
    public final void suppressLayout(boolean p0){
       if (p0 != this.mLayoutSuppressed) {
          this.assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
          if (!p0) {
             this.mLayoutSuppressed = false;
             if (this.mLayoutWasDefered != null && (this.mLayout != null && this.mAdapter != null)) {
                this.requestLayout();
             }
          label_001d :
             this.mLayoutWasDefered = false;
          }else {
             long l = SystemClock.uptimeMillis();
             this.onTouchEvent(MotionEvent.obtain(l, l, 3, 0, 0, 0));
             this.mLayoutSuppressed = true;
             this.mIgnoreMotionEventTillDown = true;
             this.stopScroll();
          }
       }
       return;
    }
    public void swapAdapter(RecyclerView$Adapter p0,boolean p1){
       this.setLayoutFrozen(false);
       this.setAdapterInternal(p0, true, p1);
       this.processDataSetCompletelyChanged(true);
       this.requestLayout();
    }
    public void viewRangeUpdate(int p0,int p1,Object p2){
       int unfilteredCh = this.mChildHelper.getUnfilteredChildCount();
       int i = p0 + p1;
       int i1 = 0;
       while (i1 < unfilteredCh) {
          View unfilteredCh1 = this.mChildHelper.getUnfilteredChildAt(i1);
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(unfilteredCh1);
          if (childViewHol != null && !childViewHol.shouldIgnore()) {
             RecyclerView$ViewHolder mPosition = childViewHol.mPosition;
             if (mPosition >= p0 && mPosition < i) {
                childViewHol.addFlags(2);
                childViewHol.addChangePayload(p2);
                unfilteredCh1.getLayoutParams().mInsetsDirty = true;
             }
          }
          i1 = i1 + 1;
       }
       this.mRecycler.M(p0, p1);
       return;
    }
}
