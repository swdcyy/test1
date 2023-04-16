package com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.LiveQuizStatus;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dg2.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import java.lang.Long;
import cg2.a;
import o02.e;
import t02.a0;
import p91.m;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import dg2.m;
import com.kuaishou.live.core.show.quiz.manager.f;
import erd.g;
import crd.b;
import dg2.f;
import dg2.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import bg2.c;
import android.os.Message;
import java.lang.Integer;
import hoc.c;
import ekd.k1;
import java.util.Objects;
import com.kuaishou.live.core.show.quiz.manager.d;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.core.show.quiz.manager.a;
import android.os.Handler;
import com.kuaishou.live.core.show.quiz.manager.k;
import android.util.SparseArray;
import java.lang.StringBuilder;
import hoc.a;
import hoc.b;

public class j	// class@000e19
{
    public a0 a;
    public b b;
    public LiveQuizStatus c;
    public d d;
    public j$a e;
    public k f;
    public LivePlayerEventListener g;
    public d h;
    public b i;
    public b j;

    public void j(){
       super();
       this.c = LiveQuizStatus.Quiz_NotStart;
    }
    public final void a(LiveQuiz2Proto$LiveQuiz2Model p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "16")) {
          return;
       }
       if (p0 != null && (TextUtils.x(p0.liveQuizId) || (!TextUtils.x(this.d.d()) && !TextUtils.n(p0.liveQuizId, this.d.d())))) {
          LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
          lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          LiveLogTag liveLogTag = lIVE_QUIZ;
          b.T(liveLogTag, "checkCurrentQuizExpired", "currentQuizId", this.d.d(), "newQuizId", p0.liveQuizId);
          this.e.g(this.d, 0x2714);
          this.h();
       }
    label_0055 :
       return;
    }
    public final void b(long p0,String p1,String p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, j.class, "13")) {
          return;
       }
       LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
       lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
       b.U(lIVE_QUIZ, "fetchMyReviveCard", "randomSyncDelayMs", Long.valueOf(p0), "liveQuizId", p1, "source", p2);
       this.i = e.l().a(this.a.Z2.getLiveStreamId(), p1).map(new e()).delaySubscription(p0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new m(this), f.b);
       return;
    }
    public final void c(long p0,String p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, oj, "14")) {
          return;
       }
       this.j = e.l().f(this.a.Z2.getLiveStreamId(), p1).map(new e()).delaySubscription(p0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(this, p1), new o(this, p1));
       return;
    }
    public final long d(){
       Object obj = PatchProxy.apply(null, this, j.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return c.e(this.a.Z2);
    }
    public d e(){
       return this.d;
    }
    public LiveQuizStatus f(){
       return this.c;
    }
    public final Message g(int p0,Object p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oj, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oj = this.f;
       if (oj == null) {
          return null;
       }else {
          return oj.f(p0, p1);
       }
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "17")) {
          return;
       }
       b.P(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "resetStatus");
       k1.n("LiveQuizAudienceManager");
       j th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, d.class, "3")) {
          Iterator iterator = th.a.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
          th.a.clear();
          iterator = th.b.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
          th.a.clear();
       }
       this.c = LiveQuizStatus.Quiz_End;
       th = this.f;
       if (th != null && th.c() != null) {
          this.f.c().removeCallbacksAndMessages(objArray);
       }
       this.d = new d(this.a.Z2);
       return;
    }
    public final void i(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "20")) {
          return;
       }
       if (p0 != null && this.f != null) {
          List list = LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          j tf = this.f;
          Objects.requireNonNull(tf);
          String str = PatchProxy.applyOneRefs(p0, tf, k.class, "6");
          if (str != PatchProxyResult.class) {
          }else {
             str = k.j.get(p0.what, "UNKNOWN")+", currentState = "+tf.b().getName();
          }
          b.S(list, "sendMessage", "message", str);
          this.f.l(p0);
       }
       return;
    }
    public void j(int p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "15")) {
          return;
       }
       this.d.f(p1);
       this.d.j(p0);
       j te = this.e;
       if (te != null) {
          te.d(p1, false);
       }
       return;
    }
}
