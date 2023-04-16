package bd3.c;
import erd.g;
import com.kuaishou.live.lite.redpacket.a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000381
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.y(LiveLiteLogTag.LIVE_LITE_RED_PACK.appendTag("LiveLiteRedPackController"), "startCountdownTimer-error", p0);
       tb.W2();
    }
}
