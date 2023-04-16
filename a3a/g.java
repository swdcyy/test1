package a3a.g;
import vvb.a;
import vvb.c;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import a3a.f;
import qvb.f;
import java.util.ArrayList;

public class g extends c implements a	// class@000028
{

    public void g(){
       super();
    }
    public List z0(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k() instanceof f) {
          return this.k().z0();
       }
       return new ArrayList();
    }
}
