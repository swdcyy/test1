package e2.a$a;
import java.lang.Object;
import android.view.animation.AnimationUtils;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Math;
import e2.a;

public class a$a	// class@001ece
{
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public int g;
    public int h;
    public long i;
    public float j;
    public int k;

    public void a$a(){
       super();
       this.e = Long.MIN_VALUE;
       this.i = -1;
       this.f = 0;
       this.g = 0;
       this.h = 0;
    }
    public void a(){
       if (!this.f) {
          throw new RuntimeException("Cannot compute scroll delta before calling start\(\)");
       }
       long l = AnimationUtils.currentAnimationTimeMillis();
       this.f = l;
       float f = (float)(l - this.f) * this.g(this.e(l));
       this.g = (int)(this.c * f);
       this.h = (int)(f * this.d);
       return;
    }
    public int b(){
       return this.g;
    }
    public int c(){
       return this.h;
    }
    public int d(){
       a$a tc = this.c;
       return (int)(tc / Math.abs(tc));
    }
    public final float e(long p0){
       a$a te = this.e;
       if (p0 - te < 0) {
          return 0;
       }
       a$a ti = this.i;
       if (ti < 0 || p0 - ti < 0) {
          return (a.e(((float)(p0 - te) / (float)this.a), 0, 0x3f800000) * 0x3f000000);
       }
       te = this.j;
       float f = 0x3f800000 - te;
       return (f + (te * a.e(((float)(p0 - ti) / (float)this.k), 0, 0x3f800000)));
    }
    public int f(){
       a$a td = this.d;
       return (int)(td / Math.abs(td));
    }
    public final float g(float p0){
       return (((-4.00f * p0) * p0) + (p0 * 4.00f));
    }
    public boolean h(){
       boolean b = (this.i - null > 0 && AnimationUtils.currentAnimationTimeMillis() - (this.i + (long)this.k) > 0)? true: false;
       return b;
    }
    public void i(){
       long l = AnimationUtils.currentAnimationTimeMillis();
       this.k = a.f((int)(l - this.e), 0, this.b);
       this.j = this.e(l);
       this.i = l;
    }
    public void j(int p0){
       this.b = p0;
    }
    public void k(int p0){
       this.a = p0;
    }
    public void l(float p0,float p1){
       this.c = p0;
       this.d = p1;
    }
    public void m(){
       long l = AnimationUtils.currentAnimationTimeMillis();
       this.e = l;
       this.i = -1;
       this.f = l;
       this.j = 0x3f000000;
       this.g = 0;
       this.h = 0;
    }
}
