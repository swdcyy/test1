package com.kwai.player.network.KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Parcelable;
import android.net.wifi.p2p.WifiP2pGroup;
import java.net.NetworkInterface;
import java.util.Enumeration;
import com.kwai.framework.deviceid.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$b;
import java.net.InetAddress;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$c;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$ConnectionType;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$e;
import java.lang.Integer;

public class KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate extends BroadcastReceiver	// class@0012f1
{
    public final Context a;
    public final KwaiNetworkMonitorAutoDetect$e b;
    public KwaiNetworkMonitorAutoDetect$c c;

    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class, "1")) {
          return;
       }
       int i = 0;
       if (("android.net.wifi.p2p.CONNECTION_STATE_CHANGE").equals(p1.getAction())) {
          WifiP2pGroup parcelableEx = p1.getParcelableExtra("p2pGroupInfo");
          if (PatchProxy.applyVoidOneRefs(parcelableEx, this, KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class, "4") || (parcelableEx != null && parcelableEx.getInterface() != null)) {
             try{
                ArrayList uArrayList = Collections.list(a.c(NetworkInterface.getByName(parcelableEx.getInterface())));
                KwaiNetworkMonitorAutoDetect$b[] uobArray = new KwaiNetworkMonitorAutoDetect$b[uArrayList.size()];
                for (; i < uArrayList.size(); i = i + 1) {
                   uobArray[i] = new KwaiNetworkMonitorAutoDetect$b(uArrayList.get(i));
                }
                KwaiNetworkMonitorAutoDetect$c uoc = new KwaiNetworkMonitorAutoDetect$c(parcelableEx.getInterface(), KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI, KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE, 0, uobArray);
                this.c = uArrayList;
                this.b.b(uArrayList);
             }catch(java.net.SocketException e0){
             }
          }
       }else if(("android.net.wifi.p2p.STATE_CHANGED").equals(p1.getAction())){
          int intExtra = p1.getIntExtra("wifi_p2p_state", i);
          if (PatchProxy.isSupport(KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(intExtra), this, KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class, "5") && intExtra == 1)) {
             this.c = null;
             this.b.onNetworkDisconnect(0);
          }
       }
       return;
    }
}
