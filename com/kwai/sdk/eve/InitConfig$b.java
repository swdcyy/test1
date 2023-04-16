package com.kwai.sdk.eve.InitConfig$b;
import sm7.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.sdk.eve.InitConfig$CoverageStatsConfig;
import nsd.u;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;

public final class InitConfig$b implements o	// class@001443
{

    public void InitConfig$b(){
       super();
    }
    public Object getValue(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, InitConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = a.t().getValue("eve_coverage_stats_config", InitConfig$CoverageStatsConfig.class, new InitConfig$CoverageStatsConfig(false, 1, objArray));
          a.o(obj, "SwitchConfigManager.getI¡­rageStatsConfig\(\)\n      \)");
       }
       return obj;
    }
}
