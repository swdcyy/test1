package dv2.f;
import erd.c;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.util.List;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import kotlin.jvm.internal.a;
import msd.p;

public final class f implements c	// class@0025ad
{
    public final VoicePartyAudienceVideoViewController a;

    public void f(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "stateInterfaceList");
          a.p(p1, "openVideoUsers");
          obj = this.a.z.invoke(p0, p1);
       }
       return obj;
    }
}
