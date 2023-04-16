package com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$a;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import java.lang.String;
import lh7.a;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver$b;
import kotlin.jvm.internal.a;
import yf7.h;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver;
import android.content.Intent;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService;
import java.lang.Class;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.io.File;
import android.os.Parcelable;
import nh7.a$a;
import mh7.a;
import mh7.a$b;
import nh7.a$b;
import mh7.a$c;
import android.os.Debug;
import java.lang.StringBuilder;
import mh7.a$d;
import android.os.Build;
import android.os.Build$VERSION;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;

public final class HeapAnalysisService$a	// class@001259
{

    public void HeapAnalysisService$a(){
       super();
    }
    public void HeapAnalysisService$a(u p0){
       super();
    }
    public final void a(Context p0,String p1,String p2,String p3,a p4,AnalysisReceiver$b p5){
       a$a a;
       a.p(p0, "context");
       a.p(p1, "hprofFile");
       a.p(p2, "jsonFile");
       a.p(p3, "extraFile");
       a.p(p4, "extraData");
       a.p(p5, "resultCallBack");
       String str = "HeapAnalysisService";
       h.d(str, "startAnalysisService");
       AnalysisReceiver uAnalysisRec = new AnalysisReceiver();
       uAnalysisRec.a(p5);
       Intent intent = new Intent(p0, HeapAnalysisService.class);
       intent.putExtra("HPROF_FILE", p1);
       intent.putExtra("JSON_FILE", p2);
       intent.putExtra("EXTRA_FILE", p3);
       intent.putExtra("ROOT_PATH", OOMFileManager.i.i().getAbsolutePath());
       intent.putExtra("RESULT_RECEIVER", uAnalysisRec);
       a = a$a.a;
       intent.putExtra("JAVA_MAX_MEM", String.valueOf(a.f(a.n.b())));
       intent.putExtra("JAVA_TOT_MEM", String.valueOf(a.f(a.n.d())));
       intent.putExtra("JAVA_FREE_MEM", String.valueOf(a.f(a.n.a())));
       a$b a1 = a$b.a;
       intent.putExtra("DEVICE_MAX_MEM", String.valueOf(a1.e(a.l.c())));
       intent.putExtra("DEVICE_AVA_MEM", String.valueOf(a1.e(a.l.a())));
       File[] uFileArray = new File("/proc/self/fd").listFiles();
       int len = (uFileArray != null)? uFileArray.length: 0;
       intent.putExtra("FD", String.valueOf(len));
       long pss = Debug.getPss();
       h.d(str, "startAnalysisService get Pss:"+pss);
       intent.putExtra("PSS", String.valueOf(a1.f(pss))+"mb");
       intent.putExtra("VSS", String.valueOf(a1.e(a.i.c()))+"mb");
       intent.putExtra("RSS", String.valueOf(a1.e(a.i.a()))+"mb");
       intent.putExtra("THREAD", String.valueOf(a.i.b()));
       intent.putExtra("MANUFACTURE", Build.MANUFACTURER);
       intent.putExtra("SDK", String.valueOf(Build$VERSION.SDK_INT));
       intent.putExtra("MODEL", Build.MODEL);
       intent.putExtra("TIME", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(new Date()));
       a a2 = p4.a;
       if (a2 != null) {
          intent.putExtra("REASON", a2);
       }
       a2 = p4.c;
       if (a2 != null) {
          intent.putExtra("CURRENT_PAGE", a2);
       }
       a2 = p4.b;
       if (a2 != null) {
          intent.putExtra("USAGE_TIME", a2);
       }
       a2 = p4.d;
       if (a2 != null) {
          intent.putExtra("OOM_INFO", a2);
       }
       try{
          a.e(p0, intent);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          h.c("OOM_ANALYSIS_EXCEPTION", "start service fail, "+e4.getMessage(), true);
       }
       return;
    }
}
