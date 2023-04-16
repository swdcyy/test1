package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mMaxRequestTime$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$a;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$SearchConfig;
import java.lang.Integer;

public final class UserProfileLastSeenPresenter$mMaxRequestTime$2 extends Lambda implements a	// class@001466
{
    public final UserProfileLastSeenPresenter this$0;

    public void UserProfileLastSeenPresenter$mMaxRequestTime$2(UserProfileLastSeenPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       ProfileLastSeenUtil obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter$mMaxRequestTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ProfileLastSeenUtil.b;
       ProfileLastSeenUtil$SearchConfig searchConfig = obj.a().c();
       if (this.this$0.D9() && searchConfig != null) {
          return searchConfig.totalRequestTime;
       }
       return obj.a().d();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
