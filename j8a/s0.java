package j8a.s0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class s0 implements g	// class@002974
{
    public final k b;

    public void s0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "25")) {
       }else {
          tb.C = p0.booleanValue();
          if (p0.booleanValue() && tb.R8()) {
             tb.k9();
          }
       }
       return;
    }
}
