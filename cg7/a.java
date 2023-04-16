package cg7.a;
import yf7.f;
import java.util.List;
import msd.l;
import nsd.u;

public final class a extends f	// class@000546
{
    public final List a;
    public final l b;
    public final long c;
    public final float d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public void a(){
       super(null, null, 0, 0, 0, false, false, 127, null);
    }
    public void a(List p0,l p1,long p2,float p3,int p4,boolean p5,boolean p6,int p7,u p8){
       int i = 0;
       if (p7 & 0x01) {
          p0 = i;
       }
       if (p7 & 0x02) {
          p1 = i;
       }
       if (p7 & 0x04) {
          p2 = 1000;
       }
       if (p7 & 0x08) {
          p3 = 0x3f000000;
       }
       if (p7 & 0x10) {
          p4 = 10;
       }
       if (p7 & 0x20) {
          p5 = false;
       }
       if (p7 & 0x40) {
          p6 = false;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
}
