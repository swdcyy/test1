package b8a.v0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.m;
import java.lang.Object;
import rd5.j;
import java.util.Objects;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import g9a.f;

public final class v0 implements g	// class@00040c
{
    public final m b;

    public void v0(m p0){
       super();
       this.b = p0;
    }
    public final void accept(Object p0){
       v0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED) {
       }else {
          tb.s.u2(p0.b);
       }
       return;
    }
}
