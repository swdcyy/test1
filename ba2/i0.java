package ba2.i0;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.f;

public final class i0 implements g	// class@000395
{
    public final h b;

    public void i0(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       i0 tb = this.b;
       tb.Z = p0;
       tb.j9(tb.X);
    }
    public boolean V(){
       return f.a(this);
    }
}
