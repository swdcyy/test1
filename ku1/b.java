package ku1.b;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import du1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ku1.b$a;
import ku1.b$b;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import ju1.a;
import ku1.c;
import ku1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import zs1.b;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.LayoutInflater;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class b extends LiveMultiPkRenderChildViewController	// class@002e04
{
    public View q;
    public KwaiImageView r;
    public Runnable s;
    public Runnable t;
    public final d u;

    public void b(d p0){
       a.p(p0, "pkDelegate");
       super();
       this.u = p0;
       this.s = new b$a(this);
       this.t = new b$b(this);
    }
    public static final View e3(b p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("bestAreaView");
       }
       return p0;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       k1.n(this.s);
       k1.n(this.t);
       return;
    }
    public void V2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
       }else {
          a.p(p0, "viewModel");
          p0.h.observe(this, new a(this));
       }
       return;
    }
    public a W2(b p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "pkCoreModel");
          uoc = new c(p0, this.b3(), this.u);
       }
       return uoc;
    }
    public View X2(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("bestAreaView");
       }
       return obj;
    }
    public void d3(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "root");
       View view = a.c(LayoutInflater.from(this.D2()), R.layout.arg_RES_7f0d0cbb, p0, false);
       a.o(view, "LayoutInflater.from\(cont¡­area_layout, root, false\)");
       this.q = view;
       String str = "bestAreaView";
       if (view == null) {
          a.S(str);
       }
       view.setVisibility(8);
       b tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       view = tq.findViewById(R.id.self_anchor_adjust_position_iv);
       a.o(view, "bestAreaView.findViewByI¡­nchor_adjust_position_iv\)");
       this.r = view;
       return;
    }
}
