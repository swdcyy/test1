package ez0.f0;
import erd.g;
import ez0.g0;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import kotlin.jvm.internal.a;
import jk1.f;

public final class f0 implements g	// class@002241
{
    public final g0 b;
    public final SCLiveGiftPanelRefresh c;

    public void f0(g0 p0,SCLiveGiftPanelRefresh p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
       }else {
          p0 = this.b.f.x1;
          a.o(p0, "livePlayCallerContext.mLiveAudienceGiftBoxService");
          if (!p0.X3()) {
             this.b.d(this.c);
          }else {
             p0 = this.c;
             SCLiveGiftPanelRefresh refreshTab = p0.refreshTab;
             if (refreshTab == 1) {
                this.b.f.x1.Hh(p0.enableRefreshPanelUi, 1);
                this.b.e(this.c);
             }else if(refreshTab == 99){
                this.b.f.x1.u2(p0.enableRefreshPanelUi, 1);
                this.b.e(this.c);
             }else {
                this.b.d(p0);
             }
          }
       }
       return;
    }
}
