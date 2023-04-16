package ba2.k0;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.f;

public final class k0 implements g	// class@000399
{
    public final h b;

    public void k0(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       k0 tb = this.b;
       tb.Y = p0;
       if (p0.showRank == null) {
          tb.e9();
       }
       tb.j9(tb.X);
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
