package com.kwai.plugin.dva.feature.core.loader.classloader.SplitDexClassLoader;
import dalvik.system.BaseDexClassLoader;
import java.lang.String;
import java.io.File;
import java.util.List;
import java.lang.ClassLoader;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import com.kwai.plugin.dva.util.b;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import android.os.Build$VERSION;
import java.lang.Long;
import qj7.d;
import java.util.Iterator;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import ii7.b;
import java.net.URL;
import java.util.Enumeration;
import java.util.Objects;
import java.lang.ClassNotFoundException;

public final class SplitDexClassLoader extends BaseDexClassLoader	// class@001314
{
    public Set dependenciesLoaders;
    public final String moduleName;
    public static final String FEATURE_SUFFIX = "_f";
    public static final String TAG = "SplitDexClassLoader";

    public void SplitDexClassLoader(String p0,String p1,File p2,String p3,List p4,ClassLoader p5){
       super(p1, p2, p3, p5);
       this.moduleName = p0;
       HashSet hashSet = new HashSet();
       this.dependenciesLoaders = hashSet;
       hashSet.addAll(SplitDexClassLoader.resolveDependencies(p4));
    }
    public void SplitDexClassLoader(String p0,String p1,String p2,List p3,ClassLoader p4){
       super("", null, null, p4);
       Class[] uClassArray = new Class[]{ClassLoader.class,String.class,String.class,File.class,Boolean.TYPE};
       Object[] objArray = new Object[]{this,p1,p2,null,Boolean.FALSE};
       b.m(this, "pathList", b.c(Class.forName("dalvik.system.DexPathList"), uClassArray).newInstance(objArray));
       this.moduleName = p0;
       HashSet hashSet = new HashSet();
       this.dependenciesLoaders = hashSet;
       hashSet.addAll(SplitDexClassLoader.resolveDependencies(p3));
    }
    public static SplitDexClassLoader create(String p0,String p1,File p2,File p3,List p4){
       Object[] objArray;
       SplitDexClassLoader obj1;
       String str1;
       Object obj = null;
       if (PatchProxy.isSupport(SplitDexClassLoader.class)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          obj1 = PatchProxy.apply(objArray, obj, SplitDexClassLoader.class, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       long l = System.currentTimeMillis();
       String str = (p3 == null)? obj: p3.getAbsolutePath();
       ClassLoader classLoader = SplitDexClassLoader.class.getClassLoader();
       if (Build$VERSION.SDK_INT == 31) {
          obj1 = new SplitDexClassLoader(p0, p1, str, p4, classLoader);
          return v12;
       }else if(p3 == null){
          str1 = obj;
       }else {
          str1 = p3.getAbsolutePath();
       }
       obj1 = new SplitDexClassLoader(p0, p1, p2, str1, p4, SplitDexClassLoader.class.getClassLoader());
       objArray = new Object[]{Long.valueOf((System.currentTimeMillis() - l)),p0};
       d.a(String.format("SplitDexClassLoaderCost %d ms to load %s code", objArray));
       return v12;
    }
    public static Set resolveDependencies(List p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, null, SplitDexClassLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Plugin plugin = Dva.instance().getPlugin(iterator.next());
          if (plugin != null && plugin.getClassLoader() != null) {
             obj.add(plugin.getClassLoader());
          }
       }
       return obj;
    }
    public Class findClass(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.findClass(p0);
       }catch(java.lang.ClassNotFoundException e0){
          if (this.dependenciesLoaders != null) {
             Iterator iterator = this.dependenciesLoaders.iterator();
          label_001f :
             if (iterator.hasNext()) {
                ClassLoader uClassLoader = iterator.next();
                try{
                   if (uClassLoader instanceof SplitDexClassLoader) {
                      return uClassLoader.loadClassItself(p0);
                   }else {
                      return uClassLoader.loadClass(p0);
                   }
                }catch(java.lang.ClassNotFoundException e0){
                   goto label_001f ;
                }
             }
          }
          throw e0;
       }
    }
    public String findLibrary(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a) {
          if (this.getParent() instanceof BaseDexClassLoader) {
             obj = this.getParent().findLibrary(p0);
             if (obj != null) {
                return obj;
             }
          }
          return super.findLibrary(p0);
       }else {
          obj = super.findLibrary(p0);
          if (obj == null) {
             SplitDexClassLoader tdependencie = this.dependenciesLoaders;
             if (tdependencie != null) {
                Iterator iterator = tdependencie.iterator();
                while (iterator.hasNext()) {
                   ClassLoader uClassLoader = iterator.next();
                   if (uClassLoader instanceof SplitDexClassLoader) {
                      obj = uClassLoader.findLibrary(p0);
                      if (obj == null) {
                      }
                   }
                }
             }
          }
          if (obj == null && this.getParent() instanceof BaseDexClassLoader) {
             obj = this.getParent().findLibrary(p0);
          }
          return obj;
       }
    }
    public String findLibraryItself(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.findLibrary(p0);
    }
    public URL findResource(String p0){
       URL obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.findResource(p0);
       if (obj == null) {
          SplitDexClassLoader tdependencie = this.dependenciesLoaders;
          if (tdependencie != null) {
             Iterator iterator = tdependencie.iterator();
             while (iterator.hasNext()) {
                ClassLoader uClassLoader = iterator.next();
                if (uClassLoader instanceof SplitDexClassLoader) {
                   obj = uClassLoader.findResourceItself(p0);
                   if (obj == null) {
                   }
                }
             }
          }
       }
       return obj;
    }
    public URL findResourceItself(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.findResource(p0);
    }
    public Enumeration findResources(String p0){
       Enumeration obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.findResources(p0);
       if (obj == null) {
          SplitDexClassLoader tdependencie = this.dependenciesLoaders;
          if (tdependencie != null) {
             Iterator iterator = tdependencie.iterator();
             while (iterator.hasNext()) {
                ClassLoader uClassLoader = iterator.next();
                if (uClassLoader instanceof SplitDexClassLoader) {
                   obj = uClassLoader.findResourcesItself(p0);
                   if (obj == null) {
                   }
                }
             }
          }
       }
       return obj;
    }
    public Enumeration findResourcesItself(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.findResources(p0);
    }
    public Class loadClass(String p0,boolean p1){
       Object obj;
       if (PatchProxy.isSupport(SplitDexClassLoader.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, SplitDexClassLoader.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0.endsWith("_f")) {
          return super.loadClass(p0, p1);
       }else {
          Class uClass = this.findLoadedClass(p0);
          if (uClass != null) {
             return uClass;
          }else {
             obj = null;
             try{
                uClass = this.findClass(p0);
             }catch(java.lang.ClassNotFoundException e0){
             }
             if (uClass == null) {
                try{
                   uClass = this.getParent().loadClass(p0);
                }catch(java.lang.ClassNotFoundException e0){
                }
                if (uClass == null) {
                   Objects.requireNonNull(e0);
                   throw e0;
                }
             }
             return uClass;
          }
       }
    }
    public Class loadClassItself(String p0){
       Class obj = PatchProxy.applyOneRefs(p0, this, SplitDexClassLoader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.findLoadedClass(p0);
       if (obj != null) {
          return obj;
       }
       return super.findClass(p0);
    }
    public String moduleName(){
       return this.moduleName;
    }
}
