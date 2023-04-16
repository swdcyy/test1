package cb5.r$a;
import erd.g;
import cb5.r;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import java.lang.Integer;
import java.util.Set;
import io.reactivex.subjects.PublishSubject;

public final class r$a implements g	// class@000455
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
       }else {
          r$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, r.class, "3")) {
             r q = tb.q;
             if (q != null && (q.c1() == true && (p0 != null && tb.r.contains(Integer.valueOf(p0.mActionType))))) {
                r p = tb.p;
                if (p != null) {
                   p.onNext(p0);
                }
             }
          }
       }
       return;
    }
}
