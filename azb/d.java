package azb.d;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class d implements g	// class@000368
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthGuideConfigManager need preload "+p0+", preload success", objArray);
       }
       return;
    }
}
