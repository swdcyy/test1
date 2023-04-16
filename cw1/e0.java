package cw1.e0;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;

public final class e0 implements b	// class@001e60
{
    public final g b;

    public void e0(g p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.b(LivePendantContainerScene.PK, p1);
    }
}
