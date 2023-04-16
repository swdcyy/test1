package e62.e;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import java.lang.Object;
import j62.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class e implements g	// class@002637
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       b q = tb.q;
       if (q.a == p0.a && TextUtils.n(q.b, p0.b)) {
          p0 = tb.F;
          if (p0 != null) {
             p0 = p0.q;
             if (p0 != null) {
                p0.setValue(Boolean.TRUE);
                tb.a9(tb.F);
                tb.Z8(tb.F);
             }
          }
       }
       return;
    }
}
