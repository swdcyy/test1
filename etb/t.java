package etb.t;
import erd.g;
import etb.v;
import java.lang.Object;
import ysb.c;
import java.util.Objects;
import qvb.a;

public final class t implements g	// class@00280c
{
    public final v b;

    public void t(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mResult == 1) {
          tb.p.remove(tb.q);
       }
       return;
    }
}
