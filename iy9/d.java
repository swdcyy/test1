package iy9.d;
import qp7.d;
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
import iy9.f;
import iy9.b;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import iy9.c;
import android.view.View$OnClickListener;
import android.widget.TextView;

public final class d extends d	// class@0028c0
{
    public TextView l;

    public void d(){
       super();
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d03b6, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­ayout, parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
       }else {
          a.p(p0, "viewModel");
          b uob = new b(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, f.class, "2")) {
             a.p(uob, "observer");
             p0.d.d(p0.c(), uob);
          }
          d tl = this.l;
          if (tl != null) {
             tl.setOnClickListener(new c(this));
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.l = this.p().findViewById(0x7f0a33bf);
       return;
    }
}
