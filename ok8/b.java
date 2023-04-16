package ok8.b;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import ok8.f;
import java.lang.Enum;
import java.util.Objects;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import java.lang.CharSequence;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.List;
import java.net.InterfaceAddress;
import java.util.Locale;
import java.lang.Integer;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import v1.a;
import com.facebook.react.bridge.ReadableMap;
import ok8.d;
import java.lang.Boolean;
import ok8.a;
import ab.h;

public abstract class b	// class@003264
{
    public final ConnectivityManager a;
    public final WifiManager b;
    public final TelephonyManager c;
    public final Context d;
    public ConnectionType e;
    public CellularGeneration f;
    public boolean g;
    public Boolean h;
    public d i;

    public void b(ReactApplicationContext p0){
       super();
       this.e = ConnectionType.UNKNOWN;
       this.f = null;
       this.g = false;
       this.i = null;
       Context applicationC = p0.getApplicationContext();
       this.d = applicationC;
       this.a = applicationC.getSystemService("connectivity");
       this.b = applicationC.getApplicationContext().getSystemService("wifi");
       this.c = applicationC.getSystemService("phone");
    }
    public WritableMap a(String p0){
       WritableMap writableMap = Arguments.createMap();
       if (f.a(this.c())) {
          writableMap.putBoolean("isWifiEnabled", this.b.isWifiEnabled());
       }
       String str = (p0 != null)? p0: this.e.label;
       writableMap.putString("type", str);
       int i = 1;
       int i1 = 0;
       boolean b = (!this.e.equals(ConnectionType.NONE) && !this.e.equals(ConnectionType.UNKNOWN))? true: false;
       writableMap.putBoolean("isConnected", b);
       boolean b1 = (this.g != null && (p0 == null || p0.equals(this.e.label)))? true: false;
       writableMap.putBoolean("isInternetReachable", b1);
       if (p0 == null) {
          ConnectionType label = this.e.label;
       }
       WritableMap writableMap1 = Arguments.createMap();
       Objects.requireNonNull(p0);
       if (!p0.equals("cellular")) {
          try{
             if (p0.equals("wifi") && f.a(this.c())) {
                WifiInfo connectionIn = this.b.getConnectionInfo();
                if (connectionIn != null) {
                   String str1 = a.f(connectionIn);
                   if (str1 != null && !str1.contains("<unknown ssid>")) {
                      writableMap1.putString("ssid", str1.replace("\"", ""));
                   }
                label_00a9 :
                   str1 = a.a(connectionIn);
                   if (str1 != null) {
                      writableMap1.putString("bssid", str1);
                   }
                   writableMap1.putInt("strength", WifiManager.calculateSignalLevel(connectionIn.getRssi(), 100));
                   writableMap1.putInt("frequency", connectionIn.getFrequency());
                   byte[] uobyteArray = BigInteger.valueOf((long)a.e(connectionIn)).toByteArray();
                   f.b(uobyteArray);
                   writableMap1.putString("ipAddress", InetAddress.getByAddress(uobyteArray).getHostAddress());
                   try{
                      byte[] uobyteArray1 = BigInteger.valueOf((long)a.e(connectionIn)).toByteArray();
                      f.b(uobyteArray1);
                      int i2 = -1 << (a.d(a.b(InetAddress.getByAddress(uobyteArray1))).get(i).getNetworkPrefixLength() - 32);
                      Object[] objArray = new Object[]{Integer.valueOf(((i2 >> 24) & 0x00ff)),Integer.valueOf(((i2 >> 16) & 0x00ff)),Integer.valueOf(((i2 >> 8) & 0x00ff)),Integer.valueOf((i2 & 0x00ff))};
                      writableMap1.putString("subnet", String.format(Locale.US, "%d.%d.%d.%d", objArray));
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e0){
          }
       }else {
          b tf = this.f;
          if (tf != null) {
             writableMap1.putString("cellularGeneration", tf.label);
          }
          tf = this.c.getNetworkOperatorName();
          if (tf != null) {
             writableMap1.putString("carrier", tf);
          }
       }
    }
    public ConnectivityManager b(){
       return this.a;
    }
    public Context c(){
       return this.d;
    }
    public abstract void d();
    public void e(d p0){
       this.i = p0;
    }
    public abstract void f();
    public void g(ConnectionType p0,CellularGeneration p1,boolean p2){
       b th = this.h;
       if (th == null) {
       }else {
          p2 = th.booleanValue();
       }
       int i = 1;
       th = (p0 != this.e)? 1: 0;
       int i1 = (p1 != this.f)? 1: 0;
       if (p2 == this.g) {
          i = 0;
       }
       if (!th && (i1 || i)) {
          this.e = p0;
          this.f = p1;
          this.g = p2;
          a uoa = new a(this);
          b ti = this.i;
          if (ti != null) {
             ti.d("netInfo.networkStatusDidChange", uoa);
          }
       }
       return;
    }
}
