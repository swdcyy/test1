package azb.e$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class e$d implements g	// class@00036c
{
    public static final e$d b;

    static {
       e$d.b = new e$d();
    }
    public void e$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthGuideInfoRepo requestGuideInfo failed, "+p0.getMessage(), objArray);
       }
       return;
    }
}
