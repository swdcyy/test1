package j79.q$d;
import androidx.lifecycle.Observer;
import j79.q;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import u79.a;
import u79.o;

public final class q$d implements Observer	// class@00278d
{
    public final q b;

    public void q$d(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$d.class, "1")) {
       }else {
          q$d tb = this.b;
          a.h(p0, "count");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          q oq = q.class;
          if (PatchProxy.isSupport(oq) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, oq, "3") && i == 5)) {
             i = tb.e.getCurrentIndex() - 1;
             int i1 = tb.e.getCurrentIndex() + 1;
             if (i >= 0 && i < tb.e.j()) {
                i = tb.e.D(i);
                if (i != null) {
                   i.g(false);
                }
             }
             if (i1 >= 0 && i1 < tb.e.j()) {
                i = tb.e.D(i1);
                if (i != null) {
                   i.g(false);
                }
             }
          }
       }
    label_006e :
       return;
    }
}
