package androidx.core.app.JobIntentService$f;
import androidx.core.app.JobIntentService$b;
import android.app.job.JobServiceEngine;
import androidx.core.app.JobIntentService;
import android.app.Service;
import java.lang.Object;
import android.os.IBinder;
import androidx.core.app.JobIntentService$e;
import android.app.job.JobWorkItem;
import android.app.job.JobParameters;
import android.content.Intent;
import java.lang.ClassLoader;
import androidx.core.app.JobIntentService$f$a;

public final class JobIntentService$f extends JobServiceEngine implements JobIntentService$b	// class@0006d9
{
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public void JobIntentService$f(JobIntentService p0){
       super(p0);
       this.b = new Object();
       this.a = p0;
    }
    public IBinder a(){
       return this.getBinder();
    }
    public JobIntentService$e b(){
       JobIntentService$f tb = this.b;
       _monitor_enter(tb);
       JobIntentService$f tc = this.c;
       JobIntentService$e uoe = null;
       if (tc == null) {
          _monitor_exit(tb);
          return uoe;
       }else {
          JobWorkItem jobWorkItem = tc.dequeueWork();
          _monitor_exit(tb);
          if (jobWorkItem == null) {
             return uoe;
          }
          jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
          return new JobIntentService$f$a(this, jobWorkItem);
       }
    }
    public boolean onStartJob(JobParameters p0){
       this.c = p0;
       this.a.c(false);
       return true;
    }
    public boolean onStopJob(JobParameters p0){
       this.a.b();
       JobIntentService$f tb = this.b;
       _monitor_enter(tb);
       this.c = null;
       _monitor_exit(tb);
       return true;
    }
}
