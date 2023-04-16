package com.cmic.sso.sdk.e.l;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Object;
import android.content.pm.Signature;
import android.content.pm.PackageManager$NameNotFoundException;

public class l	// class@000f66
{

    public static byte[] a(Context p0,String p1){
       PackageManager packageManag = p0.getPackageManager();
       if ((p0.getPackageName()).equalsIgnoreCase(p1)) {
          try{
             PackageInfo packageInfo = packageManag.getPackageInfo(p0.getPackageName(), 64);
             if ((packageInfo.packageName).equals(p1)) {
                return packageInfo.signatures[0].toByteArray();
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e3){
             e3.printStackTrace();
          }
       }
    }
}
