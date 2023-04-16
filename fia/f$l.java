package fia.f$l;
import erd.g;
import fia.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fia.j;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.List;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import bia.d;

public final class f$l implements g	// class@002907
{
    public final f b;

    public void f$l(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$l.class, "1")) {
       }else {
          int i = y.o(this.b.I, new j(p0));
          int i1 = -1;
          if (i != i1) {
             FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = this.b.I.get(i).mAvatarInfo;
             if (mAvatarInfo != null && mAvatarInfo.mStatus == 1) {
                f$l tb = this.b;
                tb.J = tb.J + i1;
             }
             this.b.S8().f(this.b.J);
             this.b.I.remove(i);
             this.b.S8().g(this.b.I);
          }
       }
       return;
    }
}
