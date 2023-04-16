package jq9.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.corona.common.model.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import com.yxcorp.gifshow.corona.common.model.l;
import com.yxcorp.gifshow.corona.common.model.c;
import com.yxcorp.gifshow.corona.common.model.m;
import com.yxcorp.gifshow.corona.common.model.n;
import com.yxcorp.gifshow.corona.common.model.e;
import com.yxcorp.gifshow.corona.common.model.d;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;
import com.yxcorp.gifshow.corona.common.model.a;
import ok.h;
import kp.w1;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import com.yxcorp.gifshow.corona.common.model.f;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import com.yxcorp.gifshow.corona.common.model.g;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import com.yxcorp.gifshow.corona.common.model.h;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import com.yxcorp.gifshow.corona.common.model.i;
import com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;
import com.yxcorp.gifshow.corona.common.model.j;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;
import com.yxcorp.gifshow.corona.common.model.k;

public final class o	// class@002b54
{

    public void o(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, o.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.TUBE_FEED, b.a);
       PhotoType.registerBaseFeedProvider(PhotoType.CORONA_BANNER, l.a);
       PhotoType.registerBaseFeedProvider(PhotoType.ZONE_FEED, c.a);
       PhotoType.registerBaseFeedProvider(PhotoType.CORONA_SUB_CHANNEL, m.a);
       PhotoType.registerBaseFeedProvider(PhotoType.COMMON_TITLE, n.a);
       PhotoType.registerBaseFeedProvider(PhotoType.TUBE_HOME_LOCAL, e.a);
       PhotoType.registerBaseFeedProvider(PhotoType.PAD_CORONA_RANKING_LIST, d.a);
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, o.class, "2")) {
          return;
       }
       w1.u(CoronaTubeFeed.class, a.b);
       w1.u(CoronaBannerFeed.class, f.b);
       w1.u(CoronaZoneFeed.class, g.b);
       w1.u(CoronaSubChannelFeed.class, h.b);
       w1.u(CoronaTitleFeed.class, i.b);
       w1.u(TubeHomeLocalFeed.class, j.b);
       w1.u(PadCoronaRankingListFeed.class, k.b);
       return;
    }
}
