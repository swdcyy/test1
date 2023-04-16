package c7c.g;
import android.view.View$OnClickListener;
import c7c.o;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import k2b.e0;
import com.kwai.framework.model.user.User;
import rra.a;
import x6c.p;
import wkd.b;
import mac.a;
import brd.t;
import cjd.e;
import erd.o;
import c7c.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nu7.a;
import c7c.n;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import y6c.e;

public final class g implements View$OnClickListener	// class@000544
{
    public final o b;

    public void g(o p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o x;
       boolean b;
       g tb = this.b;
       Objects.requireNonNull(tb);
       o oo = o.class;
       if (PatchProxy.applyVoid(null, tb, oo, "2")) {
       }else if(tb.E != null){
          x = tb.x;
          if (x != null) {
             a.a(x, x.getFragmentManager(), tb.t, 3);
          }
       }
       x = tb.F;
       if (x != null && x.c(tb.x)) {
          tb.F.a(tb.x, tb.y);
       }else if(tb.P8(tb.t)){
          x = tb.t;
          if (!PatchProxy.applyVoidOneRefs(x, tb, oo, "8")) {
             tb.X7(b.a(-1975598500).d(x.getId()).map(new e()).subscribe(new h(x), Functions.e));
          }
       }else {
          oo = tb.z;
          b = (oo != null && oo.a != null)? true: false;
          n on = new n(tb, tb.getActivity(), tb.s, tb.A, b, tb.v);
          1.a();
       }
       return;
    }
}
