package h2.b;
import h2.a$b;
import h2.b$g;
import java.lang.String;
import h2.b$h;
import h2.b$i;
import h2.b$j;
import h2.b$k;
import h2.b$l;
import h2.b$m;
import h2.b$n;
import h2.b$o;
import h2.b$a;
import h2.b$b;
import h2.b$c;
import h2.b$d;
import h2.b$e;
import h2.d;
import java.lang.Object;
import java.util.ArrayList;
import h2.b$f;
import h2.c;
import java.lang.Math;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import h2.a;
import h2.b$q;
import h2.b$r;
import java.lang.IllegalArgumentException;

public abstract class b implements a$b	// class@0020e3
{
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final c e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public static final b$s m;
    public static final b$s n;
    public static final b$s o;
    public static final b$s p;
    public static final b$s q;
    public static final b$s r;
    public static final b$s s;
    public static final b$s t;
    public static final b$s u;
    public static final b$s v;
    public static final b$s w;
    public static final b$s x;
    public static final b$s y;
    public static final b$s z;

    static {
       b.m = new b$g("translationX");
       b.n = new b$h("translationY");
       b.o = new b$i("translationZ");
       b.p = new b$j("scaleX");
       b.q = new b$k("scaleY");
       b.r = new b$l("rotation");
       b.s = new b$m("rotationX");
       b.t = new b$n("rotationY");
       b.u = new b$o("x");
       b.v = new b$a("y");
       b.w = new b$b("z");
       b.x = new b$c("alpha");
       b.y = new b$d("scrollX");
       b.z = new b$e("scrollY");
    }
    public void b(d p0){
       super();
       this.a = 0;
       this.b = Float.MAX_VALUE;
       this.c = false;
       this.f = false;
       this.g = Float.MAX_VALUE;
       this.h = - Float.MAX_VALUE;
       this.i = 0;
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.d = null;
       this.e = new b$f(this, "FloatValueHolder", p0);
       this.j = 0x3f800000;
    }
    public void b(Object p0,c p1){
       super();
       this.a = 0;
       this.b = Float.MAX_VALUE;
       this.c = false;
       this.f = false;
       this.g = Float.MAX_VALUE;
       this.h = -340282346638528860000000000000000000000.00f;
       this.i = 0;
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.d = p0;
       this.e = p1;
       if (p1 != b.r && (p1 == b.s || p1 == b.t)) {
          this.j = 0.10f;
       }else if(p1 == b.x){
          this.j = 0.00f;
       }else if(p1 == b.p || p1 == b.q){
          this.j = 0.00f;
       }else {
          this.j = 0x3f800000;
       }
       return;
    }
    public static void i(ArrayList p0){
       int i = p0.size() - 1;
       while (i >= 0) {
          if (p0.get(i) == null) {
             p0.remove(i);
          }
          i = i - 1;
       }
       return;
    }
    public boolean a(long p0){
       b ti = this.i;
       if (!ti) {
          this.i = p0;
          this.j(this.b);
          return false;
       }else {
          this.i = p0;
          boolean b = this.p((p0 - ti));
          float f = Math.min(this.b, this.g);
          this.b = f;
          f = Math.max(f, this.h);
          this.b = f;
          this.j(f);
          if (b) {
             this.c(false);
          }
          return b;
       }
    }
    public void b(){
       if (Looper.myLooper() != Looper.getMainLooper()) {
          throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
       }
       if (this.f != null) {
          this.c(true);
       }
       return;
    }
    public final void c(boolean p0){
       boolean b = false;
       this.f = b;
       a.d().g(this);
       this.i = 0;
       this.c = b;
       while (b < this.k.size()) {
          if (this.k.get(b) != null) {
             this.k.get(b).a(this, p0, this.b, this.a);
          }
          b = b + 1;
       }
       b.i(this.k);
       return;
    }
    public abstract float d(float p0,float p1);
    public final float e(){
       return this.e.a(this.d);
    }
    public float f(){
       return (this.j * 0x3f400000);
    }
    public abstract boolean g(float p0,float p1);
    public boolean h(){
       return this.f;
    }
    public void j(float p0){
       this.e.b(this.d, p0);
       int i = 0;
       while (i < this.l.size()) {
          if (this.l.get(i) != null) {
             this.l.get(i).a(this, this.b, this.a);
          }
          i++;
       }
       b.i(this.l);
       return;
    }
    public b k(float p0){
       this.b = p0;
       this.c = true;
       return this;
    }
    public b l(float p0){
       this.a = p0;
       return this;
    }
    public abstract void m(float p0);
    public void n(){
       if (Looper.myLooper() != Looper.getMainLooper()) {
          throw new AndroidRuntimeException("Animations may only be started on the main thread");
       }
       if (this.f == null) {
          this.o();
       }
       return;
    }
    public final void o(){
       if (this.f == null) {
          this.f = true;
          if (this.c == null) {
             this.b = this.e();
          }
          b tb = this.b;
          if (tb - this.g <= 0 && tb - this.h >= 0) {
             a.d().a(this, 0);
          }else {
             throw new IllegalArgumentException("Starting value need to be in between min value and max value");
          }
       }
       return;
    }
    public abstract boolean p(long p0);
}
