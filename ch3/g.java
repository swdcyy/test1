package ch3.g;
import erd.g;
import ch3.t;
import java.lang.Object;
import java.lang.Throwable;
import ch3.m;
import z1.a;
import oh3.a;
import jh3.a;

public final class g implements g	// class@000550
{
    public final t b;
    public final boolean c;

    public void g(t p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.V(false);
       tb.Q(new m(tb, p0));
       tb.g.e(tb.i, false, p0);
       if (this.c != null) {
          tb.S();
       }
       return;
    }
}
