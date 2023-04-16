package ez0.i0;
import ez0.i0$a;
import nsd.u;
import java.lang.Object;
import t02.a0;
import mk1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveVoicePartyConfig;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;

public final class i0	// class@00224d
{
    public static final i0$a a;

    static {
       i0.a = new i0$a(null);
    }
    public void i0(){
       super();
    }
    public static final boolean a(a0 p0,b p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       i0$a obj = PatchProxy.applyTwoRefs(p0, p1, null, i0.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = i0.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, i0$a.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "livePlayCallerContext");
          a.p(p1, "giftBoxParams");
          a0 b3 = p0.b3;
          a.o(b3, "livePlayCallerContext.mL¡­dienceStatusObtainService");
          LiveUserStatusResponse liveUserStat = b3.D1();
          if (liveUserStat != null) {
             liveUserStat = liveUserStat.mLiveVoicePartyConfig;
             if (liveUserStat != null && liveUserStat.mEnableSendGiftToAllInChatRoomByAuthor == 1) {
                liveUserStat = 1;
             label_004c :
                if (p1.d() == GiftTab.NormalGift && (p0.Y0.r2(AudienceBizRelation.VOICE_PARTY) && liveUserStat)) {
                   b = true;
                }else {
                   b = false;
                }
             }
          }
          liveUserStat = 0;
          goto label_004c ;
       }
       return b;
    }
}
