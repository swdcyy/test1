package c86.b;
import c86.a;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.kgi.sdk.internal.init.KgiInitModule;

public class b implements a	// class@000669
{

    public void b(){
       super();
    }
    public a Kr(){
       KgiInitModule kgiInitModul = PatchProxy.apply(null, this, b.class, "1");
       if (kgiInitModul != PatchProxyResult.class) {
       }else {
          kgiInitModul = new KgiInitModule();
       }
       return kgiInitModul;
    }
    public boolean isAvailable(){
       return true;
    }
}
