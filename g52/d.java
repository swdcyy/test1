package g52.d;
import io.reactivex.g;
import g52.e$a;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import g52.e;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public final class d implements g	// class@002a6e
{
    public final e$a b;

    public void d(e$a p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.isDisposed()) {
       }else {
          e$a a = tb.a;
          e r = a.r;
          if (r != null) {
             p0.onError(r);
          }else {
             r = a.s;
             if (r == null) {
                a.q.add(p0);
             }else {
                p0.onNext(r);
                p0.onComplete();
             }
          }
       }
       return;
    }
}
