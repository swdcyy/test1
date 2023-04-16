package eu2.c$d;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;

public final class c$d	// class@0027ee
{

    public void c$d(){
       super();
    }
    public void c$d(u p0){
       super();
    }
    public final boolean a(){
       LiveVoicePartyCommonConfig obj = PatchProxy.apply(null, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.M(LiveVoicePartyCommonConfig.class);
       boolean b = (obj == null || obj.mDisableShowChannelFeeds == null)? true: false;
       return b;
    }
}
