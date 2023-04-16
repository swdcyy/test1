package co2.n0;
import mq5.h;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import qrd.l1;
import brd.y;

public final class n0 implements h	// class@00059f
{
    public final s b;

    public void n0(s p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       this.b.w.onNext(l1.a);
    }
}
