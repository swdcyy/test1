package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2$a;
import vc3.f;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer$delegate$2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vc3.h;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import vc3.a;
import vc3.b;
import trd.u;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteQuickInteractiveConsumer$delegate$2$a implements f	// class@000ac9
{
    public final LiveLiteQuickInteractiveConsumer$delegate$2 a;

    public void LiveLiteQuickInteractiveConsumer$delegate$2$a(LiveLiteQuickInteractiveConsumer$delegate$2 p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       b uob;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveConsumer$delegate$2$a.class, "2")) {
          return;
       }
       h a = h.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.a.this$0.f.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       String str = this.a.this$0.c.l();
       String str1 = this.a.this$0.c.g();
       String extraInfo = this.a.this$0.c.getExtraInfo();
       Objects.requireNonNull(a);
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{liveStreamPa,str,str1,extraInfo,p0};
          if (PatchProxy.applyVoid(objArray, a, oh, "1")) {
          label_0136 :
             return;
          }
       }
       a.p(liveStreamPa, "liveStreamPackage");
       a.p(str, "messageId");
       a.p(str1, "commonGuideSubBizType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_LIVE_FUN_GUIDE_EFFECT";
       i3 oi3 = i3.f();
       oi3.d("biz_type", str1);
       oi3.d("message_id", str);
       oi3.d("module_type", "LIVE_QUICK_INTERACTIVE_AREA");
       if (extraInfo != null) {
          oi3.d("extra_info", extraInfo);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uob = iterator.next().b();
             if (uob != null) {
                uArrayList.add(uob);
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             uob = iterator1.next();
             ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
             String str2 = uob.a();
             String str3 = "";
             if (str2 == null) {
                str2 = str3;
             }
             moreInfoPack.id = str2;
             str2 = uob.c();
             if (str2 != null) {
                str3 = str2;
             }
             moreInfoPack.text = str3;
             moreInfoPack.index = String.valueOf(uob.b());
             uArrayList1.add(moreInfoPack);
          }
          ClientContent$MoreInfoPackageV2[] moreInfoPack1 = new ClientContent$MoreInfoPackageV2[0];
          objArray1 = uArrayList1.toArray(moreInfoPack1);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       }else {
          objArray1 = null;
       }
       if (objArray1 != null) {
          ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
          uContentPack.batchMoreInfoPackage = uBatchMoreIn;
          uBatchMoreIn.moreInfoPackage = objArray1;
       }
       u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
       goto label_0136 ;
    }
    public void b(a p0){
       h a;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveConsumer$delegate$2$a.class, "3")) {
          return;
       }
       String str = "logData";
       a.p(p0, str);
       a = h.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.a.this$0.f.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       String str1 = this.a.this$0.c.g();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, str1, p0, a, h.class, "2")) {
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(str1, "subBizType");
          a.p(p0, str);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LITE_QUICK_ACTIVE_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("guide_biz_type", str1);
          oi3.c("quick_biz_type", Integer.valueOf(p0.a));
          if (!TextUtils.isEmpty(p0.a())) {
             oi3.d("extra_info", p0.a());
          }
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          b uob = p0.b();
          if (uob != null) {
             moreInfoPack = new ClientContent$MoreInfoPackageV2();
             String str2 = uob.a();
             String str3 = "";
             if (str2 == null) {
                str2 = str3;
             }
             moreInfoPack.id = str2;
             str2 = uob.c();
             if (str2 != null) {
                str3 = str2;
             }
             moreInfoPack.text = str3;
             moreInfoPack.index = String.valueOf(uob.b());
          }else {
             moreInfoPack = null;
          }
          int i = 1;
          if (moreInfoPack != null) {
             ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
             uContentPack.batchMoreInfoPackage = uBatchMoreIn;
             ClientContent$MoreInfoPackageV2[] moreInfoPack1 = new ClientContent$MoreInfoPackageV2[i];
             moreInfoPack1[0] = moreInfoPack;
             uBatchMoreIn.moreInfoPackage = moreInfoPack1;
          }
          u1.B(new ClickMetaData().setType(i).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveLiteQuickInteractiveConsumer$delegate$2$a.class, "1")) {
          return;
       }
       LiveLiteQuickInteractiveConsumer$delegate$2 this$0 = this.a.this$0;
       this$0.g.c(this$0.c);
       return;
    }
}
