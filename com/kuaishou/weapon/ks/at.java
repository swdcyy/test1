package com.kuaishou.weapon.ks.at;
import java.lang.Object;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.deviceid.a;
import java.lang.String;
import android.content.Context;
import org.json.JSONObject;
import java.lang.System;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;

public class at	// class@0011d1
{

    public void at(){
       super();
    }
    public static int a(){
       Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
       if (networkInter != null) {
          Iterator iterator = Collections.list(networkInter).iterator();
          while (iterator.hasNext()) {
             NetworkInterface networkInter1 = iterator.next();
             if (!networkInter1.isUp() || (a.d(networkInter1).size() && (("tun0").equals(networkInter1.getName()) || ("ppp0").equals(networkInter1.getName())))) {
                return 1;
             }
          }
       }
       return 0;
    }
    public static JSONObject a(Context p0){
       try{
          String property = System.getProperty("http.proxyHost");
          String property1 = System.getProperty("http.proxyPort");
          if (property1 != null) {
          }else {
             property1 = "-1";
          }
          int i = Integer.parseInt(property1);
          if (!TextUtils.isEmpty(property) && i != -1) {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("h", property);
             jSONObject.put("p", i);
             return jSONObject;
          }else {
             return null;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
