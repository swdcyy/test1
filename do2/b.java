package do2.b;
import erd.g;
import do2.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyKtvApplaudResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@002562
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "response");
          b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyApplauseAudienceController"), "观众自己鼓掌，发送请求成功，鼓掌id："+p0.mApplauseId);
          this.b.a = p0.mApplauseId;
       }
       return;
    }
}
