package ha2.b;
import erd.g;
import com.kuaishou.live.core.show.increasefans.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveRevenueConfigResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.increasefans.c;
import z61.b;
import androidx.lifecycle.MutableLiveData;

public final class b implements g	// class@002d37
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 != null) {
          p0 = p0.mLiveRevenueConfigResponse;
          if (p0 != null && (p0.mIsAllowRevenueDelivery != null && p0.mUserType == 2)) {
             b = true;
          }
       }
       p0 = b.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, p0, "4")) {
          p0 = tb.P8();
          Objects.requireNonNull(p0);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), p0, uoc, "4")) {
             p0.b.mIsVisible = Boolean.valueOf(b);
             p0.c.setValue(p0.b);
          }
       }
       return;
    }
}
