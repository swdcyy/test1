package com.kwai.framework.deviceid.a;
import java.lang.Object;
import android.net.wifi.WifiInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qe6.b;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import com.kwai.framework.deviceid.a$a;
import java.util.List;
import java.util.ArrayList;
import java.lang.Number;
import android.content.ContentResolver;
import android.provider.Settings$Secure;

public class a	// class@000b36
{

    public void a(){
       super();
    }
    public static String a(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a()) {
          return "";
       }
       return p0.getBSSID();
    }
    public static NetworkInterface b(InetAddress p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a()) {
          return null;
       }
       return NetworkInterface.getByInetAddress(p0);
    }
    public static Enumeration c(NetworkInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a()) {
          return new a$a();
       }
       return p0.getInetAddresses();
    }
    public static List d(NetworkInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a()) {
          return new ArrayList(1);
       }
       return p0.getInterfaceAddresses();
    }
    public static int e(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!b.a()) {
          return 0;
       }
       return p0.getIpAddress();
    }
    public static String f(WifiInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a()) {
          return "";
       }
       return p0.getSSID();
    }
    public static String g(ContentResolver p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("android_id").equals(p1) && !b.a()) {
          return "";
       }
       return Settings$Secure.getString(p0, p1);
    }
}
