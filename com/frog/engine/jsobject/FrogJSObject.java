package com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import org.json.JSONArray;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.internal.FrogLog;
import com.kwai.robust.PatchProxyResult;
import android.util.Base64;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Short;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;

public class FrogJSObject	// class@00153b
{
    public Map datas;

    public void FrogJSObject(){
       super();
       this.datas = new LinkedHashMap();
    }
    public static void fromJSObject(JSONObject p0,FrogJSObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogJSObject.class, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Iterator iterator = p0.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object obj = p0.get(str);
             if (!FrogJSObject.putObjectValue(p1, str, obj) && obj instanceof JSONArray) {
                p1.put(str, FrogJSObject.putArrayValue(obj));
             }
          }
       }
       return;
    }
    public static JSONArray getJSONArray(Object[] p0){
       JSONObject jSONObject;
       JSONArray obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONArray();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             if (FrogJSObject.isBasicDataType(oobject)) {
                obj.put(oobject);
             }else if(oobject instanceof byte[]){
                jSONObject = new JSONObject();
                jSONObject.put("jniBytes", Base64.encodeToString(oobject, 2));
                obj.put(jSONObject);
             }else if(oobject instanceof FrogJSObject){
                jSONObject = new JSONObject();
                FrogJSObject.toJSONObject(oobject, jSONObject);
                obj.put(jSONObject);
             }else if(oobject instanceof Object[]){
                obj.put(FrogJSObject.getJSONArray(oobject));
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static JSONArray getJSONArray4Log(Object[] p0){
       JSONArray obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONArray();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             if (FrogJSObject.isBasicDataType(oobject)) {
                obj.put(oobject);
             }else if(oobject instanceof byte[]){
                obj.put("ArrayBuffer length:"+oobject.length);
             }else if(oobject instanceof FrogJSObject){
                JSONObject jSONObject = new JSONObject();
                FrogJSObject.toJSLog(oobject, jSONObject);
                obj.put(jSONObject);
             }else if(oobject instanceof Object[]){
                obj.put(FrogJSObject.getJSONArray4Log(oobject));
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static boolean getObjectAsBoolean(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.booleanValue();
    }
    public static byte[] getObjectAsBytes(Object p0){
       return p0;
    }
    public static double getObjectAsNumber(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Double.valueOf(p0.toString()).doubleValue();
    }
    public static Object[] getObjectAsObjectArray(Object p0){
       return p0;
    }
    public static String getObjectAsString(Object p0){
       return p0;
    }
    public static boolean isBasicDataType(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof String && (p0 instanceof Boolean || FrogJSObject.isNumberType(p0))) {
          return true;
       }
       return false;
    }
    public static boolean isNumberType(Object p0){
       if (!(v0 = p0 instanceof Integer) && (!p0 instanceof Double && (!p0 instanceof Float && (!v0 && (!p0 instanceof Long && (p0 instanceof Number || p0 instanceof Short)))))) {
          return true;
       }
       return false;
    }
    public static boolean objectIsArrayType(Object p0){
       return p0 instanceof Object[];
    }
    public static boolean objectIsBooleanType(Object p0){
       return p0 instanceof Boolean;
    }
    public static boolean objectIsByteArrayType(Object p0){
       return p0 instanceof byte[];
    }
    public static boolean objectIsJSObjectType(Object p0){
       return p0 instanceof FrogJSObject;
    }
    public static boolean objectIsNumberType(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FrogJSObject.isNumberType(p0);
    }
    public static boolean objectIsStringType(Object p0){
       return p0 instanceof String;
    }
    public static Object[] putArrayValue(JSONArray p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, FrogJSObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[p0.length()];
       int i = 0;
       while (i < p0.length()) {
          Object obj1 = p0.get(i);
          if (FrogJSObject.isNumberType(obj1)) {
             obj[i] = obj1;
          }else if(obj1 instanceof Boolean){
             obj[i] = obj1;
          }else if(obj1 instanceof String){
             obj[i] = obj1;
          }else if(obj1 instanceof JSONObject){
             if (obj1.has("jniBytes")) {
                obj[i] = Base64.decode(obj1.optString("jniBytes"), 2);
             }else {
                FrogJSObject uFrogJSObjec = new FrogJSObject();
                FrogJSObject.fromJSObject(obj1, uFrogJSObjec);
                obj[i] = uFrogJSObjec;
             }
          }else if(obj1 instanceof JSONArray){
             obj[i] = FrogJSObject.putArrayValue(obj1);
          }
          i = i + 1;
       }
       return obj;
    }
    public static boolean putObjectValue(FrogJSObject p0,String p1,Object p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FrogJSObject.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (FrogJSObject.isNumberType(p2)) {
          p0.put(p1, Double.valueOf(String.valueOf(p2)).doubleValue());
          return true;
       }else if(p2 instanceof String){
          p0.put(p1, p2);
          return true;
       }else if(p2 instanceof Boolean){
          p0.put(p1, p2.booleanValue());
          return true;
       }else if(p2 instanceof JSONObject){
          obj = "jniBytes";
          if (p2.has(obj)) {
             p0.put(p1, Base64.decode(p2.optString(obj), 2));
          }else {
             FrogJSObject uFrogJSObjec = new FrogJSObject();
             FrogJSObject.fromJSObject(p2, uFrogJSObjec);
             p0.put(p1, uFrogJSObjec);
          }
          return true;
       }else {
          return false;
       }
    }
    public static void toJSLog(FrogJSObject p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogJSObject.class, "8")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Iterator iterator = p0.datas.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             Integer value = uEntry.getValue();
             if (FrogJSObject.isNumberType(value)) {
                if (Double.isNaN(value.doubleValue())) {
                   value = Integer.valueOf(0);
                }else if(Double.isInfinite(value.doubleValue())){
                   value = Double.valueOf(Double.MAX_VALUE);
                }
                p1.put(key, value);
             }else if(FrogJSObject.isBasicDataType(value)){
                p1.put(key, value);
             }else if(value instanceof byte[]){
                p1.put(key, "ArrayBuffer length:"+value.length);
             }else if(value instanceof FrogJSObject){
                JSONObject jSONObject = new JSONObject();
                FrogJSObject.toJSLog(value, jSONObject);
                p1.put(key, jSONObject);
             }else if(value instanceof Object[]){
                p1.put(key, FrogJSObject.getJSONArray4Log(value));
             }
          }
       }
       return;
    }
    public static void toJSONObject(FrogJSObject p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogJSObject.class, "5")) {
          return;
       }
       FrogJSObject.toJSONObject(p0, p1, false);
       return;
    }
    public static void toJSONObject(FrogJSObject p0,JSONObject p1,boolean p2){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(FrogJSObject.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, FrogJSObject.class, "6")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Iterator iterator = p0.datas.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             Integer value = uEntry.getValue();
             if (FrogJSObject.isNumberType(value)) {
                if (Double.isNaN(value.doubleValue())) {
                   value = Integer.valueOf(0);
                }else if(Double.isInfinite(value.doubleValue())){
                   value = Double.valueOf(Double.MAX_VALUE);
                }
                if (p2) {
                   double d = value.doubleValue();
                   int i = (int)d;
                   d = d - (double)i;
                   if (!d) {
                      p1.put(key, i);
                   }else {
                      p1.put(key, value);
                   }
                }else {
                   p1.put(key, value);
                }
             }else if(FrogJSObject.isBasicDataType(value)){
                p1.put(key, value);
             }else if(value instanceof byte[]){
                jSONObject = new JSONObject();
                jSONObject.put("jniBytes", Base64.encodeToString(value, 2));
                p1.put(key, jSONObject);
             }else if(value instanceof FrogJSObject){
                jSONObject = new JSONObject();
                FrogJSObject.toJSONObject(value, jSONObject);
                p1.put(key, jSONObject);
             }else if(value instanceof Object[]){
                p1.put(key, FrogJSObject.getJSONArray(value));
             }
          }
       }
       return;
    }
    public String[] getAllKeys(){
       FrogJSObject obj = PatchProxy.apply(null, this, FrogJSObject.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.datas;
       if (obj == null || obj.isEmpty()) {
          String[] stringArray = new String[0];
          return stringArray;
       }else {
          Set set = this.datas.keySet();
          String[] stringArray1 = new String[set.size()];
          return set.toArray(stringArray1);
       }
    }
    public boolean getBoolean(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.datas.get(p0) instanceof Boolean) {
          return this.datas.get(p0).booleanValue();
       }
       return false;
    }
    public byte[] getBytes(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.datas.get(p0) instanceof byte[]) {
          return this.datas.get(p0);
       }
       return null;
    }
    public FrogJSObject getJSObject(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.datas.get(p0) instanceof FrogJSObject) {
          return this.datas.get(p0);
       }
       return null;
    }
    public double getNumber(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.datas.get(p0) != null && FrogJSObject.isNumberType(this.datas.get(p0))) {
          return this.datas.get(p0).doubleValue();
       }
       return 0;
    }
    public Object[] getObject(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.datas.get(p0) instanceof Object[]) {
          return this.datas.get(p0);
       }
       return null;
    }
    public Object getObjectForce(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.datas.get(p0);
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.datas.get(p0) instanceof String) {
          return this.datas.get(p0).toString();
       }
       return "";
    }
    public boolean hasKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.datas.get(p0) != null)? true: false;
       return b;
    }
    public boolean isArrayType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.datas.get(p0) instanceof Object[];
    }
    public boolean isBooleanType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.datas.get(p0) instanceof Boolean;
    }
    public boolean isByteArrayType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.datas.get(p0) instanceof byte[];
    }
    public boolean isJSObjectType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.datas.get(p0) instanceof FrogJSObject;
    }
    public boolean isNumberType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FrogJSObject.isNumberType(this.datas.get(p0));
    }
    public boolean isStringType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogJSObject.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.datas.get(p0) instanceof String;
    }
    public void put(String p0,double p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uFrogJSObjec, "15")) {
          return;
       }
       this.datas.put(p0, Double.valueOf(p1));
       return;
    }
    public void put(String p0,float p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uFrogJSObjec, "17")) {
          return;
       }
       this.datas.put(p0, Double.valueOf(p1+""));
       return;
    }
    public void put(String p0,int p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFrogJSObjec, "16")) {
          return;
       }
       this.datas.put(p0, Double.valueOf(p1+""));
       return;
    }
    public void put(String p0,long p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uFrogJSObjec, "18")) {
          return;
       }
       this.datas.put(p0, Double.valueOf(p1+""));
       return;
    }
    public void put(String p0,FrogJSObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogJSObject.class, "21")) {
          return;
       }
       this.datas.put(p0, p1);
       return;
    }
    public void put(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogJSObject.class, "14")) {
          return;
       }
       this.datas.put(p0, p1);
       return;
    }
    public void put(String p0,short p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Short.valueOf(p1), this, uFrogJSObjec, "19")) {
          return;
       }
       this.datas.put(p0, Double.valueOf(p1+""));
       return;
    }
    public void put(String p0,boolean p1){
       FrogJSObject uFrogJSObjec = FrogJSObject.class;
       if (PatchProxy.isSupport(uFrogJSObjec) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uFrogJSObjec, "20")) {
          return;
       }
       this.datas.put(p0, Boolean.valueOf(p1));
       return;
    }
    public void put(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogJSObject.class, "13")) {
          return;
       }
       this.datas.put(p0, p1);
       return;
    }
    public void put(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogJSObject.class, "22")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       this.datas.put(p0, p1);
       return;
    }
}
