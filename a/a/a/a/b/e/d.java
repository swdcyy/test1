package a.a.a.a.b.e.d;
import java.util.Random;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.lang.System;
import java.lang.Long;
import a.a.a.a.b.e.d$b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import org.json.JSONObject;
import android.content.Context;
import a.a.a.a.b.e.d$a;
import android.os.Build$VERSION;
import java.lang.Runtime;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import android.os.Process;
import java.lang.Thread;
import k.b;
import android.os.Build;
import java.lang.StringBuilder;
import a.a.a.a.b.a.b;
import android.os.SystemClock;
import java.lang.Throwable;
import org.json.JSONException;
import k.c;

public class d	// class@000019
{
    public static String a = "";
    public static final float b;

    static {
       d.b = new Random().nextFloat();
    }
    public static String a(){
       if (TextUtils.isEmpty(d.a)) {
          Object[] objArray = new Object[]{Long.valueOf(System.currentTimeMillis()),Long.valueOf(new Random().nextLong()),Long.valueOf(new Random().nextLong())};
          d.a = String.format("%d-%d-%d", objArray);
       }
       return d.a;
    }
    public static void b(d$b p0,InitCommonKSTEParams p1,String p2,int p3){
       d.c(p0, p1, p2, p3, null);
    }
    public static void c(d$b p0,InitCommonKSTEParams p1,String p2,int p3,JSONObject p4){
       c uoc;
       String str = "reportType";
       if (p1.context() == null) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       if (p0.a() == d$a.c || (p0.a() == d$a.b && d.b - 0x3a83126f < 0)) {
          String str1 = "osVersion";
          try{
             jSONObject.put(str1, String.valueOf(Build$VERSION.SDK_INT));
             Object[] objArray = new Object[]{Long.valueOf((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())),Long.valueOf(Runtime.getRuntime().totalMemory())};
             jSONObject.put("memInfo", String.format("use/total[%d/%d]", objArray));
             jSONObject.put("did", p1.did());
             try{
                str1 = "productName";
                jSONObject.put(str1, p1.appKPN());
                jSONObject.put("appkey", p1.appkey());
                jSONObject.put("initMode", p1.initMode().getIntValue());
                jSONObject.put("errorCode", p3);
                String str2 = "msg";
                if (p2 == null) {
                   p2 = "";
                }
                try{
                   jSONObject.put(str2, p2);
                   jSONObject.put("sdkversion", "1.0.0.107.3722af76");
                   jSONObject.put("pkgname", p1.context().getPackageName());
                   jSONObject.put("kgUniqueUUID", d.a());
                   jSONObject.put("reportTag", p0.b());
                   try{
                      p2 = "pid";
                      jSONObject.put(p2, String.valueOf(Process.myPid()));
                      jSONObject.put("threadName", String.valueOf(Thread.currentThread().getName()));
                      jSONObject.put("threadId", String.valueOf(Thread.currentThread().getId()));
                      try{
                         p2 = "occurTime";
                         jSONObject.put(p2, System.currentTimeMillis());
                         jSONObject.put("firstRunApp", b.c(p1.context()).g());
                         jSONObject.put(str, p0.a().a());
                         jSONObject.put("nettype", m$f.a(p1.context()));
                         try{
                            p2 = "netavail";
                            jSONObject.put(p2, m$f.g(p1.context()));
                            jSONObject.put(str, p0.a().a());
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("ua", System.getProperty("http.agent"));
                            jSONObject1.put("model", Build.MODEL);
                            try{
                               str2 = "abi";
                               jSONObject1.put(str2, Build.CPU_ABI+","+Build.CPU_ABI2);
                               jSONObject1.put("board", Build.BOARD);
                               jSONObject1.put("device", Build.DEVICE);
                               try{
                                  str2 = "manufacturer";
                                  jSONObject1.put(str2, Build.MANUFACTURER);
                                  jSONObject1.put("fp", Build.FINGERPRINT);
                                  b.c(p1.context());
                                  jSONObject1.put("signmd5", b.d(p1.context()));
                                  jSONObject1.put("pkgname", p1.context().getPackageName());
                                  try{
                                     str2 = "apkpath";
                                     jSONObject1.put(str2, p1.context().getPackageCodePath());
                                     jSONObject1.put("udid", b.b().n());
                                     jSONObject1.put("apkmd5", b.c(p1.context()).a());
                                     jSONObject1.put("startuptime", (System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                                     jSONObject.put("dinfo", jSONObject1);
                                  }catch(org.json.JSONException e12){
                                  label_01ef :
                                     e12.printStackTrace();
                                  }
                               }catch(org.json.JSONException e12){
                               }
                            }catch(org.json.JSONException e12){
                            }
                         }catch(org.json.JSONException e12){
                         }
                      }catch(org.json.JSONException e12){
                      }
                   }catch(org.json.JSONException e12){
                   }
                }catch(org.json.JSONException e12){
                }
             }catch(org.json.JSONException e12){
             }
          }catch(org.json.JSONException e12){
          }
       }
    }
}
