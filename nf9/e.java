package nf9.e;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;

public final class e implements a	// class@00317a
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ServerSwapController", "processMediaComplete", objArray);
       return;
    }
}
