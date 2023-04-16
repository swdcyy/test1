package jb1.n;
import u07.u;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import jb1.b;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class n implements u	// class@002b17
{
    public final b$c b;
    public final boolean c;
    public final UserInfo d;

    public void n(b$c p0,boolean p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       b$c p = tb.p;
       int i = (tc != null)? 1: 2;
       p.s1(4, i);
       tb.H(td, tc, LiveAdminPrivilege$PrivilegeType.KICK_USER);
       return;
    }
}
