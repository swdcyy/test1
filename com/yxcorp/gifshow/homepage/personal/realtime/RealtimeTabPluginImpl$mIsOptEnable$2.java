package com.yxcorp.gifshow.homepage.personal.realtime.RealtimeTabPluginImpl$mIsOptEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class RealtimeTabPluginImpl$mIsOptEnable$2 extends Lambda implements a	// class@00178c
{
    public static final RealtimeTabPluginImpl$mIsOptEnable$2 INSTANCE;

    static {
       RealtimeTabPluginImpl$mIsOptEnable$2.INSTANCE = new RealtimeTabPluginImpl$mIsOptEnable$2();
    }
    public void RealtimeTabPluginImpl$mIsOptEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, RealtimeTabPluginImpl$mIsOptEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("ksRealtimeTabPageOpt2023", false);
    }
}
