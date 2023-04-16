package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager$isEnableScatterTwoPhase$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager$isEnableJankOpt$2;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveMultiPkSwitchManager	// class@0016a5
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final LiveMultiPkSwitchManager d;

    static {
       LiveMultiPkSwitchManager.d = new LiveMultiPkSwitchManager();
       LiveMultiPkSwitchManager.a = s.c(LiveMultiPkSwitchManager$isEnableScatterTwoPhase$2.INSTANCE);
       LiveMultiPkSwitchManager.b = s.c(LiveMultiPkSwitchManager$isEnableJankOpt$2.INSTANCE);
       LiveMultiPkSwitchManager.c = s.c(LiveMultiPkSwitchManager$isMultiPkPerfOptEnable$2.INSTANCE);
    }
    public void LiveMultiPkSwitchManager(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkSwitchManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiveMultiPkSwitchManager.a.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkSwitchManager.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = LiveMultiPkSwitchManager.c.getValue();
       }
       return obj.booleanValue();
    }
}
