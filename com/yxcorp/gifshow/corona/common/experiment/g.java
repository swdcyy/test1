package com.yxcorp.gifshow.corona.common.experiment.g;
import ok.x;
import java.lang.Object;
import gq9.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class g implements x	// class@0011f0
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       return a.t().getValue("feedBackEnableConfig", InternalNegativeFeedbackConfig.class, null);
    }
}
