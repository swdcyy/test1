package ec9.k1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;

public final class k1 implements g	// class@002182
{
    public static final k1 b;

    static {
       k1.b = new k1();
    }
    public void k1(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k1.class, "1")) {
       }else {
          a.D().e("CameraAssistant", "discernDelegate error", p0);
       }
       return;
    }
}
