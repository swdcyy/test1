package com.kuaishou.bizmonitor.framework.funnel.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Random;
import java.lang.System;
import java.util.Collections;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.Executor;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.ThreadPoolExecutor$DiscardPolicy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import com.kuaishou.bizmonitor.framework.funnel.a$d;
import mu.b;
import com.kuaishou.bizmonitor.framework.funnel.a$e;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Thread;
import android.os.Looper;
import mu.e;
import java.io.File;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.ArrayList;
import com.kuaishou.bizmonitor.framework.funnel.a$f;
import com.google.gson.JsonElement;
import on.e;
import java.util.List;
import com.kuaishou.bizmonitor.framework.funnel.a$b;
import mu.d;
import mu.k;
import android.util.Pair;
import java.util.LinkedList;
import mu.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import j80.c;
import java.io.FileReader;
import com.google.gson.d;
import java.io.Reader;
import android.os.Process;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.bizmonitor.framework.funnel.a$c;
import mu.c;

public class a	// class@00114a
{
    public File a;
    public boolean b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final Random e;
    public List f;
    public long g;
    public static Executor h;

    public void a(){
       super();
       this.c = new ConcurrentHashMap();
       this.d = new ConcurrentHashMap();
       this.e = new Random(System.currentTimeMillis());
       this.f = Collections.EMPTY_LIST;
    }
    public static void c(Runnable p0,boolean p1){
       Object obj = null;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), obj, a.class, "24")) {
          return;
       }
       Executor uExecutor = PatchProxy.apply(obj, obj, a.class, "25");
       if (uExecutor != PatchProxyResult.class) {
       }else if(a.h == null){
          _monitor_enter(a.class);
          e uoe = new e(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(64), new b("funnel-pool"), new ThreadPoolExecutor$DiscardPolicy());
          a.h = a.h;
          _monitor_exit(a.class);
       }
       uExecutor = a.h;
       uExecutor.execute(p0);
       return;
    }
    public static a f(){
       return a$d.a;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       a$e uoe = this.c.remove(p0);
       Log.g("FunnelManager", "discardFunnel info:"+uoe+" funnel:"+p0);
       if (uoe != null) {
          this.d.remove(uoe);
          if (uoe.a != null) {
             if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a.c(new e(this, uoe), false);
             }else {
                this.g(uoe.e, uoe.b, uoe.d).delete();
             }
          }
       }
       return;
    }
    public void b(b p0){
       Iterator iterator;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "10")) {
          return;
       }
       a$e uoe = this.c.remove(p0);
       Log.g("FunnelManager", "endFunnel info:"+uoe+" funnel:"+p0);
       if (uoe != null) {
          this.d.remove(uoe);
          JsonObject jsonObject = PatchProxy.applyTwoRefs(p0, uoe, this, uoa, "18");
          if (jsonObject != PatchProxyResult.class) {
          }else {
             String str = p0.d();
             if (str == null || !str.length()) {
                Log.d("Funnel", p0.getClass().getSimpleName()+" does not have a uploadKey");
                jsonObject = null;
             }else {
                JsonObject jsonObject1 = p0.toJson();
                if (jsonObject1 != null) {
                   if (!PatchProxy.applyVoidOneRefs(jsonObject1, uoe, a$e.class, "1")) {
                      try{
                         a$e i = uoe.i;
                         if (i != null) {
                            iterator = i.iterator();
                            while (iterator.hasNext()) {
                               a$f uof = iterator.next();
                               e.d(jsonObject1, uof.a, e.e(uof.b));
                            }
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                   iterator = this.f.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(str, jsonObject1);
                   }
                }
             }
          }
          if (jsonObject != null) {
             this.m(p0, jsonObject, true);
          }
          if (uoe.a != null) {
             if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a.c(new d(this, uoe), false);
             }else {
                this.g(uoe.e, uoe.b, uoe.d).delete();
             }
          }
       }
       return;
    }
    public void d(k p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a$e uoe = this.c.get(p0);
       if (uoe == null) {
          return;
       }
       LinkedList linkedList = new LinkedList();
       linkedList.add(new Pair(uoe, p0));
       if (!PatchProxy.applyVoidOneRefs(linkedList, this, uoa, "15")) {
          a.c(new f(this, linkedList), true);
       }
       return;
    }
    public a$e e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get(p0);
    }
    public File g(String p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return new File(this.a, "pf__"+p1.getSimpleName()+"__"+p2);
       }
       return new File(p0, "pf__"+p1.getSimpleName()+"__"+p2);
    }
    public k h(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.k(b.a(-1504323719).h("funnel"));
       return this.i(this.a.getAbsolutePath(), p0, p1);
    }
    public k i(String p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j(p0, p1, p2, false);
    }
    public k j(String p0,Class p1,String p2,boolean p3){
       a$e obj;
       int i;
       k ok;
       FileReader uFileReader;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$e();
       obj.a = true;
       obj.b = p1;
       obj.d = p2;
       obj.e = p0;
       if (!p3) {
          b uob = this.d.get(obj);
          if (uob != null && p1.isInstance(uob)) {
             Log.b("FunnelManager", "getPersistentFunnel get cached "+p1.getClass().getSimpleName()+" id:"+p2);
             return uob;
          }
       }
       JsonObject jsonObject = null;
       if (p0 != null) {
          File uFile = this.g(p0, p1, p2);
          if (uFile.isFile()) {
             try{
                try{
                   uFileReader = new FileReader(uFile);
                   JsonObject jsonObject1 = new d(uFileReader).a().r();
                   jsonObject = jsonObject1.m0("data");
                   obj.f = jsonObject1.e0("createTime").t();
                   int i1 = jsonObject1.e0("createPid").p();
                   try{
                      obj.g = i1;
                      uFileReader.close();
                   }catch(java.io.IOException e0){
                   }
                }catch(java.lang.Exception e0){
                   FileReader uFileReader1 = uFileReader;
                   i = jsonObject;
                }
                try{
                   if (jsonObject) {
                      jsonObject.close();
                   }
                   jsonObject = i;
                }catch(java.io.IOException e0){
                }
             }catch(java.lang.Exception e0){
                i = jsonObject;
                goto label_00b8 ;
             }
          }
       }
    }
    public void k(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       if (this.a == null) {
          this.a = p0;
       }
       if (!this.g) {
          this.g = System.currentTimeMillis();
       }
       return;
    }
    public List l(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          a$e value = uEntry.getValue();
          a$e c = value.c;
          if (c == null) {
             c = uEntry.getKey().d();
             value.c = c;
          }
          if (p0.equals(c)) {
             obj.add(new a$c(this, uEntry.getKey(), value));
          }
       }
       Collections.sort(obj);
       return obj;
    }
    public void m(b p0,JsonObject p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "17")) {
          return;
       }
       if (p1 != null) {
          String str = "funnelSample";
          if (p1.e0(str) == null || p1.e0(str).d()) {
             c uoc = new c(this, p0, p1);
             if (p2) {
                a.c(uoc, false);
             }else {
                uoc.run();
             }
          }
       }
       return;
    }
}
