package com.kuaishou.live.core.show.quiz.manager.k$b;
import hoc.b;
import com.kuaishou.live.core.show.quiz.manager.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hoc.a;
import hoc.c;

public class k$b extends b	// class@000e1b
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_QUIZ, "enter IdleState");
       return;
    }
    public boolean c(Message p0){
       k$b ta;
       Message obj = PatchProxy.applyOneRefs(p0, this, k$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != 2) {
          if (obj != 3) {
             if (obj != 4) {
                return false;
             }
             ta = this.a;
             ta.p(ta.h);
             this.a.s(p0);
             return true;
          }else {
             ta = this.a;
             ta.p(ta.g);
             this.a.r(p0);
             return true;
          }
       }else {
          ta = this.a;
          ta.p(ta.f);
          this.a.q(p0);
          return true;
       }
    }
}
