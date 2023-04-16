package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$e;
import qa3.a;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import java.lang.Object;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;

public final class LiveLiteQuickInteractiveCommonTriggerManager$e implements a	// class@000aaf
{
    public final LiveLiteQuickInteractiveCommonTriggerManager a;

    public void LiveLiteQuickInteractiveCommonTriggerManager$e(LiveLiteQuickInteractiveCommonTriggerManager p0){
       this.a = p0;
       super();
    }
    public final void a(LiveLiteDelayInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveCommonTriggerManager$e.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.mSCLiveQuickInteractiveAreas;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI = iterator.next();
             a.o(sCLiveQuickI, "area");
             this.a.a(sCLiveQuickI, true);
          }
       }
       return;
    }
}
