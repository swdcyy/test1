package f52.h;
import java.lang.Runnable;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import f12.d;
import android.widget.TextView;
import crd.b;
import lnc.b9;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class h implements Runnable	// class@00288d
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_CLOSE;
       lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
       b.P(lIVE_AUDIENC, " CountDown stop");
       b w = tb.w;
       if (w != null && tb.x != null) {
          int i = 1;
          if (w.f() <= i) {
             tb.p.setVisibility(4);
             tb.r.setVisibility(4);
             b9.a(tb.v);
             lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
             b.P(lIVE_AUDIENC, "feed is lastOne, countDown invisible");
          }else if(tb.w.P(tb.x) < (tb.w.f() - i)){
             tb.w.G(i);
             lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
             b.P(lIVE_AUDIENC, " move to next");
          }else if(tb.w.f() > i){
             if (!tb.w.F()) {
                tb.w.D(i);
                lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
                b.P(lIVE_AUDIENC, " move to previous");
             }else {
                tb.w.G(i);
                lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
                b.P(lIVE_AUDIENC, " move to first");
             }
          }
       }
       return;
    }
}
