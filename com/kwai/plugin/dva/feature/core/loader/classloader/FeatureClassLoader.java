package com.kwai.plugin.dva.feature.core.loader.classloader.FeatureClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import dalvik.system.BaseDexClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import zi7.a;
import qrd.p;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.ClassNotFoundException;
import com.kwai.plugin.dva.feature.core.hook.component.fakecomponents.FakeActivity;
import com.kwai.plugin.dva.feature.core.hook.component.fakecomponents.FakeService;
import com.kwai.plugin.dva.feature.core.hook.component.fakecomponents.FakeReceiver;
import java.lang.Integer;
import java.util.Map;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.feature.core.loader.classloader.SplitDexClassLoader;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import java.util.Iterator;
import java.net.URL;
import java.util.Enumeration;
import com.kwai.plugin.dva.feature.core.loader.classloader.classindex.IClassIndexProvider;
import java.util.Collection;
import java.util.HashMap;

public final class FeatureClassLoader extends PathClassLoader	// class@000e6b
{
    public final String appLinkInterceptActivity;
    public String mLastFindClassFeaturePluginName;
    public final Map mPluginClassIndex;
    public final SplitSourceProvider mSplitSourceProvider;
    public final BaseDexClassLoader originClassLoader;
    public static final String TAG = "Dva:FeatureClassLoader";

    public void FeatureClassLoader(ClassLoader p0,SplitSourceProvider p1,String p2){
       super("", p0);
       this.mPluginClassIndex = new ConcurrentHashMap(2048);
       this.mLastFindClassFeaturePluginName = null;
       while (p0.getParent() != null && p0.getParent() instanceof BaseDexClassLoader) {
          BaseDexClassLoader parent = p0.getParent();
       }
       this.originClassLoader = p0;
       this.appLinkInterceptActivity = p2;
       this.mSplitSourceProvider = p1;
       return;
    }
    public Class findClass(String p0){
       boolean b;
       boolean b1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       Class obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.findClassInSplits(p0);
       if (obj != null) {
          return obj;
       }
       SplitLoaderManager a = SplitLoaderManager.a;
       FeatureClassLoader tappLinkInte = this.appLinkInterceptActivity;
       Objects.requireNonNull(a);
       Class uClass = PatchProxy.applyTwoRefs(p0, tappLinkInte, a, SplitLoaderManager.class, "6");
       if (uClass != patchProxyRe) {
       }else {
          a.p(p0, "className");
          FakeActivity obj1 = PatchProxy.applyOneRefs(p0, a, SplitLoaderManager.class, "8");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a b2 = SplitLoaderManager.b;
             if (b2 == null) {
                a.S("mFeatureSource");
                b2 = null;
             }
             SplitSourceProvider splitSourceP2 = b2.g();
             Objects.requireNonNull(splitSourceP2);
             List list = PatchProxy.apply(null, splitSourceP2, SplitSourceProvider.class, str);
             if (list == patchProxyRe) {
                list = splitSourceP2.c.getValue();
             }
             b = list.contains(p0);
          }
          if (b) {
             SplitLoaderManager.d = p0;
             if (!TextUtils.isEmpty(tappLinkInte)) {
                try{
                   uClass = Class.forName(tappLinkInte);
                }catch(java.lang.ClassNotFoundException e10){
                   e10.printStackTrace();
                }
                obj1 = FakeActivity.class;
             }else {
                goto label_007a ;
             }
          }else {
             a obj2 = PatchProxy.applyOneRefs(p0, a, SplitLoaderManager.class, "9");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                obj2 = SplitLoaderManager.b;
                if (obj2 == null) {
                   a.S("mFeatureSource");
                   objArray = null;
                }
                SplitSourceProvider splitSourceP1 = objArray.g();
                Objects.requireNonNull(splitSourceP1);
                Object obj4 = PatchProxy.apply(null, splitSourceP1, SplitSourceProvider.class, "3");
                if (obj4 != patchProxyRe) {
                }else {
                   obj4 = splitSourceP1.d.getValue();
                }
                b = obj4.contains(p0);
             }
             if (b) {
                uClass = FakeService.class;
             }else {
                a obj3 = PatchProxy.applyOneRefs(p0, a, SplitLoaderManager.class, "10");
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else {
                   obj3 = SplitLoaderManager.b;
                   if (obj3 == null) {
                      a.S("mFeatureSource");
                      obj3 = null;
                   }
                   SplitSourceProvider splitSourceP = obj3.g();
                   Objects.requireNonNull(splitSourceP);
                   obj2 = PatchProxy.apply(null, splitSourceP, SplitSourceProvider.class, "4");
                   if (obj2 != patchProxyRe) {
                   }else {
                      obj2 = splitSourceP.e.getValue();
                   }
                   b1 = obj2.contains(p0);
                }
                if (b1) {
                   uClass = FakeReceiver.class;
                }else {
                   uClass = null;
                }
             }
          }
       }
       return uClass;
    }
    public final Class findClassInSplits(String p0){
       FeatureClassLoader tmLastFindCl;
       Plugin plugin1;
       Class uClass;
       String obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPluginClassIndex.get(Integer.valueOf(p0.hashCode()));
       if (obj == null) {
          tmLastFindCl = this.mLastFindClassFeaturePluginName;
       }
       if (tmLastFindCl != null) {
          Plugin plugin = Dva.instance().getPlugin(tmLastFindCl);
          if (plugin != null) {
             ClassLoader classLoader = plugin.getClassLoader();
             try{
                Class uClass1 = (classLoader instanceof SplitDexClassLoader)? classLoader.loadClassItself(p0): classLoader.loadClass(p0);
                if (uClass1 != null) {
                   this.mLastFindClassFeaturePluginName = tmLastFindCl;
                   return uClass1;
                }
             }catch(java.lang.ClassNotFoundException e0){
             }
          }
       }
       Iterator iterator = FeatureManager.a.c().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          plugin1 = iterator.next();
          if ((plugin1.getName()).equals(e0)) {
             continue ;
          }else {
             ClassLoader classLoader1 = plugin1.getClassLoader();
             try{
                uClass = (classLoader1 instanceof SplitDexClassLoader)? classLoader1.loadClassItself(p0): classLoader1.loadClass(p0);
                if (uClass != null) {
                   break ;
                }
             }catch(java.lang.ClassNotFoundException e0){
                goto label_0051 ;
             }
          }
       }
       this.mLastFindClassFeaturePluginName = plugin1.getName();
       return uClass;
    }
    public String findLibrary(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.originClassLoader.findLibrary(p0);
    }
    public URL getResource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.originClassLoader.getResource(p0);
    }
    public Enumeration getResources(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.originClassLoader.getResources(p0);
    }
    public final boolean isSplitEntryFragments(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mSplitSourceProvider.a();
       if (obj != null && !obj.isEmpty()) {
          return obj.contains(p0);
       }
       return false;
    }
    public Class loadClass(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureClassLoader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.findClass(p0);
    }
    public void registerClassIndex(String p0,IClassIndexProvider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeatureClassLoader.class, "1")) {
          return;
       }
       Collection classIndexes = p1.getClassIndexes();
       HashMap hashMap = new HashMap(classIndexes.size());
       Iterator iterator = classIndexes.iterator();
       while (iterator.hasNext()) {
          hashMap.put(iterator.next(), p0);
       }
       this.mPluginClassIndex.putAll(hashMap);
       return;
    }
}
