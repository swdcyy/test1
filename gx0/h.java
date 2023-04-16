package gx0.h;
import mq5.h;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import com.kwai.library.widget.popup.common.c;
import z12.x;

public final class h implements h	// class@00259d
{
    public final e b;

    public void h(e p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       h tb = this.b;
       tb.J = true;
       x.f(tb.A);
    }
}
