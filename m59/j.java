package m59.j;
import erd.g;
import m59.o;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class j implements g	// class@002e05
{
    public final o b;
    public final String c;
    public final long d;
    public final long e;

    public void j(o p0,String p1,long p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       j tb = this.b;
       p0.G = tb.n;
       p0 = p0.F;
       p0.n = tb.q;
       p0.j = tb.o;
       p0.d0 = this.c;
       p0.E0 = tb.p;
       p0.F0 = this.d;
       p0.G0 = this.e;
    }
}
