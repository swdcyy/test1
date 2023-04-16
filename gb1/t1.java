package gb1.t1;
import erd.g;
import gb1.v1;
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
import gb1.o1;
import z1.a;
import eb1.e;

public final class t1 implements g	// class@002489
{
    public final v1 b;
    public final b c;
    public final boolean d;

    public void t1(v1 p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       t1 tb = this.b;
       t1 td = this.d;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.KICK_USER, td));
       tb.i(new o1(td));
    }
}
