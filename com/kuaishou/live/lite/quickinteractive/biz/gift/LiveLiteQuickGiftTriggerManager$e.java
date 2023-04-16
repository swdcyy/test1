package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$e;
import lf3.g;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lf3.f;

public final class LiveLiteQuickGiftTriggerManager$e implements g	// class@000abd
{
    public final LiveLiteQuickGiftTriggerManager b;

    public void LiveLiteQuickGiftTriggerManager$e(LiveLiteQuickGiftTriggerManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickGiftTriggerManager$e.class, "1")) {
       }else {
          LiveLiteQuickGiftTriggerManager$e tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLiteQuickGiftTriggerManager.class, "3")) {
             tb.b(p0.triggerType, p0);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
