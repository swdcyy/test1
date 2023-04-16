package gib.d;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import gib.c;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.lang.Boolean;

public final class d implements Callable	// class@002af0
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public Object call(){
       Pair pair = PatchProxy.apply(null, this, d.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          IMBeautifyResponse iMBeautifyRe = c.c.c();
          boolean b = (iMBeautifyRe != null)? true: false;
          pair = new Pair(Boolean.valueOf(b), iMBeautifyRe);
       }
       return pair;
    }
}
