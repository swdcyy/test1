package gb1.x1;
import erd.g;
import gb1.i2;
import db1.b;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.b;
import com.kwai.framework.model.user.UserInfo;
import gb1.a2;
import z1.a;
import eb1.e;

public final class x1 implements g	// class@002495
{
    public final i2 b;
    public final b c;

    public void x1(i2 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       x1 tb = this.b;
       x1 tc = this.c;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f101d0e, tc.h()));
       RxBus.f.b(new b(tc.f().mId));
       tb.i(a2.a);
    }
}
