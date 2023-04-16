package com.kuaishou.live.gameinteractive.web.a$b;
import erd.o;
import com.kuaishou.live.gameinteractive.web.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.external.invoke.gzone.model.GameAnchorFollowInfo;
import t02.a0;
import com.kwai.framework.model.user.User;
import p91.m;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthPermissionException;

public class a$b implements o	// class@001bfb
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       GameAnchorFollowInfo gameAnchorFo = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (gameAnchorFo != PatchProxyResult.class) {
       }else if(p0.booleanValue()){
          p0 = this.b.p.Z2.I();
          gameAnchorFo = new GameAnchorFollowInfo();
          if (p0 != null) {
             gameAnchorFo.follow = p0.isFollowingOrFollowRequesting();
          }
       }else {
          throw new GameLiveAuthPermissionException();
       }
       return gameAnchorFo;
    }
}
