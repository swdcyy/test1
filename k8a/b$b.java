package k8a.b$b;
import erd.g;
import k8a.b;
import java.lang.Object;
import ub6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.player.panel.config.SaveTrafficElementConfig;
import i3a.b;
import java.util.Objects;
import ekd.k1;
import k8a.c;
import java.lang.Runnable;

public final class b$b implements g	// class@002c17
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          p0 = PlayerPanelConfigHelper.a().getSaveTrafficConfig();
          if (p0 != null && (p0.a() == true && b.i())) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, b.class, "4")) {
                k1.n(p0);
                k1.s(new c(p0), p0, 2000);
             }
          }
       }
       return;
    }
}
