package bed.r;
import erd.g;
import s3b.a;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Exception;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class r implements g	// class@000420
{
    public final a b;

    public void r(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       if (p0 instanceof UnSupportedMagicException) {
          tb.i(p0);
       }else {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1038e7));
       }
       return;
    }
}
