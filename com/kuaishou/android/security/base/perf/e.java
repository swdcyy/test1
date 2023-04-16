package com.kuaishou.android.security.base.perf.e;
import java.util.Random;
import java.lang.Object;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.internal.common.h;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import org.json.JSONObject;
import java.lang.Boolean;
import android.content.Context;
import com.kuaishou.android.security.base.perf.e$a;
import android.os.Build$VERSION;
import java.lang.Runtime;
import java.lang.Long;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import com.kuaishou.android.security.base.perf.c;
import android.os.Process;
import com.kuaishou.android.security.base.util.j;
import java.lang.Thread;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.System;
import com.kuaishou.android.security.base.perf.b;
import android.os.Build;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.perf.i;
import android.os.SystemClock;
import java.lang.Throwable;
import org.json.JSONException;
import com.kuaishou.android.security.base.util.n;

public class e	// class@000eff
{
    public static final float K;

    static {
       e.K = new Random().nextFloat();
    }
    public void e(){
       super();
    }
    public static void a(){
    }
    public static void a(e$b p0,h p1,String p2,int p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, e.class, "4")) {
          return;
       }
       e.a(p0, p1, p2, p3, null);
       return;
    }
    public static void a(e$b p0,h p1,String p2,int p3,JSONObject p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uoe, "1")) {
             return;
          }
       }
       e.a(p0, p1, p2, p3, p4, false);
       return;
    }
    public static void a(e$b p0,h p1,String p2,int p3,JSONObject p4,boolean p5){
       object oobject = p4;
       String str = "pkgname";
       e uoe = e.class;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),oobject,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uoe, "3")) {
             return;
          }
       }
       if (p1.c() == null) {
          return;
       }else {
          JSONObject jSONObject = new JSONObject();
          if (p0.a() == e$a.c || (p0.a() == e$a.b && e.K - 0x3a83126f < 0)) {
             String str1 = "osVersion";
             try{
                jSONObject.put(str1, String.valueOf(Build$VERSION.SDK_INT));
                long l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                long l1 = Runtime.getRuntime().totalMemory();
                Object[] objArray1 = new Object[i];
                objArray1[0] = Long.valueOf(l);
                objArray1[i1] = Long.valueOf(l1);
                jSONObject.put("memInfo", String.format("use/total[%d/%d]", objArray1));
                jSONObject.put("totalMem", l1);
                jSONObject.put("usedMem", l);
                jSONObject.put("memUsage", (l / l1));
                try{
                   str1 = "did";
                   jSONObject.put(str1, b.i().h().getDid());
                   jSONObject.put("egid", b.i().h().getEgid());
                   jSONObject.put("productName", b.i().h().getProductName());
                   try{
                      str1 = "appkey";
                      jSONObject.put(str1, p1.a());
                      jSONObject.put("wbindex", p1.h());
                      jSONObject.put("initMode", p1.d().getIntValue());
                      try{
                         str1 = "feature";
                         jSONObject.put(str1, b.i().h().getWithFeature());
                         jSONObject.put("errorCode", p3);
                         str1 = "msg";
                         String str3 = (p2 == null)? "": p2;
                         jSONObject.put(str1, str3);
                         jSONObject.put("sdkversion", "5.1.1.372.8d68fa37");
                         jSONObject.put(str, p1.c().getPackageName());
                         jSONObject.put("errorTrack", c.a());
                         try{
                            str1 = "kgUniqueUUID";
                            jSONObject.put(str1, b.i().h().getKgSessionId());
                            jSONObject.put("reportTag", p0.b());
                            jSONObject.put("pid", String.valueOf(Process.myPid()));
                            try{
                               str1 = "processName";
                               jSONObject.put(str1, j.b(b.i().j().c()));
                               jSONObject.put("threadName", String.valueOf(Thread.currentThread().getName()));
                               jSONObject.put("threadId", String.valueOf(Thread.currentThread().getId()));
                               try{
                                  str1 = "kwaigUniqueUUID";
                                  String str4 = "UNKNOWN";
                                  str3 = (KSecurityTrack.getDelegateCb() == null)? str4: KSecurityTrack.getDelegateCb().getSessionId();
                                  jSONObject.put(str1, str3);
                                  str1 = "isForeground";
                                  str3 = (KSecurityTrack.getDelegateCb() == null)? str4: String.valueOf(KSecurityTrack.getDelegateCb().isAppOnForeground());
                                  jSONObject.put(str1, str3);
                                  try{
                                     str1 = "isColdStart";
                                     if (KSecurityTrack.getDelegateCb() != null) {
                                        str4 = String.valueOf(KSecurityTrack.getDelegateCb().isColdStart());
                                     }
                                     jSONObject.put(str1, str4);
                                     jSONObject.put("occurTime", System.currentTimeMillis());
                                     str1 = j.a(b.i().j().c()).b(b.v);
                                     int i2 = (j.c(str1))? 0: Integer.parseInt(str1);
                                     try{
                                        jSONObject.put("spFailTimes", i2);
                                        jSONObject.put("spFailDetail", j.a(b.i().j().c()).b(b.w));
                                        str3 = "firstRunApp";
                                        if (j.a(p1.c()).i()) {
                                           jSONObject.put(str3, i1);
                                        }else {
                                           jSONObject.put(str3, 0);
                                        }
                                        if (oobject != null) {
                                           jSONObject.put("append", oobject);
                                        }
                                        jSONObject.put("reportType", p0.a().a());
                                        jSONObject.put("retrySessionId", b.i().h().getRetrySessionId());
                                        try{
                                           String str2 = "hasRetryInit";
                                           jSONObject.put(str2, b.i().h().isHasRetryInit());
                                           JSONObject jSONObject1 = new JSONObject();
                                           jSONObject1.put("ua", System.getProperty("http.agent"));
                                           jSONObject1.put("model", Build.MODEL);
                                           try{
                                              str1 = "abi";
                                              jSONObject1.put(str1, Build.CPU_ABI+","+Build.CPU_ABI2);
                                              jSONObject1.put("board", Build.BOARD);
                                              jSONObject1.put("device", Build.DEVICE);
                                              try{
                                                 str1 = "manufacturer";
                                                 jSONObject1.put(str1, Build.MANUFACTURER);
                                                 jSONObject1.put("serial", i.a(p1.c()));
                                                 jSONObject1.put("fp", Build.FINGERPRINT);
                                                 try{
                                                    str1 = "signmd5";
                                                    j.a(p1.c());
                                                    jSONObject1.put(str1, j.c(p1.c()));
                                                    jSONObject1.put(str, p1.c().getPackageName());
                                                    jSONObject1.put("apkpath", p1.c().getPackageCodePath());
                                                    jSONObject1.put("udid", b.i().h().getNewDid());
                                                    try{
                                                       str = "apkmd5";
                                                       jSONObject1.put(str, j.a(p1.c()).c());
                                                       jSONObject1.put("channel", i.t());
                                                       jSONObject1.put("startuptime", (System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                                                       jSONObject.put("dinfo", jSONObject1);
                                                    }catch(org.json.JSONException e0){
                                                    label_0343 :
                                                       e0.printStackTrace();
                                                    }
                                                 }catch(org.json.JSONException e0){
                                                 }
                                              }catch(org.json.JSONException e0){
                                              }
                                           }catch(org.json.JSONException e0){
                                           }
                                        }catch(org.json.JSONException e0){
                                        }
                                     }catch(org.json.JSONException e0){
                                     }
                                  }catch(org.json.JSONException e0){
                                  }
                               }catch(org.json.JSONException e0){
                               }
                            }catch(org.json.JSONException e0){
                            }
                         }catch(org.json.JSONException e0){
                         }
                      }catch(org.json.JSONException e0){
                      }
                   }catch(org.json.JSONException e0){
                   }
                }catch(org.json.JSONException e0){
                }
             }catch(org.json.JSONException e0){
             }
          }
       }
    }
    public static void b(e$b p0,h p1,String p2,int p3,JSONObject p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uoe, "2")) {
             return;
          }
       }
       e.a(p0, p1, p2, p3, p4, true);
       return;
    }
}
