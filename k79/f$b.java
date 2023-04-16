package k79.f$b;
import k79.f;
import java.lang.Object;
import java.lang.String;
import brd.t;
import k79.g;

public final class f$b	// class@002b4d
{

    public static void a(f p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.d(p1);
       return;
    }
    public static t b(f p0,int p1,int p2,String p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = g.a;
       }
       if (p4 & 0x02) {
          p2 = g.b;
       }
       p3 = (p4 & 0x04)? "": null;
       return p0.h(p1, p2, p3);
    }
}
