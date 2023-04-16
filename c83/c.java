package c83.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@0004ee
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveGiftTag.LIVE_POPULARITY.appendTag("LiveLitePopularityTicketModel"), "fetchPopularityData fail", p0);
    }
}
