package fb1.g;
import erd.g;
import fb1.i;
import db1.b;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.String;
import fb1.b;
import z1.a;
import eb1.e;

public final class g implements g	// class@0022dc
{
    public final i b;
    public final b c;
    public final boolean d;

    public void g(i p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g td = this.d;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.CONTROL, td));
       tb.i(new b(td));
    }
}
