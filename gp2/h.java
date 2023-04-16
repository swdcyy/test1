package gp2.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@002b79
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          b.I(LiveVoicePartyLogTag.THEATER, "fetchFreeTrafficUrls failed", p0);
       }
       return;
    }
}
