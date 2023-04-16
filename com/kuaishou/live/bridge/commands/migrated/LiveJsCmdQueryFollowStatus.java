package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus$Params;
import vm2.a;
import com.kuaishou.live.common.core.component.follow.cache.c;

public final class LiveJsCmdQueryFollowStatus extends AbstractLiveJsCommand	// class@000e24
{

    public void LiveJsCmdQueryFollowStatus(){
       super();
    }
    public Class a(){
       return LiveJsCmdQueryFollowStatus$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       LiveJsCmdQueryFollowStatus$Params params;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdQueryFollowStatus.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdQueryFollowStatus$a) {
          return m.g.c("invalid params");
       }
       params = p0.a();
       String str = (params != null)? params.a(): null;
       if (str == null) {
          return m.g.c("uid is required");
       }else {
          a uoa = new a();
          uoa.mFollowStatus = c.b().c(p0.a().a());
          return m.g.f(uoa, true);
       }
    }
}
