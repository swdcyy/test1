package jb1.o;
import u07.u;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import jb1.b;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class o implements u	// class@002b18
{
    public final b$c b;
    public final boolean c;
    public final UserInfo d;

    public void o(b$c p0,boolean p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       b$c p = tb.p;
       int i = (tc != null)? 1: 2;
       p.s1(5, i);
       tb.H(td, tc, LiveAdminPrivilege$PrivilegeType.BLOCK);
       return;
    }
}
