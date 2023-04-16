package np1.b$a;
import androidx.lifecycle.Observer;
import np1.b;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yp1.g;
import dq1.b;
import yp1.b;
import zp1.i;
import zp1.l;
import dq1.d;
import dq1.c;

public final class b$a implements Observer	// class@0033a3
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else if(p0 != null){
          b$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "4")) {
             tb.n.g(p0);
             int i = p0.c();
             if (i != 1) {
                i = (i != 2)? null: new b(tb.p, tb.m, tb.o);
             }else {
                i = new d(tb.p, tb.m, tb.o);
             }
             if (i != null) {
                tb.n.e(i);
             }
          }
       }
       return;
    }
}
