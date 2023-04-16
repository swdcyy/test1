package cd7.b;
import erd.g;
import com.kwai.nearby.local.pendant.NearbyPendantView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b implements g	// class@000532
{
    public final NearbyPendantView b;
    public final String c;

    public void b(NearbyPendantView p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          this.b.e();
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
