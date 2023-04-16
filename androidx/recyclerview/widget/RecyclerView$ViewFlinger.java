package androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.widget.OverScroller;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.lang.Math;
import android.view.View;
import a2.i0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.ArrayList;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k;
import android.os.Build$VERSION;

public class RecyclerView$ViewFlinger implements Runnable	// class@000886
{
    public boolean mEatRunOnAnimationRequest;
    public Interpolator mInterpolator;
    public int mLastFlingX;
    public int mLastFlingY;
    public OverScroller mOverScroller;
    public boolean mReSchedulePostAnimationCallback;
    public final RecyclerView this$0;

    public void RecyclerView$ViewFlinger(RecyclerView p0){
       this.this$0 = p0;
       super();
       Interpolator sQuinticInte = RecyclerView.sQuinticInterpolator;
       this.mInterpolator = sQuinticInte;
       this.mEatRunOnAnimationRequest = false;
       this.mReSchedulePostAnimationCallback = false;
       this.mOverScroller = new OverScroller(p0.getContext(), sQuinticInte);
    }
    public final int computeScrollDuration(int p0,int p1){
       p0 = Math.abs(p0);
       p1 = Math.abs(p1);
       int i = (p0 > p1)? 1: 0;
       RecyclerView$ViewFlinger tthis$0 = this.this$0;
       int width = (i)? tthis$0.getWidth(): tthis$0.getHeight();
       if (!i) {
          p0 = p1;
       }
       return Math.min((int)((((float)p0 / (float)width) + 0x3f800000) * 300.00f), 2000);
    }
    public void fling(int p0,int p1){
       this.this$0.setScrollState(2);
       this.mLastFlingY = 0;
       this.mLastFlingX = 0;
       Interpolator sQuinticInte = RecyclerView.sQuinticInterpolator;
       if (this.mInterpolator != sQuinticInte) {
          this.mInterpolator = sQuinticInte;
          this.mOverScroller = new OverScroller(this.this$0.getContext(), sQuinticInte);
       }
       this.mOverScroller.fling(0, 0, p0, p1, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
       this.postOnAnimation();
       return;
    }
    public final void internalPostOnAnimation(){
       this.this$0.removeCallbacks(this);
       i0.k0(this.this$0, this);
    }
    public void postOnAnimation(){
       if (this.mEatRunOnAnimationRequest != null) {
          this.mReSchedulePostAnimationCallback = true;
       }else {
          this.internalPostOnAnimation();
       }
       return;
    }
    public void run(){
       RecyclerView mReusableInt1;
       int i2;
       int i3;
       RecyclerView$LayoutManager mSmoothScrol;
       RecyclerView$ViewFlinger viewFlinger = this;
       RecyclerView$ViewFlinger this$0 = viewFlinger.this$0;
       if (this$0.mLayout == null) {
          this.stop();
          return;
       }else {
          viewFlinger.mReSchedulePostAnimationCallback = false;
          viewFlinger.mEatRunOnAnimationRequest = true;
          this$0.consumePendingUpdateOperations();
          this$0 = viewFlinger.mOverScroller;
          if (this$0.computeScrollOffset()) {
             int currX = this$0.getCurrX();
             int currY = this$0.getCurrY();
             int i = currX - viewFlinger.mLastFlingX;
             int i1 = currY - viewFlinger.mLastFlingY;
             viewFlinger.mLastFlingX = currX;
             viewFlinger.mLastFlingY = currY;
             RecyclerView$ViewFlinger this$01 = viewFlinger.this$0;
             RecyclerView mReusableInt = this$01.mReusableIntPair;
             mReusableInt[0] = false;
             mReusableInt[1] = false;
             if (this$01.dispatchNestedPreScroll(i, i1, mReusableInt, null, 1)) {
                mReusableInt1 = viewFlinger.this$0.mReusableIntPair;
                i = i - mReusableInt1[0];
                i1 = i1 - mReusableInt1[1];
             }
             RecyclerView$ViewFlinger viewFlinger1 = 2;
             if (viewFlinger.this$0.getOverScrollMode() != viewFlinger1) {
                viewFlinger.this$0.considerReleasingGlowsOnScroll(i, i1);
             }
             RecyclerView$ViewFlinger this$02 = viewFlinger.this$0;
             if (this$02.mAdapter != null) {
                RecyclerView mReusableInt2 = this$02.mReusableIntPair;
                mReusableInt2[0] = false;
                mReusableInt2[1] = false;
                this$02.scrollStep(i, i1, mReusableInt2);
                this$02 = viewFlinger.this$0;
                mReusableInt2 = this$02.mReusableIntPair;
                i2 = mReusableInt2[0];
                i3 = mReusableInt2[1];
                i = i - i2;
                i1 = i1 - i3;
                mSmoothScrol = this$02.mLayout.mSmoothScroller;
                if (mSmoothScrol != null && (!mSmoothScrol.g() && mSmoothScrol.h())) {
                   int i4 = viewFlinger.this$0.mState.c();
                   if (!i4) {
                      mSmoothScrol.r();
                   }else if(mSmoothScrol.f() >= i4){
                      mSmoothScrol.p((i4 - true));
                      mSmoothScrol.j(i2, i3);
                   }else {
                      mSmoothScrol.j(i2, i3);
                   }
                }
             }else {
                i3 = 0;
                i2 = 0;
             }
             if (!viewFlinger.this$0.mItemDecorations.isEmpty()) {
                viewFlinger.this$0.invalidate();
             }
             RecyclerView$ViewFlinger this$03 = viewFlinger.this$0;
             mReusableInt1 = this$03.mReusableIntPair;
             mReusableInt1[0] = false;
             mReusableInt1[1] = false;
             this$03.dispatchNestedScroll(i2, i3, i, i1, null, 1, mReusableInt1);
             this$02 = viewFlinger.this$0;
             RecyclerView mReusableInt3 = this$02.mReusableIntPair;
             i = i - mReusableInt3[0];
             i1 = i1 - mReusableInt3[1];
             if (i2 || i3) {
                this$02.dispatchOnScrolled(i2, i3);
             }
             if (!RecyclerView.access$200(viewFlinger.this$0)) {
                viewFlinger.this$0.invalidate();
             }
             mSmoothScrol = (this$0.getCurrX() == this$0.getFinalX())? 1: 0;
             RecyclerView$ViewFlinger viewFlinger2 = (this$0.getCurrY() == this$0.getFinalY())? 1: null;
             this$02 = (this$0.isFinished() || (mSmoothScrol || (i && (viewFlinger2 || i1))))? 1: null;
             RecyclerView$LayoutManager mSmoothScrol1 = viewFlinger.this$0.mLayout.mSmoothScroller;
             mSmoothScrol1 = (mSmoothScrol1 != null && mSmoothScrol1.g())? 1: 0;
             if (!mSmoothScrol1 && this$02) {
                if (viewFlinger.this$0.getOverScrollMode() != viewFlinger1) {
                   int i5 = (int)this$0.getCurrVelocity();
                   if (i < 0) {
                      currX = - i5;
                   }else if(i > 0){
                      currX = i5;
                   }else {
                      currX = 0;
                   }
                   if (i1 < 0) {
                      i5 = - i5;
                   }else if(i1 > 0){
                      i5 = 0;
                   }
                   viewFlinger.this$0.absorbGlows(currX, i5);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                   viewFlinger.this$0.mPrefetchRegistry.b();
                }
             }else {
                this.postOnAnimation();
                this$0 = viewFlinger.this$0;
                mReusableInt1 = this$0.mGapWorker;
                if (mReusableInt1 != null) {
                   mReusableInt1.postFromTraversal(this$0, i2, i3);
                }
             }
          }
       label_0169 :
          RecyclerView$LayoutManager mSmoothScrol2 = viewFlinger.this$0.mLayout.mSmoothScroller;
          if (mSmoothScrol2 != null && mSmoothScrol2.g()) {
             mSmoothScrol2.j(false, false);
          }
          viewFlinger.mEatRunOnAnimationRequest = false;
          if (viewFlinger.mReSchedulePostAnimationCallback != null) {
             this.internalPostOnAnimation();
          }else {
             viewFlinger.this$0.setScrollState(false);
             viewFlinger.this$0.stopNestedScroll(true);
          }
          return;
       }
    }
    public void smoothScrollBy(int p0,int p1,int p2,Interpolator p3){
       if (p2 == Integer.MIN_VALUE) {
          p2 = this.computeScrollDuration(p0, p1);
       }
       int i = p2;
       if (p3 == null) {
          p3 = RecyclerView.sQuinticInterpolator;
       }
       if (this.mInterpolator != p3) {
          this.mInterpolator = p3;
          this.mOverScroller = new OverScroller(this.this$0.getContext(), p3);
       }
       this.mLastFlingY = 0;
       this.mLastFlingX = 0;
       this.this$0.setScrollState(2);
       this.mOverScroller.startScroll(0, 0, p0, p1, i);
       if (Build$VERSION.SDK_INT < 23) {
          this.mOverScroller.computeScrollOffset();
       }
       this.postOnAnimation();
       return;
    }
    public void stop(){
       this.this$0.removeCallbacks(this);
       this.mOverScroller.abortAnimation();
    }
}
