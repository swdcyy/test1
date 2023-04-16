package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import mb3.f;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import mb3.b;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer$delegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer$delegate$2$a;
import java.util.Objects;
import n93.a;
import java.util.Map;
import mb3.a;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import mb3.c;
import n93.b;
import mb3.h;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mb3.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import qrd.l1;

public final class LiveLiteHighFrequencyGuideConsumer implements LiveLiteGuidanceMessageQueueManager$b	// class@0009a6
{
    public a a;
    public final p b;
    public final f c;
    public final LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage d;
    public final b e;
    public final i f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final a h;

    public void LiveLiteHighFrequencyGuideConsumer(f p0,LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p1,b p2,i p3,LiveLiteGuidanceMessageQueueManager p4,a p5){
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
       this.b = s.c(new LiveLiteHighFrequencyGuideConsumer$delegate$2(this));
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       h a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteHighFrequencyGuideConsumer liveLiteHigh = LiveLiteHighFrequencyGuideConsumer.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteHigh, str)) {
          return;
       }
       a.p(p0, "message");
       LiveLiteHighFrequencyGuideConsumer te = this.e;
       LiveLiteHighFrequencyGuideConsumer tc = this.c;
       Object[] objArray = null;
       String str1 = "1";
       LiveLiteHighFrequencyGuideConsumer$delegate$2$a uodelegate$2 = PatchProxy.apply(objArray, this, liveLiteHigh, str1);
       if (uodelegate$2 == patchProxyRe) {
          uodelegate$2 = this.b.getValue();
       }
       Objects.requireNonNull(te);
       a uoa = PatchProxy.applyTwoRefs(tc, uodelegate$2, te, b.class, str);
       if (uoa != patchProxyRe) {
       }else {
          a.p(tc, "areaData");
          a.p(uodelegate$2, "delegate");
          a uoa1 = te.a.get(tc.a);
          if (uoa1 != null) {
             Object[] objArray2 = Result.constructor-impl(uoa1);
             Throwable throwable = Result.exceptionOrNull-impl(objArray2);
             if (throwable != null) {
                b.Z(LiveLiteLogTag.HIGH_FREQUENCY, "LiveLiteHighFrequencyGuideAreaViewControllerFactory#getViewController "+throwable);
                objArray2 = objArray;
             }
             if (objArray2 != null) {
                uoa = objArray2.a(tc, uodelegate$2);
             }
          }
          uoa = objArray;
       }
       if (uoa != null) {
          b uob = this.h.get();
          if (uob != null) {
             uob.b(uoa);
          }
          a = h.a;
          e0 page = this.f.getPage();
          a.o(page, "liveLogPackageProvider.page");
          FeedLogCtx uFeedLogCtx = this.f.c0();
          ClientContent$LiveStreamPackage liveStreamPa = this.f.a();
          a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
          String str2 = p0.l();
          String str3 = p0.g();
          g og = this.c.b();
          Objects.requireNonNull(a);
          if (PatchProxy.isSupport(h.class)) {
             Object[] objArray1 = new Object[]{page,uFeedLogCtx,liveStreamPa,str2,str3,og};
             if (PatchProxy.applyVoid(objArray1, a, h.class, str1)) {
             label_014b :
                objArray = uoa;
             }
          }
          a.p(page, "logPage");
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(str2, "messageId");
          a.p(str3, "commonGuideSubBizType");
          a.p(og, "logData");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LITE_LIVE_FUN_GUIDE_EFFECT";
          i3 oi3 = i3.f();
          oi3.d("biz_type", str3);
          oi3.d("message_id", str2);
          oi3.d("module_type", "LITE_HIGH_FREQUENCY_ACTION");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setLogPage(page).setFeedLogCtx(uFeedLogCtx).setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
          goto label_014b ;
       }
       this.a = objArray;
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHighFrequencyGuideConsumer.class, "3")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteHighFrequencyGuideConsumer ta = this.a;
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
