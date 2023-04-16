package cra.b$a$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import cra.b;

public final class b$a$b implements g	// class@002376
{
    public static final b$a$b b;

    static {
       b$a$b.b = new b$a$b();
    }
    public void b$a$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          w.C().w("AppListUploadUtil", "upload failure: "+p0.getMessage(), objArray);
          b.a(b.b, 0);
       }
       return;
    }
}
