package com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel$userFollowState$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.UserInfo;
import qrd.l1;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.follow.cache.c;

public final class UserFollowPendantViewModel$userFollowState$1 extends Lambda implements p	// class@00174b
{
    public static final UserFollowPendantViewModel$userFollowState$1 INSTANCE;

    static {
       UserFollowPendantViewModel$userFollowState$1.INSTANCE = new UserFollowPendantViewModel$userFollowState$1();
    }
    public void UserFollowPendantViewModel$userFollowState$1(){
       super(2);
    }
    public final Boolean invoke(UserInfo p0,l1 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserFollowPendantViewModel$userFollowState$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "<anonymous parameter 1>");
       Boolean uBoolean = (p0 != null)? Boolean.valueOf(c.b().c(p0.mId)): null;
       return uBoolean;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
