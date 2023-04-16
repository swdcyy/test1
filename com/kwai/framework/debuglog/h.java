package com.kwai.framework.debuglog.h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kwai.logger.KwaiLog;
import com.kwai.framework.debuglog.h$a;
import t87.f;
import com.kwai.logger.upload.internal.s;
import com.kwai.logger.upload.model.UploadError$Error;
import t87.c;
import c97.d;
import h97.g;
import brd.t;
import u87.r;
import u87.u;
import u87.t;
import erd.g;
import crd.b;

public class h	// class@001514
{
    public static final AtomicBoolean a;

    static {
       h.a = new AtomicBoolean(false);
    }
    public void h(){
       super();
    }
    public static void a(Context p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "1")) {
          return;
       }
       h.b(p0, p1, null);
       return;
    }
    public static void b(Context p0,String p1,File p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "3")) {
          return;
       }
       boolean b = false;
       String str = "DebugLoggerUploader";
       if (!h.a.compareAndSet(b, true)) {
          objArray = new Object[b];
          KwaiLog.e(str, "uploadLog uploading cancel", objArray);
          return;
       }else {
          objArray = new Object[b];
          KwaiLog.b(str, "uploadLog start", objArray);
          h$a uoa = new h$a(p2);
          if (!s.d()) {
             UploadError$Error nOT_INIT = UploadError$Error.NOT_INIT;
             int errCode = nOT_INIT.getErrCode();
             s.e(uoa, errCode, nOT_INIT.getErrMsg());
          }else {
             r.b(p1, d.a().b().getUserId(), d.a().b().P(), "CUSTOM_UPLOAD_RETRIEVE").subscribe(new u(p1, uoa), new t(uoa));
          }
          return;
       }
    }
}
