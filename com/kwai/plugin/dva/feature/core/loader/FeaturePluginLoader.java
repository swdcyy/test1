package com.kwai.plugin.dva.feature.core.loader.FeaturePluginLoader;
import lj7.d;
import android.content.Context;
import zi7.a;
import java.util.List;
import yi7.a;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArraySet;
import ri7.b;
import java.lang.Class;
import li7.a;
import kotlin.jvm.internal.Ref$LongRef;
import android.app.Application;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.System;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import mj7.d;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager;
import java.io.File;
import com.kwai.plugin.dva.feature.core.loader.FeaturePluginLoader$loadPlugin$classLoader$1;
import msd.a;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.feature.core.loader.classloader.classindex.IClassIndexProvider;
import ti7.a;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import com.kwai.plugin.dva.feature.core.loader.classloader.FeatureClassLoader;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.ActivityInfo;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.os.Build$VERSION;
import vi7.a;
import java.lang.CharSequence;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Collections;
import bj7.a;
import qj7.d;
import java.util.HashSet;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.b;
import qi7.a;
import ni7.a;
import java.lang.annotation.Annotation;
import java.lang.Throwable;
import qj7.h;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import com.kwai.plugin.dva.work.WorkExecutors;
import ri7.c;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.InterruptedException;
import trd.e1;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.util.Log;
import java.lang.IllegalStateException;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.a;
import android.content.res.AssetManager;
import ii7.b;
import trd.t;
import java.lang.Exception;
import java.lang.reflect.Method;
import com.kwai.plugin.dva.feature.core.hook.component.ContentProviderProxy;
import com.kwai.plugin.dva.feature.core.loader.classloader.SplitDexClassLoader;
import com.kwai.plugin.dva.Dva;
import dalvik.system.PathClassLoader;
import java.lang.Number;
import ji7.a;
import com.kwai.plugin.dva.feature.core.repository.a;

public final class FeaturePluginLoader implements d	// class@000e67
{
    public final Context a;
    public final a b;
    public final List c;
    public final a d;
    public final Collection e;
    public CopyOnWriteArraySet f;
    public final b g;

    public void FeaturePluginLoader(Context p0,a p1,List p2,a p3,Collection p4){
       a.p(p0, "context");
       a.p(p1, "source");
       a.p(p2, "beforeActiveApplicationInterceptors");
       a.p(p4, "useSysClassLoaderFeatures");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = new CopyOnWriteArraySet();
       this.g = new b();
    }
    public static final Application h(Class p0,a p1,Ref$LongRef p2){
       Application uApplication;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FeaturePluginLoader.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          uApplication = new Application();
       }else {
          uApplication = p0.newInstance();
          Objects.requireNonNull(uApplication, "null cannot be cast to non-null type android.app.Application");
       }
       p1.a(uApplication);
       p2.element = System.currentTimeMillis();
       return uApplication;
    }
    public a a(PluginConfig p0,PluginInfo p1,d p2){
       FeatureDex2OatManager a;
       PluginInfo this;
       PluginInfo pluginInfo;
       a a1;
       String name2;
       String str3;
       a name2;
       Iterator iterator;
       Looper looper;
       boolean b;
       Set set2;
       a uoa2;
       long l6;
       Object obj4;
       Ref$LongRef longRef1;
       a uoa3;
       FeaturePluginLoader uFeaturePlug = this;
       Ref$LongRef obj = p0;
       List list = p1;
       Object obj1 = p2;
       FeatureInfo obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeaturePluginLoader.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj, "config");
       a.p(list, "pluginInfo");
       a.p(obj1, "result");
       long l = System.currentTimeMillis();
       a uoa = new a();
       uoa.c(obj.name);
       uoa.d(list);
       PluginConfig name = obj.name;
       String str = "config.name";
       a.o(name, str);
       obj2 = uFeaturePlug.b.f(name);
       if (obj2 == null) {
          throw new IllegalStateException("split not found");
       }
       long l1 = System.currentTimeMillis();
       a = FeatureDex2OatManager.a;
       String name1 = uoa.getName();
       String str1 = "plugin.name";
       a.o(name1, str1);
       this = list.apkPath;
       a.o(this, "pluginInfo.apkPath");
       PluginInfo odexPath = list.odexPath;
       String str2 = "";
       if (odexPath == null) {
          odexPath = str2;
       }
       Object obj3 = a.c(name1, this, new File(odexPath), list.soDir, new FeaturePluginLoader$loadPlugin$classLoader$1(uFeaturePlug, obj2, list, obj));
       IClassIndexProvider iClassIndexP = a.a(obj.name, obj3);
       if (iClassIndexP != null) {
          SplitLoaderManager.a.c().registerClassIndex(obj.name, iClassIndexP);
       }
       long l2 = System.currentTimeMillis();
       List list1 = uFeaturePlug.b.g().c().get(obj.name);
       pluginInfo = null;
       if (list1 == null) {
          list1 = null;
       }else {
          ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
          iterator = list1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new ActivityInfo(iterator.next(), pluginInfo, str2));
          }
          ArrayList uArrayList1 = uArrayList;
       }
       if (list1 == null) {
          list1 = CollectionsKt__CollectionsKt.E();
       }
       list.activities = list1;
       if (Build$VERSION.SDK_INT >= 24) {
          a1 = a.a;
          name2 = uoa.getName();
          a.o(name2, str1);
          if (a1.c(name2)) {
             name2 = uoa.getName();
             a.o(name2, str1);
             str3 = a1.b(name2, obj3);
             name2 = (str3.length() > 0)? 1: null;
             if (name2) {
                str = uoa.getName();
                a.o(str, str1);
                throw new PluginInstallException(uFeaturePlug.e(str), uoa.getName()+" handle namespace isolation failed, "+str3);
             }
          }
       }
       long this1 = System.currentTimeMillis();
       Set set = Collections.emptySet();
       name2 = a.a;
       String name3 = uoa.getName();
       a.o(name3, str1);
       if (name2.d(name3)) {
          d.c("insert so path of host to "+uoa.getName()+'.');
          set = this.f();
          name2.c(obj3);
       }
       Set set1 = set;
       long l3 = System.currentTimeMillis();
       uoa.b(obj3);
       b.e(uFeaturePlug.a, uoa);
       long l4 = System.currentTimeMillis();
       iterator = uFeaturePlug.c.iterator();
       while (iterator.hasNext()) {
          a uoa1 = iterator.next();
          uoa1.a(list.name, obj3);
          long l5 = System.currentTimeMillis() - System.currentTimeMillis();
          d.c("run intercepter "+uoa1.getClass().getName()+" cost "+l5);
          FeaturePluginLoader uFeaturePlug1 = null;
       }
       PluginConfig name4 = obj.name;
       a.o(name4, str);
       Class uClass = uFeaturePlug.g(obj3, name4);
       if (uClass != null) {
          a1 = uClass.getAnnotation(a.class);
          if (a1 != null) {
             looper = a1.activeType();
          label_01ef :
             b = h.b(uFeaturePlug.a);
             if (looper) {
                if (looper != 1) {
                   if (looper != 2) {
                      if (looper == 3 && b) {
                      label_0205 :
                         b = false;
                      }
                   }
                }
                b = true;
             }else {
                goto label_0205 ;
             }
             Ref$LongRef longRef = new Ref$LongRef();
             longRef.element = System.currentTimeMillis();
             uoa.e(1);
             if (b || a.g(Looper.myLooper(), Looper.getMainLooper())) {
                set2 = set1;
                uoa2 = uoa;
                l6 = l;
                obj4 = obj3;
                d.c(a.C(uoa2.getName(), " active application on work thread"));
                longRef1 = longRef;
                uoa3 = uoa2;
                uFeaturePlug.b(list, FeaturePluginLoader.h(uClass, uoa3, longRef1), obj4, obj);
             }else {
                d.c(a.C(uoa.getName(), " wait active application on main thread."));
                CountDownLatch uCountDownLa = new CountDownLatch(1);
                l6 = l;
                Executor uExecutor = WorkExecutors.b;
                Ref$LongRef longRef2 = longRef;
                set2 = set1;
                obj4 = obj3;
                uoa2 = uoa;
                c uoc = new c(uoa, System.currentTimeMillis(), this, p1, obj3, p0, uCountDownLa, uClass, longRef2);
                try{
                   uExecutor.execute(obj1);
                   uCountDownLa.await();
                }catch(java.lang.InterruptedException e0){
                   e0.printStackTrace();
                }
                longRef1 = longRef2;
                uoa3 = uoa2;
             }
             long name21 = System.currentTimeMillis();
             str3 = "parentSoDirs";
             Set set3 = set2;
             a.o(set3, str3);
             if ((set3.isEmpty() ^ 0x01) && !set3.containsAll(this.f())) {
                a.o(set3, str3);
                d.c("host so dirs changed, plugin: "+uoa3.getName()+", changed="+CollectionsKt___CollectionsKt.V2(e1.x(this.f(), set3), null, null, null, 0, null, null, 63, null)+' ');
                a.a.c(obj4);
             }
             int i = p2;
             i.g = l1 - l6;
             i.h = l2 - l1;
             i.n = this1 - l2;
             i.o = l3 - l2;
             i.q = l4 - l3;
             obj = longRef1.element;
             i.k = obj - l4;
             i.l = name21 - obj;
             i.p = System.currentTimeMillis() - name21;
             i.d = System.currentTimeMillis() - l6;
             return uoa3;
          }
       }
       looper = 1;
       goto label_01ef ;
    }
    public final void b(PluginInfo p0,Application p1,ClassLoader p2,PluginConfig p3){
       long l1;
       long l2;
       PluginConfig name;
       long l3;
       Object[] obj2;
       Iterator iterator;
       Class[] uClassArray;
       Method declaredMeth;
       FeaturePluginLoader uFeaturePlug = this;
       PluginInfo pluginInfo = p0;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, FeaturePluginLoader.class, "2")) {
          return;
       }
       long l = System.currentTimeMillis();
       FeaturePluginLoader a = uFeaturePlug.a;
       Resources resources = a.getResources();
       PluginInfo apkPath = pluginInfo.apkPath;
       int i = 1;
       if (!PatchProxy.applyVoidThreeRefs(a, resources, apkPath, null, a.class, "3") && !a.e(resources.getAssets()).contains(apkPath)) {
          a.g(a, resources, Collections.singletonList(apkPath));
          Object[] objArray = new Object[i];
          objArray[0] = apkPath;
          String.format("Install split %s resources for application.", objArray);
       }
       if (b.a()) {
          a = uFeaturePlug.a;
          PluginInfo apkPath1 = pluginInfo.apkPath;
          a.o(apkPath1, "pluginInfo.apkPath");
          if (!PatchProxy.applyVoidTwoRefs(a, apkPath1, uFeaturePlug, FeaturePluginLoader.class, "3")) {
             try{
                a.a(a, t.k(apkPath1));
             }catch(java.lang.Exception e0){
                FeaturePluginLoader d = uFeaturePlug.d;
                if (d != null) {
                   d.a(e0);
                }
                d.b("add dynamic-feature dir failed", e0);
             }
          }
       }
    }
    public final SplitDexClassLoader c(String p0,String p1,File p2,File p3,List p4){
       FeaturePluginLoader uFeaturePlug = FeaturePluginLoader.class;
       if (PatchProxy.isSupport(uFeaturePlug)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uFeaturePlug, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       SplitDexClassLoader splitDexClas = SplitDexClassLoader.create(p0, p1, p2, p3, p4);
       a.o(splitDexClas, "create\(\n            feat¡­   dependencies\n        \)");
       return splitDexClas;
    }
    public final ClassLoader d(String p0,String p1,File p2,File p3,List p4){
       List obj;
       FeaturePluginLoader uFeaturePlug = FeaturePluginLoader.class;
       int i = 1;
       if (PatchProxy.isSupport(uFeaturePlug)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uFeaturePlug, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.b.b() && (Build$VERSION.SDK_INT <= 22 || !this.e.contains(p0))) {
          d.c("create classloader for "+p0+" use splitDexClassloader  for not using relinker");
          return this.c(p0, p1, p2, p3, p4);
       }else {
          obj = this.g.a(p4);
          if (obj.size() > i) {
             d.c("create classloader for "+p0+" use splitDexClassloader  for multi deps "+obj);
             return this.c(p0, p1, p2, p3, p4);
          }else if(obj.size() == i){
             String str = CollectionsKt___CollectionsKt.m2(obj);
             d.c("create classloader for "+p0+" use PathClassLoader for single deps "+str);
             this.g.b(p0, str);
             Plugin plugin = Dva.instance().getPlugin(str);
             a.m(plugin);
             return new PathClassLoader(p1, p3.getAbsolutePath(), plugin.getClassLoader());
          }else {
             d.c("create classloader for "+p0+" use PathClassLoader use default classloader");
             return new PathClassLoader(p1, p3.getAbsolutePath(), uFeaturePlug.getClassLoader());
          }
       }
    }
    public final int e(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, FeaturePluginLoader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.f.contains(p0)) {
          i = 0x4fba;
       }else {
          this.f.add(p0);
          i = 0x4fb0;
       }
       return i;
    }
    public final HashSet f(){
       Object obj = PatchProxy.apply(null, this, FeaturePluginLoader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ClassLoader uClassLoader = a.b.a();
       a.o(uClassLoader, "instance.originClassLoader");
       return new HashSet(a.a.b(uClassLoader));
    }
    public final Class g(ClassLoader p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplitSourceProvider obj = PatchProxy.applyTwoRefs(p0, p1, this, FeaturePluginLoader.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.g();
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(p1, obj, SplitSourceProvider.class, "13");
       if (str != patchProxyRe) {
       }else {
          a.p(p1, "splitName");
          str = a.c(p1);
       }
       if (str == null) {
          return null;
       }else {
          return p0.loadClass(str);
       }
    }
}
