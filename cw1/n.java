package cw1.n;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class n implements b	// class@001e73
{
    public final c b;

    public void n(c p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       n tb = this.b;
       Objects.requireNonNull(tb);
       tb.b(LivePendantContainerScene.AUDIENCE_VIDEO_CHAT, p1);
    }
}
