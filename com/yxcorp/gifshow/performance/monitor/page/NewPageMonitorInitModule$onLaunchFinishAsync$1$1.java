package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$onLaunchFinishAsync$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uwb.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NewPageMonitorInitModule$onLaunchFinishAsync$1$1 extends Lambda implements a	// class@000eb3
{
    public final a $it;

    public void NewPageMonitorInitModule$onLaunchFinishAsync$1$1(a p0){
       this.$it = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NewPageMonitorInitModule$onLaunchFinishAsync$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d(this.$it.kSwitchKey, false);
    }
}
