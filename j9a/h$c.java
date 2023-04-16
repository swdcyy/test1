package j9a.h$c;
import java.lang.Runnable;
import j9a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import j9a.d;
import java.lang.StringBuilder;
import j9a.c;
import com.kuaishou.aegon.NetworkSwitchCallback;
import com.kuaishou.aegon.NetworkActivationHelper;
import j9a.a;
import ekd.k1;

public class h$c implements Runnable	// class@002993
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$c.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w(this.b.p, "mWifiCheckRunnable", objArray1);
       if (d.c() || (d.a() && !PatchProxy.applyVoid(objArray, objArray, d.class, "6"))) {
          Object[] objArray2 = new Object[0];
          o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "switchToWifiNetWork£ºmSpeedUrl£º"+d.f, objArray2);
          objArray = 1;
          if (d.e == objArray) {
             objArray = new Object[0];
             o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "switchToWifiNetWork£ºmCurrNetType == NET_TYPE_UNCHANGED", objArray);
          }else {
             NetworkActivationHelper.b(objArray, 0, d.f, new c());
          }
       }
       k1.r(this.b.y, (long)(d.b().wifiPollInterval * 1000));
       return;
    }
}
