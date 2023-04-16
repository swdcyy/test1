package com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager$b;
import hi1.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import kotlin.jvm.internal.a;
import xp5.g;

public final class LiveGiftEffectManager$b implements a	// class@001190
{
    public final LiveGiftEffectManager a;

    public void LiveGiftEffectManager$b(LiveGiftEffectManager p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, LiveGiftEffectManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.h.a();
       a.o(obj, "logPackageProvider.liveStreamPackage");
       return obj;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, LiveGiftEffectManager$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.C(this.a.i.d(), "");
    }
    public String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, LiveGiftEffectManager$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.i.getLiveStreamId();
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
}
