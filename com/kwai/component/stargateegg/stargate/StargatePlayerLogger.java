package com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger$safeRun$1;
import com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread;

public final class StargatePlayerLogger	// class@000b48
{
    public JSONObject a;
    public ClientEvent$UrlPackage b;
    public final l c;
    public static final StargatePlayerLogger$a d;

    static {
       StargatePlayerLogger.d = new StargatePlayerLogger$a(null);
    }
    public void StargatePlayerLogger(l p0){
       a.p(p0, "logCatcher");
       super();
       this.c = p0;
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StargatePlayerLogger.class, "9")) {
          return;
       }
       StargateEggPlayerRunSafeThread.b(new StargatePlayerLogger$safeRun$1(p0), this.c);
       return;
    }
}
