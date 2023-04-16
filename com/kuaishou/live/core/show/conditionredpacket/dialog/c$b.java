package com.kuaishou.live.core.show.conditionredpacket.dialog.c$b;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c$c;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c;
import java.lang.Object;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class c$b implements c$c	// class@000a72
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(LiveFollowExtParams p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
          return;
       }
       this.a.h9(p0, p1);
       return;
    }
}
