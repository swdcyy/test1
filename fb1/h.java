package fb1.h;
import erd.g;
import fb1.i;
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
import fb1.a;
import z1.a;
import eb1.e;

public final class h implements g	// class@0022dd
{
    public final i b;
    public final b c;
    public final boolean d;

    public void h(i p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.CONTROL, this.d));
       tb.i(new a(p0));
    }
}
