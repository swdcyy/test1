package cw1.o;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class o implements b	// class@001e75
{
    public final c b;

    public void o(c p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.CHAT_CENTER_STATUS_VIEW) {
          tb.b(LivePendantContainerScene.MULTI_CHAT_CENTER_VIEW, p1);
       }else {
          tb.b(LivePendantContainerScene.AUDIENCE_CHAT, p1);
       }
       return;
    }
}
