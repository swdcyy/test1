package fz0.d;
import a71.a;
import fz0.k;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import tj3.k;
import tj3.e;
import java.lang.System;
import z12.n;
import kuaishou.perf.page.impl.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveGiftPanelWarningConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.n;
import d61.n$a;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ik1.a0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qm1.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import ow0.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import gz0.a;
import k2b.e0;
import z12.x;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e92.a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.StringBuilder;
import wh5.c;

public final class d implements a	// class@0023df
{
    public final k a;

    public void d(k p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       boolean b;
       i n;
       k ok2;
       d a = this.a;
       Objects.requireNonNull(a);
       i oi = i.class;
       k ok = k.class;
       String str = "6";
       if (PatchProxy.applyVoid(null, a, ok, str)) {
       }else {
          k ok1 = a.K.d3.x();
          Objects.requireNonNull(ok1);
          if (!PatchProxy.applyVoid(null, ok1, k.class, "34")) {
             ok1.t0 = System.currentTimeMillis();
          }
          if (!PatchProxy.applyVoid(null, null, n.class, str)) {
             b.d("live_click_to_destroy").f("GiftPanelReactDuration");
          }
          GiftTab giftTab = 9;
          if (!PatchProxy.applyVoid(null, a, ok, "7")) {
             ok = a.V;
             if (ok == null || TextUtils.x(ok.mWarningToast)) {
                b.c0(LiveLogTag.GIFT, "[LiveAudienceGiftBottomBarEntryPresenterV2] [tryShowSendGiftToast]: mLiveGiftPanelWarningConfig is error", "mLiveGiftPanelWarningConfig", a.V);
             }else {
                n$a a1 = n.a;
                ok2 = a.V;
                n on = a1.a(a1.c(k.Y), ok2.mToastLimitDay, ok2.mToastLimitCount);
                if (on.c()) {
                   i.e(R.style.arg_RES_7f11066a, a.V.mWarningToast, k.Z);
                   on.b();
                   ClientContent$LiveStreamPackage liveStreamPa = a.K.Z2.a();
                   if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a0.class, "42")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "CHILD_GIFT_TOAST";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      u1.B0(new ShowMetaData().setType(giftTab).setElementPackage(uElementPack).setContentPackage(uContentPack));
                   }
                }
             }
          }
          ok = a.R;
          if (ok != null) {
             String str1 = "3";
             if (!PatchProxy.applyVoid(null, ok, oi, str1)) {
                n = ok.n;
                if (n != null) {
                   n.d();
                }
                n = ok.g;
                if (n != null && !PatchProxy.applyVoid(null, n, LiveAudienceBottomBarGiftAnimationManger.class, "2")) {
                   a.r(System.currentTimeMillis());
                }
                i h = ok.h;
                if (h != null) {
                   ok2 = k.class;
                   if (PatchProxy.applyVoid(null, h, ok2, str1) || (h.h != null && !PatchProxy.applyVoid(null, h, ok2, "10"))) {
                      u1.L("", x.k(h.d.Z2), giftTab, h.d(), h.c());
                   }
                }
             }
          label_0126 :
             ok = a.K;
             giftTab = GiftTab.NormalGift;
             ok1 = a.R;
             Objects.requireNonNull(ok1);
             Object obj = PatchProxy.apply(null, ok1, oi, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                oi = ok1.g;
                b = (oi != null && oi.o != null)? true: false;
             }
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(ok, giftTab, Boolean.valueOf(b), null, a.class, "1")) {
                a.f(ok, giftTab, b, null, 2);
             }
          }else {
             a.a9("CLIENT_BOTTOM_BAR_GIFT_ICON_CLICK", "[LiveAudienceGiftBottomBarEntryPresenterV2][handleGiftIconClick]GiftAnimationController is null, childLock£º"+c.b(), 0x30ed4);
          }
       }
       a.a9("CLIENT_BOTTOM_BAR_GIFT_ICON_CLICK", "[LiveAudienceGiftBottomBarEntryPresenterV2][buildGiftItem]gift item click", 1);
       return false;
    }
}
