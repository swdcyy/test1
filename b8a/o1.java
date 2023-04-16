package b8a.o1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.util.BitSet;

public final class o1 implements g	// class@0003d0
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void o1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o1 tb = this.b;
       Objects.requireNonNull(tb);
       j a = p0.a;
       if (a != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && (a != ChangeScreenVisibilityCause.CAPTION_DIALOG && (a == ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED || a == ChangeScreenVisibilityCause.SHARE_PANEL))) {
          if (p0.b != null) {
             tb.T.clear(8);
             if (tb.n9()) {
                tb.F9();
             }
          }else {
             tb.T.set(8);
             tb.G9();
             tb.B9(false);
          }
       }
       return;
    }
}
