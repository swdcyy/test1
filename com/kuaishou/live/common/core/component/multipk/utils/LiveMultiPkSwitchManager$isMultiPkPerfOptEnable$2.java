package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2;
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

public final class LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2 extends Lambda implements a	// class@0016a4
{
    public static final LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2 INSTANCE;

    static {
       LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2.INSTANCE = new LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2();
    }
    public void LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("liveMultiPkPerfOpt", false);
    }
}
