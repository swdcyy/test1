package dfc.n;
import erd.g;
import dfc.o;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import im8.f;
import java.lang.Long;
import bfc.i;
import java.lang.String;
import dfc.a;
import brd.y;

public final class n implements g	// class@0021ab
{
    public final o b;

    public void n(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
       }else {
          int i = 2;
          if (tb.s.get().longValue() <= 0) {
             tb.t.onNext(a.a("Request load entrance data as first show view data is not ready.", i, i.b()));
          }else {
             tb.R8();
             if (tb.u.get().booleanValue()) {
                tb.t.onNext(a.a("Request load entrance data as click notice tab.", i, i.b()));
             }
          }
       }
       return;
    }
}
