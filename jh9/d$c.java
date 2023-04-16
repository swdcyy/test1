package jh9.d$c;
import android.view.View$OnClickListener;
import jh9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import okd.b;
import lob.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import a46.b;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import n3d.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.d;

public final class d$c implements View$OnClickListener	// class@002ad8
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       d$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, d.class, "12")) {
          boolean b = true;
          t ot = b.a(-1033494876).V(tb.getActivity(), 0, tb.y, d.a(0x500192b6)).b(b).n(0);
          d q = tb.q;
          if (q == null) {
             a.S("taskId");
          }
          t ot1 = ot.a(q).o(b).l(0).s(new MusicRecommendParams()).f0(b).q(0).K(553).T(b).e(b);
          a.o(ot1, "ImplManager.create<Music¡­auncherFromTemplate\(true\)");
          RxBus.f.b(new d());
          ot1.h();
       }
       return;
    }
}
