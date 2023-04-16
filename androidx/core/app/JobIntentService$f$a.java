package androidx.core.app.JobIntentService$f$a;
import androidx.core.app.JobIntentService$e;
import androidx.core.app.JobIntentService$f;
import android.app.job.JobWorkItem;
import java.lang.Object;
import android.app.job.JobParameters;
import android.content.Intent;

public final class JobIntentService$f$a implements JobIntentService$e	// class@0006d8
{
    public final JobWorkItem a;
    public final JobIntentService$f b;

    public void JobIntentService$f$a(JobIntentService$f p0,JobWorkItem p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void complete(){
       JobIntentService$f b = this.b.b;
       _monitor_enter(b);
       JobIntentService$f c = this.b.c;
       if (c != null) {
          c.completeWork(this.a);
       }
       _monitor_exit(b);
       return;
    }
    public Intent getIntent(){
       return this.a.getIntent();
    }
}
