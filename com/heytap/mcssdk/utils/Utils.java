package com.heytap.mcssdk.utils.Utils;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.heytap.mcssdk.PushService;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.NumberFormatException;

public class Utils	// class@00053e
{

    public void Utils(){
       super();
    }
    public static String getString(int[] p0){
       StringBuilder str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+(char)p0[i];
       }
       return str;
    }
    public static int getVersionCode(Context p0){
       PackageInfo versionCode;
       int i = 0;
       try{
          versionCode = p0.getPackageManager().getPackageInfo(p0.getPackageName(), i).versionCode;
       }catch(java.lang.Exception e3){
          d.b("getVersionCode--Exception:"+e3.getMessage());
       }
       return versionCode;
    }
    public static int getVersionCode(Context p0,String p1){
       int i = 0;
       try{
          return p0.getPackageManager().getPackageInfo(p1, i).versionCode;
       }catch(java.lang.Exception e2){
          d.b("getVersionCode--Exception:"+e2.getMessage());
          return i;
       }
    }
    public static String getVersionName(Context p0){
       PackageInfo versionName;
       try{
          versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
       }catch(java.lang.Exception e2){
          d.b("getVersionName--Exception:"+e2.getMessage());
          versionName = "0";
       }
       return versionName;
    }
    public static String getVersionName(Context p0,String p1){
       try{
          return p0.getPackageManager().getPackageInfo(p1, 0).versionName;
       }catch(java.lang.Exception e1){
          d.b("getVersionName--Exception:"+e1.getMessage());
          return null;
       }
    }
    public static boolean isExistPackage(Context p0,String p1){
       try{
          p0.getPackageManager().getPackageInfo(p1, 1);
          return 1;
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          d.e("isExistPackage NameNotFoundException:"+e1.getMessage());
          return false;
       }
    }
    public static boolean isSupportPush(Context p0,String p1,String p2){
       ApplicationInfo applicationI;
       try{
          applicationI = p0.getPackageManager().getApplicationInfo(p1, 128);
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          d.e("isSupportPush NameNotFoundException:"+e1.getMessage());
          applicationI = null;
       }
       boolean b = false;
       if (applicationI != null && applicationI.metaData.getBoolean(p2, b)) {
          b = true;
       }
       return b;
    }
    public static boolean isSupportPushByClient(Context p0){
       return PushService.getInstance().isSupportPushByClient(p0);
    }
    public static int parseInt(String p0){
       int i;
       if (!TextUtils.isEmpty(p0)) {
          try{
             i = Integer.parseInt(p0);
          label_0025 :
             return i;
          }catch(java.lang.NumberFormatException e2){
             d.e("parseInt--NumberFormatException"+e2.getMessage());
          }
          i = -1;
          goto label_0025 ;
       }else {
          goto label_0024 ;
       }
    }
}
