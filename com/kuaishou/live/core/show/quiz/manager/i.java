package com.kuaishou.live.core.show.quiz.manager.i;
import com.kuaishou.live.core.show.quiz.manager.k$c;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import eg2.b;
import com.kuaishou.live.core.show.quiz.manager.LiveQuizStatus;

public class i implements k$c	// class@000e17
{
    public final j a;

    public void i(j p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "4")) {
          return;
       }
       if (this.a.f == null) {
          return;
       }
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onIdle", "reason", Integer.valueOf(p0));
       oi = this.a;
       oi.e.g(oi.d, p0);
       this.a.h();
       return;
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onReviewRight", "index", Integer.valueOf(p0.c()));
       this.a.e.b(p0);
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onReviewFalse", "index", Integer.valueOf(p0.c()));
       j e = this.a.e;
       if (e != null) {
          e.c(p0);
          if (p0.b().g != null || p0.b().l == null) {
             this.a.e.d(p0.a(), true);
          }else {
             this.a.e.d((p0.a() - true), true);
             p0.f((p0.a() - true));
             p0.j((p0.d - true));
          }
       }
       return;
    }
    public void d(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onQuestioning", "index", Integer.valueOf(p0.c()));
       i ta = this.a;
       LiveQuizStatus quizing = LiveQuizStatus.Quizing;
       if (ta.c != quizing) {
          ta.c = quizing;
          ta.e.f();
       }
       ta = this.a;
       ta.e.e(p0, ta.e().b());
       return;
    }
}
