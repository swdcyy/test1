package i2a.b;
import erd.g;
import com.yxcorp.gifshow.detail.nonslide.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.nonslide.b$a;

public final class b implements g	// class@002766
{
    public final b b;
    public final int c;

    public void b(b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), tb, uob, "20")) {
          b$a uoa = new b$a();
          uoa.a = 4;
          uoa.b = tb.e;
          uoa.c = p0;
          uoa.d = tc;
          tb.c(uoa);
       }
       return;
    }
}
