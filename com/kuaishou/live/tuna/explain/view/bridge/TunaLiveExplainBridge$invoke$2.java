package com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge$invoke$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveExplainBridge$invoke$2 extends Lambda implements a	// class@000fa8
{
    public final String $functionName;
    public final String $jsonData;

    public void TunaLiveExplainBridge$invoke$2(String p0,String p1){
       this.$functionName = p0;
       this.$jsonData = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveExplainBridge$invoke$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NULL bridge invoke "+this.$functionName+", params:"+this.$jsonData;
    }
}
