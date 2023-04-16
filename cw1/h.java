package cw1.h;
import mw1.d;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import java.util.Objects;
import cw1.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.util.List;

public final class h implements d	// class@001e67
{
    public final c a;

    public void h(c p0){
       this.a = p0;
    }
    public final void a(){
       boolean b1;
       h ta = this.a;
       g b = ta.b;
       Objects.requireNonNull(b);
       Object obj = PatchProxy.apply(null, b, d0.class, "6");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(b.b.contains(LivePendantContainerScene.SCREEN_LANDSCAPE) || b.b.contains(LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE)){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1) {
          ta.J();
       }
       return;
    }
}
