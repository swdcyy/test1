package gp2.g;
import erd.g;
import java.lang.Object;
import brd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@002b78
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          b.Z(LiveVoicePartyLogTag.THEATER, "fetchFreeTrafficUrls done");
       }
       return;
    }
}
