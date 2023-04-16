package com.kwai.performance.stability.crash.monitor.anr.async.b$e;
import android.os.Handler;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import android.os.Looper;
import java.util.HashSet;
import java.util.HashMap;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import java.util.List;
import java.util.Collection;
import java.util.Set;
import ng7.e;
import java.lang.Runnable;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.StringBuilder;
import java.lang.String;
import yf7.h;
import java.util.Iterator;
import java.lang.Object;
import android.os.IBinder;
import java.util.ArrayList;
import com.kwai.performance.stability.crash.monitor.anr.async.b$h;
import java.lang.System;
import vg7.d;
import com.google.gson.Gson;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils$MessageParsed;
import ng7.g;
import android.os.Build$VERSION;
import com.kwai.performance.stability.crash.monitor.anr.async.b$g;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.anr.async.b$d;
import java.lang.Integer;
import java.util.concurrent.CountDownLatch;
import ng7.f;
import java.lang.IllegalStateException;
import java.lang.Class;
import java.lang.CharSequence;
import android.app.Service;
import com.kwai.performance.stability.crash.monitor.anr.b;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.RuntimeException;
import java.lang.Long;
import android.util.Log;
import android.os.SystemClock;

public class b$e extends Handler	// class@0011aa
{
    public int a;
    public int b;
    public int c;
    public Set d;
    public Map e;
    public final b f;

    public void b$e(b p0,Looper p1){
       this.f = p0;
       super(p1);
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = new HashSet();
       this.e = new HashMap();
       AsyncScheduleConfig serviceBlack = p0.b.serviceBlackList;
       if (serviceBlack != null && serviceBlack.size()) {
          this.d.addAll(p0.b.serviceBlackList);
       }
       this.postAtFrontOfQueue(new e(this));
       return;
    }
    public final void a(){
       if (this.e.size()) {
          Map map = MessageUtils.h();
          String str = "AsyncSchedule";
          h.d(str, "checkDelayMap\(\) | delay = "+this.e.size()+", service = "+map.size());
          HashMap hashMap = new HashMap();
          Iterator iterator = map.keySet().iterator();
          while (iterator.hasNext()) {
             IBinder iBinder = iterator.next();
             String str1 = iBinder.toString();
             hashMap.put(str1, map.get(iBinder));
          }
          ArrayList uArrayList = new ArrayList();
          iterator = this.e.keySet().iterator();
          while (iterator.hasNext()) {
             String str2 = iterator.next();
             b$h oh = this.e.get(str2);
             if (oh != null && hashMap.containsKey(str2)) {
                if (!oh.c - null) {
                   oh.c = System.currentTimeMillis();
                   long l = oh.c - oh.b;
                   StringBuilder str3 = "checkDelayMap\(\) | found "+str2+", diff = "+l;
                   h.d(str, str3+", dump ServiceMap = "+d.j.q(MessageUtils.b()));
                }
                if (this.f.b.tempTryScheduleOnFound != null) {
                   Iterator iterator1 = oh.a.iterator();
                   while (iterator1.hasNext()) {
                      Message message = iterator1.next();
                      this.b(message, MessageUtils.o(message));
                   }
                   uArrayList.add(str2);
                }
             }
          }
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             this.e.remove(iterator2.next());
          }
          if (this.e.size()) {
             this.removeMessages(1);
             this.sendMessageDelayed(Message.obtain(this, 1), 1000);
          }
       }
       return;
    }
    public void b(Message p0,MessageUtils$MessageParsed p1){
       g og = new g(this, p1, p0);
       if (Looper.myLooper() == this.f.d.getLooper()) {
          p1.fromQueue = true;
          og.run();
       }else {
          p1.fromQueue = false;
          this.f.d.post(og);
       }
       return;
    }
    public final void c(Message p0,MessageUtils$MessageParsed p1){
       StringBuilder str;
       if (MessageUtils.n(p0)) {
          MessageUtils$MessageParsed componentNam = p1.componentName;
          if (componentNam != null && (!componentNam.startsWith("com.docker.app") && (this.d.contains(p1.componentName) || this.d.contains(p1.action)))) {
          label_002e :
             str = 1;
          label_0031 :
             if (str) {
                h.g("AsyncSchedule", "dispatchMessageInRightThread\(\) | Service "+p1.componentName+"/"+p1.action+" is in blackList schedule to main");
                this.e(p0, p1);
             }else {
                this.d(p0, p1);
             }
             return;
          }
       }else if(MessageUtils.m(p0)){
          goto label_002e ;
       }
       str = null;
       goto label_0031 ;
    }
    public final void d(Message p0,MessageUtils$MessageParsed p1){
       b obj = null;
       if (Build$VERSION.SDK_INT >= 28) {
          b$e tf = this.f;
          if (tf.b.enableBgLockResMgrSchedule != null && tf.l.a()) {
             obj = MessageUtils.f();
          }
       }
       if (obj != null) {
          h.d("AsyncSchedule", "dispatchMessageInner\(\) | App in bg to lock schedule \("+obj+"\)");
          _monitor_enter(obj);
          p1.lockSched = true;
          MessageUtils.a(p0, p1);
          _monitor_exit(obj);
       }else {
          MessageUtils.a(p0, p1);
       }
       obj = this.f.m;
       if (obj != null) {
          obj.a(p0, p1);
       }
       return;
    }
    public void dispatchMessage(Message p0){
       this.b = this.b + 1;
       if (p0.obj instanceof Message) {
          this.c = this.c + 1;
       }else if(p0.getCallback() != b.a()){
          h.d("AsyncSchedule", "dispatchMessage\(Checker\) | dispatchOtherMessage "+p0);
       }else {
          this.a = this.a + 1;
       }
       super.dispatchMessage(p0);
       return;
    }
    public final void e(Message p0,MessageUtils$MessageParsed p1){
       h.d("AsyncSchedule", "dispatchToMainThread\(\) | ready for message "+p1+", new hash = "+Integer.toHexString(p0.hashCode()));
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       b g = this.f.g;
       f uof = new f(this, p0, p1, uCountDownLa);
       try{
          g.postAtFrontOfQueue(uof);
          h.d("AsyncSchedule", "dispatchToMainThread\(\) | start wait for main thread exec");
          uCountDownLa.await();
          h.d("AsyncSchedule", "dispatchToMainThread\(\) | main thread exec done");
       }catch(java.lang.InterruptedException e5){
          h.g("AsyncSchedule", "dispatchToMainThread\(\) | lock.await\(\) error, "+e5);
       }
       return;
    }
    public final boolean f(String p0,Throwable p1,Message p2){
       String message = p1.getMessage();
       if (this.f.b.tempCatchRegistryRecycleException != null && (p1 instanceof IllegalStateException && ("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.").equals(message))) {
          this.h("AsyncSchedule.Excluded.RegistryRecycleException", p1);
          h.g("AsyncSchedule", "dispatchMessage\(Checker\) | scene = "+p0+", Excluded exception "+message+" for message "+p2);
          return true;
       }else {
          AsyncScheduleConfig excludedExce = this.f.b.excludedException;
          if (excludedExce != null && excludedExce.size()) {
             String name = p1.getClass().getName();
             if (this.f.b.excludedException.contains(name)) {
                this.h("AsyncSchedule.Excluded."+p1.getClass().getSimpleName(), p1);
                h.g("AsyncSchedule", "dispatchMessage\(Checker\) | scene = "+p0+", Excluded exception "+name+" \("+message+"\) for message "+p2);
                return true;
             }
          }
          return false;
       }
    }
    public final boolean g(Throwable p0,Message p1){
       Throwable cause = p0.getCause();
       StringBuilder message = p0.getMessage();
       String message1 = (cause != null)? cause.getMessage(): null;
       String str = "AsyncSchedule";
       h.g(str, "dispatchMessage\(\) | tr = "+p0+", errMessage = "+message+", causeMsg = "+message1+", msg = "+p1);
       b$e uoe = null;
       boolean b = (message != null && (message.contains("Unable to start service") && (message.contains("androidx.work.impl.background.systemalarm.SystemAlarmService") && (message1 != null && message1.contains("Needs to be invoked on the main thread")))))? true: false;
       message = "isMatchSystemAlarmService="+b;
       if (b) {
          if (MessageUtils.n(p1)) {
             MessageUtils$MessageParsed messageParse = MessageUtils.o(p1);
             h.d(str, "dispatchMessage\(\) | reprocess spec service");
             if (Looper.getMainLooper() == this.f.g.getLooper()) {
                MessageUtils.q(p1, messageParse, this.f.g);
             }else {
                MessageUtils.q(p1, messageParse, this.f.d);
             }
             try{
                MessageUtils.a(p1, messageParse);
                return true;
             }catch(java.lang.Exception e7){
                h.d(str, "dispatchMessage\(\) | reprocess failure | dispatcher = "+MessageUtils.i(MessageUtils.g(b)));
                throw e7;
             }
          }
       }else if(MessageUtils.j(p1)){
          if (Looper.getMainLooper() != this.f.g.getLooper()) {
             uoe = true;
          }
          message = message+", isBroadcastMessage=true, isMainHandler="+uoe;
          if (this.f.b.tempReceiverErrorToMain != null && uoe) {
             b.q("AsyncScheduleHandler.dispatchBroadcastMessage", p0);
             this.e(p1, MessageUtils.o(p1));
             return true;
          }
       }
       e.v("AsyncSchedule.OnDispatchException", message);
       throw new RuntimeException(p0);
    }
    public final void h(String p0,Throwable p1){
       List list;
       HashMap hashMap = e.p();
       if (hashMap.containsKey(p0)) {
          list = hashMap.get(p0);
       }else {
          ArrayList uArrayList = new ArrayList();
          hashMap.put(p0, uArrayList);
          list = uArrayList;
       }
       if (list != null) {
          if (list.size() > 100) {
             list.clear();
             list.add(Long.valueOf(0));
          }
          list.add(Long.valueOf(System.currentTimeMillis()));
       }
       b.q(p0, p1);
       return;
    }
    public void handleMessage(Message p0){
       Message obj = p0.obj;
       if (obj instanceof Message) {
          MessageUtils$MessageParsed messageParse = MessageUtils.o(obj);
          messageParse.when = p0.getWhen();
          h.d("AsyncSchedule", "handleMessage\(Checker\) | Message "+obj+", "+messageParse+", origin hash = "+Integer.toHexString(p0.arg2)+", new hash = "+Integer.toHexString(obj.hashCode())+", service = "+messageParse.getService());
          this.b(obj, messageParse);
          return;
       }else if(p0.what == 1){
          this.a();
       }else {
          h.g("AsyncSchedule", "handleMessage\(Checker\) | Unexpected message "+p0);
       }
       return;
    }
    public boolean sendMessageAtTime(Message p0,long p1){
       if (p0.obj instanceof Message) {
          long l = SystemClock.uptimeMillis();
          h.d("AsyncSchedule", "handleMessage\(Checker\) | Message when = "+p1+", now = "+l+", diff = "+(l - p1)+", new hash = "+Integer.toHexString(p0.obj.hashCode()));
       }
       return super.sendMessageAtTime(p0, p1);
    }
}
