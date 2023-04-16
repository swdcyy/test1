package gra.a;
import io.reactivex.g;
import gra.b;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import jga.f;
import jga.f$a;
import gra.a$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;

public final class a implements g	// class@002ba0
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       a tb = this.b;
       Objects.requireNonNull(tb);
       f uof = PatchProxy.apply(null, tb, b.class, "4");
       if (uof != PatchProxyResult.class) {
       }else {
          f$a uoa = new f$a(tb.c9(), tb.b9());
          uoa.l(tb.b9());
          uoa.q(true);
          a.o(uoa, "FollowParams.Builder\(get¡­tSilenceSuccessTips\(true\)");
          uof = uoa.b();
          a.o(uof, "builder.build\(\)");
       }
       FollowHelper.c(uof, new a$a(p0));
       return;
    }
}
