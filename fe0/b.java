package fe0.b;
import yt5.h;
import java.lang.Object;
import yt5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe0.a;

public class b implements h	// class@002301
{

    public void b(){
       super();
    }
    public e R(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public boolean isAvailable(){
       return true;
    }
}
