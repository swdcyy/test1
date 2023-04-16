package gb1.j0;
import erd.g;
import gb1.u0;
import db1.b;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.a;
import com.kwai.framework.model.user.UserInfo;
import gb1.n0;
import z1.a;
import eb1.e;

public final class j0 implements g	// class@00246a
{
    public final u0 b;
    public final b c;

    public void j0(u0 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       j0 tc = this.c;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f101d0a, tc.h()));
       RxBus.f.b(new a(tc.f().mId));
       tb.i(n0.a);
    }
}
