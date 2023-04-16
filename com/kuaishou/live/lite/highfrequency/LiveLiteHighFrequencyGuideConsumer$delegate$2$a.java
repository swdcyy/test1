package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer$delegate$2$a;
import mb3.c;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer$delegate$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import mb3.h;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer;
import k2b.e0;
import xp5.i;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import mb3.g;
import mb3.f;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import qrd.l1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteHighFrequencyGuideConsumer$delegate$2$a implements c	// class@0009a4
{
    public final LiveLiteHighFrequencyGuideConsumer$delegate$2 a;

    public void LiveLiteHighFrequencyGuideConsumer$delegate$2$a(LiveLiteHighFrequencyGuideConsumer$delegate$2 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveLiteHighFrequencyGuideConsumer$delegate$2$a uodelegate$2 = LiveLiteHighFrequencyGuideConsumer$delegate$2$a.class;
       String str = "2";
       if (PatchProxy.isSupport(uodelegate$2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uodelegate$2, str)) {
          return;
       }
       h a = h.a;
       e0 page = this.a.this$0.f.getPage();
       a.o(page, "liveLogPackageProvider.page");
       FeedLogCtx uFeedLogCtx = this.a.this$0.f.c0();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.this$0.f.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.a.this$0.f.b4();
       g og = this.a.this$0.c.b();
       Objects.requireNonNull(a);
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{page,uFeedLogCtx,liveStreamPa,liveVoicePar,Integer.valueOf(p0),og};
          if (PatchProxy.applyVoid(objArray, a, oh, str)) {
          label_0109 :
             return;
          }
       }
       a.p(page, "logPage");
       a.p(liveStreamPa, "liveStreamPackage");
       a.p(og, "logData");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_FREQUENTLY_ACTION_GUIDE_BUBBLE";
       i3 oi3 = i3.f();
       oi3.d("biz_id", og.a);
       if (!TextUtils.isEmpty(og.a())) {
          oi3.d("business_params", og.a());
       }
       oi3.c("count", Integer.valueOf(p0));
       oi3.d("style", og.d);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.liveVoicePartyPackage = liveVoicePar;
       if (og.b() > 0) {
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          giftPackage.identity = String.valueOf(og.b());
          uContentPack.giftPackage = giftPackage;
       }
       u1.B(new ClickMetaData().setLogPage(page).setFeedLogCtx(uFeedLogCtx).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       goto label_0109 ;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveLiteHighFrequencyGuideConsumer$delegate$2$a.class, "1")) {
          return;
       }
       LiveLiteHighFrequencyGuideConsumer$delegate$2 this$0 = this.a.this$0;
       this$0.g.c(this$0.d);
       return;
    }
}
