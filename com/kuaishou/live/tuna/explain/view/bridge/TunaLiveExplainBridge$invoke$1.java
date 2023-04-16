package com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge$invoke$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveExplainBridge$invoke$1 extends Lambda implements a	// class@000fa7
{
    public final String $functionName;
    public final TunaLiveExplainMessage $message;

    public void TunaLiveExplainBridge$invoke$1(String p0,TunaLiveExplainMessage p1){
       this.$functionName = p0;
       this.$message = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveExplainBridge$invoke$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "bridge invoke "+this.$functionName+", explain message:"+this.$message;
    }
}
