package com.kwai.component.stargateegg.log.StargateEggKLog$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.log.StargateEggKLog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class StargateEggKLog$Companion$instance$2 extends Lambda implements a	// class@000b3b
{
    public static final StargateEggKLog$Companion$instance$2 INSTANCE;

    static {
       StargateEggKLog$Companion$instance$2.INSTANCE = new StargateEggKLog$Companion$instance$2();
    }
    public void StargateEggKLog$Companion$instance$2(){
       super(0);
    }
    public final StargateEggKLog invoke(){
       Object obj = PatchProxy.apply(null, this, StargateEggKLog$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StargateEggKLog(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
