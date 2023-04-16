package lu1.s;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.multiinteract.mediastream.LiveInteractMuteResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class s implements g	// class@00304f
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "on mute request result:"+p0);
       }
       return;
    }
}
