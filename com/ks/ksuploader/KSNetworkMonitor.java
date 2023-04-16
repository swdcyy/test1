package com.ks.ksuploader.KSNetworkMonitor;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.telephony.TelephonyManager;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.StringBuilder;
import com.ks.ksuploader.KSUploader;
import java.lang.Throwable;
import android.util.Log;
import com.ks.ksuploader.KSNetworkMonitor$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import java.lang.Boolean;

public class KSNetworkMonitor	// class@000756
{
    public static boolean mInited;

    public void KSNetworkMonitor(){
       super();
    }
    public static String emptyStringIfNull(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static String getMobileType(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSNetworkMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       int i = 0;
       if (systemServic != null) {
          try{
             i = systemServic.getNetworkType();
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "[KSNetworkMonitor] getMobileType mobileType:"+i);
          }catch(java.lang.RuntimeException e4){
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "[KSNetworkMonitor] getMobileType fail, exception:"+Log.getStackTraceString(e4));
          }
       }
    }
    public static void initNetworkChangeReceiver(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSNetworkMonitor.class, "1")) {
          return;
       }
       _monitor_enter(KSNetworkMonitor.class);
       if (KSNetworkMonitor.mInited) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "[KSNetworkMonitor] initNetworkChangeReceiver already inited");
          _monitor_exit(KSNetworkMonitor.class);
          return;
       }else if(p0 != null){
          UniversalReceiver.e(p0.getApplicationContext(), new KSNetworkMonitor$1(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          KSNetworkMonitor.mInited = true;
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "[KSNetworkMonitor] initNetworkChangeReceiver");
       }else {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "[KSNetworkMonitor] initNetworkChangeReceiver fail, context is null");
       }
       _monitor_exit(KSNetworkMonitor.class);
       return;
    }
    public static void onNetworkChange(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSNetworkMonitor.class, "2")) {
          return;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       String mobileType = KSNetworkMonitor.getMobileType(p0);
       if (systemServic != null) {
          NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
          if (activeNetwor == null) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "[KSNetworkMonitor] get ConnectivityManager ok, get getActiveNetworkInfo fail, current supportMobileType: "+mobileType);
             KSNetworkMonitor.onNetworkInvalidated();
          }else {
             KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
             StringBuilder str = "[KSNetworkMonitor] get ConnectivityManager ok, get getActiveNetworkInfo ok, isConnected: "+activeNetwor.isConnected()+", isWifi:";
             boolean b = false;
             boolean b1 = (activeNetwor.getType() == 1)? true: false;
             KSUploader.postLog(kSUploaderLo, str+b1+", netTypeName:"+activeNetwor.getTypeName()+", connectionState:"+activeNetwor.getState().toString()+", getExtraInfo:"+activeNetwor.getExtraInfo()+", supportMobileType:"+mobileType);
             boolean b2 = activeNetwor.isConnected();
             if (activeNetwor.getType() == 1) {
                b = true;
             }
             KSNetworkMonitor.onNewActiveNetwork(b2, b);
          }
       }else {
          KSNetworkMonitor.onNetworkInvalidated();
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "[KSNetworkMonitor] get ConnectivityManager fail, current supportMobileType:"+mobileType);
       }
       return;
    }
    public static void onNetworkInvalidated(){
       if (PatchProxy.applyVoid(null, null, KSNetworkMonitor.class, "3")) {
          return;
       }
       KSUploader.networkChanged(0, "::");
       return;
    }
    public static void onNewActiveNetwork(boolean p0,boolean p1){
       if (PatchProxy.isSupport(KSNetworkMonitor.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, KSNetworkMonitor.class, "4")) {
          return;
       }
       int i = (p1)? 2: 1;
       KSUploader.networkChanged(i, "::");
       return;
    }
}
