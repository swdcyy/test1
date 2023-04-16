package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;

public class i$b implements Runnable	// class@000c4d
{
    public final i b;

    public void i$b(i p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       i$b tb = this.b;
       if (tb.o != null && tb.l != null) {
          k1.n(tb);
          this.b.n = 2;
          b.P(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "show settle view auto");
          this.b.o.i();
       }
       return;
    }
}
