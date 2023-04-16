package c77.w;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import c77.c0;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Integer;

public class w implements WebViewFragment$a	// class@00050d
{
    public final c0 a;

    public void w(c0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, w.class, "1")) {
          return;
       }
       this.a.v.setRefreshing(false);
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, w.class, "2")) {
          return;
       }
       this.a.v.setRefreshing(false);
       return;
    }
    public void d(WebView p0,int p1){
    }
}
