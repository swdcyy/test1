package ac2.j;
import erd.g;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.luckystar.util.b;

public final class j implements g	// class@0000b4
{
    public final c b;

    public void j(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       tb.L = null;
       b.I(LiveLogTag.LUCKY_STAR, "requestLuckyStarCurrentInfo failed", p0);
       tb.S8(b.f(p0));
    }
}
