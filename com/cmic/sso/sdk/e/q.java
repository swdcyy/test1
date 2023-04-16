package com.cmic.sso.sdk.e.q;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.lang.Object;
import java.lang.CharSequence;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.net.Inet4Address;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.c;
import java.lang.Exception;
import java.net.Inet6Address;

public class q	// class@000f6e
{

    public static String a(boolean p0){
       StringBuilder str = "";
       try{
          Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
          while (networkInter.hasMoreElements()) {
             NetworkInterface networkInter1 = networkInter.nextElement();
             if (p0 && ((networkInter1.getName()).toLowerCase()).contains("wlan")) {
             }else {
                Enumeration uEnumeration = a.c(networkInter1);
                while (uEnumeration.hasMoreElements()) {
                   InetAddress inetAddress = uEnumeration.nextElement();
                   if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                      str = str+inetAddress.getHostAddress()+",";
                   }else {
                      continue ;
                   }
                }
             }
          }
          if (!TextUtils.isEmpty(str)) {
             str = str.delete((str.length() - 1), str.length());
          }
          c.b("UmcIPUtils", "onlyMobileDataIp "+p0+" IPV4 ip£º"+str);
          return str;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return "";
       }
    }
    public static String b(boolean p0){
       StringBuilder str = "";
       try{
          Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
          while (networkInter.hasMoreElements()) {
             NetworkInterface networkInter1 = networkInter.nextElement();
             if (p0 && ((networkInter1.getName()).toLowerCase()).contains("wlan")) {
             }else {
                Enumeration uEnumeration = a.c(networkInter1);
                while (uEnumeration.hasMoreElements()) {
                   InetAddress inetAddress = uEnumeration.nextElement();
                   if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address && !inetAddress.isLinkLocalAddress())) {
                      String hostAddress = inetAddress.getHostAddress();
                      if (!TextUtils.isEmpty(hostAddress)) {
                         str = str+hostAddress+",";
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
          if (!TextUtils.isEmpty(str)) {
             str = str.delete((str.length() - 1), str.length());
          }
          c.b("UmcIPUtils", "onlyMobileDataIp "+p0+" IPV6 ip£º"+str);
          return str;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return "";
       }
    }
}
