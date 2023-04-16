package com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.jni.HybridData;
import java.util.List;
import com.facebook.react.turbomodule.core.TurboModuleManager$a;
import com.facebook.react.turbomodule.core.TurboModuleManager$b;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import com.facebook.react.turbomodule.core.TurboModuleManager$c;
import com.facebook.react.turbomodule.core.TurboModulePerfLogger;
import com.facebook.react.bridge.NativeArray;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.facebook.react.turbomodule.core.TurboModuleManager$d;
import com.facebook.react.bridge.NativeModule;
import java.lang.Thread;
import com.facebook.react.bridge.CxxModuleWrapper;
import java.util.Set;
import java.util.Map$Entry;

public class TurboModuleManager implements JSIModule, TurboModuleRegistry	// class@00130c
{
    public final List b;
    public final TurboModuleManager$d c;
    public final TurboModuleManager$d d;
    public final Object e;
    public boolean f;
    public final Map g;
    public final HybridData mHybridData;
    public static boolean h;

    public void TurboModuleManager(JavaScriptContextHolder p0,TurboModuleManagerDelegate p1,CallInvokerHolder p2,CallInvokerHolder p3){
       super();
       this.e = new Object();
       this.f = false;
       this.g = new HashMap();
       _monitor_enter(TurboModuleManager.class);
       if (!TurboModuleManager.h) {
          SoLoader.b("turbomodulejsijni");
          TurboModuleManager.h = true;
       }
       _monitor_exit(TurboModuleManager.class);
       this.mHybridData = this.initHybrid(p0.get(), p2, p3, p1, false);
       this.installJSIBindings();
       this.b = p1.a();
       this.c = new TurboModuleManager$a(this, p1);
       this.d = new TurboModuleManager$b(this, p1);
       return;
    }
    public TurboModule a(String p0){
       TurboModuleManager te = this.e;
       _monitor_enter(te);
       if (this.f != null) {
          _monitor_exit(te);
          return null;
       }else if(!this.g.containsKey(p0)){
          this.g.put(p0, new TurboModuleManager$c());
       }
       TurboModuleManager$c uoc = this.g.get(p0);
       _monitor_exit(te);
       TurboModulePerfLogger.moduleCreateStart(p0, uoc.b());
       TurboModule turboModule = this.e(p0, uoc, true);
       if (turboModule != null) {
          TurboModulePerfLogger.moduleCreateEnd(p0, uoc.b());
       }else {
          TurboModulePerfLogger.moduleCreateFail(p0, uoc.b());
       }
       return turboModule;
    }
    public boolean b(String p0){
       TurboModuleManager te = this.e;
       _monitor_enter(te);
       TurboModuleManager$c uoc = this.g.get(p0);
       _monitor_exit(te);
       if (uoc != null) {
          _monitor_enter(uoc);
          if (uoc.a() != null) {
             _monitor_exit(uoc);
             return true;
          }else {
             _monitor_exit(uoc);
          }
       }
       return false;
    }
    public List c(){
       return this.b;
    }
    public native boolean callFunction(String p0,NativeArray p1);
    public Collection d(){
       ArrayList uArrayList = new ArrayList();
       TurboModuleManager te = this.e;
       _monitor_enter(te);
       uArrayList.addAll(this.g.values());
       _monitor_exit(te);
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          TurboModuleManager$c uoc = iterator.next();
          _monitor_enter(uoc);
          if (uoc.a() != null) {
             uArrayList1.add(uoc.a());
          }
          _monitor_exit(uoc);
       }
       return uArrayList1;
    }
    public final TurboModule e(String p0,TurboModuleManager$c p1,boolean p2){
       int i;
       _monitor_enter(p1);
       if (p1.c != null) {
          if (p2) {
             TurboModulePerfLogger.moduleCreateCacheHit(p0, p1.b());
          }
          _monitor_exit(p1);
          return p1.a();
       }else if(!p1.c()){
          p1.b = true;
          i = 1;
       }else {
          i = 0;
       }
       _monitor_exit(p1);
       if (i) {
          TurboModulePerfLogger.moduleCreateConstructStart(p0, p1.b());
          TurboModule turboModule = this.c.a(p0);
          if (turboModule == null) {
             turboModule = this.d.a(p0);
          }
          TurboModulePerfLogger.moduleCreateConstructEnd(p0, p1.b());
          TurboModulePerfLogger.moduleCreateSetUpStart(p0, p1.b());
          if (turboModule != null) {
             _monitor_enter(p1);
             turboModule.initialize();
             p1.a = turboModule;
             _monitor_exit(p1);
          }
          TurboModulePerfLogger.moduleCreateSetUpEnd(p0, p1.b());
          _monitor_enter(p1);
          p1.b = false;
          p1.c = true;
          p1.notifyAll();
          _monitor_exit(p1);
          return turboModule;
       }else {
          _monitor_enter(p1);
          while (p1.c()) {
             try{
                p1.wait();
             }catch(java.lang.InterruptedException e0){
                boolean b = true;
                goto label_006c ;
             }
          }
          if (false) {
             Thread.currentThread().interrupt();
          }
          _monitor_exit(p1);
          return p1.a();
       }
    }
    public final TurboModule getJavaModule(String p0){
       TurboModule turboModule = this.a(p0);
       if (turboModule instanceof CxxModuleWrapper) {
          turboModule = null;
       }
       return turboModule;
    }
    public final CxxModuleWrapper getLegacyCxxModule(String p0){
       TurboModule turboModule = this.a(p0);
       if (!turboModule instanceof CxxModuleWrapper) {
          return null;
       }
       return turboModule;
    }
    public native final HybridData initHybrid(long p0,CallInvokerHolderImpl p1,CallInvokerHolderImpl p2,TurboModuleManagerDelegate p3,boolean p4);
    public void initialize(){
    }
    public native final void installJSIBindings();
    public void onCatalystInstanceDestroy(){
       TurboModuleManager te = this.e;
       _monitor_enter(te);
       this.f = true;
       _monitor_exit(te);
       Iterator iterator = this.g.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          TurboModule turboModule = this.e(key, uEntry.getValue(), false);
          if (turboModule != null) {
             turboModule.onCatalystInstanceDestroy();
          }
       }
       this.g.clear();
       this.mHybridData.a();
       return;
    }
}
