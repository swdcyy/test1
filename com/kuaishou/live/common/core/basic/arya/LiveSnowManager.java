package com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import jw4.e;
import com.kwai.video.krtc.EglContextHolder;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.GL.EglBase10$Context;
import com.kwai.video.krtc.GL.EglBase14$Context;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.live.common.core.basic.arya.b;
import android.app.Application;
import o56.a;
import jw4.g;
import jw4.d;
import com.kuaishou.live.common.core.basic.arya.d;
import java.util.concurrent.atomic.AtomicReference;
import w51.a;
import wkd.b;
import j80.c;
import java.io.File;
import com.kuaishou.live.common.core.basic.arya.c;
import lw4.a;
import com.kuaishou.live.common.core.basic.arya.e;
import android.content.Context;
import ok.x;
import brd.t;
import com.kuaishou.live.common.core.basic.arya.f;
import erd.o;

public class LiveSnowManager	// class@000e70
{
    public static String a;
    public static final AtomicBoolean b;
    public static boolean c;

    static {
       LiveSnowManager.b = new AtomicBoolean(false);
       LiveSnowManager.c = false;
    }
    public void LiveSnowManager(){
       super();
    }
    public static boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, LiveSnowManager.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, e.class, "3");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): EglContextHolder.isEgl14Context();
       return b;
    }
    public static Object b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, LiveSnowManager.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, e.class, "5");
       if (obj == patchProxyRe) {
          obj = EglContextHolder.sharedContext().nativeEglContext();
       }
       return obj;
    }
    public static Object c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, LiveSnowManager.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, e.class, "4");
       if (obj == patchProxyRe) {
          obj = EglContextHolder.sharedContext().nativeEglContext();
       }
       return obj;
    }
    public static String d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSnowManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveSnowManager.e();
       return p0.toString()+"@"+System.identityHashCode(p0);
    }
    public static boolean e(){
       AtomicReference a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveSnowManager liveSnowMana = LiveSnowManager.class;
       Application obj = PatchProxy.apply(null, null, liveSnowMana, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!b.b().a()) {
          return b;
       }
       if (LiveSnowManager.b.compareAndSet(b, true)) {
          obj = a.b();
          g.a = b;
          a = d.a;
          d uod = PatchProxy.apply(null, null, liveSnowMana, "16");
          if (uod != patchProxyRe) {
          }else {
             uod = d.b;
          }
          a.set(uod);
          if (a.o()) {
             LiveSnowManager.a = b.a(-1504323719).c("AryaDump").getAbsolutePath();
          }
          c b1 = c.b;
          e uoe = PatchProxy.apply(null, null, liveSnowMana, "17");
          if (uoe != patchProxyRe) {
          }else {
             uoe = e.a;
          }
          e.b(obj, b1, uoe);
          LiveSnowManager.c = true;
       }
       return LiveSnowManager.c;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, LiveSnowManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveSnowManager.e();
    }
    public static synchronized t g(Context p0){
       _monitor_enter(LiveSnowManager.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSnowManager.class, "4");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(LiveSnowManager.class);
          return obj;
       }else {
          _monitor_exit(LiveSnowManager.class);
          return LiveSnowManager.h(true, p0);
       }
    }
    public static synchronized t h(boolean p0,Context p1){
       _monitor_enter(LiveSnowManager.class);
       if (PatchProxy.isSupport(LiveSnowManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, LiveSnowManager.class, "5");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(LiveSnowManager.class);
             return obj;
          }
       }
       _monitor_exit(LiveSnowManager.class);
       return LiveSnowManager.i(p0, false, p1);
    }
    public static synchronized t i(boolean p0,boolean p1,Context p2){
       _monitor_enter(LiveSnowManager.class);
       if (PatchProxy.isSupport(LiveSnowManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, null, LiveSnowManager.class, "6");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(LiveSnowManager.class);
             return obj;
          }
       }
       _monitor_exit(LiveSnowManager.class);
       return b.b().d(p0, p1, p2).map(f.b);
    }
    public static synchronized boolean j(){
       _monitor_enter(LiveSnowManager.class);
       Object obj = PatchProxy.apply(null, null, LiveSnowManager.class, "3");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(LiveSnowManager.class);
          return obj.booleanValue();
       }else if(!b.b().f()){
          _monitor_exit(LiveSnowManager.class);
          return false;
       }else {
          _monitor_exit(LiveSnowManager.class);
          return LiveSnowManager.e();
       }
    }
}
