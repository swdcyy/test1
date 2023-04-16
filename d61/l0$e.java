package d61.l0$e;
import java.lang.Object;
import java.lang.String;
import d61.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.l0$c;

public class l0$e	// class@001f2f
{

    public void l0$e(){
       super();
    }
    public l0 a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l0$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l0$c(p0);
    }
}
