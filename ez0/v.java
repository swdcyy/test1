package ez0.v;
import brd.w;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Object;
import brd.y;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;

public final class v implements w	// class@00225b
{
    public final LiveTimeConsumingUserStatusResponse b;

    public void v(LiveTimeConsumingUserStatusResponse p0){
       this.b = p0;
    }
    public final void subscribe(y p0){
       LiveTimeConsumingUserStatusResponse mLiveGiftPan = this.b.mLiveGiftPanelRefresh;
       if (mLiveGiftPan == null) {
          mLiveGiftPan = new LiveGiftPanelRefreshConfig();
          mLiveGiftPan.mDelayRequestMillis = 0;
       }
       p0.onNext(mLiveGiftPan);
       return;
    }
}
