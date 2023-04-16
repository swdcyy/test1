package m02.p;
import pp.d$a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import java.lang.String;
import com.google.common.collect.ImmutableMap;

public final class p implements d$a	// class@0030d7
{
    public final LivePlayFragment a;

    public void p(LivePlayFragment p0){
       this.a = p0;
    }
    public final Map build(){
       p ta = this.a;
       return ImmutableMap.of("livePlayFragmentId", Integer.valueOf(ta.I1), "liveStreamId", ta.Ch(), "liveSessionId", ta.W0);
    }
}
