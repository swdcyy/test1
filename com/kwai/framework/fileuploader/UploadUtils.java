package com.kwai.framework.fileuploader.UploadUtils;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import t66.a;
import t45.d;
import brd.z;
import t66.d;
import erd.o;
import njd.a;
import android.util.Pair;
import java.lang.Boolean;
import com.kwai.framework.fileuploader.DebugFileUploadTokenResponse;
import brd.w;
import okhttp3.MultipartBody$Part;
import ojd.e;
import t66.c;
import java.lang.Throwable;
import java.net.SocketTimeoutException;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.yxcorp.retrofit.model.ActionResponse;
import ojd.f;
import com.kwai.framework.fileuploader.d;
import erd.r;
import com.kwai.framework.fileuploader.UploadUtils$CommonUploadBizType;
import com.kwai.framework.fileuploader.a;
import com.kwai.framework.fileuploader.b;
import com.kwai.framework.fileuploader.c;

public class UploadUtils	// class@001557
{

    public void UploadUtils(){
       super();
    }
    public static t doUploadFile(File p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(UploadUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, UploadUtils.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-52664254).a(p1, p3).observeOn(d.c).flatMap(new d(p2, p0));
    }
    public static Pair lambda$doUploadFile$4(a p0,a p1){
       return new Pair(Boolean.TRUE, p0.a().mUploadToken);
    }
    public static w lambda$doUploadFile$5(String p0,File p1,a p2){
       if (p2.a().mAllowUpload == null) {
          return t.just(new Pair(Boolean.FALSE, ""));
       }
       return b.a(-52664254).b(p2.a().mUploadToken, p0, e.d("file", p1)).map(new c(p2));
    }
    public static boolean lambda$upload$0(Throwable p0){
       boolean b = (p0.getCause() instanceof SocketTimeoutException && p0.C(a.a().a()))? true: false;
       return b;
    }
    public static Boolean lambda$uploadExceptionFile$3(Pair p0){
       return p0.first;
    }
    public static ActionResponse lambda$uploadFile$2(Pair p0){
       return new ActionResponse();
    }
    public static String lambda$uploadHprofFile$1(Pair p0){
       return p0.second;
    }
    public static t upload(String p0,String p1,f p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, UploadUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-52664254).commonUpload(p0, e.f("file", new File(p1), p2)).retry(3, d.b);
    }
    public static t uploadExceptionFile(File p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, UploadUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UploadUtils.doUploadFile(p0, UploadUtils$CommonUploadBizType.APP_CRASH_LOG_FILE.mType, p1, p2).map(a.b);
    }
    public static t uploadFile(File p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(UploadUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, UploadUtils.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return UploadUtils.doUploadFile(p0, p1, p2, p3).map(b.b);
    }
    public static t uploadHprofFile(File p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, UploadUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UploadUtils.doUploadFile(p0, UploadUtils$CommonUploadBizType.APP_OOM_LOG_FILE.mType, p1, p2).map(c.b);
    }
    public static t uploadNativeCrashFile(File p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, UploadUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UploadUtils.uploadFile(p0, UploadUtils$CommonUploadBizType.APP_CRASH_LOG_FILE.mType, p1, p2);
    }
}
