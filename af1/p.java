package af1.p;
import ok.h;
import af1.x;
import df1.c;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public final class p implements h	// class@00007a
{
    public final x b;
    public final c c;

    public void p(x p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       if (tc == p0) {
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.delayCollingUntilMessageSelfDiscard, message finally discard", "message", tc);
          tb.k();
          p0 = Boolean.TRUE;
       }else {
          p0 = Boolean.FALSE;
       }
       return p0;
    }
}
