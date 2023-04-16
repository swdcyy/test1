package c5c.n;
import u07.u;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import s1c.j1;
import u3c.b;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import z5c.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;

public final class n implements u	// class@00052d
{
    public final h b;

    public void n(h p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       n tb = this.b;
       Objects.requireNonNull(tb);
       View view = p0.z();
       if (view != null) {
          view.setTag(R.id.tag_view_refere, Integer.valueOf(tb.r.mFollowRefer));
          tb.p.g.onNext(new b(true, tb.getActivity().R2(view)));
          tb.p.h.onNext(new Object());
       }
       h t = tb.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(null, t, g.class, "2")) {
          h oh = h.k("CLICK_H5_FOLLOW");
          oh.e("PROFILE");
          oh.c(b0.f(t.a));
          oh.h();
       }
       return;
    }
}
