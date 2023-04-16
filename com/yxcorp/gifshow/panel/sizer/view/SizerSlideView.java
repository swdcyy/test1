package com.yxcorp.gifshow.panel.sizer.view.SizerSlideView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.text.TextPaint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Integer;
import zf6.j;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView$b;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView$a;

public class SizerSlideView extends View	// class@000e35
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public Paint f;
    public Paint g;
    public int h;
    public int i;
    public Bitmap j;
    public Rect k;
    public RectF l;
    public Rect m;
    public int n;
    public List o;
    public Bitmap p;
    public boolean q;
    public boolean r;
    public SizerSlideView$b s;
    public SizerSlideView$a t;
    public float u;
    public float v;
    public float w;
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
       SizerSlideView.x = a1.e(8.00f);
       SizerSlideView.y = a1.e(4.00f);
       SizerSlideView.z = a1.e(4.00f);
       SizerSlideView.A = a1.e(23.00f);
       SizerSlideView.B = a1.e(36.00f);
       SizerSlideView.C = a1.e(36.00f);
       SizerSlideView.D = a1.e(6.00f);
       SizerSlideView.E = a1.e(14.00f);
    }
    public void SizerSlideView(Context p0){
       super(p0, null);
    }
    public void SizerSlideView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SizerSlideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 0x7f0616ee;
       this.b = i;
       this.c = 0x7f060751;
       int i1 = 0x7f061692;
       this.d = i1;
       this.e = 0x7f0607c5;
       if (PatchProxy.applyVoid(null, this, SizerSlideView.class, "2")) {
       }else {
          Paint paint = new Paint(1);
          this.f = paint;
          paint.setColor(this.c(i));
          this.f.setStyle(Paint$Style.FILL);
          TextPaint textPaint = new TextPaint(1);
          this.g = textPaint;
          textPaint.setColor(this.c(i1));
          this.g.setTextSize((float)a1.e(12.00f));
          this.k = new Rect();
          RectF rectF = new RectF();
          this.l = rectF;
          rectF.left = (float)(SizerSlideView.E + SizerSlideView.y);
          i1 = SizerSlideView.z;
          float f = (float)SizerSlideView.D;
          float f1 = (float)SizerSlideView.B / 2.00f;
          rectF.top = (((float)(- i1) / 2.00f) + f) + f1;
          rectF.bottom = (((float)i1 / 2.00f) + f) + f1;
          this.j = BitmapFactory.decodeResource(this.getResources(), 0x7f081a0c);
          this.p = BitmapFactory.decodeResource(this.getResources(), 0x7f081a0d);
       }
       return;
    }
    public final float a(float p0){
       if (PatchProxy.isSupport(SizerSlideView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, SizerSlideView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p0 - this.e() < 0) {
          p0 = this.e();
       }else if(p0 - this.i() > 0){
          p0 = this.i();
       }
       return p0;
    }
    public final int b(float p0){
       if (PatchProxy.isSupport(SizerSlideView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, SizerSlideView.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = Math.round(((p0 - (float)SizerSlideView.E) / (float)(SizerSlideView.x + this.i)));
       int i1 = (q.f(this.o))? 0: this.o.size() - 1;
       return Math.min(i, i1);
    }
    public final int c(int p0){
       if (PatchProxy.isSupport(SizerSlideView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SizerSlideView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return j.d(this, p0);
    }
    public final int d(int p0){
       return ((SizerSlideView.E + SizerSlideView.y) + (p0 * (SizerSlideView.x + this.i)));
    }
    public final float e(){
       return ((float)SizerSlideView.C / 2.00f);
    }
    public final void f(int p0){
       if (PatchProxy.isSupport(SizerSlideView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SizerSlideView.class, "4")) {
          return;
       }
       if (!p0 || this.i == null) {
          this.v = this.e();
       }else {
          float f = (float)this.d(p0);
          if (f - this.e() < 0) {
             this.v = this.e();
          }else if(f - this.i() > 0){
             this.v = this.i();
          }else {
             this.v = f;
          }
       }
       this.w = this.v;
       return;
    }
    public final void g(float p0){
       if (PatchProxy.isSupport(SizerSlideView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SizerSlideView.class, "15")) {
          return;
       }
       int i = this.b(p0);
       this.setSelected(true);
       this.f(i);
       this.setSelectedPosition(i);
       SizerSlideView ts = this.s;
       if (ts != null) {
          ts.a(i);
       }
       this.r = false;
       return;
    }
    public final Rect getIconDesRect(){
       SizerSlideView obj = PatchProxy.apply(null, this, SizerSlideView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          this.m = new Rect();
       }
       int c = SizerSlideView.C;
       this.m.left = Math.round((this.v - ((float)c / 2.00f)));
       this.m.right = Math.round((this.v + ((float)c / 2.00f)));
       obj = this.m;
       int d = SizerSlideView.D;
       obj.top = d;
       obj.bottom = d + SizerSlideView.B;
       return obj;
    }
    public final void h(boolean p0){
       if (PatchProxy.isSupport(SizerSlideView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SizerSlideView.class, "9")) {
          return;
       }
       SizerSlideView tl = this.l;
       int i = (p0)? (this.h - SizerSlideView.y) - SizerSlideView.E: Math.round(this.v);
       tl.right = (float)i;
       return;
    }
    public final float i(){
       return ((float)this.h - ((float)SizerSlideView.C / 2.00f));
    }
    public void onDraw(Canvas p0){
       String obj;
       float f1;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, SizerSlideView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (this.o == null) {
          return;
       }
       p0.save();
       float f = 2.00f;
       p0.translate((float)SizerSlideView.E, (((float)SizerSlideView.B / f) + (float)SizerSlideView.D));
       int i = 0;
       int i1 = 0;
       int b = true;
       while (i1 < this.o.size()) {
          if (!PatchProxy.isSupport(SizerSlideView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i1), this, SizerSlideView.class, "7")) {
             if (this.v - (float)this.d(i1) >= 0 && this.isSelected()) {
                this.f.setColor(this.c(this.c));
             }else {
                this.f.setColor(this.c(this.b));
             }
             int y = SizerSlideView.y;
             i2 = SizerSlideView.x + this.i;
             i2 = i2 * i1;
             i2 = i2 + y;
             p0.drawCircle((float)i2, 0, (float)y, this.f);
          }
          if (!PatchProxy.isSupport(SizerSlideView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i1), this, SizerSlideView.class, "8")) {
             if (i1 == this.n) {
                if (this.isSelected()) {
                   this.g.setColor(this.c(this.e));
                }
                if (this.r == null) {
                   this.g.setFakeBoldText(b);
                }
             }else {
                this.g.setColor(this.c(this.d));
                this.g.setFakeBoldText(i);
             }
             String str = this.o.get(i1);
             if (PatchProxy.isSupport(SizerSlideView.class)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, SizerSlideView.class, "11");
                if (obj != PatchProxyResult.class) {
                   f1 = obj.floatValue();
                label_0117 :
                   i2 = SizerSlideView.A + this.k.height();
                   p0.drawText(str, f1, (float)i2, this.g);
                }
             }
             obj = this.o.get(i1);
             this.g.getTextBounds(obj, i, obj.length(), this.k);
             i2 = SizerSlideView.x + this.i;
             i2 = i2 * i1;
             b = SizerSlideView.y + i2;
             float f2 = (float)this.k.width() / f;
             f1 = (float)b - f2;
             goto label_0117 ;
          }
          i1 = i1 + 1;
       }
       p0.restore();
       if (!PatchProxy.applyVoidOneRefs(p0, this, SizerSlideView.class, "6")) {
          this.f.setColor(this.c(this.b));
          this.h(b);
          p0.drawRect(this.l, this.f);
          if (this.v - this.e() > 0 && this.isSelected()) {
             this.f.setColor(this.c(this.c));
             this.h(i);
             p0.drawRect(this.l, this.f);
          }
       }
       SizerSlideView tp = (this.q != null || this.isSelected())? this.p: this.j;
       p0.drawBitmap(tp, null, this.getIconDesRect(), null);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SizerSlideView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SizerSlideView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.h = p0;
       if (!q.f(this.o)) {
          this.i = ((this.h - (SizerSlideView.E * 2)) - (SizerSlideView.x * this.o.size())) / (this.o.size() - 1);
          this.f(this.n);
          this.r = true;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SizerSlideView obj = PatchProxy.applyOneRefs(p0, this, SizerSlideView.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                label_0080 :
                   float f = this.a(p0.getX());
                   this.v = f;
                   this.q = false;
                   if (Math.abs((f - this.u)) - (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop() >= 0) {
                      this.g(this.v);
                   }else {
                      obj = this.v;
                      if (PatchProxy.isSupport(SizerSlideView.class)) {
                         Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(obj), this, SizerSlideView.class, "17");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         label_00e6 :
                            if (b1) {
                               this.g(this.v);
                            }else {
                               this.v = this.w;
                               this.invalidate(this.getIconDesRect());
                            }
                         }
                      }
                      if (Math.abs((obj - (float)this.d(this.b(obj)))) - (float)a1.e(21.00f) > 0) {
                         b = 0;
                      }
                      b1 = b;
                      goto label_00e6 ;
                   }
                }
             }else {
                this.v = this.a(p0.getX());
                this.getParent().requestDisallowInterceptTouchEvent(b);
                if (Math.abs((this.v - this.u)) - (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop() >= 0) {
                   SizerSlideView tv = this.v;
                   if (!PatchProxy.isSupport(SizerSlideView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(tv), this, SizerSlideView.class, "16")) {
                      this.n = this.b(tv);
                      this.setSelected(b);
                      this.invalidate();
                      obj = this.t;
                      if (obj != null) {
                         obj.a(tv, this.n);
                      }
                   }
                }
             }
          }else {
             goto label_0080 ;
          }
          return super.onTouchEvent(p0);
       }else {
          float x = p0.getX();
          this.u = x;
          this.v = x;
          this.q = b;
          return b;
       }
    }
    public void setOnScrollListener(SizerSlideView$a p0){
       this.t = p0;
    }
    public void setOnSelectedListener(SizerSlideView$b p0){
       this.s = p0;
    }
    public void setSelectedPosition(int p0){
       if (PatchProxy.isSupport(SizerSlideView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SizerSlideView.class, "12")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       this.n = p0;
       this.f(p0);
       this.invalidate();
       return;
    }
}
