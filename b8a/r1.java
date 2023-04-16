package b8a.r1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class r1 implements g	// class@0003e0
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void r1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlidePlayAutoPlayNextPresenter.class, "11")) {
       }else if(p0.booleanValue()){
          tb.T.set(10);
          tb.G9();
       }else {
          tb.T.clear(10);
          if (tb.n9()) {
             tb.F9();
          }
       }
       return;
    }
}
