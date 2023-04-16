package aegon.chrome.net.AndroidNetworkLibrary;
import java.lang.Object;
import android.net.wifi.WifiInfo;
import android.os.Build$VERSION;
import android.content.Context;
import a0.f;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import b0.e;
import android.net.wifi.WifiManager;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.os.Parcelable;
import aegon.chrome.net.X509Util;
import java.security.cert.X509Certificate;
import java.lang.StringBuilder;
import java.security.KeyStore;
import java.lang.Integer;
import java.security.cert.Certificate;
import android.os.Process;
import a0.a;
import java.lang.Boolean;
import java.security.KeyStore$LoadStoreParameter;
import aegon.chrome.net.DnsStatus;
import b0.a;
import android.net.LinkProperties;
import java.util.List;
import b0.d;
import android.net.NetworkInfo;
import java.net.URLConnection;
import aegon.chrome.net.a;
import android.telephony.TelephonyManager;
import com.kwai.framework.deviceid.a;
import android.content.ContentResolver;
import java.util.Enumeration;
import java.net.NetworkInterface;
import aegon.chrome.net.AndroidNetworkLibrary$a;
import android.net.TrafficStats;
import i0.i;
import java.io.FileDescriptor;
import aegon.chrome.net.AndroidNetworkLibrary$b;
import android.os.ParcelFileDescriptor;
import aegon.chrome.net.AndroidNetworkLibrary$c;
import java.net.Socket;
import aegon.chrome.net.AndroidCertVerifyResult;

public class AndroidNetworkLibrary	// class@00006a
{
    public static Boolean a;
    public static Boolean b;

    public void AndroidNetworkLibrary(){
       super();
    }
    public static WifiInfo a(){
       TransportInfo transportInf;
       WifiInfo wifiInfo = null;
       if (AndroidNetworkLibrary.c()) {
          if (Build$VERSION.SDK_INT < 31) {
             return f.a().getSystemService("wifi").getConnectionInfo();
          }
          ConnectivityManager systemServic = f.a().getSystemService("connectivity");
          Network[] allNetworks = systemServic.getAllNetworks();
          int len = allNetworks.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return wifiInfo;
             }
             NetworkCapabilities networkCapab = systemServic.getNetworkCapabilities(allNetworks[i]);
             if (networkCapab != null && networkCapab.hasTransport(1)) {
                transportInf = e.a(networkCapab);
                if (transportInf != null && transportInf instanceof WifiInfo) {
                   break ;
                }
             }
             i = i + 1;
          }
          return transportInf;
       }else {
          Intent intent = UniversalReceiver.e(f.a(), wifiInfo, new IntentFilter("android.net.wifi.STATE_CHANGE"));
          if (intent != null) {
             return intent.getParcelableExtra("wifiInfo");
          }
          return wifiInfo;
       }
    }
    public static void addTestRootCertificate(byte[] p0){
       X509Util.c();
       Object j = X509Util.j;
       _monitor_enter(j);
       X509Util.e.setCertificateEntry("root_cert_"+Integer.toString(X509Util.e.size()), X509Util.a(p0));
       X509Util.g();
       _monitor_exit(j);
    }
    public static boolean b(){
       if (AndroidNetworkLibrary.a == null) {
          boolean b = (!a.a(f.a(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()))? true: false;
          AndroidNetworkLibrary.a = Boolean.valueOf(b);
       }
       return AndroidNetworkLibrary.a.booleanValue();
    }
    public static boolean c(){
       if (AndroidNetworkLibrary.b == null) {
          boolean b = (!a.a(f.a(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()))? true: false;
          AndroidNetworkLibrary.b = Boolean.valueOf(b);
       }
       return AndroidNetworkLibrary.b.booleanValue();
    }
    public static void clearTestRootCertificates(){
       X509Util.c();
       Object j = X509Util.j;
       try{
          _monitor_enter(j);
          X509Util.e.load(null);
          X509Util.g();
          _monitor_exit(e0);
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static DnsStatus getDnsStatus(Network p0){
       DnsStatus uDnsStatus = null;
       if (!AndroidNetworkLibrary.b()) {
          return uDnsStatus;
       }
       ConnectivityManager systemServic = f.a().getSystemService("connectivity");
       if (systemServic == null) {
          return uDnsStatus;
       }
       if (p0 == null) {
          p0 = a.a(systemServic);
       }
       if (p0 == null) {
          return uDnsStatus;
       }else {
          try{
             LinkProperties linkProperti = systemServic.getLinkProperties(p0);
             if (linkProperti == null) {
                return uDnsStatus;
             }else {
                List dnsServers = linkProperti.getDnsServers();
                String domains = linkProperti.getDomains();
                if (Build$VERSION.SDK_INT >= 28) {
                   return new DnsStatus(dnsServers, d.b(linkProperti), d.a(linkProperti), domains);
                }else {
                   return new DnsStatus(dnsServers, false, "", domains);
                }
             }
          }catch(java.lang.RuntimeException e0){
             return uDnsStatus;
          }
       }
    }
    public static boolean getIsCaptivePortal(){
       boolean b = false;
       if (Build$VERSION.SDK_INT < 23) {
          return b;
       }
       ConnectivityManager systemServic = f.a().getSystemService("connectivity");
       if (systemServic == null) {
          return b;
       }
       Network network = a.a(systemServic);
       if (network == null) {
          return b;
       }
       NetworkCapabilities networkCapab = systemServic.getNetworkCapabilities(network);
       if (networkCapab != null && networkCapab.hasCapability(17)) {
          b = true;
       }
       return b;
    }
    public static boolean getIsRoaming(){
       NetworkInfo activeNetwor = f.a().getSystemService("connectivity").getActiveNetworkInfo();
       if (activeNetwor == null) {
          return false;
       }
       return activeNetwor.isRoaming();
    }
    public static String getMimeTypeFromExtension(String p0){
       return URLConnection.guessContentTypeFromName("foo."+p0);
    }
    public static String getNetworkOperator(){
       String str;
       a uoa = a.a();
       if (uoa.b == null) {
          TelephonyManager telephonyMan = a.b();
          if (telephonyMan == null) {
             str = "";
          label_0019 :
             return str;
          }else {
             uoa.b = telephonyMan.getNetworkOperator();
          }
       }
       str = uoa.b;
       goto label_0019 ;
    }
    public static String getSimOperator(){
       String str;
       a uoa = a.a();
       if (uoa.c == null) {
          TelephonyManager telephonyMan = a.b();
          if (telephonyMan == null) {
             str = "";
          label_0019 :
             return str;
          }else {
             uoa.c = telephonyMan.getSimOperator();
          }
       }
       str = uoa.c;
       goto label_0019 ;
    }
    public static String getWifiSSID(){
       WifiInfo wifiInfo = AndroidNetworkLibrary.a();
       if (wifiInfo != null) {
          String str = a.f(wifiInfo);
          if (str != null && !str.equals("<unknown ssid>")) {
             return str;
          }
       }
       return "";
    }
    public static int getWifiSignalLevel(int p0){
       int rssi;
       if (f.a() == null) {
          return -1;
       }
       if (f.a().getContentResolver() == null) {
          return -1;
       }
       if (AndroidNetworkLibrary.c()) {
          WifiInfo wifiInfo = AndroidNetworkLibrary.a();
          if (wifiInfo == null) {
             return -1;
          }else {
             rssi = wifiInfo.getRssi();
          }
       }else {
          try{
             Intent intent = UniversalReceiver.e(f.a(), null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
             if (intent == null) {
                return -1;
             }else {
                rssi = intent.getIntExtra("newRssi", Integer.MIN_VALUE);
             }
          }catch(java.lang.IllegalArgumentException e0){
             return -1;
          }catch(java.lang.Exception e0){
          }
       }
       if (rssi == Integer.MIN_VALUE) {
          return -1;
       }else {
          rssi = WifiManager.calculateSignalLevel(rssi, p0);
          if (rssi < 0 || rssi >= p0) {
             goto label_004d ;
          }else {
             return rssi;
          }
       }
    }
    public static boolean haveOnlyLoopbackAddresses(){
       boolean b = false;
       try{
          Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
          if (networkInter == null) {
             return b;
          }
          while (true) {
             if (!networkInter.hasMoreElements()) {
                return true;
             }
             NetworkInterface networkInter1 = networkInter.nextElement();
             try{
                if (networkInter1.isUp() && !networkInter1.isLoopback()) {
                   break ;
                }
             }catch(java.net.SocketException e0){
                goto label_0008 ;
             }
          }
          return b;
       }catch(java.lang.Exception e1){
          "could not get network interfaces: "+e1;
          return b;
       }
    }
    public static boolean isCleartextPermitted(String p0){
       try{
          return AndroidNetworkLibrary$a.a().c(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return AndroidNetworkLibrary$a.a().b();
       }
    }
    public static boolean reportBadDefaultNetwork(){
       if (Build$VERSION.SDK_INT < 23) {
          return false;
       }
       ConnectivityManager systemServic = f.a().getSystemService("connectivity");
       if (systemServic == null) {
          return false;
       }
       a.d(systemServic, null, false);
       return true;
    }
    public static void tagSocket(int p0,int p1,int p2){
       FileDescriptor uFileDescrip;
       int threadStatsT = TrafficStats.getThreadStatsTag();
       if (p2 != threadStatsT) {
          TrafficStats.setThreadStatsTag(p2);
       }
       if (p1 != -1) {
          i.b(p1);
       }
       if (Build$VERSION.SDK_INT < 23) {
          uFileDescrip = AndroidNetworkLibrary$b.a(p0);
       }else {
          ParcelFileDescriptor parcelFileDe = ParcelFileDescriptor.adoptFd(p0);
          uFileDescrip = parcelFileDe.getFileDescriptor();
       }
       AndroidNetworkLibrary$c uoc = new AndroidNetworkLibrary$c(uFileDescrip);
       TrafficStats.tagSocket(uoc);
       uoc.close();
       if (null != null) {
          null.detachFd();
       }
       if (p2 != threadStatsT) {
          TrafficStats.setThreadStatsTag(threadStatsT);
       }
       if (p1 != -1) {
          i.a();
       }
       return;
    }
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] p0,String p1,String p2){
       int i = -1;
       try{
          return X509Util.i(p0, p1, p2);
       }catch(java.security.KeyStoreException e0){
          return new AndroidCertVerifyResult(e0);
       }catch(java.security.NoSuchAlgorithmException e0){
          return new AndroidCertVerifyResult(e0);
       }catch(java.lang.IllegalArgumentException e0){
          return new AndroidCertVerifyResult(e0);
       }
    }
}
