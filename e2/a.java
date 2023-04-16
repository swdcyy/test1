package e2.a;
import android.view.View$OnTouchListener;
import android.view.ViewConfiguration;
import android.view.View;
import java.lang.Object;
import e2.a$a;
import android.view.animation.AccelerateInterpolator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import e2.a$b;
import java.lang.Runnable;
import a2.i0;

public abstract class a implements View$OnTouchListener	// class@001ed0
{
    public final a$a b;
    public final Interpolator c;
    public final View d;
    public Runnable e;
    public float[] f;
    public float[] g;
    public int h;
    public int i;
    public float[] j;
    public float[] k;
    public float[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public static final int s;

    static {
       a.s = ViewConfiguration.getTapTimeout();
    }
    public void a(View p0){
       super();
       this.b = new a$a();
       this.c = new AccelerateInterpolator();
       this.f = new float[2]{0,0};
       this.g = new float[2]{0x7f7fffff,0x7f7fffff};
       this.j = new float[2]{0,0};
       this.k = new float[2]{0,0};
       this.l = new float[2]{0x7f7fffff,0x7f7fffff};
       this.d = p0;
       DisplayMetrics density = c.c(Resources.getSystem()).density;
       this.o((float)(int)((1575.00f * density) + 0x3f000000), (float)(int)((1575.00f * density) + 0x3f000000));
       this.p((float)(int)((density * 315.00f) + 0x3f000000), (float)(int)((density * 315.00f) + 0x3f000000));
       this.l(1);
       this.n(Float.MAX_VALUE, Float.MAX_VALUE);
       this.s(0.20f, 0.20f);
       this.t(0x3f800000, 0x3f800000);
       this.k(a.s);
       this.r(500);
       this.q(500);
    }
    public static float e(float p0,float p1,float p2){
       if (p0 - p2 > 0) {
          return p2;
       }
       if (p0 - p1 < 0) {
          return p1;
       }
       return p0;
    }
    public static int f(int p0,int p1,int p2){
       if (p0 > p2) {
          return p2;
       }
       if (p0 < p1) {
          return p1;
       }
       return p0;
    }
    public abstract boolean a(int p0);
    public abstract boolean b(int p0);
    public void c(){
       long l = SystemClock.uptimeMillis();
       MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
       this.d.onTouchEvent(motionEvent);
       motionEvent.recycle();
    }
    public final float d(int p0,float p1,float p2,float p3){
       p1 = this.h(this.f[p0], p2, this.g[p0], p1);
       p2 = 0;
       if (!(v0 = p1 - p2)) {
          return p2;
       }
       int i = this.k[p0];
       p0 = this.l[p0];
       p2 = this.j[p0] * p3;
       if (v0 > 0) {
          return a.e((p1 * p2), i, p0);
       }
       return (- a.e(((- p1) * p2), i, p0));
    }
    public final float g(float p0,float p1){
       if (!p1) {
          return 0;
       }
       a th = this.h;
       int i = 1;
       if (th != null && th != i) {
          if (th == 2 && p0 < 0) {
             return (p0 / (- p1));
          }
       }else if(p0 - p1 < 0){
          float f = 0x3f800000;
          if (p0 >= 0) {
             return (f - (p0 / p1));
          }else if(this.p != null && th == i){
             return f;
          }
       }
       return 0;
    }
    public final float h(float p0,float p1,float p2,float p3){
       p0 = a.e((p0 * p1), 0, p2);
       p2 = this.g(p3, p0);
       p0 = this.g((p1 - p3), p0) - p2;
       if (p0 < 0) {
          p0 = - this.c.getInterpolation((- p0));
       }else if(p0 > 0){
          p0 = this.c.getInterpolation(p0);
       }else {
          return 0;
       }
       return a.e(p0, 0xbf800000, 0x3f800000);
    }
    public final void i(){
       if (this.n != null) {
          this.p = false;
       }else {
          this.b.i();
       }
       return;
    }
    public abstract void j(int p0,int p1);
    public a k(int p0){
       this.i = p0;
       return this;
    }
    public a l(int p0){
       this.h = p0;
       return this;
    }
    public a m(boolean p0){
       if (this.q != null && !p0) {
          this.i();
       }
       this.q = p0;
       return this;
    }
    public a n(float p0,float p1){
       a tg = this.g;
       tg[0] = p0;
       tg[1] = p1;
       return this;
    }
    public a o(float p0,float p1){
       a tl = this.l;
       tl[0] = p0 / 1000.00f;
       tl[1] = p1 / 1000.00f;
       return this;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       boolean b = false;
       if (this.q == null) {
          return b;
       }
       int actionMasked = p1.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
             }else {
             label_001e :
                this.b.l(this.d(b, p1.getX(), (float)p0.getWidth(), (float)this.d.getWidth()), this.d(1, p1.getY(), (float)p0.getHeight(), (float)this.d.getHeight()));
                if (this.p == null && this.u()) {
                   this.v();
                }
             }
          }else {
          }
       }else {
          this.o = true;
          this.m = b;
          goto label_001e ;
       }
    label_0058 :
       if (this.r != null && this.p != null) {
          b = true;
       }
       return b;
    }
    public a p(float p0,float p1){
       a tk = this.k;
       tk[0] = p0 / 1000.00f;
       tk[1] = p1 / 1000.00f;
       return this;
    }
    public a q(int p0){
       this.b.j(p0);
       return this;
    }
    public a r(int p0){
       this.b.k(p0);
       return this;
    }
    public a s(float p0,float p1){
       a tf = this.f;
       tf[0] = p0;
       tf[1] = p1;
       return this;
    }
    public a t(float p0,float p1){
       a tj = this.j;
       tj[0] = p0 / 1000.00f;
       tj[1] = p1 / 1000.00f;
       return this;
    }
    public boolean u(){
       a tb = this.b;
       int i = tb.f();
       boolean i1 = tb.d();
       i1 = (!i || (this.b(i) || (i1 && this.a(i1))))? true: false;
       return i1;
    }
    public final void v(){
       if (this.e == null) {
          this.e = new a$b(this);
       }
       this.p = true;
       this.n = true;
       if (this.m == null) {
          a ti = this.i;
          if (ti > null) {
             i0.l0(this.d, this.e, (long)ti);
          label_0026 :
             this.m = true;
             return;
          }
       }
       this.e.run();
       goto label_0026 ;
    }
}
