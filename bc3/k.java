package bc3.k;
import erd.g;
import com.kuaishou.live.lite.luckystar.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class k implements g	// class@000379
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       b.y(LiveLiteLogTag.LIVE_LITE_LUCKY_STAR.appendTag("LiveLiteLuckyStarModelManager"), "startLuckyStarCountdownTimer", p0);
       tb.d();
       tb.c();
    }
}
