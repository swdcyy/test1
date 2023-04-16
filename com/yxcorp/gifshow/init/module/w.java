package com.yxcorp.gifshow.init.module.w;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class w implements x	// class@0019e1
{
    public static final w b;

    static {
       w.b = new w();
    }
    public void w(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableEmotionSDKUseOldDownloader", false));
    }
}
