package b8a.q1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.util.BitSet;

public final class q1 implements g	// class@0003dc
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void q1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlidePlayAutoPlayNextPresenter.class, "10")) {
       }else if(tb.n9() && p0.a == ChangeScreenVisibilityCause.SHOW_COMMENT){
          if (p0.b == null) {
             tb.T.set(1);
             tb.G9();
          }else {
             tb.T.clear(1);
             tb.F9();
          }
       }
       return;
    }
}
