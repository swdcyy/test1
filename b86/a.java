package b86.a;
import z76.a;
import java.lang.Object;
import java.lang.Long;
import nsd.u;
import yb6.d;

public final class a extends a	// class@000432
{
    public final int h;
    public final Object i;

    public void a(int p0,Object p1,Long p2,Long p3,Long p4,Long p5,Long p6,Long p7,long p8,int p9,u p10){
       int i = this;
       int i1 = p9;
       int i2 = 0;
       int i3 = (i1 & 0x04)? i2: p2;
       int i4 = (i1 & 0x08)? i2: p3;
       int i5 = (i1 & 0x10)? i2: p4;
       int i6 = (i1 & 0x20)? i2: p5;
       int i7 = (i1 & 0x40)? i2: p6;
       if (!(i1 & 0x0080)) {
          i2 = p7;
       }
       long l = (i1 & 0x0100)? d.a(): p8;
       super(i3, i4, i5, i6, i7, i2, l);
       i.h = p0;
       i.i = p1;
       return;
    }
}
