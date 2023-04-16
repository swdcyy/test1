package com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.jni.HybridData;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.bridge.JavaScriptExecutor$1;
import java.lang.Enum;
import com.facebook.v8.rnexecutor.V8RnExecutor;
import com.facebook.v8.liteexecutor.V8LiteExecutor;
import com.facebook.v8.reactexecutor.V8Executor;
import java.lang.Integer;
import java.lang.Boolean;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.hermes.reactexecutor.HermesExecutor;

public abstract class JavaScriptExecutor	// class@0011f9
{
    public final HybridData mHybridData;

    public void JavaScriptExecutor(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public static int getCachedDataVersion(JavaScriptExecutor$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaScriptExecutor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[p0.ordinal()];
       if (i == 1) {
          return V8Executor.a();
       }
       if (i == 2) {
          return V8LiteExecutor.a();
       }
       if (i != 3) {
          return -1;
       }
       return V8RnExecutor.a();
    }
    public static int getRuntimeVersion(JavaScriptExecutor$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaScriptExecutor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[p0.ordinal()];
       if (i == 1) {
          return V8Executor.b();
       }
       if (i == 2) {
          return V8LiteExecutor.b();
       }
       if (i != 3) {
          return -1;
       }
       return V8RnExecutor.b();
    }
    public static boolean isValidCodeCacheVersion(JavaScriptExecutor$Type p0,int p1,int p2){
       if (PatchProxy.isSupport(JavaScriptExecutor.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, JavaScriptExecutor.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[p0.ordinal()];
       boolean b = false;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return b;
             }else if(V8RnExecutor.a() == p1 && p2 == V8RnExecutor.b()){
                b = true;
             }
             return b;
          }else if(V8LiteExecutor.a() == p1 && p2 == V8LiteExecutor.b()){
             b = true;
          }
          return b;
       }else if(V8Executor.a() == p1 && p2 == V8Executor.b()){
          b = true;
       }
       return b;
    }
    public static boolean supportCodeCache(JavaScriptExecutor$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaScriptExecutor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[p0.ordinal()];
       if (i == 1) {
          return true;
       }
       if (i == 2) {
          return true;
       }
       if (i != 3) {
          return false;
       }
       return true;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, JavaScriptExecutor.class, "1")) {
          return;
       }
       this.mHybridData.a();
       return;
    }
    public abstract String getName();
    public JavaScriptExecutor$Type getType(){
       if (this instanceof V8Executor) {
          return JavaScriptExecutor$Type.V8;
       }
       if (this instanceof V8LiteExecutor) {
          return JavaScriptExecutor$Type.V8_LITE;
       }
       if (this instanceof V8RnExecutor) {
          return JavaScriptExecutor$Type.V8_RN;
       }
       if (this instanceof JSCExecutor) {
          return JavaScriptExecutor$Type.JSC;
       }
       if (this instanceof HermesExecutor) {
          return JavaScriptExecutor$Type.HERMES;
       }
       return JavaScriptExecutor$Type.UNKNOWN;
    }
}
