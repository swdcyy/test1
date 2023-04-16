package cw1.p;
import oq5.c;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;

public final class p implements c	// class@001e77
{
    public final c b;

    public void p(c p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.orientation == 2) {
          if (!PatchProxy.applyVoid(null, tb, c.class, "2")) {
             if (tb.H()) {
                tb.d(LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE);
             }else {
                tb.d(LivePendantContainerScene.SCREEN_LANDSCAPE);
             }
             tb.c(LivePendantContainerScene.PLAY_CONFIG_PORTRAIT);
             tb.c(LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE);
          }
       }else {
          tb.J();
       }
       return;
    }
}
