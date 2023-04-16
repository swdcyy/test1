package ayc.d;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper$a;
import java.lang.Object;
import java.lang.Throwable;
import android.view.View;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.String;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class d implements g	// class@000306
{
    public final GifshowActivity b;
    public final WebView c;
    public final H5ImageRenderHelper$a d;

    public void d(GifshowActivity p0,WebView p1,H5ImageRenderHelper$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tc = this.c;
       d td = this.d;
       this.b.findViewById(0x1020002).getChildAt(0).removeView(tc);
       tc.removeJavascriptInterface("Kwai");
       JsErrorResult jsErrorResul = new JsErrorResult(412, "");
       td.a(jsErrorResul);
       return;
    }
}
