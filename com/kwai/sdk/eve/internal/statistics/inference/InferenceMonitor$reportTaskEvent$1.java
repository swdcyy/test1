package com.kwai.sdk.eve.internal.statistics.inference.InferenceMonitor$reportTaskEvent$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class InferenceMonitor$reportTaskEvent$1 extends Lambda implements a	// class@0015b5
{
    public final float $ratio;

    public void InferenceMonitor$reportTaskEvent$1(float p0){
       this.$ratio = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, InferenceMonitor$reportTaskEvent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Monitor#onFinish upload debug=false. ratio="+this.$ratio;
    }
}
