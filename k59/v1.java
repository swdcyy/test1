package k59.v1;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.ad.webview.l;

public final class v1 implements Runnable	// class@002b28
{
    public final AdYodaFragment$a b;

    public void v1(AdYodaFragment$a p0){
       this.b = p0;
    }
    public final void run(){
       v1 tb = this.b;
       KwaiYodaWebViewFragment r = tb.a.r;
       if (r != null && !r.canGoBack()) {
          tb.a.q.x(false);
       }
       return;
    }
}
