package hh1.g;
import hh1.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hh1.f;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dh1.f;
import dh1.e;
import eh1.d;
import brd.t;
import brd.z;
import hh1.g$a;
import erd.o;
import t45.d;
import hh1.g$b;
import hh1.g$c;
import erd.g;
import crd.b;

public final class g extends j	// class@0026ba
{
    public final f b;
    public final LiveGiftPanelConfig c;

    public void g(LiveGiftPanelConfig p0){
       a.p(p0, "config");
       super();
       this.c = p0;
       this.b = new f(p0);
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       b uob = e.b().b(p1.a().a()).observeOn(this.c.a()).map(new g$a(this)).observeOn(d.a).subscribe(new g$b(p2, p0), new g$c(p2, p0));
       a.o(uob, "LiveGiftPanelApiService.бн      \)\n        }\n      \)");
       this.b(uob);
       return;
    }
}
