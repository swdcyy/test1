package fia.f$h;
import erd.g;
import fia.f;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bia.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import bia.d;

public final class f$h implements g	// class@002903
{
    public final f b;

    public void f$h(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$h.class, "1")) {
       }else {
          f$h tb = this.b;
          int i = 0;
          if (p0 != null) {
             Iterator obj = PatchProxy.applyOneRefs(p0, null, k.class, "7");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                a.p(p0, "infos");
                obj = p0.iterator();
                while (obj.hasNext()) {
                   FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = obj.next().mAvatarInfo;
                   if (mAvatarInfo != null && mAvatarInfo.mStatus == 1) {
                      i = i + 1;
                   }
                }
             }
          }
          tb.J = i;
          this.b.S8().f(this.b.J);
          this.b.Z8();
          this.b.S8().g(p0);
       }
       return;
    }
}
