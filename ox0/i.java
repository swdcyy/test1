package ox0.i;
import erd.g;
import ox0.l;
import android.app.Activity;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class i implements g	// class@0035be
{
    public final l b;
    public final Activity c;
    public final boolean d;
    public final boolean e;

    public void i(l p0,Activity p1,boolean p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       i te = this.e;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.a(tc, td, te);
       }else {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10469e));
       }
       return;
    }
}
