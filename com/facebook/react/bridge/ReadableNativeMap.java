package com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Number;
import java.lang.Double;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromMap;
import java.util.Iterator;
import java.util.Set;
import od.a;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableNativeMap$ReadableNativeMapKeySetIterator;
import java.util.Map;
import com.facebook.react.bridge.ReadableNativeMap$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class ReadableNativeMap extends NativeMap implements ReadableMap	// class@001234
{
    public String[] mKeys;
    public HashMap mLocalMap;
    public HashMap mLocalTypeMap;
    public static int mJniCallCounter;

    static {
       ReactBridge.staticInit();
    }
    public void ReadableNativeMap(HybridData p0){
       super(p0);
    }
    public static int getJNIPassCounter(){
       return ReadableNativeMap.mJniCallCounter;
    }
    public final void checkInstance(String p0,Object p1,Class p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReadableNativeMap.class, "9")) {
          return;
       }
       if (p1 == null || p2.isInstance(p1)) {
          return;
       }
       throw new UnexpectedNativeTypeException("Value for "+p0+" cannot be cast from "+p1.getClass().getSimpleName()+" to "+p2.getSimpleName());
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof ReadableNativeMap) {
          return false;
       }
       return this.getLocalMap().equals(p0.getLocalMap());
    }
    public ReadableArray getArray(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getNullableValue(p0, ReadableArray.class);
    }
    public boolean getBoolean(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getValue(p0, Boolean.class).booleanValue();
    }
    public double getDouble(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.getValue(p0, Double.class).doubleValue();
    }
    public Dynamic getDynamic(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicFromMap.create(this, p0);
    }
    public Iterator getEntryIterator(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getLocalMap().entrySet().iterator();
    }
    public int getInt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getValue(p0, Double.class).intValue();
    }
    public HashMap getLocalMap(){
       ReadableNativeMap obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLocalMap;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(this);
       if (this.mKeys == null) {
          String[] stringArray = this.importKeys();
          a.c(stringArray);
          this.mKeys = stringArray;
          ReadableNativeMap.mJniCallCounter = ReadableNativeMap.mJniCallCounter + 1;
       }
       if (this.mLocalMap == null) {
          Object[] objArray = this.importValues();
          a.c(objArray);
          ReadableNativeMap.mJniCallCounter = ReadableNativeMap.mJniCallCounter + 1;
          int len = this.mKeys.length;
          this.mLocalMap = new HashMap(len);
          for (int i = 0; i < len; i = i + 1) {
             this.mLocalMap.put(this.mKeys[i], objArray[i]);
          }
       }
       _monitor_exit(this);
       return this.mLocalMap;
    }
    public final HashMap getLocalTypeMap(){
       ReadableNativeMap obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLocalTypeMap;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(this);
       if (this.mKeys == null) {
          String[] stringArray = this.importKeys();
          a.c(stringArray);
          this.mKeys = stringArray;
          ReadableNativeMap.mJniCallCounter = ReadableNativeMap.mJniCallCounter + 1;
       }
       if (this.mLocalTypeMap == null) {
          Object[] objArray = this.importTypes();
          a.c(objArray);
          ReadableNativeMap.mJniCallCounter = ReadableNativeMap.mJniCallCounter + 1;
          int len = this.mKeys.length;
          this.mLocalTypeMap = new HashMap(len);
          for (int i = 0; i < len; i = i + 1) {
             this.mLocalTypeMap.put(this.mKeys[i], objArray[i]);
          }
       }
       _monitor_exit(this);
       return this.mLocalTypeMap;
    }
    public ReadableMap getMap(String p0){
       return this.getMap(p0);
    }
    public ReadableNativeMap getMap(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getNullableValue(p0, ReadableNativeMap.class);
    }
    public final Object getNullableValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.hasKey(p0)) {
          return this.getLocalMap().get(p0);
       }
       throw new NoSuchKeyException(p0);
    }
    public final Object getNullableValue(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReadableNativeMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getNullableValue(p0);
       this.checkInstance(p0, obj, p1);
       return obj;
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getNullableValue(p0, String.class);
    }
    public ReadableType getType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.getLocalTypeMap().containsKey(p0)) {
          throw new NoSuchKeyException(p0);
       }
       p0 = this.getLocalTypeMap().get(p0);
       a.c(p0);
       return p0;
    }
    public final Object getValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.hasKey(p0) || this.isNull(p0)) {
          throw new NoSuchKeyException(p0);
       }
       p0 = this.getLocalMap().get(p0);
       a.c(p0);
       return p0;
    }
    public final Object getValue(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReadableNativeMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getValue(p0);
       this.checkInstance(p0, obj, p1);
       return obj;
    }
    public boolean hasKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getLocalMap().containsKey(p0);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getLocalMap().hashCode();
    }
    public native final String[] importKeys();
    public native final Object[] importTypes();
    public native final Object[] importValues();
    public boolean isNull(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.getLocalMap().containsKey(p0)) {
          throw new NoSuchKeyException(p0);
       }
       boolean b = (this.getLocalMap().get(p0) == null)? true: false;
       return b;
    }
    public ReadableMapKeySetIterator keySetIterator(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReadableNativeMap$ReadableNativeMapKeySetIterator(this);
    }
    public HashMap toHashMap(){
       HashMap obj = PatchProxy.apply(null, this, ReadableNativeMap.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(this.getLocalMap());
       Iterator iterator = obj.keySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          String str = iterator.next();
          switch (ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[this.getType(str).ordinal()]){
              case 1:
              case 3:
              case 4:
              case 2:
                continue ;
              case 5:
                ReadableNativeMap map = this.getMap(str);
                a.c(map);
                obj.put(str, map.toHashMap());
                break;
              case 6:
                ReadableArray array = this.getArray(str);
                a.c(array);
                obj.put(str, array.toArrayList());
                break;
              default:
                throw new IllegalArgumentException("Could not convert object with key: "+str+".");
          }
       }
    }
}
