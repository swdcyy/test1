package f52.p;
import java.lang.Runnable;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import f12.d;
import android.view.View;
import com.yxcorp.utility.n;
import crd.b;
import lnc.b9;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class p implements Runnable	// class@002895
{
    public final f b;

    public void p(f p0){
       this.b = p0;
    }
    public final void run(){
       p tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_CLOSE;
       lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenterV2");
       b.P(lIVE_AUDIENC, " CountDown stop");
       f r = tb.r;
       if (r == null) {
       }else if(r.f() <= 1){
          View[] viewArray = new View[]{tb.t,tb.u};
          n.Z(4, viewArray);
          b9.a(tb.B);
          lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenterV2");
          b.P(lIVE_AUDIENC, "feed is lastOne, countDown invisible");
       }else if(tb.r.P(tb.q.c.mEntity) < (tb.r.f() - 1)){
          tb.r.G(1);
          lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenterV2");
          b.P(lIVE_AUDIENC, " move to next");
       }else if(tb.r.f() > 1){
          if (!tb.r.F()) {
             tb.r.D(1);
             lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenterV2");
             b.P(lIVE_AUDIENC, " move to previous");
          }else {
             tb.r.G(1);
             lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenterV2");
             b.P(lIVE_AUDIENC, " move to first");
          }
       }
       return;
    }
}
