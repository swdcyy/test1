package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$c;
import erd.g;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import kotlin.jvm.internal.a;

public final class LiveLiteQuickInteractiveCommonTriggerManager$c implements g	// class@000aad
{
    public final LiveLiteQuickInteractiveCommonTriggerManager b;

    public void LiveLiteQuickInteractiveCommonTriggerManager$c(LiveLiteQuickInteractiveCommonTriggerManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveCommonTriggerManager$c.class, "1")) {
       }else {
          p0 = p0.mSCLiveQuickInteractiveAreas;
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI = p0.next();
                a.o(sCLiveQuickI, "area");
                this.b.a(sCLiveQuickI, false);
             }
          }
       }
       return;
    }
}
