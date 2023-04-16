package com.yxcorp.gifshow.init.InitManagerImpl;
import a76.d;
import java.lang.Object;
import pxa.f;
import java.util.Collection;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Trace;
import android.app.Application;
import yf7.k;
import com.yxcorp.gifshow.init.InitManagerImpl$1;
import androidx.lifecycle.LifecycleEventObserver;
import yf7.p;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import java.util.Iterator;
import com.kwai.framework.init.a;
import pxa.b;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import com.yxcorp.utility.SystemUtil;
import android.os.DeadObjectException;
import java.lang.OutOfMemoryError;
import android.os.TransactionTooLargeException;
import java.lang.UnsatisfiedLinkError;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import android.app.Activity;
import com.yxcorp.gifshow.init.InitManagerImpl$onLaunchFinish$f$1;
import java.io.File;
import o56.a;
import qkd.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import java.lang.Thread;
import java.lang.NullPointerException;
import java.lang.Exception;
import flc.a;
import android.os.SystemClock;
import glc.b;
import wkd.b;
import b76.a;
import com.yxcorp.gifshow.init.InitManagerImpl$onLaunchFinish$1;
import vsd.i;
import o56.d;
import com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityDestroy$f$1;
import com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityDestroy$1;
import vsd.c;
import bl0.c;
import nsd.s0;
import com.yxcorp.gifshow.KwaiApp;
import ok.x;
import bl0.a;
import android.os.Bundle;
import com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityCreate$f$1;
import com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityCreate$1;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.ArrayList;
import java.lang.Iterable;

public class InitManagerImpl implements d	// class@0011c0
{
    public Collection a;
    public final String b;
    public boolean c;
    public final ConcurrentHashMap d;
    public Activity e;
    public Bundle f;

    public void InitManagerImpl(){
       super();
       Collection uCollection = new f().a();
       a.o(uCollection, "KwaiInitConfigSupplier\(\).get\(\)");
       this.a = uCollection;
       this.b = "InitManagerImpl";
       this.d = new ConcurrentHashMap();
       Trace.beginSection("InitManagerImpl#<init>");
       p.c(k.b(), new InitManagerImpl$1(this));
       Trace.endSection();
    }
    public static void b(InitManagerImpl p0,l p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       if (!PatchProxy.isSupport2(InitManagerImpl.class, "7") || !PatchProxy.applyVoidThreeRefsWithListener(p1, p2, Boolean.valueOf(p3), p0, InitManagerImpl.class, "7")) {
          p5 = p0.a;
          _monitor_enter(p5);
          List list = CollectionsKt___CollectionsKt.J5(p0.a);
          p0.d.put(p2, list);
          _monitor_exit(p5);
          p5 = list.iterator();
          while (p5.hasNext()) {
             a uoa = p5.next();
             if (uoa == null) {
                continue ;
             }else {
                b uob = new b(p0, p1, uoa, p2);
                if (p3) {
                   e.g(uob, uoa.name());
                }else {
                   uob.run();
                }
             }
          }
          PatchProxy.onMethodExit(InitManagerImpl.class, "7");
       }
       return;
    }
    public Collection a(){
       List list = PatchProxy.applyWithListener(null, this, InitManagerImpl.class, "11");
       if (list != PatchProxyResult.class) {
       }else {
          InitManagerImpl ta = this.a;
          _monitor_enter(ta);
          _monitor_exit(ta);
          PatchProxy.onMethodExit(InitManagerImpl.class, "11");
          list = CollectionsKt___CollectionsKt.J5(this.a);
       }
       return list;
    }
    public final void c(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, InitManagerImpl.class, "9")) {
          return;
       }
       System.err.println("init module execute "+p1+" error!");
       if (!SystemUtil.K()) {
          JavaExceptionMessage javaExceptio = (!p0 instanceof DeadObjectException && (!p0 instanceof OutOfMemoryError && (p0 instanceof TransactionTooLargeException || p0 instanceof UnsatisfiedLinkError)))? 1: null;
          if (!javaExceptio) {
             CrashMonitor.handleException(p0, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.FAKE_EXCEPTION);
             PatchProxy.onMethodExit(InitManagerImpl.class, "9");
             return;
          }
       }
       PatchProxy.onMethodExit(InitManagerImpl.class, "9");
       throw p0;
    }
    public Activity getHomeActivity(){
       return this.e;
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, InitManagerImpl.class, "5")) {
          return;
       }
       if (this.c != null) {
          PatchProxy.onMethodExit(InitManagerImpl.class, "5");
          return;
       }else {
          this.c = true;
          InitManagerImpl$onLaunchFinish$f$1 iNSTANCE = InitManagerImpl$onLaunchFinish$f$1.INSTANCE;
          String str = "6";
          if (!PatchProxy.applyVoidWithListener(objArray, this, InitManagerImpl.class, str) && SystemUtil.K()) {
             try{
                File uFile = new File(a.b().getExternalFilesDir(objArray), "performance/startup/launchfinish");
                String str1 = b.f0(uFile);
                uFile.getAbsolutePath();
                if (!TextUtils.isEmpty(str1)) {
                   a.o(str1, "delayTime");
                   if (str1 != null) {
                      Thread.sleep((long)Integer.parseInt(StringsKt__StringsKt.o5(str1).toString()));
                   }else {
                      PatchProxy.onMethodExit(InitManagerImpl.class, str);
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                   }
                }
             }catch(java.lang.Exception e6){
                e6.printStackTrace();
             }
             PatchProxy.onMethodExit(InitManagerImpl.class, str);
          }
          a uoa = a.class;
          if (!PatchProxy.applyVoid(objArray, objArray, uoa, "1")) {
             SystemClock.elapsedRealtime();
             Collection uCollection = PatchProxy.apply(objArray, objArray, uoa, "2");
             if (uCollection != PatchProxyResult.class) {
             }else {
                uCollection = new b().a();
             }
             b.a(-2118755940).n(uCollection);
             SystemClock.elapsedRealtime();
          }
          InitManagerImpl.b(this, new InitManagerImpl$onLaunchFinish$1(iNSTANCE, new a()), "onLaunchFinish", false, 4, null);
          a.p = true;
          PatchProxy.onMethodExit(InitManagerImpl.class, "5");
          return;
       }
    }
    public void l(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       d.j = false;
       this.e = null;
       this.f = null;
       InitManagerImpl$onHomeActivityDestroy$f$1 iNSTANCE = InitManagerImpl$onHomeActivityDestroy$f$1.INSTANCE;
       InitManagerImpl.b(this, new InitManagerImpl$onHomeActivityDestroy$1(iNSTANCE, p0), iNSTANCE.getName(), false, 4, null);
       PatchProxy.onMethodExit(InitManagerImpl.class, "2");
       return;
    }
    public void m(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl.class, "12")) {
          return;
       }
       a.p(p0, "task");
       InitManagerImpl ta = this.a;
       _monitor_enter(ta);
       InitManagerImpl ta1 = this.a;
       if (ta1 != null) {
          s0.g(ta1).add(p0);
          _monitor_exit(ta);
          KwaiApp.mTaskDispatcher.get().m(p0);
          PatchProxy.onMethodExit(InitManagerImpl.class, "12");
          return;
       }else {
          PatchProxy.onMethodExit(InitManagerImpl.class, "12");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.kuaishou.launch.v2.Task>");
       }
    }
    public void n(Collection p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl.class, "13")) {
          return;
       }
       a.p(p0, "tasks");
       InitManagerImpl ta = this.a;
       _monitor_enter(ta);
       InitManagerImpl ta1 = this.a;
       if (ta1 != null) {
          s0.g(ta1).addAll(p0);
          _monitor_exit(ta);
          KwaiApp.mTaskDispatcher.get().n(p0);
          PatchProxy.onMethodExit(InitManagerImpl.class, "13");
          return;
       }else {
          PatchProxy.onMethodExit(InitManagerImpl.class, "13");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.kuaishou.launch.v2.Task>");
       }
    }
    public void o(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, InitManagerImpl.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       this.e = p0;
       this.f = p1;
       InitManagerImpl$onHomeActivityCreate$f$1 iNSTANCE = InitManagerImpl$onHomeActivityCreate$f$1.INSTANCE;
       InitManagerImpl$onHomeActivityCreate$1 oonHomeActiv = new InitManagerImpl$onHomeActivityCreate$1(iNSTANCE, p0, p1);
       String name = iNSTANCE.getName();
       if (!PatchProxy.applyVoidTwoRefsWithListener(oonHomeActiv, name, this, InitManagerImpl.class, "8")) {
          InitManagerImpl ta = this.a;
          _monitor_enter(ta);
          List list = CollectionsKt___CollectionsKt.J5(this.a);
          this.d.put(name, list);
          _monitor_exit(ta);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null && uoa.o != null) {
                oonHomeActiv.invoke(uoa);
             }
          }
          PatchProxy.onMethodExit(InitManagerImpl.class, "8");
       }
       PatchProxy.onMethodExit(InitManagerImpl.class, "1");
       return;
    }
    public String p(){
       InitManagerImpl obj = PatchProxy.applyWithListener(null, this, InitManagerImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = CollectionsKt___CollectionsKt.J5(this.a).iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa != null) {
             uArrayList.add(uoa.name()+": "+uoa.r());
          }
       }
       PatchProxy.onMethodExit(InitManagerImpl.class, "10");
       return uArrayList.toString();
    }
    public Bundle q(){
       return this.f;
    }
    public Boolean r(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, InitManagerImpl.class, "14");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "clazz");
          a.p(p1, "methodName");
          Collection uCollection = this.d.get(p1);
          int i = (uCollection == null || uCollection.isEmpty())? 1: 0;
          if (i) {
             PatchProxy.onMethodExit(InitManagerImpl.class, "14");
          }else if(uCollection instanceof Collection && uCollection.isEmpty()){
             Iterator iterator = uCollection.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                Class class = (uoa != null)? uoa.getClass(): null;
                if (a.g(class, p0)) {
                   b = 1;
                   break ;
                }
             }
          }
          b = b ^ 1;
          PatchProxy.onMethodExit(InitManagerImpl.class, "14");
       }
       return Boolean.valueOf(b);
    }
}
