package com.kuaishou.recruit.live.explain.anchor.c$b;
import com.kuaishou.live.anchorchat.LiveAnchorChatBaseService$a;
import com.kuaishou.recruit.live.explain.anchor.c;
import java.lang.Object;
import mw0.a;
import mw0.b;
import com.kuaishou.live.anchorchat.LiveAnchorChatBaseService$AnchorChatState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.recruit.live.explain.anchor.g;
import jt4.a;

public class c$b implements LiveAnchorChatBaseService$a	// class@000eb8
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void d(b p0){
       a.b(this, p0);
    }
    public void e(LiveAnchorChatBaseService$AnchorChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b ta = this.a;
       if (ta.t.f != null && p0 == LiveAnchorChatBaseService$AnchorChatState.END) {
          ta.v.a(true);
       }
       return;
    }
}
