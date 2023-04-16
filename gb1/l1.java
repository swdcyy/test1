package gb1.l1;
import erd.g;
import gb1.m1;
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
import gb1.e1;
import z1.a;
import eb1.e;

public final class l1 implements g	// class@002471
{
    public final m1 b;
    public final b c;
    public final boolean d;

    public void l1(m1 p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       l1 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT, this.d));
       tb.i(new e1(p0));
    }
}
