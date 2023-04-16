package cn4.b;
import z1.k;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewActivity;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.kuaishou.webkit.WebView;
import java.lang.String;

public final class b implements k	// class@000496
{
    public final MerchantTrilateralYodaWebViewActivity b;

    public void b(MerchantTrilateralYodaWebViewActivity p0){
       this.b = p0;
    }
    public final Object get(){
       b tb = this.b;
       String str = (tb.R0() == null || tb.R0().eh() == null)? "": tb.R0().eh().getUrl();
       return str;
    }
}
