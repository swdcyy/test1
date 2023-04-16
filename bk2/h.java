package bk2.h;
import erd.g;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import java.lang.Long;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import yt5.e;

public final class h implements g	// class@000403
{
    public final d b;

    public void h(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Activity activity = tb.getActivity();
       tb.s.f(activity, tb.p.c.mEntity, tb.r);
    }
}
