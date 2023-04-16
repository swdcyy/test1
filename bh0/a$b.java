package bh0.a$b;
import lf3.g;
import bh0.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$SCLiveHousePendant;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import bh0.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import java.util.Objects;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData$a;
import com.kwai.robust.PatchProxyResult;
import lf3.f;

public final class a$b implements g	// class@000381
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, str)) {
       }else {
          b.P(a.G.a(), "get sc message: "+p0);
          a$b tb = this.b;
          HouseLotteryPendantData$a companion = HouseLotteryPendantData.Companion;
          Objects.requireNonNull(companion);
          HouseLotteryPendantData houseLottery = PatchProxy.applyOneRefs(p0, companion, HouseLotteryPendantData$a.class, str);
          if (houseLottery != PatchProxyResult.class) {
          }else if(p0 != null){
             houseLottery = new HouseLotteryPendantData();
             houseLottery.setMEnableShow(p0.enableShow);
             houseLottery.setMBackgroundUrl(p0.backgroundUrl);
             houseLottery.setMTitle(p0.title);
             houseLottery.setMEndTimeMs(p0.endTimeMs);
             houseLottery.setMActionUrl(p0.actionUrl);
             houseLottery.setMServerTime(p0.serverTime);
          }else {
             houseLottery = null;
          }
          tb.V8(houseLottery);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
