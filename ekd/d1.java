package ekd.d1;
import erd.g;
import ekd.g1;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.subjects.ReplaySubject;

public final class d1 implements g	// class@000d31
{
    public final g1 b;

    public void d1(g1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d1 tb = this.b;
       tb.c.onNext(tb.a);
    }
}
