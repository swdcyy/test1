package e7a.p;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.d;
import java.lang.Object;
import d0a.o;
import java.util.Objects;

public final class p implements g	// class@002092
{
    public final d b;

    public void p(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == null && !tb.Y8()) {
          tb.X8();
       }
       if (p0.a == 1) {
          tb.V8();
       }
       return;
    }
}
