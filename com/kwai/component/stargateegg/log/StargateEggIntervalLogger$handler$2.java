package com.kwai.component.stargateegg.log.StargateEggIntervalLogger$handler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ekd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger$handler$2$a;
import java.lang.Runnable;

public final class StargateEggIntervalLogger$handler$2 extends Lambda implements a	// class@000b39
{
    public static final StargateEggIntervalLogger$handler$2 INSTANCE;

    static {
       StargateEggIntervalLogger$handler$2.INSTANCE = new StargateEggIntervalLogger$handler$2();
    }
    public void StargateEggIntervalLogger$handler$2(){
       super(0);
    }
    public final y0 invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, StargateEggIntervalLogger$handler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = a.t().b("stargateEggIntervalLoggerTime", 0);
       if (l > 0) {
          objArray = new y0((l * (long)1000), StargateEggIntervalLogger$handler$2$a.b);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
