package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$powerManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.os.PowerManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class EveThermalMonitor$powerManager$2 extends Lambda implements a	// class@001538
{
    public final Context $context;

    public void EveThermalMonitor$powerManager$2(Context p0){
       this.$context = p0;
       super(0);
    }
    public final PowerManager invoke(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor$powerManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$context.getSystemService("power");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.os.PowerManager");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
