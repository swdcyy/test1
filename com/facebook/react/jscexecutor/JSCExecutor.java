package com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.jni.HybridData;

public class JSCExecutor extends JavaScriptExecutor	// class@001268
{

    static {
       SoLoader.b("jscexecutor");
    }
    public void JSCExecutor(ReadableNativeMap p0){
       super(JSCExecutor.initHybrid(p0));
    }
    public static native HybridData initHybrid(ReadableNativeMap p0);
    public String getName(){
       return "JSCExecutor";
    }
}
