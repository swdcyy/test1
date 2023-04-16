package com.kwai.performance.stability.crash.monitor.anr.async.b;
import java.lang.Runnable;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.anr.async.b$a;
import com.kwai.performance.stability.crash.monitor.anr.async.b$f;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import com.kwai.performance.stability.crash.monitor.anr.async.b$g;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.lang.Integer;
import ng7.b;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.Class;
import android.os.Handler$Callback;
import com.kwai.performance.stability.crash.monitor.anr.async.b$c;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import com.kwai.performance.stability.crash.monitor.anr.async.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.Throwable;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import com.kwai.performance.stability.crash.monitor.anr.async.b$e;
import com.kwai.performance.stability.crash.monitor.anr.async.a;
import ng7.d;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import com.kwai.performance.stability.crash.monitor.anr.async.b$h;
import java.lang.Long;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.StringBuffer;
import ng7.a;
import com.kwai.performance.stability.crash.monitor.anr.async.b$b;
import android.util.Printer;
import java.lang.Thread;
import java.lang.System;
import android.os.MessageQueue;
import com.kwai.performance.stability.crash.monitor.anr.b;
import android.os.SystemClock;
import java.util.Arrays;

public class b implements Runnable	// class@0011ae
{
    public AsyncScheduleConfig b;
    public HandlerThread c;
    public b$e d;
    public HandlerThread e;
    public Handler f;
    public Handler g;
    public Handler$Callback h;
    public MessageQueue i;
    public Field j;
    public Field k;
    public b$g l;
    public b$d m;
    public long[] n;
    public long o;
    public long p;
    public long q;
    public int r;
    public boolean s;

    public void b(){
       super();
       long[] olongArray = new long[0];
       this.n = olongArray;
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = true;
       HandlerThread handlerThrea = new HandlerThread("AnrAsyncSched");
       this.c = handlerThrea;
       handlerThrea.start();
    }
    public void b(b$a p0){
       super();
       long[] olongArray = new long[0];
       this.n = olongArray;
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = true;
       HandlerThread handlerThrea = new HandlerThread("AnrAsyncSched");
       this.c = handlerThrea;
       handlerThrea.start();
    }
    public static b a(){
       return b$f.a;
    }
    public void b(AsyncScheduleConfig p0,b$g p1){
       object oobject;
       String str = "AsyncSchedule";
       if (this.b != null) {
          h.g(str, "AsyncScheduleMgr already init by "+this.b);
          return;
       }else {
          this.b = p0;
          if (p0.enableServiceSchedule == null && p0.enableReceiverSchedule == null) {
             h.d(str, "AsyncScheduleMgr disabled by config");
             return;
          }else if(p0.enableDoubleQueue != null){
             b$a uoa = new b$a(this, "AnrAsyncCheck", this);
             this.e = uoa;
             uoa.start();
          }
          b tb = this.b;
          MessageUtils.f = tb;
          AsyncScheduleConfig receiverBlac = tb.receiverBlackList;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.g = new HashSet(tb.receiverBlackList);
          }
          receiverBlac = tb.receiverClassBlackList;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.h = new HashSet(tb.receiverClassBlackList);
          }
          receiverBlac = tb.receiverWhiteList;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.i = new HashSet(tb.receiverWhiteList);
          }
          receiverBlac = tb.serviceWhatList;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.j.addAll(tb.serviceWhatList);
          }else {
             Set j = MessageUtils.j;
             j.add(Integer.valueOf(114));
             j.add(Integer.valueOf(115));
             j.add(Integer.valueOf(116));
             j.add(Integer.valueOf(121));
             j.add(Integer.valueOf(122));
             j.add(Integer.valueOf(123));
          }
          MessageUtils.l = tb.whatCreateService;
          MessageUtils.m = tb.whatServiceArgs;
          receiverBlac = tb.forceSchedReceiverCmp;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.p.addAll(tb.forceSchedReceiverCmp);
          }
          receiverBlac = tb.forceSchedReceiverAction;
          if (receiverBlac != null && receiverBlac.size()) {
             MessageUtils.o.addAll(tb.forceSchedReceiverAction);
          }
          this.l = p1;
          h.d(str, "setProvider\(\) | provider = "+p1);
          this.m = new b(this);
          if (this.g == null) {
             this.g = new Handler(Looper.getMainLooper());
          }
          p1 = null;
          boolean b = true;
          if (this.b.enableServiceSchedule != null) {
             Handler handler = MessageUtils.e();
             Field declaredFiel = Handler.class.getDeclaredField("mCallback");
             declaredFiel.setAccessible(b);
             b$c uoc = new b$c(this, declaredFiel.get(handler));
             this.h = uoc;
             declaredFiel.set(handler, uoc);
          }
          if (this.b.tempEnableLooperHook != null) {
             String str1 = "MessageUtils";
             h.d(str1, "initLooperHook\(before\)");
             Class uClass = Class.forName(Looper.class.getName()+"$Observer");
             Method[] declaredMeth = Looper.class.getDeclaredMethods();
             int len = declaredMeth.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = declaredMeth[i];
                   if ((oobject.getName()).equals("setObserver")) {
                   label_018c :
                      if (oobject != null) {
                         oobject.setAccessible(b);
                         Class[] uClassArray = new Class[b];
                         uClassArray[0] = uClass;
                         Object[] objArray = new Object[b];
                         objArray[0] = Proxy.newProxyInstance(uClass.getClassLoader(), uClassArray, c.b);
                         oobject.invoke(p1, objArray);
                      }
                      h.d(str1, "initLooperHook\(\) | Success "+oobject);
                      h.d(str1, "initLooperHook\(after\)");
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = p1;
                   goto label_018c ;
                }
             }
          }
          CountDownLatch uCountDownLa = new CountDownLatch(b);
          if (this.d == null) {
             this.d = new b$e(this, this.c.getLooper());
          }
          this.d.post(new a(this, uCountDownLa));
          this.g.postAtFrontOfQueue(new d(uCountDownLa));
          tb = this.b;
          if (tb.enableDoubleQueue == null) {
             if (tb.tempCheckDelayTime != -1) {
                this.d.post(this);
             }else {
                this.d.postDelayed(this, 2000);
             }
          }
          return;
       }
    }
    public void c(File p0){
       b uob = this;
       String str = "\)";
       String str1 = "\(";
       e.v("AsyncSchedule.Config", uob.b);
       String str2 = "AsyncSchedule.DelayMap";
       if (uob.d == null) {
          e.v(str2, "mAsyncHandler is null");
          return;
       }else {
          HashMap hashMap = new HashMap();
          Iterator iterator = uob.d.e.keySet().iterator();
          while (iterator.hasNext()) {
             String str3 = iterator.next();
             ArrayList uArrayList = new ArrayList();
             hashMap.put(str3, uArrayList);
             b$h oh = uob.d.e.get(str3);
             if (oh != null) {
                hashMap.put(str3+".add", Long.valueOf(oh.b));
                hashMap.put(str3+".found", Long.valueOf(oh.c));
                Iterator iterator1 = oh.a.iterator();
                while (iterator1.hasNext()) {
                   uArrayList.add(iterator1.next().toString());
                }
             }
          }
          e.v(str2, hashMap);
          e.v("AsyncSchedule.ServiceMap", MessageUtils.b());
          e.v("AsyncSchedule.StatusInfo", uob.p+","+uob.o+","+uob.q+","+uob.r+","+uob.d.b+","+uob.d.a+","+uob.d.c);
          Handler$Callback uCallback = g.d(MessageUtils.e(), "mCallback");
          e.v("AsyncSchedule.mH.mCallback", String.valueOf(uCallback));
          HashMap hashMap1 = new HashMap();
          e.v("AsyncSchedule.mH.mCallback.all", hashMap1);
          Field[] declaredFiel = uCallback.getClass().getDeclaredFields();
          int len = declaredFiel.length;
          int i = 0;
          while (i < len) {
             object oobject = declaredFiel[i];
             boolean b = true;
             oobject.setAccessible(b);
             Object obj = oobject.get(uCallback);
             hashMap1.put(oobject.getName(), obj+str1+oobject.getType()+str);
             if (obj instanceof Handler$Callback) {
                HashMap hashMap2 = new HashMap();
                hashMap1.put(oobject.getName()+".all", hashMap2);
                Field[] declaredFiel1 = obj.getClass().getDeclaredFields();
                int len1 = declaredFiel1.length;
                int i1 = 0;
                while (i1 < len1) {
                   object oobject1 = declaredFiel1[i1];
                   oobject1.setAccessible(b);
                   hashMap2.put(oobject1.getName(), oobject1.get(obj)+str1+oobject1.getType()+str);
                   i1 = i1 + 1;
                   uCallback = uCallback;
                   b = true;
                }
             }
             i = i + 1;
             uCallback = uCallback;
          }
          if (uob.b.tempEnableDumpSchedQueue != null) {
             StringBuffer str4 = "";
             b$b uob1 = new b$b(this, "DumpAsyncSchedQueue", p0, new a(str4), str4);
             str.start();
          }
       }
    }
    public void run(){
       Field declaredFiel;
       Runnable callback;
       int i2;
       Message message2;
       long when;
       b f;
       AsyncScheduleConfig tempCheckDel;
       b uob = this;
       boolean b = false;
       if (uob.s != null) {
          uob.s = b;
          e.v("AsyncSchedule.FirstCheckTime", Long.valueOf(System.currentTimeMillis()));
       }
       int i = -1;
       long l = (uob.p - i)? System.currentTimeMillis() - uob.p: i;
       uob.o = l;
       int b1 = true;
       if (uob.i == null) {
          uob.i = g.d(Looper.getMainLooper(), "mQueue");
       }
       if (uob.j == null) {
          declaredFiel = MessageQueue.class.getDeclaredField("mMessages");
          uob.j = declaredFiel;
          declaredFiel.setAccessible(b1);
       }
       if (uob.k == null) {
          declaredFiel = Message.class.getDeclaredField("next");
          uob.k = declaredFiel;
          declaredFiel.setAccessible(b1);
       }
       long l1 = SystemClock.uptimeMillis();
       long l2 = SystemClock.currentThreadTimeMillis();
       b i1 = uob.i;
       _monitor_enter(i1);
       b j = uob.j;
       Object obj = null;
       Message message = (j == null)? obj: j.get(uob.i);
       if (uob.b.enableHeadMsgCheck != null && message != null) {
          Handler tar = message.getTarget();
          callback = message.getCallback();
          long[] olongArray = new long[6];
          olongArray[0] = (long)message.hashCode();
          olongArray[1] = (long)message.what;
          olongArray[2] = (long)message.arg1;
          olongArray[3] = (long)message.arg2;
          b1 = 4;
          long l3 = (tar != null)? (long)tar.hashCode(): 0;
          olongArray[b1] = l3;
          b1 = 5;
          l3 = (callback != null)? (long)callback.hashCode(): 0;
          olongArray[b1] = l3;
          b1 = Arrays.equals(uob.n, olongArray);
          if (!b1) {
             uob.n = olongArray;
          }else {
             h.d("AsyncSchedule", "Head message not change, MsgHash = "+Arrays.toString(uob.n)+", What = "+message.what+", Target = "+message.getTarget()+", Callback = "+message.getCallback()+", When = "+message.getWhen());
          }
          b = b1;
       }
       Message message1 = obj;
       b1 = 0;
       for (; message != null && !b; message = i) {
          if (uob.b.enableServiceSchedule != null && MessageUtils.n(message)) {
             i2 = message.what * -1;
             message.what = i2;
             message2 = Message.obtain();
             message2.obj = Message.obtain(message);
             message2.arg2 = message.hashCode();
             uob.d.sendMessageAtTime(message2, message.getWhen());
          }else if(uob.b.enableReceiverSchedule != null && MessageUtils.j(message)){
             when = message.getWhen();
             Message message3 = Message.obtain(message);
             message2 = message.what;
             i2 = (message2 == null)? -1: message2 * -1;
             message.what = i2;
             g.j(message, "callback", obj);
             message2 = Message.obtain();
             message2.obj = message3;
             uob.d.sendMessageAtTime(message2, when);
          }
          b1 = b1 + 1;
          b k = uob.k;
          i = (k == null)? obj: k.get(message);
          message1 = message;
       }
       _monitor_exit(i1);
       if (message1 != null) {
          when = message1.getWhen() - SystemClock.uptimeMillis();
          if (when - null < 0) {
             h.d("AsyncSchedule", "Last message was delay "+(when * -1)+" ms, Total message count "+b1);
          }
       }
       uob.q = SystemClock.uptimeMillis() - l1;
       uob.p = System.currentTimeMillis();
       uob.r = b1;
       h.d("AsyncSchedule", "taskRunOnce, message count "+b1+", isSameHeadMsg = "+b+", delay = "+uob.o+", costWall = "+uob.q+", costCpu = "+(SystemClock.currentThreadTimeMillis() - l2)+", mH.callback = "+g.d(MessageUtils.e(), "mCallback"));
       j = uob.b;
       when = 2000;
       if (j.enableDoubleQueue != null) {
          f = uob.f;
          tempCheckDel = j.tempCheckDelayTime;
          if (tempCheckDel != -1) {
             when = (long)tempCheckDel;
          }
          f.postDelayed(uob, when);
       }else {
          f = uob.d;
          tempCheckDel = j.tempCheckDelayTime;
          if (tempCheckDel != -1) {
             when = (long)tempCheckDel;
          }
          f.postDelayed(uob, when);
       }
       return;
    }
}
