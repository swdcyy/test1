package g33.b;
import g33.a;
import java.lang.Object;
import os5.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.external.l;

public class b implements a	// class@002a4c
{

    public void b(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public l l9(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l();
    }
}
