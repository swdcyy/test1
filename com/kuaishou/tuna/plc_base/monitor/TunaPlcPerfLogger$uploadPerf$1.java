package com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$uploadPerf$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPlcPerfLogger$uploadPerf$1 extends Lambda implements a	// class@001077
{
    public final String $logJson;

    public void TunaPlcPerfLogger$uploadPerf$1(String p0){
       this.$logJson = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPlcPerfLogger$uploadPerf$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "performance json:"+this.$logJson;
    }
}
