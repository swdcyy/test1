package ac3.g;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class g implements g	// class@00006a
{
    public final LiveLiteLongConnectionManager b;

    public void g(LiveLiteLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.u = p0.booleanValue();
       }
       return;
    }
}