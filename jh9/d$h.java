package jh9.d$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hb0.a;
import q87.c;
import aegon.chrome.net.NetworkException;
import e17.i;

public final class d$h implements g	// class@002add
{
    public static final d$h b;

    static {
       d$h.b = new d$h();
    }
    public void d$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$h.class, "1")) {
       }else {
          a.D().z("PostToolBox", "ToolBoxHeaderConfigRepo.fetchData error", p0);
          if (p0.getCause() instanceof NetworkException) {
             i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          }
       }
       return;
    }
}
