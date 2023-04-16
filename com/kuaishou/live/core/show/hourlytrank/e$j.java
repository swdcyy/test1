package com.kuaishou.live.core.show.hourlytrank.e$j;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import lf3.f;

public final class e$j implements g	// class@000c0c
{
    public final e b;

    public void e$j(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$j.class, "1")) {
       }else {
          e$j tb = this.b;
          if (tb.b == null) {
             tb.d = p0;
          }else {
             LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
             hOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager");
             LiveLogTag liveLogTag = hOURLY_RANK;
             b.T(liveLogTag, "[from signal]publish popularity rank info", "showRank", Boolean.valueOf(p0.showRank), "displayRank", p0.displayRank);
             e f = this.b.f;
             if (f != null) {
                a.o(p0, "it");
                f.d(p0);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
