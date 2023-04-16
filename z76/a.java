package z76.a;
import z76.b;
import java.lang.Long;
import nsd.u;
import yb6.d;

public class a extends b	// class@004588
{
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;

    public void a(){
       super(null, null, null, null, null, null, 0, 127, null);
    }
    public void a(Long p0,Long p1,Long p2,Long p3,Long p4,Long p5,long p6){
       super(p6);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public void a(Long p0,Long p1,Long p2,Long p3,Long p4,Long p5,long p6,int p7,u p8){
       int i = 0;
       int i1 = (p7 & 0x01)? i: p0;
       int i2 = (p7 & 0x02)? i: p1;
       int i3 = (p7 & 0x04)? i: p2;
       int i4 = (p7 & 0x08)? i: p3;
       if (!(p7 & 0x10)) {
          i = p4;
       }
       long l = (p7 & 0x40)? d.a(): p6;
       super(i1, i2, i3, i4, i, 0, l);
       return;
    }
}
