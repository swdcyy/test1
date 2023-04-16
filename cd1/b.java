package cd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b implements b$a	// class@000495
{
    public final a a;

    public void b(a p0){
       this.a = p0;
    }
    public final void a(String p0,boolean p1,LiveIncreaseFansNoticeInfo p2){
       b ta = this.a;
       if (TextUtils.n(p0, ta.e())) {
          ta.d(p1, p2);
       }
       return;
    }
}
