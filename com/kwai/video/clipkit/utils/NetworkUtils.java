package com.kwai.video.clipkit.utils.NetworkUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import android.telephony.TelephonyManager;

public class NetworkUtils	// class@001afb
{

    public void NetworkUtils(){
       super();
    }
    public static int getNetworkState(Context p0){
       ConnectivityManager obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.getSystemService("connectivity");
       if (obj == null) {
          return 0;
       }
       NetworkInfo activeNetwor = obj.getActiveNetworkInfo();
       int i = 1;
       if (activeNetwor == null || !activeNetwor.isAvailable()) {
          return i;
       }
       NetworkInfo networkInfo = obj.getNetworkInfo(i);
       if (networkInfo != null) {
          NetworkInfo$State state = networkInfo.getState();
          if (state != null && (state == NetworkInfo$State.CONNECTED || state == NetworkInfo$State.CONNECTING)) {
             return 2;
          }
       }
       int networkType = p0.getSystemService("phone").getNetworkType();
       if (!networkType) {
          networkType = activeNetwor.getSubtype();
       }
       if (networkType != 20) {
          switch (networkType){
              case 1:
              case 4:
              case 7:
              case 11:
              case 2:
                return 3;
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 5:
                return 4;
              case 13:
                return 5;
              default:
                return 7;
          }
       }else {
          return 6;
       }
    }
}
