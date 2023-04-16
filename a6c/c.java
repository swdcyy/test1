package a6c.c;
import s5c.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import r5c.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.h;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;

public class c extends k	// class@000088
{

    public void c(){
       super();
    }
    public static ClientContent$ContentPackage Y8(QPhoto p0,User p1){
       User[] obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new User[]{p1};
       ClientContent$ContentPackage uContentPack = a.c(Lists.e(obj), p0);
       uContentPack.photoPackage = w1.f(p0.mEntity);
       return uContentPack;
    }
    public void P8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       h oh = h.m("1560449", "VIEW_USER_CARD");
       oh.c(c.Y8(this.s, p0));
       oh.g(this.s.getFeedLogCtx());
       i3 oi3 = i3.f();
       oi3.d("click_area", "follow");
       oi3.c("relationship", Integer.valueOf(this.Z8(p0)));
       oh.n(oi3.e());
       oh.i(this.r);
       return;
    }
    public void R8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       h oh = h.m("1560449", "VIEW_USER_CARD");
       oh.c(c.Y8(this.s, p0));
       oh.g(this.s.getFeedLogCtx());
       i3 oi3 = i3.f();
       oi3.d("click_area", "follow_each_other");
       oi3.c("relationship", Integer.valueOf(this.Z8(p0)));
       oh.n(oi3.e());
       oh.i(this.r);
       return;
    }
    public void S8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       h oh = h.m("1560449", "VIEW_USER_CARD");
       oh.c(c.Y8(this.s, p0));
       oh.g(this.s.getFeedLogCtx());
       i3 oi3 = i3.f();
       oi3.d("click_area", "to_profile");
       oi3.c("relationship", Integer.valueOf(this.Z8(p0)));
       oh.n(oi3.e());
       oh.i(this.r);
       return;
    }
    public void V8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       h oh = h.m("1560449", "VIEW_USER_CARD");
       oh.c(c.Y8(this.s, p0));
       oh.g(this.s.getFeedLogCtx());
       i3 oi3 = i3.f();
       oi3.d("click_area", "unfollow");
       oi3.c("relationship", Integer.valueOf(this.Z8(p0)));
       oh.n(oi3.e());
       oh.i(this.r);
       return;
    }
    public final int Z8(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (b.a(p0, false) == UserFollowState.FOLLOWED_EACH_OTHER) {
          return 1;
       }
       if (b.a(p0, false) == UserFollowState.FOLLOW_FAN) {
          return 2;
       }
       return false;
    }
}
