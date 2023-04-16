package k59.w0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class w0 implements g	// class@002b2d
{
    public static final w0 b;

    static {
       w0.b = new w0();
    }
    public void w0(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "1")) {
       }else {
          j0.b("AdNeoH5VideoModel", "onFollowUpdateEvent error", p0);
       }
       return;
    }
}
