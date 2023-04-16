package c7c.j;
import erd.g;
import c7c.o;
import java.lang.Object;
import sra.a;
import java.util.Objects;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class j implements g	// class@000547
{
    public final o b;

    public void j(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.a() || TextUtils.n(p0.b(), tb.t.getId())) {
          tb.V8(tb.t);
       }
       return;
    }
}
