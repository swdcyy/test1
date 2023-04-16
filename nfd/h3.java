package nfd.h3;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import yr4.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nfd.g0;

public class h3	// class@001db5
{

    public void h3(){
       super();
    }
    public static d$a a(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g0.s0(p0).u0();
    }
}
