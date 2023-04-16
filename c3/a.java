package c3.a;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import l2.b;
import android.content.Context;
import java.lang.Object;
import z1.h;
import android.content.res.Resources;
import c3.a$c;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import android.animation.Animator;
import android.util.DisplayMetrics;
import cw9.c;
import android.animation.ValueAnimator;
import c3.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import c3.a$b;
import android.animation.Animator$AnimatorListener;
import android.graphics.ColorFilter;

public class a extends Drawable implements Animatable	// class@000cc8
{
    public final a$c b;
    public float c;
    public Resources d;
    public Animator e;
    public float f;
    public boolean g;
    public static final Interpolator h;
    public static final Interpolator i;
    public static final int[] j;

    static {
       a.h = new LinearInterpolator();
       a.i = new b();
       int[] ointArray = new int[]{0xff000000};
       a.j = ointArray;
    }
    public void a(Context p0){
       super();
       h.g(p0);
       this.d = p0.getResources();
       a$c uoc = new a$c();
       this.b = uoc;
       uoc.u(a.j);
       this.n(2.50f);
       this.p();
    }
    public final void a(float p0,a$c p1){
       this.q(p0, p1);
       p1.y((p1.k() + (((p1.i() - 0.01f) - p1.k()) * p0)));
       p1.v(p1.i());
       p1.w((p1.j() + (((float)(Math.floor((double)(p1.j() / 0x3f4ccccd)) + 0x3ff0000000000000) - p1.j()) * p0)));
    }
    public void draw(Canvas p0){
       Rect bounds = this.getBounds();
       p0.save();
       p0.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
       this.b.a(p0, bounds);
       p0.restore();
    }
    public void e(float p0,a$c p1,boolean p2){
       if (this.g != null) {
          this.a(p0, p1);
       }else {
          float f = 0x3f800000;
          if (p0 - f || p2) {
             float f1 = p1.j();
             float f2 = 0.01f;
             float f3 = 0x3f4a3d71;
             float f4 = 0x3f000000;
             if (p0 - f4 < 0) {
                f4 = p1.k();
                f = ((a.i.getInterpolation((p0 / f4)) * f3) + f2) + f4;
             }else {
                f4 = p1.k() + f3;
                float f5 = f4;
                f4 = f4 - (((f - a.i.getInterpolation(((p0 - f4) / f4))) * f3) + f2);
                f = f5;
             }
             p1.y(f4);
             p1.v(f);
             p1.w((f1 + (0.21f * p0)));
             this.k(((p0 + this.f) * 216.00f));
          }
       }
       return;
    }
    public final int f(float p0,int p1,int p2){
       int i = (p1 >> 24) & 0x00ff;
       int i1 = (p1 >> 16) & 0x00ff;
       int i2 = (p1 >> 8) & 0x00ff;
       p1 = p1 & 0x00ff;
       return (((((i + (int)((float)(((p2 >> 24) & 0x00ff) - i) * p0)) << 24) | ((i1 + (int)((float)(((p2 >> 16) & 0x00ff) - i1) * p0)) << 16)) | ((i2 + (int)((float)(((p2 >> 8) & 0x00ff) - i2) * p0)) << 8)) | (p1 + (int)(p0 * (float)((p2 & 0x00ff) - p1))));
    }
    public void g(boolean p0){
       this.b.x(p0);
       this.invalidateSelf();
    }
    public int getAlpha(){
       return this.b.c();
    }
    public int getOpacity(){
       return -3;
    }
    public void h(float p0){
       this.b.p(p0);
       this.invalidateSelf();
    }
    public void i(int[] p0){
       this.b.u(p0);
       this.b.t(0);
       this.invalidateSelf();
    }
    public boolean isRunning(){
       return this.e.isRunning();
    }
    public void j(float p0){
       this.b.w(p0);
       this.invalidateSelf();
    }
    public final void k(float p0){
       this.c = p0;
    }
    public final void l(float p0,float p1,float p2,float p3){
       a tb = this.b;
       DisplayMetrics density = c.c(this.d).density;
       tb.z((p1 * density));
       tb.q((p0 * density));
       tb.t(0);
       tb.o((p2 * density), (p3 * density));
    }
    public void m(float p0,float p1){
       this.b.y(p0);
       this.b.v(p1);
       this.invalidateSelf();
    }
    public void n(float p0){
       this.b.z(p0);
       this.invalidateSelf();
    }
    public void o(int p0){
       if (!p0) {
          this.l(11.00f, 3.00f, 12.00f, 6.00f);
       }else {
          this.l(0x40f00000, 2.50f, 10.00f, 5.00f);
       }
       this.invalidateSelf();
       return;
    }
    public final void p(){
       a tb = this.b;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.addUpdateListener(new a$a(this, tb));
       valueAnimato.setRepeatCount(-1);
       valueAnimato.setRepeatMode(1);
       valueAnimato.setInterpolator(a.h);
       valueAnimato.addListener(new a$b(this, tb));
       this.e = valueAnimato;
    }
    public void q(float p0,a$c p1){
       float f = 0x3f400000;
       if (p0 - f > 0) {
          p1.r(this.f(((p0 - f) / 0.25f), p1.h(), p1.e()));
       }else {
          p1.r(p1.h());
       }
       return;
    }
    public void setAlpha(int p0){
       this.b.n(p0);
       this.invalidateSelf();
    }
    public void setColorFilter(ColorFilter p0){
       this.b.s(p0);
       this.invalidateSelf();
    }
    public void start(){
       this.e.cancel();
       this.b.A();
       if (this.b.d() - this.b.g()) {
          this.g = true;
          this.e.setDuration(666);
          this.e.start();
       }else {
          this.b.t(0);
          this.b.m();
          this.e.setDuration(1332);
          this.e.start();
       }
       return;
    }
    public void stop(){
       this.e.cancel();
       this.k(0);
       this.b.x(false);
       this.b.t(false);
       this.b.m();
       this.invalidateSelf();
    }
}
