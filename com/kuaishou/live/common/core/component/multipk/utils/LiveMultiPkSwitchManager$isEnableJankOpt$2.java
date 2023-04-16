package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager$isEnableJankOpt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ec3.f;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager;

public final class LiveMultiPkSwitchManager$isEnableJankOpt$2 extends Lambda implements a	// class@0016a2
{
    public static final LiveMultiPkSwitchManager$isEnableJankOpt$2 INSTANCE;

    static {
       LiveMultiPkSwitchManager$isEnableJankOpt$2.INSTANCE = new LiveMultiPkSwitchManager$isEnableJankOpt$2();
    }
    public void LiveMultiPkSwitchManager$isEnableJankOpt$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkSwitchManager$isEnableJankOpt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.b() && LiveMultiPkSwitchManager.d.b())? true: false;
       return b;
    }
}
