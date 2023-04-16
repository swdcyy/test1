package e92.c;
import lf3.g;
import com.kuaishou.live.core.show.gift.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftCommonRoute;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import n91.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import xp5.g;
import vq5.d;
import jk1.f;
import lp3.c;
import android.content.Context;
import lf3.f;

public final class c implements g	// class@0026ae
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoa, "4")) {
       }else {
          LiveLogTag gIFT = LiveLogTag.GIFT;
          b.c0(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] ", "liveCommonRoute:", p0);
          if (p0 == null) {
             b.Z(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] : liveCommonRoute is null");
          }else {
             a e = tb.e;
             if (e == null) {
                b.Z(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] :  mLiveServerTimeService is null");
             }else if(tb.d == null){
                b.Z(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] :  mLiveInfoService is null");
             }else if(p0.executeDeadlineTime - e.s() < 0){
                b.Z(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] :  routerTimeValid");
             }else if(!TextUtils.isEmpty(p0.liveStreamId) && !TextUtils.equals(tb.d.getLiveStreamId(), p0.liveStreamId)){
                b.d0(gIFT, "[LiveGiftCommonRouterHandler] [onReceiveAutoGiftRouterMessage] :  liveStreamId is not the current live", "liveCommonRoute.liveStreamId", p0.liveStreamId, "mLiveInfoService.getLiveStreamId\(\):", tb.d.getLiveStreamId());
             }else if(PatchProxy.applyVoidOneRefs(p0, tb, uoa, "3") || PatchProxy.applyVoidOneRefs(p0, tb, uoa, "5")){
                if (!TextUtils.isEmpty(p0.routeUrl) && tb.b.P0(p0.routeUrl)) {
                   if (p0.needBreakCombo != null) {
                      f uof = tb.a(f.class);
                      if (uof != null) {
                         uof.K4("[LiveGiftCommonRouterHandler][tryShowDialog]");
                      }else {
                         b.Z(gIFT, "[LiveGiftCommonRouterHandler] [tryShowRewardDialog] : liveAudienceGiftBoxService is null");
                      }
                   }else {
                      b.Z(gIFT, "[LiveGiftCommonRouterHandler] [tryShowRewardDialog] : msg.needBreakCombo is false");
                   }
                   tb.b.r4(p0.routeUrl, tb.a);
                }else {
                   b.c0(gIFT, "[LiveGiftCommonRouterHandler] [tryShowRewardDialog] ", " routeUrl is error", p0.routeUrl);
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
