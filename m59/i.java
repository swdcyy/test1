package m59.i;
import erd.g;
import m59.o;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.util.Objects;
import vq4.d;

public final class i implements g	// class@002e04
{
    public final o b;
    public final String c;

    public void i(o p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.F;
       p0.n = tb.q;
       p0.j = tb.o;
       p0.K3 = this.c;
    }
}
