package gob.b;
import com.smile.gifmaker.mvps.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import qw5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import brd.t;
import gob.a;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import erd.g;
import crd.b;

public class b extends b	// class@002b4b
{
    public ProfileParam r;
    public User s;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       t ot = d.a(0x27ae02e4).Hl(activity, false, (this.s.getId()).equals(QCurrentUser.me().getId()), this.r.mPhotoTabId);
       this.X7(ot.subscribe(new a(this), a0.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.q8(ProfileParam.class);
       this.s = this.q8(User.class);
       return;
    }
}
