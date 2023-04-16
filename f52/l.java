package f52.l;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import crd.b;
import lnc.b9;

public final class l implements g	// class@002891
{
    public final f b;

    public void l(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          p0 = tb.q;
          p0.p.mInterceptAutoJumpFeedSet.add(p0.c.mEntity.getGrootId());
          tb.S8();
          b9.a(tb.C);
       }
       return;
    }
}
