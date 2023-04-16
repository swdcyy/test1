package b8a.p1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class p1 implements g	// class@0003d8
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void p1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlidePlayAutoPlayNextPresenter.class, "9")) {
       }else if(p0.booleanValue()){
          tb.T.set(4);
          tb.G9();
       }else {
          tb.T.clear(4);
          if (tb.n9()) {
             tb.F9();
          }
       }
       return;
    }
}
