package m02.p1;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader;
import java.lang.Object;
import java.util.Objects;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import w41.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class p1 implements Runnable	// class@0030d6
{
    public final LivePlayerLoader b;

    public void p1(LivePlayerLoader p0){
       this.b = p0;
    }
    public final void run(){
       p1 tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LivePlayerLoader.l, "call realCreateAndBindBizPresenter");
       tb.g.R3(true);
       RxBus.f.b(new a(r1.n1(tb.b.mEntity)));
    }
}
