package c83.h;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import td3.o;
import d83.a;
import ih1.l;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import w73.v;

public class h extends Model	// class@0004f3
{
    public final v i;
    public final o j;
    public final a k;
    public b l;

    public void h(o p0,a p1,l p2){
       super("LiveLitePopularityTicketModel", null, false, false);
       LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
       lIVE_POPULAR.appendTag("LiveLitePopularityTicketModel");
       LiveGiftTag liveGiftTag = lIVE_POPULAR;
       b.P(liveGiftTag, "LiveLitePopularityTicketModel - init ");
       this.i = new v(p2);
       this.j = p0;
       this.k = p1;
    }
}
