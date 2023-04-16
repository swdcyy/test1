package com.kuaishou.weapon.ks.ai;
import java.util.HashSet;
import java.lang.Object;
import java.util.ArrayList;
import org.json.JSONObject;
import java.lang.String;
import com.kuaishou.weapon.ks.m;
import java.util.List;
import java.lang.CharSequence;
import android.content.Context;
import org.json.JSONArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import android.text.TextUtils;
import java.util.Set;
import android.util.Base64;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.lang.StringBuilder;

public class ai	// class@0011c5
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List g;
    public JSONObject h;
    public JSONObject i;
    public JSONObject j;
    public Set k;
    public Set l;
    public Set m;
    public Set n;
    public JSONObject p;
    public JSONObject q;
    public JSONObject r;
    public static Set o;

    static {
       ai.o = new HashSet();
    }
    public void ai(){
       super();
       this.g = new ArrayList();
       this.h = new JSONObject();
       this.i = new JSONObject();
       this.j = new JSONObject();
       this.k = new HashSet();
       this.l = new HashSet();
       this.m = new HashSet();
       this.n = new HashSet();
       this.p = new JSONObject();
       this.q = new JSONObject();
       this.r = new JSONObject();
       this.a = m.a("fc03e7a44510", "0820");
       this.b = m.a("b312fce45016f7fc27d1", "0820");
       this.c = m.a("f118f1ec4416f4b333df58d57b2e484ec84ec4", "0820");
       this.d = m.a("f118f1ec4416f4b333df58d57b2e4d48c84ec4", "0820");
       this.e = m.a("f118f1f9590be7b735d5", "0820");
       this.f = m.a("f118f1f85320e3b726c859c0302911", "0820");
       this.g.add(m.a("f118f1f9431de3a626df48d7302911", "0820"));
       this.g.add(m.a("f118f1ef4616f3fc27d1", "0820"));
       this.g.add(m.a("f118f1e84f0bf5ba3bd1579c6d35", "0820"));
       this.g.add(m.a("f118f1fd5e1efcb77acd53", "0820"));
       this.g.add(m.a("f118f1f95711f4ba3bd1579c6d35", "0820"));
       this.g.add(m.a("f118f1f2460dffbd20dd53c07b740d15", "0820"));
    }
    public int a(String p0){
       int i = 0;
       while (true) {
          boolean b = -1;
          break ;
       }
       try{
          if (i >= this.g.size()) {
             return b;
          }
          if (p0.contains(this.g.get(i))) {
             return i;
          }
          i = i + 1;
       }catch(java.lang.Exception e0){
       }
    }
    public JSONArray a(Context p0){
       ai tk;
       BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/self/maps"));
       HashSet hashSet = new HashSet();
       HashSet hashSet1 = new HashSet();
       hashSet1.add("/system/fr");
       hashSet1.add("/system/em");
       hashSet1.add("/apex/com.");
       hashSet1.add("/data/dalv");
       hashSet1.add("/system/li");
       hashSet1.add("/vendor/li");
       hashSet1.add("/system/ve");
       String packageName = p0.getPackageName();
       if (TextUtils.isEmpty(packageName)) {
          try{
             uBufferedRea.close();
             return null;
          }catch(java.io.IOException e0){
          }
       }else {
          this.k.clear();
          this.l.clear();
          this.m.clear();
          this.n.clear();
          while (true) {
             String str = uBufferedRea.readLine();
             if (str != null) {
                int i = 1;
                int i1 = 0;
                int b = (!str.endsWith(".apk") && (!str.endsWith(".jar") && (!str.endsWith(".dex") && (str.endsWith(".odex") || str.endsWith(".so")))))? true: false;
                if (b && (!str.contains("gson.jar") && (str.contains("volley.jar") || str.contains("FwkPlugin")))) {
                   continue ;
                }else if(str.endsWith(".apk") && !str.contains(new String(Base64.decode("L3N5c3RlbS9mcmFtZXdvcmsvZnJhbWV3b3JrLXJlcy5hcGs=", i1)))){
                   String[] stringArray = str.split(" ");
                   if (stringArray != null && stringArray.length > 0) {
                      int i2 = stringArray.length - i;
                      object oobject = stringArray[i2];
                      if (!TextUtils.isEmpty(oobject) && !oobject.contains(p0.getPackageName())) {
                         ai.o.add(oobject);
                      }
                   }
                }
                b = str.indexOf(47);
                if (b < 0) {
                   continue ;
                }else {
                   str = str.substring(b);
                   if (this.a(str) >= 0) {
                      tk = this.k;
                      tk.add(str);
                   }else if(str.contains("/frida-agent-")){
                      this.i.put("frida-agent", str);
                   }
                   if (str.startsWith("/data/local/tmp")) {
                      ai tj = this.j;
                      if (!new File(str).exists()) {
                         i = 0;
                      }
                      tj.put(str, i);
                   }
                   try{
                      if (str.contains(this.c) || str.contains(this.d)) {
                         this.p.put("frida-manager", str);
                      }else if(str.contains(this.f)){
                         this.r.put("inspect", str);
                      }else if(str.contains(this.e)){
                         this.q.put("tweak", str);
                      }else if(str.contains(this.b) && str.startsWith("/data")){
                         File uFile = new File(str);
                         if (uFile.exists()) {
                            this.h.put(str, uFile.length());
                         }
                      }
                      if (str.contains(this.a) && (!str.contains("libart.so") && !str.contains("libart64.so"))) {
                         this.n.add(str);
                      }
                   label_01a9 :
                      if (!str.contains("es/.0/") && (str.contains("app_DvaPlugin") || (str.contains("/system_ext/") || (str.contains(packageName) && (!str.contains("odex_cache") && !str.contains("app_")))))) {
                         continue ;
                      }else {
                         i = 10;
                         String str1 = (str.length() > i)? str.substring(i1, i): str;
                         if (!str.contains("FeatureFramework") && (str.contains("GmsConfigOverlay") || (!str.contains("/system/app/") && (str.contains("/system/vendor/lib/") || (str.contains("/hw_") || str.contains("/system/product/lib")))))) {
                            continue ;
                         }else if(str.contains("mokee-") || str.contains("mokee.")){
                            tk = this.l;
                         }else if(!str.contains("lineageos-") && (!str.contains("lineageos.") && (str.contains("Hook") || str.contains("hook")))){
                            tk = this.m;
                         }else if(!str.contains("posedBridge") && hashSet1.contains(str1)){
                            continue ;
                         }else {
                            hashSet.add(str);
                            if (hashSet.size() <= 15 && (this.k.size() <= i && (this.l.size() > i || this.m.size() > i))) {
                            label_028d :
                               if (hashSet.size() > 0) {
                                  try{
                                     JSONArray jSONArray = new JSONArray(hashSet);
                                     uBufferedRea.close();
                                     return jSONArray;
                                  }catch(java.io.IOException e0){
                                  }
                               }else {
                                  try{
                                     uBufferedRea.close();
                                     break ;
                                  }catch(java.io.IOException e0){
                                     break ;
                                  }
                               }
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }else {
                goto label_028d ;
             }
          }
          return null;
       }
    }
    public JSONObject a(){
       if (this.h.length() > 0) {
          return this.h;
       }
       return null;
    }
    public JSONObject b(){
       try{
          ai tk = this.k;
          if (tk != null && tk.size() > 0) {
             JSONObject jSONObject = new JSONObject();
             Iterator iterator = this.k.iterator();
             while (iterator.hasNext()) {
                int i = this.a(iterator.next());
                if (i >= 0) {
                   jSONObject.put(i, 1);
                }
             }
             if (jSONObject.length() > 0) {
                return jSONObject;
             }
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public Set c(){
       try{
          HashSet hashSet = new HashSet();
          ai tk = this.k;
          if (tk != null && tk.size() > 0) {
             Iterator iterator = this.k.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (str.endsWith("dex")) {
                   hashSet.add(str);
                }
                if (hashSet.size() > 5) {
                   break ;
                }
             }
             if (hashSet.size() > 0) {
                return hashSet;
             }
          }
       label_003a :
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public JSONObject d(){
       ai ti = this.i;
       if (ti != null && ti.length() > 0) {
          return this.i;
       }
       return null;
    }
    public JSONObject e(){
       ai tj = this.j;
       if (tj != null && tj.length() > 0) {
          return this.j;
       }
       return null;
    }
}
