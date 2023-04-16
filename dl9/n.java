package dl9.n;
import android.view.View$OnClickListener;
import dl9.o;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import wh5.c;
import nk9.k;
import com.kuaishou.android.model.mix.QComment;
import brd.y;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import yk9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import k2b.e0;

public final class n implements View$OnClickListener	// class@001f8a
{
    public final o b;

    public void n(o p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (!c.c()) {
       }else {
          tb.v.onNext(new k(tb.u, false));
          o w = tb.w;
          o u = tb.u;
          x ox = tb.getActivity().N2();
          Objects.requireNonNull(w);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(u, ox, Boolean.TRUE, w, d.class, "41")) {
             w.A(u, null, ox, true);
          }
       }
       return;
    }
}
