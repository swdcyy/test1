package com.yxcorp.gifshow.longinus.LonginusWorkManager;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.longinus.SpUtil;
import kotlin.Pair;
import java.lang.Boolean;
import gx7.d;
import com.yxcorp.gifshow.longinus.LonginusWorkManager$doWork$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.yxcorp.gifshow.longinus.LonginusLog;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import usd.q;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.yxcorp.gifshow.longinus.LonginusJobService;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import java.lang.Throwable;
import android.app.AlarmManager;
import android.content.Intent;
import com.yxcorp.gifshow.longinus.LonginusAlarmReceiver;
import android.app.PendingIntent;

public final class LonginusWorkManager	// class@001b76
{
    public static final LonginusWorkManager a;

    static {
       LonginusWorkManager.a = new LonginusWorkManager();
    }
    public void LonginusWorkManager(){
       super();
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LonginusWorkManager.class, "2")) {
          return;
       }
       a.p(p0, "applicationContext");
       if (!SpUtil.c(SpUtil.b, p0, 0, 2, null).getFirst().booleanValue()) {
          a.f(d.b, null, null, new LonginusWorkManager$doWork$1(p0, null), 3, null);
       }else {
          LonginusLog.d("longinus", "in silence, not request");
          this.c(p0);
       }
       return;
    }
    public final long b(Context p0){
       long l;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj1 = PatchProxy.applyOneRefs(obj, this, LonginusWorkManager.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1.longValue();
       }
       obj1 = "context";
       a.p(obj, obj1);
       SpUtil b = SpUtil.b;
       Objects.requireNonNull(b);
       Object obj2 = PatchProxy.applyOneRefs(obj, b, SpUtil.class, "4");
       if (obj2 != patchProxyRe) {
          l = obj2.longValue();
       }else {
          a.p(obj, obj1);
          l = o.c(obj, "longins_sp", 0).getLong("last_request_time", 0);
       }
       long l1 = l;
       long l2 = System.currentTimeMillis();
       long l3 = b.a(obj);
       Pair pair = SpUtil.c(b, p0, 0, 2, null);
       if (pair.getFirst().booleanValue()) {
          l = q.o(TimeUnit.MINUTES.toMillis(pair.getSecond().longValue()), q.o((l3 - (l2 - l1)), 0));
       }else {
          pair = b.b(obj, (l2 + l3));
          l = (pair.getFirst().booleanValue())? pair.getSecond().longValue() + l3: q.o((l3 - (l2 - l1)), 0);
       }
       LonginusLog.d("longinus", "work initial delay="+TimeUnit.MILLISECONDS.toMinutes(l)+" minutes");
       return l;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LonginusWorkManager.class, "1")) {
          return;
       }
       a.p(p0, "applicationContext");
       long l = this.b(p0);
       JobScheduler jobScheduler = null;
       int i = 0;
       if (Build$VERSION.SDK_INT >= 23) {
          ComponentName systemServic = p0.getSystemService("jobscheduler");
          if (systemServic instanceof JobScheduler) {
             jobScheduler = systemServic;
          }
          systemServic = new ComponentName(p0, LonginusJobService.class);
          if (jobScheduler != null) {
             jobScheduler.cancel(0x4a4137da);
          }
          JobInfo jobInfo = new JobInfo$Builder(0x4a4137da, systemServic).setMinimumLatency(l).setBackoffCriteria(SpUtil.b.a(p0), i).build();
          if (jobScheduler != null) {
             jobScheduler.schedule(jobInfo);
          }
       }else {
          Object systemServic1 = p0.getSystemService("alarm");
          if (systemServic1 instanceof AlarmManager) {
             jobScheduler = systemServic1;
          }
          PendingIntent broadcast = PendingIntent.getBroadcast(p0, i, new Intent(p0, LonginusAlarmReceiver.class), 0x8000000);
          long l1 = System.currentTimeMillis();
          if (jobScheduler != null) {
             jobScheduler.setExact(1, (l1 + l), broadcast);
          }
       }
    label_0085 :
       return;
    }
}
