package com.kuaishou.live.core.show.luckystar.c$c;
import zb2.f0;
import com.kuaishou.live.core.show.luckystar.c;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import t02.a0;
import p91.m;
import zb2.e0;

public class c$c implements f0	// class@000cbc
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       this.a.D.Z2.w0(new UserProfile(p0), LiveStreamClickType.LUCKY_STAR, 0, true, 83);
       return;
    }
    public void b(){
       e0.a(this);
    }
}
