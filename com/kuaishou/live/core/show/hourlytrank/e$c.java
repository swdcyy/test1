package com.kuaishou.live.core.show.hourlytrank.e$c;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import lf3.f;

public final class e$c implements g	// class@000c05
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          e$c tb = this.b;
          if (tb.b == null) {
             tb.c = null;
          }else {
             b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager"), "[from signal]publish district rank close");
             e f = this.b.f;
             if (f != null) {
                a.o(p0, "it");
                f.a(p0);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
