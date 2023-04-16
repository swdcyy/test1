package com.facebook.react.bridge.JSIModuleRegistry;
import java.lang.Object;
import java.util.HashMap;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JSIModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.facebook.react.bridge.JSIModuleHolder;
import od.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import com.facebook.react.bridge.JSIModuleSpec;

public class JSIModuleRegistry	// class@0011dc
{
    public final Map mModules;

    public void JSIModuleRegistry(){
       super();
       this.mModules = new HashMap();
    }
    public JSIModule getModule(JSIModuleType p0){
       JSIModuleHolder obj = PatchProxy.applyOneRefs(p0, this, JSIModuleRegistry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mModules.get(p0);
       if (obj == null) {
          throw new IllegalArgumentException("Unable to find JSIModule for class "+p0);
       }
       JSIModule jSIModule = obj.getJSIModule();
       a.c(jSIModule);
       return jSIModule;
    }
    public void notifyJSInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, JSIModuleRegistry.class, "3")) {
          return;
       }
       Iterator iterator = this.mModules.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey() == JSIModuleType.TurboModuleManager) {
             continue ;
          }else {
             uEntry.getValue().notifyJSInstanceDestroy();
          }
       }
       return;
    }
    public void registerModules(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JSIModuleRegistry.class, "2")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          JSIModuleSpec jSIModuleSpe = iterator.next();
          this.mModules.put(jSIModuleSpe.getJSIModuleType(), new JSIModuleHolder(jSIModuleSpe));
       }
       return;
    }
}
