package h31.h;
import erd.g;
import h31.l;
import java.lang.Object;
import java.lang.Boolean;
import io.reactivex.subjects.ReplaySubject;

public final class h implements g	// class@002615
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       tb.S = true;
       tb.T = p0.booleanValue();
       tb.U.onNext(Boolean.valueOf(tb.S));
    }
}
