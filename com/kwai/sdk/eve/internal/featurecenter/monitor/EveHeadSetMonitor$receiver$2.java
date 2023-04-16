package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveHeadSetMonitor$receiver$2 extends Lambda implements a	// class@001524
{
    public final EveHeadSetMonitor this$0;

    public void EveHeadSetMonitor$receiver$2(EveHeadSetMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveHeadSetMonitor$receiver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveHeadSetMonitor$receiver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveHeadSetMonitor$receiver$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
