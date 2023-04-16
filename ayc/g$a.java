package ayc.g$a;
import com.yxcorp.gifshow.webview.api.EnhancedWebView$a;
import java.lang.Object;
import oe6.b;
import ayc.a;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.w0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import uv8.g1;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.webview.helper.a;
import erd.a;
import com.yxcorp.gifshow.webview.helper.b;
import com.yxcorp.gifshow.webview.helper.c;
import erd.g;

public class g$a implements EnhancedWebView$a	// class@000309
{
    public a a;

    public void g$a(){
       super();
       if (!b.e()) {
          this.a = new a();
       }
       return;
    }
    public void a(WebView p0,String p1){
       a a;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, str)) {
          return;
       }
       g$a ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p1, ta, uoa, str) && (!b.e() && !TextUtils.x(p1))) {
             Uri uri = w0.f(p1);
             Object[] objArray = null;
             a uoa1 = PatchProxy.apply(objArray, ta, uoa, "2");
             if (uoa1 != PatchProxyResult.class) {
             }else if(ta.b == null){
                String str1 = b.v();
                if (TextUtils.x(str1)) {
                   str1 = WebEntryUrls.d;
                }
                ta.b = w0.f(str1);
                Object[] objArray4 = new Object[0];
                g1.C().w("AutoUploadUserLogOnFeedback", "getFeedbackSubmitUri : "+ta.b, objArray4);
             }
             uoa1 = ta.b;
             if (uri == null || (uoa1 != null && TextUtils.n(uri.getPath(), uoa1.getPath()))) {
                Object[] objArray1 = new Object[0];
                g1.C().w("AutoUploadUserLogOnFeedback", "need auto upload. \ngetFeedbackSubmitUri : "+ta.b+", currentUri: "+uri, objArray1);
                if (!PatchProxy.applyVoid(objArray, ta, uoa, "4")) {
                   a = ta.a;
                   if (a != null && !a.isDisposed()) {
                      Object[] objArray2 = new Object[0];
                      g1.C().A("AutoUploadUserLogOnFeedback", "uploadUserLog ongoing, do\'not need start again", objArray2);
                   }else {
                      int i = a.t().a("obiwanAutoUploadDelay", 10);
                      Object[] objArray3 = new Object[0];
                      g1.C().w("AutoUploadUserLogOnFeedback", "uploadUserLog start countdown: "+i, objArray3);
                      long l = (long)i;
                      ta.a = t.just("{\"type\": \"feedback\"}").delay(l, TimeUnit.SECONDS).subscribeOn(d.d).observeOn(d.c).doOnDispose(a.b).subscribe(b.b, c.b);
                   }
                }
             }
          }
       }
    label_011b :
       return;
    }
    public void b(WebView p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       g$a ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, a.class, "3")) {
             int i = 0;
             Object[] objArray = new Object[i];
             g1.C().s("AutoUploadUserLogOnFeedback", "release start", objArray);
             a = ta.a;
             if (a != null && !a.isDisposed()) {
                Object[] objArray1 = new Object[i];
                g1.C().s("AutoUploadUserLogOnFeedback", "release success", objArray1);
                ta.a.dispose();
             }
          }
       }
       return;
    }
}
