package k3a.h;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.i;

public final class h extends a	// class@002bca
{
    public int e;
    public int f;

    public void h(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
}
