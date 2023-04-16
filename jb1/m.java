package jb1.m;
import u07.u;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import jb1.b;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class m implements u	// class@002b16
{
    public final b$c b;
    public final boolean c;
    public final UserInfo d;

    public void m(b$c p0,boolean p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       m tb = this.b;
       m tc = this.c;
       m td = this.d;
       b$c p = tb.p;
       int i = (tc != null)? 1: 2;
       p.s1(3, i);
       tb.H(td, tc, LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT);
       return;
    }
}
