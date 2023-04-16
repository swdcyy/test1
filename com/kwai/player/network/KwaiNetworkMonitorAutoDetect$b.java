package com.kwai.player.network.KwaiNetworkMonitorAutoDetect$b;
import java.net.InetAddress;
import java.lang.Object;
import java.lang.String;

public class KwaiNetworkMonitorAutoDetect$b	// class@0012f3
{
    public final byte[] a;
    public final String b;

    public void KwaiNetworkMonitorAutoDetect$b(InetAddress p0){
       super();
       this.a = p0.getAddress();
       this.b = p0.getHostAddress();
    }
}
