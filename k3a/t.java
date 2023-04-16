package k3a.t;
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
import k3a.s;
import android.view.ViewGroup$LayoutParams;
import android.widget.Space;
import i2b.a;

public final class t implements b	// class@002bd6
{
    public Space a;

    public void t(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "3")) {
       }else {
          a.p(p0, "element");
          t ta = this.a;
          if (ta == null) {
             a.S("space");
          }
          ta.getLayoutParams().height = p0.e;
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1168);
       a.o(view, "KwaiLayoutInflater.infla¡­ayer_panel_element_space\)");
       return view;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.findViewById(R.id.space);
       a.o(p0, "view.findViewById\(R.id.space\)");
       this.a = p0;
       return;
    }
}
