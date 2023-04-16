package gb1.k1;
import erd.g;
import gb1.m1;
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
import gb1.f1;
import z1.a;
import eb1.e;

public final class k1 implements g	// class@00246e
{
    public final m1 b;
    public final b c;
    public final boolean d;

    public void k1(m1 p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       k1 tb = this.b;
       k1 td = this.d;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       RxBus.f.b(new c(this.c.f().mId, LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT, td));
       tb.i(new f1(td));
    }
}
