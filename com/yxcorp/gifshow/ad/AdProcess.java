package com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.ad.AdProcess$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import com.yxcorp.gifshow.ad.AdProcess$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.net.NetworkInfo;
import ekd.p0;
import com.yxcorp.gifshow.ad.AdProcess$e;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import nz6.a;
import com.yxcorp.gifshow.ad.AdProcess$d;
import android.content.DialogInterface$OnDismissListener;
import mxb.j0;
import mxb.i0;
import mxb.j;
import lnc.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import nx8.q;
import com.yxcorp.gifshow.ad.AdProcess$c;
import yx.j0;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import android.os.Environment;
import java.io.File;
import tkd.b;
import tkd.d;
import nl9.d;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.download.b;
import java.util.Collection;
import java.util.List;
import nx8.l;
import java.lang.StringBuilder;
import java.lang.Number;
import zsd.u;
import lnc.y0;
import com.yxcorp.gifshow.ad.AdProcess$f;
import erd.g;
import com.yxcorp.gifshow.ad.AdProcess$g;
import org.greenrobot.eventbus.a;
import dda.a;
import com.kwai.framework.model.feed.BaseFeed;
import p49.f;
import p49.c;
import p49.c$a;
import p49.f$a;
import com.yxcorp.gifshow.ad.AdProcess$h;
import p49.a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
import nx8.f;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;
import com.yxcorp.gifshow.ad.AdProcess$i;
import com.yxcorp.gifshow.ad.AdProcess$tryOpenAppMarket$1;
import msd.l;
import com.yxcorp.download.DownloadTask;
import com.yxcorp.gifshow.ad.AdProcess$j;

public abstract class AdProcess	// class@0014ea
{
    public final List a;
    public int b;
    public boolean c;
    public boolean d;
    public AdDownloaderType e;
    public AdProcess$c f;
    public List g;
    public final Activity h;
    public final AdDataWrapper i;
    public static final AdProcess$a j;

    static {
       AdProcess.j = new AdProcess$a(null);
    }
    public void AdProcess(Activity p0,AdDataWrapper p1){
       a.p(p0, "mActivity");
       a.p(p1, "mAdDataWrapper");
       super();
       this.h = p0;
       this.i = p1;
       this.a = new ArrayList();
       this.d = true;
       this.e = AdDownloaderType.DOWNLOAD_FULL_SPEED;
    }
    public final void a(AdProcess$b p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess.class, "12")) {
          return;
       }
       AdProcess th = this.h;
       AdProcess ti = this.i;
       Object obj = PatchProxy.applyTwoRefs(th, ti, null, AdProcessUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(th, "activity");
          a.p(ti, "adDataWrapper");
          if (ti.shouldAlertNetMobile()) {
             NetworkInfo networkInfo = p0.e(th);
             if (networkInfo != null && !networkInfo.getType()) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          Dialog uDialog = a.c(R.string.arg_RES_7f1039a1, new int[2]{R.string.arg_RES_7f10081a,0x7f1004b4}, this.h, new AdProcess$e(p0));
          uDialog.setOnDismissListener(new AdProcess$d(p0));
          uDialog.show();
          i0.a().b(this.i.getAdLogWrapper(), 434);
       }else {
          p0.b();
       }
       return;
    }
    public final void b(boolean p0){
       AdProcess tf;
       AdProcess uAdProcess = AdProcess.class;
       if (PatchProxy.isSupport(uAdProcess) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdProcess, "20")) {
          return;
       }
       String str = h.a(this.i.getUrl());
       if (TextUtils.isEmpty(str)) {
          tf = this.f;
          int i = 0;
          if (tf != null) {
             tf.a(new q(i));
          }
          Object[] objArray = new Object[i];
          j0.c("AdProcess", "download url is empty", objArray);
          return;
       }else {
          String str1 = null;
          DownloadManager.C("commercial_apk", str1);
          DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(str);
          uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
          uDownloadReq.setBizInfo(":ks-features:ft-commercial:commercial-libraries:commercial-process", "commercial_apk", str1);
          uDownloadReq.setNeedCDNReport(true);
          File externalStor = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
          a.o(externalStor, "Environment.getExternalS¡­ment.DIRECTORY_DOWNLOADS\)");
          uDownloadReq.setDestinationDir(externalStor.getAbsolutePath());
          str = this.i.getApkFileName();
          a.o(str, "mAdDataWrapper.apkFileName");
          uDownloadReq.setDestinationFileName(str);
          uDownloadReq.setNotificationVisibility(3);
          if (p0) {
             uDownloadReq.setAllowedNetworkTypes(2);
          }
          b uob = d.a(0x4bd38ddd);
          AdProcess ti = this.i;
          AdProcess te = this.e;
          tf = this.g;
          if (tf != null) {
             str1 = new ArrayList(u.Y(tf, 10));
             Iterator iterator = tf.iterator();
             while (iterator.hasNext()) {
                str1.add(iterator.next().m());
             }
          }
          uob.mY(uDownloadReq, ti, te, str1, this.d);
          tf = this.f;
          if (tf != null) {
             tf.a(new q(12));
          }
          return;
       }
    }
    public final Activity c(){
       return this.h;
    }
    public final AdDataWrapper d(){
       return this.i;
    }
    public final List e(){
       return this.g;
    }
    public final AdProcess$c f(){
       return this.f;
    }
    public final List g(){
       return this.a;
    }
    public l h(){
       Object obj = PatchProxy.apply(null, this, AdProcess.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       j0.f("AdProcess", "getProcessingConsume mProcessingIndex: "+this.b, objArray);
       if (this.a.isEmpty() ^ 0x01) {
          AdProcess tb = this.b;
          if (this.a.size() > tb) {
             return this.a.get(tb);
          }
       }
       return null;
    }
    public final int i(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, AdProcess.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = false;
       if (2 == this.i.getConversionType()) {
          obj = this.i.getUrl();
          if (obj != null) {
             objArray = Boolean.valueOf(u.q2(obj, "kwai://adtkpage", b, 2, objArray));
          }
          if (y0.p(objArray)) {
             b = true;
          }
       }
       int i = (b)? 13: 3;
       return i;
    }
    public final void j(AdDataWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess.class, "11")) {
          return;
       }
       i0.a().p(37, p0.getAdLogWrapper()).d(new AdProcess$f(this, p0)).a();
       return;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess.class, "15")) {
          return;
       }
       j adLogWrapper = this.i.getAdLogWrapper();
       a.o(adLogWrapper, "mAdDataWrapper.adLogWrapper");
       i0.a().p(652, adLogWrapper).d(new AdProcess$g(p0)).a();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, AdProcess.class, "23")) {
          return;
       }
       a.d().k(new a(this.i.getPhoto()));
       return;
    }
    public abstract int m();
    public final void n(){
       if (PatchProxy.applyVoid(null, this, AdProcess.class, "7")) {
          return;
       }
       f.a.a(c.Z.a()).g(new AdProcess$h(this));
       return;
    }
    public final void o(boolean p0){
       this.d = p0;
    }
    public final void p(boolean p0){
       this.c = p0;
    }
    public final void q(AdProcess$c p0){
       this.f = p0;
    }
    public final void r(int p0){
       this.b = p0;
    }
    public final boolean s(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       BaseFeed obj = PatchProxy.apply(objArray, this, AdProcess.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.i.getPhoto();
       PhotoAdvertisement photoAdverti = (obj != null)? obj.get("AD"): objArray;
       Object obj1 = PatchProxy.applyOneRefs(photoAdverti, objArray, j.class, "14");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          PhotoAdvertisement$TryGameInfo tryGameInfo = j.t(photoAdverti);
          tryGameInfo = (tryGameInfo != null)? tryGameInfo.mPlayType: null;
          if (tryGameInfo > null) {
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          return f.f(this.h, this.i);
       }else {
          return false;
       }
    }
    public final boolean t(){
       Object obj = PatchProxy.apply(null, this, AdProcess.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = f.d(this.h, this.i);
       if (b) {
          this.j(this.i);
       }
       return b;
    }
    public final boolean u(){
       boolean b1;
       Boolean uBoolean;
       Boolean uBoolean1;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdProcess obj = PatchProxy.apply(null, this, AdProcess.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.i;
       AdProcess obj1 = PatchProxy.applyOneRefs(obj, null, uof, "15");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a.p(obj, "adDataWrapper");
          BaseFeed photo = obj.getPhoto();
          PhotoAdvertisement photoAdverti = (photo != null)? photo.get("AD"): null;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[b];
             uAdGroupArra[0] = PhotoAdvertisement$AdGroup.DSP_NATURE;
             uBoolean = Boolean.valueOf(photoAdverti.isAdGroup(uAdGroupArra));
          }else {
             uBoolean = null;
          }
          if (y0.p(uBoolean) && !obj.isAdUrlData()) {
             b1 = false;
          }else if(photoAdverti != null){
             PhotoAdvertisement$AdGroup[] uAdGroupArra1 = new PhotoAdvertisement$AdGroup[b];
             uAdGroupArra1[0] = PhotoAdvertisement$AdGroup.AD_DSP_SOFT;
             uBoolean1 = Boolean.valueOf(photoAdverti.isAdGroup(uAdGroupArra1));
          }else {
             uBoolean1 = null;
          }
          if (y0.p(uBoolean1)) {
             b1 = a.t().d("adEnableDspSoftOpenThridApp", b);
          }else {
             b1 = true;
          }
       }
       if (!b1) {
          return false;
       }else {
          obj = this.h;
          obj1 = this.i;
          APKDownloadTask obj2 = PatchProxy.applyTwoRefs(obj, obj1, null, uof, "2");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             a.p(obj, "activity");
             a.p(obj1, "adDataWrapper");
             if (!f.g(obj, obj1.getPackageName())) {
                int i = 0x4bd38ddd;
                if (d.a(i).D6(obj1)) {
                   obj2 = d.a(i).KK(obj1.getUrl());
                   if (obj2 != null) {
                      obj2 = obj2.mTaskInfo;
                      if (obj2 != null) {
                         ApkDownloadTaskInfo mParsedPkgNa = obj2.mParsedPkgName;
                         if (mParsedPkgNa == null || !f.g(obj, mParsedPkgNa)) {
                         }
                      }else {
                      }
                   }else {
                   }
                }else {
                }
             }
          }
          if (b) {
             NeoAppAdvanceReportUtil.g(this.i);
             i0.a().p(38, this.i.getAdLogWrapper()).d(new AdProcess$i(this)).a();
          }
          return b;
       }
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, AdProcess.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.e(this.h, this.i, new AdProcess$tryOpenAppMarket$1(this));
    }
    public final boolean w(){
       Object[] objArray = null;
       DownloadTask obj = PatchProxy.apply(objArray, this, AdProcess.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = AdProcessUtils.c(this.i);
       boolean b = false;
       if (obj != null) {
          int status = obj.getStatus();
          if (status != -2) {
             if (status == 6 || (status == 1 || (status == 2 || status == 3))) {
                if (this.c != null) {
                   if (!PatchProxy.applyVoidTwoRefs(obj, this.g, objArray, f.class, "8")) {
                      DownloadManager.n().z(obj.getId());
                   }
                }else {
                   objArray = new Object[b];
                   j0.f("AdProcess", "try Pause fail. supportPause:"+this.c+"  download url:"+obj.getUrl(), objArray);
                }
                return true;
             }
          }else {
             this.a(new AdProcess$j(this, obj));
             return true;
          }
       }
       return b;
    }
}
