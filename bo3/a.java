package bo3.a;
import nn3.i;
import eo3.w;
import nn3.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nn3.i$b$a;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import eo3.a;
import om3.d;
import om3.a;
import bo3.b;
import nn3.i$b$b;

public class a extends i	// class@0003fe
{

    public void a(w p0){
       super(p0);
    }
    public void E0(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 instanceof i$b$a) {
          if (this.d.c() != null) {
             b.a(this.d.c().k(), this.d.f().e().a());
          }
          this.G0();
       }
       if (p0 instanceof i$b$b) {
          this.H0();
       }
       return;
    }
}
