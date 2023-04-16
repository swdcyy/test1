package j89.n;
import d0d.d$a;
import okhttp3.Call;
import d0d.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.d;
import j89.o;

public class n extends d$a	// class@0027b7
{

    public void n(){
       super();
    }
    public b a(Call p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (d.a) {
          return null;
       }
       return new o();
    }
}
