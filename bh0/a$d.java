package bh0.a$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bh0.a;
import java.util.List;
import bh0.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class a$d implements g	// class@000383
{
    public static final a$d b;

    static {
       a$d.b = new a$d();
    }
    public void a$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          b.r(a.G.a(), "request failed : "+p0);
       }
       return;
    }
}
