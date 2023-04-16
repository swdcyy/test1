package androidx.slidingpanelayout.widget.SlidingPaneLayout$c;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import androidx.customview.widget.ViewDragHelper;

public class SlidingPaneLayout$c extends ViewDragHelper$c	// class@000991
{
    public final SlidingPaneLayout a;

    public void SlidingPaneLayout$c(SlidingPaneLayout p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       int i;
       SlidingPaneLayout$LayoutParams layoutParams = this.a.mSlideableView.getLayoutParams();
       if (this.a.isLayoutRtlSupport()) {
          p2 = this.a.getWidth() - ((this.a.getPaddingRight() + layoutParams.rightMargin) + this.a.mSlideableView.getWidth());
          i = Math.max(Math.min(p1, p2), (p2 - this.a.mSlideRange));
       }else {
          p2 = this.a.getPaddingLeft() + layoutParams.leftMargin;
          i = Math.min(Math.max(p1, p2), (this.a.mSlideRange + p2));
       }
       return i;
    }
    public int b(View p0,int p1,int p2){
       return p0.getTop();
    }
    public int d(View p0){
       return this.a.mSlideRange;
    }
    public void f(int p0,int p1){
       SlidingPaneLayout$c ta = this.a;
       ta.mDragHelper.captureChildView(ta.mSlideableView, p1);
    }
    public void i(View p0,int p1){
       this.a.setAllChildrenVisible();
    }
    public void j(int p0){
       if (!this.a.mDragHelper.getViewDragState()) {
          SlidingPaneLayout$c ta = this.a;
          if (!ta.mSlideOffset) {
             ta.updateObscuredViewsVisibility(ta.mSlideableView);
             ta = this.a;
             ta.dispatchOnPanelClosed(ta.mSlideableView);
             ta.mPreservedOpenState = false;
          }else {
             ta.dispatchOnPanelOpened(ta.mSlideableView);
             ta.mPreservedOpenState = true;
          }
       }
       return;
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       this.a.onPanelDragged(p1);
       this.a.invalidate();
    }
    public void l(View p0,float p1,float p2){
       int i1;
       SlidingPaneLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (this.a.isLayoutRtlSupport()) {
          int i = this.a.getPaddingRight() + layoutParams.rightMargin;
          if (p1 < 0 || (!p1 && this.a.mSlideOffset - 0x3f000000 > 0)) {
             i = i + this.a.mSlideRange;
          }
          i1 = (this.a.getWidth() - i) - this.a.mSlideableView.getWidth();
       }else {
          i1 = layoutParams.leftMargin + this.a.getPaddingLeft();
          p1 = p1;
          if (p1 > 0 || (!p1 && this.a.mSlideOffset - 0x3f000000 > 0)) {
             i1 = i1 + this.a.mSlideRange;
          }
       }
       this.a.mDragHelper.settleCapturedViewAt(i1, p0.getTop());
       this.a.invalidate();
       return;
    }
    public boolean m(View p0,int p1){
       if (this.a.mIsUnableToDrag != null) {
          return false;
       }
       return p0.getLayoutParams().b;
    }
}
