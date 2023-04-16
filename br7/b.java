package br7.b;
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
import br7.c;
import android.widget.TextView;
import android.text.TextPaint;
import br7.a;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import qp7.t0;
import android.graphics.Paint;
import java.lang.Integer;
import java.util.HashMap;

public final class b extends d	// class@000450
{
    public HashMap l;

    public void b(){
       super();
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d0390, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­       parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          a.p(p0, "viewModel");
          TextView textView = this.v(R.id.create_date_tv);
          a.o(textView, "create_date_tv");
          TextPaint paint = textView.getPaint();
          a.o(paint, "create_date_tv.paint");
          paint.setFakeBoldText(true);
          a uoa = new a(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, c.class, "4")) {
             a.p(uoa, "observer");
             p0.f.d(p0.c(), uoa);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.j().f()) {
          this.p().setLayerType(2, null);
       }
       return;
    }
    public View v(int p0){
       View obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.l == null) {
          this.l = new HashMap();
       }
       obj = this.l.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = this.j0();
          if (obj == null) {
             return null;
          }else {
             obj = obj.findViewById(p0);
             this.l.put(Integer.valueOf(p0), obj);
          }
       }
       return obj;
    }
}
