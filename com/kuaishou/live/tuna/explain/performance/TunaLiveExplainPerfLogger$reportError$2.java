package com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$reportError$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.performance.model.TunaLiveExplainPerfInfo$RenderInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class TunaLiveExplainPerfLogger$reportError$2 extends Lambda implements a	// class@000f9a
{
    public final TunaLiveExplainPerfInfo$RenderInfo $errorInfo;

    public void TunaLiveExplainPerfLogger$reportError$2(TunaLiveExplainPerfInfo$RenderInfo p0){
       this.$errorInfo = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveExplainPerfLogger$reportError$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this.$errorInfo);
    }
}
