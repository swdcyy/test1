package com.kuaishou.commercial.splash.view.ShineTextView;
import android.widget.TextView;
import android.content.Context;
import mz.g;
import android.util.AttributeSet;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import android.graphics.Paint;
import ky8.a;
import android.animation.TimeInterpolator;
import mz.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.view.ShineTextView$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.Canvas;
import java.lang.Integer;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public class ShineTextView extends TextView	// class@001635
{
    public Matrix b;
    public Paint c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public RectF i;
    public ValueAnimator j;
    public boolean k;
    public BitmapShader l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public final Runnable r;
    public static final int s;

    public void ShineTextView(Context p0){
       super(p0);
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.k = false;
       this.m = 1000;
       this.n = 1000;
       this.o = 0;
       this.p = -1;
       this.q = 0;
       this.r = new g(this);
       this.b();
    }
    public void ShineTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.k = false;
       this.m = 1000;
       this.n = 1000;
       this.o = 0;
       this.p = -1;
       this.q = 0;
       this.r = new g(this);
       this.b();
    }
    public void ShineTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.k = false;
       this.m = 1000;
       this.n = 1000;
       this.o = 0;
       this.p = -1;
       this.q = 0;
       this.r = new g(this);
       this.b();
    }
    public static void a(ShineTextView p0){
       p0 = p0.j;
       if (p0 != null) {
          p0.start();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ShineTextView.class, "1")) {
          return;
       }
       this.i = new RectF();
       this.c = new Paint();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ShineTextView.class, "5")) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.j = valueAnimato;
       valueAnimato.setDuration(this.n);
       this.j.setInterpolator(new a(0.42f, 0, 0x3f800000, 0x3f800000));
       this.j.addUpdateListener(new f(this));
       this.j.setRepeatCount(0);
       this.j.addListener(new ShineTextView$a(this));
       this.k = true;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, ShineTextView.class, "7")) {
          return;
       }
       if (this.h == null) {
          ShineTextView tj = this.j;
          if (tj != null) {
             this.h = true;
             tj.start();
          }
       }
       return;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(ShineTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShineTextView.class, "6")) {
          return;
       }
       if (this.h != null) {
          ShineTextView tj = this.j;
          if (tj != null) {
             this.h = false;
             tj.cancel();
             if (p0) {
                this.invalidate();
             }
          }
       }
       k1.m(this.r);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShineTextView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.h != null && this.b != null) {
          ShineTextView to = this.o;
          float f = (float)to;
          p0.drawRoundRect(this.i, f, (float)to, this.c);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ShineTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShineTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.i.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ShineTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ShineTextView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.k == null) {
          return;
       }
       if (this.d == null) {
          this.d = this.getWidth();
          this.e = this.getHeight();
          if (this.d > null) {
             Bitmap uBitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.arg_RES_7f082376);
             if (uBitmap == null) {
                return;
             }else {
                this.f = uBitmap.getWidth();
                p2 = uBitmap.getHeight();
                float f = 0x3f800000;
                if (p2 > 0) {
                   f = ((float)this.e * f) / (float)p2;
                }
                this.f = (int)((float)this.f * f);
                super();
                this.postScale(f, f);
                BitmapShader uBitmapShade = new BitmapShader(Bitmap.createBitmap(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), this, true), Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
                this.l = uBitmapShade;
                this.c.setShader(uBitmapShade);
                this.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.b = matrix;
                this.l.setLocalMatrix(matrix);
                this.i.set(0, 0, (float)p0, (float)p1);
             }
          }
       }
       return;
    }
    public void setAnimationDuration(long p0){
       this.n = p0;
    }
    public void setAnimationTimes(int p0){
       this.p = p0;
    }
    public void setRadius(int p0){
       this.o = p0;
    }
    public void setSleepTime(long p0){
       this.m = p0;
    }
}
