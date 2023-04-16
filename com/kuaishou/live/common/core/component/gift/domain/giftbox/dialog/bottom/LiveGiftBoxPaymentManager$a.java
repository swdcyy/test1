package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager$a;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class LiveGiftBoxPaymentManager$a implements NetworkState$a	// class@0011fe
{
    public final LiveGiftBoxPaymentManager a;

    public void LiveGiftBoxPaymentManager$a(LiveGiftBoxPaymentManager p0){
       this.a = p0;
       super();
    }
    public final void b(int p0){
       LiveGiftBoxPaymentManager$a uoa = LiveGiftBoxPaymentManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 == 1 || p0 == 2) {
          this.a.a();
       }
       return;
    }
}
