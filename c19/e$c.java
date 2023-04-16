package c19.e$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class e$c implements g	// class@0004c7
{
    public static final e$c b;

    static {
       e$c.b = new e$c();
    }
    public void e$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          j0.b("ThanosOrderedAppLabel", "screenVisibilityPublisher exception: ", p0);
       }
       return;
    }
}
