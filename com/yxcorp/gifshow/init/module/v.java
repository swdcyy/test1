package com.yxcorp.gifshow.init.module.v;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class v implements x	// class@0019df
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableEmotionSDKMonitor", false));
    }
}
