package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;

public final class LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1 extends Lambda implements p	// class@0008e3
{
    public final LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1 this$0;

    public void LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1(LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.this$0.e.Z2(p1);
    }
}
