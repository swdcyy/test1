package aqd.a;
import aqd.d;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import aqd.a$a;
import android.graphics.Paint;
import aqd.f;
import android.view.ViewTreeObserver;
import aqd.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import aqd.e;
import aqd.c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.graphics.Bitmap$Config;

public final class a implements d	// class@00021b
{
    public final float a;
    public float b;
    public float c;
    public float d;
    public c e;
    public Canvas f;
    public Bitmap g;
    public final View h;
    public int i;
    public final ViewGroup j;
    public final int[] k;
    public final int[] l;
    public final ViewTreeObserver$OnPreDrawListener m;
    public boolean n;
    public boolean o;
    public Drawable p;
    public boolean q;
    public final Paint r;

    public void a(View p0,ViewGroup p1,int p2){
       super();
       this.a = 8.00f;
       this.b = 16.00f;
       this.c = 0x3f800000;
       this.d = 0x3f800000;
       int[] ointArray = new int[2];
       this.k = ointArray;
       ointArray = new int[2];
       this.l = ointArray;
       this.m = new a$a(this);
       this.n = true;
       this.r = new Paint(2);
       this.j = p1;
       this.h = p0;
       this.i = p2;
       this.e = new f();
       int measuredWidt = p0.getMeasuredWidth();
       p2 = p0.getMeasuredHeight();
       if (this.k(measuredWidt, p2)) {
          p0.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
          return;
       }else {
          this.j(measuredWidt, p2);
          return;
       }
    }
    public e a(boolean p0){
       this.n = p0;
       this.d(p0);
       this.h.invalidate();
       return this;
    }
    public e b(c p0){
       this.e = p0;
       return this;
    }
    public e c(int p0){
       if (this.i != p0) {
          this.i = p0;
          this.h.invalidate();
       }
       return this;
    }
    public e d(boolean p0){
       this.h.getViewTreeObserver().removeOnPreDrawListener(this.m);
       if (p0) {
          this.h.getViewTreeObserver().addOnPreDrawListener(this.m);
       }
       return this;
    }
    public void destroy(){
       this.d(false);
       this.e.destroy();
       this.o = false;
    }
    public boolean draw(Canvas p0){
       if (this.n != null && this.o != null) {
          if (p0 == this.f) {
             return false;
          }else {
             this.n();
             p0.save();
             p0.scale((this.c * 8.00f), (this.d * 8.00f));
             p0.drawBitmap(this.g, 0, 0, this.r);
             p0.restore();
             a ti = this.i;
             if (ti != null) {
                p0.drawColor(ti);
             }
          }
       }
       return true;
    }
    public void e(){
       this.j(this.h.getMeasuredWidth(), this.h.getMeasuredHeight());
    }
    public e f(float p0){
       this.b = p0;
       return this;
    }
    public e g(Drawable p0){
       this.p = p0;
       return this;
    }
    public e h(boolean p0){
       this.q = p0;
       return this;
    }
    public final int i(float p0){
       return (int)Math.ceil((double)(p0 / 8.00f));
    }
    public void j(int p0,int p1){
       if (this.k(p0, p1)) {
          this.h.setWillNotDraw(true);
          return;
       }else {
          this.h.setWillNotDraw(false);
          p0 = this.i((float)p0);
          p1 = this.i((float)p1);
          int i = this.l(p0);
          int i1 = this.l(p1);
          this.d = (float)p1 / (float)i1;
          this.c = (float)p0 / (float)i;
          this.g = Bitmap.createBitmap(i, i1, this.e.b());
          this.f = new Canvas(this.g);
          this.o = true;
          if (this.q != null) {
             this.m();
          }
          return;
       }
    }
    public final boolean k(int p0,int p1){
       boolean b = (!this.i((float)p1) || !this.i((float)p0))? true: false;
       return b;
    }
    public final int l(int p0){
       int i = p0 % 64;
       if (!i) {
          return p0;
       }
       return ((p0 - i) + 64);
    }
    public final void m(){
       this.j.getLocationOnScreen(this.k);
       this.h.getLocationOnScreen(this.l);
       a tl = this.l;
       a tk = this.k;
       float f = this.c * 8.00f;
       float f1 = this.d * 8.00f;
       this.f.translate(((float)(- (tl[0] - tk[0])) / f), ((float)(- (tl[1] - tk[1])) / f1));
       this.f.scale((0x3f800000 / f), (0x3f800000 / f1));
    }
    public void n(){
       if (this.n != null && this.o != null) {
          a tp = this.p;
          if (tp == null) {
             this.g.eraseColor(0);
          }else {
             tp.draw(this.f);
          }
          if (this.q != null) {
             this.j.draw(this.f);
          }else {
             this.f.save();
             this.m();
             this.j.draw(this.f);
             this.f.restore();
          }
          this.g = this.e.c(this.g, this.b);
          if (!this.e.a()) {
             this.f.setBitmap(this.g);
          }
       }
    label_0054 :
       return;
    }
}
