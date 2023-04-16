package k3a.n;
import j3a.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j3a.b$a;
import j3a.a;
import k3a.m;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import i2b.a;

public final class n implements b	// class@002bd0
{
    public View a;

    public void n(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
       }else {
          a.p(p0, "element");
          n ta = this.a;
          if (ta == null) {
             a.S("divider");
          }
          ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
          if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams = null;
          }
          if (layoutParams != null) {
             layoutParams.topMargin = p0.e;
             layoutParams.bottomMargin = p0.f;
          }
          ta = this.a;
          if (ta == null) {
             a.S("divider");
          }
          ta.getLayoutParams().height = p0.g;
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1165);
       a.o(view, "KwaiLayoutInflater.infla¡­er_panel_element_divider\)");
       return view;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.findViewById(R.id.divider);
       a.o(p0, "view.findViewById\(R.id.divider\)");
       this.a = p0;
       return;
    }
}
