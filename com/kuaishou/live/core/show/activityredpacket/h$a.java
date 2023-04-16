package com.kuaishou.live.core.show.activityredpacket.h$a;
import uw1.g;
import com.kuaishou.live.core.show.activityredpacket.h;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import java.util.Iterator;
import o22.b;
import java.util.Objects;
import uw1.f;
import com.kuaishou.live.core.show.activityredpacket.i;

public class h$a implements g	// class@000952
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       h$a ta = this.a;
       ta.N = ta.M.v4();
       Iterator iterator = this.a.N.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          h$a ta1 = this.a;
          Objects.requireNonNull(ta1);
          i oi = PatchProxy.applyOneRefs(uob, ta1, h.class, "4");
          if (oi != PatchProxyResult.class) {
          }else {
             oi = new i(ta1, uob);
          }
          obj.add(oi);
       }
       return obj;
    }
}
