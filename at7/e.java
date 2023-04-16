package at7.e;
import qp7.d;
import com.kwai.slide.play.detail.traffic.SaveTrafficReminderAnimView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import qp7.x0;
import at7.g;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import at7.c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import at7.d;

public final class e extends d	// class@00036a
{
    public SaveTrafficReminderAnimView l;
    public TextView m;
    public HashMap n;

    public void e(){
       super();
    }
    public static final SaveTrafficReminderAnimView v(e p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("trafficAnimView");
       }
       return p0;
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d03c8, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­ayout, parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       g og = g.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          a.p(p0, "viewModel");
          View view = this.p().findViewById(R.id.slide_traffic_toast_anim);
          a.o(view, "view.findViewById\(R.id.slide_traffic_toast_anim\)");
          this.l = view;
          view = this.p().findViewById(R.id.slide_traffic_toast);
          a.o(view, "view.findViewById\(R.id.slide_traffic_toast\)");
          this.m = view;
          ViewGroup$LayoutParams layoutParams = this.p().getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.topMargin = a1.e(10.00f);
          c uoc = new c(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, og, str)) {
             a.p(uoc, "observer");
             p0.d.d(p0.c(), uoc);
          }
          d uod = new d(this);
          if (!PatchProxy.applyVoidOneRefs(uod, p0, og, "4")) {
             a.p(uod, "observer");
             p0.e.d(p0.c(), uod);
          }
       }
       return;
    }
}
