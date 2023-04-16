package cw1.m;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class m implements b	// class@001e71
{
    public final c b;

    public void m(c p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       m tb = this.b;
       Objects.requireNonNull(tb);
       tb.b(LivePendantContainerScene.MERCHANT_AUCTION_BUBBLE, p1);
    }
}
