package grb.d;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import java.util.HashMap;

public final class d implements g	// class@002bd9
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "it");
       NearbyCityNameMapManager.c.c();
       return;
    }
}
