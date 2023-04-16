package com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$report$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveNoticePerfLogger$report$1 extends Lambda implements a	// class@00115f
{
    public final String $logJson;

    public void TunaLiveNoticePerfLogger$report$1(String p0){
       this.$logJson = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveNoticePerfLogger$report$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "tuna notice performance info:"+this.$logJson;
    }
}
