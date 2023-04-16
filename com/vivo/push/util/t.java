package com.vivo.push.util.t;
import android.content.Context;
import com.vivo.push.model.b;
import com.vivo.push.util.ContextDelegate;
import java.lang.Object;
import java.lang.String;
import com.vivo.push.util.p;
import java.util.List;
import com.vivo.push.util.y;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.vivo.push.cache.b;
import com.vivo.push.cache.d;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import com.vivo.push.p;
import android.net.Uri;
import android.database.Cursor;
import java.lang.Throwable;
import java.lang.Boolean;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageInfo;
import com.vivo.push.util.z;
import java.lang.Exception;
import com.vivo.push.util.g;
import java.util.ArrayList;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.lang.StringBuffer;
import java.lang.Integer;
import java.util.Locale;

public final class t	// class@0010c2
{
    public static Boolean a;
    public static String b;

    public static b a(Context p0){
       p0 = ContextDelegate.getContext(p0).getApplicationContext();
       b uob = t.d(p0);
       if (uob != null) {
          p.d("PushPackageUtils", ("get system push info :").concat(String.valueOf(uob)));
          return uob;
       }else {
          List list = t.e(p0);
          b uob1 = t.f(p0, p0.getPackageName());
          if (list.size() <= 0) {
             if (uob1 != null && uob1.d()) {
                uob = uob1;
             }
             p.a("PushPackageUtils", "findAllPushPackages error: find no package!");
          }else {
             String str1 = null;
             String str2 = y.b(p0).a("com.vivo.push.cur_pkg", str1);
             if (!TextUtils.isEmpty(str2) && t.a(p0, str2, "com.vivo.pushservice.action.METHOD")) {
                uob = t.f(p0, str2);
                if (uob != null && uob.d()) {
                label_0067 :
                   if (uob1 == null || !uob1.d()) {
                      uob1 = str1;
                   }
                   if (uob == null) {
                      str2 = str1;
                   }
                   if (uob1 != null) {
                      if (uob != null) {
                         if (uob1.c()) {
                            if (!uob.c() || uob1.b() - uob.b() <= 0) {
                            label_00a5 :
                               uob1 = uob;
                            }
                         }else if(uob.c() || uob1.b() - uob.b() > 0){
                         }
                      }
                   }else {
                      goto label_00a5 ;
                   }
                   HashMap hashMap = new HashMap();
                   if (uob1 != null) {
                      if (uob1.c()) {
                         str1 = uob1;
                         uob1 = str1;
                      }
                   }else {
                      uob1 = str1;
                   }
                   int i = list.size();
                   int i1 = 0;
                   while (i1 < i) {
                      String str3 = list.get(i1);
                      if (!TextUtils.isEmpty(str3)) {
                         b uob2 = t.f(p0, str3);
                         if (uob2 != null) {
                            hashMap.put(str3, uob2);
                            if (uob2.d()) {
                               if (uob2.c()) {
                                  if (str1 == null || uob2.b() - str1.b() > 0) {
                                     str1 = uob2;
                                  }
                               }else if(uob1 == null || uob2.b() - uob1.b() > 0){
                                  uob1 = uob2;
                               }
                            }
                         }
                      }
                      i1 = i1 + 1;
                   }
                   if (uob1 != null) {
                      uob = uob1;
                   }else {
                      p.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                      str2 = str1;
                   }
                }
             }
             str2 = str1;
             goto label_0067 ;
          }
          if (uob != null) {
             String str = "查找最优包为:";
             if (uob.c()) {
                p.a(p0, str+uob.a()+"\("+uob.b()+", Black\)");
                p.d("PushPackageUtils", "finSuitablePushPackage"+uob.a()+"\("+uob.b()+", Black\)");
             }else {
                p.a(p0, str+uob.a()+"\("+uob.b()+"\)");
                p.d("PushPackageUtils", "finSuitablePushPackage"+uob.a()+"\("+uob.b()+"\)");
             }
          }else {
             p.b(p0, "查找最优包为空!");
             p.d("PushPackageUtils", "finSuitablePushPackage is null");
          }
          return uob;
       }
    }
    public static boolean a(Context p0,long p1){
       d uod = b.a().a(p0);
       if (uod != null) {
          return uod.isInBlackList(p1);
       }
       return false;
    }
    public static boolean a(Context p0,String p1){
       if (!TextUtils.isEmpty(p1) && p0 != null) {
          Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
          intent.setPackage(p1);
          PackageManager packageManag = p0.getPackageManager();
          List list = packageManag.queryIntentServices(intent, 576);
          if (list == null || list.size() <= 0) {
             p.a("PushPackageUtils", "isEnablePush error: can not find push service.");
          }else {
             int i = list.size();
             int i1 = 0;
             ResolveInfo resolveInfo = null;
             while (i1 < i) {
                ResolveInfo resolveInfo1 = list.get(i1);
                if (resolveInfo1 != null) {
                   ResolveInfo serviceInfo = resolveInfo1.serviceInfo;
                   if (serviceInfo != null) {
                      ServiceInfo exported = serviceInfo.exported;
                      if (("com.vivo.push.sdk.service.PushService").equals(serviceInfo.name) && exported != null) {
                         ServiceInfo enabled = resolveInfo1.serviceInfo.enabled;
                         int componentEna = packageManag.getComponentEnabledSetting(new ComponentName(p1, "com.vivo.push.sdk.service.PushService"));
                         resolveInfo = (componentEna == 1 || (!componentEna && enabled != null))? 1: null;
                      }
                   }
                }
                i1 = i1 + 1;
             }
             return resolveInfo;
          }
       }
       return false;
    }
    public static boolean a(Context p0,String p1,String p2){
       List list;
       Intent intent = new Intent(p2);
       try{
          intent.setPackage(p1);
          list = p0.getPackageManager().queryBroadcastReceivers(intent, 576);
       }catch(java.lang.Exception e0){
          list = null;
       }
       boolean b = (list != null && list.size() > 0)? true: false;
       return b;
    }
    public static int b(Context p0,String p1){
       int i = (t.a(p0, p1, "com.vivo.pushservice.action.RECEIVE"))? 0: -1;
       if (t.a(p0, p1, "com.vivo.pushclient.action.RECEIVE")) {
          i = 1;
       }
       return i;
    }
    public static String b(Context p0){
       String str2;
       String str = "name";
       if (!TextUtils.isEmpty(t.b)) {
          return t.b;
       }
       String str1 = null;
       try{
          Cursor uCursor = p0.getContentResolver().query(p.a, null, null, null, null);
          if (uCursor == null) {
             try{
                p.a("PushPackageUtils", "cursor is null");
                if (uCursor != null) {
                   try{
                      uCursor.close();
                   }catch(java.lang.Exception e10){
                      p.a("PushPackageUtils", "close", e10);
                   }
                }
             }catch(java.lang.Exception e0){
                str2 = str1;
             }
             Cursor uCursor1 = uCursor;
          }else {
             int i = 0;
             str2 = str1;
             while (uCursor.moveToNext()) {
                if (("pushPkgName").equals(uCursor.getString(uCursor.getColumnIndex(str)))) {
                   str2 = uCursor.getString(uCursor.getColumnIndex("value"));
                }else if(("pushEnable").equals(uCursor.getString(uCursor.getColumnIndex(str)))){
                   i = Boolean.parseBoolean(uCursor.getString(uCursor.getColumnIndex("value")));
                }
             }
             t.b = str2;
             if (TextUtils.isEmpty(str2)) {
                try{
                   uCursor.close();
                }catch(java.lang.Exception e10){
                   p.a("PushPackageUtils", "close", e10);
                }
                return str1;
             }else if(!i){
                try{
                   uCursor.close();
                }catch(java.lang.Exception e10){
                   p.a("PushPackageUtils", "close", e10);
                }
                return str1;
             }else {
                uCursor.close();
             label_00af :
                return str2;
             }
          }
       }catch(java.lang.Exception e0){
          str2 = str1;
       }catch(java.lang.Exception e10){
          p.a("PushPackageUtils", "close", e10);
          goto label_00af ;
       }catch(java.lang.Exception e0){
          goto label_009f ;
       }
    }
    public static boolean c(Context p0){
       Boolean a = t.a;
       if (a != null) {
          return a.booleanValue();
       }
       String str = "com.vivo.push.sdk.service.SystemPushConfig";
       String str1 = null;
       if (p0 != null && !TextUtils.isEmpty(str)) {
          ProviderInfo providerInfo = p0.getPackageManager().resolveContentProvider(str, 128);
          if (providerInfo != null) {
             str1 = providerInfo.packageName;
          }
       }
       Boolean uBoolean = Boolean.valueOf(("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02").equals(t.g(p0, str1)));
       t.a = uBoolean;
       return uBoolean.booleanValue();
    }
    public static boolean c(Context p0,String p1){
       return t.a(p0, p1, "com.vivo.pushclient.action.RECEIVE");
    }
    public static b d(Context p0){
       String str = t.b(p0);
       b uob = null;
       if (TextUtils.isEmpty(str)) {
          return uob;
       }
       try{
          b uob1 = new b(str);
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(str, 128);
          if (packageInfo != null) {
             uob1.a(packageInfo.versionCode);
             uob1.a(packageInfo.versionName);
             uob = packageInfo.applicationInfo;
          }
          if (uob != null) {
             uob1.a(z.a(p0, str));
          }
          uob1.a(t.a(p0, uob1.b()));
          uob1.b(t.a(p0, str));
          return uob1;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          p.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e5);
          return uob;
       }
    }
    public static boolean d(Context p0,String p1){
       return t.a(p0, p1, "com.vivo.pushservice.action.RECEIVE");
    }
    public static List e(Context p0){
       List list;
       g.a("findAllCoreClientPush");
       ArrayList uArrayList = new ArrayList();
       String str = "com.vivo.pushservice.action.PUSH_SERVICE";
       try{
          Intent intent = new Intent(str);
          list = p0.getPackageManager().queryIntentServices(intent, 576);
       }catch(java.lang.Exception e0){
          list = null;
       }
       if (list != null && list.size() > 0) {
          int i = list.size();
          int i1 = 0;
          while (i1 < i) {
             ResolveInfo resolveInfo = list.get(i1);
             if (resolveInfo != null) {
                ServiceInfo packageName = resolveInfo.serviceInfo.packageName;
                if (!TextUtils.isEmpty(packageName)) {
                   e0.add(packageName);
                }
             }
             i1 = i1 + 1;
          }
       }
       if (e0.size() <= 0) {
          p.d("PushPackageUtils", "get all push packages is null");
       }
       return e0;
    }
    public static boolean e(Context p0,String p1){
       return t.a(p0, p1, "com.vivo.pushservice.action.METHOD");
    }
    public static b f(Context p0,String p1){
       b uob = null;
       if (!TextUtils.isEmpty(p1)) {
          b uob1 = (t.a(p0, p1, "com.vivo.pushservice.action.METHOD") || t.a(p0, p1, "com.vivo.pushservice.action.RECEIVE"))? 1: null;
          try{
             if (uob1) {
                uob1 = new b(p1);
                PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p1, 128);
                if (packageInfo != null) {
                   uob1.a(packageInfo.versionCode);
                   uob1.a(packageInfo.versionName);
                   packageInfo = packageInfo.applicationInfo;
                }else {
                   b uob2 = uob;
                }
                if (packageInfo != null) {
                   uob1.a(z.a(p0, p1));
                }
                uob1.b(t.a(p0, p1));
                uob1.a(t.a(p0, uob1.b()));
                return uob1;
             }
          }catch(java.lang.Exception e4){
             p.a("PushPackageUtils", "getPushPackageInfo exception: ", e4);
          }
       }
    }
    public static String g(Context p0,String p1){
       try{
          if (TextUtils.isEmpty(p1) || p0 == null) {
          }else {
             int i = 0;
             byte[] uobyteArray = MessageDigest.getInstance("SHA256").digest(p0.getPackageManager().getPackageInfo(p1, 64).signatures[i].toByteArray());
             StringBuffer str = "";
             for (; i < uobyteArray.length; i++) {
                int i1 = uobyteArray[i] & 0x00ff;
                String str1 = (Integer.toHexString(i1)).toUpperCase(Locale.US);
                if (str1.length() == 1) {
                   str = str+"0";
                }
                str = str+str1;
             }
             return str;
          }
       }catch(java.lang.Exception e5){
          p.a("PushPackageUtils", (" getSignatureSHA exception ").concat(String.valueOf(e5)));
       }
       return null;
    }
}
