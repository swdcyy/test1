package k59.c1;
import nl9.i;
import java.lang.Object;
import sl9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.webview.o;

public class c1 implements i	// class@002acd
{

    public void c1(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public c pk(){
       Object obj = PatchProxy.apply(null, this, c1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o();
    }
}
