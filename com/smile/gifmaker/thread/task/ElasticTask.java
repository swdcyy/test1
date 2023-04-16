package com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.smile.gifmaker.thread.task.ElasticTask$Status;
import android.os.SystemClock;
import java.lang.Math;
import com.smile.gifmaker.thread.task.ElasticTask$a;

public class ElasticTask implements Runnable	// class@000fd3
{
    public Runnable b;
    public ElasticTask$a c;
    public String d;
    public String e;
    public long f;
    public int g;
    public long h;
    public long i;
    public long j;
    public ElasticTask$Status k;

    public void ElasticTask(Runnable p0,String p1,long p2,int p3){
       super();
       this.k = ElasticTask$Status.WAITING;
       this.b = p0;
       this.f = p2;
       this.d = p1;
       this.g = p3;
    }
    public String a(){
       return this.e;
    }
    public String b(){
       return this.d;
    }
    public int c(){
       return this.g;
    }
    public synchronized long d(){
       ElasticTask tk = this.k;
       if (tk == ElasticTask$Status.WAITING) {
          return 0;
       }
       long l = (tk == ElasticTask$Status.RUNNING)? SystemClock.elapsedRealtime(): this.j;
       return Math.max(0, (l - this.i));
    }
    public ElasticTask$Status e(){
       return this.k;
    }
    public synchronized long f(){
       if (!this.h) {
          return 0;
       }
       long l = (this.k == ElasticTask$Status.WAITING)? SystemClock.elapsedRealtime(): this.i;
       return Math.max(0, (l - this.h));
    }
    public synchronized long g(long p0,long p1){
       if (this.k == ElasticTask$Status.WAITING) {
          return 0;
       }
       p0 = Math.max(this.i, p0);
       long l = (this.k == ElasticTask$Status.RUNNING)? SystemClock.elapsedRealtime(): this.j;
       return Math.max(0, (Math.min(l, p1) - p0));
    }
    public void run(){
       ElasticTask tc = this.c;
       if (tc != null) {
          tc.a();
       }
       this.b.run();
       tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
}
