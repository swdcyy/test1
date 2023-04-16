package com.facebook.react.modules.core.TimingModule;
import com.facebook.react.bridge.LifecycleEventListener;
import ee.e;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import ae.e;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.core.TimingModule$a;
import com.facebook.react.modules.core.ReactChoreographer;
import je.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import vd.h;
import java.lang.Math;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.lang.Long;
import java.lang.System;
import com.facebook.react.modules.core.b$d;
import com.facebook.react.modules.core.b$a;
import java.util.PriorityQueue;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import ee.c;
import java.util.concurrent.atomic.AtomicBoolean;
import je.c;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;

public final class TimingModule extends ReactContextBaseJavaModule implements LifecycleEventListener, e	// class@001297
{
    public final b mJavaTimerManager;

    public void TimingModule(ReactApplicationContext p0,e p1){
       super(p0);
       this.mJavaTimerManager = new b(p0, new TimingModule$a(this), ReactChoreographer.a(), p1);
    }
    public void createTimer(int p0,int p1,double p2,boolean p3){
       if (PatchProxy.isSupport(TimingModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Double.valueOf(p2), Boolean.valueOf(p3), this, TimingModule.class, "2")) {
          return;
       }
       TimingModule tmJavaTimerM = this.mJavaTimerManager;
       Objects.requireNonNull(tmJavaTimerM);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Double.valueOf(p2), Boolean.valueOf(p3), tmJavaTimerM, b.class, "14")) {
          long l = h.a();
          long l1 = (long)p2;
          if (tmJavaTimerM.d.t() && Math.abs((l1 - l)) - 0xea60 > 0) {
             tmJavaTimerM.b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
          }
          l1 = Math.max(0, ((l1 - l) + (long)p1));
          if (!p1 && !p3) {
             WritableArray writableArra = Arguments.createArray();
             writableArra.pushInt(p0);
             tmJavaTimerM.b.callTimers(writableArra);
          }else if(PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(l1), Boolean.valueOf(p3), tmJavaTimerM, b.class, "13")){
             b$d uod = new b$d(p0, ((System.nanoTime() / 0xf4240) + l1), (int)l1, p3, null);
             b e = tmJavaTimerM.e;
             _monitor_enter(e);
             tmJavaTimerM.g.add(PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(l1), Boolean.valueOf(p3), tmJavaTimerM, b.class, "13"));
             tmJavaTimerM.h.put(p0, PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(l1), Boolean.valueOf(p3), tmJavaTimerM, b.class, "13"));
             _monitor_exit(e);
          }
       }
       return;
    }
    public void deleteTimer(int p0){
       TimingModule timingModule = TimingModule.class;
       if (PatchProxy.isSupport(timingModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timingModule, "3")) {
          return;
       }
       timingModule = this.mJavaTimerManager;
       Objects.requireNonNull(timingModule);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), timingModule, uob, "15")) {
          uob = timingModule.e;
          _monitor_enter(uob);
          b$d uod = timingModule.h.get(p0);
          if (uod == null) {
             _monitor_exit(uob);
          }else {
             timingModule.h.remove(p0);
             timingModule.g.remove(uod);
             _monitor_exit(uob);
          }
       }
       return;
    }
    public String getName(){
       return "Timing";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, TimingModule.class, "1")) {
          return;
       }
       this.getReactApplicationContext().addLifecycleEventListener(this);
       c.c(this.getReactApplicationContext()).a(this);
       return;
    }
    public void onCatalystInstanceDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimingModule.class, "10")) {
          return;
       }
       c.c(this.getReactApplicationContext()).f(this);
       TimingModule tmJavaTimerM = this.mJavaTimerManager;
       Objects.requireNonNull(tmJavaTimerM);
       if (!PatchProxy.applyVoid(objArray, tmJavaTimerM, b.class, "6")) {
          tmJavaTimerM.b();
          tmJavaTimerM.a();
       }
       return;
    }
    public void onHeadlessJsTaskFinish(int p0){
       TimingModule timingModule = TimingModule.class;
       if (PatchProxy.isSupport(timingModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timingModule, "9")) {
          return;
       }
       timingModule = this.mJavaTimerManager;
       Objects.requireNonNull(timingModule);
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), timingModule, uob, "5") && !c.c(timingModule.a).d())) {
          timingModule.j.set(false);
          timingModule.b();
          timingModule.c();
       }
       return;
    }
    public void onHeadlessJsTaskStart(int p0){
       TimingModule timingModule = TimingModule.class;
       if (PatchProxy.isSupport(timingModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timingModule, "8")) {
          return;
       }
       timingModule = this.mJavaTimerManager;
       Objects.requireNonNull(timingModule);
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), timingModule, uob, "4") && !timingModule.j.getAndSet(true))) {
          timingModule.e();
          timingModule.d();
       }
       return;
    }
    public void onHostDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimingModule.class, "7")) {
          return;
       }
       TimingModule tmJavaTimerM = this.mJavaTimerManager;
       Objects.requireNonNull(tmJavaTimerM);
       if (!PatchProxy.applyVoid(objArray, tmJavaTimerM, b.class, "2")) {
          tmJavaTimerM.b();
          tmJavaTimerM.c();
       }
       return;
    }
    public void onHostPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimingModule.class, "6")) {
          return;
       }
       TimingModule tmJavaTimerM = this.mJavaTimerManager;
       Objects.requireNonNull(tmJavaTimerM);
       if (!PatchProxy.applyVoid(objArray, tmJavaTimerM, b.class, "1")) {
          tmJavaTimerM.i.set(true);
          tmJavaTimerM.b();
          tmJavaTimerM.c();
       }
       return;
    }
    public void onHostResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimingModule.class, "5")) {
          return;
       }
       TimingModule tmJavaTimerM = this.mJavaTimerManager;
       Objects.requireNonNull(tmJavaTimerM);
       if (!PatchProxy.applyVoid(objArray, tmJavaTimerM, b.class, "3")) {
          tmJavaTimerM.i.set(false);
          tmJavaTimerM.e();
          tmJavaTimerM.d();
       }
       return;
    }
    public void setSendIdleEvents(boolean p0){
       TimingModule timingModule = TimingModule.class;
       if (PatchProxy.isSupport(timingModule) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timingModule, "4")) {
          return;
       }
       timingModule = this.mJavaTimerManager;
       Objects.requireNonNull(timingModule);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), timingModule, uob, "16")) {
          uob = timingModule.f;
          _monitor_enter(uob);
          timingModule.p = p0;
          _monitor_exit(uob);
          UiThreadUtil.runOnUiThread(new c(timingModule, p0));
       }
       return;
    }
}
