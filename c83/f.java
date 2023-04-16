package c83.f;
import erd.o;
import c83.h;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.gift.guide.LiteSideBarReplacePlan;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import z1.e;

public final class f implements o	// class@0004f1
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       boolean b;
       LiveGiftTag lIVE_POPULAR;
       LiveGiftTag liveGiftTag;
       f tb = this.b;
       Objects.requireNonNull(tb);
       LiveLiteTimeConsumingUserStatusResponse mLivePopular = p0.mLivePopularityTicketConfig;
       p0 = p0.mLiteSideBarReplacePlan;
       e obj = PatchProxy.applyTwoRefs(mLivePopular, p0, tb, h.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          String str = "LiveLitePopularityTicketModel";
          if (mLivePopular == null || p0 == null) {
             b.T(LiveGiftTag.LIVE_POPULARITY.appendTag(str), "checkPopularityConfigValid: config is null!", "giftConfig", mLivePopular, "ticketConfig", p0);
          }else {
             LiteSideBarReplacePlan mLiteSideBar = p0.mLiteSideBarReplacePlan;
             if (!LiteSideBarReplacePlan.isValidReplacePlan(mLiteSideBar)) {
                lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
                lIVE_POPULAR.appendTag(str);
                liveGiftTag = lIVE_POPULAR;
                b.S(liveGiftTag, "checkPopularityConfigValid: plan is invalid!", "plan", Integer.valueOf(mLiteSideBar));
             }else {
                LiveGiftGuideConfig mEnableLiveE = mLivePopular.mEnableLiveExplicitGift;
                lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
                lIVE_POPULAR.appendTag(str);
                liveGiftTag = lIVE_POPULAR;
                b.S(liveGiftTag, "checkPopularityConfigValid", "enableLiveExplicitGift", Boolean.valueOf(mEnableLiveE));
                b = mEnableLiveE;
             }
          }
          b = null;
       }
       obj = (b != null)? new e(mLivePopular, p0): null;
       return obj;
    }
}
