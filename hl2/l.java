package hl2.l;
import mq5.h;
import com.kuaishou.live.core.show.template.j;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;

public final class l implements h	// class@002dc6
{
    public final j b;

    public void l(j p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       this.b.a9();
    }
}
