package com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.lang.Object;
import android.net.wifi.WifiInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.i0;
import java.util.Objects;
import vk7.a0;
import java.util.concurrent.Callable;
import java.net.NetworkInterface;
import vk7.d0;
import vk7.b0;
import vk7.c0;

public class MacAddressInterceptor	// class@0013c7
{

    public void MacAddressInterceptor(){
       super();
    }
    public static String getBSSID(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MacAddressInterceptor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: WifiInfo#getBSSID");
       Objects.requireNonNull(p0);
       return new i0("device", "WifiInfo#getBSSID", new a0(p0), "").a();
    }
    public static byte[] getHardwareAddress(NetworkInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MacAddressInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: NetworkInterface#getHardwareAddress");
       Objects.requireNonNull(p0);
       byte[] uobyteArray = new byte[0];
       return new i0("device", "NetworkInterface#getHardwareAddress", new d0(p0), uobyteArray).a();
    }
    public static String getMacAddress(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MacAddressInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: WifiInfo#getMacAddress");
       Objects.requireNonNull(p0);
       return new i0("device", "WifiInfo#getMacAddress", new b0(p0), "").a();
    }
    public static String getSSID(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MacAddressInterceptor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: WifiInfo#getSSID");
       Objects.requireNonNull(p0);
       return new i0("device", "WifiInfo#getSSID", new c0(p0), "").a();
    }
}
