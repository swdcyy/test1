package j9a.h$b;
import java.lang.Runnable;
import j9a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j9a.a;
import j9a.d;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import bf5.v;
import ekd.k1;

public class h$b implements Runnable	// class@002992
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$b.class, "1")) {
          return;
       }
       if (d.b().mUseNetSore != null) {
          int i = NetworkQualityEstimator.b();
          if (i >= 0 && i < d.b().weakNetworkThreshold) {
             this.b.P8(objArray, objArray, "netscore<15");
          }
       }
       k1.r(this.b.x, (long)(d.b().netScorePollInterval * 1000));
       return;
    }
}
