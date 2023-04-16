package j8a.l;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.lang.Runnable;
import ekd.k1;

public final class l implements g	// class@002964
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS && p0.b == null) {
          k1.m(tb.I);
       }
       return;
    }
}
