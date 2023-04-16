package com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3 extends Lambda implements a	// class@00115a
{
    public final String $appendParamsJson$inlined;
    public final JumpUrlModel $jumpUrlModel$inlined;

    public void TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3(JumpUrlModel p0,String p1){
       this.$jumpUrlModel$inlined = p0;
       this.$appendParamsJson$inlined = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3.class, "1");
       return "append LiteKrnUrl fans_top_attribute_params: "+this.$jumpUrlModel$inlined.mLiteKrnUrl;
    }
}
