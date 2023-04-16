package com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$b;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.customview.widget.ViewDragHelper;
import java.lang.Math;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper$c;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class TopSheetBehavior extends CoordinatorLayout$Behavior	// class@0018fd
{
    public TopSheetBehavior$d a;
    public ViewDragHelper b;
    public int c;
    public WeakReference d;
    public int e;
    public boolean f;
    public final ViewDragHelper$c g;

    public void TopSheetBehavior(){
       super();
       this.g = new TopSheetBehavior$b(this);
    }
    public void TopSheetBehavior(Context p0,AttributeSet p1){
       super();
       this.g = new TopSheetBehavior$b(this);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       TopSheetBehavior obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TopSheetBehavior.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p2.getActionMasked();
       if (!actionMasked) {
          this.e = (int)p2.getY();
          this.b.processTouchEvent(p2);
          this.f = false;
          if (!p0.C(p1, (int)p2.getX(), this.e)) {
             return false;
          }
       }else if(actionMasked == 0.00f && Math.abs(((float)this.e - p2.getY())) - (float)this.b.getTouchSlop() > 0){
          this.f = true;
          return true;
       }
       if (this.f != null) {
          obj = this.b;
          if (obj != null && obj.shouldInterceptTouchEvent(p2)) {
             return true;
          }
       }
       return super.onInterceptTouchEvent(p0, p1, p2);
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       if (PatchProxy.isSupport(TopSheetBehavior.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, TopSheetBehavior.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.b == null) {
          this.b = ViewDragHelper.create(p0, this.g);
       }
       this.c = p0.getHeight();
       this.d = new WeakReference(p1);
       p1.getViewTreeObserver().addOnGlobalLayoutListener(new TopSheetBehavior$a(this, p1));
       return super.onLayoutChild(p0, p1, p2);
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TopSheetBehavior.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       TopSheetBehavior tb = this.b;
       if (tb != null) {
          tb.processTouchEvent(p2);
       }
       return this.f;
    }
}
