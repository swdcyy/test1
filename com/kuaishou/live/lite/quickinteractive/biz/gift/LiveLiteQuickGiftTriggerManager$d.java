package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$d;
import qa3.a;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import java.lang.Object;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;

public final class LiveLiteQuickGiftTriggerManager$d implements a	// class@000abc
{
    public final LiveLiteQuickGiftTriggerManager a;

    public void LiveLiteQuickGiftTriggerManager$d(LiveLiteQuickGiftTriggerManager p0){
       this.a = p0;
       super();
    }
    public final void a(LiveLiteDelayInfoResponse p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickGiftTriggerManager$d.class, "1")) {
          return;
       }
       a.p(p0, "response");
       p0 = p0.mSCLiveQuickInteractiveAreas;
       if (p0 != null) {
          a.o(p0, "response.mSCLiveQuickInteractiveAreas");
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                int i = 1;
                if (obj.bizType != i) {
                   i = 0;
                }
                if (!i) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null) {
                this.a.a(obj);
                break ;
             }
          }
       }
       return;
    }
}
