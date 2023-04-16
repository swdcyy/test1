package com.kwai.logger.upload.internal.s;
import java.lang.String;
import v87.d;
import c97.d;
import h97.g;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import a97.f;
import java.lang.Object;
import java.lang.StringBuilder;
import t87.d;
import w87.j;
import com.kwai.logger.upload.model.UploadError$Error;
import a97.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import t87.f;
import t87.c;
import u87.v;
import java.lang.Runnable;
import ca7.v;
import java.util.Objects;
import w87.a;
import java.util.concurrent.ConcurrentHashMap;
import android.os.SystemClock;
import com.kwai.logger.upload.internal.r;
import f97.a;

public class s	// class@000ede
{

    public static d a(String p0,String p1){
       d uod = new d();
       uod.b = d.a().b().getDeviceId();
       uod.a = p0;
       uod.c = p1;
       return uod;
    }
    public static boolean b(String p0){
       boolean b = f.b(d.a().d(), "recent_tasks", new HashSet()).contains(p0);
       if (b) {
          d.a("ObiwanUploader", "Uploader:this task has been completed :"+p0);
          j.a().h(p0);
          UploadError$Error dUPLICATE_TA = UploadError$Error.DUPLICATE_TASK;
          int errCode = dUPLICATE_TA.getErrCode();
          j.a().o(p0, errCode, dUPLICATE_TA.getErrMsg());
       }
       return b;
    }
    public static boolean c(String p0){
       Context uContext = d.a().d();
       String str = g.a(uContext);
       boolean b = (!TextUtils.isEmpty(str) && str.equals(uContext.getPackageName()))? true: false;
       if (!b) {
          d.b("ObiwanUploader", "Uploader:upload file must be main process, current is:"+g.a(f.d));
          j.a().h(p0);
          UploadError$Error nOT_IN_MAIN_ = UploadError$Error.NOT_IN_MAIN_PROCESS;
          int errCode = nOT_IN_MAIN_.getErrCode();
          j.a().o(p0, errCode, nOT_IN_MAIN_.getErrMsg());
       }
       return b;
    }
    public static boolean d(){
       boolean b = (f.c != null && f.d != null)? true: false;
       return b;
    }
    public static void e(c p0,int p1,String p2){
       if (p0 == null) {
          return;
       }
       v.e(new v(p0, p1, p2));
       return;
    }
    public static synchronized void f(String p0,String p1,String p2){
       _monitor_enter(s.class);
       s.g(p0, p1, p2, null);
       _monitor_exit(s.class);
    }
    public static synchronized void g(String p0,String p1,String p2,c p3){
       _monitor_enter(s.class);
       if (!s.d()) {
          d.b("ObiwanUploader", "please init ObiwanUploadManager first!");
          _monitor_exit(s.class);
          return;
       }else {
          j oj = j.a();
          Objects.requireNonNull(oj);
          if (!TextUtils.isEmpty(p0)) {
             a uoa = new a(p0);
             oj.d.put(p0, uoa);
             uoa.i = SystemClock.elapsedRealtime();
          }
          if (!s.c(p0)) {
             _monitor_exit(s.class);
             return;
          }else if(s.b(p0)){
             _monitor_exit(s.class);
             return;
          }else {
             a.a(new r(p0, p1, p2, p3));
             _monitor_exit(s.class);
             return;
          }
       }
    }
}
