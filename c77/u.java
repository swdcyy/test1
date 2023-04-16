package c77.u;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import c77.c0;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.String;
import com.kwai.library.widget.refresh.RefreshLayout;

public final class u implements RefreshLayout$g	// class@00050b
{
    public final c0 b;

    public void u(c0 p0){
       this.b = p0;
    }
    public final void onRefresh(){
       u tb = this.b;
       c0 x = tb.x;
       if (x != null && x.eh() != null) {
          tb.x.eh().loadUrl(tb.B);
       }else {
          tb.v.setRefreshing(false);
       }
       return;
    }
}
