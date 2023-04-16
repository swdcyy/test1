package df2.t;
import erd.g;
import df2.m0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zic.f;
import e17.i;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;

public final class t implements g	// class@002506
{
    public final m0 b;

    public void t(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       p0.isBlocked = true;
       f.e(tb.x.getUserProfile().mProfile.mId, 0, tb.w.Q2(), 0);
       i.a(R.style.arg_RES_7f110669, 0x7f10011b);
       if (tb.x.getUserProfile().isFollowingOrFollowRequesting()) {
          p0 = new User();
          p0.mId = tb.x.getUserProfile().mProfile.mId;
          p0.setFollowStatus(User$FollowStatus.UNFOLLOW);
          RxBus.f.b(n.a(p0));
       }
       return;
    }
}
