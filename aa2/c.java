package aa2.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000093
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
          b.B(LiveLogTag.LIVE_HOT_SPOT, "reportHotSpotInfo error");
       }
       return;
    }
}
