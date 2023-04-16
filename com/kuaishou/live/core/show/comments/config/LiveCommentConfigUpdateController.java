package com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController;
import hf3.a;
import ne1.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController$scMessageListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import lf3.g;

public final class LiveCommentConfigUpdateController	// class@000a5b
{
    public final p a;
    public final a b;
    public final h c;

    public void LiveCommentConfigUpdateController(a p0,h p1){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveCommentsFeedService");
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(new LiveCommentConfigUpdateController$scMessageListener$2(this));
    }
    public final int a(int p0,int p1){
       LiveCommentConfigUpdateController liveCommentC = LiveCommentConfigUpdateController.class;
       if (PatchProxy.isSupport(liveCommentC)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, liveCommentC, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return q.n(p0, 0);
    }
    public final g b(){
       Object obj = PatchProxy.apply(null, this, LiveCommentConfigUpdateController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
