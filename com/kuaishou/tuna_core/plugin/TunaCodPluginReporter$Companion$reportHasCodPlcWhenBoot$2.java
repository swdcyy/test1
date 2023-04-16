package com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Boolean;

public final class TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2 extends Lambda implements a	// class@001108
{
    public final boolean $hasCodUrl;
    public final boolean $hasPlc;

    public void TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2(boolean p0,boolean p1){
       this.$hasCodUrl = p0;
       this.$hasPlc = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       i3 obj = PatchProxy.apply(null, this, TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.a("has_cod_url", Boolean.valueOf(this.$hasCodUrl));
       obj.a("has_plc", Boolean.valueOf(this.$hasPlc));
       return obj.toString();
    }
}
