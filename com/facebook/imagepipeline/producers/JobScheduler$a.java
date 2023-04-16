package com.facebook.imagepipeline.producers.JobScheduler$a;
import java.lang.Runnable;
import com.facebook.imagepipeline.producers.JobScheduler;
import java.lang.Object;
import java.util.Objects;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.JobScheduler$JobState;
import bd.d;
import com.facebook.imagepipeline.producers.JobScheduler$d;

public class JobScheduler$a implements Runnable	// class@001118
{
    public final JobScheduler b;

    public void JobScheduler$a(JobScheduler p0){
       this.b = p0;
       super();
    }
    public void run(){
       JobScheduler$a tb = this.b;
       Objects.requireNonNull(tb);
       _monitor_enter(tb);
       JobScheduler f = tb.f;
       JobScheduler g = tb.g;
       tb.f = null;
       tb.g = 0;
       tb.h = JobScheduler$JobState.RUNNING;
       tb.j = SystemClock.uptimeMillis();
       _monitor_exit(tb);
       if (JobScheduler.f(f, g)) {
          tb.b.a(f, g);
       }
       d.b(f);
       tb.d();
       return;
    }
}
