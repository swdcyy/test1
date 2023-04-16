package com.yxcorp.gifshow.widget.adv.b;
import java.lang.Cloneable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.content.res.Resources$Theme;
import o1.f;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.ColorFilter;

public abstract class b extends Drawable implements Cloneable	// class@00191a
{
    public final Paint b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final RectF p;
    public final RectF q;
    public RectF r;
    public Matrix s;
    public boolean t;

    public void b(Resources p0,float p1,float p2){
       float f;
       super();
       Paint paint = new Paint(1);
       this.b = paint;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0x3f800000;
       this.p = new RectF();
       this.q = new RectF();
       this.r = new RectF();
       this.s = new Matrix();
       this.t = true;
       this.n = f.c(p0, 0x7f0807df, null);
       this.m = f.c(p0, 0x7f081c64, null);
       this.o = f.c(p0, 0x7f081b3d, null);
       this.h = (float)n.c(a.a().a(), 13.00f);
       this.i = (float)n.c(a.a().a(), 2.00f);
       f = (float)n.c(a.a().a(), 0x3f800000);
       this.j = f;
       this.k = (float)n.c(a.a().a(), 0x3f800000);
       this.l = (float)n.c(a.a().a(), 2.00f);
       paint.setColor(p0.getColor(R.color.arg_RES_7f061990));
       paint.setStrokeWidth(f);
       paint.setStyle(Paint$Style.STROKE);
       this.d = p1;
       this.e = p2;
    }
    public boolean a(){
       return this.c;
    }
    public b b(){
       b obj = PatchProxy.apply(null, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.c = false;
          obj.b.set(this.b);
          obj.r = new RectF(this.r);
          obj.s = new Matrix(this.s);
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public abstract void c(Canvas p0,float p1,float p2);
    public Object clone(){
       return this.b();
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       float f = (float)this.getIntrinsicWidth() / 2.00f;
       float f1 = (float)this.getIntrinsicHeight() / 2.00f;
       b td = this.d;
       float f2 = td - f;
       b te = this.e;
       float f3 = te - f1;
       this.r.set(f2, f3, (td + f), (te + f1));
       if (!PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          this.s.reset();
          this.s.setScale((0x3f800000 / this.g), (0x3f800000 / this.g), this.d, this.e);
          this.s.postRotate((- this.f), this.d, this.e);
       }
       return;
    }
    public final void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       p0.save();
       p0.translate(this.d, this.e);
       p0.scale(this.g, this.g);
       p0.rotate(this.f);
       this.c(p0, 0, 0);
       if (this.a()) {
          float f = this.j / this.g;
          this.b.setStrokeWidth(f);
          this.q.set(((float)(- this.getIntrinsicWidth()) / 2.00f), ((float)(- this.getIntrinsicHeight()) / 2.00f), ((float)this.getIntrinsicWidth() / 2.00f), ((float)this.getIntrinsicHeight() / 2.00f));
          this.q.inset(((- f) / 2.00f), ((- f) / 2.00f));
          b ti = this.i;
          b tg = this.g;
          float f1 = ti / tg;
          float f2 = ti / tg;
          p0.drawRoundRect(this.q, f1, f2, this.b);
          f = this.h / this.g;
          tg = this.q;
          RectF left = tg.left;
          RectF top = tg.top;
          this.m.setBounds((int)(left - f), (int)(top - f), (int)(left + f), (int)(top + f));
          this.m.draw(p0);
          if (this.t != null) {
             tg = this.q;
             left = tg.right;
             top = tg.top;
             this.n.setBounds((int)(left - f), (int)(top - f), (int)(left + f), (int)(top + f));
             this.n.draw(p0);
          }
          tg = this.q;
          left = tg.right;
          top = tg.bottom;
          this.o.setBounds((int)(left - f), (int)(top - f), (int)(left + f), (int)(top + f));
          this.o.draw(p0);
       }
       p0.restore();
       return;
    }
    public boolean equals(Object p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = false;
       if (!p0 instanceof b) {
          return b;
       }
       if (!p0.d - this.d && (!p0.e - this.e && (!p0.g - this.g && (!p0.f - this.f && (p0.m == this.m && (p0.n == this.n && (p0.o == this.o && (p0.r.equals(this.r) && (p0.s.equals(this.s) && p0.t == this.t))))))))) {
          p0 = p0.b;
          obj = this.b;
          Object obj1 = PatchProxy.applyTwoRefs(p0, obj, this, b.class, "21");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!p0.getStrokeWidth() - obj.getStrokeWidth() && (p0.getStyle() == obj.getStyle() && p0.getColor() == obj.getColor())){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             b = true;
          }
       }
    label_00a3 :
       return b;
    }
    public int getOpacity(){
       return -3;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, b.class, "5")) {
          return;
       }
       this.b.setAlpha(p0);
       this.invalidateSelf();
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       this.b.setColorFilter(p0);
       this.invalidateSelf();
       return;
    }
}
