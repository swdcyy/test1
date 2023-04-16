package ao3.i;
import pn3.e;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.b;
import ao3.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;

public class i extends e	// class@00028f
{
    public final MutableLiveData o;

    public void i(w p0){
       super(p0);
       this.o = new MutableLiveData("");
    }
    public void G0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.G0(p0);
       if (p0 == null) {
          return;
       }
       this.o.setValue(k0.b(this.d.c(), b.a, h.a).or(""));
       return;
    }
}
