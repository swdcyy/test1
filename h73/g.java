package h73.g;
import erd.g;
import h73.t;
import z1.a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.String;
import lnc.a1;
import d61.g0;
import h73.d;
import lnc.c3$a;
import lnc.c3;
import h73.e;
import h73.r;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public final class g implements g	// class@002cb4
{
    public final t b;
    public final a c;
    public final a d;
    public final a e;

    public void g(t p0,a p1,a p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          if (kwaiExceptio.getErrorCode() == 0x13ade) {
             g0.c(a1.p(R.string.arg_RES_7f10225c));
             c3.c(tc, d.a);
             c3.c(td, e.a);
          label_005b :
             return;
          }else {
             c3.c(te, new r(kwaiExceptio));
          }
       }
       String str = a1.p(R.string.arg_RES_7f10225b);
       if (p0 != null && !TextUtils.x(p0.getMessage())) {
          str = p0.getMessage();
       }
       i.f(R.style.arg_RES_7f11066a, str, true);
       tb.b();
       goto label_005b ;
    }
}
