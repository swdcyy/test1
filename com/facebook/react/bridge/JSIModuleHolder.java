package com.facebook.react.bridge.JSIModuleHolder;
import com.facebook.react.bridge.JSIModuleSpec;
import java.lang.Object;
import com.facebook.react.bridge.JSIModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JSIModuleProvider;

public class JSIModuleHolder	// class@0011d9
{
    public JSIModule mModule;
    public final JSIModuleSpec mSpec;

    public void JSIModuleHolder(JSIModuleSpec p0){
       super();
       this.mSpec = p0;
    }
    public JSIModule getJSIModule(){
       JSIModuleHolder obj = PatchProxy.apply(null, this, JSIModuleHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mModule == null) {
          _monitor_enter(this);
          obj = this.mModule;
          if (obj != null) {
             _monitor_exit(this);
             return obj;
          }else {
             JSIModule jSIModule = this.mSpec.getJSIModuleProvider().get();
             this.mModule = jSIModule;
             jSIModule.initialize();
             _monitor_exit(this);
          }
       }
       return this.mModule;
    }
    public void notifyJSInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, JSIModuleHolder.class, "2")) {
          return;
       }
       JSIModuleHolder tmModule = this.mModule;
       if (tmModule != null) {
          tmModule.onCatalystInstanceDestroy();
       }
       return;
    }
}
