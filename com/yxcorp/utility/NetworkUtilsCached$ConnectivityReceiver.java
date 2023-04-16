package com.yxcorp.utility.NetworkUtilsCached$ConnectivityReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import com.yxcorp.utility.NetworkUtilsCached$a;

public class NetworkUtilsCached$ConnectivityReceiver extends BroadcastReceiver	// class@0013fb
{

    public void NetworkUtilsCached$ConnectivityReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (!this.isInitialStickyBroadcast()) {
          NetworkUtilsCached.a = true;
          Log.g("NetworkUtilsCached", "sNetworkChanged=true");
       }
       NetworkUtilsCached.b = p1.getBooleanExtra("noConnectivity", false) ^ true;
       Log.g("NetworkUtilsCached", "sNetworkConnected="+NetworkUtilsCached.b);
       Iterator iterator = NetworkUtilsCached.i.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().onNetworkChanged();
       }
       return;
    }
}
