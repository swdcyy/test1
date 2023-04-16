package com.tkruntime.v8.V8JSONProxy;
import com.tkruntime.v8.V8ObjectProxy;
import android.util.LruCache;
import com.tkruntime.v8.V8;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.Object;
import java.io.Serializable;
import com.tkruntime.v8.V8JsonProxyObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8JSONProxy$ObjectMeta;
import java.util.List;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.NativeObjectWrapper;
import android.os.Handler;
import com.tkruntime.v8.V8JSONProxy$1;
import java.lang.Runnable;
import com.google.gson.Gson;
import com.tkruntime.v8.V8Object;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Short;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import zk.g;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8JSONProxy$2;
import com.tkruntime.v8.JavaCallback;
import com.tkruntime.v8.BuildConfig;
import java.lang.Long;
import java.lang.System;

public class V8JSONProxy extends V8ObjectProxy	// class@000fb9
{
    public JsonObject mJsonObject;
    public Object mSerial;
    public V8 mV8;
    public static Gson sGson;
    public static final LruCache sMetaCache;

    static {
       V8JSONProxy.sMetaCache = new LruCache(96);
    }
    public void V8JSONProxy(V8 p0,JsonObject p1){
       super(p0, "JSON_PROXY");
       this.mJsonObject = null;
       this.mSerial = null;
       this.mV8 = null;
       this.mJsonObject = p1;
       this.setNativeObject(p1);
       this.mV8 = p0;
    }
    public void V8JSONProxy(V8 p0,Serializable p1){
       super(p0, "JSON_PROXY");
       this.mJsonObject = null;
       this.mSerial = null;
       this.mV8 = null;
       this.mSerial = p1;
       this.setNativeObject(p1);
       this.mV8 = p0;
    }
    public void V8JSONProxy(V8 p0,Object p1){
       super(p0, "JSON_PROXY");
       this.mJsonObject = null;
       this.mSerial = null;
       this.mV8 = null;
       this.setNativeObject(p1);
    }
    public static V8JsonProxyObject composeJsObjectForJSON(V8 p0,JsonObject p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8JSONProxy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new V8JsonProxyObject(p0, new V8JSONProxy(p0, p1).getHandle());
    }
    public static V8JsonProxyObject composeJsonObjectForSerializable(V8 p0,Serializable p1){
       V8JSONProxy obj = PatchProxy.applyTwoRefs(p0, p1, null, V8JSONProxy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new V8JSONProxy(p0, p1);
       if (V8JSONProxy$ObjectMeta.isSerializableObject(p1) && V8JSONProxy$ObjectMeta.tryGetMeta(p1) == null) {
          V8JSONProxy.initMetaAsync(p1.getClass());
       }
       return new V8JsonProxyObject(p0, obj.getHandle());
    }
    public static V8Array composeJsonObjectForSerializableList(V8 p0,List p1){
       Object obj = null;
       V8Array obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, V8JSONProxy.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p1 == null) {
          return obj;
       }
       obj1 = new V8Array(p0);
       int i1 = p1.size();
       for (int i = 0; i < i1; i = i + 1) {
          obj1.push(V8JSONProxy.composeJsonObjectForSerializable(p0, p1.get(i)));
       }
       return obj1;
    }
    public static V8ObjectProxy createProxyForNativeObject(V8 p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8JSONProxy.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new V8JSONProxy(p0, p1);
    }
    public static V8JSONProxy createProxyForWrapper(V8 p0,NativeObjectWrapper p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8JSONProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && p1.getNativeObject() != null) {
          obj = p1.getNativeObject();
          if (!p1.isNeedReadPropertyFromJs()) {
             return new V8JSONProxy(p0, obj);
          }else if(obj instanceof Serializable){
             V8JSONProxy v8JSONProxy = new V8JSONProxy(p0, obj);
             if (V8JSONProxy$ObjectMeta.isSerializableObject(obj) && V8JSONProxy$ObjectMeta.tryGetMeta(obj) == null) {
                V8JSONProxy.initMetaAsync(obj.getClass());
             }
             return v8JSONProxy;
          }else if(obj instanceof JsonObject){
             return new V8JSONProxy(p0, obj);
          }
       }
       return null;
    }
    public static void initMetaAsync(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8JSONProxy.class, "7")) {
          return;
       }
       Handler handler = V8.getHandler();
       if (handler != null && p0 != null) {
          handler.post(new V8JSONProxy$1(p0));
       }
       return;
    }
    public static void initSerializableMetaAsync(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8JSONProxy.class, "5")) {
          return;
       }
       if (p0 != null && V8JSONProxy.sMetaCache.get(p0) != null) {
          return;
       }
       if (Serializable.class.isAssignableFrom(p0)) {
          V8JSONProxy.initMetaAsync(p0);
       }
       return;
    }
    public static void setGson(Gson p0){
       if (p0 != null) {
          V8JSONProxy.sGson = p0;
       }
       return;
    }
    public final void addPrimaryType(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, V8JSONProxy.class, "9")) {
          return;
       }
       if (p1 == null) {
          this.addNull(p0);
          return;
       }else if(p1 instanceof String){
          this.add(p0, p1);
       }else if(p1 instanceof Number){
          if (p1 instanceof Integer) {
             this.add(p0, p1.intValue());
          }else if(p1 instanceof Double){
             this.add(p0, p1.doubleValue());
          }else if(p1 instanceof Float){
             this.add(p0, p1.doubleValue());
          }else if(p1 instanceof Boolean){
             this.add(p0, p1.booleanValue());
          }else if(p1 instanceof Short){
             this.add(p0, p1.intValue());
          }
       }else if(p1 instanceof Boolean){
          this.add(p0, p1.booleanValue());
       }else {
          this.addNull(p0);
       }
       return;
    }
    public void addProp(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, V8JSONProxy.class, "15")) {
          return;
       }
       if (p0 instanceof V8Value) {
          this.add(p1, p0);
          p0.setWeak();
       }else if(p0 == null){
          this.addNull(p1);
       }else if(this.isPrimaryOrString(p0)){
          this.addPrimaryType(p1, p0);
       }
       return;
    }
    public final void beginAnalyzePerformance(){
    }
    public final Object convertJsonToV8Value(Object p0){
       V8Array obj = PatchProxy.applyOneRefs(p0, this, V8JSONProxy.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (p0 instanceof JsonObject) {
          return new V8JSONProxy(this.v8, p0);
       }
       if (p0 instanceof JsonArray) {
          obj = new V8Array(this.v8);
          int i = 0;
          int i1 = p0.size();
          while (i < i1) {
             Object obj1 = this.convertJsonToV8Value(p0.e0(i));
             if (obj1 == null) {
                obj.pushNull();
             }else {
                obj.push(obj1);
                if (obj1 instanceof V8Value) {
                   obj1.setWeak();
                }
             }
             i = i + 1;
          }
          return obj;
       }else if(p0 instanceof g){
          if (p0.a0()) {
             return p0.w();
          }
          if (p0.N()) {
             return Double.valueOf(p0.m());
          }
          if (p0.G()) {
             return Boolean.valueOf(p0.d());
          }
          return obj;
       }else {
          return p0;
       }
    }
    public final Object convertSerializableToV8Value(Object p0){
       V8Array v8Array;
       int len;
       Object obj1;
       V8JSONProxy obj = PatchProxy.applyOneRefs(p0, this, V8JSONProxy.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (p0 instanceof Short) {
          return Integer.valueOf(p0.intValue());
       }
       if (!p0 instanceof String && (p0 instanceof Number || p0 instanceof Boolean)) {
          return p0;
       }
       int i = 0;
       if (p0 instanceof Serializable[]) {
          v8Array = new V8Array(this.v8);
          len = p0.length;
          while (i < len) {
             obj1 = this.convertSerializableToV8Value(p0[i]);
             v8Array.push(obj1);
             if (obj1 != null && obj1 instanceof V8Value) {
                obj1.setWeak();
             }
             i = i + 1;
          }
          return v8Array;
       }else if(p0 instanceof List){
          v8Array = new V8Array(this.v8);
          len = p0.size();
          while (i < len) {
             obj1 = this.convertSerializableToV8Value(p0.get(i));
             v8Array.push(obj1);
             if (obj1 != null && obj1 instanceof V8Value) {
                obj1.setWeak();
             }
             i = i + 1;
          }
          return v8Array;
       }else if(p0 instanceof Serializable){
          obj = new V8JSONProxy(this.v8, p0);
       }
       return obj;
    }
    public V8Function createToJSONFunction(boolean p0){
       V8Function obj;
       if (PatchProxy.isSupport(V8JSONProxy.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, V8JSONProxy.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new V8Function(this.mV8, new V8JSONProxy$2(this, p0));
       if (BuildConfig.ENABLE_ANALYZE_PERFORMANCE.booleanValue()) {
          obj.setFunctionName("V8JSONProxy_createToJSONFunction");
       }
       return obj;
    }
    public final void endAnalyzePerformance(){
    }
    public void getDurationTime(long p0,V8 p1){
       if (PatchProxy.isSupport(V8JSONProxy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8JSONProxy.class, "14")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p1.addPropCallTime(((float)(System.nanoTime() - p0) / 1000000.00f));
       return;
    }
    public final boolean isPrimaryOrString(Object p0){
       boolean b = (!p0 instanceof String && (p0 instanceof Number || p0 instanceof Boolean))? true: false;
       return b;
    }
    public boolean isToJSONMethod(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8JSONProxy.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("toJSON").equals(p0) && this.mV8 != null)? true: false;
       return b;
    }
    public Object onPropCall(boolean p0,String p1,Object p2){
       long l;
       V8Function v8Function;
       Object obj;
       if (PatchProxy.isSupport(V8JSONProxy.class)) {
          p2 = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, V8JSONProxy.class, "13");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       if (!p0) {
          return V8ObjectProxy.PROP_SET_IGNORE;
       }else {
          this.beginAnalyzePerformance();
          p2 = "toJSON";
          if (this.mSerial != null) {
             l = System.nanoTime();
             if (this.isToJSONMethod(p1)) {
                v8Function = this.createToJSONFunction(true);
                this.add(p2, v8Function);
                this.getDurationTime(l, this.mV8);
                return v8Function;
             }else {
                V8JSONProxy$ObjectMeta meta = V8JSONProxy$ObjectMeta.getMeta(this.mSerial, this);
                if (meta == null) {
                   this.getDurationTime(l, this.mV8);
                   this.endAnalyzePerformance();
                   return null;
                }else {
                   obj = this.convertSerializableToV8Value(meta.getValue(p1, this.mSerial));
                   this.addProp(obj, p1);
                   this.endAnalyzePerformance();
                   this.getDurationTime(l, this.mV8);
                   return obj;
                }
             }
          }else {
             try{
                l = System.nanoTime();
                if (this.mJsonObject == null) {
                   this.endAnalyzePerformance();
                   this.getDurationTime(l, this.mV8);
                   return null;
                }else if(this.isToJSONMethod(p1)){
                   v8Function = this.createToJSONFunction(false);
                   this.add(p2, v8Function);
                   this.getDurationTime(l, this.mV8);
                   return v8Function;
                }else {
                   obj = this.convertJsonToV8Value(this.mJsonObject.e0(p1));
                   this.addProp(obj, p1);
                   this.endAnalyzePerformance();
                   this.getDurationTime(l, this.mV8);
                   return obj;
                }
             }catch(java.lang.Exception e0){
                this.endAnalyzePerformance();
                return e0;
             }
          }
       }
    }
}
