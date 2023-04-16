package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Objects;

public final class TunaExplainFetchDataBridge$invoke$task$1$1 extends Lambda implements a	// class@000faa
{
    public final String $resultString;
    public final TunaExplainFetchDataBridge$invoke$task$1 this$0;

    public void TunaExplainFetchDataBridge$invoke$task$1$1(TunaExplainFetchDataBridge$invoke$task$1 p0,String p1){
       this.this$0 = p0;
       this.$resultString = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaExplainFetchDataBridge$invoke$task$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.this$0.b);
       return "execute bridge "+"fetchTunaLiveExplainContext"+", params:"+this.this$0.d+", result:"+this.$resultString;
    }
}
