package cw1.i;
import h47.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class i implements b	// class@001e69
{
    public final c a;

    public void i(c p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       i ta = this.a;
       Objects.requireNonNull(ta);
       ta.b(LivePendantContainerScene.MULTI_TAB_STYLE, ta.H());
    }
}
