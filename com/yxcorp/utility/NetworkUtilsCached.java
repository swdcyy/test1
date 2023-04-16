package com.yxcorp.utility.NetworkUtilsCached;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.String;
import android.net.NetworkInfo;
import ekd.e0;
import ekd.p0;
import android.net.wifi.WifiInfo;
import android.os.Build$VERSION;
import java.lang.Object;
import android.net.wifi.WifiManager;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.os.HandlerThread;
import com.yxcorp.utility.NetworkUtilsCached$ConnectivityReceiver;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import ekd.q0;
import android.os.Looper;
import android.os.Handler;
import com.yxcorp.utility.NetworkUtilsCached$a;
import java.util.Map;
import java.lang.StringBuilder;
import android.net.ConnectivityManager;
import com.kwai.performance.fluency.ipcproxy.lib.b;

public class NetworkUtilsCached	// class@0013fd
{
    public static boolean a = false;
    public static boolean b;
    public static NetworkInfo c;
    public static NetworkInfo d;
    public static NetworkInfo e;
    public static String f;
    public static String g;
    public static WifiInfo h;
    public static final Map i;

    static {
       NetworkUtilsCached.i = new ConcurrentHashMap();
    }
    public static String a(Context p0){
       return NetworkUtilsCached.f(NetworkUtilsCached.b(p0));
    }
    public static NetworkInfo b(Context p0){
       NetworkUtilsCached.p();
       return NetworkUtilsCached.e;
    }
    public static String c(){
       return p0.w(NetworkUtilsCached.b(e0.b));
    }
    public static String d(){
       NetworkUtilsCached.p();
       return NetworkUtilsCached.f;
    }
    public static WifiInfo e(Context p0){
       if (NetworkUtilsCached.h == null || !p0.z()) {
          NetworkUtilsCached.q(p0);
       }else if(NetworkUtilsCached.a){
          NetworkUtilsCached.p();
       }
       return NetworkUtilsCached.h;
    }
    public static String f(NetworkInfo p0){
       if (p0 != null && p0.isConnected()) {
          int type = p0.getType();
          if (type) {
             if (type == 1) {
                return p0.getTypeName();
             }
          }else {
             return NetworkUtilsCached.d();
          }
       }
       return "unknown";
    }
    public static NetworkInfo g(int p0){
       NetworkUtilsCached.p();
       if (p0 == 1) {
          return NetworkUtilsCached.d;
       }
       if (!p0) {
          return NetworkUtilsCached.c;
       }
       return null;
    }
    public static WifiInfo h(Context p0){
       if (Build$VERSION.SDK_INT < 24) {
          p0 = p0.getApplicationContext();
       }
       if (p0 == null) {
          return null;
       }else {
          try{
             return p0.getSystemService("wifi").getConnectionInfo();
          }catch(java.lang.Exception e3){
             Log.h("NetworkUtilsCached", "getWifiInfo error", e3);
             return v0;
          }
       }
    }
    public static void i(HandlerThread p0,long p1){
       try{
          String str = "NetworkUtilsCached";
          Log.g(str, "NetworkUtilsCached init");
          Context b = e0.b;
          NetworkUtilsCached.o(b);
          UniversalReceiver.e(b, new NetworkUtilsCached$ConnectivityReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          if (p1 - false <= 0 || p0.D()) {
             Log.g(str, "initHandler not start update interval");
          }else {
             p0.start();
             new q0(p0.getLooper(), p1, b).sendEmptyMessageDelayed(0, p1);
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public static boolean j(){
       NetworkUtilsCached.p();
       NetworkInfo c = NetworkUtilsCached.c;
       boolean b = (c != null && c.isConnected())? true: false;
       return b;
    }
    public static boolean k(){
       return NetworkUtilsCached.b;
    }
    public static boolean l(){
       NetworkUtilsCached.p();
       NetworkInfo d = NetworkUtilsCached.d;
       boolean b = (d != null && d.isConnected())? true: false;
       return b;
    }
    public static void m(NetworkUtilsCached$a p0){
       NetworkUtilsCached.i.put(p0, new Object());
    }
    public static void n(NetworkUtilsCached$a p0){
       NetworkUtilsCached.i.remove(p0);
    }
    public static void o(Context p0){
       boolean b = false;
       NetworkUtilsCached.a = b;
       Log.g("NetworkUtilsCached", "sNetworkChanged=false");
       if (p0.z()) {
          NetworkUtilsCached.q(p0);
          Log.g("NetworkUtilsCached", "updateNetworkInfo: sWifiInfo: "+NetworkUtilsCached.h);
       }
       ConnectivityManager uConnectivit = p0.k(p0);
       if (uConnectivit == null) {
          return;
       }else {
          try{
             NetworkUtilsCached.e = uConnectivit.getActiveNetworkInfo();
             NetworkUtilsCached.c = uConnectivit.getNetworkInfo(b);
             NetworkUtilsCached.d = uConnectivit.getNetworkInfo(1);
             NetworkUtilsCached.f = p0.i(p0);
             NetworkUtilsCached.g = p0.v(p0);
             Log.g("NetworkUtilsCached", "updateNetworkInfo: sCellularGeneration: "+NetworkUtilsCached.f+" sNetworkTypeForAzeroth: "+NetworkUtilsCached.g+" isNetworkConnected: "+NetworkUtilsCached.b+" getActiveNetworkGeneration: "+NetworkUtilsCached.f(NetworkUtilsCached.e));
          }catch(java.lang.Exception e4){
             Log.e("NetworkUtilsCached", "exception while trying to get network info", e4);
          }
          return;
       }
    }
    public static void p(){
       if (!NetworkUtilsCached.a) {
          return;
       }
       NetworkUtilsCached.o(e0.b);
       return;
    }
    public static void q(Context p0){
       try{
          NetworkUtilsCached.h = b.e();
       }catch(java.lang.Exception e0){
          Log.d("NetworkUtilsCached", "BinderProxy getConnectionInfo error");
          NetworkUtilsCached.h = NetworkUtilsCached.h(p0);
       }
       return;
    }
}
