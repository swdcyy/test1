package fj1.d$a;
import brd.y;
import fj1.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.Long;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import java.util.Objects;
import java.util.List;
import crd.b;

public final class d$a implements y	// class@002356
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       a.p(p0, "e");
       return;
    }
    public void onNext(Object p0){
       long l = p0.longValue();
       p0 = d$a.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, p0, "2")) {
          p0 = this.b.b();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, LiveViewSwitcher.class, "1") && p0.b.size() > 1) {
             p0.c = (p0.c < (p0.b.size() - 1))? p0.c + 1: 0;
             p0.d(1);
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "disposable");
       this.b.b = p0;
       return;
    }
}
