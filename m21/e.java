package m21.e;
import xq5.c;
import m21.c$b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m21.c;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class e implements c	// class@003113
{
    public final c$b b;
    public final LiveTimeConsumingUserStatusResponse c;

    public void e(c$b p0,LiveTimeConsumingUserStatusResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "2")) {
          return;
       }
       c t = this.b.b.t;
       if (t != null) {
          t.f(false);
       }
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "1")) {
          return;
       }
       c t = this.b.b.t;
       if (t != null) {
          t.f(true);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
