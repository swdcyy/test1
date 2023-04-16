package ee9.f;
import erd.g;
import ee9.l;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import hc9.e;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import z3b.s0;
import j8c.a;
import java.lang.String;
import q87.c;

public final class f implements g	// class@002127
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0 == null || !p0.equals(tb.q.f())) {
          Object[] objArray = new Object[i];
          a.D().A("MagicDownloadBoxController", "getMagicResponseWithoutFilter, magic is changed", objArray);
       }else {
          s0.e().a(i, true);
          tb.q.d(2, p0);
       }
       return;
    }
}
