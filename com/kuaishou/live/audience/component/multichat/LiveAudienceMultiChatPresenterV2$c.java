package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$c;
import d21.a;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;

public final class LiveAudienceMultiChatPresenterV2$c implements a	// class@000b9a
{
    public final LiveAudienceMultiChatPresenterV2 b;

    public void LiveAudienceMultiChatPresenterV2$c(LiveAudienceMultiChatPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void v0(int p0){
       LiveAudienceMultiChatPresenterV2$c uoc = LiveAudienceMultiChatPresenterV2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 d = this.b.D;
       if (d != null) {
          d.v0(p0);
       }
       return;
    }
}
