package com.oplus.ocs.base.utils.ServiceCheck;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import com.oplus.ocs.base.utils.a;

public class ServiceCheck	// class@000b1f
{
    public static final String a = "ServiceCheck";

    public void ServiceCheck(){
       super();
    }
    public static boolean a(Context p0){
       if (ServiceCheck.a(p0, "com.coloros.ocs.opencapabilityservice") || ServiceCheck.a(p0, "com.oplus.ocs")) {
          return true;
       }
       return false;
    }
    public static boolean a(Context p0,String p1){
       int i = 0;
       try{
          ApplicationInfo metaData = p0.getPackageManager().getApplicationInfo(p1, 128).metaData;
          if (metaData != null && (metaData.containsKey("ocs_internal") && metaData.getInt("ocs_internal", i) == 1)) {
             return true;
          }
          return i;
       }catch(android.content.pm.PackageManager$NameNotFoundException e3){
          Object[] objArray = new Object[true];
          objArray[i] = e3.getMessage();
          a.d(ServiceCheck.a, String.format("Unable to fetch metadata from teh manifest %s", objArray));
          return i;
       }
    }
    public static boolean b(Context p0){
       if (ServiceCheck.b(p0, "com.coloros.ocs.opencapabilityservice") || ServiceCheck.b(p0, "com.oplus.ocs")) {
          return true;
       }
       return false;
    }
    public static boolean b(Context p0,String p1){
       int i = 0;
       try{
          ApplicationInfo metaData = p0.getPackageManager().getApplicationInfo(p1, 128).metaData;
          if (metaData != null) {
             p1 = "ocs_internal";
             if (metaData.containsKey(p1) && metaData.containsKey("ocs_optimize")) {
                int intx = metaData.getInt("ocs_optimize", i);
                if (metaData.getInt(p1, i) == 1 && intx == 1) {
                   return true;
                }
             }
          }
          return i;
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          Object[] objArray = new Object[true];
          objArray[i] = e4.getMessage();
          a.d(ServiceCheck.a, String.format("Unable to fetch metadata from teh manifest %s", objArray));
          return i;
       }
    }
    public static boolean check(Context p0,String p1){
       ApplicationInfo uid;
       boolean b = false;
       try{
          uid = p0.getPackageManager().getApplicationInfo(p1, 128).uid;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          Object[] objArray = new Object[e0];
          objArray[b] = p1;
          a.d(ServiceCheck.a, String.format("%s not found", objArray));
          uid = null;
       }
       if (uid != null) {
          return e0;
       }
       return b;
    }
}
