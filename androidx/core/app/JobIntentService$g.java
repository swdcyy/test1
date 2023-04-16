package androidx.core.app.JobIntentService$g;
import androidx.core.app.JobIntentService$h;
import android.content.Context;
import android.content.ComponentName;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import java.lang.String;
import java.lang.Object;
import android.app.job.JobScheduler;
import android.content.Intent;
import android.app.job.JobWorkItem;

public final class JobIntentService$g extends JobIntentService$h	// class@0006da
{
    public final JobInfo d;
    public final JobScheduler e;

    public void JobIntentService$g(Context p0,ComponentName p1,int p2){
       super(p1);
       this.b(p2);
       this.d = new JobInfo$Builder(p2, this.a).setOverrideDeadline(0).build();
       this.e = p0.getApplicationContext().getSystemService("jobscheduler");
    }
    public void a(Intent p0){
       this.e.enqueue(this.d, new JobWorkItem(p0));
    }
}
