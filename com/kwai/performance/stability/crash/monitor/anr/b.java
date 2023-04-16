package com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.Object;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump;
import java.lang.String;
import java.lang.System;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.anr.b$d;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$AnrExtraSummary;
import java.util.HashMap;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$AnrKeyInfo;
import java.util.Iterator;
import java.lang.Throwable;
import pg7.c;
import yf7.i;
import android.util.Log;
import pg7.a;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.Appendable;
import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import mg7.d;
import java.lang.Runnable;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig$a;
import android.os.Message;
import java.lang.reflect.Field;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import android.os.MessageQueue;
import com.kwai.performance.stability.crash.monitor.anr.c;
import android.app.Application;
import java.lang.Boolean;
import java.util.Random;
import yf7.r;
import com.kwai.performance.stability.crash.monitor.anr.b$a;
import android.os.Looper;
import mg7.b;
import android.os.Handler;
import rg7.b;
import java.lang.Thread;
import rg7.e;
import rg7.a;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.performance.stability.crash.monitor.anr.a;
import com.kwai.performance.stability.crash.monitor.anr.c$a;
import com.kwai.performance.stability.crash.monitor.anr.ArrayList4IdleHandler;
import yf7.w;
import yf7.j;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import java.lang.RuntimeException;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import com.kwai.performance.stability.crash.monitor.anr.c$b;
import com.kwai.performance.stability.crash.monitor.anr.b$b;
import android.os.Build$VERSION;
import mg7.a;
import com.kwai.performance.stability.crash.monitor.anr.e;
import rg7.h;
import com.kwai.performance.stability.crash.monitor.anr.b$c;

public class b	// class@000dfe
{
    public long a;
    public boolean b;
    public boolean c;
    public Random d;
    public boolean e;
    public Application f;
    public c g;
    public LogRecordQueue h;
    public Handler i;
    public AnrMonitorConfig j;
    public File k;
    public AnrExtraDump l;
    public Message m;
    public MessageQueue n;
    public ArrayList4IdleHandler o;
    public Field p;
    public Field q;
    public b r;
    public e s;
    public a t;
    public h u;
    public a v;
    public c w;
    public b x;
    public d y;
    public static b z;

    public void b(){
       super();
       this.b = false;
       this.c = true;
       this.e = false;
    }
    public static b c(){
       if (b.z == null) {
          b uob = b.class;
          _monitor_enter(uob);
          if (b.z == null) {
             b.z = new b();
          }
          _monitor_exit(uob);
       }
       return b.z;
    }
    public static AnrExtraDump p(File p0){
       LogRecordQueue$PackedRecord packedRecord2;
       int i5;
       AnrExtraDump uAnrExtraDum3;
       int i6;
       LogRecordQueue$PackedRecord packedRecord3;
       int i7;
       int i10;
       File uFile = new File(p0, "anr_queue_raw");
       AnrExtraDump uAnrExtraDum = null;
       if (!uFile.exists()) {
          return uAnrExtraDum;
       }
       System.currentTimeMillis();
       AnrExtraDump uAnrExtraDum1 = b$d.a.h(e.w(uFile), AnrExtraDump.class);
       System.currentTimeMillis();
       uFile.toString();
       if (uAnrExtraDum1 == null) {
          return uAnrExtraDum;
       }
       if (uAnrExtraDum1.packedRecords == null) {
          return uAnrExtraDum1;
       }
       AnrExtraDump$AnrExtraSummary uAnrExtraSum = new AnrExtraDump$AnrExtraSummary();
       uAnrExtraDum1.summary = uAnrExtraSum;
       HashMap hashMap = new HashMap();
       AnrExtraDump packedRecord = uAnrExtraDum1.packedRecords;
       HashMap hashMap1 = new HashMap();
       long l = 0;
       AnrExtraDump uAnrExtraDum2 = uAnrExtraDum1;
       long l1 = l;
       int i = l1;
       long l2 = i;
       int i1 = l2;
       Integer integer = null;
       LogRecordQueue$PackedRecord packedRecord1 = null;
       int i2 = 0;
       int i3 = -1;
       while (i2 < packedRecord.size()) {
          packedRecord2 = packedRecord.get(i2);
          int i4 = packedRecord1;
          packedRecord1 = packedRecord2.extra;
          packedRecord2.processOnParse();
          if (packedRecord2.getIdleRecordCount()) {
             i5 = integer;
             uAnrExtraDum3 = packedRecord;
             i6 = i2;
             packedRecord3 = i;
             hashMap1.put(Integer.valueOf(i2), "Count: "+packedRecord2.getIdleRecordCount()+", Wall: "+packedRecord2.idleWall+", Cpu: "+packedRecord2.idleCpu);
          }else {
             i5 = integer;
             uAnrExtraDum3 = packedRecord;
             packedRecord3 = i;
             i6 = i2;
          }
          String str = LogRecordQueue$PackedRecord.typeToString(packedRecord2.typeFlag);
          if (!hashMap.containsKey(str)) {
             hashMap.put(str, Integer.valueOf(1));
          }else {
             i7 = hashMap.get(str).intValue() + 1;
             hashMap.put(str, Integer.valueOf(i7));
          }
          LogRecordQueue$PackedRecord wall = packedRecord2.wall;
          l = l + wall;
          long l3 = l;
          l1 = l1 + packedRecord2.cpu;
          if (wall - l2 > 0) {
             if (!packedRecord2.isIdle()) {
                l2 = packedRecord2.wall;
                i4 = i6;
             }
             i1 = packedRecord2.wall;
             i3 = i6;
          }
          packedRecord2 = packedRecord2.cpu;
          if (packedRecord2 - packedRecord3 > 0) {
             wall = packedRecord2;
             integer = i6;
          }else {
             integer = i5;
             i = packedRecord3;
          }
          if (packedRecord1.stacks != null) {
             i7 = uAnrExtraSum.stackCount + 1;
             uAnrExtraSum.stackCount = i7;
          }
          LogRecordQueue$PackedRecordExtra stackTraceDi = packedRecord1.stackTraceDiff;
          if (stackTraceDi != null) {
             int i8 = uAnrExtraSum.stackDiffCount + stackTraceDi.size();
             uAnrExtraSum.stackDiffCount = i8;
          }
          if (packedRecord1.runtimeStat != null) {
             i7 = uAnrExtraSum.runtimeStatCount + 1;
             uAnrExtraSum.runtimeStatCount = i7;
          }
          i2 = i6 + 1;
          packedRecord1 = i4;
          packedRecord = uAnrExtraDum3;
          l = l3;
       }
       uAnrExtraDum3 = packedRecord;
       uAnrExtraSum.packedSize = uAnrExtraDum3.size();
       uAnrExtraSum.wallCount = l;
       uAnrExtraSum.cpuCount = l1;
       uAnrExtraSum.maxCpu = i;
       integer = integer;
       uAnrExtraSum.maxCpuIndex = integer;
       uAnrExtraSum.maxWall = l2;
       packedRecord2 = packedRecord1;
       uAnrExtraSum.maxWallIndex = packedRecord2;
       uAnrExtraSum.maxWallWithIdle = i1;
       int i9 = i3;
       uAnrExtraSum.maxWallWithIdleIndex = i9;
       boolean b = (packedRecord2 == integer)? true: false;
       uAnrExtraSum.wallIdxEqCpu = b;
       if (i9 != -1) {
          uAnrExtraDum1 = uAnrExtraDum3;
          uAnrExtraSum.maxIdleWall = uAnrExtraDum1.get(i9).idleWall;
          uAnrExtraSum.maxIdleCpu = uAnrExtraDum1.get(i9).idleCpu;
       }else {
          uAnrExtraDum1 = uAnrExtraDum3;
       }
       uAnrExtraSum.packedStatus = hashMap;
       uAnrExtraSum.idleRecordStatus = hashMap1;
       if (uAnrExtraDum1.size() > 0) {
          uAnrExtraSum.recordStartTime = uAnrExtraDum1.get(0).now;
          uAnrExtraSum.recordEndTime = uAnrExtraDum1.get((uAnrExtraDum1.size() - 1)).now;
       }
       uAnrExtraDum1 = uAnrExtraDum2;
       uAnrExtraDum = uAnrExtraDum1.threadCpu;
       if (uAnrExtraDum != null) {
          uAnrExtraSum.cpuInfoCount = uAnrExtraDum.size();
       }
       AnrExtraDump$AnrKeyInfo uAnrKeyInfo = new AnrExtraDump$AnrKeyInfo();
       Iterator iterator = uAnrExtraDum1.packedRecords.iterator();
       while (iterator.hasNext()) {
          LogRecordQueue$PackedRecord packedRecord4 = iterator.next();
          if (!packedRecord4.isIdle()) {
             LogRecordQueue$PackedRecord wall1 = packedRecord4.wall;
             if (wall1 - 5000 >= 0) {
                i10 = uAnrKeyInfo.wall5000 + 1;
                uAnrKeyInfo.wall5000 = i10;
             }else if(wall1 - 1000 >= 0){
                i10 = uAnrKeyInfo.wall1000 + 1;
                uAnrKeyInfo.wall1000 = i10;
             }else if(wall1 - 500 >= 0){
                i10 = uAnrKeyInfo.wall500 + 1;
                uAnrKeyInfo.wall500 = i10;
             }
          }
          if (packedRecord4.isAnr()) {
             uAnrKeyInfo.anrRecordWall = (int)packedRecord4.wall;
             uAnrKeyInfo.anrRecordCpu = (int)packedRecord4.cpu;
          }
       }
       uAnrExtraDum1.keyInfo = uAnrKeyInfo;
       return uAnrExtraDum1;
    }
    public static void q(String p0,Throwable p1){
       if (b.c().w != null) {
          b.c().w.a(p1);
       }else {
          b.r(p0, p1);
       }
       return;
    }
    public static void r(String p0,Throwable p1){
       if (p0 != null) {
          i.a.c(p0, Log.getStackTraceString(p1), false);
       }
       return;
    }
    public static void u(AnrExtraDump p0,File p1,a p2){
       long l = System.currentTimeMillis();
       _monitor_enter(p0);
       if (p2 != null) {
          p2.a(p0);
       }
       BufferedWriter uBufferedWri = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(p1)));
       b$d.a.u(p0, uBufferedWri);
       uBufferedWri.flush();
       uBufferedWri.close();
       _monitor_exit(p0);
       "syncDumpInfoToFile\(\) | cost = "+(System.currentTimeMillis() - l)+", file = "+p1;
       return;
    }
    public String a(){
       Object[] objArray;
       String str1;
       int i = 1;
       String str = "{\"rawLog\":\"%s\"}";
       if (this.j == null) {
          objArray = new Object[i];
          objArray[0] = "NotInit";
          str1 = String.format(str, objArray);
       }else if(this.h == null){
          objArray = new Object[i];
          objArray[0] = "NotInit\("+this.j.enableAllThreshold+"\)";
          str1 = String.format(str, objArray);
       }else {
          this.t(new d(this, 0));
          str1 = b$d.a.q(new AnrExtraDump(this.j));
       }
       return str1;
    }
    public void b(Exception p0){
       this.j.mAdvConfig.unwindStackSafeMode = true;
       b tw = this.w;
       if (tw != null) {
          tw.a(p0);
       }
       e.p().put("enterUnwindStackSafeMode", p0.getMessage());
       return;
    }
    public AnrMonitorConfig d(){
       b tj = this.j;
       if (tj == null) {
          tj = new AnrMonitorConfig$a().a();
       }
       return tj;
    }
    public Message e(){
       b tp = this.p;
       if (tp != null) {
          b tn = this.n;
          if (tn != null) {
             return tp.get(tn);
          }
       }
       return null;
    }
    public LogRecordQueue f(){
       return this.h;
    }
    public MessageQueue g(){
       return this.n;
    }
    public c h(){
       return this.g;
    }
    public synchronized void i(Application p0,AnrMonitorConfig p1,Boolean p2){
       if (this.j != null) {
          "init\(\) | Already init by config = "+this.j;
          return;
       }else if(p1 == null){
          p1 = new AnrMonitorConfig$a().a();
          StringBuilder str = "init\(\) | Use default config = "+p1;
       }
       this.j = p1;
       this.d = new Random();
       boolean b = false;
       if (p1.disable != null) {
          if (p1.isRemoveInvalidSyncBarrier != null) {
             b = true;
          }
          if (!b) {
             return;
          }
       }
       this.c = (p2 == null)? r.b(): p2.booleanValue();
       if (p1.enableChildProcessFunction == null && this.c == null) {
          return;
       }else if(this.i == null){
          this.i = new b$a(this, Looper.getMainLooper());
       }
       if (Looper.myLooper() != Looper.getMainLooper()) {
          this.i.post(new b(this, p0, b));
       }else {
          this.l(p0, b);
       }
       return;
    }
    public final void j(){
       boolean b;
       b tj = this.j;
       b uob = 0x3f800000;
       b uob1 = 1;
       if (tj.enableDispatchSamplingThreshold - uob < 0 && tj.isEnableDispatchSampling != null) {
          b = (this.d.nextFloat() - this.j.enableDispatchSamplingThreshold < 0)? true: false;
          tj.isEnableDispatchSampling = b;
       }
       tj = this.j;
       if (tj.enableIdleSamplingThreshold - uob < 0 && tj.isEnableIdleSampling != null) {
          b = (this.d.nextFloat() - this.j.enableIdleSamplingThreshold < 0)? true: false;
          tj.isEnableIdleSampling = b;
       }
       tj = this.j;
       if (tj.isEnableDispatchSampling == null && (tj.isEnableIdleSampling == null || (this.c == null && tj.enableChildProcessSampling == null))) {
          uob1 = null;
       }
       if (uob1) {
          tj = new b(this.g, this.j);
          this.r = tj;
          tj.start();
       }
       if (this.j.mAdvConfig.isEnableMultiThreadSampling() && this.r != null) {
          e uoe = new e(this.g, this.j, this.r);
          this.s = uoe;
          uoe.start();
       }
       if (this.j.checkTimeInterval > null) {
          a uoa = new a(this.g, this.j);
          this.t = uoa;
          uoa.start();
       }
       this.n();
       return;
    }
    public final void k(){
       try{
          ArrayList uArrayList = this.q.get(this.n);
          b tn = this.n;
          _monitor_enter(tn);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
          }
          this.o.addAll(uArrayList);
          this.q.set(this.n, this.o);
          _monitor_exit(tn);
       }catch(java.lang.IllegalAccessException e0){
          "initIdleHandlerHook failure, "+e0;
       }
       return;
    }
    public final void l(Application p0,boolean p1){
       if (this.h != null) {
          return;
       }
       StringBuilder str = "initInner\(\) | Thread = "+Thread.currentThread();
       this.m(p0);
       if (p1) {
          if (this.j.isRemoveInvalidSyncBarrier != null) {
             this.n();
          }
          return;
       }else {
          LogRecordQueue logRecordQue = new LogRecordQueue(this.j);
          this.h = logRecordQue;
          c uoc = new c(logRecordQue, this.j);
          this.g = uoc;
          uoc.e(new a(this));
          this.o = new ArrayList4IdleHandler();
          j.a("ANR", this.g);
          this.j();
          this.k();
          if (this.j.mAdvConfig.enableFastStack != null) {
             int i = BacktraceUtil.d();
             if (i) {
                this.j.mAdvConfig.unwindStackSafeMode = true;
                b.q("anr_fast_unwind_init_fail_exception", new RuntimeException("BacktraceUtil.init fail:"+i));
             }
          }
          AnrMonitorConfig mAdvConfig = this.j.mAdvConfig;
          if (mAdvConfig.appendJvmtiData != null) {
             AnrWithJvmtiHelper.a(mAdvConfig.jvmtiControl);
          }
          c$b.b(this.j);
          if (this.c != null) {
             this.x = new b$b(this);
          }
          this.e = true;
          return;
       }
    }
    public final void m(Application p0){
       Field declaredFiel;
       this.f = p0;
       if (Build$VERSION.SDK_INT >= 23) {
          this.n = Looper.getMainLooper().getQueue();
       }else {
          declaredFiel = Looper.class.getDeclaredField("mQueue");
          declaredFiel.setAccessible(true);
          this.n = declaredFiel.get(Looper.getMainLooper());
       }
       declaredFiel = MessageQueue.class.getDeclaredField("mMessages");
       this.p = declaredFiel;
       declaredFiel.setAccessible(true);
       declaredFiel = MessageQueue.class.getDeclaredField("mIdleHandlers");
       this.q = declaredFiel;
       declaredFiel.setAccessible(true);
       return;
    }
    public final void n(){
       if (this.c == null) {
          return;
       }
       if (this.j.tempDisableSyncBarrierCheck != null) {
          return;
       }
       e.a = new a(this);
       if (this.u == null) {
          h oh = new h(this.j);
          this.u = oh;
          oh.start();
       }
       return;
    }
    public boolean o(){
       return this.e;
    }
    public void s(File p0){
       this.k = new File(p0, "anr_queue_raw");
    }
    public final void t(Runnable p0){
       if (this.l == null) {
          this.l = new AnrExtraDump();
       }
       new b$c(this, "AnrTimeLineDump", p0).start();
       return;
    }
}
