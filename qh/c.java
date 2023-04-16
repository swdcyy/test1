package qh.c;
import erd.g;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$a;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$Operation;
import mrd.a;

public final class c implements g	// class@0029d9
{
    public final MilanoAttachCallbackPresenter b;

    public void c(MilanoAttachCallbackPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME) {
          MilanoAttachCallbackPresenter q = tb.q;
          Objects.requireNonNull(LatestBrowsedFeedCache.h);
          if (q != null) {
             p0 = q.mEntity;
             if (p0 != null && (p0.getId() != null && !LatestBrowsedFeedCache.f)) {
                LatestBrowsedFeedCache.e = q;
                LatestBrowsedFeedCache.f = true;
                LatestBrowsedFeedCache.g.onNext(new LatestBrowsedFeedCache$a(q, LatestBrowsedFeedCache$Operation.ACTIVE));
             }
          }
       }else if(p0 == FragmentEvent.PAUSE){
          LatestBrowsedFeedCache.h.d(tb.q);
       }
       return;
    }
}
