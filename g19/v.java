package g19.v;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.util.BitSet;

public final class v implements g	// class@0023df
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void v(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlidePlayAutoPlayNextPresenter.class, "10")) {
       }else if(tb.b9() && p0.a == ChangeScreenVisibilityCause.SHOW_COMMENT){
          if (p0.b == null) {
             tb.T.set(1);
             tb.e9();
          }else {
             tb.T.clear(1);
             tb.d9();
          }
       }
       return;
    }
}
