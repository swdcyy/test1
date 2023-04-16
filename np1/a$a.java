package np1.a$a;
import androidx.lifecycle.Observer;
import np1.a;
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

public final class a$a implements Observer	// class@0033a1
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else if(p0 != null){
          a$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "3")) {
             tb.m.g(p0);
             int i = p0.c();
             if (i != 1) {
                i = (i != 2)? null: new b(tb.o, tb.l, tb.n);
             }else {
                i = new d(tb.o, tb.l, tb.n);
             }
             if (i != null) {
                tb.m.e(i);
             }
          }
       }
       return;
    }
}
