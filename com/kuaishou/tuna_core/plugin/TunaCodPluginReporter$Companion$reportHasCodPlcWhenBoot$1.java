package com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1 extends Lambda implements a	// class@001107
{
    public final boolean $hasCodUrl;
    public final boolean $hasPlc;

    public void TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1(boolean p0,boolean p1){
       this.$hasPlc = p0;
       this.$hasCodUrl = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "first photo plc: "+this.$hasPlc+", is cod url:"+this.$hasCodUrl;
    }
}
