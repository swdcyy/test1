package com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$a;
import yy0.f;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import yy0.b;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import kotlin.jvm.internal.a;
import yy0.a;
import java.util.Objects;
import java.util.List;
import lp3.e;
import lp3.c;
import lp3.b;

public final class LiveAudienceCustomGiftPresenter$a implements f	// class@000adc
{
    public final String b;
    public final LiveAudienceCustomGiftPresenter c;

    public void LiveAudienceCustomGiftPresenter$a(LiveAudienceCustomGiftPresenter p0){
       this.c = p0;
       super();
       this.b = "LiveAudienceCustomGiftService";
    }
    public void Bd(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCustomGiftPresenter$a.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.CUSTOM_GIFT, this.b+" cancelUpdatingCustomGift");
       this.c.a9().a();
       return;
    }
    public void Ei(GiftPanelItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCustomGiftPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "giftPanelItem");
       b.Z(LiveLogTag.CUSTOM_GIFT, this.b+" updateCustomGift");
       this.c.a9().e(p0);
       return;
    }
    public void al(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCustomGiftPresenter$a.class, "2")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveLogTag cUSTOM_GIFT = LiveLogTag.CUSTOM_GIFT;
       b.Z(cUSTOM_GIFT, this.b+" registerCustomGiftInfoListener");
       b uob = this.c.a9();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "3")) {
          a.p(p0, str);
          b.Z(cUSTOM_GIFT, uob.a+" registerCustomGiftInfoListener");
          uob.b(uob.a+" registerCustomGiftInfoListener");
          uob.b.add(p0);
       }
       return;
    }
    public void cc(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCustomGiftPresenter$a.class, "3")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveLogTag cUSTOM_GIFT = LiveLogTag.CUSTOM_GIFT;
       b.Z(cUSTOM_GIFT, this.b+" unregisterCustomGiftInfoListener");
       b uob = this.c.a9();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "4")) {
          a.p(p0, str);
          b.Z(cUSTOM_GIFT, uob.a+" unregisterCustomGiftInfoListener");
          uob.b(uob.a+" unregisterCustomGiftInfoListener");
          uob.b.remove(p0);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
