package com.facebook.react.bridge.JSCJavaScriptExecutorFactory;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import java.lang.String;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.JSCJavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;

public class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory	// class@0011d7
{
    public final String mAppName;
    public final String mDeviceName;

    public void JSCJavaScriptExecutorFactory(String p0,String p1){
       super();
       this.mAppName = p0;
       this.mDeviceName = p1;
    }
    public JavaScriptExecutor create(){
       WritableNativeMap obj = PatchProxy.apply(null, this, JSCJavaScriptExecutorFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeMap();
       obj.putString("OwnerIdentity", "ReactNative");
       obj.putString("AppIdentity", this.mAppName);
       obj.putString("DeviceIdentity", this.mDeviceName);
       return new JSCJavaScriptExecutor(obj);
    }
    public void startSamplingProfiler(){
       if (PatchProxy.applyVoid(null, this, JSCJavaScriptExecutorFactory.class, "2")) {
          return;
       }
       throw new UnsupportedOperationException("Starting sampling profiler not supported on "+this.toString());
    }
    public void stopSamplingProfiler(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JSCJavaScriptExecutorFactory.class, "3")) {
          return;
       }
       throw new UnsupportedOperationException("Stopping sampling profiler not supported on "+this.toString());
    }
    public String toString(){
       return "JSCExecutor";
    }
}
