package p3.a;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.lang.Object;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.Class;
import k3.c$a;
import android.app.job.JobInfo$TriggerContentUri;
import android.net.Uri;
import androidx.work.NetworkType;
import p3.a$a;
import java.lang.Enum;
import android.os.Build$VERSION;
import java.lang.Throwable;
import u3.r;
import android.app.job.JobInfo;
import k3.b;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import androidx.work.BackoffPolicy;
import java.lang.System;
import java.lang.Math;
import k3.c;
import java.util.Set;
import java.util.Iterator;

public class a	// class@0028ad
{
    public final ComponentName a;
    public static final String b;

    static {
       a.b = h.f("SystemJobInfoConverter");
    }
    public void a(Context p0){
       super();
       this.a = new ComponentName(p0.getApplicationContext(), SystemJobService.class);
    }
    public static JobInfo$TriggerContentUri b(c$a p0){
       return new JobInfo$TriggerContentUri(p0.a(), p0.b());
    }
    public static int c(NetworkType p0){
       int i = a$a.a[p0.ordinal()];
       int i1 = 0;
       if (i == 1) {
          return i1;
       }
       int i2 = 2;
       if (i == i2) {
          return 1;
       }
       int i3 = 3;
       if (i == i3) {
          return i2;
       }
       String str = 4;
       if (i != str) {
          if (i == 5 && Build$VERSION.SDK_INT >= 26) {
             return str;
          }
       }else if(Build$VERSION.SDK_INT >= 24){
          return i3;
       }
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[i1];
       h.c().a(a.b, String.format("API version too low. Cannot convert network type value %s", objArray), throwableArr);
       return 1;
    }
    public JobInfo a(r p0,int p1){
       r j = p0.j;
       PersistableBundle persistableB = new PersistableBundle();
       persistableB.putString("EXTRA_WORK_SPEC_ID", p0.a);
       persistableB.putBoolean("EXTRA_IS_PERIODIC", p0.d());
       JobInfo$Builder uBuilder = new JobInfo$Builder(p1, this.a).setRequiredNetworkType(a.c(j.b())).setRequiresCharging(j.g()).setRequiresDeviceIdle(j.h()).setExtras(persistableB);
       long l = 1;
       if (!j.h()) {
          int i = (p0.l == BackoffPolicy.LINEAR)? 0: 1;
          uBuilder.setBackoffCriteria(p0.m, i);
       }
       long l1 = Math.max((p0.a() - System.currentTimeMillis()), 0);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT <= 28) {
          uBuilder.setMinimumLatency(l1);
       }else if(l1 > 0){
          uBuilder.setMinimumLatency(l1);
       }else {
          uBuilder.setImportantWhileForeground(l);
       }
       if (sDK_INT >= 24 && j.e()) {
          Iterator iterator = j.a().b().iterator();
          while (iterator.hasNext()) {
             uBuilder.addTriggerContentUri(a.b(iterator.next()));
          }
          uBuilder.setTriggerContentUpdateDelay(j.c());
          uBuilder.setTriggerContentMaxDelay(j.d());
       }
       uBuilder.setPersisted(false);
       if (Build$VERSION.SDK_INT >= 26) {
          uBuilder.setRequiresBatteryNotLow(j.f());
          uBuilder.setRequiresStorageNotLow(j.i());
       }
       return uBuilder.build();
    }
}
