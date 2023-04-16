package cw1.q;
import lt5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import com.kwai.feature.api.live.service.show.rebroadcastbanner.BannerLocation;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class q implements b	// class@001e79
{
    public final c a;

    public void q(c p0){
       this.a = p0;
    }
    public final void a(BannerLocation p0){
       q ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == BannerLocation.RIGHT_BOTTOM_LOCATION) {
          ta.d(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_BOTTOM);
          ta.c(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP);
       }else if(p0 == BannerLocation.RIGHT_TOP_LOCATION){
          ta.d(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP);
          ta.c(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_BOTTOM);
       }else {
          ta.c(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP);
          ta.c(LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_BOTTOM);
       }
       return;
    }
}
