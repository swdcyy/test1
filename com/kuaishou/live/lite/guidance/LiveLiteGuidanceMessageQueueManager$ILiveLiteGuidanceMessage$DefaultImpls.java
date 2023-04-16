package com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import msd.p;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1;

public final class LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls	// class@000998
{

    public static String a(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "message{"+"subBizType: "+p0.g()+";"+"messageId: "+p0.l()+";"+"showDuration: "+p0.e()+";"+"validShowingStartTimeStamp: "+p0.c()+";"+"validShowingEndTimeStamp: "+p0.b()+";"+"}";
       a.o(str, "StringBuilder\(\)\n        бн\(\"}\"\)\n        .toString\(\)");
       return str;
    }
    public static p b(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1.INSTANCE;
    }
}
