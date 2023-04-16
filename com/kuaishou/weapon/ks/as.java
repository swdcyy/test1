package com.kuaishou.weapon.ks.as;
import java.lang.Object;
import org.json.JSONObject;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.weapon.ks.ca;
import com.kuaishou.weapon.ks.g;
import java.lang.reflect.Proxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.os.Build$VERSION;

public class as	// class@0011d0
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public void as(){
       super();
       this.b = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy";
       this.c = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl";
       this.d = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==";
       this.e = "SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=";
    }
    public JSONObject a(){
       try{
          JSONObject jSONObject = new JSONObject();
          this.a(jSONObject, 0);
          this.b(jSONObject, 1);
          this.c(jSONObject, 2);
          this.d(jSONObject, 3);
          if (jSONObject.length() > 0) {
             return jSONObject;
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public JSONObject a(Context p0){
       try{
          JSONObject jSONObject = new JSONObject();
          PackageManager packageManag = p0.getPackageManager();
          packageManag = ca.a(packageManag.getClass(), packageManag, "mPM");
          if (packageManag != null && this.a(packageManag, jSONObject, 0)) {
             return jSONObject;
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(JSONObject p0,int p1){
       try{
          Object[] objArray = new Object[0];
          Object obj = ca.a(new String(g.a(("YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=").getBytes(), 2)), null, "getPackageManager", objArray);
          if (obj != null) {
             this.a(obj, p0, p1);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean a(Object p0,JSONObject p1,int p2){
       String str;
       StringBuilder str1;
       if (p1 == null) {
          return e0;
       }
       try{
          boolean b = Proxy.isProxyClass(p0.getClass());
          p0 = p0.getClass().getName();
          int i = 1;
          if (b) {
             str = p2;
             if (!b) {
                i = 0;
             }
             p1.put(str, i);
             str1 = p2+"-c";
          }else if(p2 == 3 && !p0.contains("Instrumentation")){
             str = p2;
             if (!b) {
                i = 0;
             }
             p1.put(str, i);
             str1 = p2+"-c";
          }else {
          label_0076 :
             return b;
          }
          p1.put(str1, p0);
          goto label_0076 ;
       }catch(java.lang.Exception e0){
       }
    }
    public final void b(JSONObject p0,int p1){
       try{
          String str = new String(g.a(("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy").getBytes(), 2));
          String str1 = new String(g.a(("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl").getBytes(), 2));
          Object obj = (Build$VERSION.SDK_INT >= 26)? ca.a(str, "IActivityManagerSingleton"): ca.a(str1, "gDefault");
          if (obj != null) {
             Object[] objArray = new Object[0];
             obj = ca.a("android.util.Singleton", obj, "get", objArray);
             if (obj != null) {
                this.a(obj, p0, p1);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void c(JSONObject p0,int p1){
       try{
          if (Build$VERSION.SDK_INT < 29) {
             return;
          }
          Object obj = ca.a(new String(g.a(("YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==").getBytes(), 2)), new String(g.a(("SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=").getBytes(), 2)));
          if (obj != null) {
             Object[] objArray = new Object[0];
             obj = ca.a("android.util.Singleton", obj, "get", objArray);
             if (obj != null) {
                this.a(obj, p0, p1);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void d(JSONObject p0,int p1){
       try{
          Object[] objArray = new Object[0];
          Object obj = ca.a(new String(g.a(("YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=").getBytes(), 2)), null, "currentActivityThread", objArray);
          if (obj != null) {
             obj = ca.a(obj.getClass(), obj, "mInstrumentation");
             if (obj != null) {
                this.a(obj, p0, p1);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
