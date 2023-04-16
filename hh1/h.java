package hh1.h;
import hh1.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hh1.h$a;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dh1.f;
import dh1.e;
import eh1.e;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import hh1.h$b;
import hh1.h$c;
import erd.g;
import crd.b;

public final class h extends j	// class@0026be
{
    public final h$a b;

    public void h(LiveGiftPanelConfig p0){
       a.p(p0, "giftPanelConfig");
       super();
       this.b = new h$a(p0);
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       b uob = e.b().e(p1.a().c, p1.a().b).observeOn(a.c()).subscribe(new h$b(this, p2, p0), new h$c(p2, p0));
       a.o(uob, "LiveGiftPanelApiService.бн\(source, result\)\n      }\)");
       this.b(uob);
       return;
    }
}
