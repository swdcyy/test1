package com.frog.engine.constants.FrogConstants;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Enumeration;
import java.net.NetworkInterface;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.net.Inet4Address;

public class FrogConstants	// class@0014fa
{

    public void FrogConstants(){
       super();
    }
    public static final String getHost(){
       Object obj = PatchProxy.apply(null, null, FrogConstants.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return FrogConstants.getLocalIPAddress();
       }catch(java.lang.Exception e0){
          return "127.0.0.1";
       }
    }
    public static String getLocalIPAddress(){
       Enumeration obj = PatchProxy.apply(null, null, FrogConstants.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NetworkInterface.getNetworkInterfaces();
       while (true) {
          if (obj.hasMoreElements()) {
             Enumeration uEnumeration = a.c(obj.nextElement());
             while (true) {
                if (uEnumeration.hasMoreElements()) {
                   InetAddress inetAddress = uEnumeration.nextElement();
                   if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                      return inetAddress.getHostAddress();
                   }
                }else {
                   continue ;
                }
             }
             return "null";
          }else {
             goto label_0043 ;
          }
       }
    }
}
