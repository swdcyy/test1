package com.ks.ksuploader.KSNetworkManager$1;
import android.net.ConnectivityManager$NetworkCallback;
import com.ks.ksuploader.KSNetworkManager;
import android.net.Network;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.ks.ksuploader.KSUploaderLogLevel;
import com.ks.ksuploader.KSUploader;

public class KSNetworkManager$1 extends ConnectivityManager$NetworkCallback	// class@000750
{
    public final KSNetworkManager this$0;

    public void KSNetworkManager$1(KSNetworkManager p0){
       this.this$0 = p0;
       super();
    }
    public void onAvailable(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSNetworkManager$1.class, "1")) {
          return;
       }
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       KSNetworkManager.mWifiNetwork = p0;
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: wifi network onAvailable");
       _monitor_exit(mStaticLock);
       return;
    }
    public void onUnavailable(){
       if (PatchProxy.applyVoid(null, this, KSNetworkManager$1.class, "2")) {
          return;
       }
       Object mStaticLock = KSNetworkManager.mStaticLock;
       _monitor_enter(mStaticLock);
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: wifi network onUnavailable");
       KSNetworkManager.mWifiNetwork = null;
       _monitor_exit(mStaticLock);
       return;
    }
}
