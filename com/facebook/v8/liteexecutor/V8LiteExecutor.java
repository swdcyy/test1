package com.facebook.v8.liteexecutor.V8LiteExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.Object;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Enum;

public class V8LiteExecutor extends JavaScriptExecutor	// class@00144d
{
    public static final Object a;
    public static int b;
    public static int c;

    static {
       V8LiteExecutor.a = new Object();
       SoLoader.b("kwai-v8-lite-executor");
    }
    public void V8LiteExecutor(String p0){
       super(V8LiteExecutor.initHybrid(p0, "", false));
    }
    public void V8LiteExecutor(String p0,String p1,boolean p2){
       super(V8LiteExecutor.initHybrid(p0, p1, p2));
    }
    public static int a(){
       if (V8LiteExecutor.b == -1) {
          V8LiteExecutor.b = V8LiteExecutor.jniGetCachedDataVersion();
       }
       return V8LiteExecutor.b;
    }
    public static int b(){
       if (V8LiteExecutor.c == -1) {
          V8LiteExecutor.c = V8LiteExecutor.jniGetV8Version() + (JavaScriptExecutor$Type.V8_LITE.ordinal() << 27);
       }
       return V8LiteExecutor.c;
    }
    public static native HybridData initHybrid(String p0,String p1,boolean p2);
    public static native int jniGetCachedDataVersion();
    public static native int jniGetV8Version();
    public static native void jniStartTracing(String p0);
    public static native void jniStopTracing();
    public String getName(){
       return "V8LiteExecutor";
    }
}
