package goa.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cra.w;
import q87.c;

public final class i implements g	// class@002b47
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          a.p(p0, "throwable");
          Object[] objArray = new Object[0];
          w.C().t("GrowthModule", p0.getLocalizedMessage(), objArray);
       }
       return;
    }
}
