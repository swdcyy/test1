package com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.JavaOnlyArray$1;
import java.lang.Enum;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.JavaOnlyMap;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromArray;
import java.lang.Double;
import java.lang.Float;

public class JavaOnlyArray implements ReadableArray, WritableArray	// class@0011f2
{
    public final List mBackingList;

    public void JavaOnlyArray(){
       super();
       this.mBackingList = new ArrayList();
    }
    public void JavaOnlyArray(List p0){
       super();
       this.mBackingList = new ArrayList(p0);
    }
    public void JavaOnlyArray(Object[] p0){
       super();
       this.mBackingList = Arrays.asList(p0);
    }
    public static JavaOnlyArray deepClone(ReadableArray p0){
       JavaOnlyArray obj = PatchProxy.applyOneRefs(p0, null, JavaOnlyArray.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JavaOnlyArray();
       int i = 0;
       int i1 = p0.size();
       while (i < i1) {
          switch (JavaOnlyArray$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType(i).ordinal()]){
              case 1:
                obj.pushNull();
                break;
              case 2:
                obj.pushBoolean(p0.getBoolean(i));
                break;
              case 3:
                obj.pushDouble(p0.getDouble(i));
                break;
              case 4:
                obj.pushString(p0.getString(i));
                break;
              case 5:
                obj.pushMap(JavaOnlyMap.deepClone(p0.getMap(i)));
                break;
              case 6:
                obj.pushArray(JavaOnlyArray.deepClone(p0.getArray(i)));
                break;
              default:
          }
          i = i + 1;
       }
       return obj;
    }
    public static JavaOnlyArray from(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaOnlyArray.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JavaOnlyArray(p0);
    }
    public static JavaOnlyArray of(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaOnlyArray.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JavaOnlyArray(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaOnlyArray.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       JavaOnlyArray tmBackingLis = this.mBackingList;
       p0 = p0.mBackingList;
       if (tmBackingLis != null) {
          if (!tmBackingLis.equals(p0)) {
          label_0036 :
             return false;
          }
       }else if(p0 != null){
          goto label_0036 ;
       }
       return true;
    }
    public ReadableArray getArray(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mBackingList.get(p0);
    }
    public boolean getBoolean(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.mBackingList.get(p0).booleanValue();
    }
    public double getDouble(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return this.mBackingList.get(p0).doubleValue();
    }
    public Dynamic getDynamic(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return DynamicFromArray.create(this, p0);
    }
    public int getInt(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mBackingList.get(p0).intValue();
    }
    public ReadableMap getMap(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mBackingList.get(p0);
    }
    public String getString(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mBackingList.get(p0);
    }
    public ReadableType getType(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = this.mBackingList.get(p0);
       if (obj1 == null) {
          return ReadableType.Null;
       }else if(obj1 instanceof Boolean){
          return ReadableType.Boolean;
       }else if(!obj1 instanceof Double && (obj1 instanceof Float || obj1 instanceof Integer)){
          return ReadableType.Number;
       }else if(obj1 instanceof String){
          return ReadableType.String;
       }else if(obj1 instanceof ReadableArray){
          return ReadableType.Array;
       }else if(obj1 instanceof ReadableMap){
          return ReadableType.Map;
       }else {
          return null;
       }
    }
    public int hashCode(){
       JavaOnlyArray obj = PatchProxy.apply(null, this, JavaOnlyArray.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBackingList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public boolean isNull(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.mBackingList.get(p0) == null)? true: false;
       return b;
    }
    public void pushArray(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaOnlyArray.class, "18")) {
          return;
       }
       this.mBackingList.add(p0);
       return;
    }
    public void pushBoolean(boolean p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, javaOnlyArra, "14")) {
          return;
       }
       this.mBackingList.add(Boolean.valueOf(p0));
       return;
    }
    public void pushDouble(double p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, javaOnlyArra, "15")) {
          return;
       }
       this.mBackingList.add(Double.valueOf(p0));
       return;
    }
    public void pushInt(int p0){
       JavaOnlyArray javaOnlyArra = JavaOnlyArray.class;
       if (PatchProxy.isSupport(javaOnlyArra) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, javaOnlyArra, "16")) {
          return;
       }
       this.mBackingList.add(new Double((double)p0));
       return;
    }
    public void pushMap(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaOnlyArray.class, "19")) {
          return;
       }
       this.mBackingList.add(p0);
       return;
    }
    public void pushNull(){
       if (PatchProxy.applyVoid(null, this, JavaOnlyArray.class, "20")) {
          return;
       }
       this.mBackingList.add(null);
       return;
    }
    public void pushString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaOnlyArray.class, "17")) {
          return;
       }
       this.mBackingList.add(p0);
       return;
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyArray.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackingList.size();
    }
    public ArrayList toArrayList(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyArray.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.mBackingList);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyArray.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackingList.toString();
    }
}
