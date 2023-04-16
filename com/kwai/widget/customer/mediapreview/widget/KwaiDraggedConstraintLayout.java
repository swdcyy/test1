package com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Math;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout$a;
import java.lang.System;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout$b;
import java.lang.Number;

public class KwaiDraggedConstraintLayout extends ConstraintLayout	// class@00114b
{
    public VelocityTracker B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public long G;
    public KwaiDraggedConstraintLayout$b H;
    public KwaiDraggedConstraintLayout$a I;

    public void KwaiDraggedConstraintLayout(Context p0){
       super(p0);
       this.E = a1.e(3.00f);
    }
    public void KwaiDraggedConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.E = a1.e(3.00f);
    }
    public void KwaiDraggedConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.E = a1.e(3.00f);
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, KwaiDraggedConstraintLayout.class, "3")) {
          return;
       }
       KwaiDraggedConstraintLayout tB = this.B;
       if (tB != null) {
          tB.clear();
       }else {
          this.B = VelocityTracker.obtain();
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       KwaiDraggedConstraintLayout tI;
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDraggedConstraintLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.I == null) {
          return super.onInterceptTouchEvent(p0);
       }
       int i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          boolean b = false;
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_0071 :
                   return b;
                }
             }else {
                int i2 = Math.abs((i - this.C));
                actionMasked = Math.abs((i1 - this.D));
                if (i2 > (actionMasked * 2) && i2 > this.E) {
                   tI = this.I;
                   if ((i - this.C) > 0) {
                      b = true;
                   }
                   return tI.b(b);
                }else if(actionMasked > (i2 * 2) && actionMasked > this.E){
                   tI = this.I;
                   if ((i1 - this.D) > 0) {
                      b = true;
                   }
                   return tI.a(b);
                }else {
                   goto label_0071 ;
                }
             }
          }else {
             goto label_0071 ;
          }
       }else {
          this.C = i;
          this.D = i1;
          this.L();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       KwaiDraggedConstraintLayout tB;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDraggedConstraintLayout.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.H == null) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       int i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int i2 = i - this.C;
       int i3 = i1 - this.D;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_0078 :
                   p0 = PatchProxy.apply(null, this, KwaiDraggedConstraintLayout.class, "5");
                   if (p0 != patchProxyRe) {
                      f = p0.floatValue();
                   }else {
                      tB = this.B;
                      if (tB == null) {
                         f = 0;
                      }else {
                         tB.computeCurrentVelocity(1000, 0x44fa0000);
                         f = this.B.getYVelocity();
                      }
                   }
                   this.H.b(i2, i3, f);
                   if (!PatchProxy.applyVoid(null, this, KwaiDraggedConstraintLayout.class, "6")) {
                      tB = this.B;
                      if (tB != null) {
                         tB.clear();
                         this.B.recycle();
                         this.B = null;
                      }
                   }
                   this.F = b;
                }
             }else {
                long l = System.currentTimeMillis();
                if ((l - this.G) - this.H.c() > 0) {
                   if (this.F == null) {
                      this.H.d();
                   }
                   this.H.a(i2, i3);
                   this.G = l;
                   this.F = true;
                }
                if (!PatchProxy.applyVoidOneRefs(p0, this, KwaiDraggedConstraintLayout.class, "4")) {
                   if (this.B == null) {
                      this.L();
                   }
                   this.B.addMovement(p0);
                }
             }
          }else {
             goto label_0078 ;
          }
       }else {
          this.C = i;
          this.D = i1;
          this.L();
       }
       return true;
    }
    public void setDragListener(KwaiDraggedConstraintLayout$b p0){
       this.H = p0;
    }
    public void setInterceptor(KwaiDraggedConstraintLayout$a p0){
       this.I = p0;
    }
}
