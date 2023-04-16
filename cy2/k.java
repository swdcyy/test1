package cy2.k;
import java.lang.Runnable;
import cy2.l;
import u71.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import d61.l0;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import h02.c;

public final class k implements Runnable	// class@002408
{
    public final l b;
    public final boolean c;
    public final a d;

    public void k(l p0,boolean p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "1")) {
          return;
       }
       if (this.c != null) {
          k tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, l.class, "3") && !tb.e.b(Boolean.FALSE).booleanValue()) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1050f8));
             tb.e.i(Boolean.TRUE);
          }
          this.b.d.b(this.d);
       }
       return;
    }
}
