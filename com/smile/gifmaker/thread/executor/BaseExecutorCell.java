package com.smile.gifmaker.thread.executor.BaseExecutorCell;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import java.util.LinkedList;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$b;
import java.lang.Enum;
import bm8.g;
import bm8.h;
import bm8.e;
import bm8.d;
import bm8.f;
import bm8.a;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import com.smile.gifmaker.thread.task.ElasticTask;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$a;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.String;
import com.smile.gifmaker.thread.task.ElasticTask$Status;
import java.lang.Thread;
import am8.b;
import fm8.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import em8.a$a;
import em8.a;
import java.lang.StringBuilder;

public abstract class BaseExecutorCell implements Recordable	// class@000fcd
{
    public List a;
    public int b;
    public ThreadPoolExecutor c;
    public long d;
    public int e;
    public long f;
    public long g;
    public Recordable$RecordStatus h;

    public void BaseExecutorCell(int p0){
       super();
       this.a = new LinkedList();
       this.f = 0;
       this.g = Long.MAX_VALUE;
       this.h = Recordable$RecordStatus.UNINITIATED;
       this.b = p0;
    }
    public static BaseExecutorCell d(int p0,BaseExecutorCell$ExecutorType p1){
       switch (BaseExecutorCell$b.a[p1.ordinal()]){
           case 1:
             return new a(p0);
           case 2:
             return new f(p0);
           case 3:
             return new d(p0);
           case 4:
             return new e(p0);
           case 5:
             return new h(p0);
           case 6:
             return new g(p0);
           default:
             return null;
       }
    }
    public synchronized void a(){
       this.f = SystemClock.elapsedRealtime();
       this.g = Long.MAX_VALUE;
       this.d = 0;
       this.e = 0;
       this.h = Recordable$RecordStatus.RECORDING;
    }
    public synchronized void b(){
       this.g = SystemClock.elapsedRealtime();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          long l = this.d + iterator.next().g(this.f, this.g);
          this.d = l;
       }
       this.h = Recordable$RecordStatus.RECORD_END;
       return;
    }
    public abstract boolean c(ElasticTask p0);
    public synchronized boolean e(ElasticTask p0){
       if (!this.c(p0)) {
          return false;
       }
       p0.c = new BaseExecutorCell$a(this, p0);
       this.k(p0);
       this.c.execute(p0);
       return true;
    }
    public int f(){
       return this.b;
    }
    public abstract String g();
    public synchronized int h(){
       return this.a.size();
    }
    public synchronized void i(ElasticTask p0){
       _monitor_enter(p0);
       p0.k = ElasticTask$Status.RUNNING;
       p0.i = SystemClock.elapsedRealtime();
       _monitor_exit(p0);
       int i = p0.c();
       Thread thread = Thread.currentThread();
       if (!i) {
          thread.setPriority(b.g);
       }else if(i == 1){
          thread.setPriority(b.h);
       }else if(i == 2){
          thread.setPriority(b.i);
       }else if(i == 3){
          thread.setPriority(b.j);
       }else if(i == 999){
          thread.setPriority(b.k);
       }
       thread.setName(p0.b());
       return;
    }
    public synchronized void j(ElasticTask p0){
       String str;
       _monitor_enter(p0);
       p0.k = ElasticTask$Status.COMPLETE;
       p0.j = SystemClock.elapsedRealtime();
       _monitor_exit(p0);
       if (b.c) {
          str = d.a(p0, false);
          if (!TextUtils.isEmpty(str)) {
             a$a uoa1 = a.a();
             if (uoa1 != null) {
                uoa1.logCustomEvent("kwai_elastic_task_normal", str);
             }
          }
       }
       if (b.d && p0.d() - 0x186a0 > 0) {
          str = d.a(p0, true);
          if (!TextUtils.isEmpty(str)) {
             a$a uoa = a.a();
             if (uoa != null) {
                uoa.logCustomEvent("kwai_elastic_task_warning", str);
             }
          }
       }
       this.a.remove(p0);
       if (this.h == Recordable$RecordStatus.RECORDING) {
          this.d = this.d + p0.g(this.f, this.g);
          this.e = this.e + true;
       }
       return;
    }
    public synchronized void k(ElasticTask p0){
       this.a.add(p0);
    }
    public synchronized void l(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          ElasticTask uElasticTask = iterator.next();
          "ElasticTask print working task:"+uElasticTask.b()+" ## status:"+uElasticTask.e()+" ## executeTime:"+uElasticTask.d()+" ## waiTime:"+uElasticTask.f();
          this.g();
       }
       return;
    }
}
