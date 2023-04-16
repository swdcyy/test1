package com.yxcorp.download.i;
import com.yxcorp.download.g$a;
import com.yxcorp.download.DownloadDispatcher;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadConfig;
import java.lang.String;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.download.i$d;
import ekd.s1;
import android.os.Looper;
import android.os.HandlerThread;
import java.util.concurrent.PriorityBlockingQueue;
import com.yxcorp.download.h;
import java.util.Comparator;
import java.util.concurrent.LinkedBlockingDeque;
import com.yxcorp.download.i$e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.j;
import android.os.Handler;
import android.os.Message;
import mu8.q;
import java.lang.StringBuilder;
import mu8.n;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.Queue;
import java.util.Deque;
import com.yxcorp.download.DownloadDispatcher$PromoteTaskReason;
import com.yxcorp.download.DownloadTask;
import java.lang.System;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.b;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mu8.t;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import mu8.v;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.lang.Integer;
import ou8.d;
import ou8.a;
import java.lang.Math;
import java.lang.Float;
import java.util.Iterator;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import mu8.r;
import java.util.Collection;
import com.yxcorp.download.i$c;
import java.util.Collections;
import com.yxcorp.download.i$a;
import com.yxcorp.download.i$b;
import mu8.s;

public final class i extends DownloadDispatcher implements g$a	// class@0011c5
{
    public final List f;
    public Deque g;
    public Deque h;
    public boolean i;
    public boolean j;
    public DownloadTask$DownloadBizExtra$DownloadUpBizFt k;
    public Runnable l;
    public Handler m;
    public static final boolean n;

    static {
       i.n = DownloadManager.h.j;
    }
    public void i(String p0,int p1){
       super(p0, p1);
       this.f = new CopyOnWriteArrayList();
       this.i = false;
       this.j = false;
       DownloadTask$DownloadBizExtra$DownloadUpBizFt uDownloadBiz = null;
       this.k = uDownloadBiz;
       this.l = uDownloadBiz;
       this.m = new i$d(this, s1.b().getLooper());
       this.c = new PriorityBlockingQueue(10, h.b);
       this.g = new LinkedBlockingDeque();
       this.h = new LinkedBlockingDeque();
       if (i.n) {
          i$e uoe = new i$e(this);
          if (!PatchProxy.applyVoid(uDownloadBiz, uoe, i$e.class, "1")) {
             uoe.a.start();
             j oj = new j(uoe, uoe.a.getLooper());
             uoe.b = oj;
             oj.sendMessageDelayed(Message.obtain(oj, 1), 1000);
          }
       }
       return;
    }
    public void a(q p0,q p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "7")) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "before onNetworkFocusChange :  ## formerFocusHost:"+n.a(p0.a())+" ## changedFocusHost:"+n.a(p1.a()));
       Log.b("DownloadManager:PreDownloadDispatcher", "before onNetworkFocusChange:   mRunningQueueSize: "+this.d.size()+"  mPauseQueueSize:"+this.f.size()+"  mWaitingQueueSize:"+this.c.size()+"  mInitWaitingQueue:"+this.g.size()+"  mUtilityWaitingQueue:"+this.h.size());
       this.i(DownloadDispatcher$PromoteTaskReason.Focus_Change);
       return;
    }
    public synchronized void c(DownloadTask p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       long l = System.nanoTime();
       Log.b("DownloadManager:PreDownloadDispatcher", "enqueue: "+p0.getDebugLogInfo()+" enqueueTime: "+l);
       DownloadTask$DownloadBizExtra bizExtra = p0.getBizExtra();
       p0.setEnqueueTime(l);
       p0.addListener(this.e);
       if (!this.c.contains(p0) && (!this.g.contains(p0) && (!this.h.contains(p0) && (!this.d.contains(p0) && !this.f.contains(p0))))) {
          if (p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
             this.j = true;
             this.g.add(p0);
             i = this.g.size();
          }else if(p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.ENQUEUE){
             this.h.add(p0);
             i = this.h.size();
          }else {
             this.c.add(p0);
             i = this.c.size();
          }
          this.s(p0);
          Log.g("DownloadManager:PreDownloadDispatcher", "enqueue success: "+p0.getUrl()+" waitingIndex: "+i);
          this.i(DownloadDispatcher$PromoteTaskReason.Task_Enqueue);
       }else if(p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && (bizExtra != null && bizExtra.isPluginLaunchBizFtUpdate != null)){
          Log.g("DownloadManager:PreDownloadDispatcher", "enqueue old task. promot for launchBizFt update. url: "+p0.getUrl());
          p0.isPluginLaunchBizFtUpdate = false;
          this.i(DownloadDispatcher$PromoteTaskReason.LaunchBizFt_Update);
       }
       return;
    }
    public synchronized void d(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "executeImmediately: "+p0.getUrl());
       this.d.remove(p0);
       this.f.remove(p0);
       this.c.remove(p0);
       this.g.remove(p0);
       this.h.remove(p0);
       this.s(p0);
       if (p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
          this.i = true;
       }
       Log.g("DownloadManager:PreDownloadDispatcher", "xxxxx submit task, "+p0.getDebugLogInfo());
       p0.submit();
       return;
    }
    public synchronized void e(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "xxxxx task pause, biz: "+p0.getBizType()+" type: "+p0.getDownloadTaskType()+" url: "+p0.getUrl());
       if (this.f.contains(p0)) {
          this.d.remove(p0);
          this.c.remove(p0);
          this.g.remove(p0);
          this.h.remove(p0);
       }
       this.i(DownloadDispatcher$PromoteTaskReason.Task_Pause);
       return;
    }
    public synchronized void f(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "xxxxx task start, biz: "+p0.getBizType()+" type: "+p0.getDownloadTaskType()+" url: "+p0.getUrl());
       if (p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
          this.i = true;
       }
       if (this.d.contains(p0)) {
          this.f.remove(p0);
          this.c.remove(p0);
          this.g.remove(p0);
          this.h.remove(p0);
       }
       return;
    }
    public synchronized void g(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "xxxxx task stop, biz: "+p0.getBizType()+" type: "+p0.getDownloadTaskType()+" url: "+p0.getUrl());
       if (p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
          this.i = false;
       }
       this.d.remove(p0);
       this.c.remove(p0);
       this.f.remove(p0);
       this.g.remove(p0);
       this.h.remove(p0);
       this.i(DownloadDispatcher$PromoteTaskReason.Task_Stop);
       return;
    }
    public synchronized boolean h(DownloadTask p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c.contains(p0) && (this.h.contains(p0) || this.g.contains(p0)))? true: false;
       return b;
    }
    public synchronized void i(DownloadDispatcher$PromoteTaskReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       c.k(new t(this, p0));
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, i.class, "12")) {
          return;
       }
       this.k = null;
       if (this.l != null) {
          s1.c().removeCallbacks(this.l);
          this.l = null;
       }
       return;
    }
    public void m(DownloadTask p0){
       int i;
       DownloadConfig v;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "20")) {
          return;
       }
       if (DownloadManager.i().z == null) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "downgradeTask : "+p0.getUrl());
       String bizType = p0.getBizType();
       a obj = PatchProxy.applyOneRefs(bizType, null, v.class, "3");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          v = DownloadManager.h.v;
          if (!TextUtils.isEmpty(bizType) && v.containsKey(bizType)) {
             int i1 = v.get(bizType).intValue();
             if (i1 < 0) {
                i1 = Integer.MAX_VALUE;
             }
             int c = v.c;
             if (i1 < c) {
                i1 = c;
             }
             Log.b("DownloadManager:PreDownloadSpeedManager", "get limit speed according to biz-type ## Task biz-type:"+bizType+" ## limit speed :"+i1);
             i = i1;
          }else {
             i = 0;
          }
       }
       if (i <= 0) {
          i = v.b();
       }
       obj = d.a().b(0);
       if (obj != null && (obj.strategy == 2 && !d.a().c(p0).booleanValue())) {
          i = Math.min(obj.limitSpeed, i);
       }
    label_00b6 :
       if (DownloadManager.i().y != null) {
          p0.setTaskQosClass(0);
       }
       p0.setMaxSpeedKbps(i);
       return;
    }
    public final float n(DownloadTask p0,int p1,boolean p2){
       DownloadConfig obj;
       float f1;
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, i.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = (!n.c(p1, p0.getHostType()) || ((~ p0.getHostType()) & p1) > 0)? 1: 0;
       if (!obj) {
          Log.b("DownloadManager:PreDownloadDispatcher", "ignoreHost match. return 1.0, no limit");
          return 0x3f800000;
       }else {
          obj = Float.NaN;
          DownloadTask$DownloadTaskType downloadTask = p0.getDownloadTaskType();
          float f = 0;
          if (downloadTask == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
             if (n.c(p1, 6)) {
                obj = DownloadManager.i().o;
             }else if(n.c(p1, 8)){
                if (p2 && DownloadManager.i().q != null) {
                   Log.g("DownloadManager:PreDownloadDispatcher", "getSpeedFactor return 0 for badNetWork");
                   f1 = 0;
                }else {
                   f1 = DownloadManager.i().m;
                }
             }
          }else if(downloadTask == DownloadTask$DownloadTaskType.ENQUEUE){
             if (n.c(p1, 6)) {
                f1 = DownloadManager.i().p;
             }else if(n.c(p1, 8)){
                f1 = DownloadManager.i().n;
             }
          }
          if (Float.isNaN(obj)) {
             Log.b("DownloadManager:PreDownloadDispatcher", "speed factor is Float.NaN");
          }else {
             f = obj;
          }
          return f;
       }
    }
    public final DownloadTask o(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.iterator();
       while (obj.hasNext()) {
          DownloadTask uDownloadTas = obj.next();
          if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && (objArray == null || uDownloadTas.getInitPriority() < objArray.getInitPriority())) {
             objArray = uDownloadTas;
          }
       }
       return objArray;
    }
    public final void p(int p0,boolean p1,DownloadDispatcher$PromoteTaskReason p2){
       StringBuilder str1;
       DownloadDispatcher$PromoteTaskReason initParallel;
       int i1;
       i oi = this;
       boolean b = p1;
       int i = p2;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, i.class, "13")) {
          return;
       }
       Iterator iterator = oi.f.iterator();
       while (iterator.hasNext()) {
          DownloadTask uDownloadTas = iterator.next();
          boolean b1 = false;
          String str = 1;
          if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
             if (DownloadManager.t()) {
                DownloadTask uDownloadTas1 = this.o();
                if (uDownloadTas1 == null) {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download with none running task");
                }else if(uDownloadTas1.getInitPriority() == uDownloadTas.getInitPriority()){
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download with same init priority");
                }else {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download fail");
                   str1 = null;
                label_006c :
                   if (DownloadManager.i().w > null) {
                      DownloadTask$DownloadBizExtra$DownloadUpBizFt pluginLaunch = (uDownloadTas.getBizExtra() != null)? uDownloadTas.getBizExtra().getPluginLaunchBizFt(): null;
                      if (!str1) {
                         initParallel = DownloadDispatcher$PromoteTaskReason.InitParallel_Timeout;
                         if (i != initParallel && (oi.l == null && pluginLaunch != null)) {
                            r or = new r(oi);
                            oi.l = or;
                            oi.k = pluginLaunch;
                            long l = (long)DownloadManager.i().w * 1000;
                            s1.e(or, l);
                            Log.b("DownloadManager:PreDownloadDispatcher", "Init Parallel Timeout Promote start. url: "+uDownloadTas.getUrl());
                         }
                      label_00bf :
                         if (i == initParallel && pluginLaunch == oi.k) {
                            Log.g("DownloadManager:PreDownloadDispatcher", "Init task parallel download for timeout. url: "+uDownloadTas.getUrl());
                         label_00dd :
                            str1 = 1;
                         }
                      }else if(i != DownloadDispatcher$PromoteTaskReason.InitParallel_Timeout && pluginLaunch == oi.k){
                         Log.b("DownloadManager:PreDownloadDispatcher", "Init Parallel Timeout Promote Cancle. url: "+uDownloadTas.getUrl());
                         this.l();
                      }
                   }
                }
                str1 = 1;
                goto label_006c ;
             }else {
                i1 = oi.i ^ str;
                Log.b("DownloadManager:PreDownloadDispatcher", "Init task serial download");
             }
          }else if(this.b() && oi.i == null){
             goto label_00dd ;
          }else {
             i1 = 0;
          }
          if (str1) {
             String int pluginLaunch1 = "Recover Task Limit Speed: ";
             initParallel = -1;
             String str2 = " url: ";
             String str3 = " type: ";
             String str4 = " ## taskHost:";
             if (!n.b(p0)) {
                Log.b("DownloadManager:PreDownloadDispatcher", "Iterate paused-task : "+uDownloadTas.getUrl()+" ## No one takes focus£¬paused-task should downgrade and resume ## networkHost:"+n.a(p0)+str4+n.a(uDownloadTas.getHostType()));
                if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                   if (b) {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Background paused-task keep paused due to bad net work.");
                      this.q();
                   }else {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Background paused-task downgrade.");
                      oi.m(uDownloadTas);
                   }
                }
                if (uDownloadTas.limitSpeedByFactor != null) {
                   uDownloadTas.limitSpeedByFactor = b1;
                   uDownloadTas.setMaxSpeedKbps(initParallel);
                   Log.b("DownloadManager:PreDownloadDispatcher", pluginLaunch1+uDownloadTas.getUrl());
                }
                Log.b("DownloadManager:PreDownloadDispatcher", "paused-task resume.");
                oi.f.remove(uDownloadTas);
                oi.d.add(uDownloadTas);
                Log.b("DownloadManager:PreDownloadDispatcher", "xxxxx submit task, biz: "+uDownloadTas.getBizType()+str3+uDownloadTas.getDownloadTaskType()+str2+uDownloadTas.getUrl());
                uDownloadTas.submit();
             }else {
                float f = oi.n(uDownloadTas, p0, b);
                String str5 = " ## speedFactor:";
                String str6 = "Iterate paused-tasks: ";
                if (f <= 0) {
                   Log.b("DownloadManager:PreDownloadDispatcher", str6+uDownloadTas.getUrl()+" ## Focus has been taken, irrelevant paused_tasks just keep paused.  ## networkHost:"+n.a(p0)+str4+n.a(uDownloadTas.getHostType())+str5+f);
                }else {
                   Log.b("DownloadManager:PreDownloadDispatcher", str6+uDownloadTas.getUrl()+" ## Focus has been taken, relevant paused_tasks should upgrade and resume.  ## networkHost:"+n.a(p0)+str4+n.a(uDownloadTas.getHostType())+str5+f);
                   if (f > 0 && f - 0x3f800000 < 0) {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Limit paused-task Speed: "+uDownloadTas.getUrl());
                      pluginLaunch1 = v.a();
                      if (pluginLaunch1 > 0) {
                         f = f * (float)pluginLaunch1;
                         uDownloadTas.setMaxSpeedKbps((int)f);
                         uDownloadTas.limitSpeedByFactor = true;
                      }
                   }else if(uDownloadTas.limitSpeedByFactor != null){
                      uDownloadTas.limitSpeedByFactor = false;
                      uDownloadTas.setMaxSpeedKbps(-1);
                      Log.b("DownloadManager:PreDownloadDispatcher", pluginLaunch1+uDownloadTas.getUrl());
                   }
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                      oi.u(uDownloadTas);
                   }
                   oi.f.remove(uDownloadTas);
                   oi.d.add(uDownloadTas);
                   Log.b("DownloadManager:PreDownloadDispatcher", "xxxxx submit task, biz: "+uDownloadTas.getBizType()+str3+uDownloadTas.getDownloadTaskType()+str2+uDownloadTas.getUrl());
                   uDownloadTas.submit();
                }
             }
          }
          i1 = p0;
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, i.class, "23")) {
          return;
       }
       this.m.removeMessages(1);
       i tm = this.m;
       tm.sendMessageDelayed(Message.obtain(tm, 1), 5000);
       return;
    }
    public final void r(int p0,boolean p1,DownloadDispatcher$PromoteTaskReason p2){
       int i;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, i.class, "11")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          DownloadTask uDownloadTas = iterator.next();
          String str = "Recover Task Limit Speed: ";
          i = -1;
          String str1 = " ## taskHost:";
          if (!n.b(p0)) {
             Log.b("DownloadManager:PreDownloadDispatcher", "Iterate running-task : "+uDownloadTas.getUrl()+" ## No one takes focus£¬running-task should downgrade and keep running ## networkHost:"+n.a(p0)+str1+n.a(uDownloadTas.getHostType()));
             if (uDownloadTas.limitSpeedByFactor != null) {
                uDownloadTas.limitSpeedByFactor = false;
                uDownloadTas.setMaxSpeedKbps(i);
                Log.b("DownloadManager:PreDownloadDispatcher", str+uDownloadTas.getUrl());
             }
             if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                if (p1) {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Background running-task paused due to bad net work.");
                   uDownloadTas.pause();
                   this.d.remove(uDownloadTas);
                   this.f.add(uDownloadTas);
                   this.q();
                }else {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Background running-task downgraded.");
                   this.m(uDownloadTas);
                }
             }
          }else {
             float f = this.n(uDownloadTas, p0, p1);
             String str2 = null;
             String str3 = "Iterate running-task: ";
             if (f - str2 <= 0) {
                Log.b("DownloadManager:PreDownloadDispatcher", str3+uDownloadTas.getUrl()+" ## Focus has been taken, irrelevant running_tasks should pause.  ## networkHost:"+n.a(p0)+str1+n.a(uDownloadTas.getHostType())+" ## speedFactor:"+f);
                uDownloadTas.pause();
                this.d.remove(uDownloadTas);
                if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
                   this.f.add(false, uDownloadTas);
                }else {
                   this.f.add(uDownloadTas);
                }
             }else if(f - str2 > 0 && f - 0x3f800000 < 0){
                Log.b("DownloadManager:PreDownloadDispatcher", str3+uDownloadTas.getUrl()+" ## Focus has been taken, relevant running_tasks should limit speed.  ## networkHost:"+n.a(p0)+str1+n.a(uDownloadTas.getHostType())+" ## speedFactor:"+f);
                int i1 = v.a();
                if (i1 > 0) {
                   f = f * (float)i1;
                   uDownloadTas.setMaxSpeedKbps((int)f);
                   uDownloadTas.limitSpeedByFactor = true;
                }
             }else {
                Log.b("DownloadManager:PreDownloadDispatcher", str3+uDownloadTas.getUrl()+" ## Focus has been taken, relevant running_tasks should upgrade and keep running.  ## networkHost:"+n.a(p0)+str1+n.a(uDownloadTas.getHostType())+" ## speedFactor:"+f);
                if (uDownloadTas.limitSpeedByFactor != null) {
                   uDownloadTas.limitSpeedByFactor = false;
                   uDownloadTas.setMaxSpeedKbps(i);
                   Log.b("DownloadManager:PreDownloadDispatcher", str+uDownloadTas.getUrl());
                }
                if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                   this.u(uDownloadTas);
                }
             }
          }
       }
       return;
    }
    public final void s(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       p0.setHostType((p0.getHostType() | DownloadManager.g(p0.getDownloadTaskType())));
       return;
    }
    public final void t(){
       CopyOnWriteArrayList uCopyOnWrite;
       Iterator iterator;
       DownloadTask uDownloadTas;
       DownloadTask uDownloadTas2;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "17")) {
          return;
       }
       String str = "DownloadManager:PreDownloadDispatcher";
       if (this.j == null) {
          Log.b(str, "sortInitPriorityTask enable is false");
          return;
       }else {
          Object[] objArray1 = PatchProxy.apply(objArray, this, oi, "16");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             Iterator iterator2 = this.d.iterator();
             while (iterator2.hasNext()) {
                uDownloadTas2 = iterator2.next();
                if (uDownloadTas2.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && (objArray == null || uDownloadTas2.getInitPriority() < objArray.getInitPriority())) {
                   objArray = uDownloadTas2;
                }
             }
             iterator2 = this.f.iterator();
             while (iterator2.hasNext()) {
                uDownloadTas2 = iterator2.next();
                if (uDownloadTas2.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && (objArray == null || uDownloadTas2.getInitPriority() < objArray.getInitPriority())) {
                   objArray = uDownloadTas2;
                }
             }
             iterator2 = this.g.iterator();
             while (iterator2.hasNext()) {
                uDownloadTas2 = iterator2.next();
                if (objArray == null || uDownloadTas2.getInitPriority() < objArray.getInitPriority()) {
                   objArray = uDownloadTas2;
                }
             }
             objArray1 = objArray;
          }
          if (objArray1 != null && objArray1.getInitPriority() < Integer.MAX_VALUE) {
             Log.b(str, "sortInitPriorityTask. HighPriorityTask Url :"+objArray1.getUrl());
             String str1 = "Init task pause with init priority, url :";
             if (this.d.contains(objArray1) || this.f.contains(objArray1)) {
                uCopyOnWrite = new CopyOnWriteArrayList();
                iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   uDownloadTas = iterator.next();
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && uDownloadTas.getInitPriority() > objArray1.getInitPriority()) {
                      Log.g(str, str1+uDownloadTas.getUrl());
                      uDownloadTas.pause();
                      uCopyOnWrite.add(uDownloadTas);
                   }
                }
                if (uCopyOnWrite.size() > 0) {
                   this.d.removeAll(uCopyOnWrite);
                   uCopyOnWrite.addAll(this.f);
                   this.f.clear();
                   this.f.addAll(uCopyOnWrite);
                }
                Collections.sort(this.f, new i$a(this));
                if (this.g.size() > 0) {
                   CopyOnWriteArrayList uCopyOnWrite1 = new CopyOnWriteArrayList(this.g);
                   Collections.sort(uCopyOnWrite1, new i$b(this));
                   this.g.clear();
                   this.g.addAll(uCopyOnWrite1);
                }
             }else if(this.g.contains(objArray1)){
                uCopyOnWrite = new CopyOnWriteArrayList();
                iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   uDownloadTas = iterator.next();
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && uDownloadTas.getInitPriority() > objArray1.getInitPriority()) {
                      uDownloadTas.pause();
                      Log.g(str, str1+uDownloadTas.getUrl());
                      uCopyOnWrite.add(uDownloadTas);
                   }
                }
                if (uCopyOnWrite.size() > 0) {
                   this.d.removeAll(uCopyOnWrite);
                }
                CopyOnWriteArrayList uCopyOnWrite2 = new CopyOnWriteArrayList();
                Iterator iterator1 = this.f.iterator();
                while (iterator1.hasNext()) {
                   DownloadTask uDownloadTas1 = iterator1.next();
                   if (uDownloadTas1.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && uDownloadTas1.getInitPriority() > objArray1.getInitPriority()) {
                      uCopyOnWrite2.add(uDownloadTas1);
                   }
                }
                if (uCopyOnWrite2.size() > 0) {
                   this.f.removeAll(uCopyOnWrite2);
                   uCopyOnWrite.addAll(uCopyOnWrite2);
                }
                if (uCopyOnWrite.size() > 0 || this.g.size() > 0) {
                   uCopyOnWrite.addAll(this.g);
                   Collections.sort(uCopyOnWrite, new i$c(this));
                   this.g.clear();
                   this.g.addAll(uCopyOnWrite);
                }
             }
          }
          return;
       }
    }
    public void u(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "19")) {
          return;
       }
       if (DownloadManager.i().z == null) {
          return;
       }
       Log.b("DownloadManager:PreDownloadDispatcher", "upgradeTask : "+p0.getUrl());
       a uoa = -1;
       a uoa1 = d.a().b(0);
       if (uoa1 != null && (uoa1.strategy == 2 && !d.a().c(p0).booleanValue())) {
          uoa = uoa1.limitSpeed;
       }
    label_004f :
       if (DownloadManager.i().y != null) {
          p0.setTaskQosClass(1);
       }
       p0.setMaxSpeedKbps(uoa);
       return;
    }
    public final void v(Queue p0,int p1,boolean p2,DownloadDispatcher$PromoteTaskReason p3){
       boolean this;
       StringBuilder str;
       int i1;
       Iterator iterator1;
       i oi = this;
       Object obj = p0;
       boolean b = p2;
       int i = p3;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, i.class, "14")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          DownloadTask uDownloadTas = iterator.next();
          boolean b1 = false;
          this = true;
          if (obj.equals(oi.g)) {
             if (DownloadManager.t()) {
                DownloadTask uDownloadTas1 = this.o();
                if (uDownloadTas1 == null) {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download with none running task");
                }else if(uDownloadTas1.getInitPriority() == uDownloadTas.getInitPriority()){
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download with same init priority");
                }else {
                   Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download fail");
                   str = null;
                label_006e :
                   if (DownloadManager.i().w > null) {
                      DownloadTask$DownloadBizExtra$DownloadUpBizFt pluginLaunch = (uDownloadTas.getBizExtra() != null)? uDownloadTas.getBizExtra().getPluginLaunchBizFt(): null;
                      if (!str) {
                         DownloadDispatcher$PromoteTaskReason initParallel = DownloadDispatcher$PromoteTaskReason.InitParallel_Timeout;
                         if (i != initParallel && (oi.l == null && pluginLaunch != null)) {
                            s os = new s(oi);
                            oi.l = os;
                            oi.k = pluginLaunch;
                            long l = (long)DownloadManager.i().w * 1000;
                            s1.e(os, l);
                            Log.b("DownloadManager:PreDownloadDispatcher", "Init Parallel Timeout Promote start. url: "+uDownloadTas.getUrl());
                         }
                      label_00c1 :
                         if (i == initParallel && pluginLaunch == oi.k) {
                            Log.b("DownloadManager:PreDownloadDispatcher", "Init task parallel download for timeout. url: "+uDownloadTas.getUrl());
                         label_00df :
                            str = 1;
                         }
                      }else if(i != DownloadDispatcher$PromoteTaskReason.InitParallel_Timeout && pluginLaunch == oi.k){
                         Log.b("DownloadManager:PreDownloadDispatcher", "Init Parallel Timeout Promote Cancle. url: "+uDownloadTas.getUrl());
                         this.l();
                      }
                   }
                }
                str = 1;
                goto label_006e ;
             }else {
                i1 = oi.i ^ this;
                Log.b("DownloadManager:PreDownloadDispatcher", "Init task serial download");
             }
          }else if(this.b() && oi.i == null){
             goto label_00df ;
          }else {
             i1 = 0;
          }
          if (str) {
             String str1 = " url: ";
             String str2 = " type: ";
             String str3 = "xxxxx submit task, biz: ";
             String str4 = "Recover Task Limit Speed: ";
             String str5 = " ## taskHost:";
             if (!n.b(p1)) {
                Log.b("DownloadManager:PreDownloadDispatcher", "Iterate waiting-tasks : "+uDownloadTas.getUrl()+"## No one takes focus£¬waiting-task should downgrade and start ## networkHost:"+n.a(p1)+str5+n.a(uDownloadTas.getHostType())+" "+uDownloadTas.getPreDownloadPriority());
                if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                   if (b) {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Background waiting-task keep waiting due to bad net work.");
                      this.q();
                   }else {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Background waiting-task downgrade and start.");
                      oi.m(uDownloadTas);
                   }
                }
                obj.remove(uDownloadTas);
                oi.d.add(uDownloadTas);
                if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
                   oi.i = this;
                }
                if (uDownloadTas.limitSpeedByFactor != null) {
                   uDownloadTas.limitSpeedByFactor = b1;
                   uDownloadTas.setMaxSpeedKbps(-1);
                   Log.b("DownloadManager:PreDownloadDispatcher", str4+uDownloadTas.getUrl());
                }
                Log.b("DownloadManager:PreDownloadDispatcher", str3+uDownloadTas.getBizType()+str2+uDownloadTas.getDownloadTaskType()+str1+uDownloadTas.getUrl());
                uDownloadTas.submit();
             }else {
                float f = oi.n(uDownloadTas, p1, b);
                String str6 = " ## speedFactor:";
                String this1 = "Iterate waiting-tasks: ";
                if (f <= 0) {
                   Log.b("DownloadManager:PreDownloadDispatcher", this1+uDownloadTas.getUrl()+" ## Focus has been taken, irrelevant waiting_tasks should pause.  ## networkHost:"+n.a(p1)+str5+n.a(uDownloadTas.getHostType())+str6+f);
                label_0309 :
                   iterator1 = iterator;
                label_030b :
                   iterator = iterator1;
                }else {
                   iterator1 = iterator;
                   Log.b("DownloadManager:PreDownloadDispatcher", this1+uDownloadTas.getUrl()+" ## Focus has been taken, relevant waiting_tasks should upgrade and start.  ## networkHost:"+n.a(p1)+str5+n.a(uDownloadTas.getHostType())+str6+f);
                   if (f > 0 && f - 0x3f800000 < 0) {
                      Log.b("DownloadManager:PreDownloadDispatcher", "Limit waiting-task Speed: "+uDownloadTas.getUrl());
                      int i2 = v.a();
                      if (i2 > 0) {
                         f = f * (float)i2;
                         uDownloadTas.setMaxSpeedKbps((int)f);
                         uDownloadTas.limitSpeedByFactor = true;
                      }
                   }else if(uDownloadTas.limitSpeedByFactor != null){
                      uDownloadTas.limitSpeedByFactor = false;
                      uDownloadTas.setMaxSpeedKbps(-1);
                      Log.b("DownloadManager:PreDownloadDispatcher", str4+uDownloadTas.getUrl());
                   }
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                      oi.u(uDownloadTas);
                   }
                   obj.remove(uDownloadTas);
                   oi.d.add(uDownloadTas);
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
                      oi.i = true;
                   }
                   Log.b("DownloadManager:PreDownloadDispatcher", str3+uDownloadTas.getBizType()+str2+uDownloadTas.getDownloadTaskType()+str1+uDownloadTas.getUrl());
                   uDownloadTas.submit();
                   goto label_030b ;
                }
             }
          }
          i1 = p1;
          goto label_0309 ;
       }
       return;
    }
}
