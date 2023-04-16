package jg9.a1;
import jg9.a1$a;
import nsd.u;
import java.lang.Object;

public final class a1	// class@002a81
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public static final a1 i;
    public static final a1$a j;

    static {
       a1.j = new a1$a(null);
       a1 uoa1 = new a1(false, false, false, false, false, false, false, 0, 240, null);
       a1.i = v0;
    }
    public void a1(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,int p7,int p8,u p9){
       if (p8 & 0x10) {
          p4 = true;
       }
       if (p8 & 0x20) {
          p5 = false;
       }
       if (p8 & 0x40) {
          p6 = false;
       }
       if (p8 & 0x0080) {
          p7 = 0;
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
       return;
    }
    public final boolean a(){
       return this.f;
    }
    public final boolean b(){
       return this.g;
    }
    public final boolean c(){
       return this.a;
    }
    public final boolean d(){
       return this.b;
    }
}
