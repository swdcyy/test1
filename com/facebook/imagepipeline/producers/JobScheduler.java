package com.facebook.imagepipeline.producers.JobScheduler;
import java.util.concurrent.Executor;
import com.facebook.imagepipeline.producers.JobScheduler$d;
import java.lang.Object;
import com.facebook.imagepipeline.producers.JobScheduler$a;
import com.facebook.imagepipeline.producers.JobScheduler$b;
import com.facebook.imagepipeline.producers.JobScheduler$JobState;
import bd.d;
import id.b;
import java.lang.Runnable;
import java.lang.String;
import cd.a;
import com.facebook.imagepipeline.producers.JobScheduler$e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import android.os.SystemClock;
import java.lang.Math;
import com.facebook.imagepipeline.producers.JobScheduler$c;
import java.lang.Enum;

public class JobScheduler	// class@00111d
{
    public final Executor a;
    public final JobScheduler$d b;
    public final Runnable c;
    public final Runnable d;
    public final int e;
    public d f;
    public int g;
    public JobScheduler$JobState h;
    public long i;
    public long j;

    public void JobScheduler(Executor p0,JobScheduler$d p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.e = p2;
       this.c = new JobScheduler$a(this);
       this.d = new JobScheduler$b(this);
       this.f = null;
       this.g = 0;
       this.h = JobScheduler$JobState.IDLE;
       this.i = 0;
       this.j = 0;
    }
    public static boolean f(d p0,int p1){
       boolean b = (!b.e(p1) && (b.m(p1, 4) || d.v(p0)))? true: false;
       return b;
    }
    public void a(){
       _monitor_enter(this);
       JobScheduler tf = this.f;
       this.f = null;
       this.g = 0;
       _monitor_exit(this);
       d.b(tf);
    }
    public final void b(long p0){
       Runnable runnable = a.a(this.d, "JobScheduler_enqueueJob");
       if (p0 - null > 0) {
          if (JobScheduler$e.a == null) {
             JobScheduler$e.a = Executors.newSingleThreadScheduledExecutor();
          }
          JobScheduler$e.a.schedule(runnable, p0, TimeUnit.MILLISECONDS);
       }else {
          runnable.run();
       }
       return;
    }
    public synchronized long c(){
       return (this.j - this.i);
    }
    public final void d(){
       long l1;
       long l = SystemClock.uptimeMillis();
       _monitor_enter(this);
       if (this.h == JobScheduler$JobState.RUNNING_AND_PENDING) {
          l1 = Math.max((this.j + (long)this.e), l);
          this.i = l;
          this.h = JobScheduler$JobState.QUEUED;
       }else {
          this.h = JobScheduler$JobState.IDLE;
          l1 = 0;
          int i = 0;
       }
       _monitor_exit(this);
       if (1) {
          this.b((l1 - l));
       }
       return;
    }
    public boolean e(){
       long l1;
       long l = SystemClock.uptimeMillis();
       _monitor_enter(this);
       boolean b = false;
       if (!JobScheduler.f(this.f, this.g)) {
          _monitor_exit(this);
          return b;
       }else {
          int i = JobScheduler$c.a[this.h.ordinal()];
          if (i != 1) {
             if (i == 3) {
                this.h = JobScheduler$JobState.RUNNING_AND_PENDING;
             }
             l1 = 0;
          }else {
             l1 = Math.max((this.j + (long)this.e), l);
             this.i = l;
             this.h = JobScheduler$JobState.QUEUED;
             b = true;
          }
          _monitor_exit(this);
          if (b) {
             this.b((l1 - l));
          }
          return true;
       }
    }
    public boolean g(d p0,int p1){
       if (!JobScheduler.f(p0, p1)) {
          return false;
       }
       _monitor_enter(this);
       JobScheduler tf = this.f;
       this.f = d.a(p0);
       this.g = p1;
       _monitor_exit(this);
       d.b(tf);
       return true;
    }
}
