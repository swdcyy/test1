package ac3.h;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;

public final class h implements g	// class@00006b
{
    public final LiveLiteLongConnectionManager b;

    public void h(LiveLiteLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          this.b.u().d(false);
       }
       return;
    }
}
