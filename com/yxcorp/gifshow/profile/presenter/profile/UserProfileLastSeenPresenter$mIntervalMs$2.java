package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mIntervalMs$2;
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
import java.lang.Long;

public final class UserProfileLastSeenPresenter$mIntervalMs$2 extends Lambda implements a	// class@001465
{
    public final UserProfileLastSeenPresenter this$0;

    public void UserProfileLastSeenPresenter$mIntervalMs$2(UserProfileLastSeenPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       ProfileLastSeenUtil obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter$mIntervalMs$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = ProfileLastSeenUtil.b;
       ProfileLastSeenUtil$SearchConfig searchConfig = obj.a().c();
       if (this.this$0.D9() && searchConfig != null) {
          return searchConfig.intervalMs;
       }
       return obj.a().a();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
