package com.kwai.logger.upload.internal.c;
import java.util.concurrent.atomic.AtomicBoolean;
import v87.a;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import v87.d;
import t87.d;
import t87.f;
import android.content.Context;
import a97.c;
import com.kwai.logger.upload.internal.k;
import w87.j;
import a97.j;
import com.kwai.logger.upload.model.UploadError$Error;
import a97.i;
import v87.a$a;
import com.kwai.logger.upload.model.LogStartResponse;
import java.lang.Object;
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
import com.kwai.logger.upload.internal.b;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import java.lang.Runnable;
import t87.a;
import java.util.ArrayList;
import com.kwai.logger.upload.internal.a;
import u87.b;
import u87.d;
import com.kwai.logger.upload.model.StartExtra;
import java.util.Locale;
import java.lang.Integer;
import u87.e;
import a97.h;

public class c	// class@000ecd
{
    public static AtomicBoolean a;
    public static c b;
    public static LogStartResponse c;
    public static StartExtra d;
    public static File e;
    public static String f;

    static {
       c.a = new AtomicBoolean(false);
       c.e = null;
       c.f = "";
    }
    public static void a(a p0){
       File uFile = p0.f();
       if (uFile != null && uFile.exists()) {
          d.a("ObiwanUploader", "taskId:"+p0.d().a+",reset upload event, delete file "+uFile.getAbsolutePath()+" "+uFile.delete());
       }
       File uFile1 = c.d(f.d);
       if (uFile1.exists()) {
          d.a("ObiwanUploader", "delete "+uFile1.getAbsolutePath()+",result:"+c.c(uFile1));
       }
       uFile1 = c.e;
       if (uFile1 != null && uFile1.exists()) {
          d.a("ObiwanUploader", "delete file temp directory."+c.e.getAbsolutePath()+",result:"+c.c(c.e));
       }
       return;
    }
    public static void b(File p0,File p1,a p2,long p3){
       UploadError$Error iNVALID_PATH;
       int errCode;
       LogStartResponse c;
       int i;
       if (p0 == null || !p0.length() - null) {
          iNVALID_PATH = UploadError$Error.INVALID_PATH;
          errCode = iNVALID_PATH.getErrCode();
          c.e(errCode, iNVALID_PATH.getErrMsg(), p2);
          return;
       }else {
          c.e = p0;
          k.c(p2, "COMPRESS_START");
          String str = "ObiwanUploader";
          d.a(str, "Uploader:开始压缩文件");
          j.a().j(p2.d().a);
          if (!j.c(c.e, p1)) {
             k.c(p2, "COMPRESS_ERROR");
             iNVALID_PATH = UploadError$Error.ZIP_FOLDER;
             errCode = iNVALID_PATH.getErrCode();
             c.e(errCode, iNVALID_PATH.getErrMsg(), p2);
             return;
          }else {
             j.a().q(p2.d().a, c.e, p1);
             j.a().i(p2.d().a);
             d.a(str, "Uploader:压缩完成");
             k.c(p2, "COMPRESS_FINISH");
             if (p3 - -1 && p1.length() - p3 > 0) {
                iNVALID_PATH = UploadError$Error.OVER_SIZE;
                errCode = iNVALID_PATH.getErrCode();
                c.e(errCode, iNVALID_PATH.getErrMsg(), p2);
                return;
             }else if(!i.b(p1)){
                iNVALID_PATH = UploadError$Error.NO_NETWORK;
                errCode = iNVALID_PATH.getErrCode();
                c.e(errCode, iNVALID_PATH.getErrMsg(), p2);
                return;
             }else {
                a$a uoa = p2.a();
                uoa.c(p1);
                a uoa1 = uoa.a();
                c = c.c;
                LogStartResponse httpEndpoint = c.httpEndpointList;
                i = 0;
                if (httpEndpoint != null && !TextUtils.isEmpty(httpEndpoint.get(i))) {
                   KSUploaderKitNetManager.setOnlineServerAddress(c.httpEndpointList.get(i));
                   if (d.a().i()) {
                      KSUploaderKitNetManager.setUseHttps(i);
                   }
                   i = 1;
                }
                if (!i) {
                   iNVALID_PATH = UploadError$Error.RESPONSE_HTTP_ERROR;
                   int errCode1 = iNVALID_PATH.getErrCode();
                   c.e(errCode1, iNVALID_PATH.getErrMsg(), uoa1);
                }else {
                   KSUploaderKitConfig kSUploaderKi = new KSUploaderKitConfig(c.c.ktpToken, uoa1.f().getAbsolutePath(), uoa1.d().a, KSUploaderKitCommon$MediaType.File, KSUploaderKitCommon$ServiceType.General);
                   KSUploaderKit kSUploaderKi1 = new KSUploaderKit(f.d, d.a().i());
                   c = c.c.newAppEndpointList;
                   if (c != null && !c.isEmpty()) {
                      c = c.c;
                      kSUploaderKi1.setExternalEndPoints(c.newAppEndpointList, c.tokenId);
                   }
                   kSUploaderKi1.setSceneType(KSUploaderKitCommon$SceneType.UploadLog);
                   kSUploaderKi1.setEventListener(new b(uoa1));
                   k.c(uoa1, "UPLOAD_START");
                   d.a(str, "Uploader:开始上传文件");
                   j.a().g(uoa1.d().a);
                   kSUploaderKi1.startUpload();
                }
                return;
             }
          }
       }
    }
    public static void c(a p0){
       a c = f.c;
       if (c != null && c.c() != null) {
          f.c.c().run();
       }
       ArrayList uArrayList = new ArrayList(1);
       File uFile = new File(f.c.b());
       File uFile1 = null;
       if (!uFile.exists() || !uFile.isDirectory()) {
          d.b("ObiwanUploader", "input fileDir "+uFile+" not exists");
       }else if(!uFile.canRead()){
          d.b("ObiwanUploader", "input fileDir "+uFile+" can not read");
       }else {
          uArrayList.add(uFile);
          if (!uArrayList.size()) {
             d.b("ObiwanUploader", "input fileDirs either cannot access.");
          }else {
             d.a("ObiwanUploader", "Uploader:input fileDirs size = "+uArrayList.size()+" will be zip.files = "+uArrayList.toString());
             File[] uFileArray = new File[0];
             uFile1 = d.a(f.d, uArrayList.toArray(uFileArray), -1, a.a);
          }
       }
       c.b(uFile1, i.a(), p0, -1);
       p0 = f.c;
       if (p0 != null && p0.a() != null) {
          f.c.a().run();
       }
       return;
    }
    public static int d(){
       StartExtra d = c.d;
       if (d == null) {
          return 0;
       }
       if (!TextUtils.isEmpty(d.cmd) && (c.d.cmd).equals("uploadByPaths")) {
          return 1;
       }
       d = c.d.dateRangeList;
       if (d != null && !d.isEmpty()) {
          return 2;
       }
       return 0;
    }
    public static void e(int p0,String p1,a p2){
       Locale uS = Locale.US;
       Object[] objArray = new Object[]{Integer.valueOf(p0),p1};
       d.a("ObiwanUploader", String.format(uS, "Uploader:upload log failed: %d: %s", objArray));
       Object[] objArray1 = new Object[]{p2.d().a,p2.b()};
       d.a("ObiwanUploader", String.format(uS, "Uploader:upload failed taskId: %s channelType: %s", objArray1));
       k.c(p2, "END");
       k.a(p2, p0, p1);
       c.a(p2);
       c.a.set(0);
       if (c.b != null) {
          h.a(new e(p0, p1));
       }
       c.c = null;
       c.d = null;
       c.e = null;
       c.f = "";
       return;
    }
}
