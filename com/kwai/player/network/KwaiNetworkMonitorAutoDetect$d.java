package com.kwai.player.network.KwaiNetworkMonitorAutoDetect$d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KwaiNetworkMonitorAutoDetect$d	// class@0012f5
{
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void KwaiNetworkMonitorAutoDetect$d(boolean p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public int a(){
       return this.c;
    }
    public int b(){
       return this.b;
    }
    public boolean c(){
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiNetworkMonitorAutoDetect$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NetworkState{connected="+this.a+", type="+this.b+", subtype="+this.c+", underlyingNetworkTypeForVpn="+this.d+", underlyingNetworkSubtypeForVpn="+this.e+'}';
    }
}
