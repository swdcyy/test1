package dl2.d;
import com.kuaishou.live.core.show.subscribe.b$a;
import com.kuaishou.live.core.show.subscribe.subscribelist.a$b;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.lang.Object;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;

public final class d implements b$a	// class@00253f
{
    public final a$b a;
    public final LiveSubscribedAnchorInfo$LiveSubscribedAnchor b;
    public final LiveSubscribedCalendarInfo c;

    public void d(a$b p0,LiveSubscribedAnchorInfo$LiveSubscribedAnchor p1,LiveSubscribedCalendarInfo p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onResult(boolean p0){
       d ta = this.a;
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(ta);
       if (p0) {
          j.h(ta.c.getActivity(), tb.mSubscribeId, tc);
       }
       return;
    }
}
