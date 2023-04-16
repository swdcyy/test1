package k59.z1;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2$a;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.ad.webview.l;

public final class z1 implements Runnable	// class@002b3d
{
    public final AdYodaFragment2$a b;

    public void z1(AdYodaFragment2$a p0){
       this.b = p0;
    }
    public final void run(){
       z1 tb = this.b;
       KwaiYodaWebViewFragment r = tb.a.r;
       if (r != null && !r.canGoBack()) {
          tb.a.q.x(false);
       }
       return;
    }
}
