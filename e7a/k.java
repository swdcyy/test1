package e7a.k;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import mn6.a;

public final class k implements g	// class@00208b
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       j a = p0.a;
       if (a != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && (a != ChangeScreenVisibilityCause.CAPTION_DIALOG && (a == ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED || a == ChangeScreenVisibilityCause.SHARE_PANEL))) {
          b e = tb.E;
          if (e != null) {
             e.b(p0.b);
          }
       }
       return;
    }
}
