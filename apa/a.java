package apa.a;
import qn.b;
import java.lang.Object;
import qn.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import apa.b;

public class a implements b	// class@00029d
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public f sB(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
