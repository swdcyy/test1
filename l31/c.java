package l31.c;
import mq5.h;
import l31.f;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.String;

public final class c implements h	// class@002e6e
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       c tb = this.b;
       tb.N = true;
       tb.o9("LiveStopListener");
    }
}
