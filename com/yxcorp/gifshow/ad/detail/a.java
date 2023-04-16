package com.yxcorp.gifshow.ad.detail.a;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import mxb.j0;
import nxb.h0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Objects;
import java.lang.Number;
import java.util.Map;
import java.lang.Long;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import o29.a;
import java.util.HashMap;
import wkd.b;
import com.yxcorp.gifshow.ad.neo.b;
import g59.g$a;
import g59.g;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import sy8.i;
import mxb.f0;

public final class a implements g	// class@001543
{
    public final String b;

    public void a(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       long l1;
       String str1;
       long l2;
       long l3;
       NeoAppAdvanceReportUtil a;
       a b = this.b;
       APKDownloadTask uAPKDownload = p0;
       PhotoApkDownloadTaskInfo taskInfo = uAPKDownload.getTaskInfo();
       if (taskInfo != null) {
          PhotoApkDownloadTaskInfo mAdDataWrapp = taskInfo.mAdDataWrapper;
          g$a obj = null;
          if (mAdDataWrapp != null) {
             a.p(mAdDataWrapp, "adDataWrapper");
             boolean b1 = false;
             if (a.t().d("enablePecAutoRequestWhenAdInvisible", b1)) {
                BaseFeed photo = mAdDataWrapp.getPhoto();
                if (photo != null) {
                   a.o(photo, "adDataWrapper.photo ?: return");
                   PhotoAdvertisement photoAdverti = photo.get("AD");
                   if (photoAdverti != null) {
                      a = NeoAppAdvanceReportUtil.a;
                      PhotoAdvertisement$NeoReportInfo neoReportInf = a.a(photoAdverti);
                      if (neoReportInf != null && (neoReportInf.mType == 3 && a.b(neoReportInf))) {
                         b1 = true;
                      }
                   label_0054 :
                      if (!b1) {
                         photoAdverti = obj;
                      }
                      if (photoAdverti != null) {
                         a.e(photoAdverti, photo);
                      }
                   }
                }
             }
          }
          j0 oj0 = AppInstalledReceiver.a(taskInfo, mAdDataWrapp);
          h0 oh0 = h0.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String str = PatchProxy.applyOneRefs(b, obj, AppInstalledReceiver.class, "10");
          if (str != patchProxyRe) {
          }else {
             long l = System.currentTimeMillis();
             h0 oh01 = h0.a();
             Objects.requireNonNull(oh01);
             Object obj1 = PatchProxy.applyOneRefs(b, oh01, oh0, "2");
             if (obj1 != patchProxyRe) {
                l1 = obj1.longValue();
             }else {
                Long longx2 = oh01.a.get(b);
                l1 = (longx2 != null)? longx2.longValue(): 0;
             }
             TimeUnit mINUTES = TimeUnit.MINUTES;
             if (Math.abs((l - l1)) - mINUTES.toMillis(3) < 0) {
                h0 oh02 = h0.a();
                Objects.requireNonNull(oh02);
                if (!PatchProxy.applyVoidOneRefs(b, oh02, oh0, "3")) {
                   oh02.a.remove(b);
                }
                str1 = "recall";
             }else {
                l = System.currentTimeMillis();
                b obj2 = PatchProxy.applyOneRefs(b, obj, a.class, "1");
                if (obj2 != patchProxyRe) {
                   l2 = obj2.longValue();
                }else {
                   Long longx1 = a.a.get(b);
                   l2 = (longx1 != null)? longx1.longValue(): 0;
                }
                if (Math.abs((l - l2)) - mINUTES.toMillis(3) < 0) {
                   a.b(b);
                   str1 = "download_management";
                }else {
                   l = System.currentTimeMillis();
                   obj2 = b.a(0x7d11f1b4);
                   Objects.requireNonNull(obj2);
                   String obj3 = PatchProxy.applyOneRefs(b, obj2, b.class, "5");
                   if (obj3 != patchProxyRe) {
                      l3 = obj3.longValue();
                   }else {
                      Long longx = obj2.a.get(b);
                      l3 = (longx != null)? longx.longValue(): 0;
                   }
                   if (Math.abs((l - l3)) - mINUTES.toMillis(3) < 0) {
                      a.b(b);
                      obj3 = "install_notice";
                   }else {
                      obj3 = "";
                   }
                   str = obj3;
                }
             }
             str = str1;
          }
          obj = g.a(uAPKDownload, b);
          uAPKDownload.mReportedInstalled = true;
          uAPKDownload.saveToCache();
          PhotoApkDownloadTaskInfo mAdDataWrapp1 = taskInfo.mAdDataWrapper;
          if (mAdDataWrapp1 != null) {
             oj0.f(mAdDataWrapp1.getAdLogParamAppender());
          }
          oj0.d(new i(taskInfo, b, str, obj)).a();
          if (PatchProxy.applyVoidOneRefs(mAdDataWrapp, null, AppInstalledReceiver.class, "11") || (mAdDataWrapp != null && mAdDataWrapp.getPhoto() != null)) {
             b.a(-762347696).o1(mAdDataWrapp.getPhoto(), "key_auto_download_ordered_app");
          }
       }
    label_0194 :
       return;
    }
}
