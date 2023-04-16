package cy1.d;
import lf3.g;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.System;
import lf3.f;

public final class d implements g	// class@001ead
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "12")) {
       }else {
          tb.t9(new WatchingCountData(WatchingCountData$SourceType.SC_FEED_PUSH, p0.watchingCount, p0.displayWatchingCount));
          if ((System.currentTimeMillis() - tb.L) - 0xea60 > 0 && tb.M != null) {
             tb.s9(p0.watchingCount);
             tb.L = System.currentTimeMillis();
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
