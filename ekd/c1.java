package ekd.c1;
import erd.g;
import ekd.g1;
import java.lang.Object;
import java.lang.Long;
import io.reactivex.subjects.ReplaySubject;

public final class c1 implements g	// class@000d2e
{
    public final g1 b;

    public void c1(g1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c1 tb = this.b;
       tb.c.onNext(tb.a);
    }
}
