package d01.g$b;
import d01.n;
import d01.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import d01.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;

public class g$b implements n	// class@001ed9
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public boolean a(GiftTab p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != GiftTab.PacketGift) {
          return false;
       }
       return k0.a(this.a.r, h.a).or(Boolean.FALSE).booleanValue();
    }
}
