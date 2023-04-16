package b7c.l;
import erd.g;
import com.yxcorp.gifshow.pymk.element.d;
import java.lang.Object;
import sra.a;
import java.util.Objects;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;

public final class l implements g	// class@0003cd
{
    public final d b;

    public void l(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.a() || TextUtils.n(p0.b(), tb.p.getId())) {
          tb.P8(tb.p);
          b9.a(tb.u);
       }
       return;
    }
}
