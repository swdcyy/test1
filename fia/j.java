package fia.j;
import ok.o;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class j implements o	// class@002914
{
    public final String b;

    public void j(String p0){
       this.b = p0;
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       FollowingUserBannerFeed$UserBannerInfo obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null){
          obj = p0.mUser;
       }else {
          obj = null;
       }
       if (obj != null && TextUtils.n(p0.mUser.mId, this.b)) {
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
