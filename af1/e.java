package af1.e;
import io.reactivex.g;
import vf1.a;
import java.lang.Object;
import brd.v;
import af1.d;
import vf1.b;
import af1.i;
import java.lang.Runnable;
import crd.b;
import crd.c;

public final class e implements g	// class@00006f
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       e tb = this.b;
       d uod = new d(p0);
       tb.Z9(uod);
       p0.setDisposable(c.d(new i(tb, uod)));
    }
}
