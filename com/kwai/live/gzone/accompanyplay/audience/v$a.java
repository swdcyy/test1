package com.kwai.live.gzone.accompanyplay.audience.v$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.v;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.live.gzone.accompanyplay.audience.u;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;

public class v$a implements g	// class@000bbc
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
       }else if(p0.getFollowStatus() == User$FollowStatus.FOLLOWING){
          this.b.b.t.c();
       }
       return;
    }
}
