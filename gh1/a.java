package gh1.a;
import yg1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yg1.f;
import ch1.d;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$a;
import java.util.List;
import trd.t;

public final class a implements b	// class@0024e6
{
    public final LiveGiftPanelConfig a;

    public void a(LiveGiftPanelConfig p0){
       a.p(p0, "giftPanelConfig");
       super();
       this.a = p0;
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       f uof = PatchProxy.apply(null, this, a.class, "2");
       if (uof != PatchProxyResult.class) {
       }else {
          d uod = new d("NormalGift", 0, 0, "", LiveGiftPanelConfig.z.a());
          uof = new f(1, "", t.k(uof));
       }
       p2.a(p0, uof);
       return;
    }
    public void clear(){
    }
}
