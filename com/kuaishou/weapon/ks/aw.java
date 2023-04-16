package com.kuaishou.weapon.ks.aw;
import java.lang.Object;
import android.content.Context;
import java.util.Set;
import java.lang.ClassLoader;
import android.net.wifi.WifiInfo;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import android.provider.Settings$Secure;
import java.util.HashSet;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.lang.CharSequence;
import android.telephony.TelephonyManager;
import com.kuaishou.weapon.ks.bh;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;
import android.location.Location;
import android.os.Build$VERSION;
import android.os.Build;
import android.app.ActivityManager;
import java.lang.Integer;

public class aw	// class@0011d4
{

    public void aw(){
       super();
    }
    public int a(Context p0,int p1,Set p2){
       String str;
       Settings$Secure secure;
       boolean b = false;
       try{
          if (ClassLoader.getSystemClassLoader() != null) {
             switch (p1){
                 case 13:
                   str = "getDeviceId";
                label_002f :
                   b = this.a(p0, str, p2);
                   break;
                 case 14:
                   str = "getSubscriberId";
                   goto label_002f ;
                   break;
                 case 15:
                   str = "getSimSerialNumber";
                   goto label_002f ;
                   break;
                 case 16:
                   secure = Settings$Secure.class;
                   str = "getString";
                label_000f :
                   b = this.a(secure, str, p2);
                   break;
                 case 17:
                   secure = StringBuilder.class;
                   str = "toString";
                   goto label_000f ;
                   break;
                 case 18:
                   secure = Method.class;
                   str = "invoke";
                   goto label_000f ;
                   break;
                 case 19:
                   secure = WifiInfo.class;
                   str = "getMacAddress";
                   goto label_000f ;
                   break;
                 case 20:
                   secure = WifiInfo.class;
                   str = "getSSID";
                   goto label_000f ;
                   break;
                 case 21:
                   str = "getBSSID";
                   goto label_000f ;
                   break;
                 default:
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public Set a(){
       int i;
       BufferedReader uBufferedRea;
       HashSet hashSet = new HashSet();
       try{
          i = 0;
          HashSet hashSet1 = new HashSet();
          uBufferedRea = new BufferedReader(new FileReader("/proc/"+Process.myPid()+"/maps"));
          try{
             String str = uBufferedRea.readLine();
             while (str != null) {
                if (str.endsWith(".so") || str.endsWith(".jar")) {
                   int i1 = str.lastIndexOf(" ") + 1;
                   hashSet1.add(str.substring(i1));
                }
             }
             uBufferedRea.close();
             Iterator iterator = hashSet1.iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                if (str.contains("com.saurik.substrate") || str.contains("XposedBridge.jar")) {
                   hashSet.add(str);
                }
             }
          }catch(java.lang.Exception e0){
             if (uBufferedRea) {
             }
          }
       }catch(java.lang.Exception e0){
          uBufferedRea = i;
          goto label_008e ;
       }
       try{
          uBufferedRea.close();
       }catch(java.lang.Exception e0){
       }
    }
    public Set a(Set p0){
       HashSet hashSet = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str instanceof String) {
             if (str != null) {
                Object obj = str;
                if (obj.startsWith("android.app.ResourcesManager#") || obj.startsWith("android.view.LayoutInflater#")) {
                   continue ;
                }
             }
          }else if(str instanceof Method){
             str = str.getName();
          }
          hashSet.add(str);
       }
       return hashSet;
    }
    public final boolean a(Context p0,String p1,Set p2){
       boolean b = false;
       try{
          TelephonyManager systemServic = p0.getSystemService("phone");
          if (systemServic == null) {
             return b;
          }
          return this.a(systemServic.getClass(), p1, p2);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public final boolean a(Class p0,String p1,Set p2){
       try{
          boolean b = false;
          if (p1 != null && (p2.size() > 0 && ((p2.toString()).contains(p1) && (p2.toString()).contains(p0.getName())))) {
             b = true;
          }
       label_0022 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean a(Class p0,String p1,Class[] p2){
       try{
          return this.a(bh.a(p0, p1, p2));
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public final boolean a(Method p0){
       try{
          boolean b = false;
          if (p0 != null && Modifier.isNative(p0.getModifiers())) {
             b = true;
          }
       label_000f :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public Set b(){
       try{
          Class uClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge");
          if (uClass != null) {
             Field declaredFiel = uClass.getDeclaredField("sHookedMethodCallbacks");
             declaredFiel.setAccessible(true);
             Map map = declaredFiel.get(uClass);
             if (map != null) {
                Set set = map.keySet();
                if (set != null && set.size() > 0) {
                   return this.a(set);
                }
             }
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public Set c(){
       try{
          Class uClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedHelpers");
          if (uClass != null) {
             Field declaredFiel = uClass.getDeclaredField("methodCache");
             declaredFiel.setAccessible(true);
             Map map = declaredFiel.get(uClass);
             if (map != null) {
                Set set = map.keySet();
                if (set != null && set.size() > 0) {
                   return this.a(set);
                }
             }
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public JSONObject d(){
       try{
          JSONObject jSONObject = new JSONObject();
          int i = 0;
          Class[] uClassArray = new Class[i];
          String str = "0";
          int i1 = (this.a(TelephonyManager.class, "getDeviceId", uClassArray))? 1: 0;
          jSONObject.put(str, i1);
          Class[] uClassArray1 = new Class[i];
          str = "1";
          i1 = (this.a(TelephonyManager.class, "getSubscriberId", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[i];
          str = "2";
          i1 = (this.a(TelephonyManager.class, "getSimSerialNumber", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[i];
          str = "3";
          i1 = (this.a(Location.class, "getLatitude", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[i];
          str = "4";
          i1 = (this.a(Location.class, "getLongitude", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          String str1 = "5";
          if (Build$VERSION.SDK_INT >= 26) {
             Class[] uClassArray2 = new Class[i];
             i1 = (this.a(Build.class, "getSerial", uClassArray2))? 1: 0;
             jSONObject.put(str1, i1);
          }else {
             jSONObject.put(str1, i);
          }
          uClassArray1 = new Class[i];
          str = "6";
          i1 = (this.a(WifiInfo.class, "getMacAddress", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[i];
          str = "7";
          i1 = (this.a(WifiInfo.class, "getBSSID", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[i];
          str = "8";
          i1 = (this.a(WifiInfo.class, "getRssi", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[]{String.class};
          str = "9";
          i1 = (this.a(Class.class, "forName", uClassArray1))? 1: 0;
          jSONObject.put(str, i1);
          uClassArray1 = new Class[]{Integer.TYPE};
          if (this.a(ActivityManager.class, "getRunningServices", uClassArray1)) {
             i = 1;
          }
          jSONObject.put("10", i);
          return jSONObject;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
