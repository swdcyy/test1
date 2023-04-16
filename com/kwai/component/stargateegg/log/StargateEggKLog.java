package com.kwai.component.stargateegg.log.StargateEggKLog;
import f66.i;
import com.kwai.component.stargateegg.log.StargateEggKLog$a;
import nsd.u;
import com.kwai.component.stargateegg.log.StargateEggKLog$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class StargateEggKLog extends i	// class@000b3d
{
    public static final p c;
    public static final StargateEggKLog$a d;

    static {
       StargateEggKLog.d = new StargateEggKLog$a(null);
       StargateEggKLog.c = s.c(StargateEggKLog$Companion$instance$2.INSTANCE);
    }
    public void StargateEggKLog(){
       super("StargateEgg", false);
    }
    public void StargateEggKLog(u p0){
       super("StargateEgg", false);
    }
    public static final StargateEggKLog C(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StargateEggKLog$a obj = PatchProxy.apply(null, null, StargateEggKLog.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = StargateEggKLog.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, StargateEggKLog$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = StargateEggKLog.c.getValue();
       }
       return obj1;
    }
}
