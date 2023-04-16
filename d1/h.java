package d1.h;
import java.lang.Object;
import java.lang.Math;
import e1.i;
import e1.t;

public class h	// class@001df3
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public static String g = "VelocityMatrix";

    public void h(){
       super();
    }
    public void a(float p0,float p1,int p2,int p3,float[] p4){
       h oh = this;
       int i = p2;
       float f = (p0 - 0x3f000000) * 2.00f;
       float f1 = (p1 - 0x3f000000) * 2.00f;
       float f2 = (float)Math.toRadians((double)oh.e);
       double d = (double)(float)Math.toRadians((double)oh.f);
       double d1 = (double)((float)p3 * f1);
       p4[0] = ((p4[0] + oh.c) + (oh.a * f)) + ((float)(((double)((float)(- i) * f) * Math.sin(d)) - (Math.cos(d) * d1)) * f2);
       p4[1] = ((p4[1] + oh.d) + (oh.b * f1)) + (f2 * (float)(((double)((float)i * f) * Math.cos(d)) - (d1 * Math.sin(d))));
    }
    public void b(){
       this.e = 0;
       this.d = 0;
       this.c = 0;
       this.b = 0;
       this.a = 0;
    }
    public void c(i p0,float p1){
       if (p0 != null) {
          this.e = p0.b(p1);
       }
       return;
    }
    public void d(t p0,float p1){
       if (p0 != null) {
          this.e = p0.b(p1);
          this.f = p0.a(p1);
       }
       return;
    }
    public void e(i p0,i p1,float p2){
       if (p0 == null && p1 == null) {
          return;
       }
       if (p0 == null) {
          this.a = p0.b(p2);
       }
       if (p1 == null) {
          this.b = p1.b(p2);
       }
       return;
    }
    public void f(t p0,t p1,float p2){
       if (p0 != null) {
          this.a = p0.b(p2);
       }
       if (p1 != null) {
          this.b = p1.b(p2);
       }
       return;
    }
    public void g(i p0,i p1,float p2){
       if (p0 != null) {
          this.c = p0.b(p2);
       }
       if (p1 != null) {
          this.d = p1.b(p2);
       }
       return;
    }
    public void h(t p0,t p1,float p2){
       if (p0 != null) {
          this.c = p0.b(p2);
       }
       if (p1 != null) {
          this.d = p1.b(p2);
       }
       return;
    }
}
