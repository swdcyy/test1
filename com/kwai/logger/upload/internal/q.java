package com.kwai.logger.upload.internal.q;
import java.lang.Runnable;
import java.lang.String;
import t87.c;
import java.lang.Object;
import v87.d;
import com.kwai.logger.upload.internal.s;
import v87.a$a;
import v87.a;
import com.kwai.logger.upload.internal.h;
import java.util.concurrent.atomic.AtomicBoolean;
import u87.m;
import a97.h;
import com.kwai.logger.upload.internal.k;
import com.kwai.logger.upload.model.LogStartResponse;
import u87.r;
import t87.f;
import u87.d$b;
import java.io.File;
import t87.a;
import android.content.Context;
import u87.b;
import u87.d;
import a97.i;
import com.kwai.logger.upload.model.UploadError$Error;
import t87.d;
import w87.j;
import a97.j;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager;
import c97.d;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.logger.upload.internal.g;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;

public final class q implements Runnable	// class@000edc
{
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final c f;

    public void q(String p0,long p1,String p2,String p3,c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       UploadError$Error cHECK_BEGIN_;
       File uFile2;
       q te = this.e;
       q tf = this.f;
       a$a uoa = new a$a();
       uoa.d(s.a(this.b, te));
       uoa.b(this.d);
       uoa.d = te;
       uoa.e = this.c;
       a uoa1 = uoa.a();
       int b = false;
       boolean b1 = true;
       if (!h.a.compareAndSet(b, b1)) {
          h.a(new m(tf));
       }else {
          k.c(uoa1, "START");
          h.b = tf;
          LogStartResponse logStartResp = r.a(uoa1);
          h.c = logStartResp;
          if (logStartResp == null || logStartResp.allow == null) {
             cHECK_BEGIN_ = UploadError$Error.CHECK_BEGIN_FAILED;
             b = cHECK_BEGIN_.getErrCode();
             h.c(b, cHECK_BEGIN_.getErrMsg(), uoa1);
          }else {
             File uFile = null;
             if (f.c != null) {
                d$b uob = new d$b(uoa1);
                File[] uFileArray = new File[b1];
                uFileArray[b] = new File(f.c.b());
                uFile2 = d.a(f.d, uFileArray, -1, uob);
                if (uob.b != null) {
                   uFile = uFile2;
                }
             }
             String str = "ObiwanUploader";
             if (uFile != null && uFile.exists()) {
                File uFile1 = null;
                if (uFile.length() - uFile1) {
                   uFile2 = i.a();
                   if (!uFile.length() - uFile1) {
                      cHECK_BEGIN_ = UploadError$Error.INVALID_PATH;
                      b = cHECK_BEGIN_.getErrCode();
                      h.c(b, cHECK_BEGIN_.getErrMsg(), uoa1);
                   }else {
                      h.d = uFile;
                      k.c(uoa1, "COMPRESS_START");
                      d.a(str, "Uploader:开始压缩文件");
                      j.a().j(uoa1.d().a);
                      if (!j.c(h.d, uFile2)) {
                         k.c(uoa1, "COMPRESS_ERROR");
                         cHECK_BEGIN_ = UploadError$Error.ZIP_FOLDER;
                         b = cHECK_BEGIN_.getErrCode();
                         h.c(b, cHECK_BEGIN_.getErrMsg(), uoa1);
                      }else {
                         j.a().q(uoa1.d().a, h.d, uFile2);
                         j.a().i(uoa1.d().a);
                         d.a(str, "Uploader:压缩完成");
                         k.c(uoa1, "COMPRESS_FINISH");
                         if (!i.b(uFile2)) {
                            cHECK_BEGIN_ = UploadError$Error.NO_NETWORK;
                            b = cHECK_BEGIN_.getErrCode();
                            h.c(b, cHECK_BEGIN_.getErrMsg(), uoa1);
                         }else {
                            a$a uoa2 = uoa1.a();
                            if (("REALTIME_LOG_RETRIEVE").equals(uoa1.b())) {
                               JsonObject jsonObject = new JsonObject();
                               jsonObject.c0("sourceType", uoa1.d);
                               jsonObject.a0("originFileSize", Long.valueOf(uFile2.length()));
                               jsonObject.a0("logEndTime", Long.valueOf(uoa1.c()));
                               d uod = uoa1.d();
                               uod.c = new Gson().p(jsonObject);
                               uoa2.d(uod);
                            }
                            uoa2.c(uFile2);
                            uoa1 = uoa2.a();
                            LogStartResponse c = h.c;
                            LogStartResponse httpEndpoint = c.httpEndpointList;
                            if (httpEndpoint != null && !TextUtils.isEmpty(httpEndpoint.get(b))) {
                               KSUploaderKitNetManager.setOnlineServerAddress(c.httpEndpointList.get(b));
                               if (d.a().i()) {
                                  KSUploaderKitNetManager.setUseHttps(b);
                               }
                               b = true;
                            }
                            if (!b) {
                               cHECK_BEGIN_ = UploadError$Error.RESPONSE_HTTP_ERROR;
                               b = cHECK_BEGIN_.getErrCode();
                               h.c(b, cHECK_BEGIN_.getErrMsg(), uoa1);
                            }else {
                               KSUploaderKitConfig kSUploaderKi = new KSUploaderKitConfig(h.c.ktpToken, uoa1.f().getAbsolutePath(), uoa1.d().a, KSUploaderKitCommon$MediaType.File, KSUploaderKitCommon$ServiceType.General);
                               KSUploaderKit kSUploaderKi1 = new KSUploaderKit(f.d, b);
                               LogStartResponse newAppEndpoi = h.c.newAppEndpointList;
                               if (newAppEndpoi != null && !newAppEndpoi.isEmpty()) {
                                  newAppEndpoi = h.c;
                                  kSUploaderKi1.setExternalEndPoints(newAppEndpoi.newAppEndpointList, newAppEndpoi.tokenId);
                               }
                               kSUploaderKi1.setSceneType(KSUploaderKitCommon$SceneType.UploadLog);
                               kSUploaderKi1.setEventListener(new g(uoa1));
                               k.c(uoa1, "UPLOAD_START");
                               d.a(str, "Uploader:开始上传文件");
                               j.a().g(uoa1.d().a);
                               kSUploaderKi1.startUpload();
                            }
                         }
                      }
                   }
                }
             }
             d.a(str, "real time log is empty, no need to upload");
          }
       }
       return;
    }
}
