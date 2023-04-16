package cm2.k;
import java.lang.Object;
import cm2.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class k	// class@000562
{

    public void k(){
       super();
    }
    public static e$a a(e$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.I = false;
       p0.c0(a1.a(R.color.arg_RES_7f06015a));
       p0.a0(a1.a(R.color.arg_RES_7f060752));
       p0.b0(a1.a(R.color.arg_RES_7f060513));
       p0.f0(true);
       p0.J = true;
       return p0;
    }
}
