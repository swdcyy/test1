package bp6.f0;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.q;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.lang.String;
import cp6.n;
import com.kwai.imsdk.internal.client.i;
import brd.t;

public final class f0 implements Callable	// class@000518
{
    public final q b;
    public final d c;

    public void f0(q p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       f0 tb = this.b;
       f0 tc = this.c;
       d uod = n.i(tb.f).p(tc.getTarget(), tc.getTargetType());
       if (uod != null) {
       }else {
          uod = i.t(tb.f).l(tc, true).blockingFirst();
       }
       return uod;
    }
}
