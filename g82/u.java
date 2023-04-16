package g82.u;
import erd.g;
import g82.v;
import java.lang.Object;
import i95.h;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public final class u implements g	// class@002ab8
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (TextUtils.n(p0.a(), tb.Y8())) {
          tb.E9(Boolean.FALSE);
       }
       return;
    }
}
