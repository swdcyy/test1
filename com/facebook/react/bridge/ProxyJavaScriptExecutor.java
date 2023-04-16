package com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ProxyJavaScriptExecutor extends JavaScriptExecutor	// class@001218
{
    public JavaJSExecutor mJavaJSExecutor;

    static {
       ReactBridge.staticInit();
    }
    public void ProxyJavaScriptExecutor(JavaJSExecutor p0){
       super(ProxyJavaScriptExecutor.initHybrid(p0));
       this.mJavaJSExecutor = p0;
    }
    public static native HybridData initHybrid(JavaJSExecutor p0);
    public void close(){
       if (PatchProxy.applyVoid(null, this, ProxyJavaScriptExecutor.class, "1")) {
          return;
       }
       ProxyJavaScriptExecutor tmJavaJSExec = this.mJavaJSExecutor;
       if (tmJavaJSExec != null) {
          tmJavaJSExec.close();
          this.mJavaJSExecutor = null;
       }
       return;
    }
    public String getName(){
       return "ProxyJavaScriptExecutor";
    }
}
