package k59.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import nl9.u;
import android.app.Activity;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;

public final class k1 extends PresenterV2	// class@002aee
{
    public View p;
    public BaseFeed q;

    public void k1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k1.class, "2")) {
          return;
       }
       k1 tq = this.q;
       if (tq != null && k.A(tq) != null) {
          View view = this.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          this.p = d.a(-1694791652).wK(this.getActivity(), view, tq, true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k1.class, "3")) {
          return;
       }
       k1 tp = this.p;
       if (tp != null) {
          View view = this.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          view.removeView(tp);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k1.class, "1")) {
          return;
       }
       this.q = this.q8(BaseFeed.class);
       return;
    }
}
