package lj7.g;
import android.content.Context;
import nj7.e;
import mj7.c;
import java.lang.Object;
import java.util.ArrayList;
import qj7.e;
import android.app.Application;
import lj7.a;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import ji7.b;
import java.io.File;
import java.lang.String;
import android.os.Build$VERSION;
import ji7.a;
import com.kwai.plugin.dva.repository.model.DvaPluginConfig;
import java.lang.ClassLoader;
import java.util.List;
import mj7.d;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import li7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.concurrent.Future;
import lj7.f;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import java.util.concurrent.Callable;
import lj7.e;
import java.lang.System;
import android.content.pm.PackageInfo;
import lj7.h;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import com.kwai.plugin.dva.repository.store.a;
import com.kwai.plugin.dva.repository.model.ComponentInfo;
import qj7.d;
import android.content.res.AssetManager;
import java.util.Objects;
import android.content.res.XmlResourceParser;
import com.kwai.plugin.dva.repository.model.ServiceInfo;
import org.xmlpull.v1.XmlPullParser;
import java.lang.StringBuilder;
import com.kwai.plugin.dva.repository.model.BroadcastReceiverInfo;
import java.util.LinkedList;
import com.kwai.plugin.dva.repository.model.ContentProviderInfo;
import java.lang.Boolean;
import com.kwai.plugin.dva.repository.model.ActivityInfo;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Throwable;
import java.net.URLEncoder;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Iterator;
import com.kwai.plugin.dva.hook.component.PluginApplication;
import java.util.Map;
import com.kwai.plugin.dva.entity.Plugin;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import lj7.g$b;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.InterruptedException;
import lj7.b;
import java.lang.Exception;
import lj7.g$a;
import nj7.c;
import com.kwai.plugin.dva.util.c;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import qj7.a;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import com.kwai.plugin.dva.Dva;
import lj7.d;

public class g	// class@001da3
{
    public final e a;
    public final a b;
    public final Context c;
    public final c d;
    public final List e;
    public final List f;
    public final List g;
    public final e h;

    public void g(Context p0,e p1,c p2){
       super();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = new e();
       if (p0 instanceof Application) {
       }else {
          p0 = p0.getApplicationContext();
       }
       this.c = p0;
       this.a = p1;
       this.b = new a(p0);
       this.e = new ArrayList();
       this.d = p2;
       return;
    }
    public static b b(PluginInfo p0){
       File uFile = new File(p0.odexPath);
       if (Build$VERSION.SDK_INT < 26) {
          boolean b = true;
          if (!uFile.canRead()) {
             uFile.setReadable(b);
          }
          if (!uFile.canWrite()) {
             uFile.setWritable(b);
          }
          if (!uFile.canRead() || !uFile.canWrite()) {
             uFile = null;
          }
       }
       p0 = p0.dvaPluginConfig;
       b uob = new b(a.b, p0.apkPath, uFile, p0.soDir, p0.hostInterfaces, p0.hostPackages);
       return uFile;
    }
    public final a a(String p0,d p1,long p2,PluginInfo p3,PluginConfig p4){
       Future obj1;
       PluginInfo apkPath;
       ComponentInfo uComponentIn;
       DvaPluginConfig componentInf;
       g og1;
       Object obj6;
       Object obj7;
       Object obj8;
       long l3;
       ComponentInfo services;
       g og2;
       g og3;
       PluginInfo contentProvi;
       long l4;
       PluginApplication pluginApplic;
       long l5;
       long l6;
       CountDownLatch uCountDownLa;
       Executor b;
       Iterator iterator;
       ContentProviderInfo uContentProv;
       g h;
       AssetManager assets;
       e uoe;
       ComponentInfo uComponentIn1;
       XmlResourceParser xmlResourceP;
       ComponentInfo uComponentIn2;
       int eventType;
       int i5;
       g og4;
       e uoe1;
       String name;
       String str;
       String str1;
       ServiceInfo serviceInfo;
       int i6;
       int i7;
       String attributeVal;
       BroadcastReceiverInfo uBroadcastRe;
       String str2;
       String str3;
       LinkedList linkedList;
       LinkedList linkedList1;
       int attributeCou;
       String str4;
       String attributeVal1;
       ContentProviderInfo uContentProv1;
       int b1;
       int i8;
       ActivityInfo uActivityInf;
       String str5;
       String str6;
       int i9;
       a obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 1;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),oobject2,oobject3};
          obj1 = PatchProxy.apply(objArray, obj, og, "7");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = PatchProxy.applyOneRefs(oobject2, obj, og, "16");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = WorkExecutors.a().submit(new f(oobject2));
       }
       Future uFuture = PatchProxy.applyOneRefs(oobject2, obj, og, "17");
       if (uFuture != patchProxyRe) {
       }else {
          uFuture = WorkExecutors.a().submit(new e(obj, oobject2));
       }
       long l = System.currentTimeMillis();
       String obj2 = obj1.get();
       long l1 = System.currentTimeMillis();
       String obj3 = uFuture.get();
       long l2 = System.currentTimeMillis();
       g c = obj.c;
       h oh = h.class;
       g$b obj4 = null;
       PluginInfo obj5 = PatchProxy.applyTwoRefs(c, obj3, obj4, oh, "1");
       if (obj5 != patchProxyRe) {
          obj4 = obj5;
       }else if(obj3 == null){
          try{
             Object obj9 = PatchProxy.applyTwoRefs(c, obj3, obj4, oh, "4");
             obj4 = (obj9 != patchProxyRe)? obj9: c.getPackageManager().getResourcesForApplication(obj3.applicationInfo);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public synchronized Plugin c(String p0){
       Plugin plugin;
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       _monitor_enter(obj);
       Iterator iterator = this.e.iterator();
       while (true) {
          if (iterator.hasNext()) {
             plugin = iterator.next();
             if ((plugin.getName()).equals(p0)) {
                break ;
             }
          }else {
             _monitor_exit(obj);
             PluginInfo pluginInfo = new PluginInfo();
             pluginInfo.name = p0;
             pluginInfo.apkPath = this.c.getPackageResourcePath();
             pluginInfo.soDir = this.c.getApplicationInfo().nativeLibraryDir;
             g$a uoa = new g$a(this, p0, pluginInfo);
             g te = this.e;
             _monitor_enter(te);
             this.e.add(uoa);
             _monitor_exit(te);
             return uoa;
          }
       }
       _monitor_exit(obj);
       return plugin;
    }
    public synchronized Plugin d(String p0){
       d obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       obj.a = p0;
       Plugin plugin = this.f(p0, obj);
       if (this.d != null) {
          boolean b = (!null)? true: false;
          obj.c = b;
          if (null) {
             obj.e = (null instanceof PluginInstallException)? null.getCode(): 0x7530;
             obj.f = null.getMessage();
          }
          this.d.a(obj);
       }
       if (null == null) {
          return plugin;
       }else {
          throw null;
       }
    }
    public final PluginInfo e(String p0){
       PluginConfig name;
       PluginInfo pluginInfo;
       DvaPluginConfig this;
       File uFile3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       PluginConfig obj = PatchProxy.applyOneRefs(p0, this, og, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.g(p0);
       String str = "load plugin info, name: ";
       if (obj != null) {
          File uFile = c.a(obj.name, obj.version);
          if (uFile.exists()) {
             name = obj.name;
             PluginConfig version = obj.version;
             obj = obj.type;
             if (PatchProxy.isSupport(og)) {
                pluginInfo = PatchProxy.applyThreeRefs(name, Integer.valueOf(version), Integer.valueOf(obj), this, g.class, "13");
                if (pluginInfo != patchProxyRe) {
                label_00ed :
                   return pluginInfo;
                }
             }
             File uFile1 = c.a(name, version);
             uFile = c.d(name, version);
             File uFile2 = c.e(name, version);
             PluginInfo pluginInfo1 = new PluginInfo();
             pluginInfo1.name = name;
             pluginInfo1.version = version;
             pluginInfo1.apkPath = uFile1.getAbsolutePath();
             pluginInfo1.odexPath = uFile.getAbsolutePath();
             pluginInfo1.soDir = uFile2.getAbsolutePath();
             c uoc = c.class;
             this = null;
             if (PatchProxy.isSupport(uoc)) {
                uFile3 = PatchProxy.applyTwoRefs(name, Integer.valueOf(version), this, uoc, "8");
                if (uFile3 != patchProxyRe) {
                label_0095 :
                   pluginInfo1.dataDir = uFile3.getAbsolutePath();
                   if (obj == null) {
                      this = a.a(uFile1.getAbsolutePath());
                   }
                   if (this == null) {
                      this = DvaPluginConfig.emptyConfig(name, version);
                      d.a("readPluginInfo create empty config, name: "+name+" version : "+version);
                   }
                   pluginInfo1.dvaPluginConfig = this;
                   if (!uFile1.getParentFile().exists()) {
                      uFile1.getParentFile().mkdirs();
                   }
                   if (!uFile.exists()) {
                      uFile.mkdirs();
                   }
                   if (!uFile2.exists()) {
                      uFile2.mkdirs();
                   }
                   pluginInfo = pluginInfo1;
                   goto label_00ed ;
                }
             }
             uFile3 = new File(c.b(name, version), "data");
             goto label_0095 ;
          }else {
             d.a("loadPluginInfo apk not exist "+uFile.getAbsolutePath());
             throw new IllegalStateException(str+p0+" apk is not exist, path: "+uFile.getAbsolutePath());
          }
       }else {
          d.a("loadPluginInfo null");
          throw new IllegalArgumentException(str+p0+" config is null");
       }
    }
    public synchronized Plugin f(String p0,d p1){
       a uoa;
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = System.currentTimeMillis();
       obj = this.e;
       _monitor_enter(obj);
       Iterator iterator = this.e.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Plugin plugin = iterator.next();
             if ((plugin.getName()).equals(p0)) {
                _monitor_exit(obj);
                return plugin;
             }
          }else {
             _monitor_exit(obj);
             System.currentTimeMillis();
             PluginInfo pluginInfo = this.a.h(p0);
             if (pluginInfo == null) {
                pluginInfo = this.e(p0);
             }
             PluginInfo pluginInfo1 = pluginInfo;
             System.currentTimeMillis();
             PluginConfig pluginConfig = this.a.g(p0);
             System.currentTimeMillis();
             p1.b = pluginConfig.md5;
             if (pluginConfig.type == 1) {
                uoa = Dva.instance().getPluginLoader(pluginConfig.type).a(pluginConfig, pluginInfo1, p1);
                g te = this.e;
                _monitor_enter(te);
                this.e.add(uoa);
                _monitor_exit(te);
                break ;
             }else {
                uoa = this.a(p0, p1, l, pluginInfo1, pluginConfig);
                uoa.e(pluginConfig.type);
                break ;
             }
          }
       }
       System.currentTimeMillis();
       return uoa;
    }
}
