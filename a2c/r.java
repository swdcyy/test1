package a2c.r;
import exc.l$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class r implements l$e	// class@00004f
{

    public void r(){
       super();
    }
    public Map a(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
}
