package ax8.f$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class f$b implements g	// class@000331
{
    public static final f$b b;

    static {
       f$b.b = new f$b();
    }
    public void f$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
       }else {
          PostUtils.D("ShareProducerRepo", "loadShareBusinessInfo", p0);
       }
       return;
    }
}
