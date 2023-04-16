package com.facebook.react.bridge.JSCJavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.jni.HybridData;
import java.lang.String;

public class JSCJavaScriptExecutor extends JavaScriptExecutor	// class@0011d6
{

    static {
       ReactBridge.staticInit();
    }
    public void JSCJavaScriptExecutor(ReadableNativeMap p0){
       super(JSCJavaScriptExecutor.initHybrid(p0));
    }
    public static native HybridData initHybrid(ReadableNativeMap p0);
    public String getName(){
       return "JSCJavaScriptExecutor";
    }
}
