package cw1.a;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.a;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class a implements b	// class@001e59
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       p0 = this.b;
       Objects.requireNonNull(p0);
       p0.b(LivePendantContainerScene.MERCHANT_AUCTION_BUBBLE, p1);
    }
}
