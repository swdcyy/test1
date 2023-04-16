package com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel$showMuted$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Set;
import ts2.d;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class UserMutedPendantViewModel$showMuted$1 extends Lambda implements p	// class@00174d
{
    public static final UserMutedPendantViewModel$showMuted$1 INSTANCE;

    static {
       UserMutedPendantViewModel$showMuted$1.INSTANCE = new UserMutedPendantViewModel$showMuted$1();
    }
    public void UserMutedPendantViewModel$showMuted$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(Set p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserMutedPendantViewModel$showMuted$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userMutedInfo");
       boolean b = true;
       if (p1 == null || p1.a() != b) {
          UserInfo userInfo = null;
          if (p1 != null) {
             j state = p1.getState();
             UserInfo userInfo1 = (state instanceof j$a)? state.a(): userInfo;
             if (userInfo1 != null) {
                userInfo = userInfo1.mId;
             }
          }
          if (!CollectionsKt___CollectionsKt.H1(p0, userInfo)) {
             b = false;
          }
       }
       return b;
    }
}
