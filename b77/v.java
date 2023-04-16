package b77.v;
import qo6.t1;
import b77.q;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.CharSequence;
import android.text.TextUtils;
import b77.u;
import java.util.Comparator;
import java.util.Collections;

public class v extends t1	// class@0003f0
{
    public final q b;

    public void v(q p0){
       this.b = p0;
       super();
    }
    public void b(int p0,List p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ov, "1")) {
          return;
       }
       if (p0 == 3) {
          return;
       }
       p1.size();
       if (!p1.size()) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          KwaiMsg kwaiMsg = iterator.next();
          if (!TextUtils.equals(kwaiMsg.getTarget(), this.b.x) || kwaiMsg.getMsgType()) {
             iterator.remove();
          }
       }
       if (!p1.size()) {
          return;
       }
       p1.get(0).getText();
       Collections.sort(p1, u.b);
       KwaiMsg kwaiMsg1 = p1.get((p1.size() - 1));
       v tb = this.b;
       q a = tb.A;
       if (a == null) {
          tb.A = kwaiMsg1;
          tb.R8(kwaiMsg1);
       }else if(a.getSeq() - kwaiMsg1.getSeq() < 0){
          tb = this.b;
          tb.A = kwaiMsg1;
          tb.R8(kwaiMsg1);
       }
       return;
    }
}
