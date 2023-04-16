package com.kuaishou.live.core.show.quiz.manager.k$e;
import com.kuaishou.live.core.show.quiz.manager.k$a;
import com.kuaishou.live.core.show.quiz.manager.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hoc.a;
import hoc.c;

public class k$e extends k$a	// class@000e1e
{
    public final k b;

    public void k$e(k p0){
       this.b = p0;
       super(p0);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$e.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceStateMachine"), "enter ReviewFalseState");
       return;
    }
    public boolean c(Message p0){
       k$e obj = PatchProxy.applyOneRefs(p0, this, k$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != 2) {
          return super.c(p0);
       }
       obj = this.b;
       obj.p(obj.f);
       this.b.q(p0);
       return true;
    }
}
