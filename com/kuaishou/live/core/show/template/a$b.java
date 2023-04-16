package com.kuaishou.live.core.show.template.a$b;
import com.kuaishou.live.core.show.template.a$e;
import com.kuaishou.live.core.show.template.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class a$b implements a$e	// class@00117a
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(LiveUserStatusResponse$ActivityEnterRoomHint p0,int p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.R8(p0, p1);
       return;
    }
}
