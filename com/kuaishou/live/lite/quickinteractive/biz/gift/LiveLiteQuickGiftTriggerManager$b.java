package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$b;
import erd.g;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wa3.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger;
import wa3.d;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftModel$Trigger;
import wa3.a;
import java.lang.StringBuilder;

public final class LiveLiteQuickGiftTriggerManager$b implements g	// class@000aba
{
    public final LiveLiteQuickGiftTriggerManager b;

    public void LiveLiteQuickGiftTriggerManager$b(LiveLiteQuickGiftTriggerManager p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       long l;
       LiveLiteQuickGiftModel$Trigger threshold;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickGiftTriggerManager$b.class, "1")) {
          return;
       }
       LiveLiteQuickGiftTriggerManager$b tb = this.b;
       a.o(p0, "it");
       Objects.requireNonNull(tb);
       LiveLiteQuickGiftTriggerManager liveLiteQuic = LiveLiteQuickGiftTriggerManager.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tb, liveLiteQuic, "2")) {
          if (p0 instanceof b) {
             if (!PatchProxy.applyVoid(null, tb, liveLiteQuic, "6")) {
                b.Z(tb.a, "receive follow event");
                if (tb.b != null && tb.g == null) {
                   b.Z(tb.a, "tryShowQuickInteraction :: triggerType = 2 ");
                   LiveLiteQuickGiftTriggerManager.c(tb, 2, null, 2, null);
                   tb.b = false;
                }
             }
          }else {
             int i = 1;
             if (p0 instanceof d) {
                if (!PatchProxy.applyVoid(null, tb, liveLiteQuic, "5")) {
                   b.Z(tb.a, "receive comment event");
                   int i1 = tb.e + i;
                   tb.e = i1;
                   if (tb.c != null) {
                      l = (long)i1;
                      i1 = tb.i.get(Integer.valueOf(3));
                      threshold = (i1 != null)? i1.threshold: 0;
                      if (l - threshold >= 0) {
                         b.Z(tb.a, "tryShowQuickInteraction :: triggerType = 3 ");
                         LiveLiteQuickGiftTriggerManager.c(tb, 3, null, 2, null);
                         tb.c = false;
                      }
                   }
                }
             }else if(!p0 instanceof a || PatchProxy.applyVoidOneRefs(p0, tb, liveLiteQuic, "4")){
                b.Z(tb.a, "receive time second event "+p0.a());
                if (tb.d != null) {
                   l = (long)p0.a() * 1000;
                   p0 = tb.i.get(Integer.valueOf(i));
                   threshold = (p0 != null)? p0.threshold: 8000;
                   if (l - threshold >= 0) {
                      b.Z(tb.a, "tryShowQuickInteraction :: triggerType = 1 ");
                      LiveLiteQuickGiftTriggerManager.c(tb, i, null, 2, null);
                      tb.d = false;
                   }
                }
             }
          }
       }
    label_00ed :
       return;
    }
}
