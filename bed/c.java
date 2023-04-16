package bed.c;
import erd.g;
import bed.y;
import s3b.a;
import qm6.b$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Exception;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class c implements g	// class@000402
{
    public final y b;
    public final a c;
    public final b$a d;
    public final int e;

    public void c(y p0,a p1,b$a p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       Objects.requireNonNull(tb);
       if (p0 instanceof UnSupportedMagicException) {
          tc.i(p0);
          if (tb.b.mMusic != null) {
             tb.g(td, te);
          }
       }else {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1038e7));
       }
       return;
    }
}
