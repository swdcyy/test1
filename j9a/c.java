package j9a.c;
import com.kuaishou.aegon.NetworkSwitchCallback;
import java.lang.Object;
import com.kuaishou.aegon.NetworkSwitchCallback$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import j9a.d;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import k2b.u1;

public class c implements NetworkSwitchCallback	// class@00298b
{

    public void c(){
       super();
    }
    public void a(NetworkSwitchCallback$Status p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (p0 == NetworkSwitchCallback$Status.NETWORK_SWITCH_SUCCESS) {
          Object[] objArray = new Object[0];
          o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "Switch wifi success:", objArray);
          d.e = 1;
          if (!PatchProxy.applyVoid(null, null, d.class, "13")) {
             i3 oi3 = i3.f();
             oi3.c("time", Long.valueOf((System.currentTimeMillis() - d.g)));
             u1.R("TIME_SWITCH_NET_WORK", oi3.toString(), 14);
          }
       }
       return;
    }
    public void onError(String p0){
    }
}
