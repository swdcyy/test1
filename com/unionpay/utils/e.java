package com.unionpay.utils.e;
import android.content.Context;
import android.location.Location;
import java.lang.String;
import java.lang.Object;
import android.location.LocationManager;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.os.Build;

public final class e	// class@00100d
{

    public static Location a(Context p0){
       Location location;
       Location lastKnownLoc;
       String str = "gps";
       LocationManager systemServic = p0.getSystemService("location");
       try{
          int i = 0;
          if (systemServic.isProviderEnabled(str)) {
             lastKnownLoc = LocationInterceptor.getLastKnownLocation(systemServic, str);
             if (lastKnownLoc == null && systemServic.isProviderEnabled("network")) {
                location = LocationInterceptor.getLastKnownLocation(systemServic, "network");
             }
          }else if(systemServic.isProviderEnabled("network")){
             lastKnownLoc = LocationInterceptor.getLastKnownLocation(systemServic, "network");
          }
          location = i;
       }catch(java.lang.Exception e0){
       }
       return location;
    }
    public static String a(){
       String radioVersion;
       try{
          radioVersion = Build.getRadioVersion();
       }catch(java.lang.Exception e0){
          radioVersion = "";
       }
       return radioVersion;
    }
}
