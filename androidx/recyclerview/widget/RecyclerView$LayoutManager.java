package androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.b0$b;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ViewInfoStore;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewParent;
import androidx.recyclerview.widget.ChildHelper;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a2.i0;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityEvent;
import b2.d;
import b2.d$b;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.animation.Interpolator;
import java.lang.Runnable;

public abstract class RecyclerView$LayoutManager	// class@000882
{
    public boolean mAutoMeasure;
    public ChildHelper mChildHelper;
    public int mHeight;
    public int mHeightMode;
    public b0 mHorizontalBoundCheck;
    public final b0$b mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    public boolean mItemPrefetchEnabled;
    public boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public RecyclerView mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    public RecyclerView$x mSmoothScroller;
    public b0 mVerticalBoundCheck;
    public final b0$b mVerticalBoundCheckCallback;
    public int mWidth;
    public int mWidthMode;

    public void RecyclerView$LayoutManager(){
       super();
       RecyclerView$LayoutManager$a layoutManage = new RecyclerView$LayoutManager$a(this);
       this.mHorizontalBoundCheckCallback = layoutManage;
       RecyclerView$LayoutManager$b layoutManage1 = new RecyclerView$LayoutManager$b(this);
       this.mVerticalBoundCheckCallback = layoutManage1;
       this.mHorizontalBoundCheck = new b0(layoutManage);
       this.mVerticalBoundCheck = new b0(layoutManage1);
       this.mRequestedSimpleAnimations = false;
       this.mIsAttachedToWindow = false;
       this.mAutoMeasure = false;
       this.mMeasurementCacheEnabled = true;
       this.mItemPrefetchEnabled = true;
    }
    public static int chooseSize(int p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       if (mode == Integer.MIN_VALUE) {
          return Math.min(p0, Math.max(p1, p2));
       }
       if (mode != 0x40000000) {
          p0 = Math.max(p1, p2);
       }
       return p0;
    }
    public static int getChildMeasureSpec(int p0,int p1,int p2,int p3,boolean p4){
       p0 = Math.max(0, (p0 - p2));
       if (p4) {
          if (p3 >= 0) {
          label_001c :
             p1 = 0x40000000;
          label_0031 :
             return View$MeasureSpec.makeMeasureSpec(p3, p1);
          }else if(p3 != -1 || (p1 != Integer.MIN_VALUE && (!p1 || p1 != 0x40000000))){
          label_002f :
             p1 = 0;
             p3 = 0;
             goto label_0031 ;
          }
       }else if(p3 >= 0){
          goto label_001c ;
       }else if(p3 == -1){
          if (p3 == -2) {
             p1 = (p1 == Integer.MIN_VALUE || p1 == 0x40000000)? Integer.MIN_VALUE: 0;
          }else {
             goto label_002f ;
          }
       }
       p3 = p0;
       goto label_0031 ;
    }
    public static int getChildMeasureSpec(int p0,int p1,int p2,boolean p3){
       p1 = 0;
       p0 = Math.max(p1, (p0 - p1));
       if (p3) {
          if (p2 >= 0) {
          label_0011 :
             p1 = 0x40000000;
          }else {
          label_000d :
             p2 = 0;
          }
       }else if(p2 >= 0){
          goto label_0011 ;
       }else if(p2 == -1){
          p1 = 0x40000000;
       }else if(p2 == -2){
          p1 = Integer.MIN_VALUE;
       }else {
          goto label_000d ;
       }
       p2 = p0;
       return View$MeasureSpec.makeMeasureSpec(p2, p1);
    }
    public static RecyclerView$LayoutManager$Properties getProperties(Context p0,AttributeSet p1,int p2,int p3){
       RecyclerView$LayoutManager$Properties layoutManage = new RecyclerView$LayoutManager$Properties();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.A4, p2, p3);
       layoutManage.orientation = typedArray.getInt(0, 1);
       layoutManage.spanCount = typedArray.getInt(10, 1);
       layoutManage.reverseLayout = typedArray.getBoolean(9, 0);
       layoutManage.stackFromEnd = typedArray.getBoolean(11, 0);
       typedArray.recycle();
       return layoutManage;
    }
    public static boolean isMeasurementUpToDate(int p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       boolean b = false;
       if (p2 > 0 && p0 != p2) {
          return b;
       }
       if (mode != Integer.MIN_VALUE) {
          if (mode) {
             if (mode != 0x40000000) {
                return b;
             }else if(p1 == p0){
                b = true;
             }
             return b;
          }else {
             return true;
          }
       }else if(p1 >= p0){
          b = true;
       }
       return b;
    }
    public void addDisappearingView(View p0){
       this.addDisappearingView(p0, -1);
    }
    public void addDisappearingView(View p0,int p1){
       this.addViewInt(p0, p1, true);
    }
    public void addView(View p0){
       this.addView(p0, -1);
    }
    public void addView(View p0,int p1){
       this.addViewInt(p0, p1, false);
    }
    public final void addViewInt(View p0,int p1,boolean p2){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (p2 || childViewHol.isRemoved()) {
          this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHol);
       }else {
          this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHol);
       }
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       if (childViewHol.wasReturnedFromScrap() || childViewHol.isScrap()) {
          if (childViewHol.isScrap()) {
             childViewHol.unScrap();
          }else {
             childViewHol.clearReturnedFromScrapFlag();
          }
          this.mChildHelper.attachViewToParent(p0, p1, p0.getLayoutParams(), false);
       }else if(p0.getParent() == this.mRecyclerView){
          int i = this.mChildHelper.indexOfChild(p0);
          if (p1 == -1) {
             p1 = this.mChildHelper.getChildCount();
          }
          if (i != -1) {
             if (i != p1) {
                this.mRecyclerView.mLayout.moveView(i, p1);
             }
          }else {
             throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"+this.mRecyclerView.indexOfChild(p0)+this.mRecyclerView.exceptionLabel());
          }
       }else {
          this.mChildHelper.addView(p0, p1, false);
          layoutParams.mInsetsDirty = true;
          RecyclerView$LayoutManager tmSmoothScro = this.mSmoothScroller;
          if (tmSmoothScro != null && tmSmoothScro.h()) {
             this.mSmoothScroller.k(p0);
          }
       }
       if (layoutParams.mPendingInvalidate != null) {
          childViewHol.itemView.invalidate();
          layoutParams.mPendingInvalidate = false;
       }
       return;
    }
    public void assertInLayoutOrScroll(String p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          tmRecyclerVi.assertInLayoutOrScroll(p0);
       }
       return;
    }
    public void assertNotInLayoutOrScroll(String p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          tmRecyclerVi.assertNotInLayoutOrScroll(p0);
       }
       return;
    }
    public void attachView(View p0){
       this.attachView(p0, -1);
    }
    public void attachView(View p0,int p1){
       this.attachView(p0, p1, p0.getLayoutParams());
    }
    public void attachView(View p0,int p1,RecyclerView$LayoutParams p2){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol.isRemoved()) {
          this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHol);
       }else {
          this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHol);
       }
       this.mChildHelper.attachViewToParent(p0, p1, p2, childViewHol.isRemoved());
       return;
    }
    public void calculateItemDecorationsForChild(View p0,Rect p1){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi == null) {
          p1.set(0, 0, 0, 0);
          return;
       }else {
          p1.set(tmRecyclerVi.getItemDecorInsetsForChild(p0));
          return;
       }
    }
    public boolean canScrollHorizontally(){
       return false;
    }
    public boolean canScrollVertically(){
       return false;
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       boolean b = (p0 != null)? true: false;
       return b;
    }
    public void collectAdjacentPrefetchPositions(int p0,int p1,RecyclerView$y p2,RecyclerView$LayoutManager$c p3){
    }
    public void collectInitialPrefetchPositions(int p0,RecyclerView$LayoutManager$c p1){
    }
    public int computeHorizontalScrollExtent(RecyclerView$y p0){
       return 0;
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       return 0;
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       return 0;
    }
    public int computeVerticalScrollExtent(RecyclerView$y p0){
       return 0;
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       return 0;
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       return 0;
    }
    public void detachAndScrapAttachedViews(RecyclerView$t p0){
       for (int i = this.getChildCount() - 1; i >= 0; i = i - 1) {
          this.scrapOrRecycleView(p0, i, this.getChildAt(i));
       }
       return;
    }
    public void detachAndScrapView(View p0,RecyclerView$t p1){
       this.scrapOrRecycleView(p1, this.mChildHelper.indexOfChild(p0), p0);
    }
    public void detachAndScrapViewAt(int p0,RecyclerView$t p1){
       this.scrapOrRecycleView(p1, p0, this.getChildAt(p0));
    }
    public void detachView(View p0){
       int i = this.mChildHelper.indexOfChild(p0);
       if (i >= 0) {
          this.detachViewInternal(i, p0);
       }
       return;
    }
    public void detachViewAt(int p0){
       this.detachViewInternal(p0, this.getChildAt(p0));
    }
    public final void detachViewInternal(int p0,View p1){
       this.mChildHelper.detachViewFromParent(p0);
    }
    public void dispatchAttachedToWindow(RecyclerView p0){
       this.mIsAttachedToWindow = true;
       this.onAttachedToWindow(p0);
    }
    public void dispatchDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       this.mIsAttachedToWindow = false;
       this.onDetachedFromWindow(p0, p1);
    }
    public void endAnimation(View p0){
       RecyclerView mItemAnimato = this.mRecyclerView.mItemAnimator;
       if (mItemAnimato != null) {
          mItemAnimato.j(RecyclerView.getChildViewHolderInt(p0));
       }
       return;
    }
    public View findContainingItemView(View p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi == null) {
          return null;
       }
       p0 = tmRecyclerVi.findContainingItemView(p0);
       if (p0 == null) {
          return null;
       }
       if (this.mChildHelper.isHidden(p0)) {
          return null;
       }
       return p0;
    }
    public View findViewByPosition(int p0){
       View childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(childAt);
          if (childViewHol != null && (childViewHol.getLayoutPosition() == p0 && (!childViewHol.shouldIgnore() && (this.mRecyclerView.mState.g() || !childViewHol.isRemoved())))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public abstract RecyclerView$LayoutParams generateDefaultLayoutParams();
    public RecyclerView$LayoutParams generateLayoutParams(Context p0,AttributeSet p1){
       return new RecyclerView$LayoutParams(p0, p1);
    }
    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       if (p0 instanceof RecyclerView$LayoutParams) {
          return new RecyclerView$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new RecyclerView$LayoutParams(p0);
       }
       return new RecyclerView$LayoutParams(p0);
    }
    public int getBaseline(){
       return -1;
    }
    public int getBottomDecorationHeight(View p0){
       return p0.getLayoutParams().mDecorInsets.bottom;
    }
    public View getChildAt(int p0){
       RecyclerView$LayoutManager tmChildHelpe = this.mChildHelper;
       View childAt = (tmChildHelpe != null)? tmChildHelpe.getChildAt(p0): null;
       return childAt;
    }
    public int getChildCount(){
       RecyclerView$LayoutManager tmChildHelpe = this.mChildHelper;
       int childCount = (tmChildHelpe != null)? tmChildHelpe.getChildCount(): 0;
       return childCount;
    }
    public final int[] getChildRectangleOnScreenScrollAmount(View p0,Rect p1){
       int[] ointArray = new int[2];
       int i = (p0.getLeft() + p1.left) - p0.getScrollX();
       int i1 = (p0.getTop() + p1.top) - p0.getScrollY();
       int i2 = p1.width() + i;
       int i3 = p1.height() + i1;
       i = i - this.getPaddingLeft();
       int i4 = Math.min(0, i);
       i1 = i1 - this.getPaddingTop();
       int i5 = Math.min(0, i1);
       i2 = i2 - (this.getWidth() - this.getPaddingRight());
       int i6 = Math.max(0, i2);
       i3 = Math.max(0, (i3 - (this.getHeight() - this.getPaddingBottom())));
       if (this.getLayoutDirection() == 1) {
          if (!i6) {
             i6 = Math.max(i4, i2);
          }
       }else if(i4){
          i4 = Math.min(i, i6);
       }
       i6 = i4;
       if (!i5) {
          i5 = Math.min(i1, i3);
       }
       ointArray[0] = i6;
       ointArray[1] = i5;
       return ointArray;
    }
    public boolean getClipToPadding(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       boolean b = (tmRecyclerVi != null && tmRecyclerVi.mClipToPadding != null)? true: false;
       return b;
    }
    public int getColumnCountForAccessibility(RecyclerView$t p0,RecyclerView$y p1){
       return -1;
    }
    public int getDecoratedBottom(View p0){
       return (p0.getBottom() + this.getBottomDecorationHeight(p0));
    }
    public void getDecoratedBoundsWithMargins(View p0,Rect p1){
       RecyclerView.getDecoratedBoundsWithMarginsInt(p0, p1);
    }
    public int getDecoratedLeft(View p0){
       return (p0.getLeft() - this.getLeftDecorationWidth(p0));
    }
    public int getDecoratedMeasuredHeight(View p0){
       RecyclerView$LayoutParams mDecorInsets = p0.getLayoutParams().mDecorInsets;
       return ((p0.getMeasuredHeight() + mDecorInsets.top) + mDecorInsets.bottom);
    }
    public int getDecoratedMeasuredWidth(View p0){
       RecyclerView$LayoutParams mDecorInsets = p0.getLayoutParams().mDecorInsets;
       return ((p0.getMeasuredWidth() + mDecorInsets.left) + mDecorInsets.right);
    }
    public int getDecoratedRight(View p0){
       return (p0.getRight() + this.getRightDecorationWidth(p0));
    }
    public int getDecoratedTop(View p0){
       return (p0.getTop() - this.getTopDecorationHeight(p0));
    }
    public View getFocusedChild(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi == null) {
          return null;
       }
       View focusedChild = tmRecyclerVi.getFocusedChild();
       if (focusedChild == null || this.mChildHelper.isHidden(focusedChild)) {
          return null;
       }
       return focusedChild;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public int getHeightMode(){
       return this.mHeightMode;
    }
    public int getItemCount(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       RecyclerView$Adapter adapter = (tmRecyclerVi != null)? tmRecyclerVi.getAdapter(): null;
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       return itemCount;
    }
    public int getItemViewType(View p0){
       return RecyclerView.getChildViewHolderInt(p0).getItemViewType();
    }
    public int getLayoutDirection(){
       return i0.B(this.mRecyclerView);
    }
    public int getLeftDecorationWidth(View p0){
       return p0.getLayoutParams().mDecorInsets.left;
    }
    public int getMinimumHeight(){
       return i0.C(this.mRecyclerView);
    }
    public int getMinimumWidth(){
       return i0.D(this.mRecyclerView);
    }
    public int getPaddingBottom(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int paddingBotto = (tmRecyclerVi != null)? tmRecyclerVi.getPaddingBottom(): 0;
       return paddingBotto;
    }
    public int getPaddingEnd(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int i = (tmRecyclerVi != null)? i0.G(tmRecyclerVi): 0;
       return i;
    }
    public int getPaddingLeft(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int paddingLeft = (tmRecyclerVi != null)? tmRecyclerVi.getPaddingLeft(): 0;
       return paddingLeft;
    }
    public int getPaddingRight(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int paddingRight = (tmRecyclerVi != null)? tmRecyclerVi.getPaddingRight(): 0;
       return paddingRight;
    }
    public int getPaddingStart(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int i = (tmRecyclerVi != null)? i0.H(tmRecyclerVi): 0;
       return i;
    }
    public int getPaddingTop(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       int paddingTop = (tmRecyclerVi != null)? tmRecyclerVi.getPaddingTop(): 0;
       return paddingTop;
    }
    public int getPosition(View p0){
       return p0.getLayoutParams().getViewLayoutPosition();
    }
    public int getRightDecorationWidth(View p0){
       return p0.getLayoutParams().mDecorInsets.right;
    }
    public int getRowCountForAccessibility(RecyclerView$t p0,RecyclerView$y p1){
       return -1;
    }
    public int getSelectionModeForAccessibility(RecyclerView$t p0,RecyclerView$y p1){
       return 0;
    }
    public int getTopDecorationHeight(View p0){
       return p0.getLayoutParams().mDecorInsets.top;
    }
    public void getTransformedBoundingBox(View p0,boolean p1,Rect p2){
       if (p1) {
          RecyclerView$LayoutParams mDecorInsets = p0.getLayoutParams().mDecorInsets;
          p2.set((- mDecorInsets.left), (- mDecorInsets.top), (p0.getWidth() + mDecorInsets.right), (p0.getHeight() + mDecorInsets.bottom));
       }else {
          p2.set(0, 0, p0.getWidth(), p0.getHeight());
       }
       if (this.mRecyclerView != null) {
          Matrix matrix = p0.getMatrix();
          if (matrix != null && !matrix.isIdentity()) {
             RecyclerView mTempRectF = this.mRecyclerView.mTempRectF;
             mTempRectF.set(p2);
             matrix.mapRect(mTempRectF);
             p2.set((int)Math.floor((double)mTempRectF.left), (int)Math.floor((double)mTempRectF.top), (int)Math.ceil((double)mTempRectF.right), (int)Math.ceil((double)mTempRectF.bottom));
          }
       }
       p2.offset(p0.getLeft(), p0.getTop());
       return;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public int getWidthMode(){
       return this.mWidthMode;
    }
    public boolean hasFlexibleChildInBothOrientations(){
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          ViewGroup$LayoutParams layoutParams = this.getChildAt(i).getLayoutParams();
          if (layoutParams.width < null && layoutParams.height < null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean hasFocus(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       boolean b = (tmRecyclerVi != null && tmRecyclerVi.hasFocus())? true: false;
       return b;
    }
    public void ignoreView(View p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (p0.getParent() != tmRecyclerVi || tmRecyclerVi.indexOfChild(p0) == -1) {
          throw new IllegalArgumentException("View should be fully attached to be ignored"+this.mRecyclerView.exceptionLabel());
       }
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       childViewHol.addFlags(128);
       this.mRecyclerView.mViewInfoStore.removeViewHolder(childViewHol);
       return;
    }
    public boolean isAttachedToWindow(){
       return this.mIsAttachedToWindow;
    }
    public boolean isAutoMeasureEnabled(){
       return this.mAutoMeasure;
    }
    public boolean isFocused(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       boolean b = (tmRecyclerVi != null && tmRecyclerVi.isFocused())? true: false;
       return b;
    }
    public final boolean isFocusedChildVisibleAfterScrolling(RecyclerView p0,int p1,int p2){
       View focusedChild = p0.getFocusedChild();
       if (focusedChild == null) {
          return false;
       }
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       int i = this.getHeight() - this.getPaddingBottom();
       RecyclerView mTempRect = this.mRecyclerView.mTempRect;
       this.getDecoratedBoundsWithMargins(focusedChild, mTempRect);
       if ((mTempRect.left - p1) < (this.getWidth() - this.getPaddingRight()) && ((mTempRect.right - p1) > paddingLeft && ((mTempRect.top - p2) >= i || (mTempRect.bottom - p2) <= paddingTop))) {
          return false;
       }
       return true;
    }
    public final boolean isItemPrefetchEnabled(){
       return this.mItemPrefetchEnabled;
    }
    public boolean isLayoutHierarchical(RecyclerView$t p0,RecyclerView$y p1){
       return false;
    }
    public boolean isMeasurementCacheEnabled(){
       return this.mMeasurementCacheEnabled;
    }
    public boolean isSmoothScrolling(){
       RecyclerView$LayoutManager tmSmoothScro = this.mSmoothScroller;
       boolean b = (tmSmoothScro != null && tmSmoothScro.h())? true: false;
       return b;
    }
    public boolean isViewPartiallyVisible(View p0,boolean p1,boolean p2){
       boolean b = (this.mHorizontalBoundCheck.b(p0, 0x6003) && this.mVerticalBoundCheck.b(p0, 0x6003))? true: false;
       if (p1) {
          return b;
       }else {
          return (b ^ 1);
       }
    }
    public void layoutDecorated(View p0,int p1,int p2,int p3,int p4){
       RecyclerView$LayoutParams mDecorInsets = p0.getLayoutParams().mDecorInsets;
       p0.layout((p1 + mDecorInsets.left), (p2 + mDecorInsets.top), (p3 - mDecorInsets.right), (p4 - mDecorInsets.bottom));
    }
    public void layoutDecoratedWithMargins(View p0,int p1,int p2,int p3,int p4){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
       p0.layout(((p1 + mDecorInsets.left) + layoutParams.leftMargin), ((p2 + mDecorInsets.top) + layoutParams.topMargin), ((p3 - mDecorInsets.right) - layoutParams.rightMargin), ((p4 - mDecorInsets.bottom) - layoutParams.bottomMargin));
    }
    public void measureChild(View p0,int p1,int p2){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       Rect itemDecorIns = this.mRecyclerView.getItemDecorInsetsForChild(p0);
       p1 = RecyclerView$LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), ((this.getPaddingLeft() + this.getPaddingRight()) + (p1 + (itemDecorIns.left + itemDecorIns.right))), layoutParams.width, this.canScrollHorizontally());
       p2 = RecyclerView$LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), ((this.getPaddingTop() + this.getPaddingBottom()) + (p2 + (itemDecorIns.top + itemDecorIns.bottom))), layoutParams.height, this.canScrollVertically());
       if (this.shouldMeasureChild(p0, p1, p2, layoutParams)) {
          p0.measure(p1, p2);
       }
       return;
    }
    public void measureChildWithMargins(View p0,int p1,int p2){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       Rect itemDecorIns = this.mRecyclerView.getItemDecorInsetsForChild(p0);
       p1 = RecyclerView$LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), ((((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin) + (p1 + (itemDecorIns.left + itemDecorIns.right))), layoutParams.width, this.canScrollHorizontally());
       p2 = RecyclerView$LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), ((((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin) + (p2 + (itemDecorIns.top + itemDecorIns.bottom))), layoutParams.height, this.canScrollVertically());
       if (this.shouldMeasureChild(p0, p1, p2, layoutParams)) {
          p0.measure(p1, p2);
       }
       return;
    }
    public void moveView(int p0,int p1){
       View childAt = this.getChildAt(p0);
       if (childAt == null) {
          throw new IllegalArgumentException("Cannot move a child from non-existing index:"+p0+this.mRecyclerView.toString());
       }
       this.detachViewAt(p0);
       this.attachView(childAt, p1);
       return;
    }
    public void offsetChildrenHorizontal(int p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          tmRecyclerVi.offsetChildrenHorizontal(p0);
       }
       return;
    }
    public void offsetChildrenVertical(int p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          tmRecyclerVi.offsetChildrenVertical(p0);
       }
       return;
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
    }
    public boolean onAddFocusables(RecyclerView p0,ArrayList p1,int p2,int p3){
       return false;
    }
    public void onAttachedToWindow(RecyclerView p0){
    }
    public void onDetachedFromWindow(RecyclerView p0){
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       this.onDetachedFromWindow(p0);
    }
    public View onFocusSearchFailed(View p0,int p1,RecyclerView$t p2,RecyclerView$y p3){
       return null;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       this.onInitializeAccessibilityEvent(tmRecyclerVi.mRecycler, tmRecyclerVi.mState, p0);
    }
    public void onInitializeAccessibilityEvent(RecyclerView$t p0,RecyclerView$y p1,AccessibilityEvent p2){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null && p2 != null) {
          int i = 1;
          if (tmRecyclerVi.canScrollVertically(i) || (this.mRecyclerView.canScrollVertically(-1) || (!this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(i)))) {
             i = false;
          }
       label_0029 :
          p2.setScrollable(i);
          RecyclerView mAdapter = this.mRecyclerView.mAdapter;
          if (mAdapter != null) {
             p2.setItemCount(mAdapter.getItemCount());
          }
       }
    label_0039 :
       return;
    }
    public void onInitializeAccessibilityNodeInfo(RecyclerView$t p0,RecyclerView$y p1,d p2){
       int i = -1;
       boolean b = true;
       if (this.mRecyclerView.canScrollVertically(i) || this.mRecyclerView.canScrollHorizontally(i)) {
          p2.a(8192);
          p2.w0(b);
       }
       if (this.mRecyclerView.canScrollVertically(b) || this.mRecyclerView.canScrollHorizontally(b)) {
          p2.a(4096);
          p2.w0(b);
       }
       p2.c0(d$b.a(this.getRowCountForAccessibility(p0, p1), this.getColumnCountForAccessibility(p0, p1), this.isLayoutHierarchical(p0, p1), this.getSelectionModeForAccessibility(p0, p1)));
       return;
    }
    public void onInitializeAccessibilityNodeInfo(d p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       this.onInitializeAccessibilityNodeInfo(tmRecyclerVi.mRecycler, tmRecyclerVi.mState, p0);
    }
    public void onInitializeAccessibilityNodeInfoForItem(View p0,d p1){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol != null && (!childViewHol.isRemoved() && !this.mChildHelper.isHidden(childViewHol.itemView))) {
          RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
          this.onInitializeAccessibilityNodeInfoForItem(tmRecyclerVi.mRecycler, tmRecyclerVi.mState, p0, p1);
       }
    label_001f :
       return;
    }
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView$t p0,RecyclerView$y p1,View p2,d p3){
    }
    public View onInterceptFocusSearch(View p0,int p1){
       return null;
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
    }
    public void onItemsChanged(RecyclerView p0){
    }
    public void onItemsMoved(RecyclerView p0,int p1,int p2,int p3){
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2){
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2,Object p3){
       this.onItemsUpdated(p0, p1, p2);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
    }
    public void onLayoutCompleted(RecyclerView$y p0){
    }
    public void onMeasure(RecyclerView$t p0,RecyclerView$y p1,int p2,int p3){
       this.mRecyclerView.defaultOnMeasure(p2, p3);
    }
    public boolean onRequestChildFocus(RecyclerView p0,View p1,View p2){
       boolean b = (this.isSmoothScrolling() || p0.isComputingLayout())? true: false;
       return b;
    }
    public boolean onRequestChildFocus(RecyclerView p0,RecyclerView$y p1,View p2,View p3){
       return this.onRequestChildFocus(p0, p2, p3);
    }
    public void onRestoreInstanceState(Parcelable p0){
    }
    public Parcelable onSaveInstanceState(){
       return null;
    }
    public void onScrollStateChanged(int p0){
    }
    public void onSmoothScrollerStopped(RecyclerView$x p0){
       if (this.mSmoothScroller == p0) {
          this.mSmoothScroller = null;
       }
       return;
    }
    public boolean performAccessibilityAction(int p0,Bundle p1){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       return this.performAccessibilityAction(tmRecyclerVi.mRecycler, tmRecyclerVi.mState, p0, p1);
    }
    public boolean performAccessibilityAction(RecyclerView$t p0,RecyclerView$y p1,int p2,Bundle p3){
       int i;
       int i1;
       int i2;
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi == null) {
          return false;
       }
       if (p2 != 4096) {
          if (p2 != 8192) {
             i = 0;
          }else {
             p2 = -1;
             i1 = (tmRecyclerVi.canScrollVertically(p2))? - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()): 0;
             if (this.mRecyclerView.canScrollHorizontally(p2)) {
                p2 = - ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
             label_006e :
                i = i1;
                i2 = p2;
             }else {
             label_0071 :
                i = i1;
                i2 = 0;
             }
          }
       }else if(tmRecyclerVi.canScrollVertically(true)){
          i1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
       }else {
          i1 = 0;
       }
       if (this.mRecyclerView.canScrollHorizontally(true)) {
          p2 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
          goto label_006e ;
       }else {
          goto label_0071 ;
       }
       if (!i && !0) {
          return false;
       }else {
          this.mRecyclerView.smoothScrollBy(0, i, null, Integer.MIN_VALUE, true);
          return true;
       }
    }
    public boolean performAccessibilityActionForItem(View p0,int p1,Bundle p2){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       return this.performAccessibilityActionForItem(tmRecyclerVi.mRecycler, tmRecyclerVi.mState, p0, p1, p2);
    }
    public boolean performAccessibilityActionForItem(RecyclerView$t p0,RecyclerView$y p1,View p2,int p3,Bundle p4){
       return false;
    }
    public void postOnAnimation(Runnable p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          i0.k0(tmRecyclerVi, p0);
       }
       return;
    }
    public void removeAllViews(){
       for (int i = this.getChildCount() - 1; i >= 0; i = i - 1) {
          this.mChildHelper.removeViewAt(i);
       }
       return;
    }
    public void removeAndRecycleAllViews(RecyclerView$t p0){
       int i = this.getChildCount() - 1;
       while (i >= 0) {
          if (!RecyclerView.getChildViewHolderInt(this.getChildAt(i)).shouldIgnore()) {
             this.removeAndRecycleViewAt(i, p0);
          }
          i = i - 1;
       }
       return;
    }
    public void removeAndRecycleScrapInt(RecyclerView$t p0){
       int i = p0.j();
       int i1 = i - 1;
       while (i1 >= 0) {
          View view = p0.n(i1);
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(view);
          if (!childViewHol.shouldIgnore()) {
             boolean b = false;
             childViewHol.setIsRecyclable(b);
             if (childViewHol.isTmpDetached()) {
                this.mRecyclerView.removeDetachedView(view, b);
             }
             RecyclerView mItemAnimato = this.mRecyclerView.mItemAnimator;
             if (mItemAnimato != null) {
                mItemAnimato.j(childViewHol);
             }
             childViewHol.setIsRecyclable(true);
             p0.y(view);
          }
          i1 = i1 - 1;
       }
       p0.e();
       if (i > 0) {
          this.mRecyclerView.invalidate();
       }
       return;
    }
    public void removeAndRecycleView(View p0,RecyclerView$t p1){
       this.removeView(p0);
       p1.B(p0);
    }
    public void removeAndRecycleViewAt(int p0,RecyclerView$t p1){
       this.removeViewAt(p0);
       p1.B(this.getChildAt(p0));
    }
    public boolean removeCallbacks(Runnable p0){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          return tmRecyclerVi.removeCallbacks(p0);
       }
       return false;
    }
    public void removeDetachedView(View p0){
       this.mRecyclerView.removeDetachedView(p0, false);
    }
    public void removeView(View p0){
       this.mChildHelper.removeView(p0);
    }
    public void removeViewAt(int p0){
       if (this.getChildAt(p0) != null) {
          this.mChildHelper.removeViewAt(p0);
       }
       return;
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3){
       return this.requestChildRectangleOnScreen(p0, p1, p2, p3, false);
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       int[] childRectang = this.getChildRectangleOnScreenScrollAmount(p1, p2);
       int i = childRectang[0];
       int i1 = childRectang[1];
       if (p4 && (!this.isFocusedChildVisibleAfterScrolling(p0, i, i1) || (!i && !i1))) {
          return 0;
       }
       if (p3) {
          p0.scrollBy(i, i1);
       }else {
          p0.smoothScrollBy(i, i1);
       }
       return 1;
    }
    public void requestLayout(){
       RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
       if (tmRecyclerVi != null) {
          tmRecyclerVi.requestLayout();
       }
       return;
    }
    public void requestSimpleAnimationsInNextLayout(){
       this.mRequestedSimpleAnimations = true;
    }
    public final void scrapOrRecycleView(RecyclerView$t p0,int p1,View p2){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p2);
       if (childViewHol.shouldIgnore()) {
          return;
       }
       if (childViewHol.isInvalid() && (!childViewHol.isRemoved() && !this.mRecyclerView.mAdapter.j0())) {
          this.removeViewAt(p1);
          p0.C(childViewHol);
       }else {
          this.detachViewAt(p1);
          p0.D(p2);
          this.mRecyclerView.mViewInfoStore.onViewDetached(childViewHol);
       }
       return;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return 0;
    }
    public void scrollToPosition(int p0){
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return 0;
    }
    public void setAutoMeasureEnabled(boolean p0){
       this.mAutoMeasure = p0;
    }
    public void setExactMeasureSpecsFrom(RecyclerView p0){
       this.setMeasureSpecs(View$MeasureSpec.makeMeasureSpec(p0.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(p0.getHeight(), 0x40000000));
    }
    public final void setItemPrefetchEnabled(boolean p0){
       if (p0 != this.mItemPrefetchEnabled) {
          this.mItemPrefetchEnabled = p0;
          this.mPrefetchMaxCountObserved = 0;
          RecyclerView$LayoutManager tmRecyclerVi = this.mRecyclerView;
          if (tmRecyclerVi != null) {
             tmRecyclerVi.mRecycler.K();
          }
       }
       return;
    }
    public void setMeasureSpecs(int p0,int p1){
       this.mWidth = View$MeasureSpec.getSize(p0);
       p0 = View$MeasureSpec.getMode(p0);
       this.mWidthMode = p0;
       if (!p0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
          this.mWidth = 0;
       }
       this.mHeight = View$MeasureSpec.getSize(p1);
       p0 = View$MeasureSpec.getMode(p1);
       this.mHeightMode = p0;
       if (!p0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
          this.mHeight = 0;
       }
       return;
    }
    public void setMeasuredDimension(int p0,int p1){
       RecyclerView.access$300(this.mRecyclerView, p0, p1);
    }
    public void setMeasuredDimension(Rect p0,int p1,int p2){
       this.setMeasuredDimension(RecyclerView$LayoutManager.chooseSize(p1, ((p0.width() + this.getPaddingLeft()) + this.getPaddingRight()), this.getMinimumWidth()), RecyclerView$LayoutManager.chooseSize(p2, ((p0.height() + this.getPaddingTop()) + this.getPaddingBottom()), this.getMinimumHeight()));
    }
    public void setMeasuredDimensionFromChildren(int p0,int p1){
       int childCount = this.getChildCount();
       if (!childCount) {
          this.mRecyclerView.defaultOnMeasure(p0, p1);
          return;
       }else {
          int i = 0;
          int i1 = Integer.MIN_VALUE;
          int i2 = Integer.MIN_VALUE;
          int i3 = Integer.MAX_VALUE;
          int i4 = Integer.MAX_VALUE;
          while (i < childCount) {
             RecyclerView mTempRect = this.mRecyclerView.mTempRect;
             this.getDecoratedBoundsWithMargins(this.getChildAt(i), mTempRect);
             Rect left = mTempRect.left;
             if (left < i3) {
                i3 = left;
             }
             left = mTempRect.right;
             if (left > i1) {
                i1 = left;
             }
             left = mTempRect.top;
             if (left < i4) {
                i4 = left;
             }
             left = mTempRect.bottom;
             if (left > i2) {
                i2 = left;
             }
             i = i + 1;
          }
          this.mRecyclerView.mTempRect.set(i3, i4, i1, i2);
          this.setMeasuredDimension(this.mRecyclerView.mTempRect, p0, p1);
          return;
       }
    }
    public void setMeasurementCacheEnabled(boolean p0){
       this.mMeasurementCacheEnabled = p0;
    }
    public void setRecyclerView(RecyclerView p0){
       if (p0 == null) {
          this.mRecyclerView = null;
          this.mChildHelper = null;
          int i = 0;
          this.mWidth = i;
          this.mHeight = i;
       }else {
          this.mRecyclerView = p0;
          this.mChildHelper = p0.mChildHelper;
          this.mWidth = p0.getWidth();
          this.mHeight = p0.getHeight();
       }
       this.mWidthMode = 0x40000000;
       this.mHeightMode = 0x40000000;
       return;
    }
    public boolean shouldMeasureChild(View p0,int p1,int p2,RecyclerView$LayoutParams p3){
       boolean b = (!p0.isLayoutRequested() && (this.mMeasurementCacheEnabled != null && (!RecyclerView$LayoutManager.isMeasurementUpToDate(p0.getWidth(), p1, p3.width) || !RecyclerView$LayoutManager.isMeasurementUpToDate(p0.getHeight(), p2, p3.height))))? true: false;
       return b;
    }
    public boolean shouldMeasureTwice(){
       return false;
    }
    public boolean shouldReMeasureChild(View p0,int p1,int p2,RecyclerView$LayoutParams p3){
       boolean b = (this.mMeasurementCacheEnabled != null && (!RecyclerView$LayoutManager.isMeasurementUpToDate(p0.getMeasuredWidth(), p1, p3.width) || !RecyclerView$LayoutManager.isMeasurementUpToDate(p0.getMeasuredHeight(), p2, p3.height)))? true: false;
       return b;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
    }
    public void startSmoothScroll(RecyclerView$x p0){
       RecyclerView$LayoutManager tmSmoothScro = this.mSmoothScroller;
       if (tmSmoothScro != null && (p0 != tmSmoothScro && tmSmoothScro.h())) {
          this.mSmoothScroller.r();
       }
    label_0011 :
       this.mSmoothScroller = p0;
       p0.q(this.mRecyclerView, this);
       return;
    }
    public void stopIgnoringView(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       childViewHol.stopIgnoring();
       childViewHol.resetInternal();
       childViewHol.addFlags(4);
    }
    public void stopSmoothScroller(){
       RecyclerView$LayoutManager tmSmoothScro = this.mSmoothScroller;
       if (tmSmoothScro != null) {
          tmSmoothScro.r();
       }
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       return false;
    }
}
