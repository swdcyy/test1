package com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8ArrayBuffer;
import com.tkruntime.v8.utils.ArrayBuffer;
import com.tkruntime.v8.V8TypedArray;
import com.tkruntime.v8.utils.TypedArray;
import com.tkruntime.v8.V8Array;
import java.util.List;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Map;
import java.util.Map;
import com.tkruntime.v8.V8JSONProxy;
import com.tkruntime.v8.V8ObjectProxy;
import com.tkruntime.v8.V8Object;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import com.tkruntime.v8.NativeObjectWrapper;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Long;
import com.tkruntime.v8.V8OneTimeObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class V8ObjectUtilsQuick	// class@000fd8
{

    public void V8ObjectUtilsQuick(){
       super();
    }
    public static Object getValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, V8ObjectUtilsQuick.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof V8Value) {
          return p0;
       }
       if (p0 instanceof V8Function) {
          return p0;
       }
       if (p0 instanceof V8ArrayBuffer) {
          return new ArrayBuffer(p0);
       }
       if (p0 instanceof V8TypedArray) {
          return new TypedArray(p0);
       }
       if (p0 instanceof V8Array) {
          return p0.v8.getList(p0.getHandle());
       }
       if (p0 instanceof V8Map) {
          return p0.v8.getAll(p0.getHandle());
       }
       if (p0 instanceof V8JSONProxy) {
          return p0.getNativeObject();
       }
       if (p0 instanceof V8Object) {
          p0 = p0.v8.getAll(p0.getHandle());
       }
       return p0;
    }
    public static void pushValue(V8 p0,V8Array p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "3")) {
          return;
       }
       V8ObjectUtilsQuick.pushValue(p0, p1, p2, null);
       return;
    }
    public static void pushValue(V8 p0,V8Array p1,Object p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, V8ObjectUtilsQuick.class, "8")) {
          return;
       }
       if (p2 == null) {
          p1.pushUndefined();
       }else if(p2 instanceof Integer){
          p1.push(p2);
       }else if(p2 instanceof Double){
          p1.push(p2);
       }else if(p2 instanceof Float){
          p1.push(p2.doubleValue());
       }else if(p2 instanceof String){
          p1.push(p2);
       }else if(p2 instanceof Boolean){
          p1.push(p2);
       }else if(p2 instanceof TypedArray){
          p1.push(V8ObjectUtilsQuick.toV8TypedArray(p0, p2, p3));
       }else if(p2 instanceof ArrayBuffer){
          p1.push(V8ObjectUtilsQuick.toV8ArrayBuffer(p0, p2, p3));
       }else if(p2 instanceof V8Value){
          p1.push(p2);
       }else if(p2 instanceof Map){
          V8Object v8Object = V8ObjectUtilsQuick.toV8Object(p0, p2, p3);
          p1.push(v8Object);
          v8Object.setWeak();
       }else if(p2 instanceof List){
          V8Array v8Array = V8ObjectUtilsQuick.toV8Array(p0, p2, p3);
          p1.push(v8Array);
          v8Array.setWeak();
       }else if(p2 instanceof NativeObjectWrapper){
          p1.push(V8JSONProxy.createProxyForWrapper(p0, p2));
       }else {
          throw new IllegalStateException("Unsupported Object of type: "+p2.getClass());
       }
       return;
    }
    public static void setValue(V8 p0,V8Object p1,String p2,Object p3,Map p4){
       if (PatchProxy.isSupport(V8ObjectUtilsQuick.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, V8ObjectUtilsQuick.class, "11")) {
             return;
          }
       }
       if (p3 == null) {
          p1.addUndefined(p2);
       }else if(p3 instanceof Integer){
          p1.add(p2, p3.intValue());
       }else if(p3 instanceof Double){
          p1.add(p2, p3.doubleValue());
       }else if(p3 instanceof Float){
          p1.add(p2, p3.doubleValue());
       }else if(p3 instanceof String){
          p1.add(p2, p3);
       }else if(p3 instanceof Boolean){
          p1.add(p2, p3.booleanValue());
       }else if(p3 instanceof TypedArray){
          p1.add(p2, V8ObjectUtilsQuick.toV8TypedArray(p0, p3, null));
       }else if(p3 instanceof ArrayBuffer){
          p1.add(p2, V8ObjectUtilsQuick.toV8ArrayBuffer(p0, p3, null));
       }else if(p3 instanceof V8Value){
          p1.add(p2, p3);
       }else if(p3 instanceof Map){
          V8Object v8Object = V8ObjectUtilsQuick.toV8Object(p0, p3, null);
          p1.add(p2, v8Object);
          v8Object.setWeak();
       }else if(p3 instanceof List){
          V8Array v8Array = V8ObjectUtilsQuick.toV8Array(p0, p3, null);
          p1.add(p2, v8Array);
          v8Array.setWeak();
       }else {
          throw new IllegalStateException("Unsupported Object of type: "+p3.getClass());
       }
       return;
    }
    public static Object[] toReturnArrayForV8(V8 p0,Boolean p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null || !p2.length) {
          return null;
       }
       int len = p2.length;
       Object[] objArray = new Object[len];
       int i = 0;
       while (i < len) {
          objArray[i] = V8ObjectUtilsQuick.toReturnObjectForV8(p0, p2[i]);
          if (p1 != null && objArray[i] instanceof String) {
             p1 = Boolean.TRUE;
          }
          i = i + 1;
       }
       return objArray;
    }
    public static Object toReturnObjectForV8(V8 p0,Object p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, V8ObjectUtilsQuick.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p1 == null) {
          return p1;
       }
       if (p1 instanceof Integer) {
          return p1;
       }
       if (p1 instanceof Double) {
          return p1;
       }
       if (p1 instanceof Long) {
          return p1;
       }
       if (p1 instanceof Float) {
          return Double.valueOf(p1.doubleValue());
       }
       if (p1 instanceof String) {
          return p1;
       }
       if (p1 instanceof Boolean) {
          return p1;
       }
       if (p1 instanceof TypedArray) {
          return V8ObjectUtilsQuick.toV8TypedArray(p0, p1, obj);
       }
       if (p1 instanceof ArrayBuffer) {
          return V8ObjectUtilsQuick.toV8ArrayBuffer(p0, p1, obj);
       }
       if (p1 instanceof V8Value) {
          return p1;
       }
       if (p1 instanceof Map) {
          return new V8OneTimeObject(p0, V8ObjectUtilsQuick.toV8Object(p0, p1, obj).getHandle());
       }
       if (p1 instanceof List) {
          return new V8OneTimeObject(p0, V8ObjectUtilsQuick.toV8Array(p0, p1, obj).getHandle());
       }
       if (p1 instanceof NativeObjectWrapper) {
          return V8JSONProxy.createProxyForWrapper(p0, p1);
       }
       throw new IllegalStateException("Unsupported Object of type: "+p1.getClass());
    }
    public static V8Array toV8Array(V8 p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8ObjectUtilsQuick.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8ObjectUtilsQuick.toV8Array(p0, p1, null);
    }
    public static V8Array toV8Array(V8 p0,List p1,Map p2){
       V8Array obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new V8Array(p0);
       try{
          for (int i = 0; i < p1.size(); i = i + 1) {
             V8ObjectUtilsQuick.pushValue(p0, obj, p1.get(i), p2);
          }
          return obj;
       }catch(java.lang.IllegalStateException e6){
          obj.close();
          throw e6;
       }
    }
    public static V8ArrayBuffer toV8ArrayBuffer(V8 p0,ArrayBuffer p1,Map p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return p1.getV8ArrayBuffer();
    }
    public static V8Object toV8Object(V8 p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8ObjectUtilsQuick.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8ObjectUtilsQuick.toV8Object(p0, p1, null);
    }
    public static V8Object toV8Object(V8 p0,Map p1,Map p2){
       V8Object v8Object;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       try{
          v8Object = new V8Object(p0);
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             V8ObjectUtilsQuick.setValue(p0, v8Object, key, uEntry.getValue(), null);
          }
          return v8Object;
       }catch(java.lang.IllegalStateException e6){
          v8Object.close();
          throw e6;
       }
    }
    public static V8TypedArray toV8TypedArray(V8 p0,TypedArray p1,Map p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8ObjectUtilsQuick.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return p1.getV8TypedArray();
    }
    public static Object transferV8Value(V8 p0,V8Value p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, V8ObjectUtilsQuick.class, "12");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p1 == null) {
          return obj;
       }
       if (p1 instanceof V8Array) {
          return p0.getList(p1.getHandle());
       }
       if (p1 instanceof V8Map) {
          return p0.getAll(p1.getHandle());
       }
       if (V8Object.class == p1.getClass()) {
          return p0.getAll(p1.getHandle());
       }
       return p1;
    }
}
