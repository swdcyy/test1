package com.yxcorp.plugin.search.utils.s;
import ok.x;
import java.lang.Object;
import nfd.s1;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class s implements x	// class@0007b2
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final Object get(){
       return a.t().getValue("feedBackEnableConfig", InternalNegativeFeedbackConfig.class, null);
    }
}
