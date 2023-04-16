package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2$1;
import f93.b;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ia3.c;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import f93.e;
import f93.f;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2$1$logClickEvent$1;
import msd.l;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteBenefitCardConsumer$delegate$2$1 implements b	// class@001e9d
{
    public final LiveLiteBenefitCardConsumer$delegate$2 a;

    public void LiveLiteBenefitCardConsumer$delegate$2$1(LiveLiteBenefitCardConsumer$delegate$2 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveLiteBenefitCardConsumer$delegate$2$1 uodelegate$2 = LiveLiteBenefitCardConsumer$delegate$2$1.class;
       if (PatchProxy.isSupport(uodelegate$2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uodelegate$2, "2")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.this$0.f.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       c.a.a(liveStreamPa, this.a.this$0.d.g(), p0, this.a.this$0.c.c.a, LiveLiteBenefitCardConsumer$delegate$2$1$logClickEvent$1.INSTANCE);
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBenefitCardConsumer$delegate$2$1.class, "1")) {
          return;
       }
       LiveLiteBenefitCardConsumer$delegate$2 this$0 = this.a.this$0;
       this$0.g.c(this$0.d);
       return;
    }
}
