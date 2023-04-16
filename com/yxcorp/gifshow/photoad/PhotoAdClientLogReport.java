package com.yxcorp.gifshow.photoad.PhotoAdClientLogReport;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$mWhiteList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$b;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public final class PhotoAdClientLogReport	// class@000f67
{
    public static final List a;
    public static final List b;
    public static final p c;
    public static final PhotoAdClientLogReport d;

    static {
       PhotoAdClientLogReport.d = new PhotoAdClientLogReport();
       Integer[] integerArray = new Integer[]{Integer.valueOf(241),Integer.valueOf(531),Integer.valueOf(729),Integer.valueOf(808),Integer.valueOf(738),Integer.valueOf(5)};
       PhotoAdClientLogReport.a = CollectionsKt__CollectionsKt.P(integerArray);
       integerArray = new Integer[]{Integer.valueOf(2)};
       PhotoAdClientLogReport.b = CollectionsKt__CollectionsKt.P(integerArray);
       PhotoAdClientLogReport.c = s.c(PhotoAdClientLogReport$mWhiteList$2.INSTANCE);
    }
    public void PhotoAdClientLogReport(){
       super();
    }
    public static final void b(BaseFeed p0,int p1){
       PhotoAdClientLogReport photoAdClien = PhotoAdClientLogReport.class;
       if (PatchProxy.isSupport(photoAdClien) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, photoAdClien, "3")) {
          return;
       }
       a.p(p0, "baseFeed");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AD_LOG_GENERAL_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("area", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1);
       uClickMetaDa.setElementPackage(uElementPack);
       uClickMetaDa.setContentPackage(uContentPack);
       uClickMetaDa.setFeedLogCtx(r1.O0(p0));
       u1.B(uClickMetaDa);
       return;
    }
    public static final void c(BaseFeed p0,int p1){
       PhotoAdClientLogReport photoAdClien = PhotoAdClientLogReport.class;
       if (PatchProxy.isSupport(photoAdClien) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, photoAdClien, "4")) {
          return;
       }
       a.p(p0, "baseFeed");
       k1.r(new PhotoAdClientLogReport$b(p0, p1), 0);
       return;
    }
    public final PhotoAdClientLogReport$a a(){
       Object obj = PatchProxy.apply(null, this, PhotoAdClientLogReport.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdClientLogReport.c.getValue();
    }
    public final void d(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdClientLogReport.class, "5")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti != null) {
          int i = (photoAdverti.mReportClientLogType == null)? 1: 0;
          if (!i) {
             photoAdverti = null;
          }
          if (photoAdverti != null) {
             photoAdverti.mReportClientLogType = 1;
          }
       }
       return;
    }
}
