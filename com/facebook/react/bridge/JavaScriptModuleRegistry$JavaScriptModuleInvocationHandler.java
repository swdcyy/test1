package com.facebook.react.bridge.JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler;
import java.lang.reflect.InvocationHandler;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Class;
import java.lang.Object;
import yd.e;
import java.lang.ref.WeakReference;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Method;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeArray;

public class JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler implements InvocationHandler	// class@0011fc
{
    public CatalystInstance mCatalystInstance;
    public WeakReference mCatalystInstanceWeakRef;
    public final Class mModuleInterface;
    public String mName;

    public void JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler(CatalystInstance p0,Class p1){
       super();
       this.mCatalystInstanceWeakRef = (e.N)? new WeakReference(p0): p0;
       this.mModuleInterface = p1;
       return;
    }
    public final String getJSModuleName(){
       String obj = PatchProxy.apply(null, this, JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mName == null) {
          obj = this.mModuleInterface.getSimpleName();
          int i = obj.lastIndexOf(36);
          if (i != -1) {
             obj = obj.substring((i + 1));
          }
          this.mName = obj;
       }
       return this.mName;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = (p2 != null)? Arguments.fromJavaArgs(p2): new WritableNativeArray();
       if (e.N) {
          CatalystInstance uCatalystIns = this.mCatalystInstanceWeakRef.get();
          if (uCatalystIns != null) {
             uCatalystIns.callFunction(this.getJSModuleName(), p1.getName(), p0);
          }
       }else {
          this.mCatalystInstance.callFunction(this.getJSModuleName(), p1.getName(), p0);
       }
       return null;
    }
}
