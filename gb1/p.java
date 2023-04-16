package gb1.p;
import erd.g;
import gb1.s;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import e17.i;
import eb1.e;
import bb1.d;
import bb1.b;
import java.lang.String;
import java.lang.Throwable;

public final class p implements g	// class@00247e
{
    public final s b;
    public final UserInfo c;

    public void p(s p0,UserInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       if (tb.b.c() != null) {
          tb.b.c().i(tc.mId, true, null);
       }
       return;
    }
}
