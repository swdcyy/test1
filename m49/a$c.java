package m49.a$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class a$c implements g	// class@002deb
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.c("AdStoragePermission", p0.toString(), objArray);
       }
       return;
    }
}
