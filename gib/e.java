package gib.e;
import erd.g;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gib.c;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;

public final class e implements g	// class@002af1
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          c.c.d(p0.getSecond());
       }
       return;
    }
}
