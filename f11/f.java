package f11.f;
import erd.g;
import f11.h;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveLikeNewStyleConfig;
import jo1.a;
import g11.e;

public final class f implements g	// class@002271
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveLikeNewStyleConfig;
       if (p0 != null) {
          tb.h = p0;
          tb.d.d(p0);
          p0.d = tb.h.isStopTopBarAnimation;
       }
       return;
    }
}
