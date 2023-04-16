package com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel$a;
import z0.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.Pair;

public final class UserFollowPendantViewModel$a implements a	// class@00174a
{
    public final UserFollowPendantViewModel a;

    public void UserFollowPendantViewModel$a(UserFollowPendantViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserFollowPendantViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.g = p0;
       return new Pair(this.a.g, p0);
    }
}
