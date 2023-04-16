package ez0.n;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import t02.a0;
import hf3.a;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import ez0.g0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fg6.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftAutoRefreshMessage;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import p91.m;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import jk1.f;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ez0.e0;

public final class n implements g	// class@002253
{
    public final k b;

    public void n(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       LiveAudienceGiftAutoRefreshMessage liveAudience;
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME && (!tb.w.C.isConnected() && (!tb.w.Z2.A0().r2(AudienceBizRelation.PK) && (!tb.w.Z2.A0().r2(AudienceBizRelation.LIVE_MULTI_PK) && (tb.w.Z2.A0().r2(AudienceBizRelation.LIVE_LINE) || tb.w.Z2.A0().r2(AudienceBizRelation.LIVE_MULTI_LINE)))))) {
          p0 = tb.N;
          Objects.requireNonNull(p0);
          g0 og0 = g0.class;
          if (!PatchProxy.applyVoid(null, p0, og0, "3")) {
             String str = a.t().u("SOURCE_LIVE").c("enableAutoRefreshGiftPanel", "");
             if (TextUtils.isEmpty(str)) {
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftPanelUpdateManager] [tryRefreshGiftPanel]: json str is null");
             }else {
                try{
                   liveAudience = a.a.h(str, LiveAudienceGiftAutoRefreshMessage.class);
                }catch(java.lang.Exception e0){
                   b.c0(LiveLogTag.GIFT, "[LiveAudienceGiftPanelUpdateManager] [tryRefreshGiftPanel]: message param is error", "jsonStr", str);
                }
                if (liveAudience == null) {
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftPanelUpdateManager] [tryRefreshGiftPanel]: message is null");
                }else if(!liveAudience.getEnableAutoRefreshGiftPanle()){
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftPanelUpdateManager] [tryRefreshGiftPanel]: message getEnableAutoRefreshGiftPanel is false");
                }else if(p0.d){
                   a0 z2 = p0.f.Z2;
                   String str1 = "livePlayCallerContext.mLiveBasicContext";
                   a.o(z2, str1);
                   if ((z2.s() - p0.d) - liveAudience.getRefreshInterval() < 0) {
                      p0 = p0.f.Z2;
                      a.o(p0, str1);
                      b.d0(LiveLogTag.GIFT, "[LiveAudienceGiftBoxPresenter] [tryRefreshGiftPanel]: refresh time error", "last refreshTime", Long.valueOf(p0.d), "currentTime", Long.valueOf(p0.s()));
                   }
                }
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                if (!qCurrentUser.isLogined()) {
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxPresenter] [tryRefreshGiftPanel]:  no login");
                }else {
                   boolean refreshImmed = liveAudience.getRefreshImmediate();
                   long giftPanelMax = liveAudience.getGiftPanelMaxDelayMills();
                   if (!PatchProxy.isSupport(e0) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(refreshImmed), Boolean.TRUE, Long.valueOf(giftPanelMax), p0, g0.class, "4")) {
                      if (refreshImmed) {
                         a0 x1 = p0.f.x1;
                         a.o(x1, "livePlayCallerContext.mLiveAudienceGiftBoxService");
                         if (x1.X3()) {
                            b9.a(p0.a);
                            p0.a = t.timer(giftPanelMax, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new e0(p0, refreshImmed));
                         }
                      }
                      p0.c(true, giftPanelMax);
                   }
                }
             }
          }
       }
       return;
    }
}
