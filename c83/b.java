package c83.b;
import erd.g;
import c83.h;
import java.lang.Object;
import kotlin.Triple;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.live.lite.gift.guide.LiteSideBarReplacePlan;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.b;
import w73.s$b;
import w73.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Boolean;
import ah1.c;

public final class b implements g	// class@0004ed
{
    public final h b;

    public void b(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       LiteSideBarReplacePlan second = p0.getSecond();
       p0 = p0.getThird();
       LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
       lIVE_POPULAR.appendTag("LiveLitePopularityTicketModel");
       LiveGiftTag liveGiftTag = lIVE_POPULAR;
       b.T(liveGiftTag, "fetchPopularityData: success", "replace plan", Integer.valueOf(second.mLiteSideBarReplacePlan), "gift", a.a.q(p0));
       tb.d("subscribe", new s$b(new a(p0, p0.getFirst(), second.mLiteSideBarReplacePlan)));
       tb.k.e("LiveLitePopularityTicketModel", Boolean.TRUE);
    }
}
