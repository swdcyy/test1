package aegon.chrome.net.NetworkChangeNotifierAutoDetect$i;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.kwai.framework.deviceid.a;
import aegon.chrome.net.AndroidNetworkLibrary;
import android.content.pm.PackageManager;

public class NetworkChangeNotifierAutoDetect$i	// class@00019b
{
    public final Context a;
    public final Object b;
    public boolean c;
    public boolean d;
    public WifiManager e;
    public static final boolean f;

    static {
    }
    public void NetworkChangeNotifierAutoDetect$i(){
       super();
       this.b = new Object();
       this.a = null;
    }
    public void NetworkChangeNotifierAutoDetect$i(Context p0){
       super();
       this.b = new Object();
       this.a = p0;
    }
    public String a(){
       WifiInfo connectionIn;
       NetworkChangeNotifierAutoDetect$i tb = this.b;
       _monitor_enter(tb);
       if (this.b()) {
          try{
             connectionIn = this.e.getConnectionInfo();
          }catch(java.lang.NullPointerException e0){
             try{
                connectionIn = this.e.getConnectionInfo();
             }catch(java.lang.NullPointerException e0){
                connectionIn = null;
             }
          }
          if (connectionIn != null) {
             _monitor_exit(e0);
             return a.f(connectionIn);
          }else {
             _monitor_exit(e0);
             return "";
          }
       }else {
          _monitor_exit(tb);
          return AndroidNetworkLibrary.getWifiSSID();
       }
    }
    public final boolean b(){
       if (this.c != null) {
          return this.d;
       }
       boolean b = (!this.a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.a.getPackageName()))? true: false;
       this.d = b;
       WifiManager systemServic = (b)? this.a.getSystemService("wifi"): null;
       this.e = systemServic;
       this.c = true;
       return this.d;
    }
}
