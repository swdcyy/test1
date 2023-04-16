package jb1.l;
import u07.u;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import jb1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Enum;

public final class l implements u	// class@002b15
{
    public final b$c b;
    public final UserInfo c;

    public void l(b$c p0,UserInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       l tb = this.b;
       tb.p.s1(2, 1);
       tb.P(this.c, LiveApiParams$AssistantType.ADMIN.ordinal());
    }
}
