package ba2.h0;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class h0 implements g	// class@000393
{
    public final h b;

    public void h0(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       h0 tb = this.b;
       tb.h9();
       tb.U0 = false;
       tb.X8();
       b.Z(LiveLogTag.HOURLY_RANK, "receive rank close");
    }
    public boolean V(){
       return f.a(this);
    }
}
