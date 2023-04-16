package androidx.work.impl.background.systemjob.SystemJobService;
import l3.b;
import android.app.job.JobService;
import java.lang.String;
import k3.h;
import java.util.HashMap;
import android.app.job.JobParameters;
import android.os.PersistableBundle;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Map;
import android.app.Service;
import android.content.Context;
import l3.i;
import ig6.c;
import l3.d;
import android.app.Application;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build$VERSION;
import androidx.work.WorkerParameters$a;
import android.net.Uri;
import java.util.List;
import java.util.Arrays;
import android.net.Network;

public class SystemJobService extends JobService implements b	// class@000a83
{
    public i b;
    public final Map c;
    public static final String d;

    static {
       SystemJobService.d = h.f("SystemJobService");
    }
    public void SystemJobService(){
       super();
       this.c = new HashMap();
    }
    public static String a(JobParameters p0){
       String str = "EXTRA_WORK_SPEC_ID";
       try{
          PersistableBundle extras = p0.getExtras();
          if (extras != null && extras.containsKey(str)) {
             return extras.getString(str);
          }
          return null;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public void d(String p0,boolean p1){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(SystemJobService.d, String.format("%s executed on JobScheduler", objArray), throwableArr);
       SystemJobService tc = this.c;
       _monitor_enter(tc);
       JobParameters jobParameter = this.c.remove(p0);
       _monitor_exit(tc);
       if (jobParameter != null) {
          this.jobFinished(jobParameter, p1);
       }
       return;
    }
    public void onCreate(){
       try{
          super.onCreate();
          i oi = c.b(this.getApplicationContext());
          this.b = oi;
          oi.F().c(this);
       }catch(java.lang.IllegalStateException e0){
          if (!Application.class.equals(this.getApplication().getClass())) {
             throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate\(\) or an Application#onCreate\(\).");
          }
          Throwable[] throwableArr = new Throwable[0];
          h.c().h(SystemJobService.d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", throwableArr);
       }
       return;
    }
    public void onDestroy(){
       super.onDestroy();
       SystemJobService tb = this.b;
       if (tb != null) {
          tb.F().i(this);
       }
       return;
    }
    public boolean onStartJob(JobParameters p0){
       boolean b = true;
       int i = 0;
       if (this.b == null) {
          Throwable[] throwableArr = new Throwable[i];
          h.c().a(SystemJobService.d, "WorkManager is not initialized; requesting retry.", throwableArr);
          this.jobFinished(p0, b);
          return i;
       }else {
          String str = SystemJobService.a(p0);
          if (TextUtils.isEmpty(str)) {
             Throwable[] throwableArr1 = new Throwable[i];
             h.c().b(SystemJobService.d, "WorkSpec id not found!", throwableArr1);
             return i;
          }else {
             SystemJobService tc = this.c;
             _monitor_enter(tc);
             if (this.c.containsKey(str)) {
                Object[] objArray = new Object[b];
                objArray[i] = str;
                Throwable[] throwableArr2 = new Throwable[i];
                h.c().a(SystemJobService.d, String.format("Job is already being executed by SystemJobService: %s", objArray), throwableArr2);
                _monitor_exit(tc);
                return i;
             }else {
                Object[] objArray1 = new Object[b];
                objArray1[i] = str;
                Throwable[] throwableArr3 = new Throwable[i];
                h.c().a(SystemJobService.d, String.format("onStartJob for %s", objArray1), throwableArr3);
                this.c.put(str, p0);
                _monitor_exit(tc);
                WorkerParameters$a uoa = null;
                int sDK_INT = Build$VERSION.SDK_INT;
                if (sDK_INT >= 24) {
                   uoa = new WorkerParameters$a();
                   if (p0.getTriggeredContentUris() != null) {
                      uoa.b = Arrays.asList(p0.getTriggeredContentUris());
                   }
                   if (p0.getTriggeredContentAuthorities() != null) {
                      uoa.a = Arrays.asList(p0.getTriggeredContentAuthorities());
                   }
                   if (sDK_INT >= 28) {
                      uoa.c = p0.getNetwork();
                   }
                }
                this.b.P(str, uoa);
                return b;
             }
          }
       }
    }
    public boolean onStopJob(JobParameters p0){
       Throwable[] throwableArr;
       boolean b = true;
       int i = 0;
       if (this.b == null) {
          throwableArr = new Throwable[i];
          h.c().a(SystemJobService.d, "WorkManager is not initialized; requesting retry.", throwableArr);
          return b;
       }else {
          String str = SystemJobService.a(p0);
          if (TextUtils.isEmpty(str)) {
             Throwable[] throwableArr1 = new Throwable[i];
             h.c().b(SystemJobService.d, "WorkSpec id not found!", throwableArr1);
             return i;
          }else {
             Object[] objArray = new Object[b];
             objArray[i] = str;
             throwableArr = new Throwable[i];
             h.c().a(SystemJobService.d, String.format("onStopJob for %s", objArray), throwableArr);
             SystemJobService tc = this.c;
             _monitor_enter(tc);
             this.c.remove(str);
             _monitor_exit(tc);
             this.b.R(str);
             return (this.b.F().f(str) ^ b);
          }
       }
    }
}
