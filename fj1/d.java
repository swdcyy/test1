package fj1.d;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import aj1.d;
import cj1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.EditText;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import fj1.d$a;
import brd.y;
import crd.b;

public final class d	// class@002357
{
    public final long a;
    public b b;
    public final EditText c;
    public final View d;
    public final TextView e;
    public final LiveViewSwitcher f;
    public final View g;
    public final LifecycleOwner h;
    public final d i;
    public final b j;

    public void d(View p0,LifecycleOwner p1,d p2,b p3){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "diyTextModel");
       a.p(p3, "diyInputInfo");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.a = 3000;
       View view = p0.findViewById(R.id.diy_edit_text);
       a.o(view, "rootView.findViewById\(R.id.diy_edit_text\)");
       this.c = view;
       view = p0.findViewById(R.id.diy_send_button);
       a.o(view, "rootView.findViewById\(R.id.diy_send_button\)");
       this.d = view;
       view = p0.findViewById(R.id.diy_input_progress);
       a.o(view, "rootView.findViewById\(R.id.diy_input_progress\)");
       this.e = view;
       p0 = p0.findViewById(R.id.diy_view_switcher);
       a.o(p0, "rootView.findViewById\(R.id.diy_view_switcher\)");
       this.f = p0;
    }
    public final TextView a(){
       return this.e;
    }
    public final LiveViewSwitcher b(){
       return this.f;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.d();
       t.interval(this.a, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new d$a(this));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          a.m(tb);
          if (!tb.isDisposed()) {
             tb = this.b;
             a.m(tb);
             tb.dispose();
             this.b = null;
          }
       }
       return;
    }
}
