package f81.b;
import f81.a;
import java.lang.Object;
import os5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f81.c;

public class b implements a	// class@0022ca
{

    public void b(){
       super();
    }
    public c TM(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public boolean isAvailable(){
       return true;
    }
}
