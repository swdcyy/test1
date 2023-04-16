package flb.c;
import erd.g;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import flb.a;
import qrd.l1;

public final class c implements g	// class@002966
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          Object d = a.d;
          _monitor_enter(d);
          a.c = p0;
          _monitor_exit(d);
       }
       return;
    }
}
