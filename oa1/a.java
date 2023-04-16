package oa1.a;
import java.lang.String;
import nsd.u;
import java.lang.Object;

public class a	// class@0034bc
{
    public int a;
    public int b;
    public float c;
    public float d;
    public int e;
    public int f;
    public String g;
    public boolean h;
    public int i;

    public void a(){
       super(0, 0, 0, 0, 0, 0, null, false, 0, 511, null);
    }
    public void a(int p0){
       super(p0, 0, 0, 0, 0, 0, null, false, 0, 510, null);
    }
    public void a(int p0,int p1,float p2,float p3,int p4,int p5,String p6,boolean p7,int p8,int p9,u p10){
       if (p9 & 0x01) {
          p0 = -1;
       }
       if (p9 & 0x02) {
          p1 = -1;
       }
       if (p9 & 0x04) {
          p2 = 0x3f19999a;
       }
       if (p9 & 0x08) {
          p3 = 0x3f19999a;
       }
       if (p9 & 0x10) {
          p4 = 1;
       }
       if (p9 & 0x20) {
          p5 = 10;
       }
       p6 = (p9 & 0x40)? "16777215": null;
       if (p9 & 0x0080) {
          p7 = false;
       }
       if (p9 & 0x0100) {
          p8 = 0;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       return;
    }
    public final void a(int p0){
       this.b = p0;
    }
    public final void b(float p0){
       this.d = p0;
    }
    public final void c(int p0){
       this.e = p0;
    }
    public final void d(int p0){
       this.f = p0;
    }
    public final void e(String p0){
       this.g = p0;
    }
    public final void f(boolean p0){
       this.h = p0;
    }
    public final void g(float p0){
       this.c = p0;
    }
}
