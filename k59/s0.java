package k59.s0;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.ad.webview.o;
import k59.e2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import m59.o;
import com.kuaishou.webkit.WebView;

public class s0 implements BaseCollapsedContainer$a	// class@002b10
{
    public final j a;

    public void s0(j p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,float p1){
       if (PatchProxy.isSupport(s0.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Float.valueOf(p1), this, s0.class, "1")) {
          return;
       }
       s0 ta = this.a;
       ta.B = p0;
       ta.S8();
       return;
    }
    public void b(boolean p0){
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os0, "2")) {
          return;
       }
       if (p0) {
          s0 ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, j.class, "12") && ta.C == null) {
             ta.C = true;
             j e = ta.E;
             if (e != null) {
                e.j();
             }
             if (!TextUtils.x(ta.q.k())) {
                e = ta.E;
                if (e != null && e.d() != null) {
                   ta.E.d().shouldOverrideUrlLoading(ta.x, ta.q.k());
                }
             }
          }
       }
    label_005e :
       return;
    }
}
