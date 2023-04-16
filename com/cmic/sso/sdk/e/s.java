package com.cmic.sso.sdk.e.s;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.net.ConnectivityManager;
import java.lang.Exception;
import android.net.Network;
import java.net.InetAddress;
import java.net.Inet4Address;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.s$a;
import android.net.NetworkInfo;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import com.cmic.sso.sdk.e.s$1;
import android.net.NetworkInfo$State;
import java.lang.Enum;
import java.lang.Thread;

public class s	// class@000f72
{
    public ConnectivityManager b;
    public Network c;
    public ConnectivityManager$NetworkCallback d;
    public boolean e;
    public boolean f;
    public static s a;

    public void s(Context p0){
       super();
       boolean b = false;
       try{
          this.f = b;
          this.b = p0.getSystemService("connectivity");
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static Network a(s p0,Network p1){
       p0.c = p1;
       return p1;
    }
    public static s a(Context p0){
       if (s.a == null) {
          _monitor_enter(s.class);
          if (s.a == null) {
             s.a = new s(p0);
          }
          _monitor_exit(s.class);
       }
       return s.a;
    }
    public static boolean a(s p0,boolean p1){
       p0.e = p1;
       return p1;
    }
    public static int b(String p0){
       object oobject;
       int i = -1;
       try{
          InetAddress[] allByName = InetAddress.getAllByName(p0);
          int len = allByName.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                oobject = allByName[i1];
                if (oobject instanceof Inet4Address) {
                label_0015 :
                   if (oobject == null) {
                      return e0;
                   }
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                oobject = null;
                goto label_0015 ;
             }
          }
          c.b("WifiNetworkUtils", "lookupHost inetAddress "+oobject.toString());
          byte[] address = oobject.getAddress();
          return ((address[0] & 0x00ff) | ((((address[3] & 0x00ff) << 24) | ((address[2] & 0x00ff) << 16)) | ((address[1] & 0x00ff) << 8)));
       }catch(java.net.UnknownHostException e0){
       }
    }
    public static String c(String p0){
       int i = p0.indexOf("://");
       if (i > 0) {
          p0 = p0.substring((i + 3));
       }
       i = p0.indexOf(58);
       if (i >= 0) {
          p0 = p0.substring(0, i);
       }
       i = p0.indexOf(47);
       if (i >= 0) {
          p0 = p0.substring(0, i);
       }
       i = p0.indexOf(63);
       if (i >= 0) {
          p0 = p0.substring(0, i);
       }
       return p0;
    }
    public void a(s$a p0){
       s$1 u1;
       s tb = this.b;
       if (tb == null) {
          c.a("WifiNetworkUtils", "mConnectivityManager 为空");
          return;
       }else {
          s tc = this.c;
          if (tc != null && this.e == null) {
             NetworkInfo networkInfo = tb.getNetworkInfo(tc);
             if (networkInfo != null && networkInfo.isAvailable()) {
                p0.a(this.c);
                return;
             }
          }
          tb = this.d;
          if (tb != null) {
             try{
                this.b.unregisterNetworkCallback(tb);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                this.d = null;
             }
          }
       }
    }
    public boolean a(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public boolean a(String p0){
       s tb = this.b;
       boolean b = false;
       if (tb == null) {
          return b;
       }
       tb.startUsingNetworkFeature(b, "enableHIPRI");
       try{
          for (; b < 30 && this.b.getNetworkInfo(5).getState().compareTo(NetworkInfo$State.CONNECTED); b = b + 1) {
             Thread.sleep(1000);
          }
       }catch(java.lang.InterruptedException e0){
          c.a("WifiNetworkUtils", "check hipri failed");
       }
       this.f = this.b.requestRouteToHost(5, s.b(s.c(p0)));
       c.a("WifiNetworkUtils", "切换数据网络结果 >>> "+this.f);
       return this.f;
    }
    public void b(){
       s tb = this.b;
       if (tb == null) {
          return;
       }
       try{
          s td = this.d;
          if (td == null) {
             return;
          }else {
             tb.unregisterNetworkCallback(td);
             this.d = null;
             this.c = null;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
