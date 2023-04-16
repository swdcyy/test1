package com.xiaomi.push.service.XMJobService$a$a;
import android.os.Handler;
import android.app.job.JobService;
import android.os.Looper;
import android.os.Message;
import android.app.job.JobParameters;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import ws8.d4;

public class XMJobService$a$a extends Handler	// class@001142
{
    public JobService a;

    public void XMJobService$a$a(JobService p0){
       this.a = p0;
    }
    public void handleMessage(Message p0){
       if (p0.what != 1) {
       }else {
          p0 = p0.obj;
          c.l("Job finished "+p0.getJobId());
          this.a.jobFinished(p0, false);
          if (p0.getJobId() == 1) {
             d4.d(false);
          }
       }
       return;
    }
}
