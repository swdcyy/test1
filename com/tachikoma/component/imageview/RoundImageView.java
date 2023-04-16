package com.tachikoma.component.imageview.RoundImageView;
import android.widget.ImageView;
import android.graphics.Bitmap$Config;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.BitmapDrawable;
import xb.h;
import xb.b;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Canvas;
import java.lang.Throwable;
import zp8.a;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import java.lang.Math;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.graphics.PorterDuffColorFilter;
import java.lang.Integer;
import android.graphics.PorterDuff$Mode;
import android.graphics.ColorFilter;
import android.graphics.Path$Direction;
import android.view.View;
import java.lang.Float;
import iq8.n;
import iq8.p;

public class RoundImageView extends ImageView	// class@000cf7
{
    public final RectF b;
    public final RectF c;
    public final Matrix d;
    public final Paint e;
    public final Paint f;
    public Path g;
    public int h;
    public float i;
    public Bitmap j;
    public BitmapShader k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Integer v;
    public static final Bitmap$Config w;

    static {
       RoundImageView.w = Bitmap$Config.ARGB_8888;
    }
    public void RoundImageView(Context p0){
       super(p0, null);
    }
    public void RoundImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = new RectF();
       this.d = new Matrix();
       this.e = new Paint();
       this.f = new Paint();
       this.g = new Path();
       this.h = 0;
       this.i = 0;
       this.i = 0;
       this.h = 0;
       this.s = true;
       if (this.t != null) {
          this.b();
          this.t = false;
       }
       return;
    }
    public final Bitmap a(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RoundImageView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof BitmapDrawable) {
          return p0.getBitmap();
       }
       int i = 1;
       if (p0 instanceof h) {
          b uob = p0;
          if (uob.b() == i) {
             Drawable uDrawable = uob.a(0);
             if (uDrawable instanceof BitmapDrawable) {
                return uDrawable.getBitmap();
             }
          }
       }
       Bitmap uBitmap = (p0 instanceof ColorDrawable)? Bitmap.createBitmap(i, i, RoundImageView.w): Bitmap.createBitmap(p0.getIntrinsicWidth(), p0.getIntrinsicHeight(), RoundImageView.w);
       Canvas uCanvas = new Canvas(uBitmap);
       p0.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
       p0.draw(uCanvas);
       return uBitmap;
    }
    public final void b(){
       float f2;
       float f3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RoundImageView.class, "11")) {
          return;
       }
       boolean b = true;
       if (this.s == null) {
          this.t = b;
          return;
       }else if(this.j == null){
          return;
       }else {
          this.k = new BitmapShader(this.j, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
          this.e.setAntiAlias(b);
          this.e.setShader(this.k);
          this.f.setStyle(Paint$Style.STROKE);
          this.f.setAntiAlias(b);
          this.f.setColor(this.h);
          this.f.setStrokeWidth(this.i);
          this.m = this.j.getHeight();
          this.l = this.j.getWidth();
          RoundImageView ti = this.i;
          float f = 2.00f;
          float f1 = ti / f;
          this.c.set(f1, (ti / f), ((float)this.getWidth() - (this.i / f)), ((float)this.getHeight() - (this.i / f)));
          ti = this.i;
          f1 = ti / f;
          this.b.set(f1, (ti / f), ((float)this.getWidth() - (this.i / f)), ((float)this.getHeight() - (this.i / f)));
          this.n = Math.min((this.b.height() / f), (this.b.width() / f));
          if (!PatchProxy.applyVoid(objArray, this, RoundImageView.class, "12")) {
             this.d.set(objArray);
             f = 0;
             if (((float)this.l * this.b.height()) - (this.b.width() * (float)this.m) > 0) {
                f2 = this.b.height() / (float)this.m;
                f = (this.b.width() - ((float)this.l * f2)) * 0x3f000000;
                f3 = 0;
             }else {
                f2 = this.b.width() / (float)this.l;
                f3 = (this.b.height() - ((float)this.m * f2)) * 0x3f000000;
             }
             this.d.setScale(f2, f2);
             RoundImageView ti1 = this.i;
             this.d.postTranslate(((float)(int)(f + 0x3f000000) + ti1), ((float)(int)(f3 + 0x3f000000) + ti1));
             this.k.setLocalMatrix(this.d);
          }
          this.invalidate();
          return;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RoundImageView.class, "7")) {
          return;
       }
       RoundImageView tj = this.j;
       if (tj != null && this.v != null) {
          Bitmap uBitmap = tj.copy(tj.getConfig(), true);
          Canvas uCanvas = new Canvas(uBitmap);
          Paint paint = new Paint();
          uCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
          paint.setColorFilter(new PorterDuffColorFilter(this.v.intValue(), PorterDuff$Mode.SRC_IN));
          uCanvas.drawBitmap(this.j, 0, 0, paint);
          this.j = uBitmap;
       }
    label_0051 :
       return;
    }
    public int getBorderColor(){
       return this.h;
    }
    public float getBorderWidth(){
       return this.i;
    }
    public void onDraw(Canvas p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, RoundImageView.class, "1")) {
          return;
       }
       if (obj.u == null) {
          RoundImageView j = obj.j;
          if (j != null && (!j.isRecycled() && this.getDrawable() != null)) {
             obj.g.reset();
             float f = Math.min((obj.b.height() / 2.00f), (obj.b.width() / 2.00f));
             float f1 = Math.min(obj.o, f);
             float f2 = Math.min(obj.p, f);
             float f3 = Math.min(obj.q, f);
             f = Math.min(obj.r, f);
             int i = 8;
             float[] uofloatArray = new float[i];
             uofloatArray[0] = f1;
             uofloatArray[1] = f1;
             uofloatArray[2] = f2;
             uofloatArray[3] = f2;
             uofloatArray[4] = f3;
             uofloatArray[5] = f3;
             uofloatArray[6] = f;
             uofloatArray[7] = f;
             obj.g.addRoundRect(obj.b, uofloatArray, Path$Direction.CW);
             obj1.drawPath(obj.g, obj.e);
             if (obj.i > 0) {
                if (obj.o <= 0 && (obj.p <= 0 && (obj.q <= 0 && obj.r <= 0))) {
                   obj1.drawRect(obj.c, obj.f);
                }else {
                   Path path = new Path();
                   float[] uofloatArray1 = new float[i];
                   uofloatArray1[0] = f1;
                   uofloatArray1[1] = f1;
                   uofloatArray1[2] = f2;
                   uofloatArray1[3] = f2;
                   uofloatArray1[4] = f3;
                   uofloatArray1[5] = f3;
                   uofloatArray1[6] = f;
                   uofloatArray1[7] = f;
                   path.addRoundRect(obj.c, uofloatArray1, Path$Direction.CW);
                   obj1.drawPath(path, obj.f);
                }
             }
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundImageView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b();
       return;
    }
    public void setBorderColor(int p0){
       if (PatchProxy.isSupport(RoundImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundImageView.class, "3")) {
          return;
       }
       if (p0 == this.h) {
          return;
       }
       this.h = p0;
       this.f.setColor(p0);
       this.invalidate();
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(RoundImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundImageView.class, "13")) {
          return;
       }
       p0 = (float)n.a(p0);
       this.o = p0;
       this.p = p0;
       this.q = p0;
       this.r = p0;
       this.b();
       return;
    }
    public void setBorderWidth(float p0){
       if (PatchProxy.isSupport(RoundImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundImageView.class, "4")) {
          return;
       }
       if (!p0 - this.i) {
          return;
       }
       this.i = p0;
       this.b();
       return;
    }
    public void setBottomLeftRoundRadius(float p0){
       this.r = p0;
    }
    public void setBottomRightRoundRadius(float p0){
       this.q = p0;
    }
    public void setImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundImageView.class, "5")) {
          return;
       }
       super.setImageBitmap(p0);
       this.j = p0;
       this.c();
       this.b();
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundImageView.class, "6")) {
          return;
       }
       super.setImageDrawable(p0);
       this.j = this.a(p0);
       this.c();
       this.b();
       return;
    }
    public void setImageResource(int p0){
       if (PatchProxy.isSupport(RoundImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundImageView.class, "9")) {
          return;
       }
       super.setImageResource(p0);
       this.j = this.a(this.getDrawable());
       this.c();
       this.b();
       return;
    }
    public void setTintColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundImageView.class, "8")) {
          return;
       }
       this.v = Integer.valueOf(p.b(p0));
       this.c();
       return;
    }
    public void setTopLeftRoundRadius(float p0){
       this.o = p0;
    }
    public void setTopRightRoundRadius(float p0){
       this.p = p0;
    }
}
