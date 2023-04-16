package m49.e$a;
import erd.g;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class e$a implements g	// class@002df6
{
    public static final e$a b;

    static {
       e$a.b = new e$a();
    }
    public void e$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.a("AdStoragePermission", "storage permission state is "+p0.b, objArray);
       }
       return;
    }
}
