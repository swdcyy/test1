package m5.c;
import android.view.Choreographer$FrameCallback;
import m5.a;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import a5.e;
import java.lang.System;
import java.lang.Math;
import m5.e;
import android.animation.ValueAnimator;
import java.lang.IllegalStateException;
import java.lang.Float;
import java.lang.String;
import android.view.Choreographer;
import java.lang.IllegalArgumentException;

public class c extends a implements Choreographer$FrameCallback	// class@0025ae
{
    public float d;
    public boolean e;
    public long f;
    public float g;
    public int h;
    public float i;
    public float j;
    public e k;
    public boolean l;

    public void c(){
       super();
       this.d = 0x3f800000;
       this.e = false;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0xcf000000;
       this.j = 0x4f000000;
       this.l = false;
    }
    public void cancel(){
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnimationCancel(this);
       }
       this.k();
       return;
    }
    public float d(){
       c tk = this.k;
       if (tk == null) {
          return 0;
       }
       return ((this.g - tk.l()) / (this.k.f() - this.k.l()));
    }
    public void doFrame(long p0){
       this.j();
       if (this.k == null || !this.isRunning()) {
          return;
       }
       p0 = System.nanoTime();
       long l = p0 - this.f;
       c tk = this.k;
       float f = (tk == null)? Float.MAX_VALUE: (1000000000.00f / tk.m) / Math.abs(this.d);
       float f1 = (float)l / f;
       c tg = this.g;
       if (this.i()) {
          f1 = - f1;
       }
       float f2 = tg + f1;
       this.g = f2;
       f = this.f();
       int i = (f2 - this.g() >= 0 && f2 - f <= 0)? 1: 0;
       this.g = e.b(this.g, this.g(), this.f());
       this.f = p0;
       this.c();
       if (i ^ 1) {
          if (this.getRepeatCount() != -1 && this.h >= this.getRepeatCount()) {
             this.g = this.f();
             this.k();
             this.a(this.i());
          }else {
             Iterator iterator = this.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().onAnimationRepeat(this);
             }
             this.h = this.h + 1;
             if (this.getRepeatMode() == 2) {
                this.e = this.e ^ 1;
                this.m();
             }else if(this.i()){
                f1 = this.f();
             }else {
                f1 = this.g();
             }
             this.g = f1;
             this.f = p0;
          }
       }
       if (this.k != null) {
          c tg1 = this.g;
          if (tg1 - this.i < 0 || tg1 - this.j > 0) {
             Object[] objArray = new Object[]{Float.valueOf(this.i),Float.valueOf(this.j),Float.valueOf(this.g)};
             throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", objArray));
          }
       }
       return;
    }
    public float e(){
       return this.g;
    }
    public float f(){
       c tk = this.k;
       if (tk == null) {
          return 0;
       }
       c tj = this.j;
       if (!tj - 0x4f000000) {
          tj = tk.f();
       }
       return tj;
    }
    public float g(){
       c tk = this.k;
       if (tk == null) {
          return 0;
       }
       c ti = this.i;
       if (!ti - 0xcf000000) {
          ti = tk.l();
       }
       return ti;
    }
    public float getAnimatedFraction(){
       float f;
       float f1;
       float f2;
       if (this.k == null) {
          return 0;
       }
       if (this.i()) {
          f = this.f() - this.g;
          f1 = this.f();
          f2 = this.g();
       }else {
          f = this.g - this.g();
          f1 = this.f();
          f2 = this.g();
       }
       return (f / (f1 - f2));
    }
    public Object getAnimatedValue(){
       return Float.valueOf(this.d());
    }
    public long getDuration(){
       c tk = this.k;
       long l = (tk == null)? 0: (long)tk.d();
       return l;
    }
    public float h(){
       return this.d;
    }
    public final boolean i(){
       boolean b = (this.h() < 0)? true: false;
       return b;
    }
    public boolean isRunning(){
       return this.l;
    }
    public void j(){
       if (this.isRunning()) {
          this.l(false);
          Choreographer.getInstance().postFrameCallback(this);
       }
       return;
    }
    public void k(){
       this.l(true);
    }
    public void l(boolean p0){
       Choreographer.getInstance().removeFrameCallback(this);
       if (p0) {
          this.l = false;
       }
       return;
    }
    public void m(){
       this.p((- this.h()));
    }
    public void n(int p0){
       float f = (float)p0;
       if (!this.g - f) {
          return;
       }
       this.g = e.b(f, this.g(), this.f());
       this.f = System.nanoTime();
       this.c();
       return;
    }
    public void o(float p0,float p1){
       if (p0 - p1 <= 0) {
          c tk = this.k;
          float f = (tk == null)? -340282346638528860000000000000000000000.00f: tk.l();
          c tk1 = this.k;
          float f1 = (tk1 == null)? Float.MAX_VALUE: tk1.f();
          this.i = e.b(p0, f, f1);
          this.j = e.b(p1, f, f1);
          this.n((int)e.b(this.g, p0, p1));
          return;
       }else {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1)};
          throw new IllegalArgumentException(String.format("minFrame \(%s\) must be <= maxFrame \(%s\)", objArray));
       }
    }
    public void p(float p0){
       this.d = p0;
    }
    public void setRepeatMode(int p0){
       super.setRepeatMode(p0);
       if (p0 != 2 && this.e != null) {
          this.e = false;
          this.m();
       }
       return;
    }
}
