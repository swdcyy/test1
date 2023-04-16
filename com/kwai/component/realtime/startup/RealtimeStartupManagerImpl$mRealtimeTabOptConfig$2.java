package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2 extends Lambda implements a	// class@000b0a
{
    public static final RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2 INSTANCE;

    static {
       RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2.INSTANCE = new RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2();
    }
    public void RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("ksRealtimeTabOpt2023Q1", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
