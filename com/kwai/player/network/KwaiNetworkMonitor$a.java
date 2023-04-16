package com.kwai.player.network.KwaiNetworkMonitor$a;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$e;
import com.kwai.player.network.KwaiNetworkMonitor;
import java.lang.Object;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$ConnectionType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$c;
import java.lang.Long;

public class KwaiNetworkMonitor$a implements KwaiNetworkMonitorAutoDetect$e	// class@0012ea
{
    public final KwaiNetworkMonitor a;

    public void KwaiNetworkMonitor$a(KwaiNetworkMonitor p0){
       this.a = p0;
       super();
    }
    public void a(KwaiNetworkMonitorAutoDetect$ConnectionType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor$a.class, "1")) {
          return;
       }
       this.a.updateCurrentConnectionType(p0);
       return;
    }
    public void b(KwaiNetworkMonitorAutoDetect$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor$a.class, "2")) {
          return;
       }
       this.a.notifyObserversOfNetworkConnect(p0);
       return;
    }
    public void onNetworkDisconnect(long p0){
       KwaiNetworkMonitor$a uoa = KwaiNetworkMonitor$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.notifyObserversOfNetworkDisconnect(p0);
       return;
    }
}
