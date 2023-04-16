package gs2.n;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class n implements g	// class@002b9e
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          b.y(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "error!!!", p0);
       }
       return;
    }
}
