package gs2.l;
import ok.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Void;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class l implements h	// class@002b9c
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "order failed");
          p0 = null;
       }
       return p0;
    }
}
