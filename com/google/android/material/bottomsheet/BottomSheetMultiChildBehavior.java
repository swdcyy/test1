package com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import java.lang.IllegalArgumentException;
import java.lang.String;
import a2.i0;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior$a;
import java.lang.Object;
import java.lang.ref.WeakReference;

public class BottomSheetMultiChildBehavior extends BottomSheetBehavior	// class@00165a
{
    public boolean mDragDisable;
    public BottomSheetMultiChildBehavior$a mHidePanelCallback;

    public void BottomSheetMultiChildBehavior(){
       super();
    }
    public void BottomSheetMultiChildBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public static BottomSheetMultiChildBehavior from(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof CoordinatorLayout$LayoutParams) {
          throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
       }
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       if (uBehavior instanceof BottomSheetMultiChildBehavior) {
          return uBehavior;
       }
       throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    public View findScrollingChild(View p0){
       if (p0 != null && !i0.Z(p0)) {
          if (p0 instanceof ViewPager) {
             return this.findScrollingChild(p0.getChildAt(p0.getCurrentItem()));
          }else {
             p0 = super.findScrollingChild(p0);
          }
       }
       return p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       if (this.mDragDisable != null) {
          return false;
       }
       if (!super.onInterceptTouchEvent(p0, p1, p2)) {
          return this.shouldConsumeEvent(p0, p1, p2);
       }
       return true;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       if (this.mDragDisable != null) {
          return false;
       }
       if (!super.onTouchEvent(p0, p1, p2)) {
          return this.shouldConsumeEvent(p0, p1, p2);
       }
       return true;
    }
    public void setDragDisable(boolean p0){
       this.mDragDisable = p0;
    }
    public void setHidePanelCallback(BottomSheetMultiChildBehavior$a p0){
       this.mHidePanelCallback = p0;
    }
    public final boolean shouldConsumeEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int i = (int)p2.getRawY();
       if (this.getState() == 5 || i >= (p1.getTop() + p0.getTop())) {
          return false;
       }
       if (p2.getActionMasked() == 1) {
          this.setState(5);
          BottomSheetMultiChildBehavior tmHidePanelC = this.mHidePanelCallback;
          if (tmHidePanelC != null) {
             tmHidePanelC.a();
          }
       }
       return true;
    }
    public void updateScrollingChild(){
       this.nestedScrollingChildRef = new WeakReference(this.findScrollingChild(this.viewRef.get()));
    }
}
