package com.kuaishou.weapon.ks.bc;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.j;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.lang.System;

public class bc	// class@0011dd
{
    public static String a = "appkey";
    public static String b = "secretkey";
    public static String c = "pver";
    public static String d = "sdkver";
    public static String e = "ksid";
    public static String f = "timestamp";
    public static String g = "sign";

    public void bc(){
       super();
    }
    public static String a(Context p0){
       Map map = bc.b(p0);
       if (map == null || map.size() < 1) {
          return null;
       }
       String str = "";
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = str+"&"+uEntry.getKey()+"="+uEntry.getValue();
       }
       return str.substring(1);
    }
    public static String a(Map p0){
       return j.a(p0.get(bc.a)+p0.get(bc.b)+p0.get(bc.f));
    }
    public static void a(Context p0,JSONObject p1){
       p1.put("k", "");
       p1.put("hp", bs.d(p0));
       p1.put("hv", bs.b(p0));
       p1.put("pver", d.a(p0).a("plc001_v_s", "0.0.0"));
       p1.put("platform", 1);
       p1.put("device_id", bs.e(p0));
    }
    public static Map b(Context p0){
       object oobject;
       object oobject1;
       String[] stringArray = bs.a(p0);
       if (stringArray != null && stringArray.length == 2) {
          int i = 0;
          if (!TextUtils.isEmpty(stringArray[i])) {
             int i1 = 1;
             if (!TextUtils.isEmpty(stringArray[i1])) {
                oobject = stringArray[i];
                oobject1 = stringArray[i1];
             label_0025 :
                HashMap hashMap = new HashMap();
                hashMap.put(bc.a, oobject);
                hashMap.put(bc.b, oobject1);
                hashMap.put(bc.f, String.valueOf((System.currentTimeMillis() / 1000)));
                hashMap.put(bc.g, bc.a(hashMap));
                return hashMap;
             }
          }
       }
       oobject = "16";
       oobject1 = "62c80c436b7547a68a12774c67519836";
       goto label_0025 ;
    }
    public static JSONObject c(Context p0){
       JSONObject jSONObject = new JSONObject();
       bc.a(p0, jSONObject);
       jSONObject.put("sdkver", "5.9.2");
       jSONObject.put("iv", "v1");
       return jSONObject;
    }
    public static JSONObject d(Context p0){
       JSONObject jSONObject = new JSONObject();
       bc.a(p0, jSONObject);
       jSONObject.put("sdkver", "5.9.2");
       jSONObject.put("piv", "v1");
       jSONObject.put("sysver", bs.c());
       jSONObject.put("mod", bs.b());
       return jSONObject;
    }
}
