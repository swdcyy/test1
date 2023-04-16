package bk2.k;
import erd.g;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import es3.a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import yt5.e;

public final class k implements g	// class@000406
{
    public final d b;

    public void k(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       GifshowActivity activity = tb.getActivity();
       tb.s.c(p0.a, tb.p.c.mEntity, activity, tb.r);
    }
}
