package bh3.r;
import erd.g;
import bh3.s;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import bh3.s$d;
import bh3.s$c;
import jh3.a;

public final class r implements g	// class@0003ca
{
    public final s b;
    public final String c;
    public final boolean d;

    public void r(s p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       r tb = this.b;
       r tc = this.c;
       r td = this.d;
       s f = tb.f;
       if (f != null) {
          f.e(tb.d.a, tc, tb.i, false, td, p0);
       }
       tb.h.d(tb.d.a, tc, false, p0);
       return;
    }
}
