package com.tencent.open.utils.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Throwable;
import com.tencent.open.utils.e;
import java.lang.System;
import java.lang.CharSequence;
import android.content.pm.PackageInfo;
import com.kuaishou.webkit.WebSettings;
import android.os.Environment;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.content.Intent;
import java.util.List;
import android.content.pm.Signature;
import com.tencent.open.utils.k;
import com.tencent.open.utils.f;
import android.content.SharedPreferences;
import oe6.o;
import java.io.File;
import java.io.IOException;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.FileOutputStream;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.security.MessageDigest;
import java.lang.Exception;
import android.os.Build$VERSION;

public class i	// class@000f7f
{

    public static int a(String p0){
       if (("shareToQQ").equals(p0)) {
          return 0x2777;
       }
       if (("shareToQzone").equals(p0)) {
          return 0x2778;
       }
       if (("addToQQFavorites").equals(p0)) {
          return 0x2779;
       }
       if (("sendToMyComputer").equals(p0)) {
          return 0x277a;
       }
       if (("shareToTroopBar").equals(p0)) {
          return 0x277b;
       }
       if (("action_login").equals(p0)) {
          return 0x2b5d;
       }
       if (("action_request").equals(p0)) {
          return 0x2774;
       }
       return -1;
    }
    public static int a(String p0,String p1){
       if (p0 == null && p1 == null) {
          return 0;
       }
       if (p0 != null && p1 == null) {
          return 1;
       }
       if (p0 == null && p1 != null) {
          return -1;
       }
       String[] stringArray = p0.split("\\.");
       String[] stringArray1 = p1.split("\\.");
       int i = 0;
       try{
          while (true) {
             if (i < stringArray.length && i < stringArray1.length) {
                int i1 = Integer.parseInt(stringArray[i]);
                int i2 = Integer.parseInt(stringArray1[i]);
                if (i1 < i2) {
                   break ;
                }else if(i1 > i2){
                   return 1;
                }else {
                   i = i + 1;
                }
             }else if(stringArray.length > i){
                return 1;
             }else if(stringArray1.length > i){
                return -1;
             }else {
                return 0;
             }
          }
          return -1;
       }catch(java.lang.NumberFormatException e0){
          return p0.compareTo(p1);
       }
    }
    public static long a(InputStream p0,OutputStream p1){
       byte[] uobyteArray = new byte[8192];
       long l = 0;
       int i = 0;
       int i1 = p0.read(uobyteArray, i, 8192);
       while (i1 != -1) {
          p1.write(uobyteArray, i, i1);
          l = l + (long)i1;
       }
       SLog.i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: "+l);
       return l;
    }
    public static String a(int p0){
       if (p0 == 0x2777) {
          return "shareToQQ";
       }
       if (p0 == 0x2778) {
          return "shareToQzone";
       }
       if (p0 == 0x2779) {
          return "addToQQFavorites";
       }
       if (p0 == 0x277a) {
          return "sendToMyComputer";
       }
       if (p0 == 0x277b) {
          return "shareToTroopBar";
       }
       if (p0 == 0x2b5d) {
          return "action_login";
       }
       if (p0 == 0x2774) {
          return "action_request";
       }
       return null;
    }
    public static String a(Activity p0){
       int i1;
       String packageName = p0.getApplicationContext().getPackageName();
       PackageManager packageManag = p0.getPackageManager();
       int i = 128;
       try{
          i1 = 0;
          ApplicationInfo applicationI = packageManag.getApplicationInfo(packageName, i);
          SLog.i("openSDK_LOG.SystemUtils", "apkPath="+applicationI.sourceDir);
          return applicationI.sourceDir;
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          SLog.e(v0, "NameNotFoundException", e4);
          return i1;
       }catch(java.lang.Exception e4){
          SLog.e(v0, "Exception", e4);
          return i1;
       }
    }
    public static String a(Activity p0,String p1){
       if (p0 == null) {
          SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName activity==null !!!!!!");
          return "";
       }else {
          try{
             byte[] uobyteArray = e.a(p1);
             if (uobyteArray == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName shaBytes==null !!!!!!");
                return "";
             }else {
                byte[] uobyteArray1 = new byte[8];
                System.arraycopy(uobyteArray, 5, uobyteArray1, 0, 8);
                byte[] uobyteArray2 = new byte[16];
                System.arraycopy(uobyteArray, 8, uobyteArray2, 0, 16);
                return e.a(p0.getPackageName(), e.a(uobyteArray2), uobyteArray1);
             }
          }catch(java.lang.Exception e7){
             SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName", e7);
             return "";
          }
       }
    }
    public static String a(Context p0){
       return p0.getApplicationInfo().loadLabel(p0.getPackageManager()).toString();
    }
    public static String a(Context p0,String p1){
       PackageManager packageManag = p0.getPackageManager();
       try{
          int i = 0;
          return packageManag.getPackageInfo(p1, i).versionName;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          return null;
       }
    }
    public static void a(WebSettings p0){
       boolean b = false;
       try{
          p0.setSavePassword(b);
          p0.setAllowFileAccess(b);
          p0.setAllowFileAccessFromFileURLs(b);
       }catch(java.lang.Exception e2){
          SLog.e("openSDK_LOG.SystemUtils", "Exception", e2);
       }
       return;
    }
    public static boolean a(){
       boolean i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          i = Environment.class.getMethod("isExternalStorageLegacy", uClassArray).invoke(Environment.class, objArray).booleanValue();
          return e0;
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public static boolean a(Context p0,Intent p1){
       boolean b = false;
       if (p0 == null || (p1 != null && p0.getPackageManager().queryIntentActivities(p1, b).size())) {
          b = true;
       }
    label_0015 :
       return b;
    }
    public static boolean a(Context p0,String p1,String p2){
       SLog.v("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
       try{
          int i = 0;
          PackageInfo signatures = p0.getPackageManager().getPackageInfo(p1, 64).signatures;
          int len = signatures.length;
          int i1 = 0;
          while (true) {
             if (i1 >= len) {
                return e0;
             }
             if ((k.g(signatures[i1].toCharsString())).equals(p2)) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          return true;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static boolean a(String p0,String p1,int p2){
       FileOutputStream uFileOutputS;
       InputStream inputStream;
       OutputStream outputStream;
       SharedPreferences$Editor uEditor;
       InputStream inputStream1;
       SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: "+p0);
       Context uContext = f.a();
       if (uContext == null) {
          SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
          return false;
       }else {
          SharedPreferences sharedPrefer = o.c(uContext, "secure_lib", false);
          File uFile = new File(uContext.getFilesDir(), p1);
          if (!uFile.exists()) {
             File parentFile = uFile.getParentFile();
             if (parentFile != null && parentFile.mkdirs()) {
                try{
                   uFile.createNewFile();
                }catch(java.io.IOException e4){
                   e4.printStackTrace();
                }
             }
          }else {
             int intx = sharedPrefer.getInt("version", false);
             SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: "+p2+" | oldVersion: "+intx);
             if (p2 == intx) {
                return true;
             }
          }
       }
    }
    public static String b(Context p0,String p1){
       String str = "";
       String str1 = "OpenUi, getSignValidString";
       try{
          SLog.v("openSDK_LOG.SystemUtils", str1);
          str1 = p0.getPackageName();
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0.getPackageManager().getPackageInfo(str1, 64).signatures[0].toByteArray());
          String str2 = k.a(instance.digest());
          instance.reset();
          SLog.v("openSDK_LOG.SystemUtils", "-->sign: "+str2);
          instance.update(k.j(str1+"_"+str2+"_"+p1+str));
          str = k.a(instance.digest());
          instance.reset();
          SLog.v("openSDK_LOG.SystemUtils", "-->signEncryped: "+str);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          SLog.e("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e7);
       }
       return str;
    }
    public static boolean b(Context p0){
       boolean b = i.f(p0, "com.tencent.mobileqq");
       SLog.i("openSDK_LOG.SystemUtils", "isQQInstalled "+b);
       return b;
    }
    public static int c(Context p0,String p1){
       return i.a(i.a(p0, "com.tencent.mobileqq"), p1);
    }
    public static boolean c(Context p0){
       boolean b = i.f(p0, "com.tencent.mobileqq");
       boolean b1 = i.f(p0, "com.tencent.tim");
       boolean b2 = i.f(p0, "com.tencent.minihd.qq");
       boolean b3 = i.f(p0, "com.tencent.qqlite");
       SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: qq="+b+", tim="+b1+", pad="+b2+", speed="+b3);
       b3 = (!b && (!b1 && (b2 || b3)))? true: false;
       return b3;
    }
    public static int d(Context p0,String p1){
       return i.a(i.a(p0, "com.tencent.tim"), p1);
    }
    public static boolean d(Context p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getApplicationInfo().targetSdkVersion >= 29 && (Build$VERSION.SDK_INT >= 29 && !i.a())) {
          b = true;
       }
    label_0019 :
       return b;
    }
    public static int e(Context p0,String p1){
       return i.a(i.a(p0, "com.tencent.qqlite"), p1);
    }
    public static boolean f(Context p0,String p1){
       int i = 0;
       try{
          p0.getPackageManager().getPackageInfo(p1, i);
          return true;
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          SLog.e(v0, "PackageManager.NameNotFoundException "+p1, e4);
          return i;
       }catch(java.lang.Exception e4){
          SLog.e(v0, "Exception", e4);
          return i;
       }
    }
}
