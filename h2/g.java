package h2.g;
import h2.e;
import java.lang.Object;
import java.lang.Math;
import h2.b$p;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;

public final class g implements e	// class@0020e8
{
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final b$p j;

    public void g(){
       super();
       this.a = Math.sqrt(1500.00f);
       this.b = 0x3fe0000000000000;
       this.c = false;
       this.i = Double.MAX_VALUE;
       this.j = new b$p();
    }
    public void g(float p0){
       super();
       this.a = Math.sqrt(1500.00f);
       this.b = 0x3fe0000000000000;
       this.c = false;
       this.i = Double.MAX_VALUE;
       this.j = new b$p();
       this.i = (double)p0;
    }
    public boolean a(float p0,float p1){
       if ((double)Math.abs(p1) - this.e < 0 && (double)Math.abs((p0 - this.c())) - this.d < 0) {
          return true;
       }
       return false;
    }
    public float b(float p0,float p1){
       g ta = this.a;
       double d = ta * ta;
       return (float)(((- d) * (double)(p0 - this.c())) - (((ta * 2.00f) * this.b) * (double)p1));
    }
    public float c(){
       return (float)this.i;
    }
    public final void d(){
       if (this.c != null) {
          return;
       }
       if (!this.i - Double.MAX_VALUE) {
          throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
       }
       g tb = this.b;
       double d = 0x3ff0000000000000;
       if (tb - d > 0) {
          g ta = this.a;
          double d1 = (- tb) * ta;
          this.f = d1 + (ta * Math.sqrt(((tb * tb) - d)));
          tb = this.b;
          ta = this.a;
          d1 = (- tb) * ta;
          this.g = d1 - (ta * Math.sqrt(((tb * tb) - d)));
       }else if(tb >= 0 && tb - d < 0){
          this.h = this.a * Math.sqrt((d - (tb * tb)));
       }
       this.c = true;
       return;
    }
    public g e(float p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Damping ratio must be non-negative");
       }
       this.b = (double)p0;
       this.c = false;
       return this;
    }
    public g f(float p0){
       this.i = (double)p0;
       return this;
    }
    public g g(float p0){
       if (p0 <= 0) {
          throw new IllegalArgumentException("Spring stiffness constant must be positive.");
       }
       this.a = Math.sqrt((double)p0);
       this.c = false;
       return this;
    }
    public void h(double p0){
       p0 = Math.abs(p0);
       this.d = p0;
       this.e = p0 * 0x404f400000000000;
    }
    public b$p i(double p0,double p1,long p2){
       g f;
       double d4;
       g og = this;
       this.d();
       double d = (double)p2 / 0x408f400000000000;
       double d1 = p0 - og.i;
       g b = og.b;
       double d2 = 0x3ff0000000000000;
       double d3 = 0x4005bf0a8b145769;
       if (b - d2 > 0) {
          b = og.g;
          f = og.f;
          d2 = d1 - (((b * d1) - p1) / (b - f));
          d1 = ((d1 * b) - p1) / (b - f);
          d4 = (Math.pow(d3, (b * d)) * d2) + (Math.pow(d3, (og.f * d)) * d1);
          f = og.g;
          d2 = d2 * f;
          f = og.f;
          d1 = d1 * f;
          d2 = (d2 * Math.pow(d3, (f * d))) + (d1 * Math.pow(d3, (f * d)));
       }else if(!b - d2){
          b = og.a;
          d2 = p1 + (b * d1);
          d1 = d1 + (d2 * d);
          d4 = Math.pow(d3, ((- b) * d)) * d1;
          f = og.a;
          d2 = (d2 * Math.pow(d3, ((- f) * d))) + ((d1 * Math.pow(d3, ((- og.a) * d))) * (- f));
       }else {
          f = og.a;
          d2 = (d2 / og.h) * (((b * f) * d1) + p1);
          d4 = Math.pow(d3, (((- b) * f) * d)) * ((Math.cos((og.h * d)) * d1) + (Math.sin((og.h * d)) * d2));
          f = og.a;
          g b1 = og.b;
          double d5 = ((- f) * d4) * b1;
          f = og.h;
          p0 = d4;
          g h = og.h;
          d2 = d2 * h;
          d2 = d5 + (Math.pow(0x4005bf0a8b145769, (((- b1) * f) * d)) * ((((- f) * d1) * Math.sin((f * d))) + (d2 * Math.cos((h * d)))));
          d4 = p0;
       }
       g j = og.j;
       j.a = (float)(d4 + og.i);
       j.b = (float)d2;
       return j;
    }
}
