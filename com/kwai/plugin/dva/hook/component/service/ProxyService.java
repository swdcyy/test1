package com.kwai.plugin.dva.hook.component.service.ProxyService;
import android.app.Service;
import java.util.HashMap;
import java.util.HashSet;
import android.util.SparseArray;
import android.os.RemoteCallbackList;
import com.kwai.plugin.dva.hook.component.service.ProxyService$a;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import java.lang.ClassLoader;
import android.os.Bundle;
import com.kwai.plugin.dva.hook.component.PluginService;
import java.util.Map;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.lang.Exception;
import java.util.Iterator;
import android.os.IBinder;
import android.content.res.Configuration;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Number;

public abstract class ProxyService extends Service	// class@001339
{
    public Map b;
    public Map c;
    public Set d;
    public Set e;
    public Set f;
    public SparseArray g;
    public Map h;
    public RemoteCallbackList i;
    public a$a j;

    public void ProxyService(){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashSet();
       this.e = new HashSet();
       this.f = new HashSet();
       this.g = new SparseArray();
       this.h = new HashMap();
       this.i = new RemoteCallbackList();
       this.j = new ProxyService$a(this);
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "20")) {
          return;
       }
       String str = this.d(p0);
       d.c("autoSetIntentClassLoader "+str);
       Plugin plugin = Dva.instance().getPlugin(str);
       if (plugin != null) {
          d.c("autoSetIntentClassLoader "+plugin);
          p0.setExtrasClassLoader(plugin.getClassLoader());
          Bundle bundleExtra = p0.getBundleExtra("service_data");
          if (bundleExtra != null) {
             bundleExtra.setClassLoader(plugin.getClassLoader());
             p0.putExtras(bundleExtra);
          }
       }
       return;
    }
    public void b(PluginService p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "18")) {
          return;
       }
       String name = p0.getClass().getName();
       Set set = this.c.get(name);
       if (set == null || (set.isEmpty() && !this.d.contains(name))) {
          p0.onDestroy();
          this.e.remove(name);
          this.b.remove(name);
          this.f.remove(name);
       }
       if (!PatchProxy.applyVoid(null, this, ProxyService.class, "19")) {
          this.b.isEmpty();
       }
       return;
    }
    public PluginService c(Intent p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ProxyService.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f(p0);
       PluginService pluginServic = null;
       if (obj == null) {
          return pluginServic;
       }
       PluginService pluginServic1 = this.b.get(obj);
       if (pluginServic1 == null) {
          Plugin plugin = Dva.instance().getPlugin(this.d(p0));
          try{
             PluginService pluginServic2 = plugin.getClassLoader().loadClass(obj).newInstance();
             pluginServic2.setPlugin(plugin);
             pluginServic2.setProxyService(this);
             pluginServic2.attach(this.getBaseContext());
             pluginServic2.onCreate();
             this.b.put(obj, pluginServic2);
             pluginServic1 = pluginServic2;
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             return this.b;
          }
       }
       p0.setClass(this, pluginServic1.getClass());
       p0.setExtrasClassLoader(pluginServic1.getClassLoader());
       return pluginServic1;
    }
    public final String d(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProxyService.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getStringExtra("service_plugin_id");
    }
    public PluginService e(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProxyService.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = this.f(p0);
       if (str == null) {
          return null;
       }
       return this.b.get(str);
    }
    public final String f(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProxyService.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getStringExtra("service_name");
    }
    public void g(Set p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProxyService.class, "12")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().filterEquals(p1)) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public void h(Service p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "23")) {
          return;
       }
       this.f.remove(p0.getClass().getName());
       if (this.f.isEmpty()) {
          this.stopForeground(true);
       }
       return;
    }
    public IBinder onBind(Intent p0){
       return this.j;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "6")) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onConfigurationChanged(p0);
       }
       super.onConfigurationChanged(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProxyService.class, "5")) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy();
       }
       d.c("ProxyService Destroy "+this.getClass().getName());
       this.i.kill();
       super.onDestroy();
       return;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, ProxyService.class, "7")) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onLowMemory();
       }
       super.onLowMemory();
       return;
    }
    public void onRebind(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "1")) {
          return;
       }
       super.onRebind(p0);
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ProxyService.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProxyService.class, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int i = 1;
       if (p0 == null) {
          return i;
       }else {
          this.a(p0);
          int intExtra = p0.getIntExtra("service_command", -1);
          if (intExtra != i) {
             if (intExtra != 2) {
                return i;
             }else if(PatchProxy.isSupport(ProxyService.class)){
                String obj1 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProxyService.class, "4");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                label_005c :
                   PluginService pluginServic = this.e(p0);
                   if (pluginServic != null) {
                      obj1 = pluginServic.getClass().getName();
                      d.c("stopService "+obj1);
                      this.d.remove(obj1);
                      this.b(pluginServic);
                   }
                }
             }else {
                goto label_005c ;
             }
             return i;
          }else if(PatchProxy.isSupport(ProxyService.class)){
             Object obj2 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProxyService.class, "3");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else {
             label_00aa :
                PluginService pluginServic1 = this.c(p0);
                if (pluginServic1 != null) {
                   p0.setClass(this, pluginServic1.getClass());
                   p0.setExtrasClassLoader(pluginServic1.getClassLoader());
                   obj = pluginServic1.getClass().getName();
                   d.c("startService "+obj);
                   this.d.add(obj);
                   i = pluginServic1.onStartCommand(p0, p1, p2);
                }
             }
          }else {
             goto label_00aa ;
          }
          return i;
       }
    }
    public void onTaskRemoved(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyService.class, "8")) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onTaskRemoved(p0);
       }
       super.onTaskRemoved(p0);
       return;
    }
    public boolean onUnbind(Intent p0){
       return false;
    }
}
