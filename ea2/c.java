package ea2.c;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import ea2.j;
import lf3.f;

public final class c implements g	// class@0026ca
{
    public final LiveHourlyRankListDialogPresenter b;

    public void c(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.HOURLY_RANK, "onLiveDistrictRankInfoReceived", "districtRankInfo", p0);
       if (!p0.equals(tb.A.a)) {
          tb.A.a = p0;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
