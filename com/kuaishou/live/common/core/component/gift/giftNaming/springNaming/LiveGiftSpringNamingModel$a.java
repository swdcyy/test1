package com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$a;
import erd.g;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveGiftSpringNamingModel$a implements g	// class@0012c3
{
    public final LiveGiftSpringNamingModel b;

    public void LiveGiftSpringNamingModel$a(LiveGiftSpringNamingModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSpringNamingModel$a.class, "1")) {
       }else {
          this.b.f(p0.mSpringCeremonyNamingData);
       }
       return;
    }
}
