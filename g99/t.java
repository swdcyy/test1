package g99.t;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import g99.w;

public final class t implements g	// class@002451
{
    public final e b;

    public void t(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          p0 = tb.w;
          p0.t0(p0.q0());
       }
       return;
    }
}
