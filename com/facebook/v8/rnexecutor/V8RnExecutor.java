package com.facebook.v8.rnexecutor.V8RnExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.Object;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Enum;

public class V8RnExecutor extends JavaScriptExecutor	// class@00144f
{
    public static final Object a;
    public static int b;
    public static int c;

    static {
       V8RnExecutor.a = new Object();
       SoLoader.b("v8rnexecutor");
    }
    public void V8RnExecutor(String p0){
       super(V8RnExecutor.initHybrid(p0, "", false));
    }
    public static int a(){
       if (V8RnExecutor.b == -1) {
          V8RnExecutor.b = V8RnExecutor.jniGetCachedDataVersion();
       }
       return V8RnExecutor.b;
    }
    public static int b(){
       if (V8RnExecutor.c == -1) {
          V8RnExecutor.c = V8RnExecutor.jniGetV8Version() + (JavaScriptExecutor$Type.V8_RN.ordinal() << 27);
       }
       return V8RnExecutor.c;
    }
    public static native HybridData initHybrid(String p0,String p1,boolean p2);
    public static native int jniGetCachedDataVersion();
    public static native int jniGetV8Version();
    public static native void jniRegisterV8RuntimeLifecircleListener(long p0);
    public static native void jniStartTracing(String p0);
    public static native void jniStopTracing();
    public static native void jniUnregisterV8RuntimeLifecircleListener(long p0);
    public String getName(){
       return "V8RnExecutor";
    }
}
