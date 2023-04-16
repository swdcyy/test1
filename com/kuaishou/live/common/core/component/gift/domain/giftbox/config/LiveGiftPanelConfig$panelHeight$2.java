package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$panelHeight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import qrd.p;
import java.lang.Integer;

public final class LiveGiftPanelConfig$panelHeight$2 extends Lambda implements a	// class@0011dc
{
    public final LiveGiftPanelConfig this$0;

    public void LiveGiftPanelConfig$panelHeight$2(LiveGiftPanelConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveGiftPanelConfig$panelHeight$2 obj = PatchProxy.apply(objArray, this, LiveGiftPanelConfig$panelHeight$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(objArray, obj, LiveGiftPanelConfig.class, "1");
       if (number == patchProxyRe) {
          number = obj.m.getValue();
       }
       return (number.intValue() + this.this$0.n);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
