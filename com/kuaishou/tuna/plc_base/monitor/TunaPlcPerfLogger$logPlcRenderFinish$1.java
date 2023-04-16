package com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$logPlcRenderFinish$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPlcPerfLogger$logPlcRenderFinish$1 extends Lambda implements a	// class@001076
{
    public final long $startRenderTime;
    public final String $viewStyle;

    public void TunaPlcPerfLogger$logPlcRenderFinish$1(String p0,long p1){
       this.$viewStyle = p0;
       this.$startRenderTime = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPlcPerfLogger$logPlcRenderFinish$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "performance error! viewStyle:"+this.$viewStyle+", startRenderTime:"+this.$startRenderTime;
    }
}
