package com.facebook.react.bridge.Arguments;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.WritableArray;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.lang.Double;
import java.lang.Float;
import java.lang.RuntimeException;
import com.facebook.react.bridge.Arguments$1;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Short;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.Arguments$2;
import java.lang.Enum;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Math;

public class Arguments	// class@00119a
{

    public void Arguments(){
       super();
    }
    public static void addEntry(WritableNativeMap p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Arguments.class, "4")) {
          return;
       }
       p2 = Arguments.makeNativeObject(p2);
       if (p2 == null) {
          p0.putNull(p1);
       }else if(p2 instanceof Boolean){
          p0.putBoolean(p1, p2.booleanValue());
       }else if(p2 instanceof Integer){
          p0.putInt(p1, p2.intValue());
       }else if(p2 instanceof Number){
          p0.putDouble(p1, p2.doubleValue());
       }else if(p2 instanceof String){
          p0.putString(p1, p2);
       }else if(p2 instanceof WritableNativeArray){
          p0.putArray(p1, p2);
       }else if(p2 instanceof WritableNativeMap){
          p0.putMap(p1, p2);
       }else {
          throw new IllegalArgumentException("Could not convert "+p2.getClass());
       }
       return;
    }
    public static WritableArray createArray(){
       Object obj = PatchProxy.apply(null, null, Arguments.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WritableNativeArray();
    }
    public static WritableMap createMap(){
       Object obj = PatchProxy.apply(null, null, Arguments.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WritableNativeMap();
    }
    public static WritableArray fromArray(Object p0){
       int len;
       WritableArray obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createArray();
       int i = 0;
       if (p0 instanceof String[]) {
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushString(p0[i]);
          }
       }else if(p0 instanceof Bundle[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushMap(Arguments.fromBundle(p0[i]));
          }
       }else if(p0 instanceof int[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushInt(p0[i]);
          }
       }else if(p0 instanceof float[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushDouble((double)p0[i]);
          }
       }else if(p0 instanceof double[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushDouble(p0[i]);
          }
       }else if(p0 instanceof boolean[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             obj.pushBoolean(p0[i]);
          }
       }else if(p0 instanceof Parcelable[]){
          len = p0.length;
          for (; i < len; i = i + 1) {
             object oobject = p0[i];
             if (oobject instanceof Bundle) {
                obj.pushMap(Arguments.fromBundle(oobject));
             }else {
                throw new IllegalArgumentException("Unexpected array member type "+oobject.getClass());
             }
          }
       }else {
          throw new IllegalArgumentException("Unknown array type "+p0.getClass());
       }
       return obj;
    }
    public static WritableMap fromBundle(Bundle p0){
       Object obj1;
       WritableMap obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       Iterator iterator = p0.keySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          String str = iterator.next();
          obj1 = p0.get(str);
          if (obj1 == null) {
             obj.putNull(str);
          }else if(obj1.getClass().isArray()){
             obj.putArray(str, Arguments.fromArray(obj1));
          }else if(obj1 instanceof String){
             obj.putString(str, obj1);
          }else if(obj1 instanceof Number){
             if (obj1 instanceof Integer) {
                obj.putInt(str, obj1.intValue());
             }else {
                obj.putDouble(str, obj1.doubleValue());
             }
          }else if(obj1 instanceof Boolean){
             obj.putBoolean(str, obj1.booleanValue());
          }else if(obj1 instanceof Bundle){
             obj.putMap(str, Arguments.fromBundle(obj1));
          }else if(obj1 instanceof List){
             obj.putArray(str, Arguments.fromList(obj1));
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Could not convert "+obj1.getClass());
    }
    public static WritableNativeArray fromJavaArgs(Object[] p0){
       Class class;
       WritableNativeArray obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeArray();
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return obj;
          }
          object oobject = p0[i];
          if (oobject == null) {
             obj.pushNull();
          }else {
             class = oobject.getClass();
             if (class == Boolean.class) {
                obj.pushBoolean(oobject.booleanValue());
             }else if(class == Integer.class){
                obj.pushDouble(oobject.doubleValue());
             }else if(class == Double.class){
                obj.pushDouble(oobject.doubleValue());
             }else if(class == Float.class){
                obj.pushDouble(oobject.doubleValue());
             }else if(class == String.class){
                obj.pushString(oobject.toString());
             }else if(class == WritableNativeMap.class){
                obj.pushMap(oobject);
             }else if(class == WritableNativeArray.class){
                obj.pushArray(oobject);
             }else {
                break ;
             }
          }
          i = i + 1;
       }
       throw new RuntimeException("Cannot convert argument of type "+class);
    }
    public static WritableArray fromList(List p0){
       Object obj1;
       WritableArray obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createArray();
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          obj1 = iterator.next();
          if (obj1 == null) {
             obj.pushNull();
          }else if(obj1.getClass().isArray()){
             obj.pushArray(Arguments.fromArray(obj1));
          }else if(obj1 instanceof Bundle){
             obj.pushMap(Arguments.fromBundle(obj1));
          }else if(obj1 instanceof List){
             obj.pushArray(Arguments.fromList(obj1));
          }else if(obj1 instanceof String){
             obj.pushString(obj1);
          }else if(obj1 instanceof Integer){
             obj.pushInt(obj1.intValue());
          }else if(obj1 instanceof Number){
             obj.pushDouble(obj1.doubleValue());
          }else if(obj1 instanceof Boolean){
             obj.pushBoolean(obj1.booleanValue());
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Unknown value type "+obj1.getClass());
    }
    public static WritableNativeArray makeNativeArray(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new WritableNativeArray();
       }
       return Arguments.makeNativeArray(new Arguments$1(p0));
    }
    public static WritableNativeArray makeNativeArray(List p0){
       Object obj1;
       WritableNativeArray obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeArray();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          obj1 = Arguments.makeNativeObject(iterator.next());
          if (obj1 == null) {
             obj.pushNull();
          }else if(obj1 instanceof Boolean){
             obj.pushBoolean(obj1.booleanValue());
          }else if(obj1 instanceof Integer){
             obj.pushInt(obj1.intValue());
          }else if(obj1 instanceof Double){
             obj.pushDouble(obj1.doubleValue());
          }else if(obj1 instanceof String){
             obj.pushString(obj1);
          }else if(obj1 instanceof WritableNativeArray){
             obj.pushArray(obj1);
          }else if(obj1 instanceof WritableNativeMap){
             obj.pushMap(obj1);
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Could not convert "+obj1.getClass());
    }
    public static WritableNativeMap makeNativeMap(Bundle p0){
       WritableNativeMap obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeMap();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Arguments.addEntry(obj, str, p0.get(str));
       }
       return obj;
    }
    public static WritableNativeMap makeNativeMap(Map p0){
       WritableNativeMap obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeMap();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Arguments.addEntry(obj, key, uEntry.getValue());
       }
       return obj;
    }
    public static Object makeNativeObject(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (!p0 instanceof Float && (!p0 instanceof Long && (p0 instanceof Byte || p0 instanceof Short))) {
          return Double.valueOf(p0.doubleValue());
       }
       if (p0.getClass().isArray()) {
          return Arguments.makeNativeArray(p0);
       }
       if (p0 instanceof List) {
          return Arguments.makeNativeArray(p0);
       }
       if (p0 instanceof Map) {
          return Arguments.makeNativeMap(p0);
       }
       if (p0 instanceof Bundle) {
          p0 = Arguments.makeNativeMap(p0);
       }
       return p0;
    }
    public static Bundle toBundle(ReadableMap p0){
       Object obj = null;
       ReadableMapKeySetIterator obj1 = PatchProxy.applyOneRefs(p0, obj, Arguments.class, "14");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = p0.keySetIterator();
       Bundle uBundle = new Bundle();
       while (true) {
          if (!obj1.hasNextKey()) {
             return uBundle;
          }
          String str = obj1.nextKey();
          switch (Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType(str).ordinal()]){
              case 1:
                uBundle.putString(str, obj);
                break;
              case 2:
                uBundle.putBoolean(str, p0.getBoolean(str));
                break;
              case 3:
                uBundle.putDouble(str, p0.getDouble(str));
                break;
              case 4:
                uBundle.putString(str, p0.getString(str));
                break;
              case 5:
                uBundle.putBundle(str, Arguments.toBundle(p0.getMap(str)));
                break;
              case 6:
                SerializableHook.putSerializable(uBundle, str, Arguments.toList(p0.getArray(str)));
                break;
              default:
                throw new IllegalArgumentException("Could not convert object with key: "+str+".");
          }
       }
    }
    public static ArrayList toList(ReadableArray p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, Arguments.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new ArrayList();
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return obj;
          }
          switch (Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType(i).ordinal()]){
              case 1:
                obj.add(null);
                break;
              case 2:
                obj.add(Boolean.valueOf(p0.getBoolean(i)));
                break;
              case 3:
                double doublex = p0.getDouble(i);
                if (!doublex - Math.rint(doublex)) {
                   obj.add(Integer.valueOf((int)doublex));
                }else {
                   obj.add(Double.valueOf(doublex));
                }
                break;
              case 4:
                obj.add(p0.getString(i));
                break;
              case 5:
                obj.add(Arguments.toBundle(p0.getMap(i)));
                break;
              case 6:
                obj.add(Arguments.toList(p0.getArray(i)));
                break;
              default:
                throw new IllegalArgumentException("Could not convert object in array.");
          }
          i = i + 1;
       }
    }
}
