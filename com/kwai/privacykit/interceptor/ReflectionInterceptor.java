package com.kwai.privacykit.interceptor.ReflectionInterceptor;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.j0;
import android.telephony.TelephonyManager;
import wk7.j;
import java.lang.Integer;
import android.net.wifi.WifiInfo;
import java.net.NetworkInterface;

public class ReflectionInterceptor	// class@0013ca
{

    public void ReflectionInterceptor(){
       super();
    }
    public static Object invoke(Method p0,Object p1,Object[] p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ReflectionInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j0.a()) {
          return p0.invoke(p1, p2);
       }
       obj = p0.getName();
       Class declaringCla = p0.getDeclaringClass();
       if (declaringCla.equals(TelephonyManager.class)) {
          declaringCla = -1;
          switch (obj.hashCode()){
              case 0xbdf72787:
                if (obj.equals("getDeviceId")) {
                   declaringCla = 0;
                }
                break;
              case 0xfb80c93e:
                if (obj.equals("getImei")) {
                   declaringCla = 1;
                }
                break;
              case 0xfb827d29:
                if (obj.equals("getMeid")) {
                   declaringCla = 2;
                }
                break;
              case 0x46bc5c0e:
                if (obj.equals("getSubscriptionId")) {
                   declaringCla = 4;
                }
                break;
              case 0x747cee19:
                if (obj.equals("getSubscriberId")) {
                   declaringCla = 3;
                }
                break;
              default:
          }
       label_006f :
          if (declaringCla) {
             if (declaringCla != 1) {
                if (declaringCla != 2) {
                   if (declaringCla != 3) {
                      if (declaringCla == 4) {
                         j.d("device", "TelephonyManager#getSubscriptionId");
                         return Integer.valueOf(0);
                      }
                   }else {
                      j.d("device", "TelephonyManager#getSubscriberId");
                      return "";
                   }
                }else {
                   j.d("device", "TelephonyManager#getMeid");
                   return "";
                }
             }else {
                j.d("device", "TelephonyManager#getImei");
                return "";
             }
          }else {
             j.d("device", "TelephonyManager#getDeviceId");
             return "";
          }
       }else if(declaringCla.equals(WifiInfo.class) && obj.equals("getMacAddress")){
          j.d("device", "WifiInfo#getMacAddress");
          return "";
       }else if(declaringCla.equals(NetworkInterface.class) && obj.equals("getHardwareAddress")){
          j.d("device", "NetworkInterface#getHardwareAddress");
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
       return p0.invoke(p1, p2);
    }
}
