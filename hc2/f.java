package hc2.f;
import erd.g;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.luckystar.util.b;

public final class f implements g	// class@002d5b
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.T = null;
       b.y(b.W, "requestLuckyStarCurrentInfo failed", p0);
       tb.V8(b.f(p0));
    }
}
