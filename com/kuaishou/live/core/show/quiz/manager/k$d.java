package com.kuaishou.live.core.show.quiz.manager.k$d;
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

public class k$d extends k$a	// class@000e1d
{
    public final k b;

    public void k$d(k p0){
       this.b = p0;
       super(p0);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$d.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceStateMachine"), "enter QuestioningState");
       return;
    }
    public boolean c(Message p0){
       k$d tb;
       Message obj = PatchProxy.applyOneRefs(p0, this, k$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != 3) {
          if (obj != 4) {
             return super.c(p0);
          }
          tb = this.b;
          tb.p(tb.h);
          this.b.s(p0);
          return true;
       }else {
          tb = this.b;
          tb.p(tb.g);
          this.b.r(p0);
          return true;
       }
    }
}
