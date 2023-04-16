package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$b;
import hka.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveGiftBoxManager$b implements a	// class@0011c7
{
    public final LiveGiftBoxManager b;

    public void LiveGiftBoxManager$b(LiveGiftBoxManager p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       LiveGiftBoxManager$b obj = PatchProxy.apply(null, this, LiveGiftBoxManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.c == null) {
          return false;
       }
       obj.b();
       return true;
    }
}
