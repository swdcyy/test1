package com.kuaishou.weapon.ks.bp;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.telephony.TelephonyManager;
import java.lang.CharSequence;
import android.text.TextUtils;

public class bp	// class@0011ec
{

    public void bp(){
       super();
    }
    public static String a(Context p0){
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String networkOpera = systemServic.getNetworkOperator();
       if (TextUtils.isEmpty(networkOpera)) {
          networkOpera = "RISK_GET_FIELD_EMPTY";
       }
       return networkOpera;
    }
    public static String b(Context p0){
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String networkCount = systemServic.getNetworkCountryIso();
       if (TextUtils.isEmpty(networkCount)) {
          networkCount = "RISK_GET_FIELD_EMPTY";
       }
       return networkCount;
    }
}
