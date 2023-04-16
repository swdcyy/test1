package ao3.b;
import erd.g;
import ao3.c;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment$a;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.a;
import eo3.w;
import om3.d;
import om3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import uw1.i;
import java.lang.String;
import k2b.e0;
import tw1.d;

public final class b implements g	// class@000284
{
    public final c b;
    public final RedPacketConditionRedPackInfoWrapper c;

    public void b(c p0,RedPacketConditionRedPackInfoWrapper p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       if (!Boolean.TRUE.equals(tb.n.getValue())) {
       }else {
          p0 = tc.k();
          a uoa = tb.d.f().e().a();
          ClientContent$LiveStreamPackage liveStreamPa = uoa.a();
          d.m(liveStreamPa, p0.redPackId, i.c(p0.redPackType), tc.l(), uoa.i());
       }
       return;
    }
}
