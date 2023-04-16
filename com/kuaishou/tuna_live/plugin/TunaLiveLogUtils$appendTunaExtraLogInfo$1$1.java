package com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraLogInfo$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveLogUtils$appendTunaExtraLogInfo$1$1 extends Lambda implements a	// class@00115b
{
    public final Map $params;

    public void TunaLiveLogUtils$appendTunaExtraLogInfo$1$1(Map p0){
       this.$params = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveLogUtils$appendTunaExtraLogInfo$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "tuna_extra_info_for_live: "+this.$params.get("tuna_extra_info_for_live");
    }
}
