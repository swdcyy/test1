package bt2.b;
import bt2.b$a;
import nsd.u;
import java.util.HashMap;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.lang.Object;
import java.util.List;
import trd.t;
import java.util.Map;

public final class b	// class@000444
{
    public static final HashMap a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
       HashMap hashMap = new HashMap();
       b.a = hashMap;
       GuideStructBizRelations anchorFollow = GuideStructBizRelations.AnchorFollowGuestGuideStructFollowedBeforeEnterMic;
       hashMap.put(GuideStructBizRelations.AnchorFollowGuestGuideStructFollowedAfterEnterMic, t.k(anchorFollow));
       hashMap.put(anchorFollow, t.k(anchorFollow));
    }
}
