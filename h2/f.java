package h2.f;
import h2.b;
import h2.d;
import java.lang.Object;
import h2.c;
import h2.g;
import h2.b$p;
import java.lang.Math;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class f extends b	// class@0020e7
{
    public g A;
    public float B;
    public boolean C;

    public void f(d p0){
       super(p0);
       this.A = null;
       this.B = Float.MAX_VALUE;
       this.C = false;
    }
    public void f(Object p0,c p1){
       super(p0, p1);
       this.A = null;
       this.B = Float.MAX_VALUE;
       this.C = false;
    }
    public void f(Object p0,c p1,float p2){
       super(p0, p1);
       this.A = null;
       this.B = Float.MAX_VALUE;
       this.C = false;
       this.A = new g(p2);
    }
    public float d(float p0,float p1){
       return this.A.b(p0, p1);
    }
    public boolean g(float p0,float p1){
       return this.A.a(p0, p1);
    }
    public void m(float p0){
    }
    public void n(){
       this.s();
       this.A.h((double)this.f());
       super.n();
    }
    public boolean p(long p0){
       b$p op;
       f uof = this;
       float f = Float.MAX_VALUE;
       if (uof.C != null) {
          f b = uof.B;
          if (b - f) {
             uof.A.f(b);
             uof.B = f;
          }
          uof.b = uof.A.c();
          uof.a = 0;
          uof.C = false;
          return true;
       }else if(uof.B - f){
          uof.A.c();
          long l = p0 / 2;
          op = uof.A.i((double)uof.b, (double)uof.a, l);
          uof.A.f(uof.B);
          uof.B = f;
          op = uof.A.i((double)op.a, (double)op.b, l);
          uof.b = op.a;
          uof.a = op.b;
       }else {
          op = uof.A.i((double)uof.b, (double)uof.a, p0);
          uof.b = op.a;
          uof.a = op.b;
       }
       float f1 = Math.max(uof.b, uof.h);
       uof.b = f1;
       f1 = Math.min(f1, uof.g);
       uof.b = f1;
       if (uof.g(f1, uof.a)) {
          uof.b = uof.A.c();
          uof.a = 0;
          return true;
       }else {
          return false;
       }
    }
    public void q(float p0){
       if (this.h()) {
          this.B = p0;
       }else if(this.A == null){
          this.A = new g(p0);
       }
       this.A.f(p0);
       this.n();
       return;
    }
    public g r(){
       return this.A;
    }
    public final void s(){
       f tA = this.A;
       if (tA == null) {
          throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
       }
       double d = (double)tA.c();
       if (d - (double)this.g > 0) {
          throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
       }
       if (d - (double)this.h >= 0) {
          return;
       }
       throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
    public f t(g p0){
       this.A = p0;
       return this;
    }
}
