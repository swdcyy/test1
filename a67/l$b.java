package a67.l$b;
import android.view.View$OnClickListener;
import a67.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import a67.h$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.LinearLayout;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import lnc.a1;
import eq5.a;
import lp3.c;
import lp3.e;
import java.util.ArrayList;
import a67.m;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import a67.h;
import com.kwai.library.widget.popup.common.c;

public class l$b implements View$OnClickListener	// class@000060
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
          return;
       }
       l$b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, l.class, "9")) {
          h$b uob = new h$b(tb.getActivity());
          uob.G = tb.p;
          l r = tb.r;
          if (r != null && !r.getVisibility()) {
             objArray = n.B(tb.r, false);
          }
          float f = 8.00f;
          if (objArray != null) {
             uob.I = objArray.left - a1.e(f);
          }
          l s = tb.s;
          int i = (s != null)? s.getHeight() - a1.e(7.00f): a1.e(50.00f);
          uob.J = i + a1.e(f);
          uob.H = tb.q.a(a.class).ja();
          uob.M(new m(tb));
          h oh = new h(uob);
          tb.v = oh;
          oh.Z();
       }
       this.b.S8(false);
       return;
    }
}
