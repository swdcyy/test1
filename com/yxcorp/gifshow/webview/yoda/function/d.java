package com.yxcorp.gifshow.webview.yoda.function.d;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams;
import com.google.gson.Gson;
import com.yxcorp.gifshow.webview.yoda.function.c;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.download.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.yoda.function.d$a;
import java.lang.Integer;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadInfo;
import ryc.a;
import android.os.Environment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import com.yxcorp.download.DownloadManager;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadAction;
import tkd.b;
import tkd.d;
import nl9.d;
import rc5.a;
import java.lang.Boolean;
import txc.c;
import q87.c;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadFileType;
import java.io.File;
import wkd.b;
import j80.c;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class d extends c	// class@0017b8
{
    public WeakReference f;
    public JsDownloadParams g;
    public String h;
    public String i;

    public void d(YodaBaseWebView p0,Activity p1){
       super();
       this.f = new WeakReference(p1);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       if (this.f.get() == null || this.f.get().isFinishing()) {
          this.o(p0, p1, p2, 0x1e84a, "current page is finished", p4);
          return;
       }else {
          JsDownloadParams jsDownloadPa = a.a.h(p3, JsDownloadParams.class);
          this.g = jsDownloadPa;
          this.h = p1;
          this.i = p2;
          if (jsDownloadPa == null) {
             this.o(p0, p1, p2, 0x1e84f, "params invalid", p4);
             return;
          }else {
             jsDownloadPa.mCallback = p4;
             k1.o(new c(this, p0));
             return;
          }
       }
    }
    public final b s(YodaBaseWebView p0,JsDownloadParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$a(this, p1, p0);
    }
    public final void t(YodaBaseWebView p0,int p1,JsDownloadParams p2,String p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, d.class, "5")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "fail";
       uDownloadInf.mPercent = 0;
       uDownloadInf.mMsg = p3;
       uDownloadInf.mResult = p1;
       a.a(p0, p2.mCallback, uDownloadInf, this.c, this.h, this.i);
       return;
    }
    public final void u(YodaBaseWebView p0,JsDownloadParams p1){
       DownloadManager uDownloadMan;
       QPhoto qPhoto2;
       boolean b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       if (!(Environment.getExternalStorageState()).equalsIgnoreCase("mounted")) {
          this.t(p0, 0x1e84a, p1, this.f.get().getString(R.string.arg_RES_7f104ab2));
          return;
       }else {
          boolean b = TextUtils.n(p1.mExtraInfo, "game");
          QPhoto qPhoto = null;
          int i = 1;
          int i1 = 0;
          if (this.f.get() instanceof KwaiYodaWebViewActivity && p1.mPhotoId != null) {
             QPhoto qPhoto1 = this.f.get().B3("key_qphoto");
             uDownloadMan = (qPhoto1 != null && (TextUtils.n(qPhoto1.getPhotoId(), p1.mPhotoId) && k.B(qPhoto1) != null))? 1: null;
             if (uDownloadMan) {
                i0.a().y(i0.a().g(qPhoto1.mEntity), p1.mClickType, i1);
             }
             qPhoto2 = qPhoto1;
             b1 = uDownloadMan;
          }else {
             qPhoto2 = qPhoto;
             b1 = false;
          }
          uDownloadMan = DownloadManager.n();
          if (p1.mAction == JsDownloadParams$DownloadAction.START) {
             this.v(p0, uDownloadMan, b1, b, p1, qPhoto2);
          }else {
             Integer integer = DownloadManager.n().p(p1.mUrl);
             if (integer != null && integer.intValue()) {
                b uob = this.s(p0, p1);
                uDownloadMan.e(integer.intValue());
                if (b1) {
                   if (qPhoto2 != null) {
                      qPhoto = qPhoto2.mEntity;
                   }
                   b[] uobArray = new b[i];
                   uobArray[i1] = d.a(0x4bd38ddd).wj(qPhoto);
                   uDownloadMan.b(integer.intValue(), uobArray);
                }
                if (b) {
                   b[] uobArray1 = new b[i];
                   uobArray1[i1] = new a(p1.mDownloadId, p1.mDownloadName, p1.mGameIconUrl, p1.mGameName);
                   uDownloadMan.b(integer.intValue(), uobArray1);
                }
                b[] uobArray2 = new b[i];
                uobArray2[i1] = uob;
                uDownloadMan.b(integer.intValue(), uobArray2);
                JsDownloadParams mAction = p1.mAction;
                if (mAction == JsDownloadParams$DownloadAction.RESUME) {
                   uDownloadMan.D(integer.intValue());
                }else if(mAction == JsDownloadParams$DownloadAction.PAUSE){
                   uDownloadMan.z(integer.intValue());
                }else if(mAction == JsDownloadParams$DownloadAction.STOP){
                   uDownloadMan.c(integer.intValue());
                }
             }else {
                this.v(p0, uDownloadMan, b1, b, p1, qPhoto2);
             }
          }
          return;
       }
    }
    public final void v(YodaBaseWebView p0,DownloadManager p1,boolean p2,boolean p3,JsDownloadParams p4,QPhoto p5){
       DownloadTask$DownloadRequest uDownloadReq;
       int i2;
       b[] uobArray2;
       d uod = d.class;
       int i = 3;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       c.C().w("DownloadFunction", "startDownloadTask", objArray1);
       if (PatchProxy.isSupport(uod)) {
          uDownloadReq = PatchProxy.applyTwoRefs(p4, Boolean.valueOf(p3), this, uod, "6");
          if (uDownloadReq != PatchProxyResult.class) {
          }else {
          label_0052 :
             uDownloadReq = new DownloadTask$DownloadRequest(p4.mUrl);
             uDownloadReq.setBizType("Yoda_JS_Bridge");
             uDownloadReq.setNeedCDNReport(1);
             JsDownloadParams mFileType = p4.mFileType;
             if (JsDownloadParams$DownloadFileType.IMAGE == mFileType || JsDownloadParams$DownloadFileType.VIDEO == mFileType) {
                uDownloadReq.setDestinationDir(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath());
             }
             uDownloadReq.setIsNotForceReDownload(0);
             if (p3) {
                uDownloadReq.setDestinationDir(b.a(-1504323719).c(".game_apk_cache").getPath());
                uDownloadReq.setIsNotForceReDownload(1);
             }
             if (p4.mNotificationHidden != null) {
                uDownloadReq.setNotificationVisibility(0);
             }else {
                uDownloadReq.setNotificationVisibility(i);
             }
          }
       }else {
          goto label_0052 ;
       }
       b[] uobArray = new b[0];
       int i1 = p1.E(uDownloadReq, uobArray);
       if (p2) {
          QPhoto qPhoto = null;
          if (p5 != null) {
             qPhoto = p5.mEntity;
          }
          b[] uobArray1 = new b[]{d.a(i2).wj(qPhoto)};
          i2 = 0x4bd38ddd;
          p1.b(i1, uobArray1);
          d.a(i2).g70(i1, uDownloadReq, p5).subscribe(Functions.d(), Functions.d());
       }
       if (p3) {
          uobArray2 = new b[]{new a(p4.mDownloadId, p4.mDownloadName, p4.mGameIconUrl, p4.mGameName)};
          p1.b(i1, uobArray2);
       }
       uobArray2 = new b[]{this.s(p0, p4)};
       p1.b(i1, uobArray2);
       return;
    }
}
