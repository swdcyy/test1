package c.t.m.g.cc;
import android.net.wifi.WifiInfo;
import android.content.Context;
import c.t.m.g.be;
import java.lang.String;
import java.lang.Object;
import android.net.wifi.WifiManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.kwai.framework.deviceid.a;

public class cc	// class@000c04
{
    public static boolean a;
    public static long b;
    public static boolean c;

    public static WifiInfo a(){
       return cc.a(be.a());
    }
    public static WifiInfo a(Context p0){
       WifiManager systemServic = be.a().getApplicationContext().getSystemService("wifi");
       ConnectivityManager uConnectivit = (p0 == null)? null: p0.getSystemService("connectivity");
       if (systemServic != null && uConnectivit != null) {
          WifiInfo connectionIn = systemServic.getConnectionInfo();
          NetworkInfo networkInfo = uConnectivit.getNetworkInfo(1);
          if (connectionIn == null || (networkInfo != null && networkInfo.isConnected())) {
             if (!cc.a(a.a(connectionIn))) {
                return null;
             }else {
                return connectionIn;
             }
          }
       }
       return null;
    }
    public static boolean a(String p0){
       if (p0 != null && (!p0.equals("000000000000") && (p0.equals("00-00-00-00-00-00") || p0.equals("00:00:00:00:00:00")))) {
          return false;
       }
       return true;
    }
}
