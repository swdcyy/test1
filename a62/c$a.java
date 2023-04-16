package a62.c$a;
import erd.g;
import a62.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import a62.b;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$b;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;

public final class c$a implements g	// class@00004d
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          this.b.Y8();
          p0 = p0.e;
          if (p0 != null) {
             this.b.v.setLiveConditionRedPacketPanelOwnerInfoClickListener(new b(p0, this));
          }
       }
       return;
    }
}
