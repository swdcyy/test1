package com.google.android.material.behavior.SwipeDismissBehavior$a;
import androidx.customview.widget.ViewDragHelper$c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.view.View;
import a2.i0;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior$b;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior$c;
import java.lang.Runnable;
import java.lang.Math;

public class SwipeDismissBehavior$a extends ViewDragHelper$c	// class@001636
{
    public int a;
    public int b;
    public final SwipeDismissBehavior c;

    public void SwipeDismissBehavior$a(SwipeDismissBehavior p0){
       this.c = p0;
       super();
       this.b = -1;
    }
    public int a(View p0,int p1,int p2){
       SwipeDismissBehavior$a ta;
       int width;
       int i = 1;
       SwipeDismissBehavior$a uoa = (i0.B(p0) == i)? 1: null;
       SwipeDismissBehavior f = this.c.f;
       if (f == null) {
          if (uoa) {
             uoa = this.a - p0.getWidth();
             ta = this.a;
          }else {
             uoa = this.a;
             width = p0.getWidth();
          label_0022 :
             width = width + uoa;
          }
       }else if(f == i){
          if (uoa != null) {
             uoa = this.a;
             width = p0.getWidth();
             goto label_0022 ;
          }else {
             uoa = this.a - p0.getWidth();
             ta = this.a;
          }
       }else {
          uoa = this.a - p0.getWidth();
          width = p0.getWidth() + this.a;
       }
       return SwipeDismissBehavior.e(uoa, p1, ta);
    }
    public int b(View p0,int p1,int p2){
       return p0.getTop();
    }
    public int d(View p0){
       return p0.getWidth();
    }
    public void i(View p0,int p1){
       this.b = p1;
       this.a = p0.getLeft();
       ViewParent parent = p0.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(true);
       }
       return;
    }
    public void j(int p0){
       SwipeDismissBehavior b = this.c.b;
       if (b != null) {
          b.b(p0);
       }
       return;
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       float f = (float)this.a + ((float)p0.getWidth() * this.c.h);
       float f1 = (float)this.a + ((float)p0.getWidth() * this.c.i);
       float f2 = (float)p1;
       if (f2 - f <= 0) {
          p0.setAlpha(0x3f800000);
       }else if(f2 - f1 >= 0){
          p0.setAlpha(0);
       }else {
          p0.setAlpha(SwipeDismissBehavior.d(0, (0x3f800000 - SwipeDismissBehavior.h(f, f1, f2)), 0x3f800000));
       }
       return;
    }
    public void l(View p0,float p1,float p2){
       int i;
       boolean b;
       this.b = -1;
       int width = p0.getWidth();
       if (this.n(p0, p1)) {
          SwipeDismissBehavior$a ta = this.a;
          i = (p0.getLeft() < ta)? ta - width: ta + width;
          b = true;
       }else {
          i = this.a;
          b = false;
       }
       if (this.c.a.settleCapturedViewAt(i, p0.getTop())) {
          i0.k0(p0, new SwipeDismissBehavior$c(this.c, p0, b));
       }else if(b){
          SwipeDismissBehavior b1 = this.c.b;
          if (b1 != null) {
             b1.a(p0);
          }
       }
       return;
    }
    public boolean m(View p0,int p1){
       boolean b = (this.b == -1 && this.c.c(p0))? true: false;
       return b;
    }
    public final boolean n(View p0,float p1){
       boolean b = false;
       SwipeDismissBehavior$a uoa = null;
       if (v3 = p1 - uoa) {
          int i = (i0.B(p0) == 1)? 1: 0;
          SwipeDismissBehavior f = this.c.f;
          if (f == 2) {
             return true;
          }else if(f == null){
             if (i) {
                if (p1 - uoa < 0) {
                label_0023 :
                   b = true;
                }
             }else if(v3 > 0){
                goto label_0023 ;
             }
             return b;
          }else if(f == true){
             if (i) {
                if (v3 <= 0) {
                label_0031 :
                   return b;
                }
             }else if(p1 - uoa < 0){
             }
             b = true;
             goto label_0031 ;
          }else {
             goto label_0031 ;
          }
       }else if(Math.abs((p0.getLeft() - this.a)) >= Math.round(((float)p0.getWidth() * this.c.g))){
          b = true;
       }
       return b;
    }
}
