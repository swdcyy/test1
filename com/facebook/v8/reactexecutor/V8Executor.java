package com.facebook.v8.reactexecutor.V8Executor;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.Object;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Enum;

public class V8Executor extends JavaScriptExecutor	// class@00144e
{
    public static final Object a;
    public static int b;
    public static int c;

    static {
       V8Executor.a = new Object();
       SoLoader.b("kwai-v8-executor");
    }
    public void V8Executor(String p0){
       super(V8Executor.initHybrid(p0, "", false));
    }
    public void V8Executor(String p0,String p1,boolean p2){
       super(V8Executor.initHybrid(p0, p1, p2));
    }
    public static int a(){
       if (V8Executor.b == -1) {
          V8Executor.b = V8Executor.jniGetCachedDataVersion();
       }
       return V8Executor.b;
    }
    public static int b(){
       if (V8Executor.c == -1) {
          V8Executor.c = V8Executor.jniGetV8Version() + (JavaScriptExecutor$Type.V8.ordinal() << 27);
       }
       return V8Executor.c;
    }
    public static native HybridData initHybrid(String p0,String p1,boolean p2);
    public static native int jniGetCachedDataVersion();
    public static native long jniGetContextHandle(long p0);
    public static native long jniGetIsolateHandle(long p0);
    public static native int jniGetV8Version();
    public static native void jniRegisterV8RuntimeLifecircleListener(long p0);
    public static native void jniStartTracing(String p0);
    public static native void jniStopTracing();
    public static native void jniUnregisterV8RuntimeLifecircleListener(long p0);
    public String getName(){
       return "V8Executor";
    }
}
