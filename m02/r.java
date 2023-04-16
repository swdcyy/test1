package m02.r;
import mq5.h;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;
import m02.v0;
import java.lang.Runnable;
import ekd.k1;

public final class r implements h	// class@0030dd
{
    public final LivePlayFragment b;

    public void r(LivePlayFragment p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       r tb = this.b;
       Objects.requireNonNull(tb);
       k1.s(new v0(tb), tb, 0);
    }
}
