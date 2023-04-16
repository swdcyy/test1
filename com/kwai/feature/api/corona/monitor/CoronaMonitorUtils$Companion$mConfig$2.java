package com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$Companion$mConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import wl5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class CoronaMonitorUtils$Companion$mConfig$2 extends Lambda implements a	// class@000e17
{
    public static final CoronaMonitorUtils$Companion$mConfig$2 INSTANCE;

    static {
       CoronaMonitorUtils$Companion$mConfig$2.INSTANCE = new CoronaMonitorUtils$Companion$mConfig$2();
    }
    public void CoronaMonitorUtils$Companion$mConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       a obj = PatchProxy.apply(null, this, CoronaMonitorUtils$Companion$mConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.t().getValue("CoronaLogMonitorConfig", a.class, new a());
       }catch(java.lang.Exception e0){
          obj = new a();
       }
       return obj;
    }
}
