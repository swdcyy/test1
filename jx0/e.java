package jx0.e;
import aq5.b;
import jx0.i;
import java.lang.Object;
import aq5.a;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView;

public final class e implements b	// class@002c25
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       e tb = this.b;
       p1 = tb.c9();
       if (tb.Z == p1) {
       }else {
          tb.Z = p1;
          i q = tb.Q;
          if (q != null) {
             q.c((p1 ^ 0x01));
             tb.k9(p1);
          }
       }
       return;
    }
}
