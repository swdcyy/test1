package b00.h;
import oo8.q;
import java.lang.Object;
import oo8.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b00.f;

public class h implements q	// class@00022f
{

    public void h(){
       super();
    }
    public p a(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
