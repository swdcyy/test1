package m49.b$e;
import erd.g;
import m49.a;
import java.lang.Object;
import zq8.a;
import m49.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m49.a$b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import m49.e;
import u07.u;
import m49.f;
import u07.a;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import m49.c;
import m49.d;

public final class b$e implements g	// class@002df1
{
    public final a b;
    public final boolean c;
    public final boolean d;

    public void b$e(a p0,boolean p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       boolean b;
       b$e tb;
       t$a uoa;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
       }else {
          a$b uob1 = this.b.d();
          if (uob1 != null) {
             a.o(p0, "permission");
             uob1.a(this.b, p0);
          }
          if (p0.b == null && this.c == null) {
             int i = 0x7f0805bc;
             b = true;
             if (p0.c != null) {
                p0 = b.a;
                tb = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(tb, p0, uob, "3")) {
                   uoa = new t$a(tb.b());
                   uoa.v(b);
                   uoa.W0(R.string.arg_RES_7f1000ee);
                   uoa.y0(R.string.arg_RES_7f1000ef);
                   uoa.S0(R.string.arg_RES_7f1000f4);
                   uoa.Q0(R.string.arg_RES_7f1000f0);
                   uoa.B0(i);
                   uoa.u0(new e(tb));
                   uoa.t0(new f(tb));
                   a.c(uoa).Y(PopupInterface.a);
                }
                p0.e(this.b);
             }else if(this.d == null){
                p0 = b.a;
                tb = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(tb, p0, uob, "4")) {
                   uoa = new t$a(tb.b());
                   uoa.v(b);
                   uoa.W0(R.string.arg_RES_7f1000f2);
                   uoa.y0(R.string.arg_RES_7f1000f3);
                   uoa.S0(R.string.arg_RES_7f1000f1);
                   uoa.Q0(R.string.arg_RES_7f1000f0);
                   uoa.B0(i);
                   uoa.u0(new c(tb));
                   uoa.t0(new d(tb));
                   a.c(uoa).Y(PopupInterface.a);
                }
                p0.c(this.b);
             }
          }
       }
    label_00e0 :
       return;
    }
}
