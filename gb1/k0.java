package gb1.k0;
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
import kb1.d;
import com.kwai.framework.model.user.UserInfo;
import gb1.m0;
import z1.a;
import eb1.e;

public final class k0 implements g	// class@00246d
{
    public final u0 b;
    public final b c;

    public void k0(u0 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       k0 tc = this.c;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f102bb5, tc.h()));
       RxBus.f.b(new d(tc.f().mId, false));
       tb.i(m0.a);
    }
}
