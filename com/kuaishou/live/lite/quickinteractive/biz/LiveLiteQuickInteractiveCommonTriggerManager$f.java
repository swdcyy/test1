package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$f;
import erd.g;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteQuickInteractiveCommonTriggerManager$f implements g	// class@000ab0
{
    public final LiveLiteQuickInteractiveCommonTriggerManager b;
    public final LiveQuickInteractiveArea$SCLiveQuickInteractiveArea c;

    public void LiveLiteQuickInteractiveCommonTriggerManager$f(LiveLiteQuickInteractiveCommonTriggerManager p0,LiveQuickInteractiveArea$SCLiveQuickInteractiveArea p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveCommonTriggerManager$f.class, "1")) {
       }else {
          this.b.b(this.c);
       }
       return;
    }
}
