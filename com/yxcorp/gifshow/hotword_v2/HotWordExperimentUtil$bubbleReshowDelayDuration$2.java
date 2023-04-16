package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$bubbleReshowDelayDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class HotWordExperimentUtil$bubbleReshowDelayDuration$2 extends Lambda implements a	// class@0018f8
{
    public static final HotWordExperimentUtil$bubbleReshowDelayDuration$2 INSTANCE;

    static {
       HotWordExperimentUtil$bubbleReshowDelayDuration$2.INSTANCE = new HotWordExperimentUtil$bubbleReshowDelayDuration$2();
    }
    public void HotWordExperimentUtil$bubbleReshowDelayDuration$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil$bubbleReshowDelayDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("bubbleReshowDelayDuration", 500);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
