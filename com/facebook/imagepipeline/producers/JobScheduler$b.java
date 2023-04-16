package com.facebook.imagepipeline.producers.JobScheduler$b;
import java.lang.Runnable;
import com.facebook.imagepipeline.producers.JobScheduler;
import java.lang.Object;
import java.lang.String;
import cd.a;
import java.util.concurrent.Executor;

public class JobScheduler$b implements Runnable	// class@001119
{
    public final JobScheduler b;

    public void JobScheduler$b(JobScheduler p0){
       this.b = p0;
       super();
    }
    public void run(){
       JobScheduler$b tb = this.b;
       tb.a.execute(a.a(tb.c, "JobScheduler_submitJob"));
    }
}
