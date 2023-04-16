package bx8.r;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class r implements g	// class@000488
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else {
          PostUtils.D("ShareStartUpRepo", "getPostStartUpResponse", p0);
       }
       return;
    }
}
