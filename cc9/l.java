package cc9.l;
import cc9.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class l extends c	// class@000511
{
    public final List b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public void l(List p0,int p1,boolean p2,boolean p3){
       a.p(p0, "templateList");
       super(0);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void l(List p0,int p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = 1;
       }
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final List b(){
       return this.b;
    }
}
