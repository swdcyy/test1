package cw1.r;
import w37.a;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class r implements a	// class@001e7b
{
    public final c a;

    public void r(c p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       r ta = this.a;
       Objects.requireNonNull(ta);
       if (p0) {
          ta.d(LivePendantContainerScene.GZONE_BANNER);
       }else {
          ta.c(LivePendantContainerScene.GZONE_BANNER);
       }
       return;
    }
}
