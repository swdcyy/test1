package ih1.h;
import brd.w;
import zg1.j;
import java.lang.Object;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h implements w	// class@0028e3
{
    public final j b;

    public void h(j p0){
       this.b = p0;
       super();
    }
    public final void subscribe(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       LiveGiftPanelRefreshConfig liveGiftPane = this.b.b();
       if (liveGiftPane == null) {
          liveGiftPane = new LiveGiftPanelRefreshConfig();
       }
       p0.onNext(liveGiftPane);
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxRepositories][GiftOpt][prefetch] userIoStatus, delay = "+liveGiftPane.mDelayRequestMillis);
       return;
    }
}
