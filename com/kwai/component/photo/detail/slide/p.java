package com.kwai.component.photo.detail.slide.p;
import ok.x;
import java.lang.Object;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class p implements x	// class@000a88
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object get(){
       return a.t().getValue("feedBackEnableConfig", InternalNegativeFeedbackConfig.class, null);
    }
}
