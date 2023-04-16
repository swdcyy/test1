package k59.g0;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import m59.o;
import r59.b;
import r59.i;
import k59.e2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.WebView;

public class g0 implements BaseCollapsedContainer$a	// class@002add
{
    public final f a;

    public void g0(f p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,float p1){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Float.valueOf(p1), this, g0.class, "1")) {
          return;
       }
       g0 ta = this.a;
       ta.I = p0;
       ta.Z8();
       return;
    }
    public void b(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "2")) {
          return;
       }
       if (p0) {
          g0 ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, f.class, "17") && ta.K == null) {
             ta.K = true;
             f b = ta.B;
             if (b != null) {
                f e = ta.E;
                if (e != null) {
                   f g = ta.G;
                   if (g != null) {
                      ta.X8(b, e, g);
                   }
                }
             }
             if (!TextUtils.x(ta.q.k())) {
                b = ta.B;
                if (b != null) {
                   b.shouldOverrideUrlLoading(ta.t, ta.q.k());
                }
             }
          }
       }
    label_005a :
       return;
    }
}
