package hh1.c$a;
import erd.o;
import hh1.c;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yg1.f;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import hh1.b;

public final class c$a implements o	// class@0026ad
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       f uof = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.a();
          a.o(p0, "it.body\(\)");
          uof = this.b.b.b(p0);
       }
       return uof;
    }
}
