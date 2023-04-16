package com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2;
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

public final class LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2 extends Lambda implements a	// class@00117e
{
    public static final LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2 INSTANCE;

    static {
       LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2.INSTANCE = new LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2();
    }
    public void LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$Companion$isMaterialResourceManagerEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveMaterialResourceManager", false);
    }
}
