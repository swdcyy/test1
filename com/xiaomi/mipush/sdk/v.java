package com.xiaomi.mipush.sdk.v;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.lang.Class;
import android.content.pm.ActivityInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import android.content.pm.ResolveInfo;
import java.lang.String;
import android.content.Context;
import java.lang.Thread;
import vs8.x0;
import java.lang.Runnable;
import android.content.pm.PackageInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.v$a;
import java.lang.Boolean;
import android.content.pm.ServiceInfo;
import ys8.v;
import ws8.f7;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.lang.Throwable;
import rs8.c;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.HashSet;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import android.content.pm.PermissionInfo;
import java.util.HashMap;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.mipush.sdk.v$b;
import com.xiaomi.mipush.sdk.MessageHandleService;

public class v	// class@0010f7
{

    public static ActivityInfo a(PackageManager p0,Intent p1,Class p2){
       ResolveInfo activityInfo;
       Iterator iterator = p0.queryBroadcastReceivers(p1, 0x4000).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          activityInfo = iterator.next().activityInfo;
          if (activityInfo != null && (p2.getCanonicalName()).equals(activityInfo.name)) {
             break ;
          }
       }
       return activityInfo;
    }
    public static void b(Context p0){
       new Thread(new x0(p0)).start();
    }
    public static void c(Context p0,PackageInfo p1){
       v.l(p0, p1);
    }
    public static void d(Context p0,String p1,String p2){
       Intent intent = new Intent(p1);
       intent.setPackage(p0.getPackageName());
       Iterator iterator = p0.getPackageManager().queryBroadcastReceivers(intent, 0x4000).iterator();
       int i = 0;
       ResolveInfo resolveInfo = null;
       while (iterator.hasNext()) {
          resolveInfo = iterator.next().activityInfo;
          resolveInfo = (resolveInfo != null && (!TextUtils.isEmpty(resolveInfo.name) && (resolveInfo.name).equals(p2)))? 1: null;
          if (resolveInfo) {
             break ;
          }
       }
       if (resolveInfo != null) {
          return;
       }else {
          Object[] objArray = new Object[]{p2};
          throw new v$a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", objArray));
       }
    }
    public static void e(ActivityInfo p0,Boolean[] p1){
       Object[] objArray;
       if (p1[0].booleanValue() == p0.enabled) {
          if (p1[1].booleanValue() == p0.exported) {
             return;
          }
          objArray = new Object[]{p0.name,p1[1]};
          throw new v$a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", objArray));
       }else {
          objArray = new Object[]{p0.name,p1[0]};
          throw new v$a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", objArray));
       }
    }
    public static boolean f(PackageInfo p0,String[] p1){
       p0 = p0.services;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (v.g(p1, p0[i].name)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean g(String[] p0,String p1){
       if (p0 != null && p1 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             if (TextUtils.equals(p0[i], p1)) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static void h(Context p0){
       v.j(p0);
    }
    public static void i(Context p0,PackageInfo p1){
       v.k(p0, p1);
    }
    public static void j(Context p0){
       Boolean[] uBooleanArra;
       String str = "com.xiaomi.push.service.receivers.PingReceiver";
       PackageManager packageManag = p0.getPackageManager();
       String packageName = p0.getPackageName();
       Intent intent = new Intent(v.p);
       intent.setPackage(packageName);
       try{
          int i = 0;
          ActivityInfo uActivityInf = v.a(packageManag, intent, f7.c(p0, str));
          int i1 = 2;
          if (!MiPushClient.shouldUseMIUIPush(p0)) {
             if (uActivityInf != null) {
                uBooleanArra = new Boolean[i1];
                uBooleanArra[i] = Boolean.TRUE;
                uBooleanArra[1] = Boolean.FALSE;
                v.e(uActivityInf, uBooleanArra);
             }else {
                Object[] objArray = new Object[1];
                objArray[i] = str;
                throw new v$a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", objArray));
             }
          }else if(uActivityInf != null){
             uBooleanArra = new Boolean[i1];
             uBooleanArra[i] = Boolean.TRUE;
             uBooleanArra[1] = Boolean.FALSE;
             v.e(uActivityInf, uBooleanArra);
          }
       }catch(java.lang.ClassNotFoundException e0){
          c.o(e0);
       }
       Intent intent1 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
       intent1.setPackage(packageName);
       Iterator iterator = packageManag.queryBroadcastReceivers(intent1, 0x4000).iterator();
       ActivityInfo uActivityInf1 = null;
       while (iterator.hasNext()) {
          try{
             ResolveInfo activityInfo = iterator.next().activityInfo;
             uActivityInf1 = (activityInfo != null && (!TextUtils.isEmpty(activityInfo.name) && (PushMessageReceiver.class.isAssignableFrom(f7.c(p0, activityInfo.name)) && activityInfo.enabled != null)))? 1: null;
             if (uActivityInf1) {
                break ;
             }
          }catch(java.lang.ClassNotFoundException e2){
             c.o(e2);
             goto label_006e ;
          }
       }
       if (uActivityInf1 != null) {
          if (MiPushClient.getOpenHmsPush(p0)) {
             v.d(p0, "com.huawei.android.push.intent.RECEIVE", "com.xiaomi.assemble.control.HmsPushReceiver");
             v.d(p0, "com.huawei.intent.action.PUSH", "com.huawei.hms.support.api.push.PushEventReceiver");
          }
          if (MiPushClient.getOpenVIVOPush(p0)) {
             v.d(p0, "com.vivo.pushclient.action.RECEIVE", "com.xiaomi.assemble.control.FTOSPushMessageReceiver");
          }
          return;
       }else {
          throw new v$a("Receiver: none of the subclasses of PushMessageReceiver is enabled or defined.");
       }
    }
    public static void k(Context p0,PackageInfo p1){
       int i1;
       HashSet hashSet = new HashSet();
       String str = p0.getPackageName()+".permission.MIPUSH_RECEIVE";
       String[] stringArray = new String[]{"android.permission.INTERNET","android.permission.ACCESS_NETWORK_STATE",str,"android.permission.ACCESS_WIFI_STATE","android.permission.VIBRATE"};
       hashSet.addAll(Arrays.asList(stringArray));
       PackageInfo permissions = p1.permissions;
       if (permissions != null) {
          int len = permissions.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (str.equals(permissions[i].name)) {
                   permissions = 1;
                label_0053 :
                   if (permissions) {
                      PackageInfo requestedPer = p1.requestedPermissions;
                      if (requestedPer != null) {
                         int len1 = requestedPer.length;
                         i1 = 0;
                         while (i1 < len1) {
                            object oobject = requestedPer[i1];
                            if (!TextUtils.isEmpty(oobject) && hashSet.contains(oobject)) {
                               hashSet.remove(oobject);
                               if (!hashSet.isEmpty()) {
                               }
                            }
                            i1 = i1 + 1;
                         }
                      }
                      if (hashSet.isEmpty()) {
                         break ;
                      }else {
                         Object[] objArray = new Object[]{hashSet.iterator().next()};
                         throw new v$a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", objArray));
                      }
                   }else {
                      Object[] objArray1 = new Object[]{str};
                      throw new v$a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", objArray1));
                   }
                }else {
                   i = i + 1;
                }
             }
          }
          return;
       }
       i1 = 0;
       goto label_0053 ;
    }
    public static void l(Context p0,PackageInfo p1){
       object oobject;
       v$b b;
       Object[] objArray;
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       String str = "";
       hashMap1.put(PushMessageHandler.class.getCanonicalName(), new v$b(PushMessageHandler.class.getCanonicalName(), true, true, str));
       hashMap1.put(MessageHandleService.class.getCanonicalName(), new v$b(MessageHandleService.class.getCanonicalName(), true, false, str));
       if (MiPushClient.shouldUseMIUIPush(p0)) {
          String[] stringArray = new String[]{"com.xiaomi.push.service.XMJobService","com.xiaomi.push.service.XMPushService"};
          if (!v.f(p1, stringArray)) {
          label_005c :
             if (MiPushClient.getOpenFCMPush(p0)) {
                hashMap1.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new v$b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, str));
                String str1 = "com.xiaomi.assemble.control.MiFirebaseMessagingService";
                hashMap1.put(str1, new v$b(str1, true, false, str));
             }
             if (MiPushClient.getOpenOPPOPush(p0)) {
                String str2 = "com.xiaomi.assemble.control.COSPushMessageService";
                hashMap1.put(str2, new v$b(str2, true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
             }
             PackageInfo services = p1.services;
             int i = 2;
             if (services != null) {
                int len = services.length;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      oobject = services[i1];
                      if (!TextUtils.isEmpty(oobject.name) && hashMap1.containsKey(oobject.name)) {
                         v$b uob = hashMap1.remove(oobject.name);
                         b = uob.b;
                         v$b c = uob.c;
                         uob = uob.d;
                         if (b == oobject.enabled) {
                            if (c == oobject.exported) {
                               if (TextUtils.isEmpty(uob) || TextUtils.equals(uob, oobject.permission)) {
                                  hashMap.put(oobject.name, oobject.processName);
                                  if (!hashMap1.isEmpty()) {
                                  }
                               }else {
                                  objArray = new Object[i];
                                  objArray[0] = oobject.name;
                                  objArray[1] = uob;
                                  throw new v$a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", objArray));
                               }
                            }else {
                               objArray = new Object[i];
                               objArray[0] = oobject.name;
                               objArray[1] = Boolean.valueOf(c);
                               throw new v$a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", objArray));
                            }
                         }else {
                            break ;
                         }
                      }else {
                      }
                   }
                }
                objArray = new Object[i];
                objArray[0] = oobject.name;
                objArray[1] = Boolean.valueOf(b);
                throw new v$a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", objArray));
             }
          label_011e :
             if (hashMap1.isEmpty()) {
                if (TextUtils.equals(hashMap.get(PushMessageHandler.class.getCanonicalName()), hashMap.get(MessageHandleService.class.getCanonicalName()))) {
                   if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && (!hashMap.containsKey("com.xiaomi.push.service.XMPushService") || TextUtils.equals(hashMap.get("com.xiaomi.push.service.XMJobService"), hashMap.get("com.xiaomi.push.service.XMPushService")))) {
                      return;
                   }else {
                      objArray = new Object[i];
                      objArray[0] = "com.xiaomi.push.service.XMJobService";
                      objArray[1] = "com.xiaomi.push.service.XMPushService";
                      throw new v$a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", objArray));
                   }
                }else {
                   objArray = new Object[i];
                   objArray[0] = PushMessageHandler.class.getCanonicalName();
                   objArray[1] = MessageHandleService.class.getCanonicalName();
                   throw new v$a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", objArray));
                }
             }else {
                objArray = new Object[true];
                objArray[0] = hashMap1.keySet().iterator().next();
                throw new v$a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", objArray));
             }
          }
       }
       hashMap1.put("com.xiaomi.push.service.XMJobService", new v$b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
       hashMap1.put("com.xiaomi.push.service.XMPushService", new v$b("com.xiaomi.push.service.XMPushService", true, false, str));
       goto label_005c ;
    }
}
