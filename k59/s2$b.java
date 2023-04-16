package k59.s2$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import k59.s2;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Integer;
import brd.t;
import java.util.concurrent.TimeUnit;
import k59.s2$b$a;
import erd.o;
import t45.d;
import brd.z;
import k59.s2$b$b;
import k59.s2$b$c;
import k59.s2$b$d;
import erd.g;
import crd.b;

public final class s2$b implements WebViewFragment$a	// class@002b17
{
    public final s2 a;

    public void s2$b(s2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       float f;
       if (PatchProxy.isSupport(s2$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, s2$b.class, "1")) {
          return;
       }
       f.b(this, p0, p1, p2);
       View view = this.a.m8().findViewById(R.id.title_tv);
       if (view != null) {
          int i = (p2)? 0: 4;
          view.setVisibility(i);
       }
       if (!p2) {
          return;
       }else {
          f = 0x3f866666;
          KwaiYodaWebViewFragment kwaiYodaWebV = this.a.P8();
          if (kwaiYodaWebV != null) {
             kwaiYodaWebV.fh(this);
          }
          z c = d.c;
          t ot = t.just(Integer.valueOf(1)).delay(1000, TimeUnit.MILLISECONDS).map(new s2$b$a(this, p0)).subscribeOn(c).observeOn(c);
          this.a.X7(ot.map(new s2$b$b(this, f, p0)).observeOn(d.a).subscribe(new s2$b$c(this), s2$b$d.b));
          return;
       }
    }
    public void c(WebView p0,int p1,String p2,String p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(WebView p0,int p1){
       f.d(this, p0, p1);
    }
}
