package b8a.f1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.s;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import androidx.fragment.app.Fragment;
import ro5.a;

public final class f1 implements g	// class@0003a2
{
    public final s b;

    public void f1(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS) {
          a.p(tb.q, p0.b);
       }
       return;
    }
}
