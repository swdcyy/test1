package com.facebook.react.bridge.JavaScriptModuleRegistry;
import java.lang.Object;
import java.util.HashMap;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.transientpage.TransientEventEmitter;
import java.lang.ClassLoader;
import com.facebook.react.bridge.JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class JavaScriptModuleRegistry	// class@0011fd
{
    public final HashMap mModuleInstances;

    public void JavaScriptModuleRegistry(){
       super();
       this.mModuleInstances = new HashMap();
    }
    public synchronized JavaScriptModule getJavaScriptModule(CatalystInstance p0,Class p1){
       TransientEventEmitter transientEve;
       JavaScriptModule obj = PatchProxy.applyTwoRefs(p0, p1, this, JavaScriptModuleRegistry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mModuleInstances.get(p1);
       if (obj != null) {
          return obj;
       }
       if (p1 == TransientEventEmitter.class) {
          transientEve = new TransientEventEmitter(p0, p1);
       }else {
          Class[] uClassArray = new Class[]{p1};
          transientEve = Proxy.newProxyInstance(p1.getClassLoader(), uClassArray, new JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler(p0, p1));
       }
       this.mModuleInstances.put(p1, transientEve);
       return transientEve;
    }
}
