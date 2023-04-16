package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager$b;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveGiftBoxPaymentManager$b implements g	// class@0011ff
{
    public final LiveGiftBoxPaymentManager b;

    public void LiveGiftBoxPaymentManager$b(LiveGiftBoxPaymentManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPaymentManager$b.class, "1")) {
       }else {
          p0.b = true;
       }
       return;
    }
}
