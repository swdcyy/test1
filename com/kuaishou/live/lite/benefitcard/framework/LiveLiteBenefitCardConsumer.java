package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import f93.e;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import f93.d;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2$1;
import java.util.Objects;
import n93.a;
import java.util.Map;
import f93.a;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import f93.b;
import n93.b;
import qrd.l1;

public final class LiveLiteBenefitCardConsumer implements LiveLiteGuidanceMessageQueueManager$b	// class@001e9f
{
    public a a;
    public final p b;
    public final e c;
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage d;
    public final d e;
    public final i f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final a h;

    public void LiveLiteBenefitCardConsumer(e p0,LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p1,d p2,i p3,LiveLiteGuidanceMessageQueueManager p4,a p5){
       a.p(p0, "areaData");
       a.p(p1, "message");
       a.p(p2, "vcFactory");
       a.p(p3, "liveLogPackageProvider");
       a.p(p4, "liveLiteGuidanceMessageQueueManager");
       a.p(p5, "bottomBubbleService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.b = s.c(new LiveLiteBenefitCardConsumer$delegate$2(this));
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteBenefitCardConsumer liveLiteBene = LiveLiteBenefitCardConsumer.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteBene, str)) {
          return;
       }
       a.p(p0, "message");
       LiveLiteBenefitCardConsumer te = this.e;
       LiveLiteBenefitCardConsumer tc = this.c;
       Object[] objArray = null;
       LiveLiteBenefitCardConsumer$delegate$2$1 uodelegate$2 = PatchProxy.apply(objArray, this, liveLiteBene, "1");
       if (uodelegate$2 == patchProxyRe) {
          uodelegate$2 = this.b.getValue();
       }
       Objects.requireNonNull(te);
       a uoa = PatchProxy.applyTwoRefs(tc, uodelegate$2, te, d.class, str);
       if (uoa != patchProxyRe) {
       }else {
          a.p(tc, "areaData");
          a.p(uodelegate$2, "delegate");
          a uoa1 = te.a.get(tc.a);
          if (uoa1 != null) {
             Object[] objArray1 = Result.constructor-impl(uoa1);
             Throwable throwable = Result.exceptionOrNull-impl(objArray1);
             if (throwable != null) {
                b.Z(LiveLiteLogTag.BENEFIT_CARD, "LiveLiteBenefitCardVcFactory#getViewController "+throwable);
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                uoa = objArray1.a(tc, uodelegate$2);
             }
          }
          uoa = objArray;
       }
       if (uoa != null) {
          b uob = this.h.get();
          if (uob != null) {
             uob.b(uoa);
          }
          objArray = uoa;
       }
       this.a = objArray;
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBenefitCardConsumer.class, "3")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteBenefitCardConsumer ta = this.a;
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
