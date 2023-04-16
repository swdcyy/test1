package androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import android.graphics.Rect;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$b;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$a;
import androidx.recyclerview.widget.n;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$c;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState;
import androidx.recyclerview.widget.s;
import java.lang.String;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.util.ArrayList;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import java.util.Arrays;
import androidx.recyclerview.widget.w;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView$t;
import java.util.BitSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import androidx.recyclerview.widget.o;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import android.view.View$MeasureSpec;

public class StaggeredGridLayoutManager extends RecyclerView$LayoutManager implements RecyclerView$x$b	// class@0008d9
{
    public final StaggeredGridLayoutManager$b mAnchorInfo;
    public final Runnable mCheckForGapsRunnable;
    public int mFullSizeSpec;
    public int mGapStrategy;
    public boolean mLaidOutInvalidFullSpan;
    public boolean mLastLayoutFromEnd;
    public boolean mLastLayoutRTL;
    public final n mLayoutState;
    public StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup;
    public int mOrientation;
    public StaggeredGridLayoutManager$SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public int[] mPrefetchDistances;
    public s mPrimaryOrientation;
    public BitSet mRemainingSpans;
    public boolean mReverseLayout;
    public s mSecondaryOrientation;
    public boolean mShouldReverseLayout;
    public int mSizePerSpan;
    public boolean mSmoothScrollbarEnabled;
    public int mSpanCount;
    public StaggeredGridLayoutManager$c[] mSpans;
    public final Rect mTmpRect;
    public static final int GAP_HANDLING_LAZY = 1;

    public void StaggeredGridLayoutManager(int p0,int p1){
       super();
       this.mSpanCount = -1;
       this.mReverseLayout = false;
       this.mShouldReverseLayout = false;
       this.mPendingScrollPosition = -1;
       this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
       this.mLazySpanLookup = new StaggeredGridLayoutManager$LazySpanLookup();
       this.mGapStrategy = 2;
       this.mTmpRect = new Rect();
       this.mAnchorInfo = new StaggeredGridLayoutManager$b(this);
       this.mLaidOutInvalidFullSpan = false;
       this.mSmoothScrollbarEnabled = true;
       this.mCheckForGapsRunnable = new StaggeredGridLayoutManager$a(this);
       this.mOrientation = p1;
       this.setSpanCount(p0);
       this.mLayoutState = new n();
       this.createOrientationHelpers();
    }
    public void StaggeredGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super();
       this.mSpanCount = -1;
       this.mReverseLayout = false;
       this.mShouldReverseLayout = false;
       this.mPendingScrollPosition = -1;
       this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
       this.mLazySpanLookup = new StaggeredGridLayoutManager$LazySpanLookup();
       this.mGapStrategy = 2;
       this.mTmpRect = new Rect();
       this.mAnchorInfo = new StaggeredGridLayoutManager$b(this);
       this.mLaidOutInvalidFullSpan = false;
       this.mSmoothScrollbarEnabled = true;
       this.mCheckForGapsRunnable = new StaggeredGridLayoutManager$a(this);
       RecyclerView$LayoutManager$Properties properties = RecyclerView$LayoutManager.getProperties(p0, p1, p2, p3);
       this.setOrientation(properties.orientation);
       this.setSpanCount(properties.spanCount);
       this.setReverseLayout(properties.reverseLayout);
       this.mLayoutState = new n();
       this.createOrientationHelpers();
    }
    public final void appendViewToAllSpans(View p0){
       for (int i = this.mSpanCount - 1; i >= 0; i = i - 1) {
          this.mSpans[i].a(p0);
       }
       return;
    }
    public final void applyPendingSavedState(StaggeredGridLayoutManager$b p0){
       StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
       StaggeredGridLayoutManager$SavedState d = tmPendingSav.d;
       if (d > null) {
          if (d == this.mSpanCount) {
             for (int i = 0; i < this.mSpanCount; i = i + 1) {
                this.mSpans[i].e();
                StaggeredGridLayoutManager tmPendingSav1 = this.mPendingSavedState;
                int i1 = tmPendingSav1.e[i];
                if (i1 != Integer.MIN_VALUE) {
                   int i2 = (tmPendingSav1.j != null)? this.mPrimaryOrientation.i(): this.mPrimaryOrientation.n();
                   i1 = i1 + i2;
                }
                this.mSpans[i].A(i1);
             }
          }else {
             tmPendingSav.b();
             tmPendingSav = this.mPendingSavedState;
             tmPendingSav.b = tmPendingSav.c;
          }
       }
       tmPendingSav = this.mPendingSavedState;
       this.mLastLayoutRTL = tmPendingSav.k;
       this.setReverseLayout(tmPendingSav.i);
       this.resolveShouldLayoutReverse();
       tmPendingSav = this.mPendingSavedState;
       d = tmPendingSav.b;
       if (d != -1) {
          this.mPendingScrollPosition = d;
          p0.c = tmPendingSav.j;
       }else {
          p0.c = this.mShouldReverseLayout;
       }
       if (tmPendingSav.f > 1) {
          StaggeredGridLayoutManager tmLazySpanLo = this.mLazySpanLookup;
          tmLazySpanLo.a = tmPendingSav.g;
          tmLazySpanLo.b = tmPendingSav.h;
       }
       return;
    }
    public boolean areAllEndsEqual(){
       int i = this.mSpans[0].q(Integer.MIN_VALUE);
       int i1 = 1;
       while (true) {
          if (i1 >= this.mSpanCount) {
             return true;
          }
          if (this.mSpans[i1].q(Integer.MIN_VALUE) != i) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return 0;
    }
    public boolean areAllStartsEqual(){
       int i = this.mSpans[0].u(Integer.MIN_VALUE);
       int i1 = 1;
       while (true) {
          if (i1 >= this.mSpanCount) {
             return true;
          }
          if (this.mSpans[i1].u(Integer.MIN_VALUE) != i) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return 0;
    }
    public void assertNotInLayoutOrScroll(String p0){
       if (this.mPendingSavedState == null) {
          super.assertNotInLayoutOrScroll(p0);
       }
       return;
    }
    public final void attachViewToSpans(View p0,StaggeredGridLayoutManager$LayoutParams p1,n p2){
       if (p2.e == 1) {
          if (p1.b != null) {
             this.appendViewToAllSpans(p0);
          }else {
             p1.a.a(p0);
          }
       }else if(p1.b != null){
          this.prependViewToAllSpans(p0);
       }else {
          p1.a.z(p0);
       }
       return;
    }
    public final int calculateScrollDirectionForPosition(int p0){
       int i = -1;
       if (!this.getChildCount()) {
          if (this.mShouldReverseLayout != null) {
             i = 1;
          }
          return i;
       }else if(p0 < this.getFirstChildPosition()){
          p0 = 1;
       }else {
          p0 = 0;
       }
       if (p0 == this.mShouldReverseLayout) {
          i = 1;
       }
       return i;
    }
    public boolean canScrollHorizontally(){
       boolean b = (this.mOrientation == null)? true: false;
       return b;
    }
    public boolean canScrollVertically(){
       boolean b = true;
       if (this.mOrientation == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean checkForGaps(){
       int lastChildPos;
       int firstChildPo;
       int i;
       boolean b = false;
       if (this.getChildCount() && (this.mGapStrategy == null || !this.isAttachedToWindow())) {
          return b;
       }
       if (this.mShouldReverseLayout != null) {
          lastChildPos = this.getLastChildPosition();
          firstChildPo = this.getFirstChildPosition();
       }else {
          lastChildPos = this.getFirstChildPosition();
          firstChildPo = this.getLastChildPosition();
       }
       if (!lastChildPos && this.hasGapsToFix() != null) {
          this.mLazySpanLookup.b();
          this.requestSimpleAnimationsInNextLayout();
          this.requestLayout();
          return true;
       }else if(this.mLaidOutInvalidFullSpan == null){
          return b;
       }else if(this.mShouldReverseLayout != null){
          i = -1;
       }else {
          i = 1;
       }
       firstChildPo = firstChildPo + true;
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.mLazySpanLookup.e(lastChildPos, firstChildPo, i, true);
       if (lazySpanLook == null) {
          this.mLaidOutInvalidFullSpan = b;
          this.mLazySpanLookup.d(firstChildPo);
          return b;
       }else {
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook1 = this.mLazySpanLookup.e(lastChildPos, lazySpanLook.b, (i * -1), true);
          if (lazySpanLook1 == null) {
             this.mLazySpanLookup.d(lazySpanLook.b);
          }else {
             this.mLazySpanLookup.d((lazySpanLook1.b + true));
          }
          this.requestSimpleAnimationsInNextLayout();
          this.requestLayout();
          return true;
       }
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       return p0 instanceof StaggeredGridLayoutManager$LayoutParams;
    }
    public final boolean checkSpanForGap(StaggeredGridLayoutManager$c p0){
       int i = 0;
       if (this.mShouldReverseLayout != null) {
          if (p0.p() < this.mPrimaryOrientation.i()) {
             StaggeredGridLayoutManager$c a = p0.a;
             return (p0.s(a.get((a.size() - 1))).b ^ 0x01);
          }
       }else if(p0.t() > this.mPrimaryOrientation.n()){
          return (p0.s(p0.a.get(i)).b ^ 0x01);
       }
       return i;
    }
    public void collectAdjacentPrefetchPositions(int p0,int p1,RecyclerView$y p2,RecyclerView$LayoutManager$c p3){
       int[] ointArray;
       n f;
       int i1;
       int i2;
       if (this.mOrientation == null) {
       }else {
          p0 = p1;
       }
       if (this.getChildCount() && p0) {
          this.prepareLayoutStateForDelta(p0, p2);
          StaggeredGridLayoutManager tmPrefetchDi = this.mPrefetchDistances;
          if (tmPrefetchDi == null || tmPrefetchDi.length < this.mSpanCount) {
             ointArray = new int[this.mSpanCount];
             this.mPrefetchDistances = ointArray;
          }
          ointArray = 0;
          p1 = 0;
          int i = 0;
          while (p1 < this.mSpanCount) {
             StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
             if (tmLayoutStat.d == -1) {
                f = tmLayoutStat.f;
                i1 = this.mSpans[p1].u(f);
             }else {
                i2 = this.mSpans[p1].q(tmLayoutStat.g);
                i1 = this.mLayoutState.g;
             }
             i2 = f - i1;
             if (i2 >= 0) {
                this.mPrefetchDistances[i] = i2;
                i = i + 1;
             }
             p1++;
          }
          Arrays.sort(this.mPrefetchDistances, ointArray, i);
          for (; ointArray < i && this.mLayoutState.a(p2); ointArray++) {
             p3.a(this.mLayoutState.c, this.mPrefetchDistances[ointArray]);
             StaggeredGridLayoutManager tmLayoutStat1 = this.mLayoutState;
             i2 = tmLayoutStat1.c + tmLayoutStat1.d;
             tmLayoutStat1.c = i2;
          }
       }
       return;
    }
    public int computeHorizontalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public final int computeScrollExtent(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       return w.a(p0, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart((this.mSmoothScrollbarEnabled ^ 0x01)), this.findFirstVisibleItemClosestToEnd((this.mSmoothScrollbarEnabled ^ 0x01)), this, this.mSmoothScrollbarEnabled);
    }
    public final int computeScrollOffset(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       return w.b(p0, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart((this.mSmoothScrollbarEnabled ^ 0x01)), this.findFirstVisibleItemClosestToEnd((this.mSmoothScrollbarEnabled ^ 0x01)), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }
    public final int computeScrollRange(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       return w.c(p0, this.mPrimaryOrientation, this.findFirstVisibleItemClosestToStart((this.mSmoothScrollbarEnabled ^ 0x01)), this.findFirstVisibleItemClosestToEnd((this.mSmoothScrollbarEnabled ^ 0x01)), this, this.mSmoothScrollbarEnabled);
    }
    public PointF computeScrollVectorForPosition(int p0){
       p0 = this.calculateScrollDirectionForPosition(p0);
       PointF pointF = new PointF();
       if (!p0) {
          return null;
       }
       if (this.mOrientation == null) {
          pointF.x = (float)p0;
          pointF.y = 0;
       }else {
          pointF.x = 0;
          pointF.y = (float)p0;
       }
       return pointF;
    }
    public int computeVerticalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public final int convertFocusDirectionToLayoutDirection(int p0){
       int i = -1;
       int i1 = 1;
       if (p0 != i1) {
          if (p0 != 2) {
             if (p0 != 17) {
                if (p0 != 33) {
                   if (p0 != 66) {
                      if (p0 != 130) {
                         return Integer.MIN_VALUE;
                      }else if(this.mOrientation == i1){
                         i1 = Integer.MIN_VALUE;
                      }
                      return i1;
                   }else if(this.mOrientation == null){
                      i1 = Integer.MIN_VALUE;
                   }
                   return i1;
                }else if(this.mOrientation == i1){
                   i = Integer.MIN_VALUE;
                }
                return i;
             }else if(this.mOrientation == null){
                i = Integer.MIN_VALUE;
             }
             return i;
          }else if(this.mOrientation == i1){
             return i1;
          }else if(this.isLayoutRTL()){
             return i;
          }else {
             return i1;
          }
       }else if(this.mOrientation == i1){
          return i;
       }else if(this.isLayoutRTL()){
          return i1;
       }else {
          return i;
       }
    }
    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromEnd(int p0){
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
       int[] ointArray = new int[this.mSpanCount];
       lazySpanLook.d = ointArray;
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          int i1 = p0 - this.mSpans[i].q(p0);
          lazySpanLook.d[i] = i1;
       }
       return lazySpanLook;
    }
    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromStart(int p0){
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
       int[] ointArray = new int[this.mSpanCount];
       lazySpanLook.d = ointArray;
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          int i1 = this.mSpans[i].u(p0) - p0;
          lazySpanLook.d[i] = i1;
       }
       return lazySpanLook;
    }
    public final void createOrientationHelpers(){
       this.mPrimaryOrientation = s.b(this, this.mOrientation);
       this.mSecondaryOrientation = s.b(this, (this.mOrientation - 1));
    }
    public final int fill(RecyclerView$t p0,n p1,RecyclerView$y p2){
       int i1;
       int i2;
       int i5;
       object oobject;
       int i7;
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook;
       int i8;
       StaggeredGridLayoutManager staggeredGri = this;
       RecyclerView$t ot = p0;
       n on = p1;
       int i = 0;
       staggeredGri.mRemainingSpans.set(i, staggeredGri.mSpanCount, true);
       if (staggeredGri.mLayoutState.i != null) {
          if (on.e == true) {
             i1 = Integer.MAX_VALUE;
          }else {
             i1 = Integer.MIN_VALUE;
          }
       }else if(on.e == true){
          i2 = on.g + on.b;
       }else {
          i2 = on.f - on.b;
       }
       i1 = i2;
       staggeredGri.updateAllRemainingSpans(on.e, i1);
       i2 = (staggeredGri.mShouldReverseLayout != null)? staggeredGri.mPrimaryOrientation.i(): staggeredGri.mPrimaryOrientation.n();
       int i3 = i2;
       ViewGroup$LayoutParams layoutParams = null;
       int i4 = -1;
       while (p1.a(p2) && (staggeredGri.mLayoutState.i != null || !staggeredGri.mRemainingSpans.isEmpty())) {
          View view = on.b(ot);
          ViewGroup$LayoutParams layoutParams1 = view.getLayoutParams();
          i2 = layoutParams1.getViewLayoutPosition();
          i5 = staggeredGri.mLazySpanLookup.g(i2);
          int i6 = (i5 == i4)? 1: 0;
          if (i6) {
             oobject = (layoutParams1.b != null)? staggeredGri.mSpans[i]: staggeredGri.getNextSpan(on);
             staggeredGri.mLazySpanLookup.n(i2, oobject);
          }else {
             oobject = staggeredGri.mSpans[i5];
          }
          object oobject1 = oobject;
          layoutParams1.a = oobject1;
          if (on.e == true) {
             staggeredGri.addView(view);
          }else {
             staggeredGri.addView(view, i);
          }
          staggeredGri.measureChildWithDecorationsAndMargin(view, layoutParams1, i);
          if (on.e == true) {
             i5 = (layoutParams1.b != null)? staggeredGri.getMaxEnd(i3): oobject1.q(i3);
             i7 = staggeredGri.mPrimaryOrientation.e(view) + i5;
             if (i6 && layoutParams1.b != null) {
                lazySpanLook = staggeredGri.createFullSpanItemFromEnd(i5);
                lazySpanLook.c = i4;
                lazySpanLook.b = i2;
                staggeredGri.mLazySpanLookup.a(lazySpanLook);
             }
             i8 = i7;
             i7 = i5;
          }else if(layoutParams1.b != null){
             i5 = staggeredGri.getMinStart(i3);
          }else {
             i5 = oobject1.u(i3);
          }
          i7 = i5 - staggeredGri.mPrimaryOrientation.e(view);
          if (i6 && layoutParams1.b != null) {
             lazySpanLook = staggeredGri.createFullSpanItemFromStart(i5);
             lazySpanLook.c = 1;
             lazySpanLook.b = i2;
             staggeredGri.mLazySpanLookup.a(lazySpanLook);
          }
          i8 = i5;
          if (layoutParams1.b != null && on.d == i4) {
             if (i6) {
                staggeredGri.mLaidOutInvalidFullSpan = true;
             }else if(on.e == true){
                i5 = this.areAllEndsEqual();
             }else {
                i5 = this.areAllStartsEqual();
             }
             i5 = i5 ^ true;
             if (i5) {
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook1 = staggeredGri.mLazySpanLookup.f(i2);
                if (lazySpanLook1 != null) {
                   lazySpanLook1.e = true;
                }
                staggeredGri.mLaidOutInvalidFullSpan = true;
             }
          }
          staggeredGri.attachViewToSpans(view, layoutParams1, on);
          if (this.isLayoutRTL() && staggeredGri.mOrientation == true) {
             if (layoutParams1.b != null) {
                i2 = staggeredGri.mSecondaryOrientation.i();
             }else {
                i5 = staggeredGri.mSpanCount - true;
                i5 = i5 - oobject1.e;
                i5 = i5 * staggeredGri.mSizePerSpan;
                i2 = staggeredGri.mSecondaryOrientation.i() - i5;
             }
             i5 = i2 - staggeredGri.mSecondaryOrientation.e(view);
             i = i2;
             i6 = i5;
          }else if(layoutParams1.b != null){
             i2 = staggeredGri.mSecondaryOrientation.n();
          }else {
             i2 = oobject1.e * staggeredGri.mSizePerSpan;
             i2 = i2 + staggeredGri.mSecondaryOrientation.n();
          }
          i5 = staggeredGri.mSecondaryOrientation.e(view) + i2;
          i6 = i2;
          i = i5;
          if (staggeredGri.mOrientation == true) {
             this.layoutDecoratedWithMargins(view, i6, i7, i, i8);
          }else {
             this.layoutDecoratedWithMargins(view, i7, i6, i8, i);
          }
          if (layoutParams1.b != null) {
             staggeredGri.updateAllRemainingSpans(staggeredGri.mLayoutState.e, i1);
          }else {
             staggeredGri.updateRemainingSpans(oobject1, staggeredGri.mLayoutState.e, i1);
          }
          staggeredGri.recycle(ot, staggeredGri.mLayoutState);
          if (staggeredGri.mLayoutState.h != null && view.hasFocusable()) {
             if (layoutParams1.b != null) {
                staggeredGri.mRemainingSpans.clear();
             }else {
                staggeredGri.mRemainingSpans.set(oobject1.e, false);
             label_01ca :
                layoutParams = 1;
                i = 0;
             }
          }
          i6 = 0;
          goto label_01ca ;
       }
       if (layoutParams == null) {
          staggeredGri.recycle(ot, staggeredGri.mLayoutState);
       }
       i5 = (staggeredGri.mLayoutState.e == i4)? staggeredGri.mPrimaryOrientation.n() - staggeredGri.getMinStart(staggeredGri.mPrimaryOrientation.n()): staggeredGri.getMaxEnd(staggeredGri.mPrimaryOrientation.i()) - staggeredGri.mPrimaryOrientation.i();
       i = (i5 > 0)? Math.min(on.b, i5): 0;
       return i;
    }
    public int[] findFirstCompletelyVisibleItemPositions(int[] p0){
       if (p0 == null) {
          p0 = new int[this.mSpanCount];
       }else if(p0.length >= this.mSpanCount){
          throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:"+this.mSpanCount+", array size:"+p0.length);
       }
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          p0[i] = this.mSpans[i].f();
       }
       return p0;
    }
    public final int findFirstReferenceChildPosition(int p0){
       int position;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return 0;
          }
          position = this.getPosition(this.getChildAt(i));
          if (position >= 0 && position < p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return position;
    }
    public View findFirstVisibleItemClosestToEnd(boolean p0){
       View childAt;
       int i = this.mPrimaryOrientation.n();
       int i1 = this.mPrimaryOrientation.i();
       int i2 = this.getChildCount() - 1;
       View view = null;
       while (true) {
          if (i2 < 0) {
             return view;
          }
          childAt = this.getChildAt(i2);
          int i3 = this.mPrimaryOrientation.g(childAt);
          int i4 = this.mPrimaryOrientation.d(childAt);
          if (i4 > i && i3 < i1) {
             if (i4 <= i1 || !p0) {
                break ;
             }else if(view == null){
                view = childAt;
             }
          }
          i2 = i2 - 1;
       }
       return childAt;
    }
    public View findFirstVisibleItemClosestToStart(boolean p0){
       View childAt;
       int i = this.mPrimaryOrientation.n();
       int i1 = this.mPrimaryOrientation.i();
       int childCount = this.getChildCount();
       View view = null;
       int i2 = 0;
       while (true) {
          if (i2 >= childCount) {
             return view;
          }
          childAt = this.getChildAt(i2);
          int i3 = this.mPrimaryOrientation.g(childAt);
          if (this.mPrimaryOrientation.d(childAt) > i && i3 < i1) {
             if (i3 >= i || !p0) {
                break ;
             }else if(view == null){
                view = childAt;
             }
          }
          i2 = i2 + 1;
       }
       return childAt;
    }
    public int findFirstVisibleItemPositionInt(){
       View view = (this.mShouldReverseLayout != null)? this.findFirstVisibleItemClosestToEnd(true): this.findFirstVisibleItemClosestToStart(true);
       int i = (view == null)? -1: this.getPosition(view);
       return i;
    }
    public int[] findFirstVisibleItemPositions(int[] p0){
       if (p0 == null) {
          p0 = new int[this.mSpanCount];
       }else if(p0.length >= this.mSpanCount){
          throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:"+this.mSpanCount+", array size:"+p0.length);
       }
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          p0[i] = this.mSpans[i].h();
       }
       return p0;
    }
    public int[] findLastCompletelyVisibleItemPositions(int[] p0){
       if (p0 == null) {
          p0 = new int[this.mSpanCount];
       }else if(p0.length >= this.mSpanCount){
          throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:"+this.mSpanCount+", array size:"+p0.length);
       }
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          p0[i] = this.mSpans[i].i();
       }
       return p0;
    }
    public final int findLastReferenceChildPosition(int p0){
       int position;
       int i = this.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return 0;
          }
          position = this.getPosition(this.getChildAt(i));
          if (position >= 0 && position < p0) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return position;
    }
    public int[] findLastVisibleItemPositions(int[] p0){
       if (p0 == null) {
          p0 = new int[this.mSpanCount];
       }else if(p0.length >= this.mSpanCount){
          throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:"+this.mSpanCount+", array size:"+p0.length);
       }
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          p0[i] = this.mSpans[i].k();
       }
       return p0;
    }
    public final void fixEndGap(RecyclerView$t p0,RecyclerView$y p1,boolean p2){
       int i = Integer.MIN_VALUE;
       int maxEnd = this.getMaxEnd(i);
       if (maxEnd == i) {
          return;
       }
       i = this.mPrimaryOrientation.i() - maxEnd;
       if (i > 0) {
          i = i - (- this.scrollBy((- i), p0, p1));
          if (p2 && i > 0) {
             this.mPrimaryOrientation.t(i);
          }
       }
       return;
    }
    public final void fixStartGap(RecyclerView$t p0,RecyclerView$y p1,boolean p2){
       int i = Integer.MAX_VALUE;
       int minStart = this.getMinStart(i);
       if (minStart == i) {
          return;
       }
       minStart = minStart - this.mPrimaryOrientation.n();
       if (minStart > 0) {
          minStart = minStart - this.scrollBy(minStart, p0, p1);
          if (p2 && minStart > 0) {
             this.mPrimaryOrientation.t((- minStart));
          }
       }
       return;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       if (this.mOrientation == null) {
          return new StaggeredGridLayoutManager$LayoutParams(-2, -1);
       }
       return new StaggeredGridLayoutManager$LayoutParams(-1, -2);
    }
    public RecyclerView$LayoutParams generateLayoutParams(Context p0,AttributeSet p1){
       return new StaggeredGridLayoutManager$LayoutParams(p0, p1);
    }
    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new StaggeredGridLayoutManager$LayoutParams(p0);
       }
       return new StaggeredGridLayoutManager$LayoutParams(p0);
    }
    public int getFirstChildPosition(){
       int i = 0;
       if (!this.getChildCount()) {
       }else {
          i = this.getPosition(this.getChildAt(i));
       }
       return i;
    }
    public int getGapStrategy(){
       return this.mGapStrategy;
    }
    public int getLastChildPosition(){
       int childCount = this.getChildCount();
       childCount = (!childCount)? 0: this.getPosition(this.getChildAt((childCount - 1)));
       return childCount;
    }
    public final int getMaxEnd(int p0){
       int i = this.mSpans[0].q(p0);
       int i1 = 1;
       while (i1 < this.mSpanCount) {
          int i2 = this.mSpans[i1].q(p0);
          if (i2 > i) {
             i = i2;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public final int getMaxStart(int p0){
       int i = this.mSpans[0].u(p0);
       int i1 = 1;
       while (i1 < this.mSpanCount) {
          int i2 = this.mSpans[i1].u(p0);
          if (i2 > i) {
             i = i2;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public final int getMinEnd(int p0){
       int i = this.mSpans[0].q(p0);
       int i1 = 1;
       while (i1 < this.mSpanCount) {
          int i2 = this.mSpans[i1].q(p0);
          if (i2 < i) {
             i = i2;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public final int getMinStart(int p0){
       int i = this.mSpans[0].u(p0);
       int i1 = 1;
       while (i1 < this.mSpanCount) {
          int i2 = this.mSpans[i1].u(p0);
          if (i2 < i) {
             i = i2;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public final StaggeredGridLayoutManager$c getNextSpan(n p0){
       int i1;
       int i2;
       int i3;
       object oobject;
       int i4;
       StaggeredGridLayoutManager staggeredGri = -1;
       int i = 1;
       if (this.preferLastSpan(p0.e)) {
          i1 = this.mSpanCount - i;
          i2 = -1;
       }else {
          i1 = 0;
          staggeredGri = this.mSpanCount;
          i2 = 1;
       }
       StaggeredGridLayoutManager$c uoc = null;
       if (p0.e == i) {
          i3 = Integer.MAX_VALUE;
          i = this.mPrimaryOrientation.n();
          while (i1 != staggeredGri) {
             oobject = this.mSpans[i1];
             i4 = oobject.q(i);
             if (i4 < i3) {
                uoc = oobject;
                i3 = i4;
             }
             i1 = i1 + i2;
          }
          return uoc;
       }else {
          i3 = Integer.MIN_VALUE;
          i = this.mPrimaryOrientation.i();
          while (i1 != staggeredGri) {
             oobject = this.mSpans[i1];
             i4 = oobject.u(i);
             if (i4 > i3) {
                uoc = oobject;
                i3 = i4;
             }
             i1 = i1 + i2;
          }
          return uoc;
       }
    }
    public int getOrientation(){
       return this.mOrientation;
    }
    public boolean getReverseLayout(){
       return this.mReverseLayout;
    }
    public int getSpanCount(){
       return this.mSpanCount;
    }
    public final void handleUpdate(int p0,int p1,int p2){
       int i;
       int i1;
       int lastChildPos = (this.mShouldReverseLayout != null)? this.getLastChildPosition(): this.getFirstChildPosition();
       if (p2 == 8) {
          if (p0 < p1) {
             i = p1 + 1;
          }else {
             i = p0 + 1;
             i1 = p1;
          label_001d :
             this.mLazySpanLookup.h(i1);
             if (p2 != 1) {
                if (p2 != 2) {
                   if (p2 == 8) {
                      this.mLazySpanLookup.k(p0, 1);
                      this.mLazySpanLookup.j(p1, 1);
                   }
                }else {
                   this.mLazySpanLookup.k(p0, p1);
                }
             }else {
                this.mLazySpanLookup.j(p0, p1);
             }
             if (i <= lastChildPos) {
                return;
             }else if(this.mShouldReverseLayout != null){
                p0 = this.getFirstChildPosition();
             }else {
                p0 = this.getLastChildPosition();
             }
             if (i1 <= p0) {
                this.requestLayout();
             }
             return;
          }
       }else {
          i = p0 + p1;
       }
       i1 = p0;
       goto label_001d ;
    }
    public View hasGapsToFix(){
       int i3;
       View childAt;
       int i5;
       int i6;
       StaggeredGridLayoutManager staggeredGri;
       int i = this.getChildCount() - 1;
       BitSet uBitSet = new BitSet(this.mSpanCount);
       uBitSet.set(0, this.mSpanCount, 1);
       int i1 = -1;
       int i2 = (this.mOrientation == 1 && this.isLayoutRTL())? 1: -1;
       if (this.mShouldReverseLayout != null) {
          i3 = -1;
       }else {
          i = i + 1;
          i3 = i;
          i = 0;
       }
       if (i < i3) {
          i1 = 1;
       }
       while (true) {
          if (i == i3) {
             return null;
          }
          childAt = this.getChildAt(i);
          StaggeredGridLayoutManager$LayoutParams layoutParams = childAt.getLayoutParams();
          if (uBitSet.get(layoutParams.a.e)) {
             if (this.checkSpanForGap(layoutParams.a)) {
                break ;
             }else {
                uBitSet.clear(layoutParams.a.e);
             }
          }
          if (layoutParams.b == null) {
             int i4 = i + i1;
             if (i4 != i3) {
                View childAt1 = this.getChildAt(i4);
                if (this.mShouldReverseLayout != null) {
                   i5 = this.mPrimaryOrientation.d(childAt);
                   i6 = this.mPrimaryOrientation.d(childAt1);
                   if (i5 < i6) {
                      return childAt;
                   }else if(i5 == i6){
                   label_0088 :
                      staggeredGri = 1;
                   label_008b :
                      if (staggeredGri) {
                         int i7 = layoutParams.a.e - childAt1.getLayoutParams().a.e;
                         layoutParams = (i7 < 0)? 1: null;
                         StaggeredGridLayoutManager$LayoutParams layoutParams1 = (i2 < 0)? 1: null;
                         if (layoutParams != layoutParams1) {
                            return childAt;
                         }
                      }
                   }
                }else {
                   i5 = this.mPrimaryOrientation.g(childAt);
                   i6 = this.mPrimaryOrientation.g(childAt1);
                   if (i5 > i6) {
                      return childAt;
                   }else if(i5 == i6){
                      goto label_0088 ;
                   }
                }
                staggeredGri = null;
                goto label_008b ;
             }
          }
          i = i + i1;
       }
       return childAt;
    }
    public void invalidateSpanAssignments(){
       this.mLazySpanLookup.b();
       this.requestLayout();
    }
    public boolean isAutoMeasureEnabled(){
       boolean b = (this.mGapStrategy != null)? true: false;
       return b;
    }
    public boolean isLayoutRTL(){
       boolean b = true;
       if (this.getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void measureChildWithDecorationsAndMargin(View p0,int p1,int p2,boolean p3){
       this.calculateItemDecorationsForChild(p0, this.mTmpRect);
       StaggeredGridLayoutManager$LayoutParams layoutParams = p0.getLayoutParams();
       StaggeredGridLayoutManager tmTmpRect = this.mTmpRect;
       p1 = this.updateSpecWithExtra(p1, (layoutParams.leftMargin + tmTmpRect.left), (layoutParams.rightMargin + tmTmpRect.right));
       tmTmpRect = this.mTmpRect;
       p2 = this.updateSpecWithExtra(p2, (layoutParams.topMargin + tmTmpRect.top), (layoutParams.bottomMargin + tmTmpRect.bottom));
       p3 = (p3)? this.shouldReMeasureChild(p0, p1, p2, layoutParams): this.shouldMeasureChild(p0, p1, p2, layoutParams);
       if (p3) {
          p0.measure(p1, p2);
       }
       return;
    }
    public final void measureChildWithDecorationsAndMargin(View p0,StaggeredGridLayoutManager$LayoutParams p1,boolean p2){
       boolean b = true;
       if (p1.b != null) {
          if (this.mOrientation == b) {
             this.measureChildWithDecorationsAndMargin(p0, this.mFullSizeSpec, RecyclerView$LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), (this.getPaddingTop() + this.getPaddingBottom()), p1.height, b), p2);
          }else {
             this.measureChildWithDecorationsAndMargin(p0, RecyclerView$LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), (this.getPaddingLeft() + this.getPaddingRight()), p1.width, b), this.mFullSizeSpec, p2);
          }
       }else {
          int i = 0;
          if (this.mOrientation == b) {
             this.measureChildWithDecorationsAndMargin(p0, RecyclerView$LayoutManager.getChildMeasureSpec(this.mSizePerSpan, this.getWidthMode(), i, p1.width, i), RecyclerView$LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), (this.getPaddingTop() + this.getPaddingBottom()), p1.height, b), p2);
          }else {
             this.measureChildWithDecorationsAndMargin(p0, RecyclerView$LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), (this.getPaddingLeft() + this.getPaddingRight()), p1.width, b), RecyclerView$LayoutManager.getChildMeasureSpec(this.mSizePerSpan, this.getHeightMode(), i, p1.height, i), p2);
          }
       }
       return;
    }
    public void offsetChildrenHorizontal(int p0){
       super.offsetChildrenHorizontal(p0);
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          this.mSpans[i].w(p0);
       }
       return;
    }
    public void offsetChildrenVertical(int p0){
       super.offsetChildrenVertical(p0);
       for (int i = 0; i < this.mSpanCount; i = i + 1) {
          this.mSpans[i].w(p0);
       }
       return;
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
       this.mLazySpanLookup.b();
       for (int i = 0; i < this.mSpanCount; i++) {
          this.mSpans[i].e();
       }
       return;
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       super.onDetachedFromWindow(p0, p1);
       this.removeCallbacks(this.mCheckForGapsRunnable);
       for (int i = 0; i < this.mSpanCount; i++) {
          this.mSpans[i].e();
       }
       p0.requestLayout();
       return;
    }
    public View onFocusSearchFailed(View p0,int p1,RecyclerView$t p2,RecyclerView$y p3){
       int i;
       View view1;
       if (!this.getChildCount()) {
          return null;
       }
       p0 = this.findContainingItemView(p0);
       if (p0 == null) {
          return null;
       }
       this.resolveShouldLayoutReverse();
       p1 = this.convertFocusDirectionToLayoutDirection(p1);
       if (p1 == Integer.MIN_VALUE) {
          return null;
       }
       StaggeredGridLayoutManager$LayoutParams layoutParams = p0.getLayoutParams();
       StaggeredGridLayoutManager$LayoutParams b = layoutParams.b;
       layoutParams = layoutParams.a;
       int lastChildPos = (p1 == 1)? this.getLastChildPosition(): this.getFirstChildPosition();
       this.updateLayoutState(lastChildPos, p3);
       this.setLayoutStateDirection(p1);
       StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
       tmLayoutStat.c = tmLayoutStat.d + lastChildPos;
       tmLayoutStat.b = (int)((float)this.mPrimaryOrientation.o() * 0.33f);
       tmLayoutStat = this.mLayoutState;
       tmLayoutStat.h = true;
       boolean b1 = false;
       tmLayoutStat.a = b1;
       this.fill(p2, tmLayoutStat, p3);
       this.mLastLayoutFromEnd = this.mShouldReverseLayout;
       if (b == null) {
          View view = layoutParams.r(lastChildPos, p1);
          if (view != null && view != p0) {
             return view;
          }
       }
       if (this.preferLastSpan(p1)) {
          i = this.mSpanCount - true;
          while (true) {
             if (i >= 0) {
                view1 = this.mSpans[i].r(lastChildPos, p1);
                if (view1 != null && view1 != p0) {
                   return view1;
                }else {
                   i--;
                }
             }
          }
       }else {
          i = 0;
          while (true) {
             if (i < this.mSpanCount) {
                view1 = this.mSpans[i].r(lastChildPos, p1);
                if (view1 != null && view1 != p0) {
                   return view1;
                }else {
                   i++;
                }
             }
          }
       }
       i = this.mReverseLayout ^ true;
       int i1 = (p1 == -1)? 1: 0;
       i = (i == i1)? 1: 0;
       if (b == null) {
          i1 = (i)? layoutParams.g(): layoutParams.j();
          view1 = this.findViewByPosition(i1);
          if (view1 != null && view1 != p0) {
             return view1;
          }
       }
    label_00ba :
       if (this.preferLastSpan(p1)) {
          p1 = this.mSpanCount - true;
          while (p1 >= 0) {
             if (p1 != layoutParams.e) {
                i1 = (i)? this.mSpans[p1].g(): this.mSpans[p1].j();
                view1 = this.findViewByPosition(i1);
                if (view1 != null && view1 != p0) {
                   return view1;
                }
             }
          label_00e6 :
             p1--;
          }
       }else {
          while (b1 < this.mSpanCount) {
             p1 = (i)? this.mSpans[b1].g(): this.mSpans[b1].j();
             View view2 = this.findViewByPosition(p1);
             if (view2 != null && view2 != p0) {
                return view2;
             }
             b1 = b1 + 1;
          }
       }
       return null;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       if (this.getChildCount() > 0) {
          View view = this.findFirstVisibleItemClosestToStart(false);
          View view1 = this.findFirstVisibleItemClosestToEnd(false);
          if (view != null && view1 != null) {
             int position = this.getPosition(view);
             int position1 = this.getPosition(view1);
             if (position < position1) {
                p0.setFromIndex(position);
                p0.setToIndex(position1);
             }else {
                p0.setFromIndex(position1);
                p0.setToIndex(position);
             }
          }
       }
       return;
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       this.handleUpdate(p1, p2, 1);
    }
    public void onItemsChanged(RecyclerView p0){
       this.mLazySpanLookup.b();
       this.requestLayout();
    }
    public void onItemsMoved(RecyclerView p0,int p1,int p2,int p3){
       this.handleUpdate(p1, p2, 8);
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
       this.handleUpdate(p1, p2, 2);
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2,Object p3){
       this.handleUpdate(p1, p2, 4);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       this.onLayoutChildren(p0, p1, true);
    }
    public final void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1,boolean p2){
       int i1;
       StaggeredGridLayoutManager tmAnchorInfo = this.mAnchorInfo;
       int i = -1;
       if (this.mPendingSavedState != null || (this.mPendingScrollPosition != i && !p1.c())) {
          this.removeAndRecycleAllViews(p0);
          tmAnchorInfo.c();
          return;
       }else {
          boolean b = true;
          StaggeredGridLayoutManager staggeredGri = (tmAnchorInfo.e != null && (this.mPendingScrollPosition != i || this.mPendingSavedState != null))? 1: null;
          if (staggeredGri) {
             tmAnchorInfo.c();
             if (this.mPendingSavedState != null) {
                this.applyPendingSavedState(tmAnchorInfo);
             }else {
                this.resolveShouldLayoutReverse();
                tmAnchorInfo.c = this.mShouldReverseLayout;
             }
             this.updateAnchorInfoForLayout(p1, tmAnchorInfo);
             tmAnchorInfo.e = b;
          }
          if (this.mPendingSavedState == null && (this.mPendingScrollPosition == i && (tmAnchorInfo.c != this.mLastLayoutFromEnd || this.isLayoutRTL() != this.mLastLayoutRTL))) {
             this.mLazySpanLookup.b();
             tmAnchorInfo.d = b;
          }
       label_0060 :
          if (this.getChildCount() > 0) {
             StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
             if (tmPendingSav == null || tmPendingSav.d < b) {
                if (tmAnchorInfo.d != null) {
                   i1 = 0;
                   while (i1 < this.mSpanCount) {
                      this.mSpans[i1].e();
                      StaggeredGridLayoutManager$b b1 = tmAnchorInfo.b;
                      if (b1 != Integer.MIN_VALUE) {
                         this.mSpans[i1].A(b1);
                      }
                      i1 = i1 + 1;
                   }
                }else if(staggeredGri || this.mAnchorInfo.f == null){
                   for (i1 = 0; i1 < this.mSpanCount; i1 = i1 + 1) {
                      this.mSpans[i1].b(this.mShouldReverseLayout, tmAnchorInfo.b);
                   }
                   this.mAnchorInfo.d(this.mSpans);
                }else {
                   for (i1 = 0; i1 < this.mSpanCount; i1 = i1 + 1) {
                      object oobject = this.mSpans[i1];
                      oobject.e();
                      oobject.A(this.mAnchorInfo.f[i1]);
                   }
                }
             }
          }
          this.detachAndScrapAttachedViews(p0);
          this.mLayoutState.a = false;
          this.mLaidOutInvalidFullSpan = false;
          this.updateMeasureSpecs(this.mSecondaryOrientation.o());
          this.updateLayoutState(tmAnchorInfo.a, p1);
          if (tmAnchorInfo.c != null) {
             this.setLayoutStateDirection(i);
             this.fill(p0, this.mLayoutState, p1);
             this.setLayoutStateDirection(b);
             staggeredGri = this.mLayoutState;
             staggeredGri.c = tmAnchorInfo.a + staggeredGri.d;
             this.fill(p0, staggeredGri, p1);
          }else {
             this.setLayoutStateDirection(b);
             this.fill(p0, this.mLayoutState, p1);
             this.setLayoutStateDirection(i);
             staggeredGri = this.mLayoutState;
             staggeredGri.c = tmAnchorInfo.a + staggeredGri.d;
             this.fill(p0, staggeredGri, p1);
          }
          this.repositionToWrapContentIfNecessary();
          if (this.getChildCount() > 0) {
             if (this.mShouldReverseLayout != null) {
                this.fixEndGap(p0, p1, b);
                this.fixStartGap(p0, p1, false);
             }else {
                this.fixStartGap(p0, p1, b);
                this.fixEndGap(p0, p1, false);
             }
          }
          if (p2 && !p1.g()) {
             StaggeredGridLayoutManager staggeredGri1 = (this.mGapStrategy != null && (this.getChildCount() > 0 && (this.mLaidOutInvalidFullSpan != null || this.hasGapsToFix() != null)))? 1: null;
             if (staggeredGri1) {
                this.removeCallbacks(this.mCheckForGapsRunnable);
                if (this.checkForGaps()) {
                label_015b :
                   if (p1.g()) {
                      this.mAnchorInfo.c();
                   }
                   this.mLastLayoutFromEnd = tmAnchorInfo.c;
                   this.mLastLayoutRTL = this.isLayoutRTL();
                   if (b) {
                      this.mAnchorInfo.c();
                      this.onLayoutChildren(p0, p1, false);
                   }
                   return;
                }
             }
          }
       label_015a :
          b = false;
          goto label_015b ;
       }
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       super.onLayoutCompleted(p0);
       this.mPendingScrollPosition = -1;
       this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
       this.mPendingSavedState = null;
       this.mAnchorInfo.c();
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof StaggeredGridLayoutManager$SavedState) {
          this.mPendingSavedState = p0;
          if (this.mPendingScrollPosition != -1) {
             p0.a();
             this.mPendingSavedState.b();
          }
          this.requestLayout();
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
       if (tmPendingSav != null) {
          return new StaggeredGridLayoutManager$SavedState(tmPendingSav);
       }
       StaggeredGridLayoutManager$SavedState savedState = new StaggeredGridLayoutManager$SavedState();
       savedState.i = this.mReverseLayout;
       savedState.j = this.mLastLayoutFromEnd;
       savedState.k = this.mLastLayoutRTL;
       StaggeredGridLayoutManager tmLazySpanLo = this.mLazySpanLookup;
       int i = 0;
       if (tmLazySpanLo != null) {
          StaggeredGridLayoutManager$LazySpanLookup a = tmLazySpanLo.a;
          if (a != null) {
             savedState.g = a;
             savedState.f = a.length;
             savedState.h = tmLazySpanLo.b;
          label_0030 :
             if (this.getChildCount() > 0) {
                int lastChildPos = (this.mLastLayoutFromEnd != null)? this.getLastChildPosition(): this.getFirstChildPosition();
                savedState.b = lastChildPos;
                savedState.c = this.findFirstVisibleItemPositionInt();
                tmLazySpanLo = this.mSpanCount;
                savedState.d = tmLazySpanLo;
                int[] ointArray = new int[tmLazySpanLo];
                savedState.e = ointArray;
                for (; i < this.mSpanCount; i = i + 1) {
                   int i1 = Integer.MIN_VALUE;
                   if (this.mLastLayoutFromEnd != null) {
                      lastChildPos = this.mSpans[i].q(i1);
                      if (lastChildPos != i1) {
                         i1 = this.mPrimaryOrientation.i();
                      label_007e :
                         lastChildPos = lastChildPos - i1;
                      }
                   }else {
                      lastChildPos = this.mSpans[i].u(i1);
                      if (lastChildPos != i1) {
                         i1 = this.mPrimaryOrientation.n();
                         goto label_007e ;
                      }
                   }
                   savedState.e[i] = lastChildPos;
                }
             }else {
                savedState.b = -1;
                savedState.c = -1;
                savedState.d = i;
             }
             return savedState;
          }
       }
       savedState.f = i;
       goto label_0030 ;
    }
    public void onScrollStateChanged(int p0){
       if (!p0) {
          this.checkForGaps();
       }
       return;
    }
    public final boolean preferLastSpan(int p0){
       boolean b = true;
       if (this.mOrientation == null) {
          p0 = (p0 == -1)? 1: 0;
          if (p0 == this.mShouldReverseLayout) {
             b = false;
          }
          return b;
       }else if(p0 == -1){
          p0 = 1;
       }else {
          p0 = 0;
       }
       p0 = (p0 == this.mShouldReverseLayout)? 1: 0;
       if (p0 != this.isLayoutRTL()) {
          b = false;
       }
       return b;
    }
    public void prepareLayoutStateForDelta(int p0,RecyclerView$y p1){
       int lastChildPos;
       int i;
       boolean b = true;
       if (p0 > 0) {
          lastChildPos = this.getLastChildPosition();
          i = 1;
       }else {
          lastChildPos = this.getFirstChildPosition();
          i = -1;
       }
       this.mLayoutState.a = b;
       this.updateLayoutState(lastChildPos, p1);
       this.setLayoutStateDirection(i);
       StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
       tmLayoutStat.c = lastChildPos + tmLayoutStat.d;
       tmLayoutStat.b = Math.abs(p0);
       return;
    }
    public final void prependViewToAllSpans(View p0){
       for (int i = this.mSpanCount - 1; i >= 0; i = i - 1) {
          this.mSpans[i].z(p0);
       }
       return;
    }
    public final void recycle(RecyclerView$t p0,n p1){
       int i1;
       int i2;
       if (p1.a != null && p1.i == null) {
          int i = -1;
          if (p1.b == null) {
             if (p1.e == i) {
                this.recycleFromEnd(p0, p1.g);
             }else {
                this.recycleFromStart(p0, p1.f);
             }
          }else if(p1.e == i){
             n f = p1.f;
             i1 = f - this.getMaxStart(f);
             p1 = (i1 < 0)? p1.g: p1.g - Math.min(i1, p1.b);
             this.recycleFromEnd(p0, p1);
          }else {
             i1 = this.getMinEnd(p1.g) - p1.g;
             p1 = (i1 < 0)? p1.f: Math.min(i1, p1.b) + p1.f;
             this.recycleFromStart(p0, p1);
          }
       }
       return;
    }
    public final void recycleFromEnd(RecyclerView$t p0,int p1){
       for (int i = this.getChildCount() - 1; i >= 0; i = i - 1) {
          View childAt = this.getChildAt(i);
          if (this.mPrimaryOrientation.g(childAt) >= p1 && this.mPrimaryOrientation.r(childAt) >= p1) {
             StaggeredGridLayoutManager$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.b != null) {
                int i1 = 0;
                int i2 = 0;
                while (true) {
                   if (i2 < this.mSpanCount) {
                      if (this.mSpans[i2].a.size() == 1) {
                         return;
                      }else {
                         i2 = i2 + 1;
                      }
                   }else if(i1 < this.mSpanCount){
                      this.mSpans[i1].x();
                      i1 = i1 + 1;
                      goto label_003c ;
                   }
                }
             label_0060 :
                return;
             }else if(layoutParams.a.a.size() == 1){
                return;
             }else {
                layoutParams.a.x();
             }
             this.removeAndRecycleView(childAt, p0);
          }else {
             goto label_0060 ;
          }
       }
    }
    public final void recycleFromStart(RecyclerView$t p0,int p1){
       while (this.getChildCount() > 0) {
          int i = 0;
          View childAt = this.getChildAt(i);
          if (this.mPrimaryOrientation.d(childAt) <= p1 && this.mPrimaryOrientation.q(childAt) <= p1) {
             StaggeredGridLayoutManager$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.b != null) {
                int i1 = 0;
                while (true) {
                   if (i1 < this.mSpanCount) {
                      if (this.mSpans[i1].a.size() == 1) {
                         return;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else if(i < this.mSpanCount){
                      this.mSpans[i].y();
                      i = i + 1;
                      goto label_003b ;
                   }
                }
             label_005d :
                return;
             }else if(layoutParams.a.a.size() == 1){
                return;
             }else {
                layoutParams.a.y();
             }
             this.removeAndRecycleView(childAt, p0);
          }else {
             goto label_005d ;
          }
       }
    }
    public final void repositionToWrapContentIfNecessary(){
       StaggeredGridLayoutManager$c e;
       int i4;
       int i5;
       if (this.mSecondaryOrientation.l() == 0x40000000) {
          return;
       }
       float f = 0;
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          float f1 = (float)this.mSecondaryOrientation.e(childAt);
          if (f1 - f >= 0) {
             if (childAt.getLayoutParams().b()) {
                f1 = f1 * 0x3f800000;
                f1 = f1 / (float)this.mSpanCount;
             }
             f = Math.max(f, f1);
          }
          i1 = i1 + 1;
       }
       StaggeredGridLayoutManager tmSizePerSpa = this.mSizePerSpan;
       int i2 = Math.round((f * (float)this.mSpanCount));
       if (this.mSecondaryOrientation.l() == Integer.MIN_VALUE) {
          i2 = Math.min(i2, this.mSecondaryOrientation.o());
       }
       this.updateMeasureSpecs(i2);
       if (this.mSizePerSpan == tmSizePerSpa) {
          return;
       }else {
          while (i < childCount) {
             View childAt1 = this.getChildAt(i);
             StaggeredGridLayoutManager$LayoutParams layoutParams = childAt1.getLayoutParams();
             if (layoutParams.b == null) {
                if (this.isLayoutRTL() && this.mOrientation == 1) {
                   StaggeredGridLayoutManager tmSpanCount = this.mSpanCount;
                   int i3 = tmSpanCount - 1;
                   e = layoutParams.a.e;
                   i3 = i3 - e;
                   i3 = - i3;
                   i3 = i3 * this.mSizePerSpan;
                   i4 = tmSpanCount - 1;
                   i4 = i4 - e;
                   i5 = - i4;
                   i5 = i5 * tmSizePerSpa;
                   i3 = i3 - i5;
                   childAt1.offsetLeftAndRight(i3);
                }else {
                   e = layoutParams.a.e;
                   i4 = this.mSizePerSpan * e;
                   i5 = e * tmSizePerSpa;
                   if (this.mOrientation == 1) {
                      i4 = i4 - i5;
                      childAt1.offsetLeftAndRight(i4);
                   }else {
                      i4 = i4 - i5;
                      childAt1.offsetTopAndBottom(i4);
                   }
                }
             }
             i = i + 1;
          }
          return;
       }
    }
    public final void resolveShouldLayoutReverse(){
       this.mShouldReverseLayout = (this.mOrientation == 1 || !this.isLayoutRTL())? this.mReverseLayout: this.mReverseLayout ^ 1;
       return;
    }
    public int scrollBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (!this.getChildCount() || !p0) {
          return 0;
       }
       this.prepareLayoutStateForDelta(p0, p2);
       int i = this.fill(p1, this.mLayoutState, p2);
       if (this.mLayoutState.b >= i) {
          p0 = (p0 < 0)? - i: i;
       }
    label_001f :
       this.mPrimaryOrientation.t((- p0));
       this.mLastLayoutFromEnd = this.mShouldReverseLayout;
       StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
       tmLayoutStat.b = 0;
       this.recycle(p1, tmLayoutStat);
       return p0;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return this.scrollBy(p0, p1, p2);
    }
    public void scrollToPosition(int p0){
       StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
       if (tmPendingSav != null && tmPendingSav.b != p0) {
          tmPendingSav.a();
       }
       this.mPendingScrollPosition = p0;
       this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
       this.requestLayout();
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
       if (tmPendingSav != null) {
          tmPendingSav.a();
       }
       this.mPendingScrollPosition = p0;
       this.mPendingScrollPositionOffset = p1;
       this.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return this.scrollBy(p0, p1, p2);
    }
    public void setGapStrategy(int p0){
       this.assertNotInLayoutOrScroll(null);
       if (p0 == this.mGapStrategy) {
          return;
       }
       if (p0 && p0 != 2) {
          throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
       }
       this.mGapStrategy = p0;
       this.requestLayout();
       return;
    }
    public final void setLayoutStateDirection(int p0){
       StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
       tmLayoutStat.e = p0;
       StaggeredGridLayoutManager tmShouldReve = this.mShouldReverseLayout;
       int i = 1;
       p0 = (p0 == -1)? 1: 0;
       if (tmShouldReve != p0) {
          i = -1;
       }
       tmLayoutStat.d = i;
       return;
    }
    public void setMeasuredDimension(Rect p0,int p1,int p2){
       int i2;
       int i = this.getPaddingLeft() + this.getPaddingRight();
       int i1 = this.getPaddingTop() + this.getPaddingBottom();
       if (this.mOrientation == 1) {
          i2 = RecyclerView$LayoutManager.chooseSize(p2, (p0.height() + i1), this.getMinimumHeight());
          p1 = RecyclerView$LayoutManager.chooseSize(p1, ((this.mSizePerSpan * this.mSpanCount) + i), this.getMinimumWidth());
       }else {
          p1 = RecyclerView$LayoutManager.chooseSize(p1, (p0.width() + i), this.getMinimumWidth());
          i2 = RecyclerView$LayoutManager.chooseSize(p2, ((this.mSizePerSpan * this.mSpanCount) + i1), this.getMinimumHeight());
       }
       this.setMeasuredDimension(p1, i2);
       return;
    }
    public void setOrientation(int p0){
       if (p0 && p0 != 1) {
          throw new IllegalArgumentException("invalid orientation.");
       }
       this.assertNotInLayoutOrScroll(null);
       if (p0 == this.mOrientation) {
          return;
       }
       this.mOrientation = p0;
       StaggeredGridLayoutManager tmPrimaryOri = this.mPrimaryOrientation;
       this.mPrimaryOrientation = this.mSecondaryOrientation;
       this.mSecondaryOrientation = tmPrimaryOri;
       this.requestLayout();
       return;
    }
    public void setReverseLayout(boolean p0){
       this.assertNotInLayoutOrScroll(null);
       StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
       if (tmPendingSav != null && tmPendingSav.i != p0) {
          tmPendingSav.i = p0;
       }
       this.mReverseLayout = p0;
       this.requestLayout();
       return;
    }
    public void setSpanCount(int p0){
       this.assertNotInLayoutOrScroll(null);
       if (p0 != this.mSpanCount) {
          this.invalidateSpanAssignments();
          this.mSpanCount = p0;
          this.mRemainingSpans = new BitSet(this.mSpanCount);
          StaggeredGridLayoutManager$c[] uocArray = new StaggeredGridLayoutManager$c[this.mSpanCount];
          this.mSpans = uocArray;
          for (uocArray = 0; uocArray < this.mSpanCount; uocArray++) {
             this.mSpans[uocArray] = new StaggeredGridLayoutManager$c(this, uocArray);
          }
          this.requestLayout();
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       o oo = new o(p0.getContext());
       oo.p(p2);
       this.startSmoothScroll(oo);
    }
    public boolean supportsPredictiveItemAnimations(){
       boolean b = (this.mPendingSavedState == null)? true: false;
       return b;
    }
    public final void updateAllRemainingSpans(int p0,int p1){
       int i = 0;
       while (i < this.mSpanCount) {
          if (!this.mSpans[i].a.isEmpty()) {
             this.updateRemainingSpans(this.mSpans[i], p0, p1);
          }
          i = i + 1;
       }
       return;
    }
    public final boolean updateAnchorFromChildren(RecyclerView$y p0,StaggeredGridLayoutManager$b p1){
       int i = (this.mLastLayoutFromEnd != null)? this.findLastReferenceChildPosition(p0.c()): this.findFirstReferenceChildPosition(p0.c());
       p1.a = i;
       p1.b = Integer.MIN_VALUE;
       return true;
    }
    public boolean updateAnchorFromPendingData(RecyclerView$y p0,StaggeredGridLayoutManager$b p1){
       int b = false;
       if (!p0.g()) {
          StaggeredGridLayoutManager tmPendingScr = this.mPendingScrollPosition;
          int i = -1;
          if (tmPendingScr != i) {
             if (tmPendingScr < null || tmPendingScr >= p0.c()) {
                this.mPendingScrollPosition = i;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
             }else {
                StaggeredGridLayoutManager tmPendingSav = this.mPendingSavedState;
                if (tmPendingSav != null && (tmPendingSav.b == i || tmPendingSav.d < true)) {
                   View view = this.findViewByPosition(this.mPendingScrollPosition);
                   if (view != null) {
                      b = (this.mShouldReverseLayout != null)? this.getLastChildPosition(): this.getFirstChildPosition();
                      p1.a = b;
                      if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                         p1.b = (p1.c != null)? (this.mPrimaryOrientation.i() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.d(view): (this.mPrimaryOrientation.n() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.g(view);
                         return true;
                      }else if(this.mPrimaryOrientation.e(view) > this.mPrimaryOrientation.o()){
                         int i1 = (p1.c != null)? this.mPrimaryOrientation.i(): this.mPrimaryOrientation.n();
                         p1.b = i1;
                         return true;
                      }else {
                         b = this.mPrimaryOrientation.g(view) - this.mPrimaryOrientation.n();
                         if (b < 0) {
                            p1.b = - b;
                            return true;
                         }else {
                            b = this.mPrimaryOrientation.i() - this.mPrimaryOrientation.d(view);
                            if (b < 0) {
                               p1.b = b;
                               return true;
                            }else {
                               p1.b = Integer.MIN_VALUE;
                            }
                         }
                      }
                   }else {
                      tmPendingSav = this.mPendingScrollPosition;
                      p1.a = tmPendingSav;
                      StaggeredGridLayoutManager tmPendingScr1 = this.mPendingScrollPositionOffset;
                      if (tmPendingScr1 == Integer.MIN_VALUE) {
                         if (this.calculateScrollDirectionForPosition(tmPendingSav) == 1) {
                            b = true;
                         }
                         p1.c = b;
                         p1.a();
                      }else {
                         p1.b(tmPendingScr1);
                      }
                      p1.d = true;
                   }
                }else {
                   p1.b = Integer.MIN_VALUE;
                   p1.a = this.mPendingScrollPosition;
                }
                return true;
             }
          }
       }
       return b;
    }
    public void updateAnchorInfoForLayout(RecyclerView$y p0,StaggeredGridLayoutManager$b p1){
       if (this.updateAnchorFromPendingData(p0, p1)) {
          return;
       }
       if (this.updateAnchorFromChildren(p0, p1)) {
          return;
       }
       p1.a();
       p1.a = 0;
       return;
    }
    public final void updateLayoutState(int p0,RecyclerView$y p1){
       StaggeredGridLayoutManager tmLayoutStat = this.mLayoutState;
       int i = 0;
       tmLayoutStat.b = i;
       tmLayoutStat.c = p0;
       if (this.isSmoothScrolling()) {
          int i1 = p1.d();
          if (i1 != -1) {
             tmLayoutStat = this.mShouldReverseLayout;
             StaggeredGridLayoutManager staggeredGri = (i1 < p0)? 1: null;
             if (tmLayoutStat == staggeredGri) {
                staggeredGri = this.mPrimaryOrientation.o();
             label_002f :
                i1 = 0;
             label_0030 :
                if (this.getClipToPadding()) {
                   this.mLayoutState.f = this.mPrimaryOrientation.n() - i1;
                   i1.g = this.mPrimaryOrientation.i() + staggeredGri;
                }else {
                   this.mLayoutState.g = this.mPrimaryOrientation.h() + staggeredGri;
                   staggeredGri.f = - i1;
                }
                staggeredGri = this.mLayoutState;
                staggeredGri.h = i;
                staggeredGri.a = true;
                if (!this.mPrimaryOrientation.l() && !this.mPrimaryOrientation.h()) {
                   i = true;
                }
                staggeredGri.i = i;
                return;
             }else {
                i1 = this.mPrimaryOrientation.o();
                staggeredGri = 0;
                goto label_0030 ;
             }
          }
       }
       p0 = 0;
       goto label_002f ;
    }
    public void updateMeasureSpecs(int p0){
       this.mSizePerSpan = p0 / this.mSpanCount;
       this.mFullSizeSpec = View$MeasureSpec.makeMeasureSpec(p0, this.mSecondaryOrientation.l());
    }
    public final void updateRemainingSpans(StaggeredGridLayoutManager$c p0,int p1,int p2){
       int i = p0.o();
       if (p1 == -1) {
          if ((p0.t() + i) <= p2) {
             this.mRemainingSpans.set(p0.e, false);
          }
       }else if((p0.p() - i) >= p2){
          this.mRemainingSpans.set(p0.e, false);
       }
       return;
    }
    public final int updateSpecWithExtra(int p0,int p1,int p2){
       if (!p1 && !p2) {
          return p0;
       }
       int mode = View$MeasureSpec.getMode(p0);
       if (mode == Integer.MIN_VALUE || mode == 0x40000000) {
          return View$MeasureSpec.makeMeasureSpec(Math.max(0, ((View$MeasureSpec.getSize(p0) - p1) - p2)), mode);
       }
       return p0;
    }
}
