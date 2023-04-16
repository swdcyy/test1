package com.facebook.react.jscexecutor.a;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import java.lang.String;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import java.lang.UnsupportedOperationException;

public class a implements JavaScriptExecutorFactory	// class@001269
{
    public final String a;
    public final String b;

    public void a(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public JavaScriptExecutor create(){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putString("OwnerIdentity", "ReactNative");
       writableNati.putString("AppIdentity", this.a);
       writableNati.putString("DeviceIdentity", this.b);
       return new JSCExecutor(writableNati);
    }
    public void startSamplingProfiler(){
       throw new UnsupportedOperationException("Starting sampling profiler not supported on JSIExecutor+JSCRuntime");
    }
    public void stopSamplingProfiler(String p0){
       throw new UnsupportedOperationException("Stopping sampling profiler not supported on JSIExecutor+JSCRuntime");
    }
    public String toString(){
       return "JSIExecutor+JSCRuntime";
    }
}
