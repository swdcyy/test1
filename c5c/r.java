package c5c.r;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.o;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import c5c.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public final class r implements g	// class@000531
{
    public final o b;

    public void r(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (t.a(p0.getFirst())) {
          t.c(tb.getActivity(), p0.getSecond(), tb.t, p0.getFirst(), tb.r);
       }
       return;
    }
}
