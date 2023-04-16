package djc.o0$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n80.b;
import q87.c;

public final class o0$d implements g	// class@002211
{
    public static final o0$d b;

    static {
       o0$d.b = new o0$d();
    }
    public void o0$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$d.class, "1")) {
       }else {
          b.C().e("ForwardJsCustomBannerViewBinder", "show banner error", p0);
       }
       return;
    }
}
