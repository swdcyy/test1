package ekd.e1;
import erd.g;
import ekd.g1;
import java.lang.Object;
import java.lang.String;
import crd.b;
import io.reactivex.subjects.PublishSubject;

public final class e1 implements g	// class@000d34
{
    public final g1 b;

    public void e1(g1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e1 tb = this.b;
       g1 e = tb.e;
       if (e != null && !e.isDisposed()) {
          tb.e.dispose();
       }
       tb.d.onNext(p0);
       return;
    }
}
