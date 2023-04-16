package ko1.a0;
import com.kuaishou.live.common.core.basic.tools.g$b;
import ko1.b0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a0 extends g$b	// class@002d77
{
    public final b0 a;

    public void a0(b0 p0){
       this.a = p0;
       super();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_PARTICLE, "Download avatar back lottie complete.");
       this.a.a(p0);
       return;
    }
}
