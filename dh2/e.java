package dh2.e;
import ks5.m;
import com.kuaishou.live.core.show.redpacket.newpendant.a;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import ks5.l;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;

public class e implements m	// class@002529
{
    public final a a;

    public void e(a p0){
       this.a = p0;
       super();
    }
    public View b(ViewGroup p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.a.P8();
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       l.e(this, p0);
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public String getId(){
       return "liveRedPacket";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.RED_PACKET.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public int l(){
       return l.b(this);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.RED_PACKET.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
}
