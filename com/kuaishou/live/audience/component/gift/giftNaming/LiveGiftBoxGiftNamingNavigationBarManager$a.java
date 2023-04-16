package com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$a;
import rl1.g;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager;
import java.lang.Object;
import sl1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import v01.a;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kuaishou.live.common.core.component.gift.giftNaming.bean.LiveGiftNamingDisplayInfo;
import vq5.d;
import jk1.f;
import android.app.Activity;
import d61.y;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$a$a;
import java.lang.Runnable;
import e93.f;
import android.content.Context;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class LiveGiftBoxGiftNamingNavigationBarManager$a implements g	// class@000b72
{
    public final LiveGiftBoxGiftNamingNavigationBarManager a;

    public void LiveGiftBoxGiftNamingNavigationBarManager$a(LiveGiftBoxGiftNamingNavigationBarManager p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       a a;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxGiftNamingNavigationBarManager$a.class, str)) {
          return;
       }
       a.p(p0, "giftNamingInfo");
       ClientContent$LiveStreamPackage liveStreamPa = this.a.c();
       if (liveStreamPa != null) {
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, a, a.class, str)) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GIFT_ACHIEVEMENT_ENTRANCE";
             u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
          }
       }
       LiveGiftNamingDisplayInfo liveGiftNami = p0.a();
       if (liveGiftNami != null) {
          liveGiftNami = liveGiftNami.actionUrl;
          if (liveGiftNami != null && this.a.d().P0(liveGiftNami)) {
             this.a.m.B1();
             if (y.d(this.a.a())) {
                this.a.a().setRequestedOrientation(1);
                f.k("GiftNamingNavigationBar.onItemClick", new LiveGiftBoxGiftNamingNavigationBarManager$a$a(liveGiftNami, this), this.a, 100);
             }else {
                this.a.d().r4(liveGiftNami, this.a.a());
             }
          }
       }
       return;
    }
    public void b(a p0){
       a a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxGiftNamingNavigationBarManager$a.class, str)) {
          return;
       }
       a.p(p0, "giftNamingInfo");
       LiveGiftBoxGiftNamingNavigationBarManager$a ta = this.a;
       if (ta.e == null) {
          ClientContent$LiveStreamPackage liveStreamPa = ta.c();
          if (liveStreamPa != null) {
             a = a.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, a, a.class, str)) {
                a.p(liveStreamPa, "liveStreamPackage");
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GIFT_ACHIEVEMENT_ENTRANCE";
                u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
             }
          }
          liveStreamPa.e = true;
       }
       return;
    }
}
