package com.kwai.video.ksuploaderkit.utils.NetUtils$1;
import android.net.ConnectivityManager$NetworkCallback;
import com.kwai.video.ksuploaderkit.utils.NetUtils;
import android.net.Network;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.NetworkInfo$State;

public class NetUtils$1 extends ConnectivityManager$NetworkCallback	// class@0009e1
{
    public final NetUtils this$0;

    public void NetUtils$1(NetUtils p0){
       this.this$0 = p0;
       super();
    }
    public void onAvailable(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetUtils$1.class, "2")) {
          return;
       }
       super.onAvailable(p0);
       NetUtils mNetStateLoc = this.this$0.mNetStateLock;
       _monitor_enter(mNetStateLoc);
       this.this$0.mNetState = NetworkInfo$State.CONNECTED;
       _monitor_exit(mNetStateLoc);
       return;
    }
    public void onLost(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetUtils$1.class, "1")) {
          return;
       }
       super.onLost(p0);
       NetUtils mNetStateLoc = this.this$0.mNetStateLock;
       _monitor_enter(mNetStateLoc);
       this.this$0.mNetState = NetworkInfo$State.DISCONNECTED;
       _monitor_exit(mNetStateLoc);
       return;
    }
}
