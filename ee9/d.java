package ee9.d;
import erd.g;
import ee9.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Exception;
import w3b.l;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import hc9.e;

public final class d implements g	// class@002125
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 instanceof UnSupportedMagicException) {
          l.o(p0);
       }else {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1038e7));
       }
       tb.q.c(null, 0);
       return;
    }
}
