package com.kwai.plugin.dva.hook.component.service.ServiceManager;
import dj7.d;
import java.lang.Object;
import com.kwai.plugin.dva.entity.Plugin;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import android.content.ComponentName;
import java.util.Map;
import dj7.d$a;
import ki7.a;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import android.app.Application;
import dj7.c;
import com.kwai.plugin.dva.feature.core.hook.a;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.StringBuilder;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.ClassLoader;
import android.os.Process;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.RemoteException;
import java.lang.IllegalArgumentException;
import android.app.Service;
import android.app.Notification;
import com.kwai.plugin.dva.hook.component.PluginService;
import com.kwai.plugin.dva.hook.component.service.ProxyService;
import java.util.Objects;
import com.kwai.plugin.dva.work.WorkExecutors;
import dj7.a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class ServiceManager	// class@00133a
{
    public static final d a;

    static {
       ServiceManager.a = new d();
    }
    public void ServiceManager(){
       super();
    }
    public static boolean a(Plugin p0,Context p1,Intent p2,ServiceConnection p3,int p4){
       ComponentName obj;
       d a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ServiceManager serviceManag = ServiceManager.class;
       if (PatchProxy.isSupport(serviceManag)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, serviceManag, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = p2.getComponent();
       if (ServiceManager.b(p0, p1, p2)) {
          a = ServiceManager.a;
          String className = obj.getClassName();
          _monitor_enter(a);
          d$a obj1 = PatchProxy.applyFourRefs(p0, p2, p3, className, a, d.class, "1");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
             _monitor_exit(a);
          }else if(a.d.containsKey(p3)){
             _monitor_exit(a);
          }else {
             String className1 = p2.getComponent().getClassName();
             obj1 = new d$a(a);
             obj1.b = p2;
             obj1.c = p3;
             obj1.e = className;
             obj1.a = p0;
             obj1.d = className1;
             a.d.put(p3, obj1);
             a uoa = a.a.get(className1);
             if (uoa == null) {
                List list = a.c.get(className1);
                if (list == null) {
                   list = new LinkedList();
                   a.c.put(className1, list);
                }
                list.add(obj1);
                if (!a.b.contains(className1)) {
                   a.b.add(className1);
                   if (!PatchProxy.applyVoidTwoRefs(p0, className1, a, d.class, "4")) {
                      Context baseContext = p0.getApplication().getBaseContext();
                      list = new Intent();
                      list.setClassName(baseContext, className1);
                      a.a(baseContext, list, new c(a, className1), 1);
                   }
                }
             }else {
                a.a(p2, p3, obj1, uoa);
             }
             _monitor_exit(a);
          }
          return 1;
       }else {
          return a.a(p1, p2, p3, p4);
       }
    }
    public static boolean b(Plugin p0,Context p1,Intent p2){
       ServiceInfo serviceInfo1;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ServiceManager.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p2.getComponent() == null) {
          return b;
       }
       obj = p2.getComponent().getClassName();
       Iterator obj1 = PatchProxy.applyFourRefs(p1, p0, obj, p2, null, ServiceManager.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          String packageName = p2.getComponent().getPackageName();
          obj1 = p0.getPluginInfo().services.iterator();
          try{
             while (true) {
                ServiceInfo serviceInfo = null;
                if (obj1.hasNext()) {
                   serviceInfo1 = obj1.next();
                   if (!(serviceInfo1.name).equals(obj)) {
                      continue ;
                   }
                }else {
                   serviceInfo1 = serviceInfo;
                }
                if (serviceInfo1 != null) {
                   PackageInfo packageInfo = p1.getPackageManager().getPackageInfo(p1.getPackageName(), 4);
                   String str = packageName;
                   serviceInfo1 = serviceInfo1.process;
                   if (serviceInfo1 == null) {
                      str1 = "";
                   }
                   str = str+str1;
                   packageInfo = packageInfo.services;
                   int len = packageInfo.length;
                   int i = 0;
                   while (i < len) {
                      object oobject = packageInfo[i];
                      ServiceInfo processName = oobject.processName;
                      if (processName == null) {
                         processName = packageName;
                      }
                      if ((oobject.name).startsWith("com.kwai.plugin.dva.hook.component.service.container") && str.equals(processName)) {
                         serviceInfo = oobject;
                      }
                      i = i + 1;
                   }
                   if (serviceInfo != null) {
                      p2.setClassName(packageName, serviceInfo.name);
                      Bundle extras = p2.getExtras();
                      if (extras != null) {
                         Iterator iterator = extras.keySet().iterator();
                         while (iterator.hasNext()) {
                            p2.removeExtra(iterator.next());
                         }
                      }
                      p2.putExtra("service_data", extras);
                      p2.setExtrasClassLoader(p0.getClassLoader());
                      p2.putExtra("service_name", obj);
                      p2.putExtra("service_plugin_id", p0.getName());
                      p2.addCategory(obj);
                      p2.addCategory("Process:"+Process.myPid());
                      b = true;
                   }
                }
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e11){
             e11.printStackTrace();
          }
       }
    }
    public static ComponentName c(Plugin p0,Context p1,Intent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ServiceManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (ServiceManager.b(p0, p1, p2)) {
          p2.putExtra("service_command", 1);
       }
       return a.d(p1, p2);
    }
    public static ComponentName d(Plugin p0,Context p1,Intent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ServiceManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (ServiceManager.b(p0, p1, p2)) {
          p2.putExtra("service_command", 1);
       }
       return a.e(p1, p2);
    }
    public static boolean e(Plugin p0,Context p1,Intent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ServiceManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!ServiceManager.b(p0, p1, p2)) {
          return p1.stopService(p2);
       }
       p2.putExtra("service_command", 2);
       a.e(p1, p2);
       return true;
    }
    public static void f(Plugin p0,ServiceConnection p1){
       d d;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ServiceManager.class, "4")) {
          return;
       }
       d a = ServiceManager.a;
       _monitor_enter(a);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, a, d.class, "3")) {
          _monitor_exit(a);
       }else {
          d$a uoa = a.d.get(p1);
          if (uoa != null) {
             a uoa1 = a.a.get(uoa.d);
             if (uoa1 != null) {
                try{
                   uoa1.R(Process.myPid(), uoa.b);
                   p1.onServiceDisconnected(new ComponentName(p0.getPackageInfo().packageName, uoa.e));
                }catch(android.os.RemoteException e5){
                   e5.printStackTrace();
                }
                d = a.d;
                d.remove(p1);
             }
             _monitor_exit(a);
          }else {
             throw new IllegalArgumentException("Service not registered: "+p1.getClass().getName());
          }
       }
       return;
    }
    public static final void startForeground(Service p0,int p1,Notification p2){
       if (PatchProxy.isSupport(ServiceManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, ServiceManager.class, "11")) {
          return;
       }
       if (p0 instanceof PluginService) {
          ProxyService proxyService = p0.getProxyService();
          Objects.requireNonNull(proxyService);
          if (!PatchProxy.isSupport(ProxyService.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, proxyService, ProxyService.class, "22")) {
             proxyService.f.add(p0.getClass().getName());
             proxyService.startForeground(p1, p2);
          }
       }else {
          p0.startForeground(p1, p2);
       }
       return;
    }
    public static final void stopForeground(Service p0,int p1){
       ServiceManager serviceManag = ServiceManager.class;
       if (PatchProxy.isSupport(serviceManag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, serviceManag, "13")) {
          return;
       }
       if (p0 instanceof PluginService) {
          p0.getProxyService().h(p0);
       }else {
          p0.stopForeground(p1);
       }
       return;
    }
    public static final void stopForeground(Service p0,boolean p1){
       ServiceManager serviceManag = ServiceManager.class;
       if (PatchProxy.isSupport(serviceManag) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, serviceManag, "12")) {
          return;
       }
       if (p0 instanceof PluginService) {
          p0.getProxyService().h(p0);
       }else {
          p0.stopForeground(p1);
       }
       return;
    }
    public static final void stopSelf(Service p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ServiceManager.class, "8")) {
          return;
       }
       if (p0 instanceof PluginService) {
          ProxyService proxyService = p0.getProxyService();
          Objects.requireNonNull(proxyService);
          if (!PatchProxy.applyVoidOneRefs(p0, proxyService, ProxyService.class, "21")) {
             WorkExecutors.b.execute(new a(proxyService, p0));
          }
       }else {
          p0.stopSelf();
       }
       return;
    }
    public static final void stopSelf(Service p0,int p1){
       if (PatchProxy.isSupport(ServiceManager.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ServiceManager.class, "9")) {
          return;
       }
       ServiceManager.stopSelf(p0);
       return;
    }
    public static final boolean stopSelfResult(Service p0,int p1){
       ServiceManager serviceManag = ServiceManager.class;
       if (PatchProxy.isSupport(serviceManag)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, serviceManag, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       ServiceManager.stopSelf(p0);
       return true;
    }
}
