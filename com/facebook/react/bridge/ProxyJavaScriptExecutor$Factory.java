package com.facebook.react.bridge.ProxyJavaScriptExecutor$Factory;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.JavaJSExecutor$Factory;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.JavaJSExecutor;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;

public class ProxyJavaScriptExecutor$Factory implements JavaScriptExecutorFactory	// class@001217
{
    public final JavaJSExecutor$Factory mJavaJSExecutorFactory;

    public void ProxyJavaScriptExecutor$Factory(JavaJSExecutor$Factory p0){
       super();
       this.mJavaJSExecutorFactory = p0;
    }
    public JavaScriptExecutor create(){
       Object obj = PatchProxy.apply(null, this, ProxyJavaScriptExecutor$Factory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
    }
    public void startSamplingProfiler(){
       if (PatchProxy.applyVoid(null, this, ProxyJavaScriptExecutor$Factory.class, "2")) {
          return;
       }
       throw new UnsupportedOperationException("Starting sampling profiler not supported on "+this.toString());
    }
    public void stopSamplingProfiler(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyJavaScriptExecutor$Factory.class, "3")) {
          return;
       }
       throw new UnsupportedOperationException("Stopping sampling profiler not supported on "+this.toString());
    }
}
