package az8.c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.os.SystemClock;
import hy.e;
import java.util.Objects;
import crd.b;
import lnc.b9;

public final class c implements g	// class@000343
{
    public final AdDetailVMFragment b;

    public void c(AdDetailVMFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(this.b.yh()){
          CommercialSplashTracker.E().P(SystemClock.elapsedRealtime());
       }
       p0 = e.G();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, e.class, "6")) {
          p0.L = SystemClock.elapsedRealtime();
       }
       b9.a(this.b.Y);
       return;
    }
}
