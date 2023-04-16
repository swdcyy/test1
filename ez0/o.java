package ez0.o;
import erd.o;
import brd.t;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import rm1.g;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import java.lang.Integer;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.concurrent.TimeUnit;

public final class o implements o	// class@002254
{
    public final t b;

    public void o(t p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       int i;
       o tb = this.b;
       LiveGiftPanelRefreshConfig mDelayReques = (p0 != null)? p0.mDelayRequestMillis: g.c();
       LiveLogTag gIFT = LiveLogTag.GIFT;
       Long longx = Long.valueOf(mDelayReques);
       p0 = (p0 != null)? p0.mPanelRefreshMode: -1;
       b.d0(gIFT, "[GiftOpt][delayPreLoadGiftBoxData]", "delay", longx, "refresh-mode", Integer.valueOf(p0));
       return tb.delaySubscription(mDelayReques, TimeUnit.MILLISECONDS);
    }
}
