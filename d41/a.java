package d41.a;
import io.reactivex.g;
import d41.b;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public final class a implements g	// class@001f03
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.isDisposed()) {
       }else {
          b d = tb.d;
          if (d != null) {
             p0.onError(d);
          }else {
             d = tb.e;
             if (d == null) {
                tb.f.add(p0);
             }else {
                p0.onNext(d);
                p0.onComplete();
             }
          }
       }
       return;
    }
}
