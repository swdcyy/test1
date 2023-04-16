package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$giftBoxHeight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.util.Objects;
import qrd.p;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig;
import oi1.b;
import java.lang.Integer;

public final class LiveGiftBoxConfig$giftBoxHeight$2 extends Lambda implements a	// class@0011d5
{
    public final LiveGiftBoxConfig this$0;

    public void LiveGiftBoxConfig$giftBoxHeight$2(LiveGiftBoxConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveGiftPanelConfig obj = PatchProxy.apply(objArray, this, LiveGiftBoxConfig$giftBoxHeight$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0.c();
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(objArray, obj, LiveGiftPanelConfig.class, "2");
       if (number == patchProxyRe) {
          number = obj.o.getValue();
       }
       int i = number.intValue();
       LiveGiftBottomBarConfig liveGiftBott = this.this$0.b();
       Objects.requireNonNull(liveGiftBott);
       Number number1 = PatchProxy.apply(objArray, liveGiftBott, LiveGiftBottomBarConfig.class, "1");
       if (number1 == patchProxyRe) {
          number1 = liveGiftBott.c.getValue();
       }
       return ((i + number1.intValue()) + this.this$0.e().c);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
