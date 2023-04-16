package hi1.q;
import io.reactivex.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Iterable;
import qk.m;
import hi1.l;
import ok.h;
import hi1.n;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;
import brd.g;

public final class q implements g	// class@0026e3
{
    public final List b;

    public void q(List p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       ArrayList uArrayList = new ArrayList();
       m.s(this.b).F(l.b).p(n.b).n(uArrayList);
       p0.onNext(uArrayList);
    }
}
