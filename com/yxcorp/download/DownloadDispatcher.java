package com.yxcorp.download.DownloadDispatcher;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.download.DownloadDispatcher$a;
import com.yxcorp.download.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.download.DownloadTask;
import java.lang.System;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Queue;
import com.yxcorp.download.DownloadDispatcher$PromoteTaskReason;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.Iterator;
import ou8.d;
import ou8.a;
import java.util.Collection;
import java.lang.Integer;

public class DownloadDispatcher	// class@0011a6
{
    public String a;
    public int b;
    public Queue c;
    public final List d;
    public b e;

    public void DownloadDispatcher(){
       super(4);
    }
    public void DownloadDispatcher(int p0){
       super("", p0);
    }
    public void DownloadDispatcher(String p0,int p1){
       super();
       this.a = "DownloadManager:DownloadDispatcher";
       this.d = new CopyOnWriteArrayList();
       DownloadDispatcher$a uoa = new DownloadDispatcher$a(this);
       uoa.n(true);
       this.e = uoa;
       this.c = new LinkedBlockingQueue();
       this.k(p1, false);
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, DownloadDispatcher.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.size() < this.b)? true: false;
       return b;
    }
    public synchronized void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "3")) {
          return;
       }
       long l = System.nanoTime();
       Log.g(this.a, "enqueue : "+p0.getDebugLogInfo()+"enqueueTime"+l);
       p0.setEnqueueTime(l);
       p0.addListener(this.e);
       if (!this.c.contains(p0) && !this.d.contains(p0)) {
          this.c.add(p0);
          this.i(DownloadDispatcher$PromoteTaskReason.Task_Enqueue);
       }
       return;
    }
    public synchronized void d(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "4")) {
          return;
       }
       Log.b(this.a, "executeImmediately : "+p0.getUrl());
       p0.addListener(this.e);
       this.c.remove(p0);
       this.d.remove(p0);
       Log.g(this.a, "xxxxx submit task, biz: "+p0.getBizType()+" type: "+p0.getDownloadTaskType());
       p0.submit();
       return;
    }
    public synchronized void e(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "8")) {
          return;
       }
       this.d.remove(p0);
       this.c.remove(p0);
       this.i(DownloadDispatcher$PromoteTaskReason.Task_Pause);
       return;
    }
    public synchronized void f(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "7")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public synchronized void g(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "6")) {
          return;
       }
       this.d.remove(p0);
       this.c.remove(p0);
       this.i(DownloadDispatcher$PromoteTaskReason.Task_Stop);
       return;
    }
    public synchronized boolean h(DownloadTask p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadDispatcher.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.contains(p0);
    }
    public synchronized void i(DownloadDispatcher$PromoteTaskReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher.class, "9")) {
          return;
       }
       Log.b(this.a, "promoteTasks mRunningQueue size: "+this.d.size()+"  mMaxParallelTaskCount:"+this.b+" promoteReason:"+p0);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          DownloadTask uDownloadTas = iterator.next();
          if (this.b()) {
             int i = 1;
             a uoa = d.a().b(i);
             if (uoa != null && uoa.strategy == i) {
                Collection[] uCollectionA = new Collection[i];
                uCollectionA[0] = this.c;
                uDownloadTas = d.a().f(uCollectionA);
                if (uDownloadTas != null) {
                   this.c.remove(uDownloadTas);
                   this.d.add(uDownloadTas);
                   Log.b(this.a, "xxxxx submit task, biz: "+uDownloadTas.getBizType()+" type: "+uDownloadTas.getDownloadTaskType());
                   uDownloadTas.submit();
                }
             }else if(uoa != null && (uoa.strategy == 2 && !d.a().c(uDownloadTas).booleanValue())){
                uDownloadTas.setMaxSpeedKbps(uoa.limitSpeed);
             }
             this.d.add(uDownloadTas);
             this.c.remove(uDownloadTas);
             Log.b(this.a, "xxxxx submit task, biz: "+uDownloadTas.getBizType()+" type: "+uDownloadTas.getDownloadTaskType());
             uDownloadTas.submit();
          }
       }
       return;
    }
    public void j(int p0){
       DownloadDispatcher uDownloadDis = DownloadDispatcher.class;
       if (PatchProxy.isSupport(uDownloadDis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadDis, "2")) {
          return;
       }
       this.k(p0, true);
       return;
    }
    public void k(int p0,boolean p1){
       DownloadDispatcher uDownloadDis = DownloadDispatcher.class;
       if (PatchProxy.isSupport(uDownloadDis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uDownloadDis, "1")) {
          return;
       }
       if (p0 < 0) {
          p0 = Integer.MAX_VALUE;
       }
       this.b = p0;
       if (p1) {
          this.i(DownloadDispatcher$PromoteTaskReason.MaxParallel_Change);
       }
       return;
    }
}
