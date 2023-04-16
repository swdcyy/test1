package f69.f;
import erd.g;
import f69.s;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import ol5.a;

public final class f implements g	// class@0022b5
{
    public final s b;

    public void f(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          d.a(-1718536792).Y7(tb.getActivity(), ProfileStartParam.l(tb.q));
       }
       p0 = tb.s;
       if (p0 != null) {
          p0.b(tb.q.mId);
       }
       return;
    }
}
