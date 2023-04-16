package gb1.q;
import erd.g;
import gb1.s;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import eb1.e;
import bb1.d;
import bb1.b;
import java.lang.String;

public final class q implements g	// class@002481
{
    public final s b;
    public final UserInfo c;

    public void q(s p0,UserInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       new a().b(p0);
       if (tb.b.c() != null) {
          tb.b.c().i(tc.mId, false, p0);
       }
       return;
    }
}
