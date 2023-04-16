package a63.r;
import erd.g;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class r implements g	// class@000062
{
    public final n b;

    public void r(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Objects.requireNonNull(this.b);
       if (p0.booleanValue()) {
          i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f103679));
       }else {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f103678));
       }
       return;
    }
}
