package com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2 extends Lambda implements a	// class@00117c
{
    public static final LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2 INSTANCE;

    static {
       LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2.INSTANCE = new LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2();
    }
    public void LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$Companion$isGiftSlotNewStyleV2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableGiftBoothNewAnim");
    }
}
