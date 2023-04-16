package c7c.k;
import erd.g;
import c7c.o;
import java.lang.Object;
import wca.q;
import java.util.Objects;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class k implements g	// class@000548
{
    public final o b;

    public void k(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.c != null && (p0.b == 1 && TextUtils.n(p0.a.getId(), tb.t.getId()))) {
          p0 = tb.t;
          p0.mVisitorBeFollowed = false;
          tb.V8(p0);
       }
    label_002a :
       return;
    }
}
