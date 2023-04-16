package com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Double;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.JavaOnlyMap$2;
import java.lang.Enum;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.JavaOnlyArray;
import java.lang.Boolean;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromMap;
import java.util.Iterator;
import java.util.Set;
import java.lang.StringBuilder;
import com.facebook.react.bridge.JavaOnlyMap$1;
import java.lang.Integer;

public class JavaOnlyMap implements ReadableMap, WritableMap	// class@0011f5
{
    public final Map mBackingMap;

    public void JavaOnlyMap(){
       super();
       this.mBackingMap = new HashMap();
    }
    public void JavaOnlyMap(Object[] p0){
       super();
       if (p0.length % 2) {
          throw new IllegalArgumentException("You must provide the same number of keys and values");
       }
       this.mBackingMap = new HashMap();
       for (int i = 0; i < p0.length; i = i + 2) {
          int i1 = i + 1;
          object oobject = p0[i1];
          if (oobject instanceof Number) {
             oobject = Double.valueOf(oobject.doubleValue());
          }
          this.mBackingMap.put(p0[i], oobject);
       }
       return;
    }
    public static JavaOnlyMap deepClone(ReadableMap p0){
       JavaOnlyMap obj = PatchProxy.applyOneRefs(p0, null, JavaOnlyMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JavaOnlyMap();
       ReadableMapKeySetIterator readableMapK = p0.keySetIterator();
       while (readableMapK.hasNextKey()) {
          String str = readableMapK.nextKey();
          switch (JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType(str).ordinal()]){
              case 1:
                obj.putNull(str);
                break;
              case 2:
                obj.putBoolean(str, p0.getBoolean(str));
                break;
              case 3:
                obj.putDouble(str, p0.getDouble(str));
                break;
              case 4:
                obj.putString(str, p0.getString(str));
                break;
              case 5:
                obj.putMap(str, JavaOnlyMap.deepClone(p0.getMap(str)));
                break;
              case 6:
                obj.putArray(str, JavaOnlyArray.deepClone(p0.getArray(str)));
                break;
              default:
          }
       }
       return obj;
    }
    public static JavaOnlyMap of(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaOnlyMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JavaOnlyMap(p0);
    }
    public WritableMap copy(){
       JavaOnlyMap obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JavaOnlyMap();
       obj.merge(this);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       JavaOnlyMap tmBackingMap = this.mBackingMap;
       p0 = p0.mBackingMap;
       if (tmBackingMap != null) {
          if (!tmBackingMap.equals(p0)) {
          label_0036 :
             return false;
          }
       }else if(p0 != null){
          goto label_0036 ;
       }
       return true;
    }
    public ReadableArray getArray(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingMap.get(p0);
    }
    public boolean getBoolean(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBackingMap.get(p0).booleanValue();
    }
    public double getDouble(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mBackingMap.get(p0).doubleValue();
    }
    public Dynamic getDynamic(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicFromMap.create(this, p0);
    }
    public Iterator getEntryIterator(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingMap.entrySet().iterator();
    }
    public int getInt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackingMap.get(p0).intValue();
    }
    public ReadableMap getMap(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingMap.get(p0);
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingMap.get(p0);
    }
    public ReadableType getType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBackingMap.get(p0);
       if (obj == null) {
          return ReadableType.Null;
       }
       if (obj instanceof Number) {
          return ReadableType.Number;
       }
       if (obj instanceof String) {
          return ReadableType.String;
       }
       if (obj instanceof Boolean) {
          return ReadableType.Boolean;
       }
       if (obj instanceof ReadableMap) {
          return ReadableType.Map;
       }
       if (obj instanceof ReadableArray) {
          return ReadableType.Array;
       }
       if (obj instanceof Dynamic) {
          return obj.getType();
       }
       throw new IllegalArgumentException("Invalid value "+obj.toString()+" for key "+p0+"contained in JavaOnlyMap");
    }
    public boolean hasKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBackingMap.containsKey(p0);
    }
    public int hashCode(){
       JavaOnlyMap obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBackingMap;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public boolean isNull(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mBackingMap.get(p0) == null)? true: false;
       return b;
    }
    public ReadableMapKeySetIterator keySetIterator(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JavaOnlyMap$1(this);
    }
    public void merge(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaOnlyMap.class, "21")) {
          return;
       }
       this.mBackingMap.putAll(p0.mBackingMap);
       return;
    }
    public void putArray(String p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaOnlyMap.class, "23")) {
          return;
       }
       this.mBackingMap.put(p0, p1);
       return;
    }
    public void putBoolean(String p0,boolean p1){
       JavaOnlyMap javaOnlyMap = JavaOnlyMap.class;
       if (PatchProxy.isSupport(javaOnlyMap) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, javaOnlyMap, "15")) {
          return;
       }
       this.mBackingMap.put(p0, Boolean.valueOf(p1));
       return;
    }
    public void putDouble(String p0,double p1){
       JavaOnlyMap javaOnlyMap = JavaOnlyMap.class;
       if (PatchProxy.isSupport(javaOnlyMap) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, javaOnlyMap, "16")) {
          return;
       }
       this.mBackingMap.put(p0, Double.valueOf(p1));
       return;
    }
    public void putInt(String p0,int p1){
       JavaOnlyMap javaOnlyMap = JavaOnlyMap.class;
       if (PatchProxy.isSupport(javaOnlyMap) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, javaOnlyMap, "17")) {
          return;
       }
       this.mBackingMap.put(p0, new Double((double)p1));
       return;
    }
    public void putMap(String p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaOnlyMap.class, "20")) {
          return;
       }
       this.mBackingMap.put(p0, p1);
       return;
    }
    public void putNull(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaOnlyMap.class, "19")) {
          return;
       }
       this.mBackingMap.put(p0, null);
       return;
    }
    public void putString(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaOnlyMap.class, "18")) {
          return;
       }
       this.mBackingMap.put(p0, p1);
       return;
    }
    public HashMap toHashMap(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HashMap(this.mBackingMap);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingMap.toString();
    }
}
