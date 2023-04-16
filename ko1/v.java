package ko1.v;
import com.kuaishou.live.common.core.basic.tools.g$b;
import ko1.b0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class v extends g$b	// class@002d8e
{
    public final b0 a;

    public void v(b0 p0){
       this.a = p0;
       super();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_PARTICLE, "Download thumb up image with url complete.");
       this.a.d(p0);
       return;
    }
}
