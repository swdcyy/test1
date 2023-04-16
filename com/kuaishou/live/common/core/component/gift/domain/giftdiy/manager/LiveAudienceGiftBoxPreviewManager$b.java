package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager$b;
import aj1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager;
import java.lang.Object;
import cj1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import gy2.f;
import z1.k;
import android.app.Activity;
import gy2.c;
import gy2.a;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LivePreviewEffectInfo;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager$b$a;
import gy2.b$a;
import kotlin.jvm.internal.a;
import aj1.a$a;
import com.yxcorp.gifshow.models.Gift;
import java.util.Objects;
import aj1.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveAudienceGiftBoxPreviewManager$b implements a	// class@00123e
{
    public final LiveAudienceGiftBoxPreviewManager a;

    public void LiveAudienceGiftBoxPreviewManager$b(LiveAudienceGiftBoxPreviewManager p0){
       this.a = p0;
       super();
    }
    public void a(b p0,int p1){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxPreviewManager$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveAudienceGiftBoxPreviewManager$b.class, "2")) {
          return;
       }
       if (p1 == 5 || p1 == 6) {
          f.e.a(this.a.h.get()).a(this.a.f);
          LiveAudienceGiftBoxPreviewManager$b ta = this.a;
          LiveAudienceGiftBoxPreviewManager e = ta.e;
          GiftPanelItem mLivePreview = (e != null)? e.mLivePreviewEffectInfo: null;
          ta.b(mLivePreview);
       }else if(p1 != 1 && (p1 == 3 || p1 == 4)){
          this.a.j.e("onDiyPanelHide");
       }
       return;
    }
    public void b(int p0){
       LiveAudienceGiftBoxPreviewManager$b uob = LiveAudienceGiftBoxPreviewManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 == 1) {
          f.e.a(this.a.h.get()).b(this.a.f, new LiveAudienceGiftBoxPreviewManager$b$a());
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxPreviewManager$b.class, "5")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, a$a.class, "3")) {
          a.p(p0, "diyInputInfo");
       }
       return;
    }
    public void d(b p0,int p1){
       LiveAudienceGiftBoxPreviewManager$b uob = LiveAudienceGiftBoxPreviewManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       LiveAudienceGiftBoxPreviewManager d = this.a.d;
       String str = p0.b();
       Gift mId = p0.c().mId;
       Objects.requireNonNull(d);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(mId), d, uob1, "1")) {
          a.p(str, "defaultText");
          ShowMetaData showMetaData = new ShowMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = d.a;
          i3 oi3 = i3.f();
          oi3.d("default_text", str);
          oi3.c("index", Integer.valueOf(0));
          uElementPack.params = oi3.e();
          showMetaData.setElementPackage(uElementPack);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = d.b.get();
          uContentPack.giftPackage = d.a(mId);
          showMetaData.setContentPackage(uContentPack);
          u1.B0(showMetaData);
       }
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxPreviewManager$b.class, "4")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       LiveAudienceGiftBoxPreviewManager d = this.a.d;
       String str = p0.e();
       String str1 = p0.b();
       Gift mId = p0.c().mId;
       Objects.requireNonNull(d);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(str, str1, Integer.valueOf(mId), d, b.class, "2")) {
          a.p(str, "actualText");
          a.p(str1, "defaultText");
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = d.a;
          if (TextUtils.x(str)) {
             str = str1;
          }
          i3 oi3 = i3.f();
          oi3.d("actual_text", str);
          oi3.d("default_text", str1);
          oi3.c("index", Integer.valueOf(0));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = d.b.get();
          uContentPack.giftPackage = d.a(mId);
          uClickMetaDa.setContentPackage(uContentPack);
          uClickMetaDa.setElementPackage(uElementPack);
          u1.B(uClickMetaDa);
       }
       return;
    }
}
