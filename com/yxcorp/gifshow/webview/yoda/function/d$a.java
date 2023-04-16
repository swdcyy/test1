package com.yxcorp.gifshow.webview.yoda.function.d$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.webview.yoda.function.d;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadInfo;
import txc.c;
import q87.c;
import com.kwai.yoda.function.c;
import ryc.a;
import com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadFileType;
import java.io.File;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import java.lang.ref.WeakReference;
import android.app.Activity;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import e17.i;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.System;

public class d$a extends k	// class@0017b7
{
    public long c;
    public final JsDownloadParams d;
    public final YodaBaseWebView e;
    public final d f;

    public void d$a(d p0,JsDownloadParams p1,YodaBaseWebView p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
       this.c = 0;
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "5")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "cancel";
       uDownloadInf.mPercent = 0;
       uDownloadInf.mResult = 1;
       uDownloadInf.mUrl = this.d.mUrl;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download canceled", objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "7")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "complete";
       uDownloadInf.mPercent = 100;
       uDownloadInf.mUrl = this.d.mUrl;
       int i = 1;
       uDownloadInf.mResult = i;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download completed", objArray);
       d$a te = this.e;
       JsDownloadParams mCallback = this.d.mCallback;
       d$a tf = this.f;
       c uoc = tf.c;
       d uod = tf.h;
       d uod1 = tf.i;
       try{
          a.a(te, mCallback, uDownloadInf, uoc, uod, uod1);
          mCallback = this.d.mFileType;
          if (JsDownloadParams$DownloadFileType.IMAGE == mCallback || JsDownloadParams$DownloadFileType.VIDEO == mCallback) {
             Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
             intent.setData(w0.c(new File(p0.getTargetFilePath())));
             this.f.f.get().sendBroadcast(intent);
             Object[] objArray1 = new Object[i];
             objArray1[0] = p0.getTargetFilePath();
             i.d(R.style.arg_RES_7f11066a, a.B.getString(R.string.arg_RES_7f103e70, objArray1));
          }
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "fail";
       uDownloadInf.mPercent = 0;
       uDownloadInf.mMsg = p1.getMessage();
       uDownloadInf.mResult = 0x1e84a;
       uDownloadInf.mUrl = this.d.mUrl;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download error, msg ="+uDownloadInf.mMsg, objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
    public void g(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "fail";
       uDownloadInf.mPercent = 0;
       uDownloadInf.mUrl = this.d.mUrl;
       uDownloadInf.mMsg = a.B.getString(0x7f103993);
       uDownloadInf.mResult = 0x1e84a;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download lowStorage, not enough storage", objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d$a.class, "6")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "pause";
       uDownloadInf.mPercent = (int)(p1 / (p2 / 100));
       uDownloadInf.mUrl = this.d.mUrl;
       uDownloadInf.mResult = 1;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download paused, percent ="+uDownloadInf.mPercent, objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d$a.class, "8")) {
          return;
       }
       if ((System.currentTimeMillis() - this.c) - 500 > 0) {
          JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
          uDownloadInf.mStage = "progress";
          uDownloadInf.mPercent = (int)(p1 / (p2 / 100));
          uDownloadInf.mUrl = this.d.mUrl;
          uDownloadInf.mResult = 1;
          Object[] objArray = new Object[0];
          c.C().w("DownloadFunction", "download progress, percent ="+uDownloadInf.mPercent, objArray);
          d$a tf = this.f;
          a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
          this.c = System.currentTimeMillis();
       }
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d$a.class, "4")) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "resume";
       uDownloadInf.mPercent = (int)(p1 / (p2 / 100));
       uDownloadInf.mUrl = this.d.mUrl;
       uDownloadInf.mResult = 1;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download resumed, percent ="+uDownloadInf.mPercent, objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (p0.getSoFarBytes() - null) {
          return;
       }
       JsDownloadParams$DownloadInfo uDownloadInf = new JsDownloadParams$DownloadInfo();
       uDownloadInf.mStage = "start";
       uDownloadInf.mPercent = 0;
       uDownloadInf.mResult = 1;
       uDownloadInf.mUrl = this.d.mUrl;
       Object[] objArray = new Object[0];
       c.C().w("DownloadFunction", "download start", objArray);
       d$a tf = this.f;
       a.a(this.e, this.d.mCallback, uDownloadInf, tf.c, tf.h, tf.i);
       return;
    }
}
