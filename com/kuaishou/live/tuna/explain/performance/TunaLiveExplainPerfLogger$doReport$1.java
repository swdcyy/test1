package com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$doReport$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class TunaLiveExplainPerfLogger$doReport$1 extends Lambda implements a	// class@000f97
{
    public final TunaLiveExplainPerfLogger this$0;

    public void TunaLiveExplainPerfLogger$doReport$1(TunaLiveExplainPerfLogger p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, TunaLiveExplainPerfLogger$doReport$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this.this$0.a);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(mRenderInfo\)");
       return obj;
    }
}
