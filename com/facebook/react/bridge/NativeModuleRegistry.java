package com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Set;
import java.util.Map$Entry;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaModuleWrapper;
import fe.a;
import java.lang.annotation.Annotation;
import java.lang.StringBuilder;
import od.a;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import com.facebook.react.bridge.ReactContext;
import hg.a;
import java.lang.Integer;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.Enum;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.OnBatchCompleteListener;

public class NativeModuleRegistry	// class@00120f
{
    public final Map mModules;
    public final ReactApplicationContext mReactApplicationContext;

    public void NativeModuleRegistry(ReactApplicationContext p0,Map p1){
       super();
       this.mReactApplicationContext = p0;
       this.mModules = p1;
    }
    public List getAllModules(){
       ArrayList obj = PatchProxy.apply(null, this, NativeModuleRegistry.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mModules.values().iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().getModule());
       }
       return obj;
    }
    public Collection getCxxModules(){
       ArrayList obj = PatchProxy.apply(null, this, NativeModuleRegistry.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mModules.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue().isCxxModule()) {
             obj.add(uEntry.getValue());
          }
       }
       return obj;
    }
    public Collection getJavaModules(CatalystInstance p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, NativeModuleRegistry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mModules.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!uEntry.getValue().isCxxModule()) {
             obj.add(new JavaModuleWrapper(p0, uEntry.getValue()));
          }
       }
       return obj;
    }
    public NativeModule getModule(Class p0){
       a obj = PatchProxy.applyOneRefs(p0, this, NativeModuleRegistry.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAnnotation(a.class);
       if (obj == null) {
          throw new IllegalArgumentException("Could not find @ReactModule annotation in class "+p0.getName());
       }
       Object obj1 = this.mModules.get(obj.name());
       a.d(obj1, obj.name()+" could not be found. Is it defined in "+p0.getName());
       return obj1.getModule();
    }
    public NativeModule getModule(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NativeModuleRegistry.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mModules.get(p0);
       a.d(obj, "Could not find module with name "+p0);
       return obj.getModule();
    }
    public final Map getModuleMap(){
       return this.mModules;
    }
    public final ReactApplicationContext getReactApplicationContext(){
       return this.mReactApplicationContext;
    }
    public boolean hasModule(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NativeModuleRegistry.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mModules.containsKey(p0.getAnnotation(a.class).name());
    }
    public boolean hasModule(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NativeModuleRegistry.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mModules.containsKey(p0);
    }
    public void notifyJSInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, NativeModuleRegistry.class, "4")) {
          return;
       }
       this.mReactApplicationContext.assertOnNativeModulesQueueThread();
       a.a(0, "NativeModuleRegistry_notifyJSInstanceDestroy");
       Iterator iterator = this.mModules.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().destroy();
       }
       a.c(0, "NativeModuleRegistry_notifyJSInstanceDestroy");
       return;
    }
    public void notifyJSInstanceInitialized(int p0){
       NativeModuleRegistry nativeModule = NativeModuleRegistry.class;
       if (PatchProxy.isSupport(nativeModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, nativeModule, "5")) {
          return;
       }
       this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START.name(), "", p0);
       String str = "NativeModuleRegistry_notifyJSInstanceInitialized";
       a.a(0, str);
       Iterator iterator = this.mModules.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().markInitializable();
       }
       a.c(0, str);
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END.name(), "", p0);
       return;
    }
    public void onBatchComplete(){
       if (PatchProxy.applyVoid(null, this, NativeModuleRegistry.class, "6")) {
          return;
       }
       ModuleHolder moduleHolder = this.mModules.get("UIManager");
       if (moduleHolder != null && moduleHolder.hasInstance()) {
          moduleHolder.getModule().onBatchComplete();
       }
       return;
    }
    public void registerModules(NativeModuleRegistry p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NativeModuleRegistry.class, "3")) {
          return;
       }
       a.b(this.mReactApplicationContext.equals(p0.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
       Iterator iterator = p0.getModuleMap().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          if (!this.mModules.containsKey(key)) {
             this.mModules.put(key, uEntry.getValue());
          }
       }
       return;
    }
}
