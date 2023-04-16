package com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import wg3.a;

public final class LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2 extends Lambda implements a	// class@000d1a
{
    public static final LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2 INSTANCE;

    static {
       LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2.INSTANCE = new LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2();
    }
    public void LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2(){
       super(0);
    }
    public final LiveConfigStartupResponse$LiveLiteRecoGuideConfig invoke(){
       Object obj = PatchProxy.apply(null, this, LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.w(LiveConfigStartupResponse$LiveLiteRecoGuideConfig.class);
    }
    public Object invoke(){
       return this.invoke();
    }
}
