package e12.d;
import io.reactivex.g;
import e12.f;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import tkd.b;
import tkd.d;
import lm9.a;
import e12.g;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lm9.a$b;

public final class d implements g	// class@0025f7
{
    public final f b;
    public final QLiveLaunchInfo c;

    public void d(f p0,QLiveLaunchInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       d.a(-1638991736).RI(tc.mLiveStream, new g(tb, p0, tc), true);
    }
}
