package ac4.l;
import ac4.j;
import java.lang.Object;
import yt3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.support.bridge.MerchantBridgeModuleImpl;
import vt3.b;
import com.kuaishou.merchant.support.bridge.c;

public class l implements j	// class@00007e
{

    public void l(){
       super();
    }
    public b ES(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantBridgeModuleImpl();
    }
    public b Nv(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public boolean isAvailable(){
       return true;
    }
}
