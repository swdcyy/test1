package gb1.y1;
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
import kb1.e;
import com.kwai.framework.model.user.UserInfo;
import gb1.b2;
import z1.a;
import eb1.e;

public final class y1 implements g	// class@002498
{
    public final i2 b;
    public final b c;

    public void y1(i2 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       y1 tb = this.b;
       y1 tc = this.c;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f102bb6, tc.h()));
       RxBus.f.b(new e(tc.f().mId, false));
       tb.i(b2.a);
    }
}
