package g82.q;
import lnc.c3$a;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupActiveNoticeInfo;
import java.lang.Object;
import sc1.e;

public final class q implements c3$a	// class@002ab3
{
    public final LiveFansGroupActiveNoticeInfo a;
    public final int b;

    public void q(LiveFansGroupActiveNoticeInfo p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       q ta = this.a;
       p0.bg(ta.mEnableShowActiveNotice, this.b, ta.mActiveNoticeDisplayIntervalMs);
    }
}
