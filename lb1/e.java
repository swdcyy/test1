package lb1.e;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cb1.c;
import cb1.b;
import cjd.e;
import erd.o;

public class e extends f	// class@002eb6
{
    public final String p;

    public void e(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().c(this.p).map(new e());
    }
}
