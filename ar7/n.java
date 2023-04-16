package ar7.n;
import qp7.d;
import java.util.HashMap;
import ar7.n$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import kotlin.jvm.internal.a;
import qp7.x0;
import ar7.r;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.utility.n;
import ar7.o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ar7.p;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import ar7.n$b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;

public final class n extends d	// class@000358
{
    public Map l;
    public int m;
    public final ViewTreeObserver$OnGlobalLayoutListener n;
    public HashMap o;

    public void n(){
       super();
       this.l = new HashMap(3);
       this.n = new n$a(this);
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d038e, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­       parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, str)) {
       }else {
          a.p(p0, "viewModel");
          Context uContext = this.k();
          Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.app.Activity");
          this.m = n.k(uContext);
          o oo = new o(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(oo, p0, r.class, str)) {
             a.p(oo, "observer");
             p0.d.d(p0.c(), oo);
          }
          this.p().addOnAttachStateChangeListener(new p(this));
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.l = new HashMap(3);
       this.v(R.id.co_creator_more).setOnClickListener(new n$b(this));
       return;
    }
    public View v(int p0){
       View obj;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.o == null) {
          this.o = new HashMap();
       }
       obj = this.o.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = this.j0();
          if (obj == null) {
             return null;
          }else {
             obj = obj.findViewById(p0);
             this.o.put(Integer.valueOf(p0), obj);
          }
       }
       return obj;
    }
}
