package dk1.a$a;
import erd.g;
import dk1.a;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveGiftSlotConfig;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class a$a implements g	// class@001fab
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = p0.mLiveGiftSlotConfig;
          if (p0 != null) {
             this.b.d("LiveLiteGiftBoxSwitchManager", p0.getDisableGiftSlot());
          }
       }
       return;
    }
}
