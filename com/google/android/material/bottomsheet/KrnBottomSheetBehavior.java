package com.google.android.material.bottomsheet.KrnBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.KrnBottomSheetBehavior$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.VelocityTracker;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import hf.a;
import java.lang.ref.WeakReference;

public final class KrnBottomSheetBehavior extends BottomSheetBehavior	// class@001660
{
    public VelocityTracker a;
    public int b;
    public float c;
    public static final KrnBottomSheetBehavior$a d;

    static {
       KrnBottomSheetBehavior.d = new KrnBottomSheetBehavior$a(null);
    }
    public void KrnBottomSheetBehavior(){
       super();
    }
    public void KrnBottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.c = (float)viewConfigur.getScaledMaximumFlingVelocity();
    }
    private final void reset(){
       this.b = -1;
       KrnBottomSheetBehavior ta = this.a;
       if (ta != null) {
          ta.recycle();
       }
       this.a = null;
       return;
    }
    public final void c(CoordinatorLayout p0,View p1,MotionEvent p2){
       if (!p2.getAction()) {
          this.b = p2.getPointerId(p2.getActionIndex());
          p1 = a.a(p0, "krn_bottom_sheet_scrollview_id");
          this.nestedScrollingChildRef = (p1 != null)? new WeakReference(p1): true;
       }else if(p2.getAction() == 1 || p2.getAction() == 3){
          this.b = -1;
       }
       BottomSheetBehavior tnestedScrol = this.nestedScrollingChildRef;
       if (tnestedScrol != null && tnestedScrol.get() != null) {
          tnestedScrol = this.nestedScrollingChildRef.get();
          if (tnestedScrol == null || tnestedScrol.canScrollVertically(-1) != true) {
             this.touchingScrollingChild = false;
          }else {
             p0.requestDisallowInterceptTouchEvent(true);
          }
       }
       return;
    }
    public View findScrollingChild(View p0){
       return null;
    }
    public final float getYVelocity(){
       float yVelocity;
       KrnBottomSheetBehavior ta = this.a;
       if (ta != null) {
          a.m(ta);
          ta.computeCurrentVelocity(1000, this.c);
          ta = this.a;
          a.m(ta);
          yVelocity = ta.getYVelocity(this.b);
       }else {
          yVelocity = 0;
       }
       return yVelocity;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       boolean b = super.onInterceptTouchEvent(p0, p1, p2);
       if (!p2.getActionMasked()) {
          this.reset();
       }
       if (this.a == null) {
          this.a = VelocityTracker.obtain();
       }
       KrnBottomSheetBehavior ta = this.a;
       if (ta != null) {
          ta.addMovement(p2);
       }
       this.c(p0, p1, p2);
       return b;
    }
}
