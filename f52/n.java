package f52.n;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.android.live.log.b;

public final class n implements g	// class@002893
{
    public final f b;

    public void n(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       b.Q(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenterV2"), " CountDown", c.j("CountDown", p0));
       tb.V8(p0.longValue());
    }
}
