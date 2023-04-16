package ih1.f$f;
import brd.w;
import java.lang.Object;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import rm1.g;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class f$f implements w	// class@0028de
{
    public static final f$f b;

    static {
       f$f.b = new f$f();
    }
    public void f$f(){
       super();
    }
    public final void subscribe(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveGiftPanelRefreshConfig liveGiftPane = new LiveGiftPanelRefreshConfig();
       liveGiftPane.mDelayRequestMillis = g.c();
       p0.onNext(liveGiftPane);
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxRepositories][GiftOpt][prefetch] timeOut, delay = "+liveGiftPane.mDelayRequestMillis);
       return;
    }
}
