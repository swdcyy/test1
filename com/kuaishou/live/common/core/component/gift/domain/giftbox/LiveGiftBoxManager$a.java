package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$a;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.k;
import ad5.a;
import ih1.f;

public final class LiveGiftBoxManager$a implements g	// class@0011c6
{
    public final LiveGiftBoxManager b;

    public void LiveGiftBoxManager$a(LiveGiftBoxManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxManager$a.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, LiveGiftBoxManager.class, "14")) {
             b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][onLoginEventMainThread]");
             p0.G.get().l();
             p0.b();
             p0.d.a();
             p0.d.e();
          }
       }
       return;
    }
}
