package com.xiaomi.push.service.XMJobService$a;
import android.app.job.JobService;
import android.app.Service;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import ws8.l0;
import android.os.Binder;
import android.app.job.JobParameters;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.service.XMPushService;
import android.content.Context;
import java.lang.Class;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import com.xiaomi.push.service.XMJobService$a$a;
import android.os.Handler;
import android.os.Message;

public class XMJobService$a extends JobService	// class@001143
{
    public Binder b;
    public Handler c;

    public void XMJobService$a(Service p0){
       super();
       this.b = null;
       Object[] objArray = new Object[]{new Intent()};
       this.b = l0.e(this, "onBind", objArray);
       Object[] objArray1 = new Object[]{p0};
       l0.e(this, "attachBaseContext", objArray1);
    }
    public boolean onStartJob(JobParameters p0){
       c.l("Job started "+p0.getJobId());
       Intent intent = new Intent(this, XMPushService.class);
       intent.setAction("com.xiaomi.push.timer");
       intent.setPackage(this.getPackageName());
       a.e(this, intent);
       if (this.c == null) {
          this.c = new XMJobService$a$a(this);
       }
       XMJobService$a tc = this.c;
       tc.sendMessage(Message.obtain(tc, 1, p0));
       return 1;
    }
    public boolean onStopJob(JobParameters p0){
       c.l("Job stop "+p0.getJobId());
       return false;
    }
}
