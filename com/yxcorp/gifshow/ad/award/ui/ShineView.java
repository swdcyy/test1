package com.yxcorp.gifshow.ad.award.ui.ShineView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import ky8.c;
import android.util.AttributeSet;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.TimeInterpolator;
import ky8.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.award.ui.ShineView$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import java.lang.Runnable;
import ekd.k1;
import g59.i0;
import android.graphics.Canvas;
import java.lang.Integer;
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

public class ShineView extends View	// class@00152d
{
    public Matrix b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public final RectF i;
    public ValueAnimator j;
    public TimeInterpolator k;
    public boolean l;
    public BitmapShader m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public final Runnable s;
    public static final int t;

    public void ShineView(Context p0){
       super(p0);
       this.c = new Paint();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.i = new RectF();
       this.l = false;
       this.n = 1000;
       this.o = 1000;
       this.p = 0;
       this.q = -1;
       this.r = 0;
       this.s = new c(this);
    }
    public void ShineView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new Paint();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.i = new RectF();
       this.l = false;
       this.n = 1000;
       this.o = 1000;
       this.p = 0;
       this.q = -1;
       this.r = 0;
       this.s = new c(this);
    }
    public void ShineView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Paint();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.i = new RectF();
       this.l = false;
       this.n = 1000;
       this.o = 1000;
       this.p = 0;
       this.q = -1;
       this.r = 0;
       this.s = new c(this);
    }
    public static void a(ShineView p0){
       p0 = p0.j;
       if (p0 == null) {
       }else {
          p0.start();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ShineView.class, "5")) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.j = valueAnimato;
       ShineView tk = this.k;
       if (tk != null) {
          valueAnimato.setInterpolator(tk);
       }
       this.j.setDuration(this.o);
       this.j.addUpdateListener(new b(this));
       this.j.setRepeatCount(0);
       this.j.addListener(new ShineView$a(this));
       this.l = true;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ShineView.class, "7")) {
          return;
       }
       if (this.h == null) {
          ShineView tj = this.j;
          if (tj != null) {
             this.h = true;
             tj.start();
          }
       }
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(ShineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShineView.class, "6")) {
          return;
       }
       if (this.h != null) {
          ShineView tj = this.j;
          if (tj != null) {
             this.h = false;
             tj.cancel();
             if (p0) {
                this.invalidate();
             }
          }
       }
       k1.m(this.s);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ShineView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       i0.a(this.j);
       k1.m(this.s);
       this.j = null;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShineView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.h != null && this.b != null) {
          ShineView tp = this.p;
          float f = (float)tp;
          p0.drawRoundRect(this.i, f, (float)tp, this.c);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ShineView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShineView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.i.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ShineView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ShineView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.l == null) {
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
                this.m = uBitmapShade;
                this.c.setShader(uBitmapShade);
                this.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.b = matrix;
                matrix.setTranslate((float)(- this.f), 0);
                this.m.setLocalMatrix(this.b);
                this.i.set(0, 0, (float)p0, (float)p1);
             }
          }
       }
       return;
    }
    public void setAnimationDuration(long p0){
       this.o = p0;
    }
    public void setAnimationTimes(int p0){
       this.q = p0;
    }
    public void setRadius(int p0){
       this.p = p0;
    }
    public void setSleepTime(long p0){
       this.n = p0;
    }
    public void setTimeInterpolator(TimeInterpolator p0){
       this.k = p0;
    }
}
