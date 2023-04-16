package com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Double;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromArray;
import od.a;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableNativeArray$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.HashMap;

public class ReadableNativeArray extends NativeArray implements ReadableArray	// class@001231
{
    public Object[] mLocalArray;
    public ReadableType[] mLocalTypeArray;
    public static int jniPassCounter;

    static {
       ReactBridge.staticInit();
       ReadableNativeArray.jniPassCounter = 0;
    }
    public void ReadableNativeArray(HybridData p0){
       super(p0);
    }
    public static int getJNIPassCounter(){
       return ReadableNativeArray.jniPassCounter;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReadableNativeArray.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof ReadableNativeArray) {
          return false;
       }
       return Arrays.deepEquals(this.getLocalArray(), p0.getLocalArray());
    }
    public ReadableArray getArray(int p0){
       return this.getArray(p0);
    }
    public ReadableNativeArray getArray(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getLocalArray()[p0];
    }
    public boolean getBoolean(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getLocalArray()[p0].booleanValue();
    }
    public double getDouble(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return this.getLocalArray()[p0].doubleValue();
    }
    public Dynamic getDynamic(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return DynamicFromArray.create(this, p0);
    }
    public int getInt(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getLocalArray()[p0].intValue();
    }
    public final Object[] getLocalArray(){
       ReadableNativeArray obj = PatchProxy.apply(null, this, ReadableNativeArray.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLocalArray;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(this);
       if (this.mLocalArray == null) {
          ReadableNativeArray.jniPassCounter = ReadableNativeArray.jniPassCounter + 1;
          Object[] objArray = this.importArray();
          a.c(objArray);
          this.mLocalArray = objArray;
       }
       _monitor_exit(this);
       return this.mLocalArray;
    }
    public final ReadableType[] getLocalTypeArray(){
       ReadableNativeArray obj = PatchProxy.apply(null, this, ReadableNativeArray.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLocalTypeArray;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(this);
       if (this.mLocalTypeArray == null) {
          ReadableNativeArray.jniPassCounter = ReadableNativeArray.jniPassCounter + 1;
          Object[] objArray = this.importTypeArray();
          a.c(objArray);
          this.mLocalTypeArray = Arrays.copyOf(objArray, objArray.length, ReadableType[].class);
       }
       _monitor_exit(this);
       return this.mLocalTypeArray;
    }
    public ReadableMap getMap(int p0){
       return this.getMap(p0);
    }
    public ReadableNativeMap getMap(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getLocalArray()[p0];
    }
    public String getString(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getLocalArray()[p0];
    }
    public ReadableType getType(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getLocalTypeArray()[p0];
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeArray.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getLocalArray().hashCode();
    }
    public native final Object[] importArray();
    public native final Object[] importTypeArray();
    public boolean isNull(int p0){
       ReadableNativeArray readableNati = ReadableNativeArray.class;
       if (PatchProxy.isSupport(readableNati)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, readableNati, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.getLocalArray()[p0] == null)? true: false;
       return b;
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeArray.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getLocalArray().length;
    }
    public ArrayList toArrayList(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, ReadableNativeArray.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       while (true) {
          if (i >= this.size()) {
             return obj;
          }
          switch (ReadableNativeArray$1.$SwitchMap$com$facebook$react$bridge$ReadableType[this.getType(i).ordinal()]){
              case 1:
                obj.add(objArray);
                break;
              case 2:
                obj.add(Boolean.valueOf(this.getBoolean(i)));
                break;
              case 3:
                obj.add(Double.valueOf(this.getDouble(i)));
                break;
              case 4:
                obj.add(this.getString(i));
                break;
              case 5:
                obj.add(this.getMap(i).toHashMap());
                break;
              case 6:
                obj.add(this.getArray(i).toArrayList());
                break;
              default:
                throw new IllegalArgumentException("Could not convert object at index: "+i+".");
          }
          i = i + 1;
       }
    }
}
