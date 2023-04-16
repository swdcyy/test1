package fx9.m;
import bl9.a;
import java.lang.Object;
import qk9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fx9.n;

public class m implements a	// class@002378
{

    public void m(){
       super();
    }
    public h OO(){
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n();
    }
    public boolean isAvailable(){
       return true;
    }
}
