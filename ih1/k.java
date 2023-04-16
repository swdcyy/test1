package ih1.k;
import yg1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hh1.h;
import gh1.a;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yg1.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ch1.d;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$a;
import java.util.List;
import trd.t;
import ih1.k$a;
import ih1.k$b;
import hh1.j;

public final class k implements d	// class@0028ea
{
    public final h a;
    public a b;
    public f c;

    public void k(LiveGiftPanelConfig p0){
       a.p(p0, "giftPanelConfig");
       super();
       this.a = new h(p0);
       this.b = new a(p0);
    }
    public void a(String p0,e p1,a p2){
       k this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "1")) {
          return;
       }
       String str = "source";
       a.p(p0, str);
       String str1 = "request";
       a.p(p1, str1);
       String str2 = "callback";
       a.p(p2, str2);
       this = this.c;
       if (this != null && this.e()) {
          p2.a(p0, this);
          return;
       }else {
          this = this.b;
          Objects.requireNonNull(this);
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
             a.p(p0, str);
             a.p(p1, str1);
             a.p(p2, str2);
             f uof = PatchProxy.apply(null, this, a.class, "2");
             if (uof != PatchProxyResult.class) {
             }else {
                d uod = new d("NormalGift", 0, 0, "", LiveGiftPanelConfig.z.a());
                uof = new f(1, "", t.k(uof));
             }
             p2.a(p0, uof);
          }
          this.a.a(p0, p1, new k$a(this));
          return;
       }
    }
    public void b(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       this.a.a(p0, p1, new k$b(this, p2));
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.c = null;
       this.a.clear();
       Objects.requireNonNull(this.b);
       return;
    }
}
