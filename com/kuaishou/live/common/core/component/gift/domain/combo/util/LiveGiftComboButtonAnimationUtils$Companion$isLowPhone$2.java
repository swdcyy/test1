package com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2 extends Lambda implements a	// class@00117d
{
    public static final LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2 INSTANCE;

    static {
       LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2.INSTANCE = new LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2();
    }
    public void LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$Companion$isLowPhone$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("isLiveGiftLinkLowPhone", false);
    }
}
