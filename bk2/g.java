package bk2.g;
import mq5.h;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yt5.e;

public final class g implements h	// class@000402
{
    public final d b;

    public void g(d p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       g tb = this.b;
       tb.s.b(tb.getActivity());
    }
}
