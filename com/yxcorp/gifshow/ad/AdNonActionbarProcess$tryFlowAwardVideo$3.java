package com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.AdProcess;

public final class AdNonActionbarProcess$tryFlowAwardVideo$3 extends Lambda implements a	// class@0014da
{
    public final AdMainProcess $mainProcess;

    public void AdNonActionbarProcess$tryFlowAwardVideo$3(AdMainProcess p0){
       this.$mainProcess = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AdNonActionbarProcess$tryFlowAwardVideo$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.$mainProcess.u();
    }
}
