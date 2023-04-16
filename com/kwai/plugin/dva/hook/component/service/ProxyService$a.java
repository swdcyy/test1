package com.kwai.plugin.dva.hook.component.service.ProxyService$a;
import ki7.a$a;
import com.kwai.plugin.dva.hook.component.service.ProxyService;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.hook.component.PluginService;
import java.lang.StringBuilder;
import qj7.d;
import android.content.Context;
import java.lang.ClassLoader;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import android.util.SparseArray;
import java.util.HashMap;
import android.app.Service;
import ki7.b;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.lang.Boolean;
import dj7.b;
import android.os.IBinder$DeathRecipient;
import java.lang.Exception;
import java.lang.Thread;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.hook.component.service.ProxyService$a$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class ProxyService$a extends a$a	// class@001338
{
    public final ProxyService b;

    public void ProxyService$a(ProxyService p0){
       this.b = p0;
       super();
    }
    public IBinder M1(int p0,Intent p1){
       PluginService obj;
       Intent intent;
       IBinder iBinder;
       if (PatchProxy.isSupport(ProxyService$a.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ProxyService$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b.c(p1);
       if (obj != null) {
          String name = obj.getClass().getName();
          d.c("onBind "+name);
          p1.setClass(this.b, obj.getClass());
          p1.setExtrasClassLoader(obj.getClassLoader());
          Set set = this.b.c.get(name);
          if (set == null) {
             set = new HashSet();
             this.b.c.put(name, set);
          }
          Iterator iterator = set.iterator();
          while (true) {
             if (iterator.hasNext()) {
                intent = iterator.next();
                if (p1.filterEquals(intent)) {
                   return this.b.h.get(intent);
                }
                continue ;
             }else {
                set.add(p1);
                ProxyService$a tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.isSupport(ProxyService.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), name, p1, tb, ProxyService.class, "9")) {
                   Map map = tb.g.get(p0);
                   if (map == null) {
                      map = new HashMap();
                      tb.g.put(p0, map);
                   }
                   Set set1 = map.get(name);
                   if (set1 == null) {
                      set1 = new HashSet();
                      map.put(name, set1);
                   }
                   set1.add(p1);
                   d.c("addPluginBindIntent, callingPid: "+p0+"serviceName: "+name+"intent: "+p1.toString());
                }
                iBinder = obj.onBind(p1);
                if (iBinder != null) {
                   this.b.h.put(p1, iBinder);
                   break ;
                }
                break ;
             }
          }
          return iBinder;
       }else {
          return null;
       }
    }
    public void P(int p0,b p1){
       if (PatchProxy.isSupport(ProxyService$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ProxyService$a.class, "5")) {
          return;
       }
       this.b.i.unregister(p1);
       return;
    }
    public boolean R(int p0,Intent p1){
       PluginService obj;
       if (PatchProxy.isSupport(ProxyService$a.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ProxyService$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b.a(p1);
       obj = this.b.e(p1);
       if (obj != null) {
          String name = obj.getClass().getName();
          d.c("onUnbind "+name);
          p1.setClass(this.b, obj.getClass());
          p1.setExtrasClassLoader(obj.getClassLoader());
          this.b.h.remove(p1);
          this.b.g(this.b.c.get(name), p1);
          ProxyService$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(ProxyService.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), name, p1, tb, ProxyService.class, "10")) {
             Map map = tb.g.get(p0);
             if (map != null) {
                Set set = map.get(name);
                if (set != null) {
                   tb.g(set, p1);
                   d.c("removeIntentFromSet, callingPid: "+p0+"serviceName: "+name+"intent: "+p1.toString());
                }
             }
          }
          if (obj.onUnbind(p1)) {
             this.b.e.add(name);
          }else {
             this.b.e.remove(name);
          }
          this.b.b(obj);
       }
       return false;
    }
    public void S0(int p0,b p1){
       if (PatchProxy.isSupport(ProxyService$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ProxyService$a.class, "4")) {
          return;
       }
       d.c("register notify callback, callingPid: "+p0);
       IBinder iBinder = p1.asBinder();
       if (iBinder != null) {
          try{
             iBinder.linkToDeath(new b(this, p0), 0);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public IBinder U0(int p0,Intent p1){
       if (PatchProxy.isSupport(ProxyService$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ProxyService$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Thread.currentThread().getName();
       this.b.a(p1);
       int i = 1;
       IBinder[] iBinderArray = new IBinder[i];
       if (Looper.myLooper() == Looper.getMainLooper()) {
          iBinderArray[0] = this.M1(p0, p1);
       }else {
          CountDownLatch uCountDownLa = new CountDownLatch(i);
          ProxyService$a$a uoa$a = new ProxyService$a$a(this, iBinderArray, p0, p1, uCountDownLa);
          WorkExecutors.b.execute(v10);
          try{
             p0 = 60;
             uCountDownLa.await(p0, TimeUnit.SECONDS);
          }catch(java.lang.InterruptedException e12){
             e12.printStackTrace();
          }
       }
    }
}
