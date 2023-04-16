package com.yxcorp.gifshow.activity.share.presenter.p0;
import erd.o;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.flowfeedback.model.FlowFeedbackResult;
import java.lang.Boolean;

public final class p0 implements o	// class@00141e
{
    public static final p0 b;

    static {
       p0.b = new p0();
    }
    public void p0(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.needFlowFeedback());
    }
}
