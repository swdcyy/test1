package aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import b0.a;
import android.net.NetworkCapabilities;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$i;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import aegon.chrome.net.DnsStatus;
import aegon.chrome.net.AndroidNetworkLibrary;
import android.net.NetworkInfo$DetailedState;
import aegon.chrome.base.ApplicationStatus;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Handler;
import b0.c;
import java.net.Socket;
import android.os.StrictMode$VmPolicy;
import android.os.StrictMode;
import a0.s;
import java.lang.Throwable;

public class NetworkChangeNotifierAutoDetect$c	// class@000075
{
    public final ConnectivityManager a;
    public static final boolean b;

    static {
    }
    public void NetworkChangeNotifierAutoDetect$c(){
       super();
       this.a = null;
    }
    public void NetworkChangeNotifierAutoDetect$c(Context p0){
       super();
       this.a = p0.getSystemService("connectivity");
    }
    public int a(Network p0){
       NetworkInfo networkInfo = this.d(p0);
       if (networkInfo != null && networkInfo.isConnected()) {
          return NetworkChangeNotifierAutoDetect.d(networkInfo.getType(), networkInfo.getSubtype());
       }
       return 6;
    }
    public Network b(){
       Network network1;
       NetworkInfo activeNetwor;
       NetworkChangeNotifierAutoDetect$c ta = this.a;
       Network network = null;
       if (ta == null) {
          return network;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          network1 = a.a(ta);
          if (network1 != null) {
             return network1;
          }
       }else {
          network1 = network;
       }
       try{
          activeNetwor = this.a.getActiveNetworkInfo();
       }catch(java.lang.Exception e0){
          activeNetwor = network;
       }
       if (activeNetwor == null) {
          return network;
       }else {
          Network[] networkArray = NetworkChangeNotifierAutoDetect.e(this, network);
          int len = networkArray.length;
          int i = 0;
          while (i < len) {
             object oobject = networkArray[i];
             NetworkInfo networkInfo = this.f(oobject);
             if (networkInfo != null && (networkInfo.getType() == activeNetwor.getType() || networkInfo.getType() == 17)) {
                network1 = oobject;
             }
             i = i + 1;
          }
          return e0;
       }
    }
    public NetworkCapabilities c(Network p0){
       int i = 0;
    label_0001 :
       if (i < 2) {
          return this.a.getNetworkCapabilities(p0);
       }
       return null;
    }
    public NetworkInfo d(Network p0){
       NetworkInfo networkInfo = this.f(p0);
       if (this.a != null && (networkInfo != null && networkInfo.getType() == 17)) {
          networkInfo = this.a.getActiveNetworkInfo();
       }
    label_0018 :
       return networkInfo;
    }
    public NetworkChangeNotifierAutoDetect$f e(NetworkChangeNotifierAutoDetect$i p0){
       NetworkChangeNotifierAutoDetect$f uof;
       Network network;
       NetworkInfo networkInfo;
       NetworkChangeNotifierAutoDetect$f uof1;
       NetworkChangeNotifierAutoDetect$c uoc = this;
       NetworkChangeNotifierAutoDetect$c a = uoc.a;
       if (a == null) {
          uof = new NetworkChangeNotifierAutoDetect$f(false, -1, -1, null, false, "");
          return a;
       }else if(Build$VERSION.SDK_INT >= 23){
          network = this.b();
          networkInfo = uoc.d(network);
       }else {
          networkInfo = a.getActiveNetworkInfo();
          network = null;
       }
       networkInfo = uoc.g(networkInfo);
       if (networkInfo == null) {
          uof1 = new NetworkChangeNotifierAutoDetect$f(false, -1, -1, null, false, "");
          return network;
       }else if(network != null){
          DnsStatus dnsStatus = AndroidNetworkLibrary.getDnsStatus(network);
          if (dnsStatus == null) {
             NetworkChangeNotifierAutoDetect$f uof2 = new NetworkChangeNotifierAutoDetect$f(true, networkInfo.getType(), networkInfo.getSubtype(), String.valueOf(NetworkChangeNotifierAutoDetect.g(network)), false, "");
             return dnsStatus;
          }else {
             NetworkChangeNotifierAutoDetect$f uof3 = new NetworkChangeNotifierAutoDetect$f(true, networkInfo.getType(), networkInfo.getSubtype(), String.valueOf(NetworkChangeNotifierAutoDetect.g(network)), dnsStatus.getPrivateDnsActive(), dnsStatus.getPrivateDnsServerName());
             return v4;
          }
       }else if(networkInfo.getType() == 1){
          if (networkInfo.getExtraInfo() != null && !("").equals(networkInfo.getExtraInfo())) {
             uof1 = new NetworkChangeNotifierAutoDetect$f(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo(), false, "");
             return network;
          }else {
             NetworkChangeNotifierAutoDetect$f uof4 = new NetworkChangeNotifierAutoDetect$f(true, networkInfo.getType(), networkInfo.getSubtype(), p0.a(), false, "");
             return network;
          }
       }else {
          uof = new NetworkChangeNotifierAutoDetect$f(true, networkInfo.getType(), networkInfo.getSubtype(), null, false, "");
          return network;
       }
    }
    public NetworkInfo f(Network p0){
       try{
          return this.a.getNetworkInfo(p0);
       }catch(java.lang.Exception e0){
          try{
             return this.a.getNetworkInfo(p0);
          }catch(java.lang.Exception e0){
             return null;
          }
       }
    }
    public final NetworkInfo g(NetworkInfo p0){
       if (p0 == null) {
          return null;
       }
       if (p0.isConnected()) {
          return p0;
       }
       if (p0.getDetailedState() != NetworkInfo$DetailedState.BLOCKED) {
          return null;
       }
       if (ApplicationStatus.getStateForApplication() != 1) {
          return null;
       }
       return p0;
    }
    public void h(NetworkRequest p0,ConnectivityManager$NetworkCallback p1,Handler p2){
       if (Build$VERSION.SDK_INT >= 26) {
          c.c(this.a, p0, p1, p2);
       }else {
          this.a.registerNetworkCallback(p0, p1);
       }
       return;
    }
    public void i(ConnectivityManager$NetworkCallback p0){
       this.a.unregisterNetworkCallback(p0);
    }
    public boolean j(Network p0){
       try{
          Socket socket = new Socket();
          StrictMode.setVmPolicy(StrictMode$VmPolicy.LAX);
          s os = new s(StrictMode.getVmPolicy());
          p0.bindSocket(socket);
          try{
             os.close();
             socket.close();
             return true;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          e0.close();
          return false;
       }
    }
}
