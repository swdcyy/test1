package ih1.o$a;
import yg1.a;
import ih1.o;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import w1.k;
import ih1.i;
import ch1.a;
import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import ih1.m;
import ok.o;
import ih1.n;
import ok.h;
import java.util.Collection;
import ih1.l;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class o$a implements a	// class@0028ee
{
    public final o a;
    public final a b;

    public void o$a(o p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          k.a("GiftPanelPagerRepository::fetchLatest");
          this.a.b = p1;
          this.b.a(p0, p1);
          this.a.e.b(f.a(p1, 0, null, null, 7, null));
          a uoa = p1.c();
          if (uoa != null) {
             ArrayList uArrayList = new ArrayList();
             m.s(uoa.a()).p(m.b).F(n.b).n(uArrayList);
             this.a.c().c(uArrayList);
             this.a.c().b(uArrayList);
          }
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveNormalGiftPanelPagerRepository][fetchLatest]normalPager response "+p1.e());
          k.b();
       }
       return;
    }
}
