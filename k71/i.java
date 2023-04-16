package k71.i;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$a;
import asd.c;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$b;
import com.kwai.framework.model.user.UserInfo;
import kotlin.jvm.internal.a;
import o63.m$a;
import kotlin.Result;

public final class i implements FollowHelper$a	// class@002cb6
{
    public final LiveJsCmdFollowUser a;
    public final LiveJsCmdFollowUser$a b;
    public final c c;

    public void i(LiveJsCmdFollowUser p0,LiveJsCmdFollowUser$a p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(boolean p0,g p1){
       if (PatchProxy.isSupport2(i.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, i.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_FOLLOW, "followUser£¬isSuccess: "+p0);
       UserInfo mId = this.b.b().mId;
       a.o(mId, "params.userInfo.mId");
       LiveJsCmdFollowUser$b uob = new LiveJsCmdFollowUser$b(p0, mId);
       this.c.resumeWith(Result.constructor-impl(m$a.g(m.g, uob, false, 2, null)));
       PatchProxy.onMethodExit(i.class, "1");
       return;
    }
}
