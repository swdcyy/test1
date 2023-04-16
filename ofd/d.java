package ofd.d;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import joc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import joc.a;
import ofd.c;
import lkd.b;

public class d	// class@001f18
{

    public void d(){
       super();
    }
    public static d a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(new c(p0));
    }
}
