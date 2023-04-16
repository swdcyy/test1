package k59.r1;
import erd.g;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import java.lang.Object;
import vq4.c;
import vq4.d;
import java.lang.String;

public final class r1 implements g	// class@002b0a
{
    public final AdYodaActivity b;
    public final long c;
    public final long d;
    public final int e;

    public void r1(AdYodaActivity p0,long p1,long p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       r1 tb = this.b;
       p0.G = tb.L;
       p0 = p0.F;
       p0.j = tb.M;
       p0.E0 = 2;
       p0.n = 1;
       p0.H0 = this.c;
       p0.G0 = this.d;
       p0.I0 = String.valueOf(this.e);
    }
}
