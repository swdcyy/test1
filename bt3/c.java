package bt3.c;
import z1.k;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.kuaishou.webkit.WebView;
import java.lang.String;

public final class c implements k	// class@00043c
{
    public final MerchantYodaWebViewActivity b;

    public void c(MerchantYodaWebViewActivity p0){
       this.b = p0;
    }
    public final Object get(){
       c tb = this.b;
       String str = (tb.R0() == null || tb.R0().eh() == null)? "": tb.R0().eh().getUrl();
       return str;
    }
}
