package gb1.c1;
import erd.g;
import gb1.d1;
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
import gb1.v0;
import z1.a;
import eb1.e;

public final class c1 implements g	// class@00244f
{
    public final d1 b;
    public final b c;
    public final boolean d;

    public void c1(d1 p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.BLOCK, this.d));
       tb.i(new v0(p0));
    }
}
