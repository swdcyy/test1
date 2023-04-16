package jb1.e;
import erd.g;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import e17.i;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;

public final class e implements g	// class@002b0e
{
    public final b$c b;
    public final UserInfo c;
    public final boolean d;
    public final LiveAdminPrivilege$PrivilegeType e;

    public void e(b$c p0,UserInfo p1,boolean p2,LiveAdminPrivilege$PrivilegeType p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       p0.mForbidComment = td;
       tb.I(tc, td, this.e);
    }
}
