package ih1.e;
import yg1.d;
import java.lang.Object;
import java.lang.String;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftPanelRechargeButtonConfig;
import java.lang.reflect.Type;
import wg3.a;
import yg1.f;

public final class e implements d	// class@0028d8
{

    public void e(){
       super();
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       LiveConfigStartupResponse$LiveGiftPanelRechargeButtonConfig liveGiftPane = a.t(LiveConfigStartupResponse$LiveGiftPanelRechargeButtonConfig.class);
       liveGiftPane = (liveGiftPane != null)? liveGiftPane.mDefaultText: null;
       p2.a(p0, new f(1, "[LiveGiftBoxRechargeConfigRepository][fetch]", liveGiftPane));
       return;
    }
    public void b(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       this.a(p0, p1, p2);
       return;
    }
    public void clear(){
    }
}
