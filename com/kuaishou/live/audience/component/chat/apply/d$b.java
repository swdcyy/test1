package com.kuaishou.live.audience.component.chat.apply.d$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.audience.component.chat.apply.d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import xp5.g;
import rd1.c0;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import java.lang.Integer;
import o07.o;

public class d$b implements PopupInterface$h	// class@000a67
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       String id = QCurrentUser.me().getId();
       String liveStreamId = this.b.e.getLiveStreamId();
       if (!PatchProxy.applyVoidTwoRefs(id, liveStreamId, null, c0.class, "21")) {
          c0.P(1809, id, liveStreamId);
       }
       this.b.l.c9(true);
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d$b.class, "3")) {
          return;
       }
       d$b tb = this.b;
       tb.p = null;
       tb.l.c9(false);
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "2")) {
          return;
       }
       d$b tb = this.b;
       tb.p = null;
       tb.l.c9(false);
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
