package dp2.c;
import erd.g;
import dp2.d;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.VoicePartySingerAcceptInviteResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dp2.i;
import kotlin.jvm.internal.a;
import dp2.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;

public final class c implements g	// class@00256d
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0 = p0.mAryaConfig;
          a.o(p0, "it.mAryaConfig");
          this.b.b.h.c(p0, a.a);
       }
       return;
    }
}
