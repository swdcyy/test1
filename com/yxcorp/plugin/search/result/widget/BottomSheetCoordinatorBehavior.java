package com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorBehavior;
import com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetCoordinatorBehavior extends BottomSheetInsetsBehavior	// class@000755
{
    public boolean b;
    public boolean c;
    public float d;
    public float e;

    public void BottomSheetCoordinatorBehavior(){
       super();
    }
    public void BottomSheetCoordinatorBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void c(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetCoordinatorBehavior.class, "4")) {
          return;
       }
       float f = 0;
       boolean b = false;
       if (!this.d - f || !this.e - f) {
          this.e = p0.getX();
          this.d = p0.getY();
          this.b = b;
          this.c = b;
          return;
       }else {
          int actionMasked = p0.getActionMasked();
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked != 2) {
                   if (actionMasked == 3) {
                   label_006c :
                      this.b = b;
                      this.c = b;
                      this.d = f;
                      this.e = f;
                   }
                }else {
                   float x = p0.getX();
                   float y = p0.getY();
                   boolean b1 = (Math.abs((y - this.d)) - Math.abs((x - this.e)) > 0 && Math.abs((y - this.d)) - (float)ViewConfiguration.getTouchSlop() > 0)? true: false;
                   this.c = b1;
                   if (y - this.d > 0 && b1) {
                      b = true;
                   }
                   this.b = b;
                   this.d = y;
                   this.e = x;
                }
             }else {
                goto label_006c ;
             }
             return;
          }else {
             this.b = b;
             this.c = b;
             this.e = p0.getX();
             this.d = p0.getY();
             return;
          }
       }
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetCoordinatorBehavior.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!p1.a0()){
          b = super.onInterceptTouchEvent(p0, p1, p2);
       }else if(!p0.C(p1, (int)p2.getX(), (int)p2.getY())){
          b = super.onInterceptTouchEvent(p0, p1, p2);
       }else {
          this.c(p2);
          if (p1.getState() == 3) {
             if (!p1.Z()) {
                if (!p2.getActionMasked()) {
                   super.onInterceptTouchEvent(p0, p1, p2);
                }else {
                   b = this.b;
                }
             }
          }else if(p1.getState() == 4){
             if (!p2.getActionMasked()) {
                super.onInterceptTouchEvent(p0, p1, p2);
             }else {
                b = this.c;
             }
          }else {
             b = super.onInterceptTouchEvent(p0, p1, p2);
          }
          b = false;
       }
       return b;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetCoordinatorBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!p1.a0()){
          b = super.onTouchEvent(p0, p1, p2);
       }else if(!p0.C(p1, (int)p2.getX(), (int)p2.getY())){
          b = super.onTouchEvent(p0, p1, p2);
       }else {
          this.c(p2);
          b = (p1.getState() == 3 && (!p1.Z() && this.b == null))? false: super.onTouchEvent(p0, p1, p2);
       }
       return b;
    }
}
