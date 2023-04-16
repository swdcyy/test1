package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPercent$2;
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
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.StringBuilder;
import v2c.e;
import v2c.g;
import usd.q;
import java.lang.Integer;

public final class UserProfileLastSeenPresenter$mPercent$2 extends Lambda implements a	// class@00146a
{
    public final UserProfileLastSeenPresenter this$0;

    public void UserProfileLastSeenPresenter$mPercent$2(UserProfileLastSeenPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       ProfileLastSeenUtil obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenter$mPercent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ProfileLastSeenUtil.b;
       ProfileLastSeenUtil$SearchConfig searchConfig = obj.a().c();
       g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "isFromSearch: "+this.this$0.D9());
       if (this.this$0.D9() && searchConfig != null) {
          return q.u(100, q.n(0, searchConfig.percent));
       }
       return q.u(100, q.n(0, obj.a().b()));
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
