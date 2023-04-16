package gx0.b;
import erd.g;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig$CampaignConfig;

public final class b implements g	// class@002597
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "20")) {
       }else if(p0 != null){
          p0 = p0.mBlessBagConfig;
          if (p0 != null) {
             tb.F = p0;
             p0 = LiveLogTag.LIVE_BLESSING_BAG;
             p0.appendTag("LiveAudienceBlessingBagPresenter");
             b.T(p0, "handleUserIoStatus", "mEnableBlessBagCampaign", Boolean.valueOf(tb.F.mEnableBlessBagCampaign), "mReceiveWaitDurationMs", Long.valueOf(tb.F.mReceiveWaitDurationMs));
             if (tb.F.mCampaignConfig != null) {
                p0.appendTag("LiveAudienceBlessingBagPresenter");
                p0 = tb.F.mCampaignConfig;
                b.U(p0, "handleUserIoStatus", "mCampaignId", p0.mCampaignId, "mEnablePrimaryBag", Boolean.valueOf(p0.mEnablePrimaryBag), "mPrimaryJobFinish", Boolean.valueOf(tb.F.mCampaignConfig.mPrimaryJobFinish));
             }
          }
       }
       b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveAudienceBlessingBagPresenter"), "handleUserIoStatus, userIoStatus result is null");
       return;
    }
}
