package com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyMaxJvmHeapSize$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyMaxRamSize$2;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyDeviceRamSize$2;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyLowMemoryKillThreshold$2;
import android.app.ActivityManager$MemoryInfo;
import java.lang.String;
import msd.p;
import java.lang.Object;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import java.util.concurrent.locks.Lock;
import android.app.Application;
import yf7.k;
import android.content.Context;
import android.os.Debug$MemoryInfo;
import eg7.c;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import eg7.a;
import eg7.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import android.app.Activity;
import java.lang.StringBuilder;
import java.lang.Class;
import zsd.b;
import java.lang.Integer;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig;
import java.lang.Number;
import android.os.Bundle;
import android.os.Build$VERSION;
import java.lang.System;
import java.util.Collection;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.os.Looper;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.google.gson.Gson;
import yf7.i;
import yf7.d;
import yf7.d$a;
import yf7.h;
import android.app.ActivityManager;

public final class MemoryMonitor extends LoopMonitor implements Application$ActivityLifecycleCallbacks	// class@00115e
{
    public static final MemoryMonitor INSTANCE;
    public static final ConcurrentHashMap mActivityMap;
    public static String mCurrentSession;
    public static final ConcurrentHashMap mLastMemoryEventMap;
    public static final p mLazyDeviceRamSize$delegate;
    public static final p mLazyLowMemoryKillThreshold$delegate;
    public static final p mLazyMaxJvmHeapSize$delegate;
    public static final p mLazyMaxRamSize$delegate;
    public static final ReentrantLock mLock;
    public static final ConcurrentHashMap mLogJudgerMap;
    public static final ConcurrentHashMap mMemoryEventHistoryMap;
    public static final ConcurrentHashMap mMemoryEventMap;
    public static final ActivityManager$MemoryInfo mMemoryInfo;

    static {
       MemoryMonitor.INSTANCE = new MemoryMonitor();
       MemoryMonitor.mLock = new ReentrantLock();
       MemoryMonitor.mMemoryEventMap = new ConcurrentHashMap();
       MemoryMonitor.mMemoryEventHistoryMap = new ConcurrentHashMap();
       MemoryMonitor.mLastMemoryEventMap = new ConcurrentHashMap();
       MemoryMonitor.mLogJudgerMap = new ConcurrentHashMap();
       MemoryMonitor.mActivityMap = new ConcurrentHashMap();
       MemoryMonitor.mCurrentSession = "";
       MemoryMonitor.mLazyMaxJvmHeapSize$delegate = s.c(MemoryMonitor$mLazyMaxJvmHeapSize$2.INSTANCE);
       MemoryMonitor.mLazyMaxRamSize$delegate = s.c(MemoryMonitor$mLazyMaxRamSize$2.INSTANCE);
       MemoryMonitor.mLazyDeviceRamSize$delegate = s.c(MemoryMonitor$mLazyDeviceRamSize$2.INSTANCE);
       MemoryMonitor.mLazyLowMemoryKillThreshold$delegate = s.c(MemoryMonitor$mLazyLowMemoryKillThreshold$2.INSTANCE);
       MemoryMonitor.mMemoryInfo = new ActivityManager$MemoryInfo();
    }
    public void MemoryMonitor(){
       super();
    }
    public static final ActivityManager$MemoryInfo access$getMMemoryInfo$p(MemoryMonitor p0){
       return MemoryMonitor.mMemoryInfo;
    }
    public static void startSection$default(MemoryMonitor p0,String p1,String p2,boolean p3,int p4,p p5,int p6,Object p7){
       String str = (p6 & 0x02)? null: p2;
       boolean b = (p6 & 0x04)? false: p3;
       int i = (p6 & 0x08)? 0: p4;
       p op = (p6 & 0x10)? null: p5;
       p0.startSection(p1, str, b, i, op);
       return;
    }
    public static void startSectionInternal$default(MemoryMonitor p0,String p1,String p2,int p3,boolean p4,boolean p5,p p6,int p7,Object p8){
       int i = 0;
       int i1 = (p7 & 0x02)? i: p2;
       int i2 = 0;
       int i3 = (p7 & 0x04)? 0: p3;
       int i4 = (p7 & 0x08)? 1: p4;
       if (!(p7 & 0x10)) {
          i2 = p5;
       }
       if (!(p7 & 0x20)) {
          i = p6;
       }
       p0.startSectionInternal(p1, i1, i3, i4, i2, i);
       return;
    }
    public static void stopSection$default(MemoryMonitor p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.stopSection(p1, p2);
       return;
    }
    public static void stopSectionInternal$default(MemoryMonitor p0,String p1,boolean p2,boolean p3,boolean p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = true;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.stopSectionInternal(p1, p2, p3, p4);
       return;
    }
    public final int calculateRamLevel(long p0){
       return (int)(((p0 / (long)0x7d000) + 1) / (long)2);
    }
    public LoopMonitor$b call(){
       ReentrantLock mLock = MemoryMonitor.mLock;
       mLock.lock();
       Debug$MemoryInfo memoryInfo = c.a(k.b());
       MemoryMonitor.INSTANCE.update(MemoryMonitor.mMemoryInfo);
       Iterator iterator = MemoryMonitor.mMemoryEventMap.entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          ActivityManager$MemoryInfo mMemoryInfo = MemoryMonitor.mMemoryInfo;
          b.a(value, memoryInfo, mMemoryInfo);
          a section = value.section;
          Object obj = MemoryMonitor.mLogJudgerMap.get(section);
          if (obj != null) {
             a.h(obj, "mLogJudgerMap[section] ?: continue");
             if (obj.invoke(MemoryMonitor.mLastMemoryEventMap.get(section), value).booleanValue()) {
                MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
                MemoryMonitor.stopSectionInternal$default(iNSTANCE, section, false, false, false, 4, null);
                MemoryMonitor.startSectionInternal$default(iNSTANCE, section, null, 0, false, false, obj, 22, 0);
                value = MemoryMonitor.mMemoryEventMap.get(section);
                if (value != null) {
                   b.a(value, memoryInfo, mMemoryInfo);
                }
             }
          }
       }
       mLock.unlock();
       return LoopMonitor$b$a.a;
    }
    public Object call(){
       return this.call();
    }
    public final String genSessionId(Activity p0){
       a.q(p0, "activity");
       String str = Integer.toString(p0.hashCode(), b.a(16));
       a.h(str, "java.lang.Integer.toStri¡­\(this, checkRadix\(radix\)\)");
       return p0.getClass()+'@'+str;
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().a;
    }
    public final long getMLazyDeviceRamSize(){
       return MemoryMonitor.mLazyDeviceRamSize$delegate.getValue().longValue();
    }
    public final long getMLazyLowMemoryKillThreshold(){
       return MemoryMonitor.mLazyLowMemoryKillThreshold$delegate.getValue().longValue();
    }
    public final long getMLazyMaxJvmHeapSize(){
       return MemoryMonitor.mLazyMaxJvmHeapSize$delegate.getValue().longValue();
    }
    public final long getMLazyMaxRamSize(){
       return MemoryMonitor.mLazyMaxRamSize$delegate.getValue().longValue();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.q(p0, "activity");
       String localClassNa = p0.getLocalClassName();
       a.h(localClassNa, "activity.localClassName");
       MemoryMonitor.mActivityMap.put(Integer.valueOf(p0.hashCode()), localClassNa);
       MemoryMonitor.mCurrentSession = this.genSessionId(p0);
    }
    public void onActivityDestroyed(Activity p0){
       a.q(p0, "activity");
       ConcurrentHashMap mActivityMap = MemoryMonitor.mActivityMap;
       mActivityMap.remove(Integer.valueOf(p0.hashCode()));
       if (mActivityMap.isEmpty()) {
          MemoryMonitor.mCurrentSession = null;
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityResumed(Activity p0){
       a.q(p0, "activity");
       MemoryMonitor.mCurrentSession = this.genSessionId(p0);
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.q(p0, "activity");
       a.q(p1, "outState");
    }
    public void onActivityStarted(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
    }
    public void onApplicationPostCreate(){
       super.onApplicationPostCreate();
       k.b().registerActivityLifecycleCallbacks(this);
    }
    public final void startSection(String p0){
       MemoryMonitor.startSection$default(this, p0, null, false, 0, null, 30, null);
    }
    public final void startSection(String p0,String p1){
       MemoryMonitor.startSection$default(this, p0, p1, false, 0, null, 28, null);
    }
    public final void startSection(String p0,String p1,boolean p2){
       MemoryMonitor.startSection$default(this, p0, p1, p2, 0, null, 24, null);
    }
    public final void startSection(String p0,String p1,boolean p2,int p3){
       MemoryMonitor.startSection$default(this, p0, p1, p2, p3, null, 16, null);
    }
    public final void startSection(String p0,String p1,boolean p2,int p3,p p4){
       a.q(p0, "section");
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       if (!this.isInitialized()) {
          return;
       }
       if (p2) {
          MemoryMonitor.startSectionInternal$default(this, p0, p1, p3, false, false, p4, 24, null);
       }else {
          MemoryMonitor.startSectionInternal$default(this, p0, p1, p3, false, false, p4, 16, null);
       }
       LoopMonitor.startLoop$default(this, true, true, 0, 4, null);
       return;
    }
    public final void startSectionInternal(String p0,String p1,int p2,boolean p3,boolean p4,p p5){
       if (p1 != null) {
       }else {
          p1 = MemoryMonitor.mCurrentSession;
       }
       a uoa = new a(p0, p1, p2);
       uoa.startTime = System.currentTimeMillis();
       if (p3 && !p4) {
          b.a(uoa, c.a(k.b()), MemoryMonitor.INSTANCE.update(MemoryMonitor.mMemoryInfo));
       }
       MemoryMonitor.mMemoryEventMap.put(p0, uoa);
       if (p5 != null) {
          MemoryMonitor.mLogJudgerMap.put(p0, p5);
       }
       return;
    }
    public final void stopSection(String p0){
       MemoryMonitor.stopSection$default(this, p0, false, 2, null);
    }
    public final void stopSection(String p0,boolean p1){
       a.q(p0, "section");
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       if (!this.isInitialized()) {
          return;
       }
       if (p1) {
          MemoryMonitor.stopSectionInternal$default(this, p0, false, false, true, 6, null);
       }else {
          MemoryMonitor.stopSectionInternal$default(this, p0, false, true, true, 2, null);
       }
       if (MemoryMonitor.mMemoryEventMap.isEmpty()) {
          this.stopLoop();
       }
       return;
    }
    public final void stopSectionInternal(String p0,boolean p1,boolean p2,boolean p3){
       ReentrantLock mLock = MemoryMonitor.mLock;
       mLock.lock();
       ConcurrentHashMap mMemoryEvent = MemoryMonitor.mMemoryEventMap;
       long l = mMemoryEvent.remove(p0);
       if (l != null) {
          a.h(l, "mMemoryEventMap.remove\(section\) ?: return@withLock");
          if (p3) {
             MemoryMonitor.mLastMemoryEventMap.remove(p0);
             MemoryMonitor.mLogJudgerMap.remove(p0);
          }else {
             MemoryMonitor.mLastMemoryEventMap.put(p0, l);
          }
          MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
          l.maxJvmHeapSize = iNSTANCE.getMLazyMaxJvmHeapSize();
          l.maxRamSize = iNSTANCE.getMLazyMaxRamSize();
          l.deviceRamSize = iNSTANCE.getMLazyDeviceRamSize();
          l.deviceRamLevel = iNSTANCE.calculateRamLevel(iNSTANCE.getMLazyDeviceRamSize());
          l.lmkThres = iNSTANCE.getMLazyLowMemoryKillThreshold();
          Collection uCollection = MemoryMonitor.mActivityMap.values();
          a.h(uCollection, "mActivityMap.values");
          l.activityStack = CollectionsKt___CollectionsKt.G5(uCollection);
          l.endTime = System.currentTimeMillis();
          ConcurrentHashMap mMemoryEvent1 = MemoryMonitor.mMemoryEventHistoryMap;
          l.lastEvent = mMemoryEvent1.get(Integer.valueOf(l.level));
          l.extraMap.putAll(iNSTANCE.getMonitorConfig().b.invoke());
          mMemoryEvent1.put(Integer.valueOf(l.level), l.mark);
          Iterator iterator = mMemoryEvent.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue().level < l.level && a.g(uEntry.getValue().sessionId, l.sessionId)) {
                l.levelMap.put(Integer.valueOf(uEntry.getValue().level), uEntry.getValue().section);
             }
          }
          if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
             if (p1 && !p2) {
                b.a(l, c.a(k.b()), MemoryMonitor.INSTANCE.update(MemoryMonitor.mMemoryInfo));
             }
             MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1 ostopSection = new MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1(l, p0, p3, p1, p2);
             Monitor_ThreadKt.b(0, v9, 1, null);
          }else if(p1){
             b.a(l, c.a(k.b()), MemoryMonitor.INSTANCE.update(MemoryMonitor.mMemoryInfo));
          }
          p0 = new Gson().q(l);
          d$a.c(i.a, "memoryEvent", p0, false, 4, null);
          a.h(p0, "it");
          h.d("MemoryMonitor", p0);
       }
       mLock.unlock();
       return;
    }
    public final ActivityManager$MemoryInfo update(ActivityManager$MemoryInfo p0){
       Application uApplication = k.b();
       a.q(uApplication, "context");
       a.q(p0, "memoryInfo");
       ActivityManager systemServic = uApplication.getApplicationContext().getSystemService("activity");
       if (systemServic != null) {
          systemServic.getMemoryInfo(p0);
       }
       return p0;
    }
    public final void updateCurrentSession(Activity p0){
       if (MemoryMonitor.mCurrentSession == null) {
          String str = (p0 != null)? MemoryMonitor.INSTANCE.genSessionId(p0): null;
          MemoryMonitor.mCurrentSession = str;
          Iterator iterator = MemoryMonitor.mMemoryEventMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue().sessionId == null) {
                uEntry.getValue().sessionId = MemoryMonitor.mCurrentSession;
             }
          }
          if (p0 != null) {
             String localClassNa = p0.getLocalClassName();
             a.h(localClassNa, "activity.localClassName");
             MemoryMonitor.mActivityMap.put(Integer.valueOf(p0.hashCode()), localClassNa);
          }
       }
       return;
    }
}
