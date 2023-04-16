package em1.g;
import msd.a;
import em1.q;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import em1.e;
import k51.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import k51.b;
import qrd.l1;

public final class g implements a	// class@0021b7
{
    public final q b;
    public final List c;

    public void g(q p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = new e(tb, this.c);
       b.d(uoe, a.g());
       return l1.a;
    }
}
