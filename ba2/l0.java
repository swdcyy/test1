package ba2.l0;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import ba2.v;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class l0 implements g	// class@00039b
{
    public final h b;

    public void l0(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       this.b.j9(p0);
       b.h0(LiveLogTag.HOURLY_RANK, "receive rank info", ImmutableMap.builder().c("isInRank", Boolean.valueOf(p0.isInRank)).c("isInGlobalRank", Boolean.valueOf(p0.isInGlobalRank)).c("displayRankName", p0.displayRankName).c("globalRankName", p0.globalRankName).c("disableShowGlobalRank", Boolean.valueOf((v.g() ^ 0x01))).a());
    }
    public boolean V(){
       return f.a(this);
    }
}
