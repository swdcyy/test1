package com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.ad.AdProcess;

public final class AdNonActionbarProcess$tryFlowAwardVideo$1 extends Lambda implements a	// class@0014d8
{
    public final AdMainProcess $mainProcess;
    public final AdNonActionbarProcess this$0;

    public void AdNonActionbarProcess$tryFlowAwardVideo$1(AdNonActionbarProcess p0,AdMainProcess p1){
       this.this$0 = p0;
       this.$mainProcess = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdNonActionbarProcess$tryFlowAwardVideo$1 obj = PatchProxy.apply(null, this, AdNonActionbarProcess$tryFlowAwardVideo$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.this$0;
       AdNonActionbarProcess$tryFlowAwardVideo$1 t$mainProces = this.$mainProcess;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(t$mainProces, obj, AdNonActionbarProcess.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(f.a("enableAdNeoVideoCompliance")){
          b = false;
       }else {
          b = t$mainProces.v();
       }
       return b;
    }
}
