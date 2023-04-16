package j02.p;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.u;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class p implements g	// class@002a2c
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          b.P(u.a, "reportWatchLive doOnNext");
       }
       return;
    }
}
