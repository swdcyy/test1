package aegon.chrome.base.RadioUtils;
import java.lang.Object;
import android.content.Context;
import a0.f;
import android.os.Process;
import java.lang.String;
import a0.a;
import java.lang.Boolean;
import android.telephony.TelephonyManager;
import android.telephony.SignalStrength;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;
import android.net.Network;
import b0.a;
import android.net.NetworkCapabilities;

public class RadioUtils	// class@000151
{
    public static Boolean a;
    public static Boolean b;
    public static final boolean c;

    public void RadioUtils(){
       super();
    }
    public static boolean a(){
       if (RadioUtils.a == null) {
          boolean b = (!a.a(f.a(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()))? true: false;
          RadioUtils.a = Boolean.valueOf(b);
       }
       return RadioUtils.a.booleanValue();
    }
    public static boolean b(){
       if (RadioUtils.b == null) {
          boolean b = (!a.a(f.a(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()))? true: false;
          RadioUtils.b = Boolean.valueOf(b);
       }
       return RadioUtils.b.booleanValue();
    }
    public static int getCellDataActivity(){
       TelephonyManager systemServic = f.a().getSystemService("phone");
       try{
          return systemServic.getDataActivity();
       }catch(java.lang.SecurityException e0){
          return -1;
       }
    }
    public static int getCellSignalLevel(){
       TelephonyManager systemServic = f.a().getSystemService("phone");
       try{
          int i = -1;
          SignalStrength signalStreng = systemServic.getSignalStrength();
          if (signalStreng != null) {
             i = signalStreng.getLevel();
          }
          return i;
       }catch(java.lang.SecurityException e0){
       }
    }
    public static boolean isSupported(){
       boolean b = (Build$VERSION.SDK_INT >= 28 && (RadioUtils.a() && RadioUtils.b()))? true: false;
       return b;
    }
    public static boolean isWifiConnected(){
       ConnectivityManager systemServic = f.a().getSystemService("connectivity");
       Network network = a.a(systemServic);
       if (network == null) {
          return false;
       }
       NetworkCapabilities networkCapab = systemServic.getNetworkCapabilities(network);
       if (networkCapab == null) {
          return false;
       }
       return networkCapab.hasTransport(1);
    }
}
