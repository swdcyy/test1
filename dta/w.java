package dta.w;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import co5.r;
import java.util.Objects;
import java.util.BitSet;
import wq6.f;

public final class w implements u	// class@002556
{
    public final a a;

    public void w(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       w ta = this.a;
       Objects.requireNonNull(ta);
       if (p0.a == null) {
          ta.s.set(p0.b);
       }else {
          ta.s.clear(p0.b);
       }
       p0 = ta.p;
       boolean b = (ta.s.cardinality())? true: false;
       p0.E0(b);
       return;
    }
}
