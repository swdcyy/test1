package af1.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@000072
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStyleController.fetchStyleConfig failed", p0);
    }
}
