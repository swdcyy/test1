package a6c.d;
import s5c.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import r5c.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.h;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;
import java.lang.Integer;
import k2b.e0;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class d extends r	// class@000089
{

    public void d(){
       super();
    }
    public void P8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "1")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       int i = 1;
       User[] userArray = new User[i];
       userArray[0] = this.p;
       ClientContent$ContentPackage uContentPack = a.c(Lists.e(userArray), this.r);
       uContentPack.photoPackage = w1.f(this.r.mEntity);
       h oh = h.m("1560449", "VIEW_USER_CARD");
       oh.c(uContentPack);
       oh.g(this.r.getFeedLogCtx());
       i3 oi3 = i3.f();
       oi3.d("click_area", "to_profile");
       r tp = this.p;
       Object obj = PatchProxy.applyOneRefs(tp, this, uod, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(b.a(tp, 0) == UserFollowState.FOLLOWED_EACH_OTHER){
          i = (b.a(tp, 0) == UserFollowState.FOLLOW_FAN)? 2: 0;
       }
       oi3.c("relationship", Integer.valueOf(i));
       oh.n(oi3.e());
       oh.i(this.q);
       d.a(-1718536792).Y7(this.getActivity(), ProfileStartParam.l(this.p));
       return;
    }
}
