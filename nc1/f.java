package nc1.f;
import io.reactivex.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import brd.g;

public final class f implements g	// class@0032d3
{
    public final List b;

    public void f(List p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       p0.onNext(this.b);
       p0.onComplete();
    }
}
