package k59.y1;
import erd.g;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import java.lang.Object;
import vq4.c;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import vq4.d;
import java.lang.String;

public final class y1 implements g	// class@002b36
{
    public final AdYodaFragment2 b;
    public final long c;
    public final long d;
    public final int e;

    public void y1(AdYodaFragment2 p0,long p1,long p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       AdYodaFragment2 j = this.b.J;
       p0.G = j.mAdPosition;
       p0 = p0.F;
       p0.n = j.mWebSource;
       p0.j = j.mEntrySource;
       p0.E0 = j.mWebViewType;
       p0.H0 = this.c;
       p0.G0 = this.d;
       p0.I0 = String.valueOf(this.e);
    }
}
