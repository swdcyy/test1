package ei1.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b implements LiveGiftEffectGuestModel$b	// class@00216f
{
    public final LiveGiftEffectModel a;

    public void b(LiveGiftEffectModel p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftEffectModel obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.j;
       if (obj != null) {
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveGiftEffectSelfMockModel.class, "2");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.l.contains(p0);
       }else {
          b = false;
       }
       return b;
    }
}
