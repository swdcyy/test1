package b62.f;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import java.lang.Object;
import j62.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import android.os.Message;

public final class f implements g	// class@00033b
{
    public final e b;

    public void f(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       e q = tb.q;
       if (q.a == p0.a && TextUtils.n(q.b, p0.b)) {
          p0 = tb.G;
          if (p0 != null) {
             p0 = p0.q;
             if (p0 != null) {
                p0.setValue(Boolean.TRUE);
                tb.V8(tb.G);
                tb.Y8(tb.G, null);
             }
          }
       }
       return;
    }
}
