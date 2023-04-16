package l31.b;
import lf3.g;
import l31.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import java.util.Objects;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.String;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import lf3.f;

public final class b implements g	// class@002e6d
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.t9(new WatchingCountData(WatchingCountData$SourceType.SC_ACTIVITY_LIVE_INFO, 0, p0.accumulatedWatchCount));
    }
    public boolean V(){
       return f.a(this);
    }
}
