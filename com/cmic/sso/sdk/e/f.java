package com.cmic.sso.sdk.e.f;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import java.lang.Exception;
import java.lang.StringBuilder;
import android.content.pm.PackageManager$NameNotFoundException;

public class f	// class@000f5e
{

    public static String a(Context p0){
       String str1;
       String str = null;
       try{
          PackageManager packageManag = p0.getPackageManager();
          String applicationL = packageManag.getApplicationLabel(packageManag.getApplicationInfo(f.d(p0), 0));
          if (applicationL != null) {
             return applicationL;
          }
          try{
             PackageInfo packageInfo = f.c(p0);
             if (packageInfo == null) {
                return str;
             }else {
                str1 = p0.getResources().getString(packageInfo.applicationInfo.labelRes);
             }
             return str1;
          }catch(java.lang.Exception e4){
             int i = applicationL;
          }
          e4.printStackTrace();
          str1 = str;
          goto label_0033 ;
       }catch(java.lang.Exception e4){
          goto label_002f ;
       }
    }
    public static String b(Context p0){
       try{
          PackageInfo packageInfo = f.c(p0);
          if (packageInfo != null) {
             return f.d(p0)+"&"+packageInfo.versionName;
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return "";
    }
    public static PackageInfo c(Context p0){
       try{
          return p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
       }catch(android.content.pm.PackageManager$NameNotFoundException e2){
          e2.printStackTrace();
          return null;
       }
    }
    public static String d(Context p0){
       PackageInfo packageInfo = f.c(p0);
       String str = (packageInfo == null)? "": packageInfo.packageName;
       return str;
    }
}
