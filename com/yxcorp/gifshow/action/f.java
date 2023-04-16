package com.yxcorp.gifshow.action.f;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.action.i;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.action.config.live.LiveRerankRealActionKSwitchConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class f implements x	// class@00131f
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object get(){
       return a.t().getValue("liveRerankStartupConfig", LiveRerankRealActionKSwitchConfig.class, null);
    }
}
