package com.xiaomi.push.g;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.content.pm.PackageInfo;
import java.lang.Object;
import java.lang.StringBuilder;
import rs8.c;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.xiaomi.push.g$b;
import android.os.Build$VERSION;
import android.app.NotificationManager;
import java.lang.Boolean;
import ws8.l0;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.AppOpsManager;
import java.lang.Class;
import android.app.Application;
import java.util.Map;
import com.xiaomi.push.g$a;
import ws8.m6;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import com.kwai.framework.deviceid.a;

public class g	// class@00110a
{
    public static g$a a;

    public static int a(Context p0){
       if (p0 != null) {
          PackageManager packageManag = p0.getPackageManager();
          try{
             ApplicationInfo applicationI = packageManag.getApplicationInfo("com.android.systemui", 128);
             if (applicationI != null) {
                applicationI = applicationI.metaData;
                if (applicationI != null) {
                   return applicationI.getInt("SupportForPushVersionCode");
                }
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }
       }
       return 0;
    }
    public static int b(Context p0,String p1){
       PackageInfo packageInfo;
       int i;
       try{
          packageInfo = p0.getPackageManager().getPackageInfo(p1, 0x4000);
       }catch(java.lang.Exception e0){
          packageInfo = null;
       }
       packageInfo = (packageInfo != null)? packageInfo.versionCode: 0;
       return packageInfo;
    }
    public static ApplicationInfo c(Context p0,String p1){
       ApplicationInfo applicationI = (p1.equals(p0.getPackageName()))? p0.getApplicationInfo(): p0.getPackageManager().getApplicationInfo(p1, 0);
    }
    public static Drawable d(Context p0,String p1){
       ApplicationInfo uApplication = g.c(p0, p1);
       Drawable uDrawable = null;
       if (uApplication != null) {
          try{
             uDrawable = uApplication.loadIcon(p0.getPackageManager());
             if (uDrawable == null) {
                uDrawable = uApplication.loadLogo(p0.getPackageManager());
             }
          }catch(java.lang.Exception e2){
             c.l("get app icon drawable failed, "+e2);
          }
       }
    }
    public static g$b e(Context p0,ApplicationInfo p1){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (p1 == null || sDK_INT < 24) {
          return g$b.a;
       }
       Boolean uBoolean = null;
       try{
          if ((p1.packageName).equals(p0.getPackageName())) {
             uBoolean = Boolean.valueOf(p0.getSystemService("notification").areNotificationsEnabled());
          }else if(sDK_INT >= 29){
             Object[] objArray = new Object[0];
             p0 = l0.e(p0.getSystemService("notification"), "getService", objArray);
          }else {
             p0 = p0.getSystemService("security");
          }
          if (p0 != null) {
             Object[] objArray1 = new Object[]{p1.packageName,Integer.valueOf(p1.uid)};
             uBoolean = l0.n(p0, "areNotificationsEnabledForPackage", objArray1);
          }
       }catch(java.lang.Exception e5){
          c.l("are notifications enabled error "+e5);
       }
       return g$b.a;
          if (uBoolean != null) {
             g$b b = (uBoolean.booleanValue())? g$b.b: g$b.c;
             return b;
          }else {
             goto label_007e ;
          }
    }
    public static g$b f(Context p0,String p1,boolean p2){
       g$b b;
       if (p0 == null || TextUtils.isEmpty(p1)) {
          return g$b.a;
       }
       ApplicationInfo applicationI = (p1.equals(p0.getPackageName()))? p0.getApplicationInfo(): p0.getPackageManager().getApplicationInfo(p1, 0);
       g$b uob = g.e(p0, applicationI);
       g$b a = g$b.a;
       if (uob != a) {
          return uob;
       }else {
          Integer integer = l0.b(AppOpsManager.class, "OP_POST_NOTIFICATION");
          if (integer == null) {
             return a;
          }else {
             Object[] objArray = new Object[]{integer,Integer.valueOf(applicationI.uid),p1};
             Integer integer1 = l0.e(p0.getSystemService("appops"), "checkOpNoThrow", objArray);
             Integer integer2 = l0.b(AppOpsManager.class, "MODE_ALLOWED");
             Integer integer3 = l0.b(AppOpsManager.class, "MODE_IGNORED");
             Object[] objArray1 = new Object[]{integer1,integer2,integer3};
             c.s(String.format("get app mode %s|%s|%s", objArray1));
             if (integer2 == null) {
                integer2 = Integer.valueOf(0);
             }
             if (integer3 == null) {
                integer3 = Integer.valueOf(1);
             }
             if (integer1 != null) {
                if (p2) {
                   b = (!integer1.equals(integer3))? g$b.b: g$b.c;
                   return b;
                }else if(integer1.equals(integer2)){
                   b = g$b.b;
                }else {
                   b = g$b.c;
                }
                return b;
             }else {
                return g$b.a;
             }
          }
       }
    }
    public static String g(){
       String processName;
       if (Build$VERSION.SDK_INT >= 28) {
          processName = Application.getProcessName();
       }else {
          Object[] objArray = new Object[0];
          processName = l0.g("android.app.ActivityThread", "currentProcessName", objArray);
       }
       if (!TextUtils.isEmpty(processName)) {
          return processName;
       }else {
          return "";
       }
    }
    public static String h(Context p0,String p1){
       PackageInfo packageInfo;
       String str;
       try{
          packageInfo = p0.getPackageManager().getPackageInfo(p1, 0x4000);
       }catch(java.lang.Exception e0){
          packageInfo = null;
       }
       packageInfo = (packageInfo != null)? packageInfo.versionName: "1.0";
       return packageInfo;
    }
    public static Map i(Context p0,String p1){
       g$a a = g.a;
       if (a == null) {
          return null;
       }
       return a.a(p0, p1);
    }
    public static boolean j(Context p0){
       String str = g.g();
       if (!TextUtils.isEmpty(str) && p0 != null) {
          return str.equals(p0.getPackageName());
       }
       return false;
    }
    public static boolean k(Context p0,String p1){
       boolean b = false;
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          if (!m6.i()) {
             return (p0.getPackageName()).equals(p1);
          }else {
             g$a a = g.a;
             if (a != null && a.a(p0, p1)) {
                b = true;
             }
          }
       }
       return b;
    }
    public static int l(Context p0,String p1){
       ApplicationInfo icon;
       ApplicationInfo uApplication = g.c(p0, p1);
       if (uApplication != null) {
          icon = uApplication.icon;
          if (icon == null) {
             icon = uApplication.logo;
          }
       }else {
          icon = 0;
       }
       return icon;
    }
    public static String m(Context p0,String p1){
       try{
          PackageManager packageManag = p0.getPackageManager();
          PackageInfo packageInfo = packageManag.getPackageInfo(p1, 0);
          if (packageInfo != null) {
             packageInfo = packageInfo.applicationInfo;
             if (packageInfo != null) {
                p1 = packageManag.getApplicationLabel(packageInfo).toString();
             }
          }
          return p1;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static boolean n(Context p0,String p1){
       g$a a = g.a;
       boolean b = (a != null && a.b(p0, p1))? true: false;
       return b;
    }
    public static boolean o(Context p0,String p1){
       PackageInfo packageInfo;
       int i = 0;
       try{
          packageInfo = p0.getPackageManager().getPackageInfo(p1, i);
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          packageInfo = null;
       }
       if (packageInfo == null) {
          return e0;
       }
       return true;
    }
    public static boolean p(Context p0,String p1){
       boolean b = (!p0.getPackageManager().checkPermission(p1, p0.getPackageName()))? true: false;
       return b;
    }
    public static boolean q(Context p0,String p1){
       try{
          if (!TextUtils.isEmpty(p1) && Settings$Secure.getInt(p0.getContentResolver(), "freeform_window_state", -1) >= 0) {
             return p1.equals(a.g(p0.getContentResolver(), "freeform_package_name"));
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
}
