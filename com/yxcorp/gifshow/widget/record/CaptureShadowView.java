package com.yxcorp.gifshow.widget.record.CaptureShadowView;
import android.view.View;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Matrix;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;

public class CaptureShadowView extends View	// class@0019b3
{
    public Paint b;
    public Path c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public Matrix k;
    public Shader l;

    public void CaptureShadowView(Context p0){
       super(p0);
       this.d = (float)a1.e(39.00f);
       this.e = (float)a1.e(56.00f);
       this.f = (float)a1.e(39.00f);
       this.g = (float)a1.e(56.00f);
       this.h = 0x3f800000;
       this.a();
    }
    public void CaptureShadowView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = (float)a1.e(39.00f);
       this.e = (float)a1.e(56.00f);
       this.f = (float)a1.e(39.00f);
       this.g = (float)a1.e(56.00f);
       this.h = 0x3f800000;
       this.a();
    }
    public void CaptureShadowView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = (float)a1.e(39.00f);
       this.e = (float)a1.e(56.00f);
       this.f = (float)a1.e(39.00f);
       this.g = (float)a1.e(56.00f);
       this.h = 0x3f800000;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, CaptureShadowView.class, "1")) {
          return;
       }
       this.setWillNotDraw(false);
       this.c = new Path();
       Paint paint = new Paint();
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       this.b.setAntiAlias(true);
       Matrix matrix = new Matrix();
       this.k = matrix;
       matrix.reset();
       Bitmap uBitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.arg_RES_7f080453);
       if (uBitmap != null) {
          BitmapShader uBitmapShade = new BitmapShader(uBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
          this.l = uBitmapShade;
          uBitmapShade.setLocalMatrix(this.k);
       }
       this.b.setShader(this.l);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, CaptureShadowView.class, "4")) {
          return;
       }
       float f = (float)this.getWidth() / 2.00f;
       this.i = f;
       this.j = f;
       CaptureShadowView th = this.h;
       this.f = this.d * th;
       this.g = this.e * th;
       this.k.reset();
       this.k.setScale(this.h, this.h, this.i, this.j);
       CaptureShadowView tl = this.l;
       if (tl != null) {
          tl.setLocalMatrix(this.k);
       }else {
          this.b.setColor(0);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptureShadowView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       this.c.reset();
       this.c.addCircle(this.i, this.j, this.f, Path$Direction.CCW);
       p0.save();
       p0.clipPath(this.c, Region$Op.DIFFERENCE);
       p0.drawCircle(this.i, this.j, this.g, this.b);
       p0.restore();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CaptureShadowView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CaptureShadowView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.b();
          this.invalidate();
       }
       return;
    }
    public void setScaleRate(float p0){
       if (PatchProxy.isSupport(CaptureShadowView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CaptureShadowView.class, "3")) {
          return;
       }
       this.h = p0;
       this.b();
       this.invalidate();
       return;
    }
}
