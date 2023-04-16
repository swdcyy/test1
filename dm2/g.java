package dm2.g;
import mq5.h;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import com.kuaishou.live.core.show.vote.presenter.c$d;
import com.kuaishou.live.core.show.vote.e;

public final class g implements h	// class@002545
{
    public final c b;

    public void g(c p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       g tb = this.b;
       tb.L.f();
       c u = tb.U;
       if (u != null) {
          u.c();
       }
       return;
    }
}
