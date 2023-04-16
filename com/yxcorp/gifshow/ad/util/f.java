package com.yxcorp.gifshow.ad.util.f;
import ok.x;
import java.lang.Object;
import g59.i;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class f implements x	// class@00187e
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object get(){
       return a.t().getValue("feedBackEnableConfig", InternalNegativeFeedbackConfig.class, null);
    }
}
