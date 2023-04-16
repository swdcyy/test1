package i02.p;
import erd.g;
import i02.r;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Object;
import java.lang.Throwable;

public final class p implements g	// class@0027f7
{
    public final r b;
    public final String c;
    public final LiveIncreaseFansNoticeInfo d;

    public void p(r p0,String p1,LiveIncreaseFansNoticeInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       this.b.So(this.c, false, this.d);
    }
}
