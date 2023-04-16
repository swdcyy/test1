package o31.b;
import io.reactivex.g;
import o31.m;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public final class b implements g	// class@00345e
{
    public final m b;

    public void b(m p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.isDisposed()) {
       }else {
          m j = tb.j;
          if (j != null) {
             p0.onError(j);
          }else {
             j = tb.h;
             if (j == null) {
                tb.l.add(p0);
             }else {
                p0.onNext(j);
                p0.onComplete();
             }
          }
       }
       return;
    }
}
