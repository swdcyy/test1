package o31.d;
import io.reactivex.g;
import o31.m;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public final class d implements g	// class@003460
{
    public final m b;

    public void d(m p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.isDisposed()) {
       }else {
          m k = tb.k;
          if (k != null) {
             p0.onError(k);
          }else {
             k = tb.i;
             if (k == null) {
                tb.m.add(p0);
             }else {
                p0.onNext(k);
                p0.onComplete();
             }
          }
       }
       return;
    }
}
