package com.kwai.logger.upload.internal.g;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import v87.a;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import java.lang.StringBuilder;
import t87.d;
import w87.j;
import v87.d;
import com.kwai.logger.upload.internal.h;
import com.kwai.logger.upload.internal.k;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.concurrent.atomic.AtomicBoolean;
import u87.n;
import java.lang.Runnable;
import a97.h;
import java.lang.Enum;
import u87.o;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;

public final class g implements KSUploaderKitEventListener	// class@000ed2
{
    public final a a;

    public void g(a p0){
       this.a = p0;
       super();
    }
    public void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2){
       String str = "ObiwanUploader";
       d.a(str, "Uploader:ktp upload onComplete, "+p1);
       j.a().f(this.a.d().a);
       if (p0 == KSUploaderKitCommon$Status.Success) {
          g ta = this.a;
          d.a(str, "upload success:"+ta.d().a+",channelType:"+ta.b());
          k.c(ta, "UPLOAD_FINISH");
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("originFileSize", Long.valueOf(ta.f().length()));
          k.b(ta, 100, new Gson().p(jsonObject), h.e);
          h.b(ta);
          h.a(ta);
          h.a.set(false);
          if (h.b != null) {
             h.a(new n(ta));
          }
          h.c = null;
          h.d = null;
          h.e = "";
       }else {
          h.c(p1, p0.toString(), this.a);
       }
       return;
    }
    public void onProgress(double p0){
       if (h.b != null) {
          h.a(new o(p0));
       }
       return;
    }
    public void onStateChanged(KSUploaderKitCommon$Status p0){
       d.a("ObiwanUploader", "Uploader:current upload status : "+p0);
    }
    public void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1){
       h.e = p1.fileToken();
    }
}
