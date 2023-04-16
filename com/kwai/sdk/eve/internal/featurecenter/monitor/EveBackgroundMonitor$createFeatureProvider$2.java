package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$createFeatureProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveBackgroundMonitor$createFeatureProvider$2 extends Lambda implements a	// class@001512
{
    public final EveBackgroundMonitor this$0;

    public void EveBackgroundMonitor$createFeatureProvider$2(EveBackgroundMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EveBackgroundMonitor$createFeatureProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.this$0.foregroundDuration());
    }
}
