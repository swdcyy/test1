package com.ks.ksuploader.KSNetworkManager;
import java.lang.Object;
import android.content.Context;
import android.net.Network;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.ks.ksuploader.KSUploaderLogLevel;
import com.ks.ksuploader.KSUploader;
import androidx.core.content.ContextCompat;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;
import com.ks.ksuploader.KSNetworkManager$1;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import com.ks.ksuploader.KSNetworkManager$2;
import com.ks.ksuploader.KSNetworkManager$3;

public class KSNetworkManager	// class@000753
{
    public Context mContext;
    public static ConnectivityManager mConnManager;
    public static Network mEthernetNetwork;
    public static ConnectivityManager$NetworkCallback mEthernetNetworkCallback;
    public static Network mMobileNetwork;
    public static ConnectivityManager$NetworkCallback mMobileNetworkCallback;
    public static Object mStaticLock;
    public static Network mWifiNetwork;
    public static ConnectivityManager$NetworkCallback mWifiNetworkCallback;

    static {
       KSNetworkManager.mStaticLock = new Object();
    }
    public void KSNetworkManager(Context p0){
       super();
       this.mContext = p0;
    }
    public static Network getEthernetNetwork(){
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       _monitor_exit(mStaticLock);
       return KSNetworkManager.mEthernetNetwork;
    }
    public static Network getMobileNetwork(){
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       _monitor_exit(mStaticLock);
       return KSNetworkManager.mMobileNetwork;
    }
    public static Network getWifiNetwork(){
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       _monitor_exit(mStaticLock);
       return KSNetworkManager.mWifiNetwork;
    }
    public void prepareMultiNetwork(){
       if (PatchProxy.applyVoid(null, this, KSNetworkManager.class, "1")) {
          return;
       }
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       if (KSNetworkManager.mWifiNetworkCallback != null && (KSNetworkManager.mMobileNetworkCallback != null && KSNetworkManager.mEthernetNetworkCallback != null)) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: prepareMultiNetwork callbacks already set, no need to request again");
          _monitor_exit(mStaticLock);
          return;
       }else if(ContextCompat.checkSelfPermission(this.mContext, "android.permission.CHANGE_NETWORK_STATE")){
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: prepareMultiNetwork CHANGE_NETWORK_STATE permission not granted");
          _monitor_exit(mStaticLock);
          return;
       }else if(Build$VERSION.SDK_INT >= 23){
          KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
          KSUploader.postLog(kSUploaderLo, "multiNic: prepareMultiNetwork");
          if (KSNetworkManager.mConnManager == null) {
             KSNetworkManager.mConnManager = this.mContext.getSystemService("connectivity");
          }
          KSNetworkManager.mWifiNetworkCallback = new KSNetworkManager$1(this);
          NetworkRequest$Builder uBuilder = new NetworkRequest$Builder();
          uBuilder.addTransportType(1);
          KSNetworkManager.mConnManager.requestNetwork(uBuilder.build(), KSNetworkManager.mWifiNetworkCallback);
          KSNetworkManager.mMobileNetworkCallback = new KSNetworkManager$2(this);
          uBuilder = new NetworkRequest$Builder();
          uBuilder.addCapability(12);
          uBuilder.addTransportType(0);
          KSNetworkManager.mConnManager.requestNetwork(uBuilder.build(), KSNetworkManager.mMobileNetworkCallback);
          KSNetworkManager.mEthernetNetworkCallback = new KSNetworkManager$3(this);
          uBuilder = new NetworkRequest$Builder();
          uBuilder.addTransportType(3);
          KSNetworkManager.mConnManager.requestNetwork(uBuilder.build(), KSNetworkManager.mEthernetNetworkCallback);
          KSUploader.postLog(kSUploaderLo, "multiNic: network service requested");
       }else {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: Will not call prepareMultiNetwork as model too old");
       }
       _monitor_exit(mStaticLock);
       return;
    }
}
