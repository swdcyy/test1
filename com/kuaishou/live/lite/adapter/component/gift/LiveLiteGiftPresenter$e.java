package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$e;
import jm1.c;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import java.lang.String;
import rw1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;

public final class LiveLiteGiftPresenter$e implements c	// class@001db0
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$e(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "rechargeSource");
       LiveLiteGiftPresenter z = this.a.Z;
       if (z != null) {
          LiveGiftRechargeManager liveGiftRech = z.g();
          if (liveGiftRech != null) {
             liveGiftRech.a(p0, p1);
          }
       }
       return;
    }
}
