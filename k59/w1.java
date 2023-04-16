package k59.w1;
import erd.g;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import java.lang.Object;
import vq4.c;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import vq4.d;

public final class w1 implements g	// class@002b2e
{
    public final AdYodaFragment2 b;

    public void w1(AdYodaFragment2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       AdYodaFragment2 j = this.b.J;
       p0.G = j.mAdPosition;
       p0 = p0.F;
       p0.n = j.mWebSource;
       p0.j = j.mEntrySource;
       p0.E0 = j.mWebViewType;
    }
}
