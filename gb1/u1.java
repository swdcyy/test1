package gb1.u1;
import erd.g;
import gb1.v1;
import db1.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.String;
import gb1.n1;
import z1.a;
import eb1.e;

public final class u1 implements g	// class@00248c
{
    public final v1 b;
    public final b c;
    public final boolean d;

    public void u1(v1 p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       u1 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.KICK_USER, this.d));
       tb.i(new n1(p0));
    }
}
