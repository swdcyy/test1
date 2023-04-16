package com.eclipsesource.v8.utils.V8ObjectUtils;
import java.lang.Object;
import com.eclipsesource.v8.utils.V8ObjectUtils$DefaultTypeAdapter;
import com.eclipsesource.v8.V8Array;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.eclipsesource.v8.V8;
import java.util.Hashtable;
import java.util.Map;
import com.eclipsesource.v8.V8Value;
import java.util.Collection;
import java.util.Iterator;
import com.eclipsesource.v8.V8Object;
import java.util.List;
import com.eclipsesource.v8.utils.TypedArray;
import com.eclipsesource.v8.V8TypedArray;
import com.eclipsesource.v8.utils.ArrayBuffer;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.utils.V8Map;
import com.eclipsesource.v8.utils.TypeAdapter;
import com.eclipsesource.v8.Releasable;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Class;
import java.util.Collections;
import java.util.ArrayList;
import com.eclipsesource.v8.utils.V8PropertyMap;
import com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper;
import java.util.Set;
import java.util.Map$Entry;

public class V8ObjectUtils	// class@00101f
{
    public static final TypeAdapter DEFAULT_TYPE_ADAPTER;
    public static final Object IGNORE;

    static {
       V8ObjectUtils.IGNORE = new Object();
       V8ObjectUtils.DEFAULT_TYPE_ADAPTER = new V8ObjectUtils$DefaultTypeAdapter();
    }
    public void V8ObjectUtils(){
       super();
    }
    public static Object getTypedArray(V8Array p0,int p1){
       int i = p0.length();
       int i1 = 0;
       if (p1 == 1) {
          return p0.getIntegers(i1, i);
       }
       if (p1 == 2) {
          return p0.getDoubles(i1, i);
       }
       if (p1 == 3) {
          return p0.getBooleans(i1, i);
       }
       if (p1 == 4) {
          return p0.getStrings(i1, i);
       }
       throw new RuntimeException("Unsupported bulk load type: "+p1);
    }
    public static Object getTypedArray(V8Array p0,int p1,Object p2){
       int i = p0.length();
       if (p1 == 1) {
          if (p2 == null || p2.length < i) {
             p2 = new int[i];
          }
          p0.getIntegers(0, i, p2);
          return p2;
       }else if(p1 == 2){
          if (p2 == null || p2.length < i) {
             p2 = new double[i];
          }
          p0.getDoubles(0, i, p2);
          return p2;
       }else if(p1 == 3){
          if (p2 == null || p2.length < i) {
             p2 = new boolean[i];
          }
          p0.getBooleans(0, i, p2);
          return p2;
       }else if(p1 == 4){
          if (p2 == null || p2.length < i) {
             p2 = new String[i];
          }
          p0.getStrings(0, i, p2);
          return p2;
       }else if(p1 == 9){
          if (p2 == null || p2.length < i) {
             p2 = new byte[i];
          }
          p0.getBytes(0, i, p2);
          return p2;
       }else {
          throw new RuntimeException("Unsupported bulk load type: "+p1);
       }
    }
    public static Object getV8Result(V8 p0,Object p1){
       if (p1 == null) {
          return null;
       }
       Hashtable hashtable = new Hashtable();
       p0 = V8ObjectUtils.getV8Result(p0, p1, hashtable);
       if (p0 instanceof V8Value) {
          V8Value v8Value = p0.twin();
          p1 = hashtable.values().iterator();
          while (p1.hasNext()) {
             p1.next().close();
          }
          return v8Value;
       }else {
          p1 = hashtable.values().iterator();
          while (p1.hasNext()) {
             p1.next().close();
          }
          return p0;
       }
    }
    public static Object getV8Result(V8 p0,Object p1,Map p2){
       if (p2.containsKey(p1)) {
          return p2.get(p1);
       }
       if (p1 instanceof Map) {
          return V8ObjectUtils.toV8Object(p0, p1, p2);
       }
       if (p1 instanceof List) {
          return V8ObjectUtils.toV8Array(p0, p1, p2);
       }
       if (p1 instanceof TypedArray) {
          return V8ObjectUtils.toV8TypedArray(p0, p1, p2);
       }
       if (p1 instanceof ArrayBuffer) {
          return V8ObjectUtils.toV8ArrayBuffer(p0, p1, p2);
       }
       return p1;
    }
    public static Object getValue(V8Array p0,int p1){
       V8Map v8Map = new V8Map();
       Object obj = p0.get(p1);
       p0 = V8ObjectUtils.getValue(obj, p0.getType(p1), v8Map, V8ObjectUtils.DEFAULT_TYPE_ADAPTER);
       if (p0 == obj && p0 instanceof V8Value) {
          V8Value v8Value = p0.twin();
          if (obj instanceof Releasable) {
             obj.release();
          }
          v8Map.close();
          return v8Value;
       }else if(obj instanceof Releasable){
          obj.release();
       }
       v8Map.close();
       return p0;
    }
    public static Object getValue(V8Array p0,int p1,TypeAdapter p2){
       V8Map v8Map = new V8Map();
       Object obj = p0.get(p1);
       p0 = V8ObjectUtils.getValue(obj, p0.getType(p1), v8Map, p2);
       if (p0 == obj && p0 instanceof V8Value) {
          V8Value v8Value = p0.twin();
          if (obj instanceof Releasable) {
             obj.release();
          }
          v8Map.close();
          return v8Value;
       }else if(obj instanceof Releasable){
          obj.release();
       }
       v8Map.close();
       return p0;
    }
    public static Object getValue(V8Object p0,String p1){
       return V8ObjectUtils.getValue(p0, p1, V8ObjectUtils.DEFAULT_TYPE_ADAPTER);
    }
    public static Object getValue(V8Object p0,String p1,TypeAdapter p2){
       V8Map v8Map = new V8Map();
       Object obj = p0.get(p1);
       p0 = V8ObjectUtils.getValue(obj, p0.getType(p1), v8Map, p2);
       if (p0 == obj && p0 instanceof V8Value) {
          V8Value v8Value = p0.twin();
          if (obj instanceof Releasable) {
             obj.release();
          }
          v8Map.close();
          return v8Value;
       }else if(obj instanceof Releasable){
          obj.release();
       }
       v8Map.close();
       return p0;
    }
    public static Object getValue(Object p0){
       return V8ObjectUtils.getValue(p0, V8ObjectUtils.DEFAULT_TYPE_ADAPTER);
    }
    public static Object getValue(Object p0,int p1,V8Map p2,TypeAdapter p3){
       Object obj = p3.adapt(p1, p0);
       if (TypeAdapter.DEFAULT != obj) {
          return obj;
       }
       if (p1 == 10) {
          return new ArrayBuffer(p0);
       }
       if (p1 == 99) {
          return V8.getUndefined();
       }
       switch (p1){
           case 0:
             return null;
           case 1:
           case 3:
           case 4:
           case 2:
             return p0;
           case 5:
             p0 = V8ObjectUtils.toList(p0, p2, p3);
             goto label_0047 ;
             break;
           case 6:
             return V8ObjectUtils.toMap(p0, p2, p3);
           case 7:
             return V8ObjectUtils.IGNORE;
           case 8:
             return new TypedArray(p0);
           default:
             throw new IllegalStateException("Cannot convert type "+V8Value.getStringRepresentation(p1));
       }
    }
    public static Object getValue(Object p0,TypeAdapter p1){
       V8Map v8Map = new V8Map();
       if (p0 instanceof V8Value) {
          v8Map.close();
          return V8ObjectUtils.getValue(p0, p0.getV8Type(), v8Map, p1);
       }else {
          v8Map.close();
          return p0;
       }
    }
    public static void pushValue(V8 p0,V8Array p1,Object p2){
       Hashtable hashtable = new Hashtable();
       V8ObjectUtils.pushValue(p0, p1, p2, hashtable);
       Iterator iterator = hashtable.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().close();
       }
       return;
    }
    public static void pushValue(V8 p0,V8Array p1,Object p2,Map p3){
       if (p2 == null) {
          p1.pushUndefined();
       }else if(p2 instanceof Integer){
          p1.push(p2);
       }else if(p2 instanceof Long){
          p1.push(new Double((double)p2.longValue()));
       }else if(p2 instanceof Double){
          p1.push(p2);
       }else if(p2 instanceof Float){
          p1.push(p2);
       }else if(p2 instanceof String){
          p1.push(p2);
       }else if(p2 instanceof Boolean){
          p1.push(p2);
       }else if(p2 instanceof TypedArray){
          p1.push(V8ObjectUtils.toV8TypedArray(p0, p2, p3));
       }else if(p2 instanceof ArrayBuffer){
          p1.push(V8ObjectUtils.toV8ArrayBuffer(p0, p2, p3));
       }else if(p2 instanceof V8Value){
          p1.push(p2);
       }else if(p2 instanceof Map){
          p1.push(V8ObjectUtils.toV8Object(p0, p2, p3));
       }else if(p2 instanceof List){
          p1.push(V8ObjectUtils.toV8Array(p0, p2, p3));
       }else {
          throw new IllegalStateException("Unsupported Object of type: "+p2.getClass());
       }
       return;
    }
    public static void setValue(V8 p0,V8Object p1,String p2,Object p3,Map p4){
       if (p3 == null) {
          p1.addUndefined(p2);
       }else if(p3 instanceof Integer){
          p1.add(p2, p3.intValue());
       }else if(p3 instanceof Long){
          p1.add(p2, (double)p3.longValue());
       }else if(p3 instanceof Double){
          p1.add(p2, p3.doubleValue());
       }else if(p3 instanceof Float){
          p1.add(p2, (double)p3.floatValue());
       }else if(p3 instanceof String){
          p1.add(p2, p3);
       }else if(p3 instanceof Boolean){
          p1.add(p2, p3.booleanValue());
       }else if(p3 instanceof TypedArray){
          p1.add(p2, V8ObjectUtils.toV8TypedArray(p0, p3, p4));
       }else if(p3 instanceof ArrayBuffer){
          p1.add(p2, V8ObjectUtils.toV8ArrayBuffer(p0, p3, p4));
       }else if(p3 instanceof V8Value){
          p1.add(p2, p3);
       }else if(p3 instanceof Map){
          p1.add(p2, V8ObjectUtils.toV8Object(p0, p3, p4));
       }else if(p3 instanceof List){
          p1.add(p2, V8ObjectUtils.toV8Array(p0, p3, p4));
       }else {
          throw new IllegalStateException("Unsupported Object of type: "+p3.getClass());
       }
       return;
    }
    public static List toList(V8Array p0){
       return V8ObjectUtils.toList(p0, V8ObjectUtils.DEFAULT_TYPE_ADAPTER);
    }
    public static List toList(V8Array p0,TypeAdapter p1){
       V8Map v8Map = new V8Map();
       v8Map.close();
       return V8ObjectUtils.toList(p0, v8Map, p1);
    }
    public static List toList(V8Array p0,V8Map p1,TypeAdapter p2){
       if (p0 == null) {
          return Collections.emptyList();
       }
       if (p1.containsKey(p0)) {
          return p1.get(p0);
       }
       ArrayList uArrayList = new ArrayList();
       p1.put(p0, uArrayList);
       int i = 0;
       while (i < p0.length()) {
          Object obj = p0.get(i);
          Object value = V8ObjectUtils.getValue(obj, p0.getType(i), p1, p2);
          if (value != V8ObjectUtils.IGNORE) {
             uArrayList.add(value);
          }
          if (obj instanceof Releasable) {
             obj.release();
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static Map toMap(V8Object p0){
       return V8ObjectUtils.toMap(p0, V8ObjectUtils.DEFAULT_TYPE_ADAPTER);
    }
    public static Map toMap(V8Object p0,TypeAdapter p1){
       V8Map v8Map = new V8Map();
       v8Map.close();
       return V8ObjectUtils.toMap(p0, v8Map, p1);
    }
    public static Map toMap(V8Object p0,V8Map p1,TypeAdapter p2){
       if (p0 == null) {
          return Collections.emptyMap();
       }
       if (p1.containsKey(p0)) {
          return p1.get(p0);
       }
       V8PropertyMap v8PropertyMa = new V8PropertyMap();
       p1.put(p0, v8PropertyMa);
       String[] keys = p0.getKeys();
       int len = keys.length;
       int i = 0;
       while (i < len) {
          object oobject = keys[i];
          Object obj = p0.get(oobject);
          Object value = V8ObjectUtils.getValue(obj, p0.getType(oobject), p1, p2);
          if (value != V8ObjectUtils.IGNORE) {
             v8PropertyMa.put(oobject, value);
          }
          if (obj instanceof Releasable) {
             obj.release();
          }
          i = i + 1;
       }
       return v8PropertyMa;
    }
    public static V8Array toV8Array(V8 p0,List p1){
       Hashtable hashtable = new Hashtable();
       V8Array v8Array = V8ObjectUtils.toV8Array(p0, p1, hashtable).twin();
       Iterator iterator = hashtable.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().close();
       }
       return v8Array;
    }
    public static V8Array toV8Array(V8 p0,List p1,Map p2){
       if (p2.containsKey(new V8ObjectUtils$ListWrapper(p1))) {
          return p2.get(new V8ObjectUtils$ListWrapper(p1));
       }
       V8Array v8Array = new V8Array(p0);
       p2.put(new V8ObjectUtils$ListWrapper(p1), v8Array);
       try{
          for (int i = 0; i < p1.size(); i = i + 1) {
             V8ObjectUtils.pushValue(p0, v8Array, p1.get(i), p2);
          }
          return v8Array;
       }catch(java.lang.IllegalStateException e3){
          v8Array.close();
          throw e3;
       }
    }
    public static V8ArrayBuffer toV8ArrayBuffer(V8 p0,ArrayBuffer p1,Map p2){
       if (p2.containsKey(p1)) {
          return p2.get(p1);
       }
       V8ArrayBuffer v8ArrayBuffe = p1.getV8ArrayBuffer();
       p2.put(p1, v8ArrayBuffe);
       return v8ArrayBuffe;
    }
    public static V8Object toV8Object(V8 p0,Map p1){
       Hashtable hashtable = new Hashtable();
       V8Object v8Object = V8ObjectUtils.toV8Object(p0, p1, hashtable).twin();
       Iterator iterator = hashtable.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().close();
       }
       return v8Object;
    }
    public static V8Object toV8Object(V8 p0,Map p1,Map p2){
       if (p2.containsKey(p1)) {
          return p2.get(p1);
       }
       V8Object v8Object = new V8Object(p0);
       try{
          p2.put(p1, v8Object);
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             V8ObjectUtils.setValue(p0, v8Object, key, uEntry.getValue(), p2);
          }
          return v8Object;
       }catch(java.lang.IllegalStateException e3){
          v8Object.close();
          throw e3;
       }
    }
    public static V8TypedArray toV8TypedArray(V8 p0,TypedArray p1,Map p2){
       if (p2.containsKey(p1)) {
          return p2.get(p1);
       }
       V8TypedArray v8TypedArray = p1.getV8TypedArray();
       p2.put(p1, v8TypedArray);
       return v8TypedArray;
    }
}
