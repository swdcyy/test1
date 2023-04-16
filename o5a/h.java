package o5a.h;
import qc6.k;
import v5a.a;
import java.lang.Object;
import brd.t;
import o5a.n;
import t45.d;
import brd.z;
import o5a.c;
import erd.o;

public final class h implements k	// class@0032a7
{
    public final a a;

    public void h(a p0){
       this.a = p0;
    }
    public final t request(){
       return n.p(this.a).observeOn(d.a).map(c.b);
    }
}
