package f62.f;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.c;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i62.z$a;
import j62.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import p91.m;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;

public final class f implements g	// class@0028b2
{
    public final c b;

    public void f(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "13")) {
       }else {
          p0 = p0.obj;
          if (p0 instanceof z$a && p0 != null) {
             z$a a = p0.a;
             if (a != null && (TextUtils.n(tb.q.b, a.b) && tb.q.a == p0.a.a)) {
                tb.H = (int)(p0.b.longValue() / 1000);
                if (!tb.s.e()) {
                   p0 = tb.G;
                   if (p0 != null && p0.q.getValue().booleanValue()) {
                   label_0067 :
                      tb.W8();
                   }else if(tb.G != null){
                      tb.Y8();
                   }
                }else {
                   goto label_0067 ;
                }
                p0 = tb.G;
                if (p0 != null) {
                   tb.V8(p0);
                   if (tb.s.e()) {
                      tb.S8(tb.G);
                   }
                }
             }
          }
       }
    label_007e :
       return;
    }
}
