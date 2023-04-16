package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.util.List;
import vc3.l;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2$a;
import vc3.f;
import n93.b;
import n93.a;
import qrd.l1;

public final class LiveLiteQuickInteractiveConsumer implements LiveLiteGuidanceMessageQueueManager$b	// class@000acb
{
    public LiveLiteQuickInteractiveAreaViewController a;
    public final p b;
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage c;
    public final List d;
    public final l e;
    public final i f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final a h;

    public void LiveLiteQuickInteractiveConsumer(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0,List p1,l p2,i p3,LiveLiteGuidanceMessageQueueManager p4,a p5){
       a.p(p0, "message");
       a.p(p1, "itemList");
       a.p(p2, "vcFactoryHolder");
       a.p(p3, "liveLogPackageProvider");
       a.p(p4, "liteGuidanceMessageQueueService");
       a.p(p5, "liveLiteBottomBubbleService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.b = s.c(new LiveLiteQuickInteractiveConsumer$delegate$2(this));
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       LiveLiteQuickInteractiveConsumer liveLiteQuic = LiveLiteQuickInteractiveConsumer.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteQuic, "2")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteQuickInteractiveConsumer te = this.e;
       LiveLiteQuickInteractiveConsumer td = this.d;
       LiveLiteQuickInteractiveConsumer$delegate$2$a uodelegate$2 = PatchProxy.apply(null, this, liveLiteQuic, "1");
       if (uodelegate$2 == PatchProxyResult.class) {
          uodelegate$2 = this.b.getValue();
       }
       LiveLiteQuickInteractiveAreaViewController liveLiteQuic1 = new LiveLiteQuickInteractiveAreaViewController(te, td, uodelegate$2);
       b uob = this.h.get();
       if (uob != null) {
          uob.b(liveLiteQuic1);
       }
       this.a = liveLiteQuic1;
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveConsumer.class, "3")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteQuickInteractiveConsumer ta = this.a;
       if (ta != null) {
          b uob = this.h.get();
          if (uob != null) {
             uob.a(ta);
          }
          this.a = null;
       }
       return;
    }
}
