package r59.c;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebView;
import uxc.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;

public abstract class c implements WebViewFragment$a	// class@00363e
{
    public c a;

    public void c(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(WebView p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       uoc = this.a;
       if (uoc != null) {
          uoc.d(p0, p1);
       }
       return;
    }
    public boolean g(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       j0.f("DeeplinkHandler", this.getClass().getName()+" is processing", objArray);
       if (this.h(p0)) {
          obj = new Object[0];
          j0.f("DeeplinkHandler", "deepLink interrupt by:"+this.getClass().getName(), obj);
          return true;
       }else {
          c ta = this.a;
          if (ta != null) {
             return ta.g(p0);
          }
          return 0;
       }
    }
    public abstract boolean h(String p0);
    public c i(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.j(null);
       return this;
    }
    public void j(c p0){
       this.a = p0;
    }
}
