package ko1.z;
import com.kuaishou.live.common.core.basic.tools.g$b;
import ko1.b0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class z extends g$b	// class@002d92
{
    public final b0 a;

    public void z(b0 p0){
       this.a = p0;
       super();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_PARTICLE, "Download avatar front lottie complete.");
       this.a.b(p0);
       return;
    }
}
