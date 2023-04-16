package com.vivo.push.util.z;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import com.vivo.push.util.t;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.p;
import java.lang.Object;
import java.lang.Long;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.Map;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import java.lang.reflect.Field;
import android.content.Intent;
import java.lang.StringBuilder;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import com.vivo.push.util.VivoPushException;
import android.content.pm.ServiceInfo;
import android.content.pm.ComponentInfo;
import java.lang.reflect.Method;
import android.content.pm.PackageInfo;
import java.util.Arrays;
import android.content.ContentResolver;
import com.vivo.push.p;
import android.net.Uri;
import android.database.Cursor;
import java.lang.Boolean;
import java.security.PublicKey;
import com.vivo.push.util.u;

public final class z	// class@0010c8
{
    public static String[] a;
    public static String[] b;
    public static String[] c;
    public static String[] d;
    public static String[] e;
    public static Map f;

    static {
       String[] stringArray = new String[]{"com.vivo.push.sdk.RegistrationReceiver","com.vivo.push.sdk.service.PushService","com.vivo.push.sdk.service.CommonJobService"};
       z.a = stringArray;
       stringArray = new String[]{"android.permission.INTERNET","android.permission.READ_PHONE_STATE","android.permission.ACCESS_NETWORK_STATE","android.permission.WRITE_SETTINGS","android.permission.VIBRATE","android.permission.WRITE_EXTERNAL_STORAGE","android.permission.ACCESS_WIFI_STATE","android.permission.WAKE_LOCK","android.permission.GET_ACCOUNTS","com.bbk.account.permission.READ_ACCOUNTINFO","android.permission.AUTHENTICATE_ACCOUNTS","android.permission.MOUNT_UNMOUNT_FILESYSTEMS","android.permission.GET_TASKS"};
       z.b = stringArray;
       stringArray = new String[]{"com.vivo.push.sdk.service.CommandService","com.vivo.push.sdk.service.CommonJobService"};
       z.c = stringArray;
       String[] stringArray1 = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
       z.d = stringArray1;
       stringArray1 = new String[0];
       z.e = stringArray1;
       z.f = new ConcurrentHashMap();
    }
    public static long a(Context p0){
       String str = t.b(p0);
       if (!TextUtils.isEmpty(str)) {
          return z.a(p0, str);
       }
       p.a("Utility", "systemPushPkgName is null");
       return -1;
    }
    public static long a(Context p0,String p1){
       Object obj = z.a(p0, p1, "com.vivo.push.sdk_version");
       if (obj == null) {
          obj = z.a(p0, p1, "sdk_version");
       }
       long l = -1;
       if (obj != null) {
          try{
             return Long.parseLong(obj.toString());
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             p.a(v1, "getSdkVersionCode error ", e0);
             return l;
          }
       }else {
          p.a("Utility", "getSdkVersionCode sdk version is null");
          return l;
       }
    }
    public static Object a(Context p0,String p1,String p2){
       Object obj;
       int i;
       ApplicationInfo uApplication = null;
       if (p0 != null && (p2 == null || TextUtils.isEmpty(p1))) {
          return uApplication;
       }
       try{
          Map f = z.f;
          if (f != null && f.size() > 0) {
             Bundle uBundle = z.f.get(p1);
             if (uBundle != null) {
                obj = uBundle.get(p2);
             label_0026 :
                if (obj != null) {
                   return obj;
                }else {
                   try{
                      ApplicationInfo applicationI = p0.getPackageManager().getApplicationInfo(p1, 128);
                      if (applicationI != null) {
                         uApplication = applicationI.metaData;
                      }
                      applicationI = (uApplication != null)? uApplication.get(p2): obj;
                      try{
                         if (z.f.size() <= 300) {
                            z.f.put(p1, uApplication);
                         }
                      }catch(java.lang.Exception e4){
                         i = applicationI;
                         applicationI = e4;
                      }
                   }catch(java.lang.Exception e3){
                      i = obj;
                   }
                }
             }else {
             label_0025 :
                obj = uApplication;
                goto label_0026 ;
             }
          }else {
             goto label_0025 ;
          }
       }catch(java.lang.Exception e3){
       }
       return p0;
    }
    public static Object a(String p0,String p1){
       Class uClass = Class.forName(p0);
       return uClass.getField(p1).get(uClass);
    }
    public static void a(Context p0,Intent p1){
       String str = t.b(p0);
       String stringExtra = p1.getStringExtra("client_pkgname");
       if (TextUtils.isEmpty(str)) {
          p.a("Utility", "illegality abe adapter : push pkg is null");
          return;
       }else if(TextUtils.isEmpty(stringExtra)){
          p.a("Utility", "illegality abe adapter : src pkg is null");
          return;
       }else if(str.equals(p0.getPackageName())){
          p.a("Utility", "illegality abe adapter : abe is not pushservice");
          return;
       }else if(!str.equals(stringExtra)){
          p.d("Utility", "proxy to core : intent pkg : "+p1.getPackage()+" ; src pkg : "+stringExtra+" ; push pkg : "+str);
          p1.setPackage(str);
          p1.setClassName(str, "com.vivo.push.sdk.service.PushService");
          a.e(p0, p1);
          return;
       }else {
          p.a("Utility", "illegality abe adapter : pushPkg = "+str+" ; srcPkg = "+stringExtra);
          return;
       }
    }
    public static void a(Context p0,String p1,String p2,boolean p3){
       List list;
       Iterator iterator;
       Intent intent = new Intent(p1);
       p1 = p0.getPackageName();
       try{
          intent.setPackage(p1);
          PackageManager packageManag = p0.getPackageManager();
          if (packageManag == null) {
             throw new VivoPushException("localPackageManager is null");
          }
          p1 = " is missing";
          if (p3) {
             list = packageManag.queryBroadcastReceivers(intent, 576);
             if (list == null || list.size() <= 0) {
                throw new VivoPushException("checkModule "+intent+" has no receivers");
             }
             iterator = list.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   throw new VivoPushException(p2+p1);
                }
                if (p2.equals(iterator.next().activityInfo.name)) {
                   break ;
                }
             }
             return;
          }else {
             list = packageManag.queryIntentServices(intent, 576);
             if (list == null || list.size() <= 0) {
                throw new VivoPushException("checkModule "+intent+" has no services");
             }
             iterator = list.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   throw new VivoPushException(p2+p1);
                }
                ResolveInfo resolveInfo = iterator.next();
                if (p2.equals(resolveInfo.serviceInfo.name)) {
                   if (resolveInfo.serviceInfo.exported == null) {
                      throw new VivoPushException(resolveInfo.serviceInfo.name+" exported is false");
                   }
                   break ;
                }
             }
             return;
          }
       }catch(java.lang.Exception e3){
          p.a("Utility", "error  "+e3.getMessage());
          throw new VivoPushException("checkModule error"+e3.getMessage());
       }
    }
    public static void a(ComponentInfo p0,String p1){
       if ((p0.applicationInfo.packageName).equals(p1)) {
          return;
       }
       String[] a = z.a;
       int len = a.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          if (!(a[i]).equals(p0.name) || (p0.processName).contains(":pushservice")) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new VivoPushException("module : "+p0.name+" process :"+p0.processName+"  check process fail");
    }
    public static void a(String p0,ComponentInfo[] p1,String p2){
       object oobject;
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new VivoPushException(p0+" module Push-SDK need is not exist");
          }
          oobject = p1[i];
          if (p0.equals(oobject.name)) {
             if (oobject.enabled == null) {
                throw new VivoPushException(oobject.name+" module Push-SDK need is illegitmacy !");
             }
             break ;
          }else {
             i = i + 1;
          }
       }
       z.a(oobject, p2);
       return;
    }
    public static String b(Context p0,String p1){
       Object obj = z.a(p0, p1, "com.vivo.push.app_id");
       if (obj != null) {
          return obj.toString();
       }
       p0 = z.a(p0, p1, "app_id");
       if (p0 != null) {
          return p0.toString();
       }
       return "";
    }
    public static String b(String p0,String p1){
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          p0 = Class.forName("android.os.SystemProperties").getMethod("get", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
          p0 = p1;
       }
       if (p0 != null && p0.length()) {
          p1 = p0;
       }
       return p1;
    }
    public static void b(Context p0){
       String[] stringArray1;
       String obj;
       Context uContext = p0;
       p.d("Utility", "check PushService AndroidManifest declearation !");
       String str = t.b(p0);
       boolean b = t.d(uContext, p0.getPackageName());
       boolean b1 = t.e(uContext, p0.getPackageName());
       boolean b2 = t.c(uContext, p0.getPackageName());
       String str1 = "com.vivo.push.sdk.service.CommandService";
       if (b1) {
          String[] stringArray = new String[]{"com.vivo.push.sdk.RegistrationReceiver","com.vivo.push.sdk.service.PushService","com.vivo.push.sdk.service.CommonJobService"};
          z.a = stringArray;
          stringArray = new String[]{"android.permission.INTERNET","android.permission.READ_PHONE_STATE","android.permission.ACCESS_NETWORK_STATE","android.permission.WRITE_SETTINGS","android.permission.VIBRATE","android.permission.WRITE_EXTERNAL_STORAGE","android.permission.ACCESS_WIFI_STATE","android.permission.WAKE_LOCK","android.permission.GET_ACCOUNTS","com.bbk.account.permission.READ_ACCOUNTINFO","android.permission.AUTHENTICATE_ACCOUNTS","android.permission.MOUNT_UNMOUNT_FILESYSTEMS","android.permission.GET_TASKS"};
          z.b = stringArray;
          stringArray1 = new String[]{str1,"com.vivo.push.sdk.service.CommonJobService"};
          z.c = stringArray1;
          stringArray1 = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
          z.d = stringArray1;
       }else if(b2 || b){
          if (b2) {
             stringArray1 = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
             z.c = stringArray1;
          }else {
             stringArray1 = new String[]{str1};
             z.c = stringArray1;
          }
          stringArray1 = new String[false];
          z.d = stringArray1;
          stringArray1 = new String[false];
          z.a = stringArray1;
          obj = "android.permission.INTERNET";
          if (b) {
             stringArray1 = new String[]{obj,"android.permission.WRITE_SETTINGS"};
             z.b = stringArray1;
          }else {
             stringArray1 = new String[]{obj};
             z.b = stringArray1;
          }
       }else {
          throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
       }
       try{
          PackageManager packageManag = p0.getPackageManager();
          if (packageManag != null) {
             PackageInfo requestedPer = packageManag.getPackageInfo(p0.getPackageName(), 4096).requestedPermissions;
             if (requestedPer != null) {
                String[] b3 = z.b;
                int len = b3.length;
                int i = 0;
                while (true) {
                   if (i < len) {
                      object oobject = b3[i];
                      int len1 = requestedPer.length;
                      int i1 = 0;
                      while (true) {
                         if (i1 >= len1) {
                            throw new VivoPushException("permission : "+oobject+"  check fail : "+Arrays.toString(requestedPer));
                         }
                         if (!oobject.equals(requestedPer[i1])) {
                            i1 = i1 + 1;
                         }else {
                            i = i + 1;
                         }
                      }
                   }else {
                      z.f(uContext, str);
                      z.d(uContext, str);
                      z.e(uContext, str);
                      try{
                         str = "local_iv";
                         if (z.a(uContext, p0.getPackageName(), str) != null) {
                            str = p0.getPackageName();
                            obj = z.a(uContext, str, "com.vivo.push.api_key");
                            if (obj != null) {
                               str = obj.toString();
                            }else {
                               Object obj1 = z.a(uContext, str, "api_key");
                               str = (obj1 != null)? obj1.toString(): "";
                            }
                            if (!TextUtils.isEmpty(str)) {
                               if (!TextUtils.isEmpty(z.b(uContext, p0.getPackageName()))) {
                                  if (b || (!b1 || z.a(uContext, p0.getPackageName()) - -1)) {
                                     if (b1) {
                                        z.a(uContext, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
                                        z.a(uContext, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
                                        break ;
                                     }
                                     break ;
                                  }else {
                                     throw new VivoPushException("sdkversion is null");
                                  }
                               }else {
                                  throw new VivoPushException("com.vivo.push.app_id is null");
                               }
                            }else {
                               throw new VivoPushException("com.vivo.push.api_key is null");
                            }
                         }else {
                            throw new VivoPushException(("AndroidManifest.xml中未配置").concat(str));
                         }
                      }catch(java.lang.Exception e0){
                         throw new VivoPushException("getMetaValue error "+e0.getMessage());
                      }
                   }
                }
                return;
             }else {
                throw new VivoPushException("Permissions is null!");
             }
          }else {
             throw new VivoPushException("localPackageManager is null");
          }
       }catch(java.lang.Exception e0){
          throw new VivoPushException(e0.getMessage());
       }
    }
    public static boolean b(Context p0,String p1,String p2){
       try{
          if (p0 == null) {
             p.a("Utility", "context is null");
             return false;
          }else {
             String[] stringArray = new String[]{p1,p2,"323"};
             Cursor uCursor = p0.getContentResolver().query(p.c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", stringArray, null);
             if (uCursor == null) {
                p.a("Utility", "cursor is null");
                if (uCursor != null) {
                   try{
                      uCursor.close();
                   }catch(java.lang.Exception e10){
                      p.a("Utility", "close", e10);
                   }
                }
             }else if(uCursor.moveToFirst()){
                boolean b = Boolean.parseBoolean(uCursor.getString(uCursor.getColumnIndex("clientState")));
                try{
                   uCursor.close();
                }catch(java.lang.Exception e11){
                   p.a("Utility", "close", e11);
                }
                return b;
             }else {
                try{
                   uCursor.close();
                }catch(java.lang.Exception e10){
                   p.a("Utility", "close", e10);
                }
             }
          }
       }catch(java.lang.Exception e10){
          p.a(v2, "isOverdue", e10);
          if (v3) {
             v3.close();
          }
       }
       return v0;
    }
    public static String c(Context p0,String p1){
       p0 = z.a(p0, p1, "verification_status");
       if (p0 != null) {
          return p0.toString();
       }
       return "";
    }
    public static PublicKey c(Context p0){
       Cursor uCursor = p0.getContentResolver().query(p.a, null, null, null, null);
       PublicKey publicKey = null;
       if (uCursor == null) {
          return publicKey;
       }
       try{
          while (true) {
             if (uCursor.moveToNext()) {
                if (("pushkey").equals(uCursor.getString(uCursor.getColumnIndex("name")))) {
                   String str = uCursor.getString(uCursor.getColumnIndex("value"));
                   p.d("Utility", ("result key : ").concat(String.valueOf(str)));
                   publicKey = u.a(str);
                   try{
                      uCursor.close();
                      break ;
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       try{
          uCursor.close();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void d(Context p0,String p1){
       try{
          if (p0.getPackageManager() == null) {
             throw new VivoPushException("localPackageManager is null");
          }
          PackageInfo services = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 4).services;
          if (services == null) {
             throw new VivoPushException("serviceInfos is null");
          }
          String[] c = z.c;
          int len = c.length;
          for (int i = 0; i < len; i = i + 1) {
             z.a(c[i], services, p1);
          }
          return;
       }catch(java.lang.Exception e4){
          throw new VivoPushException("error "+e4.getMessage());
       }
    }
    public static boolean d(Context p0){
       try{
          if (p0 == null) {
             p.a("Utility", "context is null");
             return false;
          }else {
             String packageName = p0.getPackageName();
             String[] stringArray = new String[]{"323",packageName,String.valueOf(p0.getPackageManager().getPackageInfo(packageName, false).versionCode)};
             int i = 1;
             Cursor uCursor = p0.getContentResolver().query(p.b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", stringArray, null);
             if (uCursor == null) {
                p.a("Utility", "cursor is null");
                if (uCursor != null) {
                   try{
                      uCursor.close();
                   }catch(java.lang.Exception e12){
                      p.a("Utility", "close", e12);
                   }
                }
             }else if(uCursor.moveToFirst() && (uCursor.getInt(uCursor.getColumnIndex("permission")) & i)){
                try{
                   uCursor.close();
                }catch(java.lang.Exception e1){
                   p.a("Utility", "close", e1);
                }
                return i;
             }else {
                try{
                   uCursor.close();
                }catch(java.lang.Exception e12){
                   p.a("Utility", "close", e12);
                }
             }
          }
       }catch(java.lang.Exception e12){
          p.a(v2, "isSupport", e12);
          if (v3) {
             v3.close();
          }
       }
       return v1;
    }
    public static void e(Context p0,String p1){
       if (z.e.length <= 0) {
          return;
       }
       try{
          if (p0.getPackageManager() == null) {
             throw new VivoPushException("localPackageManager is null");
          }
          PackageInfo activities = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 1).activities;
          if (activities == null) {
             throw new VivoPushException("activityInfos is null");
          }
          String[] e = z.e;
          int len = e.length;
          for (int i = 0; i < len; i = i + 1) {
             z.a(e[i], activities, p1);
          }
          return;
       }catch(java.lang.Exception e4){
          throw new VivoPushException("error "+e4.getMessage());
       }
    }
    public static void f(Context p0,String p1){
       try{
          if (p0.getPackageManager() == null) {
             throw new VivoPushException("localPackageManager is null");
          }
          PackageInfo receivers = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 2).receivers;
          if (receivers == null) {
             throw new VivoPushException("receivers is null");
          }
          String[] d = z.d;
          int len = d.length;
          for (int i = 0; i < len; i = i + 1) {
             z.a(d[i], receivers, p1);
          }
          return;
       }catch(java.lang.Exception e4){
          throw new VivoPushException(e4.getMessage());
       }
    }
}
