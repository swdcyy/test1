package ef0.d;
import cg0.b;
import java.lang.Object;
import cg0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ef0.a;

public class d implements b	// class@002141
{

    public void d(){
       super();
    }
    public a create(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
