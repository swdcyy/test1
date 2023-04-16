package com.kwai.player.network.KwaiNetworkMonitor$d;
import com.kwai.player.network.IKwaiNetwork;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$c;
import com.kwai.player.network.KwaiNetworkMonitor$c;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class KwaiNetworkMonitor$d implements IKwaiNetwork	// class@0012ed
{
    public final List a;

    public void KwaiNetworkMonitor$d(List p0){
       super();
       this.a = new ArrayList();
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          KwaiNetworkMonitorAutoDetect$c uoc = iterator.next();
          KwaiNetworkMonitorAutoDetect$c e = uoc.e;
          if (e != null) {
             int len = e.length;
             for (int i = 0; i < len; i = i + 1) {
                this.a.add(new KwaiNetworkMonitor$c(e[i].b, uoc.d));
             }
          }
       }
       return;
    }
    public String getNetworkAddress(int p0){
       KwaiNetworkMonitor$d uod = KwaiNetworkMonitor$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.get(p0).a;
    }
    public int getNetworkCount(){
       Object obj = PatchProxy.apply(null, this, KwaiNetworkMonitor$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
    public long getNetworkHandle(int p0){
       KwaiNetworkMonitor$d uod = KwaiNetworkMonitor$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.a.get(p0).b;
    }
}
