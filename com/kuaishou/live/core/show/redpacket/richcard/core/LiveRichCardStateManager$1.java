package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponseData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import java.util.Objects;
import crd.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import yb6.d;
import bi2.e;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ai2.g;
import erd.g;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveRichCardStateManager$1 implements Model$a	// class@000f68
{

    public void LiveRichCardStateManager$1(){
       super();
    }
    public void F(String p0,Object p1,Object p2){
       int i;
       BarTitleTextMap uBarTitleTex;
       c a;
       RichCardInfoResponseData richCardInfo = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, richCardInfo, this, LiveRichCardStateManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          String str = "1";
          LiveRichCardStateManager liveRichCard = 7;
          RichCardInfo richCardInfo1 = 10;
          if (richCardInfo && richCardInfo.getCode() == liveRichCard) {
             richCardInfo1 = richCardInfo.getCardInfo();
             if (richCardInfo1 != null) {
                Long freeCardShow = richCardInfo1.getFreeCardShowEndTime();
                if (freeCardShow != null) {
                   long l = freeCardShow.longValue();
                   LiveRichCardStateManager h = LiveRichCardStateManager.h;
                   Objects.requireNonNull(h);
                   LiveRichCardStateManager liveRichCard1 = LiveRichCardStateManager.class;
                   if (!PatchProxy.isSupport(liveRichCard1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), h, liveRichCard1, str)) {
                      b f = LiveRichCardStateManager.f;
                      if (f != null && !f.isDisposed()) {
                         b.Z(LiveRichCardStateManager.a, "startRichCardTimer， 正在过期倒计时");
                      }else {
                         l = l - d.a();
                         a = LiveRichCardStateManager.a;
                         b.c0(a, "startRichCardTimer， 开始过期倒计时", "intervalTime", Long.valueOf(l));
                         if (l <= 0) {
                            b.Z(a, "startRichCardTimer， 天降暴富卡过期");
                            LiveRichCardStateManager.c.e("richCardDeadlineDisposable");
                         }else {
                            LiveRichCardStateManager.f = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(g.b);
                         }
                      }
                   }
                }
             }
             i = 7;
          }else if(richCardInfo != null && richCardInfo.getCode() == richCardInfo1){
             LiveRichCardStateManager.h.h();
             i = 10;
          }else {
             i = 5;
          }
          liveRichCard = LiveRichCardStateManager.h;
          b.c0(liveRichCard.f(), "LiveRichCardStateManager", "RichCardInfoResponse newValue", richCardInfo);
          e uoe = liveRichCard.e();
          Objects.requireNonNull(uoe);
          e RichCardInfo uoe1 = e.class;
          if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidTwoRefs(richCardInfo, Integer.valueOf(i), uoe, uoe1, str)) {
             c uoc = liveRichCard.f();
             BottomBarInfo uBottomBarIn = null;
             RichCardInfo richCardInfo2 = (richCardInfo != null)? richCardInfo.getCardInfo(): uBottomBarIn;
             Integer integer = Integer.valueOf(i);
             g og = uoe.a();
             Integer integer1 = (og != null)? Integer.valueOf(og.d()): uBottomBarIn;
             b.e0(uoc, "[richCardModel][updateRichCardInfoResponse]", "cardInfo", richCardInfo2, "state", integer, "cur state", integer1);
             if (richCardInfo != null) {
                uoe1 = richCardInfo.getCardInfo();
                if (uoe1 != null) {
                   uBarTitleTex = uoe1.getBarTitleTextMap();
                label_0121 :
                   RichCardInfo richCardInfo3 = (richCardInfo != null)? richCardInfo.getCardInfo(): uBottomBarIn;
                   EffectInfo uEffectInfo = (richCardInfo != null)? richCardInfo.getEffectInfo(): uBottomBarIn;
                   PendantConfig pendantConfi = (richCardInfo != null)? richCardInfo.getPendantInfo(): uBottomBarIn;
                   if (richCardInfo != null) {
                      uBottomBarIn = richCardInfo.getBottomBarInfo();
                   }
                   g og1 = new g(uBarTitleTex, richCardInfo3, uEffectInfo, pendantConfi, null, i, uBottomBarIn);
                   uoe.d("[LiveRichCard]updateRichCardInfoResponse", og);
                }
             }
             uBarTitleTex = uBottomBarIn;
             goto label_0121 ;
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardStateManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
