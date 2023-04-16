package fy9.a$c;
import erd.g;
import fy9.a;
import java.lang.Object;
import cr7.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import k2b.h;
import k2b.e0;
import io.reactivex.subjects.PublishSubject;
import qp7.b;

public final class a$c implements g	// class@00237e
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoa, "11")) {
             h oh = h.k("MESSAGE_QUICK_REPLY_BUTTON");
             oh.n(tb.f0(p0));
             oh.i(tb.q);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoa, "10")) {
             uoa = tb.t;
             if (uoa != null) {
                uoa.onNext(p0.a());
             }
          }
          this.b.b0();
       }
       return;
    }
}
