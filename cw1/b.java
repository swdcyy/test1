package cw1.b;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.a;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class b implements b	// class@001e5b
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AnchorBizRelation.CHAT_CENTER_VIEW) {
          tb.b(LivePendantContainerScene.MULTI_CHAT_CENTER_VIEW, p1);
       }else {
          tb.b(LivePendantContainerScene.ANCHOR_CHAT, p1);
       }
       return;
    }
}
