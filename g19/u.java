package g19.u;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class u implements g	// class@0023de
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void u(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlidePlayAutoPlayNextPresenter.class, "9")) {
       }else if(p0.booleanValue()){
          tb.T.set(4);
          tb.e9();
       }else {
          tb.T.clear(4);
          if (tb.b9()) {
             tb.d9();
          }
       }
       return;
    }
}
