package com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$b;
import ug1.a1;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter;
import java.lang.Object;
import f92.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.util.List;
import jk1.f;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import rm1.f;
import yy0.b;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveCustomGift;
import f92.a;
import ug1.z0;

public final class LiveAudienceCustomGiftPresenter$b implements a1	// class@000add
{
    public final LiveAudienceCustomGiftPresenter a;

    public void LiveAudienceCustomGiftPresenter$b(LiveAudienceCustomGiftPresenter p0){
       this.a = p0;
       super();
    }
    public void G4(b p0){
       LiveCustomGift customGift;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCustomGiftPresenter$b.class, "1")) {
          return;
       }
       LiveLogTag cUSTOM_GIFT = LiveLogTag.CUSTOM_GIFT;
       b.Z(cUSTOM_GIFT, this.a.K+" onSendNormalGiftToAnchorResult");
       LiveAudienceCustomGiftPresenter o = this.a.O;
       if (o == null) {
          a.S("audienceGiftBoxService");
       }
       List list = o.O3();
       a.o(list, "audienceGiftBoxService.giftPanelItems");
       b d = (p0 != null)? p0.d: null;
       if (d == null || list == null) {
          b.Z(cUSTOM_GIFT, this.a.K+" onSendNormalGiftToAnchorResult empty data");
          return;
       }else {
          GiftPanelItem giftPanelIte = f.b(p0.d, list);
          if (giftPanelIte == null) {
             b.j0(cUSTOM_GIFT, this.a.K+" onSendNormalGiftToAnchorResult missed");
             return;
          }else if(!giftPanelIte.isCustomGift()){
             b.j0(cUSTOM_GIFT, this.a.K+" onSendNormalGiftToAnchorResult not custom gift");
             return;
          }else {
             d = this.a.a9();
             p0 = p0.e;
             Objects.requireNonNull(d);
             b uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(giftPanelIte, Boolean.valueOf(p0), d, uob, "2")) {
                a.p(giftPanelIte, "sentCustomGiftPanelItem");
                String str = " updateCustomGiftAfterSendingGift";
                b.Z(cUSTOM_GIFT, d.a+str);
                d.b(d.a+str);
                if (p0 != null) {
                   b.Z(cUSTOM_GIFT, d.a+" updateCustomGiftAfterSendingGift sent succeed");
                   customGift = giftPanelIte.getCustomGift();
                   a.o(customGift, "sentCustomGiftPanelItem.customGift");
                   customGift.setState(0);
                   d.e(giftPanelIte);
                }else {
                   b.Z(cUSTOM_GIFT, d.a+" updateCustomGiftAfterSendingGift sent failed");
                   customGift = giftPanelIte.getCustomGift();
                   a.o(customGift, "sentCustomGiftPanelItem.customGift");
                   customGift.setState(1);
                }
             }
             return;
          }
       }
    }
    public void S1(a p0){
       z0.a(this, p0);
    }
    public void o4(b p0){
       z0.c(this, p0);
    }
    public void t2(b p0){
       z0.d(this, p0);
    }
}
