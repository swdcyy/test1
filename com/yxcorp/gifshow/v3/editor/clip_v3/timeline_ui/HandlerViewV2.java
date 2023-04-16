package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.HandlerViewV2;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fpc.a;
import epc.a;
import java.lang.Math;
import com.yxcorp.utility.n;
import dpc.g;

public final class HandlerViewV2 extends View	// class@000dc7
{
    public final String b;
    public final int c;
    public final Paint d;
    public final RectF e;
    public final RectF f;
    public int g;
    public a h;
    public a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public int o;
    public int p;
    public HashMap q;

    public void HandlerViewV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "HandlerViewV2";
       this.c = a1.e(34.00f);
       Paint paint = new Paint();
       this.d = paint;
       this.e = new RectF();
       this.f = new RectF();
       this.g = -1;
       paint.setAntiAlias(true);
    }
    public void HandlerViewV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.b = "HandlerViewV2";
       this.c = a1.e(34.00f);
       Paint paint = new Paint();
       this.d = paint;
       this.e = new RectF();
       this.f = new RectF();
       this.g = -1;
       paint.setAntiAlias(true);
    }
    public void HandlerViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1, p2);
       this.b = "HandlerViewV2";
       this.c = a1.e(34.00f);
       Paint paint = new Paint();
       this.d = paint;
       this.e = new RectF();
       this.f = new RectF();
       this.g = -1;
       paint.setAntiAlias(true);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, HandlerViewV2.class, "6")) {
          return;
       }
       this.m = 0;
       this.j = false;
       this.k = false;
       this.l = false;
       this.setActivated(false);
       this.n = 0;
       this.o = 0;
       this.p = 0;
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(HandlerViewV2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HandlerViewV2.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       float f = (float)this.getMeasuredHeight();
       this.e.set(0, 0, (float)this.c, f);
       float f1 = (float)this.getMeasuredWidth();
       this.f.set((f1 - (float)this.c), 0, f1, f);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       HandlerViewV2 ti;
       HandlerViewV2 tg;
       HandlerViewV2 obj = PatchProxy.applyOneRefs(p0, this, HandlerViewV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          float rawX = p0.getRawX();
          boolean actionMasked = p0.getActionMasked();
          HandlerViewV2 handlerViewV = 2;
          String str = "segment";
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked != handlerViewV) {
                   if (actionMasked != 3) {
                      if (actionMasked != 6) {
                         if (actionMasked == 12) {
                         label_008f :
                            if (this.k != null || this.l != null) {
                               rawX = rawX - this.m;
                               ti = this.i;
                               if (ti != null) {
                                  tg = this.g;
                                  handlerViewV = this.h;
                                  if (handlerViewV == null) {
                                     a.S(str);
                                  }
                                  ti.a(tg, handlerViewV, this.k, rawX);
                               }
                            }
                            this.a();
                         }
                      }else if(this.k != null || this.l != null){
                         ti = this.i;
                         if (ti != null) {
                            obj = this.g;
                            tg = this.h;
                            if (tg == null) {
                               a.S(str);
                            }
                            ti.a(obj, tg, this.k, 0);
                         }
                      }
                      this.a();
                   }else {
                      goto label_008f ;
                   }
                }else if(this.k == null && this.l == null){
                   if (this.j == null) {
                      this.j = true;
                   }
                   float f = rawX - this.m;
                   float f1 = rawX - this.n;
                   this.m = rawX;
                   if ((float)this.o - f1 <= 0 && f1 - (float)this.p <= 0) {
                      obj = this.i;
                      if (obj != null) {
                         tg = this.g;
                         handlerViewV = this.h;
                         if (handlerViewV == null) {
                            a.S(str);
                         }
                         obj.b(tg, handlerViewV, this.k, f);
                      }
                   }
                }
             }else {
                goto label_008f ;
             }
          }else {
             this.a();
             actionMasked = this.e.contains(p0.getX(), p0.getY());
             int b = this.f.contains(p0.getX(), p0.getY());
             int i = 0;
             if (actionMasked && b) {
                if (Math.abs((this.e.centerX() - p0.getX())) - Math.abs((this.f.centerX() - p0.getX())) > 0) {
                   actionMasked = false;
                }else {
                   b = false;
                }
             }
             this.m = rawX;
             this.n = rawX;
             if (actionMasked || b) {
                if (!PatchProxy.isSupport(HandlerViewV2.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(actionMasked), this, HandlerViewV2.class, "5")) {
                   int i1 = n.p(this)[i];
                   int i2 = this.getWidth() + i1;
                   b = a1.h();
                   if (actionMasked) {
                      this.o = (g.a() + g.c()) - i1;
                      this.p = ((b - (g.b() * 2)) - g.a()) - i1;
                   }else {
                      this.o = ((g.a() + g.c()) + (g.b() * 2)) - i2;
                      this.p = (b - g.a()) - i2;
                   }
                }
                this.k = actionMasked;
                this.l = actionMasked ^ 0x01;
                ti = this.i;
                if (ti != null) {
                   obj = this.g;
                   tg = this.h;
                   if (tg == null) {
                      a.S(str);
                   }
                   ti.c(obj, tg, this.k);
                }
                return true;
             }
          }
       }
    label_017a :
       return this.j;
    }
}
