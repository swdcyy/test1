package k59.y;
import msd.a;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import wkd.b;
import k59.d2;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kuaishou.webkit.WebView;
import l59.b;
import com.kuaishou.webkit.DownloadListener;
import m59.o;
import r59.b;
import r59.i;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import qrd.l1;

public final class y implements a	// class@002b38
{
    public final f b;

    public void y(f p0){
       this.b = p0;
    }
    public final Object invoke(){
       f b;
       f f;
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "13")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "AdLandingPageFragment";
          j0.f(str, "webView nonReload only show", objArray);
          tb.t.setDownloadListener(b.a(0xb238bc2).b(tb.getActivity(), tb.p.getPhoto(), tb.t, tb.B));
          b = tb.B;
          if (b == null) {
             Object[] objArray1 = new Object[i];
             j0.c(str, "Empty web client", objArray1);
          }else if(tb.L == null){
             f e = tb.E;
             if (e != null) {
                f g = tb.G;
                if (g != null) {
                   tb.X8(b, e, g);
                }
             }
          }
          f = tb.F;
          if (f != null) {
             f.a();
          }
       }
       return l1.a;
    }
}
