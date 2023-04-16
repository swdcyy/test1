package com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1 extends Lambda implements p	// class@000999
{
    public static final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1 INSTANCE;

    static {
       LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1.INSTANCE = new LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1();
    }
    public void LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final e invoke(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$frequencyConsumerSupplier$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new e();
    }
}
