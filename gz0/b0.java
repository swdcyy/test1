package gz0.b0;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import mk1.a0;
import android.view.View;
import com.yxcorp.utility.n;

public final class b0 implements g	// class@0025c3
{
    public final o b;

    public void b0(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && p0.mEnableBackpackHasFreeTicketRedDot != null) {
          p0 = tb.h;
          if (p0 != null && p0.a != null) {
             p0.b(1);
             p0 = new View[]{tb.d};
             n.Z(0, p0);
          }
       }
       return;
    }
}
