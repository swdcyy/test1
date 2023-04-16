package com.xiaomi.push.service.m0;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import com.xiaomi.push.service.l0;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.i6;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Object;
import rs8.c;
import java.util.TreeMap;
import ws8.a0;
import java.util.Map;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import java.lang.Integer;
import android.os.Build;
import ws8.m6;
import java.lang.StringBuilder;
import ws8.p0;
import android.os.Build$VERSION;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ys8.c0;
import ws8.i0;
import ws8.k0;
import ws8.c;
import ys8.e1;
import ys8.b;
import ws8.b5;
import com.xiaomi.push.n;
import java.lang.Enum;
import com.xiaomi.push.service.m0$a;

public class m0	// class@001184
{
    public static l0 a;
    public static m0$a b;

    public static int a(Context p0){
       return o.c(p0, "mipush_account", 0).getInt("enc_req_fail_count", 0);
    }
    public static synchronized l0 b(Context p0){
       _monitor_enter(m0.class);
       l0 a = m0.a;
       if (a != null) {
          _monitor_exit(m0.class);
          return a;
       }else {
          SharedPreferences sharedPrefer = o.c(p0, "mipush_account", 0);
          String str = null;
          String str1 = sharedPrefer.getString("uuid", str);
          String str2 = sharedPrefer.getString("token", str);
          String str3 = sharedPrefer.getString("security", str);
          String str4 = sharedPrefer.getString("app_id", str);
          String str5 = sharedPrefer.getString("app_token", str);
          String str6 = sharedPrefer.getString("package_name", str);
          String str7 = sharedPrefer.getString("device_id", str);
          int intx = sharedPrefer.getInt("env_type", 1);
          if (!TextUtils.isEmpty(str7) && i6.j(str7)) {
             str7 = i6.s(p0);
             g.b(sharedPrefer.edit().putString("device_id", str7));
          }
          if (!TextUtils.isEmpty(str1) && (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
             String str8 = i6.s(p0);
             if (!("com.xiaomi.xmsf").equals(p0.getPackageName()) && (!TextUtils.isEmpty(str8) && (!TextUtils.isEmpty(str7) && !str7.equals(str8)))) {
                c.l("read_phone_state permission changes.");
             }
          label_0098 :
             l0 ol0 = new l0(str1, str2, str3, str4, str5, str6, intx);
             m0.a = "read_phone_state permission changes.";
             _monitor_exit(m0.class);
             return "read_phone_state permission changes.";
          }else {
             _monitor_exit(m0.class);
             return str;
          }
       }
    }
    public static synchronized l0 c(Context p0,String p1,String p2,String p3){
       String str;
       PackageInfo packageInfo;
       String obj;
       int b1;
       i0 oi0;
       boolean b2;
       Context uContext = p0;
       _monitor_enter(m0.class);
       TreeMap treeMap = new TreeMap();
       boolean b = false;
       treeMap.put("devid", i6.g(uContext, b));
       l0 a = m0.a;
       if (a != null && !TextUtils.isEmpty(a.a)) {
          treeMap.put("uuid", m0.a.a);
          int i = (m0.a.a).lastIndexOf("/");
          if (i != -1) {
             str = (m0.a.a).substring((i + 1));
          label_0044 :
             a0.c(p0).d(treeMap);
             String str1 = (m0.k(p0))? "1000271": p2;
             String str2 = (m0.k(p0))? "420100086271": p3;
             String str3 = (m0.k(p0))? "com.xiaomi.xmsf": p1;
             treeMap.put("appid", str1);
             String str4 = "apptoken";
             try{
                treeMap.put(str4, str2);
                packageInfo = p0.getPackageManager().getPackageInfo(str3, 0x4000);
             }catch(java.lang.Exception e0){
                c.o(e0);
                packageInfo = null;
             }
             String str5 = "appversion";
             str4 = (packageInfo != null)? String.valueOf(packageInfo.versionCode): "0";
             treeMap.put(str5, str4);
             treeMap.put("sdkversion", Integer.toString(0xc358));
             treeMap.put("packagename", str3);
             treeMap.put("model", Build.MODEL);
             treeMap.put("board", Build.BOARD);
             if (!m6.t()) {
                str4 = "";
                if (!TextUtils.isEmpty(null)) {
                   str4 = str4+p0.b(null);
                }
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(null)) {
                   str4 = str4+","+null;
                }
                if (!TextUtils.isEmpty(str4)) {
                   treeMap.put("imei_md5", str4);
                }
             }
             treeMap.put("os", Build$VERSION.RELEASE+"-"+Build$VERSION.INCREMENTAL);
             i = i6.c();
             if (i >= 0) {
                treeMap.put("space_id", Integer.toString(i));
             }
             treeMap.put("brand", Build.BRAND+"");
             treeMap.put("ram", i6.e());
             treeMap.put("rom", i6.l());
             JSONObject jSONObject = new JSONObject();
             Iterator iterator = treeMap.entrySet().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                try{
                   jSONObject.put(obj.getKey(), obj.getValue());
                }catch(org.json.JSONException e0){
                   c.u("failed to add data in json format: k="+obj.getKey()+",v="+obj.getValue()+". "+e0);
                   goto label_0169 ;
                }
             }
             str4 = c0.a(jSONObject.toString());
             TreeMap treeMap1 = new TreeMap();
             treeMap1.put("requestData", str4);
             treeMap1.put("keyPairVer", "1");
             if (m0.a(p0) >= 2 || TextUtils.isEmpty(str4)) {
                b1 = false;
             }else {
                c.l("r.data = "+str4);
                b1 = true;
             }
             str4 = m0.e(uContext, b1);
             if (TextUtils.isEmpty(str4)) {
                _monitor_exit(m0.class);
                return null;
             }else if(b1){
                treeMap = treeMap1;
             }
             try{
                oi0 = k0.n(uContext, str4, treeMap);
             }catch(java.io.IOException e0){
                c.u("device registration request failed. "+e0);
                oi0 = null;
             }
             if (oi0 != null && oi0.a == 200) {
                str4 = oi0.a();
                if (!TextUtils.isEmpty(str4)) {
                   try{
                      JSONObject jSONObject1 = new JSONObject(str4);
                      if (!jSONObject1.getInt("code")) {
                         JSONObject jSONObject2 = jSONObject1.getJSONObject("data");
                         String str6 = jSONObject2.getString("ssecurity");
                         obj = jSONObject2.getString("token");
                         str4 = jSONObject2.getString("userId");
                         if (TextUtils.isEmpty(str)) {
                            str = "an"+p0.a(6);
                         }
                         String str7 = str4+"@xiaomi.com/"+str;
                         int i1 = c.a();
                         l0 ol0 = jSONObject1;
                         b1 = i1;
                         ol0 = new l0(str7, obj, str6, str1, str2, str3, b1);
                         m0.i(uContext, jSONObject1);
                         m0.a = jSONObject1;
                         m0.h(uContext, b);
                         c.l("device registration is successful. "+str4);
                         _monitor_exit(m0.class);
                         return jSONObject1;
                      }else {
                         b2 = b1;
                         e1.a(uContext, jSONObject1.getInt("code"), jSONObject1.optString("description"));
                         c.l("device registration resp: "+str4);
                      label_030a :
                         if (b2 && k0.q(p0)) {
                            m0.h(uContext, (m0.a(p0) + 1));
                         }
                         c.l("fail to register push account. meet error.");
                         _monitor_exit(m0.class);
                         return null;
                      }
                   }catch(org.json.JSONException e0){
                      b2 = b1;
                   }catch(org.json.JSONException e0){
                   }
                   str4 = "failed to parse respone json data. "+e0;
                   c.u(str4);
                   goto label_030a ;
                }
             }
             b2 = b1;
             goto label_030a ;
          }
       }
       str = null;
       goto label_0044 ;
    }
    public static String d(Context p0){
       object oobject;
       l0 ol0 = m0.b(p0);
       if (ol0 != null && !TextUtils.isEmpty(ol0.a)) {
          String[] stringArray = (ol0.a).split("@");
          if (stringArray.length > 0) {
             oobject = stringArray[0];
          label_001e :
             return oobject;
          }
       }
       oobject = null;
       goto label_001e ;
    }
    public static String e(Context p0,boolean p1){
       String str2;
       StringBuilder str = b.c(p0).a();
       String str1 = (p1)? "/pass/v2/register/encrypt": "/pass/v2/register";
       if (c.d()) {
          str = "http://"+b5.j;
          str2 = ":9085";
       }else if((n.a.name()).equals(str)){
          str = "";
          str2 = "https://cn.register.xmpush.xiaomi.com";
       }else {
          return null;
       }
       return str+str2+str1;
    }
    public static void f(){
       m0$a b = m0.b;
       if (b != null) {
          b.a();
       }
       return;
    }
    public static void g(Context p0){
       g.b(o.c(p0, "mipush_account", 0).edit().clear());
       m0.a = null;
       m0.f();
    }
    public static void h(Context p0,int p1){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_account", 0).edit();
       uEditor.putInt("enc_req_fail_count", p1);
       g.b(uEditor);
    }
    public static void i(Context p0,l0 p1){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_account", 0).edit();
       uEditor.putString("uuid", p1.a);
       uEditor.putString("security", p1.c);
       uEditor.putString("token", p1.b);
       uEditor.putString("app_id", p1.d);
       uEditor.putString("package_name", p1.f);
       uEditor.putString("app_token", p1.e);
       uEditor.putString("device_id", i6.s(p0));
       uEditor.putInt("env_type", p1.g);
       g.b(uEditor);
       m0.f();
    }
    public static void j(m0$a p0){
       m0.b = p0;
    }
    public static boolean k(Context p0){
       return (p0.getPackageName()).equals("com.xiaomi.xmsf");
    }
}
