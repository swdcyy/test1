package com.kuaishou.live.core.show.hourlytrank.e$d;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class e$d implements g	// class@000c06
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
       }else {
          LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager");
          LiveLogTag liveLogTag = hOURLY_RANK;
          b.T(liveLogTag, "[from signal] [district] publish district rank info", "showRank", Boolean.valueOf(p0.aggregationShowRank), "displayName", p0.aggregationDisplayName);
          this.b.d(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
