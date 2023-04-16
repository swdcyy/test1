package d1.g;
import e1.q;
import java.lang.Math;

public class g extends q	// class@001df2
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public String k;
    public boolean l;
    public float m;
    public float n;

    public void g(){
       super();
       this.l = false;
    }
    public float a(){
       float f = (this.l != null)? - this.d(this.n): this.d(this.n);
       return f;
    }
    public final float b(float p0){
       g ta;
       g tb;
       g td = this.d;
       if (p0 - td <= 0) {
          ta = this.a;
          return ((ta * p0) + ((((this.b - ta) * p0) * p0) / (td * 2.00f)));
       }else {
          ta = this.j;
          if (ta == 1) {
             return this.g;
          }
          p0 = p0 - td;
          td = this.e;
          if (p0 - td < 0) {
             tb = this.b;
             return ((this.g + (tb * p0)) + ((((this.c - tb) * p0) * p0) / (td * 2.00f)));
          }else if(ta == 2){
             return this.h;
          }else {
             p0 = p0 - td;
             td = this.f;
             if (p0 - td >= 0) {
                return this.i;
             }
             tb = this.c;
             return ((this.h + (tb * p0)) - (((tb * p0) * p0) / (td * 2.00f)));
          }
       }
    }
    public void c(float p0,float p1,float p2,float p3,float p4,float p5){
       this.m = p0;
       boolean b = (p0 - p1 > 0)? true: false;
       this.l = b;
       if (b) {
          this.e((- p2), (p0 - p1), p4, p5, p3);
       }else {
          this.e(p2, (p1 - p0), p4, p5, p3);
       }
       return;
    }
    public float d(float p0){
       g ta;
       g td = this.d;
       if (p0 - td <= 0) {
          ta = this.a;
          return (ta + (((this.b - ta) * p0) / td));
       }else {
          ta = this.j;
          if (ta == 1) {
             return 0;
          }
          p0 = p0 - td;
          td = this.e;
          if (p0 - td < 0) {
             ta = this.b;
             return (ta + (((this.c - ta) * p0) / td));
          }else if(ta == 2){
             return this.h;
          }else {
             p0 = p0 - td;
             td = this.f;
             if (p0 - td >= 0) {
                return this.i;
             }
             ta = this.c;
             return (ta - ((p0 * ta) / td));
          }
       }
    }
    public final void e(float p0,float p1,float p2,float p3,float p4){
       if (!p0) {
          p0 = 0.00f;
       }
       this.a = p0;
       float f = p0 / p2;
       float f1 = 2.00f;
       float f2 = (f * p0) / f1;
       if (p0 < 0) {
          p4 = (float)Math.sqrt((double)((p1 - ((((- p0) / p2) * p0) / f1)) * p2));
          if (p4 - p3 < 0) {
             this.k = "backward accelerate, decelerate";
             this.j = 2;
             this.a = p0;
             this.b = p4;
             this.c = 0;
             p3 = (p4 - p0) / p2;
             this.d = p3;
             this.e = p4 / p2;
             this.g = ((p0 + p4) * p3) / f1;
             this.h = p1;
             this.i = p1;
             return;
          }else {
             this.k = "backward accelerate cruse decelerate";
             this.j = 3;
             this.a = p0;
             this.b = p3;
             this.c = p3;
             p4 = (p3 - p0) / p2;
             this.d = p4;
             p2 = p3 / p2;
             this.f = p2;
             p0 = ((p0 + p3) * p4) / f1;
             p2 = (p2 * p3) / f1;
             this.e = ((p1 - p0) - p2) / p3;
             this.g = p0;
             this.h = p1 - p2;
             this.i = p1;
             return;
          }
       }else if(f2 - p1 >= 0){
          this.k = "hard stop";
          this.j = 1;
          this.a = p0;
          this.b = 0;
          this.g = p1;
          this.d = (f1 * p1) / p0;
          return;
       }else {
          f2 = p1 - f2;
          float f3 = f2 / p0;
          if ((f3 + f) - p4 < 0) {
             this.k = "cruse decelerate";
             this.j = 2;
             this.a = p0;
             this.b = p0;
             this.c = 0;
             this.g = f2;
             this.h = p1;
             this.d = f3;
             this.e = f;
             return;
          }else {
             p4 = (float)Math.sqrt((double)((p2 * p1) + ((p0 * p0) / f1)));
             f = (p4 - p0) / p2;
             this.d = f;
             f2 = p4 / p2;
             this.e = f2;
             if (p4 - p3 < 0) {
                this.k = "accelerate decelerate";
                this.j = 2;
                this.a = p0;
                this.b = p4;
                this.c = 0;
                this.d = f;
                this.e = f2;
                this.g = ((p0 + p4) * f) / f1;
                this.h = p1;
                return;
             }else {
                this.k = "accelerate cruse decelerate";
                this.j = 3;
                this.a = p0;
                this.b = p3;
                this.c = p3;
                p4 = (p3 - p0) / p2;
                this.d = p4;
                p2 = p3 / p2;
                this.f = p2;
                p0 = ((p0 + p3) * p4) / f1;
                p2 = (p2 * p3) / f1;
                this.e = ((p1 - p0) - p2) / p3;
                this.g = p0;
                this.h = p1 - p2;
                this.i = p1;
                return;
             }
          }
       }
    }
    public float getInterpolation(float p0){
       float f = this.b(p0);
       this.n = p0;
       p0 = (this.l != null)? this.m - f: this.m + f;
       return p0;
    }
}
