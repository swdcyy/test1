package com.kuaishou.live.audience.component.chat.apply.d$a;
import kg1.f$a;
import com.kuaishou.live.audience.component.chat.apply.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;

public class d$a implements f$a	// class@000a66
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.CHAT, "Join fans group fail!");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.CHAT, "Join fans group success!");
       d l = this.a.l;
       l.t8(l.xb(), "BOTTOM");
       return;
    }
}
