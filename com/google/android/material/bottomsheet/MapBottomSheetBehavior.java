package com.google.android.material.bottomsheet.MapBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.MapBottomSheetBehavior$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.View;
import java.lang.String;
import hf.a;
import com.google.android.material.bottomsheet.MapBottomSheetBehavior$b;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.MotionEvent;
import kotlin.jvm.internal.a;

public final class MapBottomSheetBehavior extends BottomSheetBehavior	// class@001663
{
    public ViewTreeObserver$OnScrollChangedListener a;
    public View b;
    public CoordinatorLayout c;
    public boolean d;
    public static final MapBottomSheetBehavior$a e;

    static {
       MapBottomSheetBehavior.e = new MapBottomSheetBehavior$a(null);
    }
    public void MapBottomSheetBehavior(){
       super();
    }
    public void MapBottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void c(CoordinatorLayout p0){
       BottomSheetBehavior tnestedScrol = this.nestedScrollingChildRef;
       if (tnestedScrol != null && tnestedScrol.get() != null) {
          View view = this.nestedScrollingChildRef.get();
          if (view == null || view.canScrollVertically(-1) != true) {
             this.touchingScrollingChild = false;
          }
       }else {
          View view1 = a.a(p0, "cod-container-host-scrollview");
          if (view1 != null) {
             this.nestedScrollingChildRef = new WeakReference(view1);
             this.b = view1;
             this.a = new MapBottomSheetBehavior$b(view1, p0);
             view1.getViewTreeObserver().addOnScrollChangedListener(this.a);
          }
       }
       return;
    }
    public final void d(){
       MapBottomSheetBehavior tb = this.b;
       if (tb != null) {
          ViewTreeObserver viewTreeObse = tb.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnScrollChangedListener(this.a);
          }
       }
       return;
    }
    public final void e(boolean p0){
       this.d = p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       this.c = p0;
       boolean b = super.onInterceptTouchEvent(p0, p1, p2);
       if (this.d != null) {
          if (this.state != 5) {
             this.touchingScrollingChild = true;
             MapBottomSheetBehavior tc = this.c;
             if (tc != null) {
                tc.requestDisallowInterceptTouchEvent(true);
             }
          }
       }else {
          this.c(p0);
       }
       return b;
    }
    public void setStateInternal(int p0){
       super.setStateInternal(p0);
       if (p0 == 5 || (p0 == 4 && this.d != null)) {
          MapBottomSheetBehavior tc = this.c;
          if (tc != null) {
             tc.requestDisallowInterceptTouchEvent(false);
          }
       }
       return;
    }
}
