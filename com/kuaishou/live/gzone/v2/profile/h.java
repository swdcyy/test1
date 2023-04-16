package com.kuaishou.live.gzone.v2.profile.h;
import com.kuaishou.live.gzone.v2.profile.j$b;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wj2.o0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import kp.r1;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class h implements j$b	// class@001ceb
{
    public final e a;

    public void h(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       e obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.u;
       if (obj == null) {
          return false;
       }
       return obj.a();
    }
    public boolean b(BaseFeed p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       LivePlayLogger.onPlayPhoto(p0, r1.U1(p0), p1, 805, this.a.r.getProfileOriginSource());
       e u = this.a.u;
       if (u == null) {
          return false;
       }else {
          return u.b(p0);
       }
    }
}
