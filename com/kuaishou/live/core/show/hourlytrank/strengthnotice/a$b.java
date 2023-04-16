package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
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

public class a$b implements Runnable	// class@000c3e
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       if (tb.n != null && tb.k != null) {
          k1.n(tb);
          this.b.m = 2;
          b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "show settle view auto");
          this.b.n.i();
       }
       return;
    }
}
