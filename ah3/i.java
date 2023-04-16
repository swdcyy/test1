package ah3.i;
import erd.g;
import ah3.v;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import ah3.o;
import z1.a;
import oh3.a;
import jh3.a;

public final class i implements g	// class@0000ce
{
    public final v b;
    public final String c;
    public final boolean d;

    public void i(v p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       tb.T(false);
       tb.Q(new o(tb, p0));
       tb.g.c(tb.h, this.c, false, p0);
       if (this.d != null) {
          tb.S();
       }
       return;
    }
}
