package com.kuaishou.live.core.show.hourlytrank.e$g;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.f;

public final class e$g implements g	// class@000c09
{
    public final e b;

    public void e$g(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g.class, "1")) {
       }else if(this.b.g != null){
          b.S(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager"), "[district] receive districtRankEntry visible changed", "districtRankVisible", Boolean.valueOf(p0.districtRankVisible));
          e$g tb = this.b;
          LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo districtRank = p0.districtRankVisible;
          tb.h = districtRank ^ 0x01;
          e f = tb.f;
          if (f != null) {
             f.b(districtRank);
          }
          e$g tb1 = this.b;
          tb1.d(tb1.c);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
