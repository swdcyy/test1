package ayc.e;
import erd.g;
import com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import android.app.Activity;
import android.view.ViewGroup;

public final class e implements g	// class@000307
{
    public final H5ImageRenderHelper$a b;
    public final GifshowActivity c;
    public final WebView d;

    public void e(H5ImageRenderHelper$a p0,GifshowActivity p1,WebView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e td = this.d;
       this.b.a(new JsErrorResult(p0.intValue(), ""));
       this.c.findViewById(0x1020002).getChildAt(0).removeView(td);
       td.removeJavascriptInterface("Kwai");
    }
}
